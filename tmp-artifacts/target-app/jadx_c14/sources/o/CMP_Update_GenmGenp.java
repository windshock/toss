package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Update_GenmGenp implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV2View IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final TdsButtonV1View onNavigationEvent;
    private final ScrollView onTransact;
    public final TdsImageView onWarmupCompleted;

    private CMP_Update_GenmGenp(@NonNull ScrollView scrollView, @NonNull AppBarLayout appBarLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsImageView tdsImageView, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.onTransact = scrollView;
        this.onExtraCallback = appBarLayout;
        this.onNavigationEvent = tdsButtonV1View;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallbackWithResult = toolbar;
        this.IAuthTabCallback = tdsTopV2View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.onTransact;
    }

    public static CMP_Update_GenmGenp onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMP_Update_GenmGenp onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_simple_issue_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMP_Update_GenmGenp onNavigationEvent(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.completedImage))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CMP_Update_GenmGenp((ScrollView) view, appBarLayoutOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
