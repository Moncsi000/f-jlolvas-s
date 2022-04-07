import java.io.IOException;
import java.io.RandomAccessFile;

public class fajlbeolvasas_adatcsere {
    public static void main(String[] args) {

        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[4];
        try
        {
            raf = new RandomAccessFile("nevek.txt", "rw");
            nevek = new String[3];
            int i = 0;
            for ( sor = raf.readLine(); sor != null; sor = raf.readLine() )
            {
                nevek[i++] = sor;
            }
            raf.setLength(0);
            for( int j = 0; j < 2; j++ )
            {
                raf.writeBytes(nevek[j]+"\n");
            }
            raf.writeBytes("Teodor\n");
            for( int j = 2; j < nevek.length; j++ )
            {
                raf.writeBytes(nevek[j]+"\n");
            }
            raf.close();
        }
        catch ( IOException e ) {
            System.out.println("hiba: "+ e.getMessage());
        }
    }
}
