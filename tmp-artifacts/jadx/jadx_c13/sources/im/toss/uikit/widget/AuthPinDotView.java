package im.toss.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.autopay.R;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.CircleView;
import im.toss.uikit.widget.AuthPinDotView$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1uSDK;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setHasUserConsent;
import o.setTagsokhttp;
import o.setVisitUrl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AuthPinDotView extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static long access000 = -8299831297163836665L;
    private static int getInterfaceDescriptor;
    private runOnUiThreadDelayed IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private ValueAnimator IAuthTabCallbackStub;
    private final Lazy IAuthTabCallback_Parcel;
    private final Lazy access100;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private final AFk1uSDK onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private ValueAnimator onNavigationEvent;
    private runOnUiThreadDelayed onTransact;
    private ViewPropertyAnimator onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthPinDotView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthPinDotView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Interpolator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorAsInterface = asInterface();
        int i4 = IAuthTabCallbackStubProxy + 23;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolatorAsInterface;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, im.toss.uikit.widget.AuthPinDotView] */
    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int iAsInterface;
        int color;
        int iAsInterface2;
        String strIntern;
        String strIntern2;
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = ~i;
        int i12 = (~(i8 | i11 | i5)) | i10;
        int i13 = (~(i4 | i11)) | (~(i7 | i11));
        int i14 = i5 + i + i2 + (1941422536 * i3) + ((-555707305) * i6);
        int i15 = i14 * i14;
        int i16 = ((i5 * 487360618) - 1291405921) + (i * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (487361161 * i2) + ((-1188264952) * i3) + (624576655 * i6) + (i15 * (-25952256));
        switch ((i5 * (-2131549542)) + 177471488 + ((-2131549542) * i) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i2) + ((-1363148800) * i3) + (2141716480 * i6) + ((-573308928) * i15) + (i16 * i16 * 74186752)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                ?? r1 = (AuthPinDotView) objArr[0];
                int i17 = 2 % 2;
                AFk1uSDK aFk1uSDK = ((AuthPinDotView) r1).onExtraCallback;
                CircleView circleView = aFk1uSDK.IAuthTabCallbackStub;
                Resources resources = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                if (readIntokhttp.onExtraCallback(configuration)) {
                    Context context = r1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Configuration configuration2 = context.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    iAsInterface = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
                } else {
                    Context context2 = r1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    Configuration configuration3 = context2.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration3, "");
                    iAsInterface = new getUrlokhttp(new onExtraCallback(configuration3)).asInterface();
                }
                circleView.setBackgroundColor(iAsInterface);
                CircleView circleView2 = aFk1uSDK.onExtraCallback;
                Resources resources2 = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                Intrinsics.checkNotNullExpressionValue(resources2.getConfiguration(), "");
                if (!(!readIntokhttp.onExtraCallback(r5))) {
                    int i18 = getInterfaceDescriptor + 95;
                    IAuthTabCallbackStubProxy = i18 % 128;
                    int i19 = i18 % 2;
                    color = Color.argb(38, 255, 212, 214);
                } else {
                    color = Color.parseColor("#21FF000C");
                }
                circleView2.setBackgroundColor(color);
                CircleView circleView3 = aFk1uSDK.asBinder;
                Resources resources3 = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "");
                Configuration configuration4 = resources3.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                if (readIntokhttp.onExtraCallback(configuration4)) {
                    Context context3 = r1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    Configuration configuration5 = context3.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration5, "");
                    iAsInterface2 = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration5))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
                } else {
                    Context context4 = r1.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    Configuration configuration6 = context4.getResources().getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration6, "");
                    iAsInterface2 = new getUrlokhttp(new onNavigationEvent(configuration6)).asInterface();
                }
                circleView3.setBackgroundColor(iAsInterface2);
                aFk1uSDK.onTransact.setBackgroundColor(r1.access000());
                CircleView circleView4 = aFk1uSDK.onNavigationEvent;
                Resources resources4 = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "");
                Configuration configuration7 = resources4.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration7, "");
                circleView4.setBackgroundColor(readIntokhttp.onExtraCallback(configuration7) ? Color.argb(102, 63, 128, 177) : Color.argb(33, 0, 144, 255));
                TdsImageView tdsImageView = aFk1uSDK.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                Resources resources5 = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources5, "");
                Configuration configuration8 = resources5.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration8, "");
                if (readIntokhttp.onExtraCallback(configuration8)) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{50067, 45171, 50171, 27937, 34828, 7491, 49070, 9164, 43134, 15692, 40861, 6143, 952, 18532, 23854, 32754, 25470, 26783, 32149, 24366, 17228, 2235, 40340, 16128, 41766, 10489, 48636, 8043, 33507, 51535, 56399, 65215, 58057, 59747, 64527, 57035, 49793, 35187, 7290, 48666, 8816, 43408, 15534, 40496, 583, 18885, 23709, 32264, 25095, 27122, 31932}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                    int i20 = getInterfaceDescriptor + 111;
                    IAuthTabCallbackStubProxy = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i21 = 2 / 4;
                    }
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{54928, 6830, 55032, 24100, 8913, 11846, 53740, 14031, 675, 3657, 61919, 31165, 5819, 58041, 28203, 4528, 30333, 49730, 20112, 12652, 22095, 41574, 44689, 20802, 46629, 33316, 36601, 28969, 38880, 25490, 61258, 37117, 63434, 17342, 52994, 45185, 55191, 9133, 12070, 53265, 14200, 854, 4082, 61501, 5962, 58113, 28575, 4118, 30554, 49969, 20400, 13279}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
                TdsImageView tdsImageView2 = aFk1uSDK.asInterface;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                Resources resources6 = r1.getResources();
                Intrinsics.checkNotNullExpressionValue(resources6, "");
                Configuration configuration9 = resources6.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration9, "");
                if (readIntokhttp.onExtraCallback(configuration9)) {
                    int i22 = IAuthTabCallbackStubProxy + 29;
                    getInterfaceDescriptor = i22 % 128;
                    int i23 = i22 % 2;
                    Object[] objArr4 = new Object[1];
                    a(new char[]{39808, 53795, 39912, 38960, 59996, 59474, 48258, 31711, 51758, 51293, 40113, 5331, 23467, 10804, 43071, 31966, 15213, 2767, 34948, 23554, 7007, 27371, 26757, 15404, 64309, 19113, 18669, 7239, 56048, 43807, 10590, 64915, 47834, 35635, 2334, 56807, 39570, 60195, 59755, 48438, 31331, 52160, 51647, 40220, 23124, 11157, 43404, 32039, 14870, 2985, 35246, 24312, 6624, 26710, 27249}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                    strIntern2 = ((String) objArr4[0]).intern();
                } else {
                    Object[] objArr5 = new Object[1];
                    a(new char[]{14290, 19280, 14266, 625, 29487, 29203, 30137, 55181, 21341, 21020, 21898, 56808, 63481, 45895, 12926, 46565, 38719, 37820, 4805, 38201, 46861, 62360, 62148, 62743, 22375, 54234, 53932, 54652, 30370, 12908, 45855, 13480, 5768, 4672, 37719, 5332, 14037, 29267, 29555, 29764, 54842, 21160, 21415, 21608, 62984, 45823, 13258, 46147, 38427, 37581, 5102, 38793, 46572, 61755, 61497, 63422}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
                    strIntern2 = ((String) objArr5[0]).intern();
                }
                TdsImageView.setImage$default(tdsImageView2, strIntern2, (Function1) null, (Function1) null, 6, (Object) null);
                return null;
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-254991183, new Object[]{authPinDotView, attachapplovinsdk}, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), 254991184, R.onWarmupCompleted());
        int i4 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(authPinDotView, attachapplovinsdk);
        }
        IAuthTabCallback_Parcel(authPinDotView, attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            access100(authPinDotView, attachapplovinsdk);
            throw null;
        }
        Unit unitAccess100 = access100(authPinDotView, attachapplovinsdk);
        int i3 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AFk1uSDK aFk1uSDK = (AFk1uSDK) objArr[0];
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[1];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(aFk1uSDK, authPinDotView, valueAnimator);
        int i4 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit asInterface(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(authPinDotView, attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(authPinDotView, attachapplovinsdk);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(authPinDotView, attachapplovinsdk);
        int i3 = IAuthTabCallbackStubProxy + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(IAuthTabCallback(authPinDotView));
        }
        IAuthTabCallback(authPinDotView);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AuthPinDotView authPinDotView, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(authPinDotView, appLovinSdkSettings);
        int i4 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ deprecated_dns onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarWriteTypedObject = writeTypedObject();
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return deprecated_dnsVarWriteTypedObject;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(AFk1uSDK aFk1uSDK, AuthPinDotView authPinDotView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(aFk1uSDK, authPinDotView, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(AuthPinDotView authPinDotView, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(authPinDotView, appLovinSdkSettings);
        int i4 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ deprecated_dns onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarExtraCallback = extraCallback();
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return deprecated_dnsVarExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsentOnNavigationEvent = onNavigationEvent(authPinDotView);
        int i4 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return sethasuserconsentOnNavigationEvent;
    }

    public static /* synthetic */ int onWarmupCompleted(AuthPinDotView authPinDotView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(authPinDotView);
        }
        IAuthTabCallbackDefault(authPinDotView);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(-908122904, new Object[]{authPinDotView, attachapplovinsdk}, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), 908122908, R.onWarmupCompleted());
        int i3 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(authPinDotView, attachapplovinsdk);
        int i4 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public final void setType() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuthPinDotView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda4());
        this.IAuthTabCallback_Parcel = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda5());
        this.access100 = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda6());
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda7(this));
        this.asBinder = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda8(this));
        this.asInterface = LazyKt__LazyJVMKt.lazy(new AuthPinDotView$.ExternalSyntheticLambda9(this));
        AFk1uSDK aFk1uSDKIAuthTabCallback = AFk1uSDK.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1uSDKIAuthTabCallback, "");
        this.onExtraCallback = aFk1uSDKIAuthTabCallback;
        IAuthTabCallback(991752912, new Object[]{this}, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), -991752907, R.onWarmupCompleted());
        setPivotX(setTagsokhttp.onExtraCallbackWithResult(this, 107));
        setPivotY(setTagsokhttp.onExtraCallbackWithResult(this, 107));
        setScaleX(0.0f);
        setScaleY(0.0f);
        setAlpha(0.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthPinDotView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 86 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 41;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final Interpolator asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Address.onNavigationEvent.asBinder();
            throw null;
        }
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        int i3 = IAuthTabCallbackStubProxy + 27;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return interpolatorAsBinder;
        }
        throw null;
    }

    private final Interpolator onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final deprecated_dns IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.IAuthTabCallback_Parcel.getValue();
        int i4 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    private static final deprecated_dns extraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
            throw null;
        }
        deprecated_dns deprecated_dnsVarAsBinder = deprecated_certificatePinner.onExtraCallbackWithResult.asBinder();
        int i3 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVarAsBinder;
    }

    private final deprecated_dns access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.access100.getValue();
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    private static final deprecated_dns writeTypedObject() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarIAuthTabCallbackStub = deprecated_certificatePinner.onExtraCallbackWithResult.IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarIAuthTabCallbackStub;
    }

    private final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int IAuthTabCallbackDefault(AuthPinDotView authPinDotView) {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = authPinDotView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 != 0) {
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                int i4 = getInterfaceDescriptor + 1;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 5;
                }
                str = "#FA616D";
            } else {
                str = "#E42939";
            }
            return Color.parseColor(str);
        }
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        readIntokhttp.onExtraCallback(configuration2);
        throw null;
    }

    private final int access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) this.asBinder.getValue();
        if (i3 == 0) {
            return number.intValue();
        }
        number.intValue();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int IAuthTabCallback(AuthPinDotView authPinDotView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Resources resources = authPinDotView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                return Color.parseColor("#93beff");
            }
            Context context = authPinDotView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            int iAsInterface = new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).asInterface();
            int i3 = IAuthTabCallbackStubProxy + 15;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return iAsInterface;
            }
            obj.hashCode();
            throw null;
        }
        Resources resources2 = authPinDotView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration3 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        readIntokhttp.onExtraCallback(configuration3);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsent = (setHasUserConsent) authPinDotView.asInterface.getValue();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return sethasuserconsent;
    }

    private static final setHasUserConsent onNavigationEvent(AuthPinDotView authPinDotView) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(authPinDotView.access000(), authPinDotView.IAuthTabCallback_Parcel());
        int i2 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return sethasuserconsent;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access000 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access000)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45812), 84 - Color.argb(0, 0, 0, 0), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14184), 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 91;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.AuthPinDotView.IAuthTabCallback.onNavigationEvent + 21;
            im.toss.uikit.widget.AuthPinDotView.IAuthTabCallback.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.uikit.widget.AuthPinDotView.IAuthTabCallback.onNavigationEvent + 75;
            im.toss.uikit.widget.AuthPinDotView.IAuthTabCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 3 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onNavigationEvent(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setSmallOpacity(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onTransact.setAlpha(f);
            throw null;
        }
        this.onExtraCallback.onTransact.setAlpha(f);
        int i3 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        ViewPropertyAnimator viewPropertyAnimator = this.onWarmupCompleted;
        if (viewPropertyAnimator != null) {
            int i5 = i2 + 45;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                viewPropertyAnimator.cancel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = animate().scaleX(1.0f).scaleY(1.0f).alpha(0.7f).setDuration(1000L).setStartDelay(j).setInterpolator(Address.onNavigationEvent.asBinder());
        this.onWarmupCompleted = interpolator;
        if (interpolator != null) {
            int i6 = getInterfaceDescriptor + 69;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            interpolator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r0 r1 r2 r3
      0x0032: PHI (r0v6 java.lang.Float) = (r0v5 java.lang.Float), (r0v35 java.lang.Float) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r1v3 java.lang.Float) = (r1v2 java.lang.Float), (r1v29 java.lang.Float) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r2v1 o.AFk1uSDK) = (r2v0 o.AFk1uSDK), (r2v19 o.AFk1uSDK) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v1 o.runOnUiThreadDelayed) = (r3v0 o.runOnUiThreadDelayed), (r3v12 o.runOnUiThreadDelayed) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallbackDefault() {
        Float fValueOf;
        Float fValueOf2;
        AFk1uSDK aFk1uSDK;
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(1.0f);
            fValueOf2 = Float.valueOf(2.0f);
            aFk1uSDK = this.onExtraCallback;
            runonuithreaddelayed = this.IAuthTabCallback;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            fValueOf2 = Float.valueOf(1.0f);
            aFk1uSDK = this.onExtraCallback;
            runonuithreaddelayed = this.IAuthTabCallback;
            if (runonuithreaddelayed != null) {
            }
        }
        Float f = fValueOf;
        Float f2 = fValueOf2;
        AFk1uSDK aFk1uSDK2 = aFk1uSDK;
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onTransact;
        if (runonuithreaddelayed2 != null) {
            int i3 = IAuthTabCallbackStubProxy + 55;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            runonuithreaddelayed2.onNavigationEvent();
            int i5 = IAuthTabCallbackStubProxy + 31;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(onTransact()), 200}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, f2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout = aFk1uSDK2.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(onTransact()), 200}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, f, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout2 = aFk1uSDK2.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout2, isMuted.onExtraCallbackWithResult(isMuted.onNavigationEvent(new AppLovinSdkSettings(), (Float) null, f2, new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 83;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                AuthPinDotView authPinDotView = this.f$0;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i9 != 0) {
                    return AuthPinDotView.asInterface(authPinDotView, attachapplovinsdk);
                }
                AuthPinDotView.asInterface(authPinDotView, attachapplovinsdk);
                throw null;
            }
        }, 1, (Object) null), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 55;
                onNavigationEvent = i8 % 128;
                Object obj2 = null;
                if (i8 % 2 == 0) {
                    AuthPinDotView.onNavigationEvent(this.f$0, (AppLovinSdkSettings) obj);
                    throw null;
                }
                Unit unitOnNavigationEvent = AuthPinDotView.onNavigationEvent(this.f$0, (AppLovinSdkSettings) obj);
                int i9 = onNavigationEvent + 105;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                obj2.hashCode();
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout3 = aFk1uSDK2.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, isMuted.onExtraCallbackWithResult(new AppLovinSdkSettings(), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda12
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 81;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                AuthPinDotView authPinDotView = this.f$0;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) obj;
                if (i9 != 0) {
                    return AuthPinDotView.onExtraCallbackWithResult(authPinDotView, appLovinSdkSettings);
                }
                AuthPinDotView.onExtraCallbackWithResult(authPinDotView, appLovinSdkSettings);
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = aFk1uSDK2.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        this.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally, rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), f, Float.valueOf(1.5f), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 57;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnExtraCallback = AuthPinDotView.onExtraCallback(this.f$0, (attachAppLovinSdk) obj);
                int i10 = onWarmupCompleted + 29;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitOnExtraCallback;
            }
        }), f2, f, new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 31;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitIAuthTabCallback = AuthPinDotView.IAuthTabCallback(this.f$0, (attachAppLovinSdk) obj);
                int i10 = onNavigationEvent + 55;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
    }

    private static final Unit asBinder(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(authPinDotView.access100());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            attachapplovinsdk.IAuthTabCallback(14562);
            i = 9977;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            attachapplovinsdk.IAuthTabCallback(2000);
            i = 400;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(final AuthPinDotView authPinDotView, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.8f), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 123;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AuthPinDotView.onWarmupCompleted(this.f$0, (attachAppLovinSdk) obj);
                int i5 = IAuthTabCallback + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, (Object) null);
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda16
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) AuthPinDotView.IAuthTabCallback(-1193673178, new Object[]{this.f$0, (attachAppLovinSdk) obj}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 1193673180, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
                int i5 = onExtraCallback + 71;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return unit;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit access100(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.access100());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(authPinDotView.access100());
        int i3 = 21 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            attachapplovinsdk.IAuthTabCallback(5747);
            i = 6317;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            attachapplovinsdk.IAuthTabCallback(2000);
            i = 400;
        }
        attachapplovinsdk.onExtraCallback(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(final AuthPinDotView authPinDotView, AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.6f), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                AuthPinDotView authPinDotView2 = this.f$0;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i4 == 0) {
                    return AuthPinDotView.IAuthTabCallbackDefault(authPinDotView2, attachapplovinsdk);
                }
                AuthPinDotView.IAuthTabCallbackDefault(authPinDotView2, attachapplovinsdk);
                throw null;
            }
        }, 1, (Object) null);
        isMuted.asBinder(appLovinSdkSettings, (Float) null, Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) AuthPinDotView.IAuthTabCallback(148478677, new Object[]{this.f$0, (attachAppLovinSdk) obj}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -148478669, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
                int i5 = IAuthTabCallback + 77;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            i = 21127;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
            i = 1500;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AuthPinDotView authPinDotView = (AuthPinDotView) objArr[0];
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(authPinDotView.onTransact());
        attachapplovinsdk.IAuthTabCallback(1500);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        AFk1uSDK aFk1uSDK = this.onExtraCallback;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallback;
        if (runonuithreaddelayed != null) {
            int i4 = IAuthTabCallbackStubProxy + 39;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                runonuithreaddelayed.onNavigationEvent();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.onTransact;
        if (runonuithreaddelayed2 != null) {
            int i5 = getInterfaceDescriptor + 17;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            runonuithreaddelayed2.onNavigationEvent();
            if (i6 == 0) {
                throw null;
            }
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_dns deprecated_dnsVarIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallbackStubProxy()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(0.7f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout = aFk1uSDK.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout, isMuted.onNavigationEvent((AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{new AppLovinSdkSettings().onWarmupCompleted(onTransact()), 200}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout2 = aFk1uSDK.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        Rally rally3 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout2, isMuted.asBinder(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallbackStubProxy()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        ConstraintLayout constraintLayout3 = aFk1uSDK.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        Rally rally4 = (Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, isMuted.asBinder(new AppLovinSdkSettings(), (Float) null, fValueOf2, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView = aFk1uSDK.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        this.IAuthTabCallback = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally, rally2, rally3, rally4, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallbackStubProxy()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, deprecated_dnsVarIAuthTabCallbackStubProxy, (Integer) null, (Boolean) null, 0, 0L, false, 4025, (Object) null), false, 1, (Object) null);
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        final AFk1uSDK aFk1uSDK = this.onExtraCallback;
        ValueAnimator valueAnimator = this.IAuthTabCallbackStub;
        if (valueAnimator != null) {
            int i4 = i3 + 17;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        if (aFk1uSDK.onNavigationEvent.getAlpha() == 0.0f) {
            int i6 = getInterfaceDescriptor + 99;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        ValueAnimator valueAnimator2 = this.onNavigationEvent;
        if (valueAnimator2 != null) {
            int i8 = IAuthTabCallbackStubProxy + 5;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) throws Throwable {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 67;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                AuthPinDotView.IAuthTabCallback(-79749781, new Object[]{aFk1uSDK, this, valueAnimator3}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 79749787, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
                int i13 = onNavigationEvent + 103;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(onTransact());
        valueAnimatorOfFloat.start();
        this.IAuthTabCallbackStub = valueAnimatorOfFloat;
    }

    private static final void onNavigationEvent(AFk1uSDK aFk1uSDK, AuthPinDotView authPinDotView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        aFk1uSDK.asBinder.setAlpha(fFloatValue);
        float f = 1.0f - fFloatValue;
        aFk1uSDK.onTransact.setBackgroundColor(((setHasUserConsent) IAuthTabCallback(-380423769, new Object[]{authPinDotView}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 380423769, im.toss.features.payment.ui.autopay.R.onWarmupCompleted())).IAuthTabCallback(f).intValue());
        aFk1uSDK.onNavigationEvent.setAlpha(fFloatValue);
        aFk1uSDK.IAuthTabCallbackStub.setAlpha(f);
        aFk1uSDK.onExtraCallback.setAlpha(f);
        int i4 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1 r3
      0x0020: PHI (r1v5 o.AFk1uSDK) = (r1v4 o.AFk1uSDK), (r1v9 o.AFk1uSDK) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r3v2 android.animation.ValueAnimator) = (r3v1 android.animation.ValueAnimator), (r3v9 android.animation.ValueAnimator) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback() {
        final AFk1uSDK aFk1uSDK;
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            aFk1uSDK = this.onExtraCallback;
            valueAnimator = this.onNavigationEvent;
            int i3 = 81 / 0;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    return;
                }
            }
        } else {
            aFk1uSDK = this.onExtraCallback;
            valueAnimator = this.onNavigationEvent;
            if (valueAnimator != null) {
            }
        }
        if (aFk1uSDK.onExtraCallback.getAlpha() == 0.0f) {
            return;
        }
        ValueAnimator valueAnimator2 = this.IAuthTabCallbackStub;
        if (valueAnimator2 != null) {
            int i4 = getInterfaceDescriptor + 17;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                valueAnimator2.cancel();
                int i5 = 91 / 0;
            } else {
                valueAnimator2.cancel();
            }
            int i6 = getInterfaceDescriptor + 33;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator.setFrameDelay(20L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.AuthPinDotView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 123;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                AuthPinDotView.onExtraCallbackWithResult(aFk1uSDK, this, valueAnimator3);
                int i11 = onWarmupCompleted + 119;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 29 / 0;
                }
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(onTransact());
        valueAnimatorOfFloat.start();
        this.onNavigationEvent = valueAnimatorOfFloat;
    }

    private static final void IAuthTabCallback(AFk1uSDK aFk1uSDK, AuthPinDotView authPinDotView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        aFk1uSDK.asBinder.setAlpha(fFloatValue);
        float f = 1.0f - fFloatValue;
        aFk1uSDK.onTransact.setBackgroundColor(((setHasUserConsent) IAuthTabCallback(-380423769, new Object[]{authPinDotView}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 380423769, im.toss.features.payment.ui.autopay.R.onWarmupCompleted())).IAuthTabCallback(f).intValue());
        aFk1uSDK.onNavigationEvent.setAlpha(fFloatValue);
        aFk1uSDK.IAuthTabCallbackStub.setAlpha(f);
        aFk1uSDK.onExtraCallback.setAlpha(f);
        int i4 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        super/*android.view.View*/.onDetachedFromWindow();
        runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = this.IAuthTabCallback;
        if (runonuithreaddelayed2 != null) {
            int i2 = getInterfaceDescriptor + 35;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed2.onNavigationEvent();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.onWarmupCompleted;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.onNavigationEvent;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.IAuthTabCallbackStub;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            int i4 = IAuthTabCallbackStubProxy + 27;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(148478677, new Object[]{authPinDotView, attachapplovinsdk}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -148478669, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    public static /* synthetic */ setHasUserConsent onExtraCallback(AuthPinDotView authPinDotView) {
        return (setHasUserConsent) IAuthTabCallback(-1998180915, new Object[]{authPinDotView}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 1998180922, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(-1193673178, new Object[]{authPinDotView, attachapplovinsdk}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 1193673180, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    private final setHasUserConsent getInterfaceDescriptor() {
        return (setHasUserConsent) IAuthTabCallback(-380423769, new Object[]{this}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 380423769, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackStub(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(-908122904, new Object[]{authPinDotView, attachapplovinsdk}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 908122908, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    private static final Unit getInterfaceDescriptor(AuthPinDotView authPinDotView, attachAppLovinSdk attachapplovinsdk) {
        return (Unit) IAuthTabCallback(-254991183, new Object[]{authPinDotView, attachapplovinsdk}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), 254991184, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }

    public final void onWarmupCompleted() throws Throwable {
        IAuthTabCallback(991752912, new Object[]{this}, im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), im.toss.features.payment.ui.autopay.R.onWarmupCompleted(), -991752907, im.toss.features.payment.ui.autopay.R.onWarmupCompleted());
    }
}
