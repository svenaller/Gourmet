package ee.ut.gourmet;

import android.graphics.Bitmap;

/**
 * Created by Siim on 4.03.2015.
 */
public class ReplacementImage {

    private String word;
    private String imageFilePath;

    public ReplacementImage(String word, String filePath){
        this.word = word;
        this.imageFilePath = filePath;
    }

    public Bitmap getImage(){
        // Here we must locate the image from folder and retrive it.
        return null;
    }

    public boolean compare(String anotherWord){
        //Strip the anotherWord in a clever way or do some other clever stuff
        return false;
    }


    /* Not the best idea, because we would have false positives this way. ka and kana would get a distance of 2
    public int getDistanceTo(String anotherWord){
        //The idea is, estimate, how close one word is to another. EditText algorithm?
    }
    */

}
