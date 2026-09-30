package o;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.base.transition.icon.ScaleTransitionTargetIconContainer;
import im.toss.base.transition.icon.ScaleTransitionTargetIconFactory;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinSdkSettings;
import o.UtilsKtExternalSyntheticLambda17;
import o.attachAppLovinSdk;
import o.getTriggeredContentUris;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTriggeredContentUris {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final getTriggeredContentUris onNavigationEvent = new getTriggeredContentUris();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 121;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 40 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(ConstraintLayout constraintLayout, View view, float f, float f2, float f3, Function1 function1, float f4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(constraintLayout, view, f, f2, f3, function1, f4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(constraintLayout, view, f, f2, f3, function1, f4);
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return readTypedObject(attachapplovinsdk);
        }
        readTypedObject(attachapplovinsdk);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(attachapplovinsdk);
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitWriteTypedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallback(attachapplovinsdk);
            throw null;
        }
        Unit unitExtraCallback = extraCallback(attachapplovinsdk);
        int i3 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCallback;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        View view = (View) objArr[1];
        View view2 = (View) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        float fFloatValue3 = ((Number) objArr[5]).floatValue();
        float fFloatValue4 = ((Number) objArr[6]).floatValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(constraintLayout, view, view2, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4);
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(attachapplovinsdk);
        int i4 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
        int i8 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(appLovinSdkSettings);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(appLovinSdkSettings);
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 232935902, -232935895, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(attachapplovinsdk);
        }
        IAuthTabCallbackStubProxy(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i3 | i2));
        int i12 = i8 | i3;
        int i13 = (~(i4 | i3)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i3 + i2 + i6 + ((-1468046718) * i5) + (327422179 * i);
        int i16 = i15 * i15;
        int i17 = (677926197 * i3) + 1810235392 + (1154460365 * i2) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i6) + (1933049856 * i5) + (743702528 * i) + (286654464 * i16);
        int i18 = (i3 * (-645773371)) + 280972133 + (i2 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i6 * (-645772719)) + (i5 * 1523302178) + (i * 1475409363) + (i16 * (-1007288320));
        switch (i17 + (i18 * i18 * (-492175360))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i19 = 2 % 2;
                int i20 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                Unit unitAccess000 = access000(attachapplovinsdk);
                int i22 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                return unitAccess000;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConstraintLayout constraintLayout, int i, int i2, int i3, int i4, View view, int i5, int i6, View view2, float f) {
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return onExtraCallback(constraintLayout, i, i2, i3, i4, view, i5, i6, view2, f);
        }
        onExtraCallback(constraintLayout, i, i2, i3, i4, view, i5, i6, view2, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
        int i8 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appLovinSdkSettings);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(attachapplovinsdk);
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallback;
    }

    private getTriggeredContentUris() {
    }

    private static final Unit writeTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 10490;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 300;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(ConstraintLayout constraintLayout, int i, int i2, int i3, int i4, View view, int i5, int i6, View view2, float f) {
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        float scaleX = constraintLayout.getScaleX();
        float f2 = i;
        float f3 = ((i2 - i) * f) + f2;
        float f4 = f3 / 2.0f;
        Intrinsics.checkNotNullExpressionValue(constraintLayout.getContext(), "");
        float f5 = i3;
        float fIAuthTabCallback = ((varyMatches.IAuthTabCallback(Float.valueOf(120.0f), r8) - f5) * f) + f5;
        float f6 = fIAuthTabCallback / f5;
        float f7 = fIAuthTabCallback / f2;
        float f8 = f2 / 2.0f;
        float y = i4 + f8;
        if (view != null) {
            y = view.getY();
        } else {
            f8 = ((i5 / 2.0f) - y) * f;
        }
        float f9 = f5 / 2.0f;
        constraintLayout.setPivotX(f9);
        constraintLayout.setPivotY(f4);
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = null;
        if (constraintLayout instanceof ScaleTransitionTargetIconContainer) {
            int i10 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                scaleTransitionTargetIconContainer.hashCode();
                throw null;
            }
            scaleTransitionTargetIconContainer = (ScaleTransitionTargetIconContainer) constraintLayout;
        } else {
            int i11 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }
        if (scaleTransitionTargetIconContainer != null) {
            int i13 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            scaleTransitionTargetIconContainer.setTransitionVisibleHeight(f3);
        }
        float f10 = 1.0f - scaleX;
        constraintLayout.setTranslationY(((y + f8) - ((f3 * scaleX) / 2.0f)) - (f4 * f10));
        float f11 = i6;
        float f12 = f11 + ((0.0f - f11) * f);
        constraintLayout.setTranslationX(f12 - (f9 * f10));
        view2.setScaleX(f6);
        view2.setScaleY(f7);
        view2.setX(f12 + (((f5 * scaleX) - fIAuthTabCallback) / 2.0f));
        view2.setY(f4 - (fIAuthTabCallback / 2.0f));
        ScaleTransitionTargetIconFactory.IAuthTabCallback(ScaleTransitionTargetIconFactory.onWarmupCompleted, view2, scaleX, null, 4, null);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(ConstraintLayout constraintLayout, View view, View view2, float f, float f2, float f3, float f4) {
        getTriggeredContentUris gettriggeredcontenturis;
        float fOnWarmupCompleted;
        Function1 function1;
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            gettriggeredcontenturis = onNavigationEvent;
            fOnWarmupCompleted = gettriggeredcontenturis.onWarmupCompleted(f4, f, f2, f3);
            function1 = null;
            i = 95;
            obj = null;
        } else {
            gettriggeredcontenturis = onNavigationEvent;
            fOnWarmupCompleted = gettriggeredcontenturis.onWarmupCompleted(f4, f, f2, f3);
            function1 = null;
            i = 32;
            obj = null;
        }
        onExtraCallback(gettriggeredcontenturis, constraintLayout, view, view2, fOnWarmupCompleted, f4, function1, i, obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit readTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final runOnUiThreadDelayed onNavigationEvent(@NotNull final ConstraintLayout constraintLayout, @NotNull final View view, @Nullable View view2, @Nullable final View view3, final int i, final int i2, final int i3, final int i4, @Nullable Integer num, @Nullable Float f, int i5, final int i6, final float f2) {
        int i7 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        float f3 = i5 / i;
        Object[] objArr = {this, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i)};
        final int iIntValue = ((Integer) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1826331214, -1826331214, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())).intValue();
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(0.0f), fValueOf, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 61;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    Unit unit = (Unit) getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1088800736, -1088800730, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{(attachAppLovinSdk) obj}, iOnExtraCallbackWithResult2);
                    int i11 = onNavigationEvent + 93;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 39 / 0;
                    }
                    return unit;
                }
            }), 0, null, 0, Address.onNavigationEvent.asBinder(), null, Boolean.FALSE, 0, 0L, false, 1884, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            int i8 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        deprecated_dns deprecated_dnsVar = new deprecated_dns(480.0d, 45.0d);
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.asBinder(new AppLovinSdkSettings(), fValueOf, Float.valueOf(f3), (Function1) null, 4, (Object) null), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnWarmupCompleted = getTriggeredContentUris.onWarmupCompleted(constraintLayout, i2, iIntValue, i, i4, view3, i6, i3, view, ((Float) obj).floatValue());
                int i13 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        final float fOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(num, f, i, i2);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final float fOnWarmupCompleted = getTriggeredContentAuthorities.onWarmupCompleted(fOnExtraCallbackWithResult, context);
        arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent(appLovinSdkSettings, fOnExtraCallbackWithResult, f2, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr2 = {constraintLayout, view, view3, Float.valueOf(fOnExtraCallbackWithResult), Float.valueOf(fOnWarmupCompleted), Float.valueOf(f2), Float.valueOf(((Float) obj).floatValue())};
                    int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr3 = {constraintLayout, view, view3, Float.valueOf(fOnExtraCallbackWithResult), Float.valueOf(fOnWarmupCompleted), Float.valueOf(f2), Float.valueOf(((Float) obj).floatValue())};
                int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                Unit unit = (Unit) getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -66098356, 66098364, iOnExtraCallbackWithResult3, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr3, iOnExtraCallbackWithResult4);
                int i12 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                return unit;
            }
        }, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitIAuthTabCallbackDefault = getTriggeredContentUris.IAuthTabCallbackDefault((attachAppLovinSdk) obj);
                int i13 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 42 / 0;
                }
                return unitIAuthTabCallbackDefault;
            }
        }), 0, null, 0, deprecated_dnsVar, null, null, 0, 0L, false, 2012, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        return RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
    }

    public final runOnUiThreadDelayed IAuthTabCallback(@NotNull ConstraintLayout constraintLayout, @NotNull View view, @Nullable View view2, int i, int i2, int i3, int i4, @Nullable Integer num, @Nullable Float f, int i5, int i6, float f2, boolean z, @NotNull Function1<? super Float, Unit> function1) {
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Object[] objArr = {this, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, onExtraCallback(this, constraintLayout, view, view2, i, i2, i3, i4, num, f, i5, i6, ((Integer) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1826331214, -1826331214, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2)).intValue(), f2, z, 0.0f, 0.0f, 0.0f, 0.0f, function1, 245760, null), 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent(), (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null);
        int i10 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final runOnUiThreadDelayed IAuthTabCallback(@NotNull ConstraintLayout constraintLayout, @NotNull View view, @Nullable View view2, int i, int i2, int i3, int i4, @Nullable Integer num, @Nullable Float f, int i5, int i6, float f2, boolean z, float f3, float f4, float f5, float f6, @NotNull Function1<? super Float, Unit> function1) {
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Object[] objArr = {this, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i)};
        int iIntValue = ((Integer) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1826331214, -1826331214, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())).intValue();
        float f7 = i2;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, onExtraCallback(constraintLayout, view, view2, i, i2, i3, i4, num, f, i5, i6, iIntValue, f2, z, RangesKt.coerceIn(f3, f7, RangesKt.coerceAtLeast(iIntValue, f7)), f5, f6, f4, function1), 0, (getExtraParameters) null, 0, deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent(), (Integer) null, Boolean.FALSE, 0, 0L, false, 3769, (Object) null);
        int i10 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 97 / 0;
        }
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer;
        TdsRoundLayout tdsRoundLayout = (TdsRoundLayout) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        float fFloatValue2 = ((Number) objArr[6]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tdsRoundLayout, "");
        tdsRoundLayout.setScaleX(fFloatValue);
        tdsRoundLayout.setScaleY(fFloatValue);
        tdsRoundLayout.setTranslationX((iIntValue2 - iIntValue) / 2.0f);
        float f = iIntValue3;
        float f2 = f / 2.0f;
        tdsRoundLayout.setTranslationY((fFloatValue - 1.0f) * f2);
        tdsRoundLayout.setPivotX(iIntValue / 2.0f);
        tdsRoundLayout.setPivotY(f2);
        tdsRoundLayout.setAlpha(1.0f);
        tdsRoundLayout.setRadius(fFloatValue2 / fFloatValue);
        if (!(!(tdsRoundLayout instanceof ScaleTransitionTargetIconContainer))) {
            scaleTransitionTargetIconContainer = (ScaleTransitionTargetIconContainer) tdsRoundLayout;
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            scaleTransitionTargetIconContainer = null;
        }
        if (scaleTransitionTargetIconContainer != null) {
            int i6 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            scaleTransitionTargetIconContainer.setTransitionVisibleHeight(f);
            if (i7 != 0) {
                throw null;
            }
        }
        int i8 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    static /* synthetic */ List onExtraCallback(getTriggeredContentUris gettriggeredcontenturis, ConstraintLayout constraintLayout, View view, View view2, int i, int i2, int i3, int i4, Integer num, Float f, int i5, int i6, int i7, float f2, boolean z, float f3, float f4, float f5, float f6, Function1 function1, int i8, Object obj) {
        Integer num2;
        Float f7;
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult;
        int i11 = i10 + 105;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        Object obj2 = null;
        if ((i8 & 128) != 0) {
            int i13 = i10 + 41;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i8 & 256) != 0) {
            int i15 = i10 + 15;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            f7 = null;
        } else {
            f7 = f;
        }
        List<Rally> listOnExtraCallback = gettriggeredcontenturis.onExtraCallback(constraintLayout, view, view2, i, i2, i3, i4, num2, f7, i5, i6, i7, f2, z, (i8 & 16384) != 0 ? i7 : f3, (32768 & i8) != 0 ? i5 / 2.0f : f4, (65536 & i8) != 0 ? i6 / 2.0f : f5, (i8 & 131072) != 0 ? f2 : f6, function1);
        int i16 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i16 % 128;
        if (i16 % 2 == 0) {
            return listOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit access100(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onExtraCallback(ConstraintLayout constraintLayout, View view, float f, float f2, float f3, Function1 function1, float f4) {
        getTriggeredContentUris gettriggeredcontenturis;
        float fOnWarmupCompleted;
        View view2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            gettriggeredcontenturis = onNavigationEvent;
            fOnWarmupCompleted = gettriggeredcontenturis.onWarmupCompleted(f4, f, f2, f3);
            view2 = null;
            i = 5;
        } else {
            gettriggeredcontenturis = onNavigationEvent;
            fOnWarmupCompleted = gettriggeredcontenturis.onWarmupCompleted(f4, f, f2, f3);
            view2 = null;
            i = 4;
        }
        onExtraCallback(gettriggeredcontenturis, constraintLayout, view, view2, fOnWarmupCompleted, f4, function1, i, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(9075);
            i = 34;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(200);
            i = 50;
        }
        attachapplovinsdk.onExtraCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 0;
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallback());
        attachapplovinsdk.onExtraCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(0.8f), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = getTriggeredContentUris.onExtraCallbackWithResult((attachAppLovinSdk) obj);
                int i5 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null);
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.0f), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnTransact = getTriggeredContentUris.onTransact((attachAppLovinSdk) obj);
                int i5 = onExtraCallbackWithResult + 61;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnTransact;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory;
        float scaleX;
        Float f5;
        int i5;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
            scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
            scaleX = constraintLayout.getScaleX();
            f5 = null;
            i5 = 2;
        } else {
            onNavigationEvent.IAuthTabCallback(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
            scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
            scaleX = constraintLayout.getScaleX();
            f5 = null;
            i5 = 4;
        }
        ScaleTransitionTargetIconFactory.IAuthTabCallback(scaleTransitionTargetIconFactory, view, scaleX, f5, i5, null);
        return Unit.INSTANCE;
    }

    private static final Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallback());
        attachapplovinsdk.onExtraCallback(200);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(0.8f), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                Unit unit = (Unit) getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 521208939, -521208935, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{(attachAppLovinSdk) obj}, iOnExtraCallbackWithResult2);
                int i5 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.0f), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda16
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                onNavigationEvent = i3 % 128;
                Object obj2 = null;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i3 % 2 == 0) {
                    getTriggeredContentUris.onWarmupCompleted(attachapplovinsdk);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = getTriggeredContentUris.onWarmupCompleted(attachapplovinsdk);
                int i4 = onNavigationEvent + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory;
        float scaleX;
        Float f5;
        int i5;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
            scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
            scaleX = constraintLayout.getScaleX();
            f5 = null;
            i5 = 3;
        } else {
            onNavigationEvent.IAuthTabCallback(constraintLayout, view, i, i2, i3, i4, f, f2, f3, f4);
            scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
            scaleX = constraintLayout.getScaleX();
            f5 = null;
            i5 = 4;
        }
        ScaleTransitionTargetIconFactory.IAuthTabCallback(scaleTransitionTargetIconFactory, view, scaleX, f5, i5, null);
        return Unit.INSTANCE;
    }

    private static final Unit extraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 15220;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final List<Rally> onExtraCallback(final ConstraintLayout constraintLayout, final View view, View view2, final int i, final int i2, final int i3, final int i4, Integer num, Float f, int i5, int i6, int i7, final float f2, boolean z, final float f3, final float f4, final float f5, float f6, final Function1<? super Float, Unit> function1) {
        ArrayList arrayList;
        Float f7;
        Float f8;
        int i8 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        final float fOnExtraCallbackWithResult = onExtraCallbackWithResult(num, f, i, i2);
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final float fOnWarmupCompleted = getTriggeredContentAuthorities.onWarmupCompleted(fOnExtraCallbackWithResult, context);
        float fIAuthTabCallback = IAuthTabCallback(f6, fOnExtraCallbackWithResult, fOnWarmupCompleted, f2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent(new AppLovinSdkSettings(), fIAuthTabCallback, fOnExtraCallbackWithResult, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 101;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                Unit unitIAuthTabCallback = getTriggeredContentUris.IAuthTabCallback(constraintLayout, view, fOnExtraCallbackWithResult, fOnWarmupCompleted, f2, function1, ((Float) obj).floatValue());
                int i12 = IAuthTabCallback + 91;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 37;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                Unit unit = (Unit) getTriggeredContentUris.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 469281171, -469281166, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{(attachAppLovinSdk) obj}, iOnExtraCallbackWithResult2);
                int i12 = onNavigationEvent + 39;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        if (z) {
            arrayList2.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onExtraCallback(new AppLovinSdkSettings(), fValueOf2, fValueOf, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr = {(attachAppLovinSdk) obj};
                    int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    if (i11 == 0) {
                        return (Unit) getTriggeredContentUris.onWarmupCompleted(iOnExtraCallbackWithResult4, 1958355264, -1958355263, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult2);
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            arrayList = arrayList2;
            f7 = fValueOf2;
            f8 = fValueOf;
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -952311307, new Object[]{new AppLovinSdkSettings(), fValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null}, 952311317, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 17;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnWarmupCompleted = getTriggeredContentUris.onWarmupCompleted((AppLovinSdkSettings) obj);
                    int i12 = IAuthTabCallback + 83;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 24 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }), Float.valueOf(f3), Float.valueOf(i2), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        getTriggeredContentUris.onExtraCallbackWithResult(constraintLayout, view, i, i2, i3, i4, f3, f4, f5, ((Float) obj).floatValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = getTriggeredContentUris.onExtraCallbackWithResult(constraintLayout, view, i, i2, i3, i4, f3, f4, f5, ((Float) obj).floatValue());
                    int i11 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 17 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.TRUE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        } else {
            arrayList = arrayList2;
            f7 = fValueOf2;
            f8 = fValueOf;
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 29;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallbackWithResult = getTriggeredContentUris.onExtraCallbackWithResult((AppLovinSdkSettings) obj);
                    if (i11 != 0) {
                        int i12 = 6 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }), Float.valueOf(f3), Float.valueOf(i2), new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 79;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnWarmupCompleted = getTriggeredContentUris.onWarmupCompleted(constraintLayout, view, i, i2, i3, i4, f3, f4, f5, ((Float) obj).floatValue());
                    int i12 = IAuthTabCallback + 9;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnWarmupCompleted;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), (Float) null, f7, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i10 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                    if (i10 % 2 != 0) {
                        getTriggeredContentUris.IAuthTabCallbackStub(attachapplovinsdk);
                        throw null;
                    }
                    Unit unitIAuthTabCallbackStub = getTriggeredContentUris.IAuthTabCallbackStub(attachapplovinsdk);
                    int i11 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 50 / 0;
                    }
                    return unitIAuthTabCallbackStub;
                }
            }, 1, (Object) null), 0, null, 0, null, null, Boolean.TRUE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        }
        if (view2 != null) {
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{view2, isMuted.onExtraCallback(new AppLovinSdkSettings(), f8, f7, new Function1() { // from class: im.toss.base.transition.origin.OriginScaleTransitionAnimator$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 103;
                    onWarmupCompleted = i10 % 128;
                    attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                    if (i10 % 2 == 0) {
                        return getTriggeredContentUris.onExtraCallback(attachapplovinsdk);
                    }
                    getTriggeredContentUris.onExtraCallback(attachapplovinsdk);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }), 0, null, 0, Address.onNavigationEvent.asBinder(), null, Boolean.FALSE, 0, 0L, false, 1884, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            int i9 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return arrayList;
    }

    private static final Unit extraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 13755;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            i = 200;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (iIntValue <= 0) {
            int i5 = i2 + 19;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return Integer.valueOf(RangesKt.coerceAtLeast(iIntValue3, 1));
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) ((iIntValue2 * iIntValue3) / iIntValue), 1);
        int i7 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return Integer.valueOf(iCoerceAtLeast);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float onExtraCallbackWithResult(Integer num, Float f, int i, int i2) {
        int i3 = 2 % 2;
        if (num != null) {
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Float fValueOf = Float.valueOf(num.intValue());
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                int i6 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                float fFloatValue = fValueOf.floatValue();
                int i8 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return fFloatValue;
            }
        }
        if (f == null) {
            return 0.0f;
        }
        float fFloatValue2 = f.floatValue() * Math.min(i, i2);
        int i10 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return fFloatValue2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 float, still in use, count: 2, list:
          (r1v6 float) from 0x0013: INVOKE (r1v6 float) STATIC call: java.lang.Math.abs(float):float A[MD:(float):float (c), WRAPPED] (LINE:443)
          (r1v6 float) from 0x0036: PHI (r1v5 float) = (r1v4 float), (r1v6 float) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final float IAuthTabCallback(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getTriggeredContentUris.onExtraCallbackWithResult
            int r1 = r1 + 123
            int r2 = r1 % 128
            o.getTriggeredContentUris.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 1008981770(0x3c23d70a, float:0.01)
            if (r1 == 0) goto L1c
            float r1 = r8 * r7
            float r3 = java.lang.Math.abs(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L36
            goto L26
        L1c:
            float r1 = r8 - r7
            float r3 = java.lang.Math.abs(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L36
        L26:
            int r5 = o.getTriggeredContentUris.onWarmupCompleted
            int r5 = r5 + 51
            int r7 = r5 % 128
            o.getTriggeredContentUris.onExtraCallbackWithResult = r7
            int r5 = r5 % r0
            if (r5 != 0) goto L35
            r5 = 18
            int r5 = r5 / 0
        L35:
            return r6
        L36:
            float r5 = r5 - r7
            float r5 = r5 / r1
            float r8 = r8 - r6
            r7 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = kotlin.ranges.RangesKt.coerceIn(r5, r7, r0)
            float r8 = r8 * r5
            float r6 = r6 + r8
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTriggeredContentUris.IAuthTabCallback(float, float, float, float):float");
    }

    static /* synthetic */ void onExtraCallback(getTriggeredContentUris gettriggeredcontenturis, ConstraintLayout constraintLayout, View view, View view2, float f, float f2, Function1 function1, int i, Object obj) {
        View view3;
        Function1 function12;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            view3 = null;
        } else {
            view3 = view2;
        }
        if ((i & 32) != 0) {
            int i8 = i4 + 45;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            function12 = null;
        } else {
            function12 = function1;
        }
        gettriggeredcontenturis.onWarmupCompleted(constraintLayout, view, view3, f, f2, function12);
    }

    private final void onWarmupCompleted(ConstraintLayout constraintLayout, View view, View view2, float f, float f2, Function1<? super Float, Unit> function1) {
        int i = 2 % 2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(constraintLayout.getScaleX(), 0.01f);
        TdsRoundLayout tdsRoundLayout = null;
        if (constraintLayout instanceof TdsRoundLayout) {
            int i2 = onExtraCallbackWithResult + 67;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            tdsRoundLayout = (TdsRoundLayout) constraintLayout;
            int i4 = i3 + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (tdsRoundLayout != null) {
            tdsRoundLayout.setRadius(f / fCoerceAtLeast);
        }
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = ScaleTransitionTargetIconFactory.onWarmupCompleted;
        scaleTransitionTargetIconFactory.onWarmupCompleted(view, fCoerceAtLeast, Float.valueOf(f2));
        if (view2 != null) {
            scaleTransitionTargetIconFactory.onWarmupCompleted(view2, 1.0f, Float.valueOf(f2));
            int i6 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (function1 != null) {
            int i8 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            function1.invoke(Float.valueOf(f));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 float, still in use, count: 2, list:
          (r1v6 float) from 0x0013: INVOKE (r1v6 float) STATIC call: java.lang.Math.abs(float):float A[MD:(float):float (c), WRAPPED] (LINE:481)
          (r1v6 float) from 0x0034: PHI (r1v5 float) = (r1v4 float), (r1v6 float) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final float onWarmupCompleted(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getTriggeredContentUris.onWarmupCompleted
            int r1 = r1 + 15
            int r2 = r1 % 128
            o.getTriggeredContentUris.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 1008981770(0x3c23d70a, float:0.01)
            if (r1 != 0) goto L1c
            float r1 = r8 + r6
            float r3 = java.lang.Math.abs(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L34
            goto L26
        L1c:
            float r1 = r8 - r6
            float r3 = java.lang.Math.abs(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L34
        L26:
            int r5 = o.getTriggeredContentUris.onWarmupCompleted
            int r5 = r5 + 35
            int r6 = r5 % 128
            o.getTriggeredContentUris.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L32
            return r7
        L32:
            r5 = 0
            throw r5
        L34:
            float r5 = r5 - r6
            float r5 = r5 / r1
            float r8 = r8 - r7
            r6 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = kotlin.ranges.RangesKt.coerceIn(r5, r6, r0)
            float r8 = r8 * r5
            float r7 = r7 + r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTriggeredContentUris.onWarmupCompleted(float, float, float, float):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            constraintLayout.setPivotY(f4 - 1.0f);
            scaleTransitionTargetIconContainer = constraintLayout instanceof ScaleTransitionTargetIconContainer ? (ScaleTransitionTargetIconContainer) constraintLayout : null;
        } else {
            constraintLayout.setPivotY(f4 / 2.0f);
            if (constraintLayout instanceof ScaleTransitionTargetIconContainer) {
            }
        }
        if (scaleTransitionTargetIconContainer != null) {
            int i7 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                scaleTransitionTargetIconContainer.setTransitionVisibleHeight(f4);
            } else {
                scaleTransitionTargetIconContainer.setTransitionVisibleHeight(f4);
                obj.hashCode();
                throw null;
            }
        }
        Object[] objArr = {this, constraintLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 2047966625, -2047966623, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        View view = (View) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int iIntValue4 = ((Number) objArr[6]).intValue();
        float fFloatValue = ((Number) objArr[7]).floatValue();
        float fFloatValue2 = ((Number) objArr[8]).floatValue();
        float fFloatValue3 = ((Number) objArr[9]).floatValue();
        float fFloatValue4 = ((Number) objArr[10]).floatValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        float f = iIntValue2;
        float fCoerceIn = 1.0f;
        if (fFloatValue != f) {
            fCoerceIn = RangesKt.coerceIn((fFloatValue - fFloatValue4) / (fFloatValue - f), 0.0f, 1.0f);
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        float f2 = iIntValue / 2.0f;
        float f3 = f / 2.0f;
        constraintLayout.setTranslationX((fFloatValue2 + (((iIntValue3 + f2) - fFloatValue2) * fCoerceIn)) - f2);
        float f4 = fFloatValue4 / 2.0f;
        constraintLayout.setTranslationY((fFloatValue3 + (((iIntValue4 + f3) - fFloatValue3) * fCoerceIn)) - f4);
        view.setX(0.0f);
        view.setY(f4 - f3);
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 521208939, -521208935, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1958355264, -1958355263, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 469281171, -469281166, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(ConstraintLayout constraintLayout, View view, View view2, float f, float f2, float f3, float f4) {
        Object[] objArr = {constraintLayout, view, view2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -66098356, 66098364, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1088800736, -1088800730, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 232935902, -232935895, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{attachapplovinsdk}, iOnExtraCallbackWithResult2);
    }

    private final int onExtraCallbackWithResult(int i, int i2, int i3) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1826331214, -1826331214, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2)).intValue();
    }

    private final void asInterface(ConstraintLayout constraintLayout, View view, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        Object[] objArr = {this, constraintLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 2047966625, -2047966623, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2);
    }

    public final void onNavigationEvent(@NotNull TdsRoundLayout tdsRoundLayout, int i, float f, int i2, int i3, float f2) {
        Object[] objArr = {this, tdsRoundLayout, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2)};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 359410846, -359410843, iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2);
    }
}
