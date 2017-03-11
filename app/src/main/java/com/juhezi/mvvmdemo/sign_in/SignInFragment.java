package com.juhezi.mvvmdemo.sign_in;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juhezi.mvvmdemo.BaseView;
import com.juhezi.mvvmdemo.R;
import com.juhezi.mvvmdemo.databinding.FragmentSignInBinding;

/**
 * Created by qiao1 on 2017/3/11.
 */

public class SignInFragment extends Fragment implements BaseView<ViewDataBinding> {

    private SignInViewModel viewModel;
    private FragmentSignInBinding mBinding;

    private static final class Holder {
        private final static SignInFragment sInstance = new SignInFragment();
    }

    public static SignInFragment getInstance() {
        return Holder.sInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_sign_in, container, false);
        mBinding = DataBindingUtil.bind(root);
        viewModel = new SignInViewModel(mBinding, getContext());
        return root;
    }
}
