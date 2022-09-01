import java.util.Scanner;

public class Fibronacci {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Fibronacci sayısı kaç tane olsun ");
        int fib=girdi.nextInt();
        int s1=0,s2=1,ara;
        for (int i = 0; i < fib; i++) {
            ara=s2;
            s2=s1+s2;
            s1=ara;


            System.out.print("-"+s2);

        }
        //0 1 1 2 3 5 8 13 21 34
    }

}
