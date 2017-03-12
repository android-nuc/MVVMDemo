package com.juhezi.mvvmdemo.sign_in;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.juhezi.mvvmdemo.BaseViewModel;
import com.juhezi.mvvmdemo.R;
import com.juhezi.mvvmdemo.databinding.FragmentSignInBinding;
import com.juhezi.mvvmdemo.model.beans.UserBean;
import com.juhezi.mvvmdemo.model.source.DataSource;
import com.juhezi.mvvmdemo.model.source.DataSourceImpl;
import com.juhezi.mvvmdemo.utils.Action;

/**
 * Created by qiao1 on 2017/3/11.
 */

public class SignInViewModel extends BaseObservable implements BaseViewModel {

    private UserBean mUserBean;
    private Context mContext;
    private DataSource dataSource;

    private static final String TAG = "SignInViewModel";

    public SignInViewModel(UserBean userBean, Context context) {
        this.mUserBean = userBean;
        this.mContext = context;
        dataSource = DataSourceImpl.getInstance(mContext);
    }

    public String getUsername() {
        return mUserBean == null ? "" : mUserBean.getUsername();
    }

    public String getPassword() {
        return mUserBean == null ? "" : mUserBean.getPassword();
    }

    @Bindable
    public void setUsername(String username) {
        if (mUserBean != null) {
            mUserBean.setUsername(username);
        }
    }

    @Bindable
    public void setPassword(String password) {
        if (mUserBean != null) {
            mUserBean.setPassword(password);
        }
    }


    public View.OnClickListener onClickSignIn() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSource.signIn(mUserBean, new Action<Integer>() {
                    @Override
                    public void onAction(Integer integer) {
                        if(integer == 0) {
                            showToast(mContext.getString(R.string.sign_in_fail));
                        } else {
                            showToast(mContext.getString(R.string.sign_in_success));
                        }
                    }
                });
            }
        };
    }

    public void showToast(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void destroy() {
        //GC
    }
}
