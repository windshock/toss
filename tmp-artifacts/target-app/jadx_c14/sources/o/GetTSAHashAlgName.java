package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.CodeVerificationView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTSAHashAlgName implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography4 IAuthTabCallback;
    public final FrameLayout IAuthTabCallbackDefault;
    public final TdsButtonV1View IAuthTabCallbackStub;
    private final ScrollView access000;
    public final SubTypography11 access100;
    public final TdsTextButtonV0View asBinder;
    public final Typography6 asInterface;
    public final Typography7 onExtraCallback;
    public final CodeVerificationView onExtraCallbackWithResult;
    public final FrameLayout onNavigationEvent;
    public final LinearLayout onTransact;
    public final TdsButtonV1View onWarmupCompleted;

    private GetTSAHashAlgName(@NonNull ScrollView scrollView, @NonNull FrameLayout frameLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull CodeVerificationView codeVerificationView, @NonNull Typography7 typography7, @NonNull Typography4 typography4, @NonNull Typography6 typography6, @NonNull LinearLayout linearLayout, @NonNull TdsButtonV1View tdsButtonV1View2, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull FrameLayout frameLayout2, @NonNull SubTypography11 subTypography11) {
        this.access000 = scrollView;
        this.onNavigationEvent = frameLayout;
        this.onWarmupCompleted = tdsButtonV1View;
        this.onExtraCallbackWithResult = codeVerificationView;
        this.onExtraCallback = typography7;
        this.IAuthTabCallback = typography4;
        this.asInterface = typography6;
        this.onTransact = linearLayout;
        this.IAuthTabCallbackStub = tdsButtonV1View2;
        this.asBinder = tdsTextButtonV0View;
        this.IAuthTabCallbackDefault = frameLayout2;
        this.access100 = subTypography11;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.access000;
    }

    public static GetTSAHashAlgName onExtraCallbackWithResult(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        CodeVerificationView codeVerificationViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        Typography4 typography4OnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent2;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        SubTypography11 subTypography11OnNavigationEvent;
        int i = R.id.buttonLayout;
        FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (frameLayout != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.callArsButton))) != null && (codeVerificationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.codeVerificationView))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideSubText))) != null && (typography4OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideText))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.helpTextButton))) != null) {
            i = R.id.otpLayout;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsButtonV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.reportArsButton))) != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.restartVerificationButton))) != null) {
                i = R.id.subTextLayout;
                FrameLayout frameLayout2 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (frameLayout2 != null && (subTypography11OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.warningText))) != null) {
                    return new GetTSAHashAlgName((ScrollView) view, frameLayout, tdsButtonV1ViewOnNavigationEvent, codeVerificationViewOnNavigationEvent, typography7OnNavigationEvent, typography4OnNavigationEvent, typography6OnNavigationEvent, linearLayout, tdsButtonV1ViewOnNavigationEvent2, tdsTextButtonV0ViewOnNavigationEvent, frameLayout2, subTypography11OnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
