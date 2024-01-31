package by.tms.model;

public class Operation {
    private final double num1;
    private final double num2;
    private final String operation;
    private double result;

    public Operation(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                ", result=" + result +
                '}';
    }
}
