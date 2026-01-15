
void main() {

}

void useUsefulStringStaticMethods(){
    String number = String.valueOf(1);
    System.out.println(number); // output -> 1 which is not number but string

    String format = String.format("Number %s", number);
    System.out.println(format);

    String[] names = {"Jamila", "Alex", "Aisha"};
    String join = String.join(" | ", names);
    String join2 = String.join(",", names);
    System.out.println(join);
    System.out.println(join2);
}

void compareStrings(){
    String name1 = "Jamila";
    String name2 = "Jamila";
    String name3 = new String("Jamila");

    System.out.println("String equality with ==");
    System.out.println(name1 == name2);
    System.out.println(name1 == name3);
    System.out.println("String equality with .equals()");
    System.out.println(name1.equals(name2));
    System.out.println(name1.equals(name3));

    // TIP NEVER USE == WHEN COMPARING STRINGS
    // USE == TO CHECK 2 VARIABLES POINT TO EXACT SAME OBJECT IN MEMORY
}

void workWithStringMethods(){
    String name = "Jamila";
    System.out.println(name + " Ahmed");
    System.out.println(name.contains("Ahmed"));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println("  ".isBlank());
    System.out.println("  ".isEmpty());
    System.out.println("  Hello    ".trim());
    System.out.println(name.startsWith("J"));
    System.out.println(name.substring(1));
    System.out.println(name.substring(1,4));
    System.out.println(name.replace(
            "J",
            "S"));
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(1));
}
