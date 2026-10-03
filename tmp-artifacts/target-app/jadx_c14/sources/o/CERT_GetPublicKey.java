package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetPublicKey implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    public final TdsTopV2View IAuthTabCallbackDefault;
    private final LinearLayout IAuthTabCallbackStub;
    public final AppBarLayout onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final TdsListRowV1View onNavigationEvent;
    public final TdsListRowV1View onWarmupCompleted;

    private CERT_GetPublicKey(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsListRowV1View tdsListRowV1View2, @NonNull TdsListRowV1View tdsListRowV1View3, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallbackStub = linearLayout;
        this.onExtraCallback = appBarLayout;
        this.onNavigationEvent = tdsListRowV1View;
        this.onWarmupCompleted = tdsListRowV1View2;
        this.IAuthTabCallback = tdsListRowV1View3;
        this.onExtraCallbackWithResult = toolbar;
        this.IAuthTabCallbackDefault = tdsTopV2View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CERT_GetPublicKey onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_GetPublicKey onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_display_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CERT_GetPublicKey onExtraCallbackWithResult(@NonNull View view) {
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent2;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent3;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.dark))) != null && (tdsListRowV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.light))) != null && (tdsListRowV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.system))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_GetPublicKey((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent2, tdsListRowV1ViewOnNavigationEvent3, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
