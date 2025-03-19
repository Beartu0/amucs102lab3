import java.util.Scanner;


public class TriangleMain {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban uzunluğunu giriniz: ");
        double x = scanner.nextDouble();

        System.out.println("Yüksekliği giriniz: ");
        double y = scanner.nextDouble();

        triangle2 t1 = new triangle2(x,y);
        System.out.println(t1.toString());

        System.out.println("Alan: " + t1.area());

        triangle2 t2 = t1.tripleBase();
        System.out.println("Tabanı üç katı olan yeni üçgen:");
        System.out.println(t2.toString());

        //scanner.close();
    }
}
