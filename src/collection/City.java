package collection;
import java.util.Date;
public class City implements Comparable<City> {
    private static int idOrder = 0;
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int area; //Значение поля должно быть больше 0
    private Long population; //Значение поля должно быть больше 0, Поле не может быть null
    private Float metersAboveSeaLevel;
    private int timezone; //Значение поля должно быть больше -13, Максимальное значение поля: 15
    private Long agglomeration;
    private Climate climate; //Поле может быть null
    private Human governor; //Поле может быть null

    public City (String name, Coordinates coordinates, int area, Long population, Float metersAboveSeaLevel,
                 int timezone, Long agglomeration, Climate climate,Human governor) {
        this.id = ++idOrder;
        this.name = name;
        this.coordinates = coordinates;
        creationDate = new java.util.Date();
        this.area = area;
        this.population = population;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
        this.timezone = timezone;
        this.agglomeration = agglomeration;
        this.climate = climate;
        this.governor = governor;
        //TODO is acceptable
    }

    protected void setIdOrder(int idOrder) {
        City.idOrder = idOrder;
    }

    public int getId() {
        return id;
    }

    public int getTimezone() {
        return timezone;
    }

    @Override
    public int compareTo(City o){
        if (o==null)
        {
            return 1;
        }
        int r = this.name.compareTo(o.name);
        if (r==0){
           r = this.coordinates.compareTo(o.coordinates);
           if (r==0) {
                r = this.area-o.area;
                if (r==0){
                    r = this.population.compareTo(o.population);
                    if (r==0){
                        r = this.metersAboveSeaLevel.compareTo(o.metersAboveSeaLevel);
                        if (r==0) {
                            r = this.timezone-o.timezone;
                            if (r==0){
                                r = this.agglomeration.compareTo(o.agglomeration);
                                if (r==0){
                                    r = this.climate.compareTo(o.climate);
                                    if (r==0)
                                    {
                                        r = this.governor.compareTo(o.governor);
                                    }
                                }
                            }
                        }
                    }
                }
           }
        }
        return r;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates.toString() +
                ", creationDate=" + creationDate.toString() +
                ", area=" + area +
                ", population=" + population +
                ", metersAboveSeaLevel=" + metersAboveSeaLevel +
                ", timezone=" + timezone +
                ", agglomeration=" + agglomeration +
                ", climate=" + climate.toString() +
                ", governor=" + governor.toString() +
                '}';
    }
}
