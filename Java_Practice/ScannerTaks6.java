import java.util.Scanner;
public class ScannerTaks6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter you ID ");
        String ID  = scanner.nextLine();
        System.out.print("Enter your password");
        int Pwd = scanner.nextInt();
        System.out.println("Your login ID: " + ID + " Aand your password is :"+ Pwd);
        scanner.close();
    }
}
