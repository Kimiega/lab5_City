package ioManager;
import collection.City;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.TreeSet;

public class JsonConvertor {
    static public String toJson(TreeSet<City> collection){
        Gson gson = new Gson();
        return gson.toJson(collection);
    }
    static public TreeSet<City> fromJson(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<TreeSet<City>>() {}.getType();
        return gson.fromJson(json, type);
    }
}
