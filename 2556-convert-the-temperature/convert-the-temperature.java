class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin = 0;
        double Fahrenheit = 0;
        Kelvin = celsius + 273.15;
        Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{Kelvin , Fahrenheit};
    }
}