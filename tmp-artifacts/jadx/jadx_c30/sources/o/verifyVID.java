package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.post.ParagraphSmall;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class verifyVID implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography2 IAuthTabCallback;
    public final TdsBottomCtaV1View IAuthTabCallbackDefault;
    public final LottieAnimationView IAuthTabCallbackStub;
    public final ParagraphSmall IAuthTabCallbackStubProxy;
    public final ConstraintLayout IAuthTabCallback_Parcel;
    public final TdsListRowV1View access000;
    public final TextFieldLine access100;
    public final LinearLayout asBinder;
    public final ConstraintLayout asInterface;
    public final NestedScrollView getInterfaceDescriptor;
    public final TdsTopV2View onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final TextFieldLine onTransact;
    public final Typography5 onWarmupCompleted;
    private final ConstraintLayout readTypedObject;

    private verifyVID(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsTopV2View tdsTopV2View, @NonNull Typography5 typography5, @NonNull Typography2 typography2, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View2, @NonNull TextFieldLine textFieldLine, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull ParagraphSmall paragraphSmall, @NonNull NestedScrollView nestedScrollView, @NonNull TextFieldLine textFieldLine2) {
        this.readTypedObject = constraintLayout;
        this.onExtraCallbackWithResult = linearLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallback = tdsTopV2View;
        this.onWarmupCompleted = typography5;
        this.IAuthTabCallback = typography2;
        this.IAuthTabCallbackStub = lottieAnimationView;
        this.IAuthTabCallbackDefault = tdsBottomCtaV1View2;
        this.onTransact = textFieldLine;
        this.asInterface = constraintLayout2;
        this.asBinder = linearLayout2;
        this.IAuthTabCallback_Parcel = constraintLayout3;
        this.access000 = tdsListRowV1View;
        this.IAuthTabCallbackStubProxy = paragraphSmall;
        this.getInterfaceDescriptor = nestedScrollView;
        this.access100 = textFieldLine2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.readTypedObject;
    }

    public static verifyVID onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        Typography2 typography2OnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent2;
        TextFieldLine textFieldLineOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        ParagraphSmall paragraphSmallOnNavigationEvent;
        NestedScrollView nestedScrollViewOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent2;
        int i = R.id.bottomLayout;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirmButton))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerTitle))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loginGuideMessage))) != null && (typography2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loginGuideTitle))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottieView))) != null && (tdsBottomCtaV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nextInputButton))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.phoneNumberInput))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.scrollLayout;
            LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout2 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.startLoginGuideContainer))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.under14GuardianInfoRow))) != null && (paragraphSmallOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.user_info_save_desc))) != null && (nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.user_info_scroll_view))) != null && (textFieldLineOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.userNameInput))) != null) {
                return new verifyVID(constraintLayout, linearLayout, tdsBottomCtaV1ViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, typography5OnNavigationEvent, typography2OnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent2, textFieldLineOnNavigationEvent, constraintLayout, linearLayout2, constraintLayoutOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, paragraphSmallOnNavigationEvent, nestedScrollViewOnNavigationEvent, textFieldLineOnNavigationEvent2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
