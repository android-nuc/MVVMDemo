package com.juhezi.mvvmdemo.model.source;

import android.content.Context;

import com.juhezi.mvvmdemo.model.beans.UserBean;
import com.juhezi.mvvmdemo.utils.Action;

/**
 * Created by qiao1 on 2017/3/11.
 */

public class DataSourceImpl implements DataSource {

    private Context mContext;

    private DataSourceImpl(Context context) {
        this.mContext = context;
    }

    private static DataSourceImpl sInstance;

    public static DataSource getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DataSourceImpl(context);
        }
        return sInstance;
    }

    @Override
    public void signIn(UserBean userBean, Action<Integer> action) {
        if (action == null) return;
        if (userBean == null) {
            action.onAction(0);
            return;
        }
        if (userBean.getUsername().equals("Juhezi") && userBean.getPassword().equals("123456"))
            action.onAction(1);
        else
            action.onAction(0);
    }
}
