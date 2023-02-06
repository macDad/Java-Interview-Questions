package src.com.jiq.corejava;

/**
 * Created by   : <B>MadukaJ</B>
 *
 * <p>Date      : 6/2/23<br>
 * Project      : <B>Java-Interview-Questions </B><br>
 * Since        : version 1.0 <br></p>
 * Description  : This class {@link  MethodOverriding} use for
 */

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println( new HumanBeing().walk(10,5));
        System.out.println(new Athlete().walk(10,5));
    }
}
class HumanBeing{

    public int walk(int distance, int time) {
        int speed = distance / time;
        return speed;
    }
}

class Athlete extends HumanBeing{
    @Override
    public int walk(int distance, int time) {
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}