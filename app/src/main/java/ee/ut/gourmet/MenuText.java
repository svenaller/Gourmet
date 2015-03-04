package ee.ut.gourmet;

import java.util.ArrayList;

/**
 * Created by Siim on 2.03.2015.
 */
public class MenuText {

    private String[] splitedText;
    private ArrayList<MenuWord> menuWordList;
    private ReplacementImagesHandler handler;

    public MenuText(String fullText, ReplacementImagesHandler handler){
        this.handler = handler;
        splitedText = splitAndStrip(fullText);
        findMeaningfulWords();
    }

    private String[] splitAndStrip(String fullText){
        return null;
    }

    private void findMeaningfulWords(){
        for (String word : splitedText){
            ReplacementImage replacement = handler.findReplacementImage(word);
            if (replacement != null){
              //Add new menuword object to the list. Can't do it now, because I do not know the coordinates.
            }
        }
        // Populate the wordImageMap list with ONLY meaningful MenuWord objects and link them with ReplacementImage;
    }

}
