package com.wwf.mvp_core

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

/**
 * Created by Administrator on 2018/11/19
 */

interface BaseModel

interface BaseView {
    fun toast(text: String)
    fun showProgress()
    fun showProgress(text: String)
    fun closeProgress()
    fun onData(action: String, vararg data: Any)
}

/**
 * 有了DataBinding，findViewById？不存在的！
 * 在onCreateViewHolder中使用 DataBindingUtil.inflate() 方法得到ViewDataBind对象。
 * create by wenfeng.wang on 2019/1/7
 */
class WFViewHolder<V : ViewDataBinding>(val mDataBinding: V) : RecyclerView.ViewHolder(mDataBinding.root)


//------------- 提供几个空实现类 -------------
class ASimpleModel : BaseModel

class ASimpleView : BaseView {

    override fun toast(text: String) { }

    override fun showProgress() { }

    override fun showProgress(text: String) { }

    override fun closeProgress() { }

    override fun onData(action: String, vararg data: Any) { }
}

class ASimplePresenter(view: BaseView) : BasePresenter<BaseModel>(view) {
    override fun createModel(): BaseModel {
        return ASimpleModel()
    }
}