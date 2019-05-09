package m.example.com.broadcastreceiverdemo.presenter;

import android.os.Handler;
import android.os.Looper;

import m.example.com.broadcastreceiverdemo.model.IUser;
import m.example.com.broadcastreceiverdemo.model.UserModel;
import m.example.com.broadcastreceiverdemo.view.ILoginView;

/**
 * Created by Pooja.Patil on 01/04/2019.
 */

public class LoginPresenterCompl implements ILoginPresenter {
    ILoginView iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenterCompl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    private void initUser() {
        user = new UserModel("mvp", "mvp");
    }

    @Override
    public void clear() {
        iLoginView.onClearText();

    }

    @Override
    public void doLogin(String name, String password) {
        Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name,password);
        if (code!=0) isLoginSuccess = false;


        final Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);
    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {
        iLoginView.onSetProgressBarVisibility(visiblity);
    }
}
