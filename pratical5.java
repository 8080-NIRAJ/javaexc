import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        int i=1;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the range of multiplication ");
        int n = read.nextInt();
        System.out.println("*16 Multiplication table*");
        while(i<=n)
        {
            
            System.out.println(16+" X "+i+" = "+16*i);
            i=i+1;
            
        }
    }
}
