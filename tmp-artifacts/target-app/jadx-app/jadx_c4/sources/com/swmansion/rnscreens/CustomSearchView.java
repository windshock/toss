package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CustomSearchView extends SearchView {
    private final FragmentBackPressOverrider backPressOverrider;
    private OnBackPressedCallback onBackPressedCallback;
    private SearchView.onExtraCallback onCloseListener;
    private View.OnClickListener onSearchClickedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSearchView(@NotNull Context context, @NotNull Fragment fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: com.swmansion.rnscreens.CustomSearchView$onBackPressedCallback$1
            {
                super(true);
            }

            public void handleOnBackPressed() {
                this.this$0.setIconified(true);
            }
        };
        this.onBackPressedCallback = onBackPressedCallback;
        this.backPressOverrider = new FragmentBackPressOverrider(fragment, onBackPressedCallback);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.CustomSearchView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSearchView._init_$lambda$0(this.f$0, view);
            }
        });
        super.setOnCloseListener(new SearchView.onExtraCallback() { // from class: com.swmansion.rnscreens.CustomSearchView$$ExternalSyntheticLambda1
            public final boolean onClose() {
                return CustomSearchView._init_$lambda$1(this.f$0);
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final void setOverrideBackAction(boolean z) {
        this.backPressOverrider.setOverrideBackAction(z);
    }

    public final boolean getOverrideBackAction() {
        return this.backPressOverrider.getOverrideBackAction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void focus() {
        setIconified(false);
        requestFocusFromTouch();
    }

    public final void clearText() {
        setQuery("", false);
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setQuery(str, false);
    }

    public final void cancelSearch() {
        clearText();
        setIconified(true);
    }

    public void setOnCloseListener(@Nullable SearchView.onExtraCallback onextracallback) {
        this.onCloseListener = onextracallback;
    }

    public void setOnSearchClickListener(@Nullable View.OnClickListener onClickListener) {
        this.onSearchClickedListener = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (isIconified()) {
            return;
        }
        this.backPressOverrider.maybeAddBackCallback();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.backPressOverrider.removeBackCallbackIfAdded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CustomSearchView customSearchView, View view) {
        View.OnClickListener onClickListener = customSearchView.onSearchClickedListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        customSearchView.backPressOverrider.maybeAddBackCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(CustomSearchView customSearchView) {
        SearchView.onExtraCallback onextracallback = customSearchView.onCloseListener;
        boolean zOnClose = onextracallback != null ? onextracallback.onClose() : false;
        customSearchView.backPressOverrider.removeBackCallbackIfAdded();
        return zOnClose;
    }
}
