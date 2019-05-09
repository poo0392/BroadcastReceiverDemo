package m.example.com.broadcastreceiverdemo.view;

/**
 * Created by Zafar.Hussain on 01/04/2019.
 */

public interface ILoginView {
    public void onClearText();

    public void onLoginResult(Boolean result, int code);

    public void onSetProgressBarVisibility(int visibility);
}
