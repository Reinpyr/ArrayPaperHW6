import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float values [] = {4,-3,-5,9,1,11};
        int m = 1;
        String smaller = "smaller: ";
        String larger = "larger: ";

        for (int i = 0; i < values.length; i = i + 1)
        {
            if(values[i] < m)
            {
                smaller = smaller + Float.toString(values[i])+ " ";
            }
            else if (values[i] > m)
            {
                larger = larger + Float.toString(values[i])+ " ";
            }
        }
        System.out.println("array: " + Arrays.toString(values));
        System.out.println("m: " + m);
        System.out.println(smaller);
        System.out.println(larger);
    }
}