
void main() {

}

void useContinueKeyword(){
    var names = new String[]{
            "Andre",
            "Jamila",
            "Ali",
            "Jones",
            "Matt"
    };

    for (String name : names){
        if(name.startsWith("A")){
            continue;
        }
        System.out.println(name);
    }
}

void useBreakKeyword(){
    var numbers = new int[]{1,2,3,4,5};

    for (int number : numbers){
        if(number == 3){
            break;
        }
        System.out.println(number);
    }
}