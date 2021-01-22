import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //In this simple task lets use our main class as for UI in this "Command" pattern
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please set first INT value: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Please set second INT value: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Please set third INT value: ");
        int c = Integer.parseInt(scanner.nextLine());

        System.out.print("Input operation you want(Average,Max,Min,Sum) ");
        String operation = scanner.nextLine();


        //for object of command class
        if (operation.equals("Average")) {
            Calculate average = new Average();
            System.out.println(average.Rahuemo(a, b, c));
        }

        //for Lambda
        if (operation.equals("Max")) {
            Max max = new Max();
            aaaaaaaaaaa suuukaaaa;
            // тут має використатись клас Max. я вже пробував  і тут лямбду, а воно каже шо змінні вже оголошені, сука така
            // думав може якшо тут лямбду, то може дженеріки якось заюзати хз


        }

        //for Anonymous class
        if (operation.equals("Min")) {
            // тут воно не хоче рахувати, якщо використати той метод , каже шо еррор
            Calculate min = (Calculate) new Min();
            System.out.println(min.Rahuemo(a, b, c));
        }

        // for Method::reference
        if (operation.equals("Sum")) {
            Calculate sum = new Calculate() {
                @Override
                public int Rahuemo(int a, int b, int c) {
                    Calculate sum= Sum::sum;
                    return sum.Rahuemo(a,b,c);
                }
            };
            System.out.println(sum.Rahuemo(a,b,c));
        }


    }
}
