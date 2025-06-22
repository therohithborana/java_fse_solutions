public class FinancialForecast {

    
    public static double futureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
            
        }
        
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 3000.0; 
        double growthRate = 0.07;     
        int years = 5;                

        double result = futureValue(currentValue, growthRate, years);
        System.out.printf("Predicted Future value after %d years: %.2f\n", years, result);

    }
    
}
