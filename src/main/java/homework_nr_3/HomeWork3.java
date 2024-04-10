package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {

        int Month = 4;

        switch (Month) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("Doesn't exist");
        }

        for (int x = 100; x <= 1000; ++x) {
            if (x % 5 == 0) {
                System.out.println(x);
            }
        }

        double sum = 0;
        for (int z = 1; z <= 99; z += 2) {
            sum += (double)z / (z + 2);
        }
        System.out.println("Sum of the series: " + sum);

    }
}



