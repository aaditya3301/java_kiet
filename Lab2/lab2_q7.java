//WAP to create class Number with only one private instance variable as a double primitive type, include the following methods isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() in this class and all above methods should return boolean primitive type like for isPositive() should return “Positive = True”.

class Number {
    private double value;

    Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        return value == 0;
    }

    boolean isPositive() {
        return value > 0;
    }

    boolean isNegative() {
        return value < 0;
    }

    boolean isOdd() {
        return (int)value % 2 != 0;
    }

    boolean isEven() {
        return (int)value % 2 == 0;
    }

    boolean isPrime() {
        if (value <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if ((int)value % i == 0){
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong() {
    int num = (int)value;
    int original = num;
    int sum = 0;
    
    int digits = 0;
    int temp = num;
    while (temp > 0) {
        digits++;
        temp /= 10;
    }

    temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, digits);
        temp /= 10;
    }
    
    return sum == original;

    }
}

class lab2_q7 {
    public static void main(String[] args) {
        Number num = new Number(153);
        System.out.println("Zero: " + num.isZero());
        System.out.println("Positive: " + num.isPositive());
        System.out.println("Negative: " + num.isNegative());
        System.out.println("Odd: " + num.isOdd());
        System.out.println("Even: " + num.isEven());
        System.out.println("Prime: " + num.isPrime());
        System.out.println("Armstrong: " + num.isArmstrong());
    }
}
