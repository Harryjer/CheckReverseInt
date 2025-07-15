import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //5698741
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your preffered number ");
        int num = sc.nextInt();

        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        System.out.println("Test");
    }
}