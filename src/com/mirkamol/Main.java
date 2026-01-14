
void main() {
    int monthlyRentIncome = 1_000;
    int originalPriceOfProperty = 100_000;
    double annualRentalYield = calculateAnnualRentalYield(monthlyRentIncome, originalPriceOfProperty);

    System.out.println("Rental yield per year: " + annualRentalYield + " %");
}
double calculateAnnualRentalYield(int monthlyRent, int originalPriceOfProperty) {
    double annualRentalIncome = calculateAnnualRentalIncome(monthlyRent);
    return annualRentalIncome / originalPriceOfProperty * 100;
}

private int calculateAnnualRentalIncome(int monthlyRent) {
    return monthlyRent * 12;
}
