package spacechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Simulation {


    //Reading items and fill up rockets.

    public  List<String> itemlist = new ArrayList<>();


    public List<String> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<String> itemlist) {
        this.itemlist = itemlist;
    }

    public List<String> loadItems() throws FileNotFoundException {


            File file1 = new File("phase-1.txt");
            File file2 = new File("phase-2.txt");
            Scanner phase1 = new Scanner(file1);
            Scanner phase2 = new Scanner(file2);

            while (phase1.hasNextLine()) {
                    itemlist.add(phase1.nextLine());
                }
             while(phase2.hasNextLine()){
            itemlist.add(phase2.nextLine());
                 }


        return itemlist;
    }

    /*
    public List<Item> loadU1(List<Item>){
        getItemlist();


        return -1;

    }


    public List<Item> loadU2(ArrayList<Item>){
        getItemlist();

        return -1;

    }



    public List<Rocket> runSimulation(){

        Rocket r= new Rocket();
        r.land();
        r.launch();
        int TotalBudget=5;

        return TotalBudget;
    }

*/

    }


