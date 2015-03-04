package ee.ut.gourmet;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Siim on 2.03.2015.
 */
public class MenuImage extends ImageView{

    private Bitmap image;
    private MenuText menuText;

    public MenuImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImage(Bitmap image){
        this.image = image;
        setImageBitmap(image);
        //Make a copy of image for enhancement?!?
        //Once set, we will do all the neccessary work here.
        enhanceImage();
        performOCR();
        highLightWords();
    }

   private void performOCR(){
       //Create the menuText object
   }

   private void enhanceImage(){
       //Perform some modification for better OCR
   }

    public void highLightWords(){
        //get the necessary data (MenuWords) from menuText and create the HighLightArea objects
    }

}
