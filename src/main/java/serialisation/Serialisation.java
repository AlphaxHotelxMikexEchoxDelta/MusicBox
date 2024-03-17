package serialisation;
import app.App;
import app.MusicBox;

import java.io.* ;

public class Serialisation
{

    private static final String filename = "sauvegarde" ;

    public static void putObject( MusicBox app )
    {
        try
        {
            FileOutputStream file = new FileOutputStream( filename, false );
            ObjectOutputStream out = new ObjectOutputStream( file );

            out.writeObject( app );

            out.close();
            file.close();

            System.out.println("Serialisation\t[OK]");
        }
        catch(IOException ex)
        { System.out.println("Serialisation\t[NOK][IOException]"); }

    }

    public static MusicBox getObject()
    {
        try
        {

            FileInputStream file = new FileInputStream( filename );
            ObjectInputStream in = new ObjectInputStream( file );

            MusicBox app = (MusicBox) in.readObject();

            in.close();
            file.close();

            System.out.println("Deserialisation\t[OK]");

            return app ;

        }
        catch(IOException ex)
        { System.out.println("Deserialisation\t[NOK][IOException]"); }
        catch(ClassNotFoundException ex)
        { System.out.println("Deserialisation\t[OK][ClassNotFoundException]"); }

        return null ;

    }


}
