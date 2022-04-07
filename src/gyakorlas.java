import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class gyakorlas {


    public static void main(String[] args) {

       ArrayList<String> nevek = new ArrayList<>();
        RandomAccessFile raf;
        String sor;

        try {
            raf = new RandomAccessFile("nevek.txt", "r");


            for(sor=raf.readLine(); sor!= null; sor=raf.readLine()){
                nevek.add(sor);

            }
            raf.close();


        }catch (IOException ex){

            System.out.println("hiba: "+ ex.getMessage());

        }

        System.out.println(nevek);



    }//main vége
}
