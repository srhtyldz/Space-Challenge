package spacechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) throws FileNotFoundException {

        String[] items = new String[30];
        List<String> liste = new ArrayList<String>(items.length);


        File file1 = new File("phase-1.txt");
        Scanner phase1 = new Scanner(file1);
        int i = 0;
      //  System.out.println(liste.size());
        while (phase1.hasNextLine()) {
            items[i] = phase1.nextLine();
            String[] s = items[i].split("=");
            liste.add(s[i]);
            i++;
        }

       // System.out.println(liste.get(0));


    }
    }
