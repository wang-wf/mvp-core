package com.wwf.mvp_core;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


/**
 *
 * Created by Administrator on 2018/11/19
 */
public abstract class MVPActivity<D extends ViewDataBinding, P extends BasePresenter> extends AppCompatActivity implements BaseView {
    protected D mDataBinding;
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDataBinding = DataBindingUtil.setContentView(this, createLayout());
        mPresenter = createPresenter();
    }

    public abstract int createLayout();
    public abstract @Nullable P createPresenter();

    @Override
    public void toast(@NonNull String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
