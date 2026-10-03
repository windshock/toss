package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_UpdateCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;

    private CMP_UpdateCertificate(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull Toolbar toolbar) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onNavigationEvent = toolbar;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static CMP_UpdateCertificate onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CMP_UpdateCertificate onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CMP_UpdateCertificate onExtraCallback(@NonNull View view) {
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CMP_UpdateCertificate((ConstraintLayout) view, appBarLayoutOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
