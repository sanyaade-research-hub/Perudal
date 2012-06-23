package org.guitoune.perudo;

import java.util.Random;

import android.os.Bundle;
import org.apache.cordova.*;

public class PerudoGuitouneActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] msgs = {
    		"Swapping space and time...",
    		"Distilling beauty...",
    		"Challenging everything...",
    		"Loading virtual world...",
    		"Scraping funds...",
    		"Constructing emotional depth...",
    		"Streching images...",
    		"Constructing non-linear narative...",
    		"Extracting fun...",
    		"Bending the spoon...",
    		"Filtering moral...",
    		"Self affirming...",
    		"Sandbagging expectations...",
    		"Processing reality...",
    		"Deterministically simulating the future",
    		"Iodizing...",
    		"Applying innovation...",
    		"Liquefying bytes...",
    		"Manufacturing social responsibility...",
    		"Challenging everything...",
    		"Revolving independence...",
    		"Faithfully re-imagining...",
    		"Testing ozone...",
    		"Tokenizing perfection...",
    		"Spinning violently around the y-axis...",
    		"Meticulously diagramming fun...",
    		"Placating publishers...",
    		"Self affirming..."
        };
        Random generator = new Random();
        int rnd = generator.nextInt(msgs.length);
        super.setStringProperty("loadingDialog", msgs[rnd]);
        super.setBooleanProperty("hideLoadingDialogOnPage", true);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl("file:///android_asset/www/index.html",1000);
        super.setBooleanProperty("keepRunning", false);
    }
}