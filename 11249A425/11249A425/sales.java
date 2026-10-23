
public class sales {

    public static void main(String args[]) {

        int sales[] = {1200, 1500, 1800, 900, 2000, 1750, 1600, 1100, 1400, 1900, 1700, 1300};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > max)
                max = sales[i];

            if (sales[i] < min)
                min = sales[i];
        }

        System.out.println("Highest Sales : " + max);
        System.out.println("Lowest Sales  : " + min);
    }
}
