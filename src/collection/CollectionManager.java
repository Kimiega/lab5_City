package collection;
import ioManager.*;

import java.io.FileNotFoundException;
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

        if (o.compareTo(cityCollection.last())>0){
            cityCollection.add(o);
        }
    }
    public void addIfMin(City o){
        if (o.compareTo(cityCollection.first())<0){
            cityCollection.add(o);
        }
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
    }
    public void removeById(int id){
        for (City city : cityCollection) {
            if (city.getId()==id){cityCollection.remove(city);}
        }
    }
    public void removeGreater(City o){
        cityCollection = (TreeSet<City>)cityCollection.headSet(o,true);
    }
    public void save(String path){
        IOFileManager ioFileManager = new IOFileManager(path);
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
        IReadable fileReader;
        try {
            fileReader = new ReaderFile(path);
        } catch (FileNotFoundException e) {
            out.writeln("Файл коллекции не найден или недоступен");
            return;
        }
        String collectionJson = "";
        String sTemp;
        while ((sTemp = fileReader.readline())!=null)
            collectionJson+=sTemp;
        try {
            cityCollection = JsonConvertor.fromJson(collectionJson);
        }
        catch(Exception ex) {
            out.writeln("Файл поврежден");
            cityCollection = new TreeSet<City>(new CustomComp());
            out.writeln("Cоздана пустая коллекция");
            return;
        }
        int id=0;
        for (City city : cityCollection) {
            if (city.getId()>id)
                id = city.getId();
        }
        City.setIdOrder(id);
    }
}
