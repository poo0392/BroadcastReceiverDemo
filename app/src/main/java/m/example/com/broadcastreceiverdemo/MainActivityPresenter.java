package m.example.com.broadcastreceiverdemo;

/**
 * Created by Zafar.Hussain on 01/04/2019.
 */

public class MainActivityPresenter {
    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user=new User();
        this.view = view;
    }

    public void updateFullname(String fullname){
        user.setFullname(fullname);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }


    interface View{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
