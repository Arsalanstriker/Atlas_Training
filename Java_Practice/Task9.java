public class Task9 {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 21;
        int num3 = 9;
        int Greater;
        if(num1 >= num2 && num1 >= num3){
            Greater = num1;
        }else if(num2 >= num1 && num2 >= num3){
            Greater = num2;
        }else{
            Greater =num3;
        }
        System.out.println("The Greater number is :" + Greater );
    }
}
