package com.juhezi.mvvmdemo;

import android.content.Context;
import android.databinding.ViewDataBinding;

import com.juhezi.mvvmdemo.model.source.DataSource;

/**
 * Created by qiao1 on 2017/3/11.
 */

public abstract class BaseViewModel<Binding extends ViewDataBinding> {

    protected Binding mBinding;
    protected Context mContext;
    protected DataSource mDataSource;

    public BaseViewModel(Binding binding, Context context) {
        this.mBinding = binding;
        this.mContext = context;
        //初始化DataSource
    }


}
