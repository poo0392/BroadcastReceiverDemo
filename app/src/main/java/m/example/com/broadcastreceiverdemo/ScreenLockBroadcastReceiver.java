package m.example.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Pooja.Patil on 29/03/2019.
 */

public class ScreenLockBroadcastReceiver extends BroadcastReceiver {
    int count=0;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // screen is turn off
            Log.v("11: ","Screen locked");
            Toast.makeText(context,"Screen locked",Toast.LENGTH_SHORT).show();
        } else {
            //Handle resuming events if user is present/screen is unlocked
            count++;
            //textView.setText(""+count);
            Log.v("BR","count: "+count);
            Log.v("22: ","Screen unlocked");
            Toast.makeText(context,"Screen unlocked",Toast.LENGTH_SHORT).show();
        }
    }
}
