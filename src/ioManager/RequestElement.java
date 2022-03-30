package ioManager;

import collection.City;
import collection.Climate;
import collection.Coordinates;
import collection.Human;
//TODO NORMALNYI READING
public class RequestElement {

    static public City readElement(IOManager ioManager){
        City city;
        String name = null;
        ioManager.write("Введите название города: ");
        String[] s = ioManager.readline();
        name = s[0];
        while (name == null || name.equals(""))
        {
            ioManager.writeln("Название не может быть пустым");
            s = ioManager.readline();
            name = s[0];
        }

        Long x = null;
        ioManager.write("Введите координаты города по Х: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                x = Long.parseLong(s[0]);
            }
            catch(Exception ex){
                x = null;
            }
        while (x == null)
        {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length==0)
                x = null;
            else
                try {
                    x = Long.parseLong(s[0]);
                }
                catch(Exception ex){
                    x = null;
                }
        }

        Float y = null;
        ioManager.write("Введите координаты города по Y: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                y = Float.parseFloat(s[0]);
            }
            catch(Exception ex){
                y = null;
            }
        while (y == null)
        {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length==0)
                y = null;
            else
                try {
                    y = Float.parseFloat(s[0]);
                }
                catch(Exception ex){
                    y = null;
                }
        }

        int area=0;
        ioManager.write("Введите зону: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                area = Integer.parseInt(s[0]);
            }
            catch(Exception ex){
                area = 0;
            }
        while (0>=area)
        {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length==0)
                area = 0;
            else
                try {
                    area = Integer.parseInt(s[0]);
                }
                catch(Exception ex){
                    area = 0;
                }
        }

        Long population = null;
        ioManager.write("Введите количество населения: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                population = Long.parseLong(s[0]);
            }
            catch(Exception ex){
                population = null;
            }
        while (population == null || population<0)
        {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length==0)
                population = null;
            else
                try {
                    population = Long.parseLong(s[0]);
                }
                catch(Exception ex){
                    population = null;
                }
        }

        Float metersAboveSeaLevel = null;
        boolean t = false;
        ioManager.write("Введите высоту над уровнем моря: ");
        s = ioManager.readline();
        if (s.length>0) {
            try {
                metersAboveSeaLevel = Float.parseFloat(s[0]);
            } catch (Exception ex) {
                metersAboveSeaLevel = null;
                t = true;
            }
            while (t) {
                ioManager.writeln("Значение введено неверно");
                s = ioManager.readline();
                if (s.length == 0)
                    t = false;
                else {
                    try {
                        metersAboveSeaLevel = Float.parseFloat(s[0]);
                    } catch (Exception ex) {
                        metersAboveSeaLevel = null;
                        continue;
                    }
                    t = false;
                }
            }
        }

        int timezone=-13;
        ioManager.write("Введите часовой пояс: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                timezone = Integer.parseInt(s[0]);
            }
            catch(Exception ex){
                timezone = -13;
            }
        while (timezone == -13 || (-13>timezone && timezone>=15)) {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length == 0)
                timezone = -13;
            else
                try {
                    timezone = Integer.parseInt(s[0]);
                } catch (Exception ex) {
                    timezone = -13;
                }
        }

        Long agglomeration = null;
        ioManager.write("Введите аггломерацию: ");
        s = ioManager.readline();
        if (s.length>0)
            try {
                agglomeration = Long.parseLong(s[0]);
            }
            catch(Exception ex){
                agglomeration = null;
            }
        while (agglomeration == null)
        {
            ioManager.writeln("Значение введено неверно");
            s = ioManager.readline();
            if (s.length==0)
                agglomeration = null;
            else
                try {
                    agglomeration = Long.parseLong(s[0]);
                }
                catch(Exception ex){
                    agglomeration = null;
                }
        }

        Climate climate = null;
        ioManager.write("Введите климат: ");
        s = ioManager.readline();
        if (s.length>0 && !s[0].equals(""))
            if (Climate.HUMIDSUBTROPICAL.name().toString().equals(s[0]))
                climate = Climate.HUMIDSUBTROPICAL;
            if (Climate.OCEANIC.name().toString().equals(s[0]))
                climate = Climate.OCEANIC;
            if (Climate.TROPICAL_SAVANNA.name().toString().equals(s[0]))
                climate = Climate.TROPICAL_SAVANNA;
            boolean tempBool = (climate==null);
            while (tempBool) {
                    ioManager.writeln("Значение введено неверно");
                    s = ioManager.readline();
                    if (s[0].equals(""))
                        tempBool = false;
                    else
                        if (Climate.HUMIDSUBTROPICAL.toString().equals(s[0]))
                            climate = Climate.HUMIDSUBTROPICAL;
                        if (Climate.OCEANIC.toString().equals(s[0]))
                            climate = Climate.OCEANIC;
                        if (Climate.TROPICAL_SAVANNA.toString().equals(s[0]))
                            climate = Climate.TROPICAL_SAVANNA;

                }

        Human governor = null;
        String gName = null;
        Long gAge = null;
        String gBirthday = null;
        ioManager.write("Введите имя мэра: ");
        s = ioManager.readline();
        if (s.length>0 && !s[0].equals("")) {
            gName = s[0];

            ioManager.write("Введите возраст: ");
            s = ioManager.readline();
            if (s.length>0)
                try {
                    gAge = Long.parseLong(s[0]);
                }
                catch(Exception ex){
                    gAge = null;
                }
            while (gAge == null || gAge<0)
            {
                ioManager.writeln("Значение введено неверно");
                s = ioManager.readline();
                if (s.length==0)
                    gAge = null;
                else
                    try {
                        gAge = Long.parseLong(s[0]);
                    }
                    catch(Exception ex){
                        gAge = null;
                    }
            }

            //TODO birthday
            governor = new Human(gName,gAge,11,11,2011);
        }


        return new City(name, new Coordinates(x,y),area,population,metersAboveSeaLevel,timezone,agglomeration,climate,governor);
    }
}
