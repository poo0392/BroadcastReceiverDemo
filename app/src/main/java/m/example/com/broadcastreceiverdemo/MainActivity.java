package m.example.com.broadcastreceiverdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Pooja.Patil on 29/03/2019.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowBroadcast(View view) {

       /* EditText txtMsg = (EditText) findViewById(R.id.txtMsg);

        Intent i = new Intent();
      //  i.putExtra("msg", (CharSequence)txtMsg.getText().toString());
       // i.setAction("com.tutlane.CUSTOM_INTENT");
        i.setAction("com.broadcastreceiverdemo.CUSTOM_INTENT");
        sendBroadcast(i);*/



    }
}
