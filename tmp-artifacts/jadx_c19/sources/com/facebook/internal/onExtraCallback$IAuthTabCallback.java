package com.facebook.internal;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onExtraCallback$IAuthTabCallback {
    private onExtraCallback$IAuthTabCallback() {
    }

    public /* synthetic */ onExtraCallback$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public final onExtraCallback IAuthTabCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (onExtraCallback.onNavigationEvent() != null) {
            return onExtraCallback.onNavigationEvent();
        }
        onExtraCallback onextracallback = new onExtraCallback(context, (DefaultConstructorMarker) null);
        onExtraCallback.onNavigationEvent(onextracallback);
        onExtraCallback.onExtraCallback(onextracallback);
        return onExtraCallback.onNavigationEvent();
    }
}
