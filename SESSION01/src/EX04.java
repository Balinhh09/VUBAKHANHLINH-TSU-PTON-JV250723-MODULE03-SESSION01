public class EX04 {
    public static void main(String[] args) {
        int a = 14;
        int b = 7;
        System.out.printf("a = %d và b = %d%n", a, b);

        //Tính tổng của a và b
        int sum = a + b;
        System.out.printf("Tong 2 so a + b = %d%n", sum);

        //Tính hiệu của a và b
        int diff = a - b;
        System.out.printf("Hiệu 2 so a - b = %d%n", diff);

        //Tính tích của a và b
        int prod = a * b;
        System.out.printf("Tích 2 so a * b = %d%n", prod);

        //Tính thương của a chia cho b
        int quotient = a / b;
        System.out.printf("Thương 2 so a / b = %d%n", quotient);

        //Tính phần dư khi chia a cho b
        int remainder = a % b;
        System.out.printf("So du khi chia so a cho b = %d", remainder);
    }
}
