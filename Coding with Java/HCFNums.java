public class HCFNums {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 9;
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            System.out.println(b);
        else
            System.out.println(a);

    }
}
