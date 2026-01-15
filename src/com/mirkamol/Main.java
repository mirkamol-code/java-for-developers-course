
void main() {
    // Working with BigDecimals
    BigDecimal number = BigDecimal.TEN;
    System.out.println(number);
    System.out.println(number.add(BigDecimal.ONE));
    System.out.println(number.max(BigDecimal.ZERO));
    System.out.println(number.compareTo(BigDecimal.TEN));
}

void differentiateDoubleAndBigDecimal() {
    double number1 = 0.2;
    double number2 = 0.3;
    double result = number2 - number1; //Probelem: result should be 0.1 but the output shows 0.09999999999999998
    System.out.println(result); // do not use doubles for operation of money and etc

    BigDecimal numberB1 = new BigDecimal("0.02");
    BigDecimal numberB2 = new BigDecimal("0.03");
    BigDecimal resultB = numberB2.subtract(numberB1);
    System.out.println(resultB); // here it is 0.01 in output
}
