package com.tmoney.listener;

import android.content.Context;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class BaseTmoneyCallback {
    public Context mContext;
    protected ResultListener mListener;

    public BaseTmoneyCallback(Context context, ResultListener resultListener) {
        this.mContext = context;
        this.mListener = resultListener;
    }

    public BaseTmoneyCallback(ResultListener resultListener) {
        this.mListener = resultListener;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void onResult(TmoneyCallback.ResultType resultType) {
        ResultListener resultListener = this.mListener;
        if (resultListener != null) {
            resultListener.onResult(resultType);
        }
    }

    protected void setListener(ResultListener resultListener) {
        this.mListener = resultListener;
    }
}
