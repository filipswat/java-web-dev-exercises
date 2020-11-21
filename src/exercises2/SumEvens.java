package exercises2;

public class SumEvens {

    public static void main (String[] args) {
        Integer[] aArray = {111,4,33,55,666,324};
        System.out.println(sumEvens(aArray));
    }

    public static Integer sumEvens (Integer[] numArray) {
        Integer total = 0;
        for (Integer i : numArray) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}
