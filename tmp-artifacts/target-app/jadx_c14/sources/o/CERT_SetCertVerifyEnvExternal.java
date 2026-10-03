package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsRoundTextView;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_SetCertVerifyEnvExternal implements SearchBarKtExternalSyntheticLambda5 {
    public final AppCompatTextView IAuthTabCallback;
    public final TdsRoundTextView IAuthTabCallbackDefault;
    public final TdsRoundTextView IAuthTabCallbackStub;
    public final TdsRoundTextView IAuthTabCallbackStubProxy;
    public final TdsRoundTextView IAuthTabCallback_Parcel;
    public final Toolbar ICustomTabsCallback;
    public final TdsRoundTextView access000;
    public final TdsRoundTextView access100;
    public final TdsRoundTextView asBinder;
    public final TdsRoundTextView asInterface;
    public final Group extraCallbackWithResult;
    public final TdsRoundTextView getInterfaceDescriptor;
    public final TdsRoundTextView onExtraCallback;
    public final TdsTopV1T05View onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final TdsRoundTextView onTransact;
    public final AppCompatTextView onWarmupCompleted;
    private final ConstraintLayout readTypedObject;
    public final TdsTopV1T03View writeTypedObject;

    private CERT_SetCertVerifyEnvExternal(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTopV1T05View tdsTopV1T05View, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TdsRoundTextView tdsRoundTextView, @NonNull TdsRoundTextView tdsRoundTextView2, @NonNull TdsRoundTextView tdsRoundTextView3, @NonNull TdsRoundTextView tdsRoundTextView4, @NonNull TdsRoundTextView tdsRoundTextView5, @NonNull TdsRoundTextView tdsRoundTextView6, @NonNull TdsRoundTextView tdsRoundTextView7, @NonNull TdsRoundTextView tdsRoundTextView8, @NonNull TdsRoundTextView tdsRoundTextView9, @NonNull TdsRoundTextView tdsRoundTextView10, @NonNull TdsRoundTextView tdsRoundTextView11, @NonNull Group group, @NonNull TdsTopV1T03View tdsTopV1T03View, @NonNull Toolbar toolbar) {
        this.readTypedObject = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onExtraCallbackWithResult = tdsTopV1T05View;
        this.onWarmupCompleted = appCompatTextView;
        this.IAuthTabCallback = appCompatTextView2;
        this.onExtraCallback = tdsRoundTextView;
        this.asInterface = tdsRoundTextView2;
        this.asBinder = tdsRoundTextView3;
        this.IAuthTabCallbackStub = tdsRoundTextView4;
        this.onTransact = tdsRoundTextView5;
        this.IAuthTabCallbackDefault = tdsRoundTextView6;
        this.access000 = tdsRoundTextView7;
        this.access100 = tdsRoundTextView8;
        this.IAuthTabCallbackStubProxy = tdsRoundTextView9;
        this.IAuthTabCallback_Parcel = tdsRoundTextView10;
        this.getInterfaceDescriptor = tdsRoundTextView11;
        this.extraCallbackWithResult = group;
        this.writeTypedObject = tdsTopV1T03View;
        this.ICustomTabsCallback = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.readTypedObject;
    }

    public static CERT_SetCertVerifyEnvExternal IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_SetCertVerifyEnvExternal onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_nps_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CERT_SetCertVerifyEnvExternal onNavigationEvent(@NonNull View view) {
        TdsTopV1T05View tdsTopV1T05ViewOnNavigationEvent;
        AppCompatTextView appCompatTextViewOnNavigationEvent;
        AppCompatTextView appCompatTextViewOnNavigationEvent2;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent2;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent3;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent4;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent5;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent6;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent7;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent8;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent9;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent10;
        TdsRoundTextView tdsRoundTextViewOnNavigationEvent11;
        Group groupOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTopV1T05ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.descMessage))) != null && (appCompatTextViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.maximumScore))) != null && (appCompatTextViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.minimumScore))) != null && (tdsRoundTextViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score0))) != null && (tdsRoundTextViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score1))) != null && (tdsRoundTextViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score10))) != null && (tdsRoundTextViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score2))) != null && (tdsRoundTextViewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score3))) != null && (tdsRoundTextViewOnNavigationEvent6 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score4))) != null && (tdsRoundTextViewOnNavigationEvent7 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score5))) != null && (tdsRoundTextViewOnNavigationEvent8 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score6))) != null && (tdsRoundTextViewOnNavigationEvent9 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score7))) != null && (tdsRoundTextViewOnNavigationEvent10 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score8))) != null && (tdsRoundTextViewOnNavigationEvent11 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.score9))) != null && (groupOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scoreGroup))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleMessage))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_SetCertVerifyEnvExternal((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsTopV1T05ViewOnNavigationEvent, appCompatTextViewOnNavigationEvent, appCompatTextViewOnNavigationEvent2, tdsRoundTextViewOnNavigationEvent, tdsRoundTextViewOnNavigationEvent2, tdsRoundTextViewOnNavigationEvent3, tdsRoundTextViewOnNavigationEvent4, tdsRoundTextViewOnNavigationEvent5, tdsRoundTextViewOnNavigationEvent6, tdsRoundTextViewOnNavigationEvent7, tdsRoundTextViewOnNavigationEvent8, tdsRoundTextViewOnNavigationEvent9, tdsRoundTextViewOnNavigationEvent10, tdsRoundTextViewOnNavigationEvent11, groupOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
