import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "Arsalan";
        String pwd = "234567";
        int count = 0;
        do {
            System.out.println("you are logged in for" + count++ + "times");
            System.out.println("enter your loginid and password");
            loginid = sc.nextLine();
            pwd = sc.nextLine();
        } while (loginid == "Arsalan" && pwd == "234567");
        sc.close();
    }
}
