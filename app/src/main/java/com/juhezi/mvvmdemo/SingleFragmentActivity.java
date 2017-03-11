package com.juhezi.mvvmdemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by qiao1 on 2017/3/11.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected Fragment mFragment = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityLayoutRes());
        mFragment = getSupportFragmentManager().findFragmentById(getFragmentContainerId());
        if (mFragment == null) {
            mFragment = getFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(getFragmentContainerId(), mFragment)
                    .commit();
        }
    }

    protected abstract Fragment getFragment();

    @LayoutRes
    protected abstract int getActivityLayoutRes();

    @IdRes
    protected abstract int getFragmentContainerId();

}
