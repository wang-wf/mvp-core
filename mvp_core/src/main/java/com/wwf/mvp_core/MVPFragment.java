package com.wwf.mvp_core;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * create by wenfeng.wang on 2019/1/7
 */
public abstract class MVPFragment<D extends ViewDataBinding, P extends BasePresenter> extends Fragment implements BaseView {
    protected D mDataBinding;
    protected P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();
        if(null != mPresenter) getLifecycle().addObserver(mPresenter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mDataBinding = DataBindingUtil.inflate(inflater, createLayout(), container, false);

        return mDataBinding.getRoot();
    }

    /**
     * 子类实现此方法以绑定布局。
     * @return 对应的布局文件id
     */
    public abstract int createLayout();

    public abstract @Nullable P createPresenter();

    @Override
    public void toast(@NonNull String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
