package ee.ut.gourmet;

import android.graphics.Bitmap;

/**
 * Created by Siim on 3.03.2015.
 */
public class MenuWord {

    private String foodText;
    private Bitmap foodImage;

    // Denoting the box on the image, where the phrase is located. s for start and e for end
    private int xs,ys,xe,ye;

    public MenuWord(String text, Bitmap foodImage, int[] coordinates){
        //Just for storing data of each word
    }

}
