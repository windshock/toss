package com.swmansion.rnscreens.utils;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DecorViewInsetsUtilsKt {
    public static final int getDecorViewTopInset(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(view);
        if (windowInsetsCompatICustomTabsCallback == null) {
            return 0;
        }
        return getTopInset(windowInsetsCompatICustomTabsCallback);
    }

    private static final int getTopInset(WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder() | WindowInsetsCompat.onTransact.onExtraCallbackWithResult()).onWarmupCompleted;
    }

    public static final Boolean isSoftKeyboardVisibleOrNull(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        WindowInsetsCompat windowInsetsCompatICustomTabsCallback = ViewCompat.ICustomTabsCallback(view);
        if (windowInsetsCompatICustomTabsCallback == null) {
            return null;
        }
        return Boolean.valueOf(windowInsetsCompatICustomTabsCallback.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallback()));
    }
}
