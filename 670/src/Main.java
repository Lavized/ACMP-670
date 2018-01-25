
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       Main.run();
    }

    private static void run() throws IOException {

        PrintWriter pw;
        Scanner sc;

        sc = new Scanner(new File("INPUT.TXT"));
        int numFromFile =sc.nextInt();

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            nums.add(i);
        }



        List<Integer> list = new ArrayList<>();
        String tmp;
        char[] s;

        for (Integer num : nums) {
            tmp = num.toString();
            s = tmp.toCharArray();
            if (withoutDuplicate(s)) {
                list.add(num);
            }
        }

        int find = list.get(numFromFile);

        pw = new PrintWriter(new File("OUTPUT.TXT"));
        pw.print(find);
        pw.close();
    }


    private static boolean withoutDuplicate( char[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        int rezult = (int) Arrays.stream(nums).distinct().count();
        return nums.length == rezult;
    }
}