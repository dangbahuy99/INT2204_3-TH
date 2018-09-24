import java.util. *;

public class fibonacci {

    public static void main(String[] args) {

        System.out.println("Nhap n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Fibonacci cua n la: " + fibonacci_1(n));
    }
    public static int fibonacci_1(int n){
        if(n==0){
            return 0;
        }
        else
        {
            if(n==1){
                return 1;
            }
            else{
                return fibonacci_1(n-1) + fibonacci_1(n-2);
            }
        }

}