import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to check Armstrong : ");
        int num = scan.nextInt();
        int temp = num;
        int count = 1;

        for(int i=0;i<=num;i++){
            num = num/10;
            count++;
        }
        for(int j=0;j<count;j++){
            int rem = temp%10;
            temp = temp/10;
            int cube = rem*rem*rem;
            if(cube != rem){
                System.out.println("Not Armstrong");
                return;
            }
        }
        System.out.println("Armstrong");
    }
}
