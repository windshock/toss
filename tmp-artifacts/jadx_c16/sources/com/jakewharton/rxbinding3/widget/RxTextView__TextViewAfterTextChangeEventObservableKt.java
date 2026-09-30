package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import o.DiffUtilCallback;
import o.ProfileInstallerExternalSyntheticLambda0;
import o.UnPressableLinearLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final /* synthetic */ class RxTextView__TextViewAfterTextChangeEventObservableKt {
    public static final UnPressableLinearLayout<ProfileInstallerExternalSyntheticLambda0> IAuthTabCallback(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        return new DiffUtilCallback(textView);
    }
}
