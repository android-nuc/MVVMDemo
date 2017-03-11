package com.juhezi.mvvmdemo.sign_in;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.juhezi.mvvmdemo.R;
import com.juhezi.mvvmdemo.SingleFragmentActivity;

public class SignInActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment getFragment() {
        return SignInFragment.getInstance();
    }

    @Override
    protected int getActivityLayoutRes() {
        return R.layout.activity_sign_in;
    }

    @Override
    protected int getFragmentContainerId() {
        return R.id.ll_activity_main_fragment;
    }
}
