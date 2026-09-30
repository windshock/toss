package com.swmansion.rnscreens.ext;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import o.PaddingKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewExtKt {
    public static final View parentAsView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static final ViewGroup parentAsViewGroup(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View recycle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup viewGroupParentAsViewGroup = parentAsViewGroup(view);
        if (viewGroupParentAsViewGroup != null) {
            viewGroupParentAsViewGroup.endViewTransition(view);
            viewGroupParentAsViewGroup.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        return view;
    }

    public static final Integer maybeBgColor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Drawable background = view.getBackground();
        if (background instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) background).getColor());
        }
        return null;
    }

    public static final ViewGroup asViewGroupOrNull(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public static final Fragment findFragmentOrNull(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        try {
            return PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
