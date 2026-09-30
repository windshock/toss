package im.toss.uikit.onboarding;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.onboarding.SmsGradientOverlayView$;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkSettings;
import o.M_;
import o.convertListToWritableArray;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.readIntokhttp;
import o.setHeadersokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SmsGradientOverlayView extends View {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallback = 8;
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private float IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final Rally IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final Lazy access100;
    private final float[] asBinder;
    private Paint asInterface;
    private final Lazy getInterfaceDescriptor;
    private final Lazy onExtraCallback;
    private double onExtraCallbackWithResult;
    private int[] onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    static {
        int i = ICustomTabsCallback + 97;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsGradientOverlayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsGradientOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Path IAuthTabCallback(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel(smsGradientOverlayView);
            throw null;
        }
        Path pathIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(smsGradientOverlayView);
        int i3 = readTypedObject + 55;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return pathIAuthTabCallback_Parcel;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Path IAuthTabCallbackDefault(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Path interfaceDescriptor = getInterfaceDescriptor(smsGradientOverlayView);
        int i4 = extraCallbackWithResult + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ float onExtraCallback(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        float fAccess100 = access100(smsGradientOverlayView);
        int i4 = readTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fAccess100;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(smsGradientOverlayView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallbackStub = IAuthTabCallbackStub(smsGradientOverlayView);
        int i3 = extraCallbackWithResult + 67;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return fIAuthTabCallbackStub;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i4);
        int i8 = i3 | i7;
        int i9 = (~(i4 | (~i3))) | i5;
        int i10 = i5 + i3 + i6 + ((-1932811043) * i2) + (1521317780 * i);
        int i11 = i10 * i10;
        int i12 = ((i5 * (-919556932)) - 154402816) + ((-919556932) * i3) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i6) + ((-2098724864) * i2) + ((-1398800384) * i) + ((-1444151296) * i11);
        int i13 = (i5 * 1794637580) + 2133191799 + (i3 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i6 * 1794637741) + (i2 * (-1844343719)) + (i * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        if (i14 == 1) {
            return onExtraCallback(objArr);
        }
        if (i14 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i14 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i14 == 4) {
            return onNavigationEvent(objArr);
        }
        SmsGradientOverlayView smsGradientOverlayView = (SmsGradientOverlayView) objArr[0];
        int i15 = 2 % 2;
        int i16 = readTypedObject + 39;
        extraCallbackWithResult = i16 % 128;
        int i17 = i16 % 2;
        float fOnTransact = onTransact(smsGradientOverlayView);
        int i18 = readTypedObject + 83;
        extraCallbackWithResult = i18 % 128;
        int i19 = i18 % 2;
        return Float.valueOf(fOnTransact);
    }

    public static /* synthetic */ RectF onNavigationEvent(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        RectF rectF = (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 1815662599, iIAuthTabCallback, -1815662598, iIAuthTabCallback2);
        int i4 = readTypedObject + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return rectF;
        }
        throw null;
    }

    public static /* synthetic */ RectF onWarmupCompleted(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RectF rectFAsInterface = asInterface(smsGradientOverlayView);
        int i4 = extraCallbackWithResult + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return rectFAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SmsGradientOverlayView smsGradientOverlayView = (SmsGradientOverlayView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(smsGradientOverlayView, fFloatValue);
        int i4 = readTypedObject + 15;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ convertListToWritableArray onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        convertListToWritableArray convertlisttowritablearrayIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return convertlisttowritablearrayIAuthTabCallbackStub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsGradientOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallback(configuration)).onWarmupCompleted();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.onNavigationEvent = new int[]{iOnWarmupCompleted, ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onNavigationEvent(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue()};
        this.asBinder = new float[]{0.0f, 1.0f};
        this.IAuthTabCallbackStubProxy = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda0());
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda1(this));
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda2(this));
        this.access000 = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda3(this));
        this.access100 = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda4(this));
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        this.IAuthTabCallbackDefault = varyMatches.onNavigationEvent(2, r2);
        this.IAuthTabCallbackStub = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda5(this));
        this.getInterfaceDescriptor = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda6(this));
        this.onTransact = LazyKt__LazyJVMKt.lazy(new SmsGradientOverlayView$.ExternalSyntheticLambda7(this));
        this.IAuthTabCallback_Parcel = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 3000), Float.valueOf(0.0f), Float.valueOf(360.0f), new SmsGradientOverlayView$.ExternalSyntheticLambda8(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), -1, getExtraParameters.Normal, 0, null, null, null, 0, 0L, false, 2032, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SmsGradientOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = readTypedObject;
            int i5 = i4 + 19;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 83;
            extraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final convertListToWritableArray asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackStubProxy.getValue();
        if (i3 != 0) {
            return (convertListToWritableArray) value;
        }
        throw null;
    }

    private static final convertListToWritableArray IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            convertListToWritableArray.Companion.onNavigationEvent((int) M_.onExtraCallback.asBinder());
            throw null;
        }
        convertListToWritableArray convertlisttowritablearrayOnNavigationEvent = convertListToWritableArray.Companion.onNavigationEvent((int) M_.onExtraCallback.asBinder());
        int i3 = extraCallbackWithResult + 15;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return convertlisttowritablearrayOnNavigationEvent;
    }

    private final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onWarmupCompleted.getValue()).floatValue();
        int i4 = extraCallbackWithResult + 99;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float onTransact(SmsGradientOverlayView smsGradientOverlayView) {
        float fOnNavigationEvent;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int width = smsGradientOverlayView.asInterface().getTextInputBoxSize().getWidth();
            DisplayMetrics displayMetrics = smsGradientOverlayView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            fOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(width), displayMetrics);
            int i3 = 74 / 0;
        } else {
            int width2 = smsGradientOverlayView.asInterface().getTextInputBoxSize().getWidth();
            DisplayMetrics displayMetrics2 = smsGradientOverlayView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            fOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(width2), displayMetrics2);
        }
        int i4 = extraCallbackWithResult + 29;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float IAuthTabCallbackStub(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int height = smsGradientOverlayView.asInterface().getTextInputBoxSize().getHeight();
            Intrinsics.checkNotNullExpressionValue(smsGradientOverlayView.getResources().getDisplayMetrics(), "");
            return varyMatches.onNavigationEvent(Integer.valueOf(height), r3);
        }
        int height2 = smsGradientOverlayView.asInterface().getTextInputBoxSize().getHeight();
        Intrinsics.checkNotNullExpressionValue(smsGradientOverlayView.getResources().getDisplayMetrics(), "");
        int i3 = 40 / 0;
        return varyMatches.onNavigationEvent(Integer.valueOf(height2), r3);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SmsGradientOverlayView smsGradientOverlayView = (SmsGradientOverlayView) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) smsGradientOverlayView.onExtraCallback.getValue();
        if (i3 != 0) {
            return Float.valueOf(number.floatValue());
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float access100(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int borderRadius = smsGradientOverlayView.asInterface().getTextInputSize().getBorderRadius();
        DisplayMetrics displayMetrics = smsGradientOverlayView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(borderRadius), displayMetrics);
        int i4 = readTypedObject + 79;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float asBinder() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            fFloatValue = ((Number) this.access000.getValue()).floatValue();
            int i3 = 22 / 0;
        } else {
            fFloatValue = ((Number) this.access000.getValue()).floatValue();
        }
        int i4 = extraCallbackWithResult + 37;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SmsGradientOverlayView smsGradientOverlayView = (SmsGradientOverlayView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        RectF rectF = (RectF) smsGradientOverlayView.access100.getValue();
        int i4 = readTypedObject + 31;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return rectF;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SmsGradientOverlayView smsGradientOverlayView = (SmsGradientOverlayView) objArr[0];
        int i = 2 % 2;
        float fOnNavigationEvent = smsGradientOverlayView.onNavigationEvent();
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        RectF rectF = new RectF(0.0f, 0.0f, fOnNavigationEvent, ((Float) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 728611584, iIAuthTabCallback, -728611580, iIAuthTabCallback2)).floatValue());
        int i2 = readTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return rectF;
    }

    private final RectF onExtraCallback() {
        RectF rectF;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            rectF = (RectF) this.IAuthTabCallbackStub.getValue();
            int i3 = 66 / 0;
        } else {
            rectF = (RectF) this.IAuthTabCallbackStub.getValue();
        }
        int i4 = readTypedObject + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return rectF;
        }
        throw null;
    }

    private static final RectF asInterface(SmsGradientOverlayView smsGradientOverlayView) {
        RectF rectF;
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            rectF = (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 1741280028, iIAuthTabCallback, -1741280026, iIAuthTabCallback2);
            float f = smsGradientOverlayView.IAuthTabCallbackDefault;
            rectF.inset(f, f);
            int i3 = 7 / 0;
        } else {
            int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            rectF = (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback6, 1741280028, iIAuthTabCallback4, -1741280026, iIAuthTabCallback5);
            float f2 = smsGradientOverlayView.IAuthTabCallbackDefault;
            rectF.inset(f2, f2);
        }
        int i4 = extraCallbackWithResult + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return rectF;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Path IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Path path = (Path) this.getInterfaceDescriptor.getValue();
        if (i3 != 0) {
            return path;
        }
        throw null;
    }

    private static final Path IAuthTabCallback_Parcel(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        Path path = new Path();
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        path.addRoundRect((RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 1741280028, iIAuthTabCallback, -1741280026, iIAuthTabCallback2), smsGradientOverlayView.asBinder(), smsGradientOverlayView.asBinder(), Path.Direction.CW);
        int i2 = readTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return path;
    }

    private final Path onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 != 0) {
            return (Path) value;
        }
        int i4 = 44 / 0;
        return (Path) value;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static final Path getInterfaceDescriptor(SmsGradientOverlayView smsGradientOverlayView) {
        int i = 2 % 2;
        Path path = new Path();
        path.addRoundRect(smsGradientOverlayView.onExtraCallback(), smsGradientOverlayView.asBinder(), smsGradientOverlayView.asBinder(), Path.Direction.CW);
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return path;
    }

    private static final Unit onExtraCallbackWithResult(SmsGradientOverlayView smsGradientOverlayView, float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            smsGradientOverlayView.onExtraCallbackWithResult = f;
            smsGradientOverlayView.postInvalidateOnAnimation();
            int i3 = 75 / 0;
            return Unit.INSTANCE;
        }
        smsGradientOverlayView.onExtraCallbackWithResult = f;
        smsGradientOverlayView.postInvalidateOnAnimation();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
        isFireOS.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel, false, 1, (Object) null);
        int i3 = extraCallbackWithResult + 73;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        this.IAuthTabCallback_Parcel.ICustomTabsServiceStub();
        int i4 = readTypedObject + 25;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = readTypedObject + 125;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            super.onMeasure(i, i2);
            int iOnNavigationEvent = (int) onNavigationEvent();
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            setMeasuredDimension(iOnNavigationEvent, (int) ((Float) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3, 728611584, iIAuthTabCallback, -728611580, iIAuthTabCallback2)).floatValue());
            int i5 = extraCallbackWithResult + 39;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
                return;
            }
            return;
        }
        super.onMeasure(i, i2);
        int iOnNavigationEvent2 = (int) onNavigationEvent();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        setMeasuredDimension(iOnNavigationEvent2, (int) ((Float) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback6, 728611584, iIAuthTabCallback4, -728611580, iIAuthTabCallback5)).floatValue());
        throw null;
    }

    public final void setColor(@NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.onNavigationEvent = iArr;
            this.asInterface = null;
            this.IAuthTabCallback_Parcel.ICustomTabsServiceStub();
            invalidate();
            return;
        }
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onNavigationEvent = iArr;
        this.asInterface = null;
        this.IAuthTabCallback_Parcel.ICustomTabsServiceStub();
        invalidate();
        obj.hashCode();
        throw null;
    }

    public final void setLineWidth(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 89;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = f;
        int i5 = i2 + 55;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.asInterface == null) {
            Paint paint = new Paint(1);
            paint.setShader(new LinearGradient(getMeasuredWidth() * (-0.79999995f), getMeasuredHeight() * (-0.79999995f), getMeasuredWidth() * 1.8f, 1.8f * getMeasuredHeight(), this.onNavigationEvent, this.asBinder, Shader.TileMode.CLAMP));
            this.asInterface = paint;
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            RectF rectF = (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1741280028, iIAuthTabCallback, -1741280026, iIAuthTabCallback2);
            float f = this.IAuthTabCallbackDefault;
            rectF.inset(f, f);
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, 0.0f);
        try {
            canvas.clipPath(IAuthTabCallbackDefault());
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(onExtraCallbackWithResult());
                int i3 = readTypedObject + 93;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                canvas.clipPath(onExtraCallbackWithResult(), Region.Op.DIFFERENCE);
            }
            canvas.rotate((float) this.onExtraCallbackWithResult, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float fSqrt = ((float) Math.sqrt(Math.pow(getMeasuredWidth(), 2.0d) + Math.pow(getMeasuredHeight(), 2.0d))) / 2.0f;
            Paint paint2 = this.asInterface;
            Intrinsics.checkNotNull(paint2);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, fSqrt, paint2);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.onboarding.SmsGradientOverlayView.IAuthTabCallback.onExtraCallbackWithResult + 75;
            im.toss.uikit.onboarding.SmsGradientOverlayView.IAuthTabCallback.onNavigationEvent = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            r0 = 72 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != true) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 94 / 0;
            }
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(SmsGradientOverlayView smsGradientOverlayView, float f) {
        Object[] objArr = {smsGradientOverlayView, Float.valueOf(f)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1730358881, iIAuthTabCallback, 1730358884, iIAuthTabCallback2);
    }

    public static /* synthetic */ float asBinder(SmsGradientOverlayView smsGradientOverlayView) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Float) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 1316430137, iIAuthTabCallback, -1316430137, iIAuthTabCallback2)).floatValue();
    }

    private final float IAuthTabCallback() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Float) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3, 728611584, iIAuthTabCallback, -728611580, iIAuthTabCallback2)).floatValue();
    }

    private final RectF onTransact() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3, 1741280028, iIAuthTabCallback, -1741280026, iIAuthTabCallback2);
    }

    private static final RectF IAuthTabCallbackStubProxy(SmsGradientOverlayView smsGradientOverlayView) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (RectF) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{smsGradientOverlayView}, iIAuthTabCallback3, 1815662599, iIAuthTabCallback, -1815662598, iIAuthTabCallback2);
    }
}
