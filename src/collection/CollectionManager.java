package collection;
import ioManager.ConsoleManager;
import ioManager.IOManager;

import java.util.Date;
import java.util.TreeSet;

public class CollectionManager {
    private TreeSet<City> cityCollection;
    private Date initializationDate;
    private IOManager ioManager;

    public CollectionManager(IOManager ioManager){
        cityCollection = new TreeSet<City>(new CustomComp());
        initializationDate = new java.util.Date();
        this.ioManager = ioManager;
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
        ioManager.write("Type: "+cityCollection.getClass().toString());
        ioManager.write("Date of initialization: "+initializationDate.toString());
        ioManager.write("Amount of elements: "+cityCollection.size());
    }
    public void printAscending(){
        for (City city : cityCollection) {
            ioManager.write(city.toString());
        }
    }
    public void printDescending(){
        for (City city : cityCollection.descendingSet()) {
            ioManager.write(city.toString());
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
        //TODO save to file
    }
    public void show(){
        for (City city : cityCollection) {
            ioManager.write(city.toString());
        }
    }
    public void updateById(int id, City o){
        for (City city : cityCollection) {
            if (city.getId()==id){
                city = o;
            }
        }
    }
}
