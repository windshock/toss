package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class verifyValidity implements SearchBarKtExternalSyntheticLambda5 {
    public final RecyclerView IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final Typography6 IAuthTabCallbackStub;
    public final RecyclerView IAuthTabCallbackStubProxy;
    private final ConstraintLayout IAuthTabCallback_Parcel;
    public final LinearLayout asBinder;
    public final ConstraintLayout asInterface;
    public final TdsListHeaderV2View onExtraCallback;
    public final TdsTopV1View onExtraCallbackWithResult;
    public final TdsListHeaderV2View onNavigationEvent;
    public final TdsImageView onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private verifyValidity(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull TdsListHeaderV2View tdsListHeaderV2View, @NonNull TdsListHeaderV2View tdsListHeaderV2View2, @NonNull TdsTopV1View tdsTopV1View, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayout linearLayout, @NonNull Typography6 typography6, @NonNull RecyclerView recyclerView2) {
        this.IAuthTabCallback_Parcel = constraintLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = recyclerView;
        this.onNavigationEvent = tdsListHeaderV2View;
        this.onExtraCallback = tdsListHeaderV2View2;
        this.onExtraCallbackWithResult = tdsTopV1View;
        this.onTransact = tdsImageView;
        this.IAuthTabCallbackDefault = constraintLayout2;
        this.asInterface = constraintLayout3;
        this.asBinder = linearLayout;
        this.IAuthTabCallbackStub = typography6;
        this.IAuthTabCallbackStubProxy = recyclerView2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback_Parcel;
    }

    public static verifyValidity onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        TdsListHeaderV2View tdsListHeaderV2ViewOnNavigationEvent;
        TdsListHeaderV2View tdsListHeaderV2ViewOnNavigationEvent2;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent2;
        int i = R.id.confirmButton;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guardianTermsRv))) != null && (tdsListHeaderV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header1))) != null && (tdsListHeaderV2ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header2))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerTitle))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.image))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.scrollLayout;
            ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (constraintLayoutOnNavigationEvent != null) {
                i = R.id.term_toss_money;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text_term_toss_money))) != null && (recyclerViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.under14TermsRv))) != null) {
                    return new verifyValidity(constraintLayout, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, tdsListHeaderV2ViewOnNavigationEvent, tdsListHeaderV2ViewOnNavigationEvent2, tdsTopV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayout, constraintLayoutOnNavigationEvent, linearLayout, typography6OnNavigationEvent, recyclerViewOnNavigationEvent2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
