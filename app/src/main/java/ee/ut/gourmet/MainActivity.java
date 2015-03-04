package ee.ut.gourmet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    /*
    * Here we will handle the getting the image, either through camera or gallery
    * Then we will set the image in the MenuImage class (Use findViewById)
    * The MenuImage class will do the rest.
    *
    * When setting a new image, the image class will do everything again, when the new image is set.
    *
    * Also, we will create the ReplacementImageHandler class here, which will get all the refs from the assets folder
    *
    * The database of images will be in the assets folder,
    * where the image name (without the extension obviously)
    * will be the word the image represents
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
