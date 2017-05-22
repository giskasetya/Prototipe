package giska_setya.p;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Beranda extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);

        Button btn_qrcode = (Button) findViewById(R.id.btn_qrcode);
        Button btn_input_text = (Button) findViewById(R.id.btn_input_text);

        Button btn_keluar = (Button) findViewById(R.id.btn_keluar);


        btn_input_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Qr_code.class);
                startActivity(i);
            }
        });

        btn_input_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Input_text.class);
                startActivity(i);
            }
        });

        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder alertexit = new AlertDialog.Builder(Beranda.this);
                alertexit
                        .setMessage("Anda yakin ingin keluar dari aplikasi ini?")
                        .setCancelable(false)
                        .setPositiveButton("YA",
                                new AlertDialog.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0,
                                                        int arg1) {
                                        System.exit(0);
                                    }
                                })
                        .setNegativeButton("TIDAK",
                                new AlertDialog.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog a = alertexit.create();
                a.show();
            }
        });
    }


}
