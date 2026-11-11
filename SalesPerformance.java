public class SalesPerformance {
    public static void main(String[] args) {
        double[][] sales = {
                {1000.00, 1500.00, 400.00, 1300.15},
                {2000.00, 1150.00, 2100.00, 1030.50},
                {1550.00, 1800.00, 1200.00, 890.00},
        };
        int topRepresentative = 0;
        double highestSales = 0;
        double companyTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            double repTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                repTotal += sales[i][j];
            }
            System.out.println("Representative " + (i + 1)
            + " total sales: $" + repTotal);
            companyTotal += repTotal;
            if (repTotal > highestSales) {
                highestSales = repTotal;
                topRepresentative = i + 1;
            }
        }
        System.out.println("Company total sales: $" + companyTotal);
        System.out.println("Representative " + topRepresentative
                + " had the highest sales: $" + highestSales);
    }
}
