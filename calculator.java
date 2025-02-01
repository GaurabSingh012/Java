// Calculator.java
class Calculator {
    private int[] numbers;

    // Constructor to take user input only once
    public Calculator() {
        UserInput ui = new UserInput();
        this.numbers = ui.userInput();
    }

    public int sum() {
        return numbers[0] + numbers[1];
    }

    public int subtract() {
        return numbers[0] - numbers[1];
    }

    public int multiply() {
        return numbers[0] * numbers[1];
    }

    public int divide() {
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; 
        }
        return numbers[0] / numbers[1];
    }
}
