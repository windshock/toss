package com.alibaba.griver.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class LoadingView extends FrameLayout {
    public static final String TAG = "LoadingView";
    protected Activity hostActivity;
    protected OnCancelListener onCancelListener;
    protected int progressType;

    public interface OnCancelListener {
        void onCancel();
    }

    public LoadingView(Context context) {
        super(context);
        this.progressType = 1;
    }

    public final void cancel() {
        OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel();
        }
    }

    public abstract ImageView getIconImageView();

    public abstract void onHandleMessage(String str, Map<String, Object> map);

    public abstract void onStart();

    public abstract void onStop();

    public final void sendMessage(final String str, final Map<String, Object> map) {
        post(new Runnable() { // from class: com.alibaba.griver.ui.splash.LoadingView.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LoadingView.this.onHandleMessage(str, map);
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public void setHostActivity(Activity activity) {
        this.hostActivity = activity;
    }

    public void setOnCancelListener(OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }

    public void setProgressType(@ProgressType int i2) {
        this.progressType = i2;
    }

    public final void start() {
        post(new Runnable() { // from class: com.alibaba.griver.ui.splash.LoadingView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LoadingView.this.onStart();
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public final void stop() {
        post(new Runnable() { // from class: com.alibaba.griver.ui.splash.LoadingView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LoadingView.this.onStop();
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progressType = 1;
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.progressType = 1;
    }
}
