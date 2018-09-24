import java.util. *;

public class uocchung{

    
    public static void main(String[] args) {
        System.out.println("Nhap 2 so x va y :");
        Scanner scan = new Scanner(System.in);
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.println("Uoc chung lon nhat cua 2 so la: " + UCLN(x,y));
    }
    public static int UCLN(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return UCLN(b,a % b);
        }
    }
}