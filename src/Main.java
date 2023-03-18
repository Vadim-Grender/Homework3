import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Integers();
        noIntegers();
    }

    private static void Integers() {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println(integers);
        integers.removeIf(i -> i % 2 == 1);
        System.out.println(integers);
    }

    private static void noIntegers() {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        list.removeIf(Main::isNumeric);
        System.out.println(list);


    }
    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}