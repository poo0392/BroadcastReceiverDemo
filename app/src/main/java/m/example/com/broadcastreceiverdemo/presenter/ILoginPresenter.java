package m.example.com.broadcastreceiverdemo.presenter;

/**
 * Created by Zafar.Hussain on 01/04/2019.
 */

public interface ILoginPresenter {
    public void clear();
    public void doLogin(String name,String password);
    void setProgressBarVisiblity(int visiblity);
}
