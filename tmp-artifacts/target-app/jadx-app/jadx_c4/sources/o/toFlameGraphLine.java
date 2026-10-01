package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class toFlameGraphLine implements SearchBarKtExternalSyntheticLambda5 {
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    public final TdsBadgeV1View IAuthTabCallback;
    public final Typography5 IAuthTabCallbackDefault;
    public final FrameLayout IAuthTabCallbackStub;
    public final FrameLayout IAuthTabCallbackStubProxy;
    public final TdsImageView IAuthTabCallback_Parcel;
    private final FrameLayout ICustomTabsCallback;
    public final com.airbnb.lottie.LottieAnimationView access000;
    public final TdsRollingNumberV1View access100;
    public final ConstraintLayout asBinder;
    public final Typography7 asInterface;
    public final TdsRollingNumberV1View getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final Guideline onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final access700 onTransact;
    public final Guideline onWarmupCompleted;
    public final sampleInterval readTypedObject;

    public /* synthetic */ View getRoot() {
        FrameLayout frameLayoutOnExtraCallback;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            frameLayoutOnExtraCallback = onExtraCallback();
            int i3 = 46 / 0;
        } else {
            frameLayoutOnExtraCallback = onExtraCallback();
        }
        int i4 = extraCallbackWithResult + 17;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayoutOnExtraCallback;
        }
        throw null;
    }

    private toFlameGraphLine(@NonNull FrameLayout frameLayout, @NonNull TdsBadgeV1View tdsBadgeV1View, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull TdsImageView tdsImageView, @NonNull LinearLayout linearLayout, @NonNull Typography5 typography5, @NonNull Typography7 typography7, @NonNull access700 access700Var, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull TdsRollingNumberV1View tdsRollingNumberV1View, @NonNull TdsImageView tdsImageView2, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull FrameLayout frameLayout3, @NonNull TdsRollingNumberV1View tdsRollingNumberV1View2, @NonNull sampleInterval sampleinterval) {
        this.ICustomTabsCallback = frameLayout;
        this.IAuthTabCallback = tdsBadgeV1View;
        this.onWarmupCompleted = guideline;
        this.onExtraCallbackWithResult = guideline2;
        this.onExtraCallback = tdsImageView;
        this.onNavigationEvent = linearLayout;
        this.IAuthTabCallbackDefault = typography5;
        this.asInterface = typography7;
        this.onTransact = access700Var;
        this.IAuthTabCallbackStub = frameLayout2;
        this.asBinder = constraintLayout;
        this.access100 = tdsRollingNumberV1View;
        this.IAuthTabCallback_Parcel = tdsImageView2;
        this.access000 = lottieAnimationView;
        this.IAuthTabCallbackStubProxy = frameLayout3;
        this.getInterfaceDescriptor = tdsRollingNumberV1View2;
        this.readTypedObject = sampleinterval;
    }

    public FrameLayout onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 53;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = this.ICustomTabsCallback;
        int i5 = i2 + 97;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return frameLayout;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[PHI: r3
      0x0086: PHI (r3v11 android.view.View) = (r3v10 android.view.View), (r3v24 android.view.View) binds: [B:24:0x0084, B:21:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[PHI: r3
      0x00bd: PHI (r3v17 im.toss.tds.view.component.atom.image.TdsImageView) = (r3v16 im.toss.tds.view.component.atom.image.TdsImageView), (r3v23 im.toss.tds.view.component.atom.image.TdsImageView) binds: [B:35:0x00c8, B:32:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb A[PHI: r1
      0x00fb: PHI (r1v5 android.widget.FrameLayout) = (r1v4 android.widget.FrameLayout), (r1v9 android.widget.FrameLayout) binds: [B:45:0x00f9, B:42:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static toFlameGraphLine onNavigationEvent(@NonNull View view) {
        Guideline guidelineOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        View viewOnNavigationEvent;
        TdsRollingNumberV1View tdsRollingNumberV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        FrameLayout frameLayout;
        View viewOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = R.id.badge_view;
        TdsBadgeV1View tdsBadgeV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsBadgeV1ViewOnNavigationEvent != null && (guidelineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.center_guideline))) != null) {
            int i3 = extraCallbackWithResult + 21;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.center_guideline2);
                throw null;
            }
            i2 = R.id.center_guideline2;
            Guideline guidelineOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (guidelineOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.credit_bureau_arrow))) != null) {
                i2 = R.id.credit_bureau_layout;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (linearLayout != null) {
                    int i4 = extraCallbackWithResult + 93;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    i2 = R.id.credit_bureau_text_view;
                    Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (typography5OnNavigationEvent != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.info_text_view))) != null) {
                        int i6 = extraCallback + 19;
                        extraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            i2 = R.id.neo_badge_layout;
                            viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            int i7 = 33 / 0;
                            if (viewOnNavigationEvent != null) {
                                access700 access700VarOnExtraCallback = access700.onExtraCallback(viewOnNavigationEvent);
                                FrameLayout frameLayout2 = (FrameLayout) view;
                                i2 = R.id.score_layout;
                                ConstraintLayout constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                if (constraintLayoutOnNavigationEvent != null && (tdsRollingNumberV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.score_text_view))) != null) {
                                    int i8 = extraCallbackWithResult + 5;
                                    extraCallback = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        i2 = R.id.second_background_ring;
                                        tdsImageViewOnNavigationEvent2 = (TdsImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        int i9 = 47 / 0;
                                        if (tdsImageViewOnNavigationEvent2 != null) {
                                            TdsImageView tdsImageView = tdsImageViewOnNavigationEvent2;
                                            i2 = R.id.second_ring;
                                            com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                            if (lottieAnimationViewOnNavigationEvent != null) {
                                                int i10 = extraCallback + 9;
                                                extraCallbackWithResult = i10 % 128;
                                                if (i10 % 2 == 0) {
                                                    i2 = R.id.second_ring_layout;
                                                    frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                    int i11 = 27 / 0;
                                                    if (frameLayout != null) {
                                                        FrameLayout frameLayout3 = frameLayout;
                                                        i2 = R.id.second_rolling_number;
                                                        TdsRollingNumberV1View tdsRollingNumberV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                        if (tdsRollingNumberV1ViewOnNavigationEvent2 != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.view_credit_score_ring_group))) != null) {
                                                            return new toFlameGraphLine(frameLayout2, tdsBadgeV1ViewOnNavigationEvent, guidelineOnNavigationEvent, guidelineOnNavigationEvent2, tdsImageViewOnNavigationEvent, linearLayout, typography5OnNavigationEvent, typography7OnNavigationEvent, access700VarOnExtraCallback, frameLayout2, constraintLayoutOnNavigationEvent, tdsRollingNumberV1ViewOnNavigationEvent, tdsImageView, lottieAnimationViewOnNavigationEvent, frameLayout3, tdsRollingNumberV1ViewOnNavigationEvent2, sampleInterval.onWarmupCompleted(viewOnNavigationEvent2));
                                                        }
                                                    }
                                                } else {
                                                    i2 = R.id.second_ring_layout;
                                                    frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                                    if (frameLayout != null) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = R.id.second_background_ring;
                                        tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                                        if (tdsImageViewOnNavigationEvent2 != null) {
                                        }
                                    }
                                }
                            }
                        } else {
                            i2 = R.id.neo_badge_layout;
                            viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                            if (viewOnNavigationEvent != null) {
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
