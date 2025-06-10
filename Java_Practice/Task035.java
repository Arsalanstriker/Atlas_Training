public class Task035 {
    static void add(char x , char y){
        System.out.println("Sum of x and y:" + (x+y));
    }
    static void add(int x, int y ){
        System.out.println("Sum of x, y  :"+ x + y);
    }

    public static void main(String[] args) {
        add('d' ,'a');
        add(100,100);
    }
}