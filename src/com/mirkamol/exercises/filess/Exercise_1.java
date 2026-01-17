package com.mirkamol.exercises.filess;

import java.io.*;

public class Exercise_1 {
    static void main() {
        String data = """
                    id,first_name,last_name,email,gender
                    1,Fanchette,Williamson,fwilliamson0@github.com,F
                    2,Aleksandr,Matts,amatts1@webs.com,M
                    3,Maurie,Cordero,mcordero2@google.co.jp,M
                    4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                    5,Ricardo,Gofton,rgofton4@nytimes.com,M
                    6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                    7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                    8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                    9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                    10,Reider,Karel,rkarel9@github.io,M
                    11,Dory,Jolliff,djolliffa@wufoo.com,F
                    12,Homerus,Averay,haverayb@skyrock.com,M
                    13,Alyda,Muglestone,amuglestonec@is.gd,F
                    14,Pinchas,Louca,ploucad@google.es,M
                    15,Cherin,Eltringham,celtringhame@parallels.com,F
                    16,Mufi,Rothert,mrothertf@dropbox.com,F
                    17,Jordana,Everex,jeverexg@ucla.edu,F
                    18,Belle,Rother,brotherh@auda.org.au,F
                    19,Clevie,Sifflett,csiffletti@furl.net,M
                    20,Gretchen,Abell,gabellj@1688.com,F
                """;
        String fileName = "src/data.csv";
        writeToFile(fileName, data);
        readBackFile(fileName);
        System.out.println();
        readEachLine(fileName);
        System.out.println("Without Header");
        skipTheHeader(fileName);
    }

    static void writeToFile(String filePath, String data) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();
            System.out.println("Data written");
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    static void readBackFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            StringBuilder fileContents = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContents.append(line).append("\n");
            }

            reader.close();

            System.out.println("Contents of the file 'data.csv':");
            System.out.println(fileContents.toString());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    static void readEachLine(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();


        } catch (IOException e) {
            System.out.println("error");
        }
    }

    static void skipTheHeader(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String header = reader.readLine();
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();


        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
