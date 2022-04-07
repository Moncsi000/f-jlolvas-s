
import java.io.RandomAccessFile;
import java.io.*;

public class fajlbeolvas {

    public static final String FILE = "C:\\Users\\21f_vargat\\IdeaProjects\\gyakorlás\\nevek.txt";

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[3];

        try
        {
            raf = new RandomAccessFile(FILE,"r");
            int db = 0;
            sor = raf.readLine();
            while( sor != null )
            {
                nevek[db] = sor;
                db++;
                sor = raf.readLine();
            }

            raf.close();

        } catch (FileNotFoundException ex){
            System.out.println("Hiba: "+ex.getMessage());

        }
        catch( IOException e ) {
            System.out.println("HIBA:" + e.getMessage());
        }

        catch (Exception ex){
            System.out.println("Hiba: "+ex.getMessage());
        }

        //catch (ArrayIndexOutOfBoundsException e){
        //    System.out.println("Hiba: " +e.getMessage());
        //}




        for( String str : nevek ) {
            System.out.println(str);
        }

        }// main vége

    }

