package ru.sapteh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        //Create File

        File file = new File("AutoList.txt");
        if (file.createNewFile()){
            System.out.println("File created");
        }else {
            System.out.println("File not create");
        }
        if (args.length == 0){
            return;
        }

        List<Auto> autos = new ArrayList<>();
        //Reading file and write list
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while (reader.ready()){
                String[] read = reader.readLine().split(" ");
                Auto auto = new Auto(Integer.parseInt(read[0]),read[1],read[2],read[3],read[4],read[5]);
                autos.add(auto);
            }
        }

        //Reading from Terminale

        if ("-c".equals(args[0])){
            int id = 0;
            for (Auto auto : autos){
                if (auto.getId()>id){
                    id = auto.getId();
                }
            }
            String marka = args[1];
            String model = args[2];
            String proizvoditel = args[3];
            String year = args[4];
            String color = args[5];

            Auto auto = new Auto(++id,marka,model,proizvoditel,year,color);
            autos.add(auto);
        }
        try(FileWriter fw = new FileWriter(file)){
            for (Auto auto : autos){
                fw.write(auto.toString());
                fw.write("\n");
            }
        }


    }
}
