
import java.io.FileReader;

public class FileHandler{

    String fr;
    FileReader file;
    FileHandler(String fr) throws Exception {
        this.fr = fr;
        try{
            this.file = new FileReader(fr);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    /* -l */
    int lines () throws Exception{
        int i,count=0;
        while((i=file.read())!=-1){
            if ((char)i=='\n') count++;
        }
        return count;
    }
    /* -w */
    int words () throws Exception{
        int i,count=0;
        while((i=file.read())!=-1){
            if ((char)i==' ') count++;
        }
        return count;
    }
    /* -c */
    int size () throws Exception{
        int i,count=0;
        while((i=file.read())!=-1){
            count++;
        }
        return (Character.SIZE/8)*count;
    }

}
