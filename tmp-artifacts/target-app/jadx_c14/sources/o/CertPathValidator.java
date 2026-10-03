package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertPathValidator implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final LinearLayout IAuthTabCallbackStub;
    public final Typography6 IAuthTabCallbackStubProxy;
    public final SubTypography5 IAuthTabCallback_Parcel;
    public final LinearLayout ICustomTabsCallback;
    public final ScrollView access000;
    public final AnimateText access100;
    public final TdsImageView asBinder;
    public final TdsImageView asInterface;
    private final ConstraintLayout extraCallback;
    public final TdsTopV2View getInterfaceDescriptor;
    public final Typography7 onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final TdsListRowV1View onTransact;
    public final ConstraintLayout onWarmupCompleted;

    private CertPathValidator(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull Typography7 typography7, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull LinearLayout linearLayout2, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull ConstraintLayout constraintLayout4, @NonNull ScrollView scrollView, @NonNull Typography6 typography6, @NonNull SubTypography5 subTypography5, @NonNull AnimateText animateText, @NonNull TdsTopV2View tdsTopV2View, @NonNull LinearLayout linearLayout3) {
        this.extraCallback = constraintLayout;
        this.IAuthTabCallback = linearLayout;
        this.onExtraCallback = typography7;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onWarmupCompleted = constraintLayout2;
        this.onExtraCallbackWithResult = constraintLayout3;
        this.asInterface = tdsImageView;
        this.asBinder = tdsImageView2;
        this.IAuthTabCallbackStub = linearLayout2;
        this.onTransact = tdsListRowV1View;
        this.IAuthTabCallbackDefault = constraintLayout4;
        this.access000 = scrollView;
        this.IAuthTabCallbackStubProxy = typography6;
        this.IAuthTabCallback_Parcel = subTypography5;
        this.access100 = animateText;
        this.getInterfaceDescriptor = tdsTopV2View;
        this.ICustomTabsCallback = linearLayout3;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.extraCallback;
    }

    public static CertPathValidator onNavigationEvent(@NonNull View view) {
        Typography7 typography7OnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        SubTypography5 subTypography5OnNavigationEvent;
        AnimateText animateTextOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.banner;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.banner_subtitle))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.certifyRequestLayout))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.certifyWaitingLayout))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.icon))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null) {
            i = R.id.introItemContainer;
            LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout2 != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.remainingTimeListRow))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.scrollView;
                ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (scrollView != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.subtitle))) != null && (subTypography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.textView))) != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                    i = R.id.topContainer;
                    LinearLayout linearLayout3 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (linearLayout3 != null) {
                        return new CertPathValidator(constraintLayout, linearLayout, typography7OnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, constraintLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent2, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, linearLayout2, tdsListRowV1ViewOnNavigationEvent, constraintLayout, scrollView, typography6OnNavigationEvent, subTypography5OnNavigationEvent, animateTextOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
