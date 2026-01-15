
void main() {
    // Scanner
    System.out.println("Hello what is your name?");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println("Hello " + input);
    System.out.println("What is your age?");
    int age = scanner.nextInt();

    if(age < 16){
        System.out.println("You are a child");
    }else {
        System.out.println("You are an adult");
    }


}

