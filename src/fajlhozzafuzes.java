import java.io.IOException;
import java.io.RandomAccessFile;

public class fajlhozzafuzes {
    public static final String FILE = "C:\\Users\\21f_vargat\\IdeaProjects\\gyakorlás\\nevek.txt";

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[3];

        try
        {

            raf = new RandomAccessFile(FILE, "rw");
            int i = 0;
            for (sor = raf.readLine(); sor != null; sor = raf.readLine())
            {
                nevek[i] = sor;
                i++;
            }
            nevek[1] = "Anna";
            raf.seek(0);
            for (String s : nevek)
            {
                raf.writeBytes(s+"\n");
            }


            if( raf.length() > raf.getFilePointer() )
            {
                raf.setLength( raf.getFilePointer() );
            }
            raf.close();
        }
        catch( IOException e ) {
            System.out.println("hiba: "+ e.getMessage());
        }
    }
}
