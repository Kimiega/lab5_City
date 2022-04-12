package collection;
import ioManager.*;

import java.util.Date;
import java.util.TreeSet;

public class CollectionManager {
    private TreeSet<City> cityCollection;
    private Date initializationDate;
    private IReadable in;
    private IWritable out;

    public CollectionManager(IReadable in, IWritable out){
        cityCollection = new TreeSet<City>(new CustomComp());
        initializationDate = new java.util.Date();
        this.in = in;
        this.out = out;
    }
    public void add(City o) {
        cityCollection.add(o);
    }
    public void addIfMax(City o){
        //if (o==null){
        //    throw(NullPointerException);
       // }TODO
        if (o.compareTo(cityCollection.last())>0){
            cityCollection.add(o);
        }
        //else TODO
    }
    public void addIfMin(City o){
        //if (o==null){
        //    throw(NullPointerException);
        // }TODO
        if (o.compareTo(cityCollection.first())<0){
            cityCollection.add(o);
        }
        //else TODO
    }
    public void clear(){
        cityCollection.clear();
    }
    public void executeScript(String path){
        //TODO
    }
    public void info(){
        out.writeln("Type: "+cityCollection.getClass().toString());
        out.writeln("Date of initialization: "+initializationDate.toString());
        out.writeln("Amount of elements: "+cityCollection.size());
    }
    public void printAscending(){
        for (City city : cityCollection) {
            out.writeln(city.toString());
        }
    }
    public void printDescending(){
        for (City city : cityCollection.descendingSet()) {
            out.writeln(city.toString());
        }
    }
    public void removeAllByTimezone(int timezone){
        for (City city : cityCollection) {
            if (city.getTimezone()==timezone){
                cityCollection.remove(city);
            }
        }
        //TODO check working
    }
    public void removeById(int id){
        for (City city : cityCollection) {
            if (city.getId()==id){cityCollection.remove(city);}
        }
    }
    public void removeGreater(City o){
        cityCollection = (TreeSet<City>)cityCollection.headSet(o,true);
//        while (cityCollection.last().compareTo(o)>0)
//            cityCollection.remove(cityCollection.last());
//        cityCollection = new TreeSet<>(cityCollection.stream().filter((p) -> o.compareTo(p)<0).collect(Collectors.toList()));
    }
    public void save(){
        IOFileManager ioFileManager = new IOFileManager("collection.json");
        ioFileManager.write(JsonConvertor.toJson(cityCollection));
    }
    public void show(){
        for (City city : cityCollection) {
            out.writeln(city.toString());
        }
    }
    public void updateById(int id, City o){
        for (City city : cityCollection) {
            if (city.getId()==id){
                city = o;
            }
        }
    }
    public void load(String path){
        IOFileManager fileManager = new IOFileManager("collection.json");
        cityCollection = JsonConvertor.fromJson(fileManager.readAll());
        int id=0;
        for (City city : cityCollection) {
            if (city.getId()>id)
                id = city.getId();
        }
        City.setIdOrder(id);
    }
}
