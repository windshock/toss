package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.feature.credit.ui.kcbsurvey.R;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class stackUploadThresholdMax implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final Toolbar IAuthTabCallbackStub;
    private final ConstraintLayout asBinder;
    public final TdsImageView onExtraCallback;
    public final ComposeView onExtraCallbackWithResult;
    public final ScrollView onNavigationEvent;
    public final TdsTopV2View onTransact;
    public final AppBarLayout onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        ConstraintLayout constraintLayoutOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            constraintLayoutOnWarmupCompleted = onWarmupCompleted();
            int i3 = 68 / 0;
        } else {
            constraintLayoutOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = asInterface + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayoutOnWarmupCompleted;
        }
        throw null;
    }

    private stackUploadThresholdMax(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsImageView tdsImageView, @NonNull ComposeView composeView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ScrollView scrollView, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.asBinder = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallback = tdsImageView;
        this.onExtraCallbackWithResult = composeView;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = scrollView;
        this.IAuthTabCallbackStub = toolbar;
        this.onTransact = tdsTopV2View;
    }

    public ConstraintLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.asBinder;
        int i5 = i2 + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static stackUploadThresholdMax onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        stackUploadThresholdMax stackuploadthresholdmaxOnNavigationEvent = onNavigationEvent(layoutInflater, null, i2 % 2 != 0);
        int i3 = IAuthTabCallbackDefault + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return stackuploadthresholdmaxOnNavigationEvent;
    }

    public static stackUploadThresholdMax onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_kcb_survey_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = asInterface + 91;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        stackUploadThresholdMax stackuploadthresholdmaxOnExtraCallback = onExtraCallback(viewInflate);
        int i4 = asInterface + 95;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return stackuploadthresholdmaxOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static stackUploadThresholdMax onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.appbar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (appBarLayoutOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.banner_image))) != null) {
            int i3 = asInterface + 81;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.composeView;
            ComposeView composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (composeViewOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.cta))) != null) {
                int i5 = IAuthTabCallbackDefault + 89;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i2 = R.id.scrollView;
                ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (scrollView != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.toolbar))) != null) {
                    int i6 = IAuthTabCallbackDefault + 37;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = R.id.top;
                    TdsTopV2View tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (tdsTopV2ViewOnNavigationEvent != null) {
                        stackUploadThresholdMax stackuploadthresholdmax = new stackUploadThresholdMax((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, composeViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, scrollView, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
                        int i8 = IAuthTabCallbackDefault + 35;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        return stackuploadthresholdmax;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
