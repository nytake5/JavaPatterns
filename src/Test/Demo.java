package Test;

import java.util.Calendar;
import java.util.function.Function;

import static Test.Memo.memoize;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        Function<String, String> temp = memoize(Demo::Hello);
        System.out.println(temp.apply("Max"));
        Thread.sleep(2000);
        System.out.println(temp.apply("Pasha"));
        Thread.sleep(2000);
        System.out.println(temp.apply("Max"));
    }

    public static String Hello(String name) {
        return "Hello " + name + " time " + Calendar.getInstance().getTime().toString();
    }
}

