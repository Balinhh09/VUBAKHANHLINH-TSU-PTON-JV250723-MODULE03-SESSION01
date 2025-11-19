import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ban kinh cua hinh tron: ");
        double r = input.nextDouble();

        double Area = Math.PI * r * r;

        System.out.printf("Dien tich cua hinh tron co ban kinh %.2f la: %.2f%n", r, Area);

        input.close();
    }
}
