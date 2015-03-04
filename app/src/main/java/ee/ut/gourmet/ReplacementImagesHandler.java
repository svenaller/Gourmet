package ee.ut.gourmet;

import java.util.ArrayList;

/**
 * Created by Siim on 4.03.2015.
 */
public class ReplacementImagesHandler {

    ArrayList<ReplacementImage> replacementImages;

    public ReplacementImagesHandler(String imageFolderPath){
        //Populate the replacementImages list on creation
    }

    public ReplacementImage findReplacementImage(String word){
        for (ReplacementImage image : replacementImages){
            if (image.compare(word)){
                return image;
            }
        }
        //Non found, return null, not meaningful word for us
        return null;
    }

}
