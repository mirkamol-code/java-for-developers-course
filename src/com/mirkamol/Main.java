
void main() {
    // Exception
    try {
        annha();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
static void annha() throws Exception {
    jamila();
}
static void jamila() throws Exception {
      john();
}

static void john() throws Exception {
        divide(10, 0);
}

static double divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Cannot divide by zero");
    }
    return (double) a / b;
}

void catchUnknownException() {
    try {
        int number = Integer.parseInt("1");
        System.out.println(number);

        for (int i = 10; i >= 0; i--) {
            System.out.println(10 / i);
        }
        System.out.println("end");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        // this is mainly used for clean up purposes
        System.out.println("Finally always runs");
    }
}

void responseToMultipleExceptionInASingleTryCatch() {
    try {
        int number = Integer.parseInt("1");
        System.out.println(number);

        for (int i = 10; i >= 0; i--) {
            System.out.println(10 / i);
        }
        System.out.println("end");

    } catch (NumberFormatException | ArithmeticException e) {
        System.out.println(e.getMessage());
    }
}

void responseToExceptionsUsingMultipleTryCatch() {
    try {
        int number = Integer.parseInt("1");
        System.out.println(number);

        for (int i = 10; i >= 0; i--) {
            System.out.println(10 / i);
        }
        System.out.println("end");

    } catch (NumberFormatException e) {
        System.out.println("Failed to parse 1x");
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }
}

