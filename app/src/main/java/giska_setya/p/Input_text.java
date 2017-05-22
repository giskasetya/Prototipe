package giska_setya.p;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input_text extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_text);

        Button btn_kembalihome=(Button)findViewById(R.id.btn_kembalihome);
        btn_kembalihome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
            }
        });
    }

}
