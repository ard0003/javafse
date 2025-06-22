public class FinancialForecast {

    
    public static double futureValueRecursive(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return futureValueRecursive(initialValue, rate, years - 1) * (1 + rate);
    }

    
    public static double futureValueIterative(double initialValue, double rate, int years) {
        double result = initialValue;
        for (int i = 1; i <= years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 10000.0; 
        double rate = 0.07; 
        int years = 5; 

        
        double recursiveResult = futureValueRecursive(initialValue, rate, years);
        System.out.printf("Future Value (Recursive) after %d years: %.2f\n", years, recursiveResult);

        
        double iterativeResult = futureValueIterative(initialValue, rate, years);
        System.out.printf("Future Value (Iterative) after %d years: %.2f\n", years, iterativeResult);
    }
}
