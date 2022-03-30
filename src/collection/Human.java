package collection;

import java.time.LocalDate;

public class Human {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long age; //Значение поля должно быть больше 0
    private LocalDate birthday;

    public Human(String name, Long Age, int day, int month, int year){
        this.name = name;
        this.age = age;
        this.birthday = LocalDate.of(year,month,day);
    }

    public int compareTo(Human o){
        if (o == null){
            return 1;
        }
        int r = 0;
        if (this.name!=null)
            r = this.name.compareTo(o.name);
        if (r==0){
            if (this.birthday!=null)
                r = this.birthday.compareTo(o.birthday);
            else if (o.birthday!=null)
                r = -o.birthday.compareTo(this.birthday);
        }
        return r;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.toString() +
                '}';
    }
}

//TODO
