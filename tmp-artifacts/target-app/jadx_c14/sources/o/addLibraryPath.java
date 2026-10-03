package o;

import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addLibraryPath implements SearchBarKtExternalSyntheticLambda5 {
    public final View IAuthTabCallback;
    public final ScrollView IAuthTabCallbackDefault;
    public final TextInputLayout IAuthTabCallbackStub;
    private final ConstraintLayout IAuthTabCallbackStubProxy;
    public final TdsButtonV1View asBinder;
    public final TdsButtonV1View asInterface;
    public final TdsTopV2View getInterfaceDescriptor;
    public final TdsTextButtonV0View onExtraCallback;
    public final KeyboardBottomCta onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final Space onTransact;
    public final View onWarmupCompleted;

    private addLibraryPath(@NonNull ConstraintLayout constraintLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull View view, @NonNull View view2, @NonNull TdsImageView tdsImageView, @NonNull TextInputLayout textInputLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsButtonV1View tdsButtonV1View2, @NonNull ScrollView scrollView, @NonNull Space space, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallbackStubProxy = constraintLayout;
        this.onExtraCallbackWithResult = keyboardBottomCta;
        this.onExtraCallback = tdsTextButtonV0View;
        this.onWarmupCompleted = view;
        this.IAuthTabCallback = view2;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallbackStub = textInputLayout;
        this.asBinder = tdsButtonV1View;
        this.asInterface = tdsButtonV1View2;
        this.IAuthTabCallbackDefault = scrollView;
        this.onTransact = space;
        this.getInterfaceDescriptor = tdsTopV2View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStubProxy;
    }

    public static addLibraryPath onExtraCallbackWithResult(@NonNull View view) {
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        View viewOnNavigationEvent;
        View viewOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent;
        TextInputLayout textInputLayoutOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent2;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (keyboardBottomCtaOnNavigationEvent != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.driverLicenseButton))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.driverLicenseButtonBackground))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.driverLicenseButtonBackgroundGradient))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideImageView))) != null && (textInputLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputDate))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.issueDateScrapingBottomButton))) != null && (tdsButtonV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.issueDateScrapingButton))) != null) {
            i = R.id.scrollView;
            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (scrollView != null) {
                i = R.id.space;
                Space space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (space != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                    return new addLibraryPath((ConstraintLayout) view, keyboardBottomCtaOnNavigationEvent, tdsTextButtonV0ViewOnNavigationEvent, viewOnNavigationEvent, viewOnNavigationEvent2, tdsImageViewOnNavigationEvent, textInputLayoutOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent2, scrollView, space, tdsTopV2ViewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
