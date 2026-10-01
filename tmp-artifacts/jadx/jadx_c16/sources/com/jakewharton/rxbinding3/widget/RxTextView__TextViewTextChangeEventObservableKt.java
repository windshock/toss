package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import o.ProfileInstallerInitializerExternalSyntheticLambda2;
import o.UnPressableLinearLayout;
import o.areContentsTheSame;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final /* synthetic */ class RxTextView__TextViewTextChangeEventObservableKt {
    public static final UnPressableLinearLayout<ProfileInstallerInitializerExternalSyntheticLambda2> onExtraCallbackWithResult(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        return new areContentsTheSame(textView);
    }
}
