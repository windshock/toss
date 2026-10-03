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
public final class CERT_GetPathLength implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    public final TdsTopV2View IAuthTabCallbackDefault;
    public final TdsListRowV1View IAuthTabCallbackStub;
    public final Toolbar asBinder;
    public final TdsListRowV1View onExtraCallback;
    public final TdsListRowV1View onExtraCallbackWithResult;
    public final View onNavigationEvent;
    private final LinearLayout onTransact;
    public final AppBarLayout onWarmupCompleted;

    private CERT_GetPathLength(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsListRowV1View tdsListRowV1View2, @NonNull TdsListRowV1View tdsListRowV1View3, @NonNull TdsListRowV1View tdsListRowV1View4, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.onTransact = linearLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onNavigationEvent = view;
        this.onExtraCallback = tdsListRowV1View;
        this.IAuthTabCallback = tdsListRowV1View2;
        this.onExtraCallbackWithResult = tdsListRowV1View3;
        this.IAuthTabCallbackStub = tdsListRowV1View4;
        this.asBinder = toolbar;
        this.IAuthTabCallbackDefault = tdsTopV2View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onTransact;
    }

    public static CERT_GetPathLength onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetPathLength onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_haptic_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CERT_GetPathLength onWarmupCompleted(@NonNull View view) {
        View viewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent2;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent3;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent4;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.divider))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.haptic_volume))) != null && (tdsListRowV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.system))) != null && (tdsListRowV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toggle_off))) != null && (tdsListRowV1ViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toggle_on))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_GetPathLength((LinearLayout) view, appBarLayoutOnNavigationEvent, viewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent2, tdsListRowV1ViewOnNavigationEvent3, tdsListRowV1ViewOnNavigationEvent4, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
