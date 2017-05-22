package giska_setya.p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by User on 20/05/2017.
 */

public class Splashscreen extends AppCompatActivity {
    //set waktu spalsh screen
    private static int splashInterval = 2000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO Auto-generate method stub
                Intent i = new Intent(Splashscreen.this, Beranda.class);
                startActivity(i); //menghubungkan actuvity screen ke beranda dg intent

                //jeda selesai
                this.finish();
            }

            private void finish() {
                //TODO Auto generated method stub
            }
        }, splashInterval);

    }
}
