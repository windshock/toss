package o;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textField.TextField;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTSANonce implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayoutCompat IAuthTabCallback;
    public final TdsTopV1View IAuthTabCallbackDefault;
    public final ScrollView IAuthTabCallbackStub;
    public final TextField asBinder;
    public final TdsBottomCtaV1View onExtraCallback;
    public final LottieAnimationView onExtraCallbackWithResult;
    public final TdsButtonV1View onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final TdsListRowV1View onWarmupCompleted;

    private GetTSANonce(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScrollView scrollView, @NonNull TextField textField, @NonNull TdsTopV1View tdsTopV1View) {
        this.onTransact = constraintLayout;
        this.onNavigationEvent = tdsButtonV1View;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.IAuthTabCallback = linearLayoutCompat;
        this.onWarmupCompleted = tdsListRowV1View;
        this.onExtraCallbackWithResult = lottieAnimationView;
        this.IAuthTabCallbackStub = scrollView;
        this.asBinder = textField;
        this.IAuthTabCallbackDefault = tdsTopV1View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static GetTSANonce onNavigationEvent(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        LinearLayoutCompat linearLayoutCompatOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TextField textFieldOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.button_alternative;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixed_bottom_cta))) != null && (linearLayoutCompatOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input_otp_view))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.list_row_account_info))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie_otp_verification_status))) != null) {
            i = R.id.scroll_view;
            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (scrollView != null && (textFieldOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text_field_otp_input))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_verification_status))) != null) {
                return new GetTSANonce((ConstraintLayout) view, tdsButtonV1ViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, linearLayoutCompatOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, scrollView, textFieldOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
