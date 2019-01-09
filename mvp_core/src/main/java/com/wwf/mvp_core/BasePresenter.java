package com.wwf.mvp_core;

import android.arch.lifecycle.LifecycleObserver;

/**
 * create by wenfeng.wang on 2019/1/7
 */
public abstract class BasePresenter<M extends BaseModel, V extends BaseView> implements LifecycleObserver {
    protected M model;
    protected V view;

    public BasePresenter(V view) {
        this.view = view;
        this.model = createModel();
    }

    /**
     * Subclasses should implement this method and create corresponding Model instances in it
     * @return the model instance
     */
    protected abstract M createModel();
}
