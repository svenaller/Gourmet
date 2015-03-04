package ee.ut.gourmet;

import android.content.Context;
import android.view.View;

/**
 * Created by Siim on 4.03.2015.
 */
public class HighLightArea extends View implements View.OnClickListener {


    public HighLightArea(Context context, MenuWord menuWord, MenuImage image) {
        super(context);
        //Use the coordinates from menuWord to create a highlighted box with opacity over the menuImage

    }

    @Override
    public void onClick(View view) {
        //onClick, display the menuWord's bitmap image, on second click, hide the bitmap image
    }
}
