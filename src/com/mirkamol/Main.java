char grade = 'B';

void main() {
useNewSwitchExpresion();

}
void useNewSwitchExpresion(){
    String result = switch (grade){
        case 'A' -> "Excellent";
        case 'B', 'C' -> "Pass";
        default -> "Fail";
    };
    System.out.println(result);
}

void useSwitchExpression(){
    // byte short int char enums String
    // Byte Short Integer Character
    switch (grade){
        case 'A':
            System.out.println("Excellent");
            break;
        case 'B':
        case 'C':
            System.out.println("Pass");
            break;
        default:
            System.out.println("Fail");
    }
}

void useOrLogicalOperatorsInIf(){
    String gender = "Male";

    if(gender.equalsIgnoreCase("FEMALE") || gender.equalsIgnoreCase("MALE")){
        System.out.println("Valid Gender");
    } else {
        System.out.println("Invalid Gender");
    }
}
void useAndLogicalOperatorsInIf(){
    int age = 2;
    boolean isAdult = age >= 16;
    if(isAdult){
        System.out.println("is adult :)");
    } else if (age == 0){
        System.out.println("baby :)");
    }else if (age > 0 && age < 4){
        System.out.println("toddler :)");
    } else {
        System.out.println("is not adult :(");

    }

    System.out.println("code outside if");
}

void useIfstatementWithConditions(){
    int age = 15;
    boolean isAdult = age >= 16;
    if(isAdult){
        System.out.println("is adult :)");
    } else {
        System.out.println("is not adult :(");
    }

    System.out.println("code outside if");
}