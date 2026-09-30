package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CERT_EncryptPrikey implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final TdsListRowV1View onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    private CERT_EncryptPrikey(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsListRowV1View tdsListRowV1View2, @NonNull Toolbar toolbar) {
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.IAuthTabCallback = tdsListRowV1View;
        this.onNavigationEvent = tdsListRowV1View2;
        this.onExtraCallbackWithResult = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static CERT_EncryptPrikey onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_EncryptPrikey onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_biometric_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CERT_EncryptPrikey onWarmupCompleted(@NonNull View view) {
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent2;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.biometric))) != null && (tdsListRowV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.password))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_EncryptPrikey((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent2, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
