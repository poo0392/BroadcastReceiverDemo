package m.example.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Pooja.Patil on 29/03/2019.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence iData = intent.getCharSequenceExtra("msg");
        Toast.makeText(context,"Received Message: "+iData,Toast.LENGTH_LONG).show();
    }
}
