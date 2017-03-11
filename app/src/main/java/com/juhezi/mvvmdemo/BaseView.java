package com.juhezi.mvvmdemo;

import android.databinding.ViewDataBinding;

/**
 * Created by qiao1 on 2017/3/11.
 */

interface BaseView<T extends ViewDataBinding> {

    T getBinding();

}
