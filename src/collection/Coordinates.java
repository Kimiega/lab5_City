package collection;

public class Coordinates{
    private Long x; //Поле не может быть null
    private Float y; //Максимальное значение поля: 960, Поле не может быть

    public Coordinates(Long x, Float y){
       // if (x==null){
            //throw exception about wrong input, same for y TODO
        //}
        this.x = x;

        this.y = y;
    }

    public int compareTo(Coordinates o) {
        if (o==null){
            return 1;
        }
        int r = this.x.compareTo(o.x);
        if (r==0) {
            r = this.y.compareTo(o.y);
        }
            return r;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
