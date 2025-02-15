import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        char option = ' ';

        while (true) {
            System.out.println("Unesite prvi broj: ");
            while (true) {
                try {
                    a = scan.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Niste unjeli broj. Pokusajte ponovo");
                    scan.nextLine();
                }
            }

            System.out.println("Unesite drugi broj: ");
            while (true) {
                try {
                    b = scan.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Niste unjeli broj. Pokusajte ponovo");
                    scan.nextLine();
                }
            }

            System.out.println("---------------");
            System.out.println("+. Saberi brojeve");
            System.out.println("-. Oduzmi brojeve");
            System.out.println("*. Pomnozi brojeve");
            System.out.println("--------------");

            while (true) {
                System.out.println("Unesite + ili - ili *");
                option = scan.next().charAt(0);

                if (option == '+' || option == '-' || option == '*') {
                    break;
                } else {
                    System.out.println("Neocekivan unos. Pokusaj ponovo");
                }
            }

            switch (option) {
                case '+':
                    System.out.println(a + b);
                    break;

                case '-':
                    System.out.println(a - b);
                    break;

                case '*':
                    System.out.println(a * b);
                    break;

                default:
                    System.out.println("Neocekivan unos.");
                    continue;
            }
            break;
        }
    }
}
