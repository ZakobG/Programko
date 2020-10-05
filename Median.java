import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7,8,9,10,11,12,13};
        double mezi = mezi(num);
        System.out.println(mezi);
    }

    static double mezi(int[] num) {
        Arrays.sort(num);
        double mezi;

        int total = num.length;

        if (total % 2 == 0) {
            double sum = num[total / 2] +
                    num[total / 2 - 1];
            mezi = (sum) / 2;
        } else {
            mezi = (int) num[num.length / 2];
        } return mezi;
    }
}