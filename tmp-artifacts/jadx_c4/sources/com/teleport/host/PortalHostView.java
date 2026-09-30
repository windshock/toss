package com.teleport.host;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.getItemDelegate;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PortalHostView extends ReactViewGroup {
    private int IAuthTabCallback;
    private String onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public PortalHostView(@Nullable Context context) {
        super(context);
    }

    public final void setName(@Nullable String str) {
        if (Intrinsics.areEqual(this.onExtraCallback, str)) {
            return;
        }
        this.onExtraCallbackWithResult = false;
        String str2 = this.onExtraCallback;
        if (str2 != null) {
            getItemDelegate.onExtraCallbackWithResult.onExtraCallbackWithResult(str2, this);
        }
        this.onExtraCallback = str;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onNavigationEvent(str, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted() {
        if (isAttachedToWindow()) {
            this.onExtraCallbackWithResult = true;
        } else {
            IAuthTabCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int IAuthTabCallback(int i) {
        if (!this.onNavigationEvent) {
            this.onNavigationEvent = true;
            this.IAuthTabCallback = getChildCount();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.teleport.host.PortalHostView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    PortalHostView.onExtraCallback(this.f$0);
                }
            });
        }
        return Math.min(this.IAuthTabCallback + i, getChildCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(PortalHostView portalHostView) {
        portalHostView.onNavigationEvent = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.onExtraCallback;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onNavigationEvent(str, this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        String str = this.onExtraCallback;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onNavigationEvent(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (this.onExtraCallbackWithResult) {
            IAuthTabCallback();
            return;
        }
        String str = this.onExtraCallback;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onExtraCallbackWithResult(str, this);
        }
    }

    private final void IAuthTabCallback() {
        String str = this.onExtraCallback;
        if (str != null) {
            getItemDelegate.onExtraCallbackWithResult.onExtraCallbackWithResult(str, this);
        }
        this.onExtraCallback = null;
        this.onNavigationEvent = false;
        this.IAuthTabCallback = 0;
        this.onExtraCallbackWithResult = false;
    }
}
