String[] names = {
        "James",
        "Nadi",
        "Sophia",
        "Alex",
        "Saleh"
};

void main() {
    useDoWhileLoop();
}

void useDoWhileLoop(){
    int i = 0;
    boolean keepLooping = true;
    do {
        System.out.println("hello");
        keepLooping = false; // recommended 😃
    } while (keepLooping);
}

void useWhileLoop(){
    // while loos
    int i = 0;
    boolean keepLooping = true;
    while (keepLooping){
        System.out.println("hello");
        keepLooping = false; // recommended 😃
    }
}

void useEnhancedForLoop(){
    System.out.println("enhanced for loop");
    for (String name : names) {
        System.out.println(name);
    }
}

void useLoopAndArray() {

    System.out.println("for i loop");
    for (int i = 0; i < names.length; i++) {
        String prev = names[i-1];
        System.out.println(names[i]);
        String next = names[i+1];
    }
//    System.out.println(names[0]);
//    System.out.println(names[1]);
//    System.out.println(names[2]);
//    System.out.println(names[3]);
//    System.out.println(names[4]);
}

void useLoop() {
    // Loops
    System.out.println("start of for loop");
    for (int i = 0; i <= 10; i += 4) {
        System.out.println("hello " + i);
    }
    System.out.println("end of for loop");

    System.out.println("reverse loop");

    for (int i = 10; i > 0; i--) {
        System.out.println("hello " + i);
    }
}
