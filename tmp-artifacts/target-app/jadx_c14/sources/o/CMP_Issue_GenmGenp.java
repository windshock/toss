package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Issue_GenmGenp implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final ProgressBar onWarmupCompleted;

    private CMP_Issue_GenmGenp(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onWarmupCompleted = progressBar;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CMP_Issue_GenmGenp onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CMP_Issue_GenmGenp onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pedometer_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMP_Issue_GenmGenp onExtraCallbackWithResult(@NonNull View view) {
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null) {
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (progressBar != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CMP_Issue_GenmGenp((ConstraintLayout) view, appBarLayoutOnNavigationEvent, progressBar, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
