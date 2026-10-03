package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Update_Confirm implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    public final Guideline onExtraCallback;
    public final LinearLayoutCompat onExtraCallbackWithResult;
    public final FrameLayout onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private UST_CMP_Update_Confirm(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Guideline guideline, @NonNull Toolbar toolbar, @NonNull FrameLayout frameLayout) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallbackWithResult = linearLayoutCompat;
        this.onExtraCallback = guideline;
        this.IAuthTabCallback = toolbar;
        this.onNavigationEvent = frameLayout;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static UST_CMP_Update_Confirm onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static UST_CMP_Update_Confirm onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheet_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static UST_CMP_Update_Confirm IAuthTabCallback(@NonNull View view) {
        Guideline guidelineOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.container;
        LinearLayoutCompat linearLayoutCompatOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayoutCompatOnNavigationEvent != null && (guidelineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guide_top))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null) {
            i = R.id.webViewContainer;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null) {
                return new UST_CMP_Update_Confirm((ConstraintLayout) view, linearLayoutCompatOnNavigationEvent, guidelineOnNavigationEvent, toolbarOnNavigationEvent, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
