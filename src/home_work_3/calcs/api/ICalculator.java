package home_work_3.calcs.api;

public interface ICalculator {
    Double division (double a, double b);
    double multiplication (double a, double b);
    double subtraction (double a, double b);
    double addition (double a, double b);
    double power (double a, int b);
    double module (double a);
    double squareRoot (double a);
    long getCountOperation();
}
