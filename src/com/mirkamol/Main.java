void main() {
// Working with Files
    File file = createFile("src/foo.txt");
//    writeToFile(file, false);
//    readFile(file);
    writeToFileWithTryResources(file, true);
}

private static void readFile(File file) {
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}

/**
 * This method doesn't require to flush and close file after writingToFile
 * it automatically flushes and closes because Anything implents Closeable and Flushable, it means we can use tryWithResources(flush(), close()).
 * The main purpose of the 'try-with-resources' statement in Java to automatically close resources after use
 *
 * @param file
 * @param append
 */
private static void writeToFileWithTryResources(File file, boolean append) {
    try (
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
    ) {
        writer.println("Javohir");
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}

private static void writeToFile(File file, boolean append) {
    try {
        FileWriter fileWriter = new FileWriter(file, append);
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println("Mirkamol");
        writer.flush();
        writer.close();

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}

public static File createFile(String path) {
    try {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    } catch (IOException e) {
        System.out.println(e.getMessage());
        throw new IllegalStateException();
    }
}