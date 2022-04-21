package ioManager;
import collection.City;
import collection.Climate;
import collection.Coordinates;
import collection.Human;
import java.util.Date;

public class RequestElement {
    private IReadable in;
    private IWritable out;
    private boolean interactive;

    public RequestElement(IReadable in, IWritable out, boolean interactive){
        this.in = in;
        this.out = out;
        this.interactive = interactive;
    }

    private interface ICondition<T>{
        boolean check(T o);
    }

    private interface IExpression<T>{
        T exec();
    }
    private String readStr(){
        String text = in.readline();
        return text;
    }
    private Integer readInt(){
        return in.readInt();
    }
    private Float readFloat(){
        return in.readFloat();
    }
    private Long readLong(){
        return in.readLong();
    }

    private <T> T readArg(String message, IExpression<T> query){
        out.write(message);
        return query.exec();
    }
    private <T> T readArgWhile(String message, String hint, ICondition<T> condition, IExpression<T> query){
        out.writeln(message);
        T o =  readArg(">>>",query);
        while (interactive && !condition.check(o)) {
            out.writeln(hint);
            o = readArg(">>>", query);
        }
        return o;
    }
    private String readName(){
        String name = (String)readArgWhile("Введите название города: ", "Название не может быть пустым",
                (s) -> !s.isEmpty(), ()->readStr());
        return name;
    }

    private Coordinates readCoords(){
        Long x = (Long)readArgWhile("Введите координаты города по Х: ", "Значение должно быть целым числом",
                (s) -> s != null, ()->readLong());
        Float y = (Float)readArgWhile("Введите координаты города по Y: ", "Значение должно быть действительным числом",
                (s) -> s != null, ()->readFloat());
        return new Coordinates(x,y);
    }

    private int readArea(){
        int area = (Integer) readArgWhile("Введите зону: ", "Значение поля должно быть больше 0",
                (s) -> s!=null && s >0, ()->readInt());
        return area;
    }

    private Long readPopulation(){
        Long population = (Long)readArgWhile("Введите количество населения: ", "Значение должно быть целым числом",
                (s) -> s != null, ()->readLong());
        return population;
    }
    private Float readMetersAboveSeaLevel(){
        Float metersAboveSeaLevel = (Float)readArgWhile("Введите высоту над уровнем моря: ", "Значение должно быть действительным числом",
                (s) -> s!=null, ()->readFloat());
        return metersAboveSeaLevel;
    }
    private int readTimezone(){
        int timezone = (Integer) readArgWhile("Введите часовой пояс: ", "Значение поля должно быть целочисленным, больше -13 и меньше 15",
                (s) -> s!= null && s>-13 && s <=15, ()->readInt());
        return timezone;
    }
    private Long readAgglomeration(){
        Long agglomeration = (Long)readArgWhile("Введите аггломерацию: ", "Значение должно быть целым числом",
                (s) -> s != null, ()->readLong());
        return agglomeration;
    }
    private Climate readClimate(){
        String climateStr =(String)readArgWhile("Введите климат: ", "Значение должно быть пустым или одним из: "+ Climate.enumToStr(),
                (s) -> s.isEmpty() || Climate.isClimate(s), ()->readStr());
        Climate climate;
        if (climateStr.isEmpty())
            climate = null;
        else climate = Climate.valueOf(climateStr);
        return climate;
    }
    private Human readGovernor(){
        Human governor;
        String governorName = (String)readArgWhile("Введите имя мэра: ", "Название не может быть пустым",
                (s) -> true, ()->readStr());
        if (governorName.isEmpty())
            governor = null;
        else {
            String dataPattern = "dd-mm-yyyy";
            Date birthday = DateAdapter.adapt((String) readArgWhile("Введите дату его рождения: ", "Дата должна быть в формате: " + dataPattern,
                    (s) -> DateAdapter.isAdapting(s, dataPattern), () -> readStr()), dataPattern);
            governor = new Human(governorName,birthday);
        }
        return governor;
    }
    public City readElement(){
        return new City(readName(), readCoords(),new Date(),
                readArea(), readPopulation(), readMetersAboveSeaLevel(),
                readTimezone(),readAgglomeration(),readClimate(),readGovernor());
    }
}
