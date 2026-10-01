package o;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.attachAppLovinSdk;
import o.enableAnrReporting;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class enableAnrReporting {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface;
    private Rect IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final View IAuthTabCallbackStub;
    private Rect asBinder;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Function0<Unit> onTransact;
    private final Lazy onWarmupCompleted;

    public static /* synthetic */ View IAuthTabCallback(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {enableanrreporting};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = (View) onNavigationEvent(iIAuthTabCallback4, iIAuthTabCallback, 250437371, iIAuthTabCallback3, iIAuthTabCallback2, -250437370, objArr);
        int i4 = asInterface + 107;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        enableAnrReporting enableanrreporting = (enableAnrReporting) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(enableanrreporting);
        }
        onTransact(enableanrreporting);
        throw null;
    }

    public static /* synthetic */ View onExtraCallback(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View viewIAuthTabCallbackStub = IAuthTabCallbackStub(enableanrreporting);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = asInterface + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return viewIAuthTabCallbackStub;
    }

    public static /* synthetic */ View onExtraCallbackWithResult(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View viewAsBinder = asBinder(enableanrreporting);
        int i4 = IAuthTabCallbackStubProxy + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return viewAsBinder;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i2);
        int i10 = (~i2) | (~((~i6) | i3));
        int i11 = (~(i2 | i6)) | (~(i7 | i2)) | (~i8);
        int i12 = i3 + i6 + i5 + ((-953487067) * i4) + ((-1992133889) * i);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i5) + ((-1703411712) * i4) + (1961361408 * i) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i5 * 272662391) + (i4 * 2077717299) + (i * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        enableAnrReporting enableanrreporting = (enableAnrReporting) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {enableanrreporting, valueAnimator};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1780921565, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1780921563, objArr2);
            throw null;
        }
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1780921565, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, -1780921563, objArr2);
        int i4 = asInterface + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(enableAnrReporting enableanrreporting, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(enableanrreporting, attachapplovinsdk);
        int i4 = IAuthTabCallbackStubProxy + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ ValueAnimator onWarmupCompleted(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimatorIAuthTabCallbackDefault = IAuthTabCallbackDefault(enableanrreporting);
        int i4 = asInterface + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return valueAnimatorIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(enableAnrReporting enableanrreporting, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(enableanrreporting, attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 69;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(enableAnrReporting enableanrreporting, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(enableanrreporting, valueAnimator);
        int i4 = asInterface + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public enableAnrReporting(@NotNull View view, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackStub = view;
        this.onTransact = function0;
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                View viewIAuthTabCallback = enableAnrReporting.IAuthTabCallback(this.f$0);
                int i4 = onWarmupCompleted + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                enableAnrReporting enableanrreporting = this.f$0;
                if (i3 != 0) {
                    return enableAnrReporting.onExtraCallbackWithResult(enableanrreporting);
                }
                enableAnrReporting.onExtraCallbackWithResult(enableanrreporting);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                View viewOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    viewOnExtraCallback = enableAnrReporting.onExtraCallback(this.f$0);
                    int i3 = 88 / 0;
                } else {
                    viewOnExtraCallback = enableAnrReporting.onExtraCallback(this.f$0);
                }
                int i4 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return viewOnExtraCallback;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ValueAnimator valueAnimatorOnWarmupCompleted = enableAnrReporting.onWarmupCompleted(this.f$0);
                if (i3 != 0) {
                    int i4 = 1 / 0;
                }
                return valueAnimatorOnWarmupCompleted;
            }
        });
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                runOnUiThreadDelayed runonuithreaddelayed;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    runonuithreaddelayed = (runOnUiThreadDelayed) enableAnrReporting.onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -713545997, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 713546001, objArr);
                    int i3 = 55 / 0;
                } else {
                    Object[] objArr2 = {this.f$0};
                    int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    runonuithreaddelayed = (runOnUiThreadDelayed) enableAnrReporting.onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, -713545997, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, 713546001, objArr2);
                }
                int i4 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return runonuithreaddelayed;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.asBinder = new Rect();
        this.IAuthTabCallback = new Rect();
    }

    private final View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object value = this.onWarmupCompleted.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            obj.hashCode();
            throw null;
        }
        Object value2 = this.onWarmupCompleted.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        View view = (View) value2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        enableAnrReporting enableanrreporting = (enableAnrReporting) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View view = enableanrreporting.IAuthTabCallbackStub;
        int i4 = R.id.tds_menu_bg_blur_container;
        if (i3 != 0) {
            return view.findViewById(i4);
        }
        view.findViewById(i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final View onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View view = (View) this.onExtraCallback.getValue();
        int i4 = asInterface + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return view;
    }

    private static final View asBinder(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = enableanrreporting.IAuthTabCallbackStub.findViewById(R.id.tds_menu_bg_blur);
        int i4 = asInterface + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    private final View onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        View view = (View) value;
        int i4 = IAuthTabCallbackStubProxy + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    private static final View IAuthTabCallbackStub(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        View view = enableanrreporting.IAuthTabCallbackStub;
        if (i3 != 0) {
            view.findViewById(R.id.tds_menu_content);
            throw null;
        }
        View viewFindViewById = view.findViewById(R.id.tds_menu_content);
        int i4 = asInterface + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return viewFindViewById;
    }

    private final ValueAnimator IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ValueAnimator valueAnimator = (ValueAnimator) this.IAuthTabCallbackDefault.getValue();
        int i3 = asInterface + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return valueAnimator;
        }
        obj.hashCode();
        throw null;
    }

    private static final ValueAnimator IAuthTabCallbackDefault(final enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorIAuthTabCallback_Parcel = ((Rally) RallysKt.onWarmupCompleted(new Object[]{enableanrreporting.IAuthTabCallbackStub, isMuted.asBinder(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()), Float.valueOf(1.0f), Float.valueOf(0.0f), (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)).IAuthTabCallback_Parcel();
        valueAnimatorIAuthTabCallback_Parcel.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 29;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                enableAnrReporting.onWarmupCompleted(this.f$0, valueAnimator);
                int i5 = onWarmupCompleted + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStubProxy + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return valueAnimatorIAuthTabCallback_Parcel;
    }

    private static final void onExtraCallback(enableAnrReporting enableanrreporting, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        enableanrreporting.onExtraCallbackWithResult();
        enableanrreporting.onExtraCallback().setScaleX(enableanrreporting.IAuthTabCallbackStub.getScaleX());
        enableanrreporting.onExtraCallback().setScaleY(enableanrreporting.IAuthTabCallbackStub.getScaleY());
        if (enableanrreporting.IAuthTabCallbackStub.getScaleX() < 0.1f) {
            int i4 = IAuthTabCallbackStubProxy + 89;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            enableanrreporting.onTransact.invoke();
        }
    }

    private final runOnUiThreadDelayed IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onNavigationEvent.getValue();
        if (i3 != 0) {
            return (runOnUiThreadDelayed) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final runOnUiThreadDelayed onTransact(enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        View viewOnWarmupCompleted = enableanrreporting.onWarmupCompleted();
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        AppLovinSdkSettings appLovinSdkSettingsOnWarmupCompleted = appLovinSdkSettings.onWarmupCompleted(deprecated_certificatepinner.onNavigationEvent());
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{viewOnWarmupCompleted, isMuted.onNavigationEvent(appLovinSdkSettingsOnWarmupCompleted, fValueOf, fValueOf2, (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{enableanrreporting.onExtraCallback(), isMuted.onNavigationEvent(new AppLovinSdkSettings().onWarmupCompleted(deprecated_certificatepinner.onNavigationEvent()), fValueOf, fValueOf2, (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 3;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (Math.abs(this.IAuthTabCallback.left >> this.asBinder.left) >= Math.abs(this.IAuthTabCallback.right >> this.asBinder.right)) {
                return 1.0f;
            }
        } else if (Math.abs(this.IAuthTabCallback.left - this.asBinder.left) >= Math.abs(this.IAuthTabCallback.right - this.asBinder.right)) {
            return 1.0f;
        }
        int i3 = asInterface + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return 0.0f;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        enableAnrReporting enableanrreporting = (enableAnrReporting) objArr[0];
        int i = 2 % 2;
        int iCenterY = enableanrreporting.IAuthTabCallback.centerY();
        Rect rect = enableanrreporting.asBinder;
        if (rect.top < iCenterY) {
            int i2 = asInterface + 5;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        boolean z2 = rect.bottom > iCenterY;
        if (z && z2) {
            return Float.valueOf((iCenterY - r3) / rect.height());
        }
        return !(z ^ true) ? Float.valueOf(1.0f) : Float.valueOf(0.0f);
    }

    private static final Unit IAuthTabCallback(enableAnrReporting enableanrreporting, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(enableanrreporting.asInterface());
            attachapplovinsdk.onExtraCallbackWithResult(enableanrreporting.asInterface());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(enableanrreporting.asInterface());
        attachapplovinsdk.onExtraCallbackWithResult(enableanrreporting.asInterface());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AppLovinSdkSettings onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, final enableAnrReporting enableanrreporting) {
        int i = 2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsAccess000 = isMuted.access000(isMuted.asInterface(appLovinSdkSettings.onWarmupCompleted(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()), (Float) null, (Float) null, new Function1() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = enableAnrReporting.onNavigationEvent(this.f$0, (attachAppLovinSdk) obj);
                int i5 = onExtraCallback + 19;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 44 / 0;
                }
                return unitOnNavigationEvent;
            }
        }, 3, (Object) null), (Float) null, (Float) null, new Function1() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = enableAnrReporting.onWarmupCompleted(this.f$0, (attachAppLovinSdk) obj);
                int i5 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return appLovinSdkSettingsAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(enableAnrReporting enableanrreporting, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        attachapplovinsdk.IAuthTabCallback(((Float) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -207425422, iIAuthTabCallback3, iIAuthTabCallback2, 207425422, new Object[]{enableanrreporting})).floatValue());
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        attachapplovinsdk.onExtraCallbackWithResult(((Float) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, -207425422, iIAuthTabCallback6, iIAuthTabCallback5, 207425422, new Object[]{enableanrreporting})).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 113;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        enableAnrReporting enableanrreporting = (enableAnrReporting) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            enableanrreporting.onExtraCallbackWithResult();
            return null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        enableanrreporting.onExtraCallbackWithResult();
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull Rect rect, @NotNull Rect rect2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(rect2, "");
        this.asBinder = rect;
        this.IAuthTabCallback = rect2;
        View view = this.IAuthTabCallbackStub;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(new AppLovinSdkSettings(), this);
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ValueAnimator valueAnimatorIAuthTabCallback_Parcel = ((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.asBinder(appLovinSdkSettingsOnExtraCallbackWithResult, fValueOf, fValueOf2, (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)).IAuthTabCallback_Parcel();
        valueAnimatorIAuthTabCallback_Parcel.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.menu.TdsMenuAnimator$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 113;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, valueAnimator};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                enableAnrReporting.onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1721937535, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1721937532, objArr);
                int i5 = onExtraCallback + 27;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        valueAnimatorIAuthTabCallback_Parcel.start();
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{onExtraCallback(), isMuted.onNavigationEvent(onExtraCallbackWithResult(new AppLovinSdkSettings(), this), fValueOf, fValueOf2, (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{onWarmupCompleted(), isMuted.onNavigationEvent(onExtraCallbackWithResult(new AppLovinSdkSettings(), this), fValueOf, fValueOf2, (Function1) null, 4, (Object) null).onNavigationEvent(), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        int i2 = asInterface + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (IAuthTabCallbackDefault().isRunning()) {
            return;
        }
        int i2 = asInterface + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
            if (IAuthTabCallback().postMessage()) {
                return;
            }
        } else if (IAuthTabCallback().postMessage()) {
            return;
        }
        IAuthTabCallbackDefault().start();
        isFireOS.onExtraCallbackWithResult(IAuthTabCallback(), false, 1, (Object) null);
        int i4 = asInterface + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ runOnUiThreadDelayed onNavigationEvent(enableAnrReporting enableanrreporting) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (runOnUiThreadDelayed) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -713545997, iIAuthTabCallback3, iIAuthTabCallback2, 713546001, new Object[]{enableanrreporting});
    }

    public static /* synthetic */ void IAuthTabCallback(enableAnrReporting enableanrreporting, ValueAnimator valueAnimator) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1721937535, iIAuthTabCallback3, iIAuthTabCallback2, -1721937532, new Object[]{enableanrreporting, valueAnimator});
    }

    private static final View asInterface(enableAnrReporting enableanrreporting) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (View) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 250437371, iIAuthTabCallback3, iIAuthTabCallback2, -250437370, new Object[]{enableanrreporting});
    }

    private final float IAuthTabCallbackStub() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Float) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, -207425422, iIAuthTabCallback3, iIAuthTabCallback2, 207425422, new Object[]{this})).floatValue();
    }

    private static final void onNavigationEvent(enableAnrReporting enableanrreporting, ValueAnimator valueAnimator) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1780921565, iIAuthTabCallback3, iIAuthTabCallback2, -1780921563, new Object[]{enableanrreporting, valueAnimator});
    }
}
