package com.hsj.home.ui;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.hsj.base.AppBaseActivity;
import com.hsj.home.R;
import com.hsj.home.ui.fragment.HomeFragment;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/6/14 09:46
 * @Class:
 * @Description:
 */
public class HomeActivity extends AppBaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_home, new HomeFragment())
                .commit();
    }

    @Override
    protected void initToolbar(Toolbar toolbar, TextView tv_left, TextView tv_center, TextView tv_right) {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {

    }
}
