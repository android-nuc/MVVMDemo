package com.juhezi.mvvmdemo.model.source;

import com.juhezi.mvvmdemo.model.beans.UserBean;
import com.juhezi.mvvmdemo.utils.Action;

/**
 * Created by qiao1 on 2017/3/11.
 */

public interface DataSource {

    void signIn(UserBean userBean, Action<Integer> action);


}
