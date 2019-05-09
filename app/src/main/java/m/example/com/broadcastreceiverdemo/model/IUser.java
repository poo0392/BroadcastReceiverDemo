package m.example.com.broadcastreceiverdemo.model;

/**
 * Created by Zafar.Hussain on 01/04/2019.
 */

public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String username,String password);
}
