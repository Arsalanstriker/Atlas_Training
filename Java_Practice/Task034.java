public class Task034 {
    static void add(int x , int y){
        System.out.println("Sum of x and y:" + (x+y));
    }
    static void add(int x, int y , int z){
        System.out.println("Sum of x, y ,z :"+ x + y +z);
    }

    public static void main(String[] args) {
        add(10 ,20);
        add(50,100,25);
    }
}