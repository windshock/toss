package im.toss.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.GradientButtonView$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.M_;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.ResponseNetwork;
import o.WebSocketFactory;
import o.access15300;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getVersionCode;
import o.processDeepLink;
import o.readIntokhttp;
import o.setHasUserConsent;
import o.setTagsokhttp;
import o.setVisitUrl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GradientButtonView extends ConstraintLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onActivityResized = 0;
    private static int onMinimized = 1;
    private static long onPostMessage = 8490501205794093910L;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private ValueAnimator IAuthTabCallbackStub;
    private onExtraCallback IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private ValueAnimator ICustomTabsCallback;
    private Function0<Unit> access000;
    private ValueAnimator access100;
    private final Lazy asBinder;
    private boolean asInterface;
    private final Lazy extraCallback;
    private final Lazy extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private final ResponseNetwork onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;
    private ValueAnimator readTypedObject;
    private final Lazy writeTypedObject;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.NORMAL.ordinal()] = 1;
                int i = IAuthTabCallback + 101;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.ERROR.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
            int i5 = IAuthTabCallback + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i6 | i | i2;
        int i8 = (~((~i2) | i)) | i6;
        int i9 = ~((~i6) | i);
        int i10 = i6 + i + i3 + (1132004924 * i4) + ((-2047965933) * i5);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i6) - 289800192) + ((-1513965855) * i) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i3) + (1823473664 * i4) + (830210048 * i5) + ((-1143341056) * i11);
        int i13 = ((i6 * (-767560105)) - 1188649921) + (i * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i3 * (-767559561)) + (i4 * 1544553956) + (i5 * (-1468578859)) + (i11 * (-2108293120));
        switch (i12 + (i13 * i13 * (-2075787264))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                GradientButtonView gradientButtonView = (GradientButtonView) objArr[0];
                ResponseNetwork responseNetwork = (ResponseNetwork) objArr[1];
                float fFloatValue = ((Number) objArr[2]).floatValue();
                ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
                int i14 = 2 % 2;
                int i15 = onActivityResized + 83;
                onMinimized = i15 % 128;
                int i16 = i15 % 2;
                IAuthTabCallback(-1296101371, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView, responseNetwork, Float.valueOf(fFloatValue), valueAnimator}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1296101371);
                int i17 = onMinimized + 71;
                onActivityResized = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 6:
                ResponseNetwork responseNetwork2 = (ResponseNetwork) objArr[0];
                float fFloatValue2 = ((Number) objArr[1]).floatValue();
                float fFloatValue3 = ((Number) objArr[2]).floatValue();
                GradientButtonView gradientButtonView2 = (GradientButtonView) objArr[3];
                ValueAnimator valueAnimator2 = (ValueAnimator) objArr[4];
                int i19 = 2 % 2;
                int i20 = onMinimized + 73;
                onActivityResized = i20 % 128;
                int i21 = i20 % 2;
                onExtraCallback(responseNetwork2, fFloatValue2, fFloatValue3, gradientButtonView2, valueAnimator2);
                int i22 = onActivityResized + 55;
                onMinimized = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ deprecated_dns IAuthTabCallback() {
        deprecated_dns deprecated_dnsVarOnMessageChannelReady;
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            deprecated_dnsVarOnMessageChannelReady = onMessageChannelReady();
            int i3 = 0 / 0;
        } else {
            deprecated_dnsVarOnMessageChannelReady = onMessageChannelReady();
        }
        int i4 = onActivityResized + 95;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarOnMessageChannelReady;
    }

    public static /* synthetic */ setHasUserConsent IAuthTabCallback(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            access100(gradientButtonView);
            throw null;
        }
        setHasUserConsent sethasuserconsentAccess100 = access100(gradientButtonView);
        int i3 = onMinimized + 67;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return sethasuserconsentAccess100;
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(258878283, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function0, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -258878279);
            return;
        }
        IAuthTabCallback(258878283, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function0, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -258878279);
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallbackDefault(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iICustomTabsCallback = ICustomTabsCallback(gradientButtonView);
        int i4 = onMinimized + 29;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return iICustomTabsCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        GradientButtonView gradientButtonView = (GradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(gradientButtonView);
        int i4 = onActivityResized + 91;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ int asBinder(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iAccess000 = access000(gradientButtonView);
        int i4 = onMinimized + 91;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return iAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 115;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            onActivityResized();
            throw null;
        }
        int iOnActivityResized = onActivityResized();
        int i3 = onActivityResized + 7;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return iOnActivityResized;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GradientButtonView gradientButtonView = (GradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return Integer.valueOf(((Integer) IAuthTabCallback(-1805208056, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1805208063)).intValue());
        }
        ((Integer) IAuthTabCallback(-1805208056, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1805208063)).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ deprecated_dns onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            onMinimized();
            throw null;
        }
        deprecated_dns deprecated_dnsVarOnMinimized = onMinimized();
        int i3 = onActivityResized + 59;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVarOnMinimized;
    }

    public static /* synthetic */ setHasUserConsent onExtraCallbackWithResult(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsentIAuthTabCallbackStub = IAuthTabCallbackStub(gradientButtonView);
        int i4 = onActivityResized + 85;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return sethasuserconsentIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 35;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(f, f2, gradientButtonView, valueAnimator);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(GradientButtonView gradientButtonView, ResponseNetwork responseNetwork, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onMinimized + 25;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(gradientButtonView, responseNetwork, valueAnimator);
        int i4 = onActivityResized + 105;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Interpolator onNavigationEvent() {
        Interpolator interpolatorOnTransact;
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            interpolatorOnTransact = onTransact();
            int i3 = 30 / 0;
        } else {
            interpolatorOnTransact = onTransact();
        }
        int i4 = onMinimized + 115;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return interpolatorOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ResponseNetwork responseNetwork = (ResponseNetwork) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        GradientButtonView gradientButtonView = (GradientButtonView) objArr[3];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[4];
        int i = 2 % 2;
        int i2 = onActivityResized + 31;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(responseNetwork, fFloatValue, fFloatValue2, gradientButtonView, valueAnimator);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = onActivityResized + 35;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ String onTransact(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) IAuthTabCallback(295633495, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -295633486);
        int i4 = onActivityResized + 53;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ setHasUserConsent onWarmupCompleted(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onActivityResized + 73;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asInterface(gradientButtonView);
            obj.hashCode();
            throw null;
        }
        setHasUserConsent sethasuserconsentAsInterface = asInterface(gradientButtonView);
        int i3 = onMinimized + 55;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return sethasuserconsentAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(f, f2, gradientButtonView, valueAnimator);
        int i4 = onMinimized + 19;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GradientButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ResponseNetwork responseNetworkOnWarmupCompleted = ResponseNetwork.onWarmupCompleted(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(responseNetworkOnWarmupCompleted, "");
        this.onExtraCallback = responseNetworkOnWarmupCompleted;
        this.writeTypedObject = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda1());
        this.extraCallback = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda4());
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda5());
        this.IAuthTabCallbackStubProxy = onExtraCallback.NORMAL;
        this.onTransact = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda6(this));
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda7(this));
        this.asBinder = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda8(this));
        this.getInterfaceDescriptor = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda9(this));
        this.IAuthTabCallback_Parcel = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda10(this));
        this.extraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda11());
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda12(this));
        this.onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda2(this));
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new GradientButtonView$.ExternalSyntheticLambda3(this));
        extraCallbackWithResult();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GradientButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = onMinimized;
            int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 65;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final deprecated_dns onMinimized() {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarAsInterface = deprecated_certificatePinner.onExtraCallbackWithResult.asInterface();
        int i4 = onMinimized + 25;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVarAsInterface;
    }

    private final deprecated_dns readTypedObject() {
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        deprecated_dns deprecated_dnsVar = (deprecated_dns) this.writeTypedObject.getValue();
        int i3 = onActivityResized + 15;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVar;
    }

    private static final deprecated_dns onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onActivityResized + 11;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deprecated_dns deprecated_dnsVarOnNavigationEvent = deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent();
        int i3 = onActivityResized + 29;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVarOnNavigationEvent;
    }

    private final Interpolator asBinder() {
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.onNavigationEvent.getValue();
        int i4 = onActivityResized + 113;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    private static final Interpolator onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        int i4 = onMinimized + 15;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return interpolatorAsBinder;
    }

    public final void setIgnoreAnimation(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 67;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = z;
        int i5 = i2 + 25;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallback NORMAL = new onExtraCallback("NORMAL", 0);
        public static final onExtraCallback ERROR = new onExtraCallback("ERROR", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = NORMAL;
            if (i3 == 0) {
                return new onExtraCallback[]{onextracallback, ERROR};
            }
            onExtraCallback onextracallback2 = ERROR;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[5];
            onextracallbackArr[0] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallbackWithResult + 73;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    public final void setPinState(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onMinimized + 125;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallbackStubProxy = onextracallback;
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.IAuthTabCallbackStubProxy = onextracallback;
        int i3 = onMinimized + 119;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GradientButtonView gradientButtonView = (GradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) gradientButtonView.onTransact.getValue();
        int i4 = onMinimized + 13;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String IAuthTabCallback_Parcel(GradientButtonView gradientButtonView) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = gradientButtonView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            Object[] objArr = new Object[1];
            a(new char[]{32265, 2398, 36995, 7152, 41790, 10796, 46476, 15683, 50250, 20406, 55022, 24108, 59788, 28877, 63573, 33648, 2750, 38377, 7508, 42206, 12244, 46891, 15932, 51637, 20753, 55325, 25487, 60129, 29243, 64817, 33991, 3101, 38758, 7842, 43491, 12557, 47247, 17346, 52013, 21025, 56763, 25861, 60417, 30600, 65259, 34345}, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 30540, objArr);
            return ((String) objArr[0]).intern();
        }
        int i4 = onActivityResized + 119;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{32265, 8044, 48359, 23162, 64502, 39174, 13976, 54273, 30170, 4948, 45242, 20006, 61348, 36135, 10961, 51202, 27038, 1819, 42128, 17844, 58236, 32993, 7720, 49111, 23873, 64159, 39003, 14795, 55091, 29947, 4651, 45991, 20787, 61075, 35934, 11656, 51985, 26738, 2490, 42860, 17646, 57902, 33739, 8540, 48842}, (Process.myTid() >> 22) + 24953, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i6 = onActivityResized + 45;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return strIntern;
    }

    private final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        int i4 = onActivityResized + 17;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        Object obj;
        ConstraintLayout constraintLayout = (GradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = constraintLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            int i4 = onMinimized + 15;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(new char[]{32265, 41898, 50539, 59180, 2286, 10976, 19508, 28279, 37866, 46498, 55158, 63776, 6908, 15537, 24125, 32804, 42494, 51133, 59772, 2914, 11492, 20135, 28708, 37409, 47089, 55785, 64375, 7469, 16107, 24813, 33383, 42017, 51699, 60309, 3346, 12062, 20681, 29332, 37910, 46618, 56286, 64987, 8005, 16657, 25297, 34012, 42563, 51230, 60886}, 56767 >>> (ViewConfiguration.getWindowTouchSlop() / 35), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(new char[]{32265, 41898, 50539, 59180, 2286, 10976, 19508, 28279, 37866, 46498, 55158, 63776, 6908, 15537, 24125, 32804, 42494, 51133, 59772, 2914, 11492, 20135, 28708, 37409, 47089, 55785, 64375, 7469, 16107, 24813, 33383, 42017, 51699, 60309, 3346, 12062, 20681, 29332, 37910, 46618, 56286, 64987, 8005, 16657, 25297, 34012, 42563, 51230, 60886}, 56767 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                obj = objArr3[0];
            }
            return ((String) obj).intern();
        }
        Object[] objArr4 = new Object[1];
        a(new char[]{32265, 32852, 33431, 34002, 34582, 35102, 35784, 36233, 35866, 36444, 37002, 37598, 38148, 38735, 39361, 39898, 39454, 40003, 40576, 41116, 41756, 42329, 42968, 43487, 43009, 43543, 44171, 44755, 45331, 45843, 46483, 47063, 46630, 47208, 47799, 48303, 48935, 49520, 50089, 50603, 50219, 50799, 51430, 51960, 52520, 53096, 53729, 54270, 53823, 54391}, (ViewConfiguration.getTouchSlop() >> 8) + 65089, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        int i5 = onActivityResized + 33;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.GradientButtonView.IAuthTabCallback.onExtraCallback + 111;
            im.toss.uikit.widget.GradientButtonView.IAuthTabCallback.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.uikit.widget.GradientButtonView.IAuthTabCallback.onExtraCallbackWithResult + 61;
            im.toss.uikit.widget.GradientButtonView.IAuthTabCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallback + 77;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public asBinder(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i3 = onExtraCallback + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i4 != 0) {
                int i5 = 10 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = IAuthTabCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i4 = onExtraCallback + 19;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = IAuthTabCallback + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.asBinder.getValue()).intValue();
        int i4 = onActivityResized + 23;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 101;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 24 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (onPostMessage | 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 23 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 19627 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onPostMessage ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 59 - Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 59 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), (-16770833) - Color.rgb(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i6 = $10 + 95;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        ConstraintLayout constraintLayout = (GradientButtonView) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 113;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Resources resources = constraintLayout.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (!readIntokhttp.onExtraCallback(configuration)) {
                int iArgb = Color.argb(147, 0, 53, Imgproc.COLOR_YUV2RGBA_YVYU);
                int i3 = onActivityResized + 5;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                return Integer.valueOf(iArgb);
            }
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            return Integer.valueOf(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).IPostMessageServiceDefault());
        }
        Resources resources2 = constraintLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration3 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        readIntokhttp.onExtraCallback(configuration3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int access000() {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.getInterfaceDescriptor.getValue()).intValue();
        int i4 = onActivityResized + 27;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int access000(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Resources resources = gradientButtonView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                Context context = gradientButtonView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration2 = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                Object[] objArr = {new getUrlokhttp(new IAuthTabCallbackDefault(configuration2))};
                int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                int iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
                int i3 = onMinimized + 43;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
                return iIntValue;
            }
            Context context2 = gradientButtonView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration3 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            return new getUrlokhttp(new asBinder(configuration3)).asInterface();
        }
        Resources resources2 = gradientButtonView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration4 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        readIntokhttp.onExtraCallback(configuration4);
        throw null;
    }

    private final int extraCallback() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onActivityResized + 55;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.IAuthTabCallback_Parcel.getValue()).intValue();
            int i3 = 89 / 0;
        } else {
            iIntValue = ((Number) this.IAuthTabCallback_Parcel.getValue()).intValue();
        }
        int i4 = onActivityResized + 105;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int ICustomTabsCallback(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        int i2 = onActivityResized + 77;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Resources resources = gradientButtonView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (readIntokhttp.onExtraCallback(configuration)) {
                Context context = gradientButtonView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration2 = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                Object[] objArr = {new getUrlokhttp(new asInterface(configuration2))};
                int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                return ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
            }
            Context context2 = gradientButtonView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration3 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            int iICustomTabsService_Parcel = new getUrlokhttp(new onTransact(configuration3)).ICustomTabsService_Parcel();
            int i3 = onMinimized + 3;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return iICustomTabsService_Parcel;
        }
        Resources resources2 = gradientButtonView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration4 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        readIntokhttp.onExtraCallback(configuration4);
        throw null;
    }

    private final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.extraCallbackWithResult.getValue()).intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = ((Number) this.extraCallbackWithResult.getValue()).intValue();
        int i3 = onMinimized + 87;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    private static final int onActivityResized() {
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            M_.onExtraCallback.asInterface();
            throw null;
        }
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i3 = onActivityResized + 7;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        return iAsInterface;
    }

    private final setHasUserConsent IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            return (setHasUserConsent) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final setHasUserConsent asInterface(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(gradientButtonView.getInterfaceDescriptor(), gradientButtonView.access000());
        int i2 = onMinimized + 61;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return sethasuserconsent;
    }

    private final setHasUserConsent IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onActivityResized + 33;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        setHasUserConsent sethasuserconsent = (setHasUserConsent) this.onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return sethasuserconsent;
    }

    private static final setHasUserConsent access100(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(gradientButtonView.getInterfaceDescriptor(), gradientButtonView.extraCallback());
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return sethasuserconsent;
    }

    private final setHasUserConsent asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        setHasUserConsent sethasuserconsent = (setHasUserConsent) this.onWarmupCompleted.getValue();
        int i3 = onMinimized + 41;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return sethasuserconsent;
    }

    private static final setHasUserConsent IAuthTabCallbackStub(GradientButtonView gradientButtonView) {
        int i = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(gradientButtonView.access000(), gradientButtonView.extraCallback());
        int i2 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return sethasuserconsent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onActivityResized + 15;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onExtraCallback.asBinder.setText(charSequence);
        int i4 = onMinimized + 101;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void extraCallbackWithResult() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onMinimized + 95;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        ResponseNetwork responseNetwork = this.onExtraCallback;
        responseNetwork.onWarmupCompleted.setRadius(setTagsokhttp.onExtraCallbackWithResult(this, 22));
        View view = responseNetwork.IAuthTabCallback;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIntValue = new getUrlokhttp(new onNavigationEvent(configuration2)).writeTypedList();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration3 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration3))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        view.setBackgroundColor(iIntValue);
        int iICustomTabsCallback = (int) (ICustomTabsCallback() * 1.5f);
        ViewGroup.LayoutParams layoutParams = responseNetwork.onExtraCallbackWithResult.getLayoutParams();
        layoutParams.width = iICustomTabsCallback;
        layoutParams.height = iICustomTabsCallback;
        ViewGroup.LayoutParams layoutParams2 = responseNetwork.onNavigationEvent.getLayoutParams();
        layoutParams2.width = iICustomTabsCallback;
        layoutParams2.height = iICustomTabsCallback;
        responseNetwork.asBinder.setTextColor(getInterfaceDescriptor());
        TdsImageView tdsImageView = responseNetwork.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context3).onExtraCallback((String) IAuthTabCallback(1671404752, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1671404749));
        TdsImageView tdsImageView2 = responseNetwork.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        TdsImageView.setImage$default(tdsImageView, Recomposerjoin2.onExtraCallback(onnavigationeventOnExtraCallback, tdsImageView2).onExtraCallback(iICustomTabsCallback, iICustomTabsCallback), (Function1) null, (Function1) null, 6, (Object) null);
        responseNetwork.onNavigationEvent.setAlpha(0.0f);
        TdsImageView tdsImageView3 = responseNetwork.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = new RecomposerawaitIdle2.onNavigationEvent(context4).onExtraCallback(IAuthTabCallbackStubProxy());
        TdsImageView tdsImageView4 = responseNetwork.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
        TdsImageView.setImage$default(tdsImageView3, Recomposerjoin2.onExtraCallback(onnavigationeventOnExtraCallback2, tdsImageView4).onExtraCallback(iICustomTabsCallback, iICustomTabsCallback), (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView5 = responseNetwork.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
        getVersionCode getversioncode = getVersionCode.STRONG;
        processDeepLink.onWarmupCompleted(tdsImageView5, getversioncode);
        TdsImageView tdsImageView6 = responseNetwork.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
        processDeepLink.onWarmupCompleted(tdsImageView6, getversioncode);
        responseNetwork.onExtraCallbackWithResult.bringToFront();
        responseNetwork.onNavigationEvent.bringToFront();
        int i4 = onMinimized + 53;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setState(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onMinimized + 123;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        final ResponseNetwork responseNetwork = this.onExtraCallback;
        if (this.asInterface || this.IAuthTabCallbackStubProxy == onextracallback) {
            return;
        }
        this.IAuthTabCallbackStubProxy = onextracallback;
        final float alpha = responseNetwork.onExtraCallbackWithResult.getAlpha();
        final float alpha2 = responseNetwork.onNavigationEvent.getAlpha();
        ValueAnimator valueAnimator = this.readTypedObject;
        if (valueAnimator != null) {
            int i4 = onMinimized + 59;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator.cancel();
        }
        int i6 = onWarmupCompleted.onExtraCallback[onextracallback.ordinal()];
        if (i6 == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(1200L);
            valueAnimatorOfFloat.setInterpolator(asBinder());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda14
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 25;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        GradientButtonView.IAuthTabCallback(582609129, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{responseNetwork, Float.valueOf(alpha), Float.valueOf(alpha2), this, valueAnimator2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -582609123);
                        throw null;
                    }
                    GradientButtonView.IAuthTabCallback(582609129, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{responseNetwork, Float.valueOf(alpha), Float.valueOf(alpha2), this, valueAnimator2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -582609123);
                    int i9 = onWarmupCompleted + 37;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                }
            });
            valueAnimatorOfFloat.start();
            this.readTypedObject = valueAnimatorOfFloat;
            return;
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(400L);
        valueAnimatorOfFloat2.setInterpolator(asBinder());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 115;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    GradientButtonView.IAuthTabCallback(1503327409, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{responseNetwork, Float.valueOf(alpha2), Float.valueOf(alpha), this, valueAnimator2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1503327407);
                    return;
                }
                GradientButtonView.IAuthTabCallback(1503327409, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{responseNetwork, Float.valueOf(alpha2), Float.valueOf(alpha), this, valueAnimator2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1503327407);
                int i9 = 17 / 0;
            }
        });
        valueAnimatorOfFloat2.start();
        this.readTypedObject = valueAnimatorOfFloat2;
    }

    private static final void onExtraCallback(ResponseNetwork responseNetwork, float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        responseNetwork.onExtraCallbackWithResult.setAlpha(f + ((1.0f - f) * fFloatValue));
        responseNetwork.onNavigationEvent.setAlpha(f2 - (fFloatValue * f2));
        responseNetwork.asBinder.setTextColor(gradientButtonView.asInterface().IAuthTabCallback(1.0f - fFloatValue).intValue());
        int i4 = onActivityResized + 79;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    private static final void IAuthTabCallback(ResponseNetwork responseNetwork, float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onMinimized + 73;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        responseNetwork.onNavigationEvent.setAlpha(f + ((1.0f - f) * fFloatValue));
        responseNetwork.onExtraCallbackWithResult.setAlpha(f2 - (fFloatValue * f2));
        responseNetwork.asBinder.setTextColor(gradientButtonView.asInterface().IAuthTabCallback(fFloatValue).intValue());
        int i4 = onMinimized + 103;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        final ResponseNetwork responseNetwork = this.onExtraCallback;
        if (!this.asInterface) {
            int i2 = onActivityResized + 7;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0 ? responseNetwork.onExtraCallback.getAlpha() < 1.0f : responseNetwork.onExtraCallback.getAlpha() < 2.0f) {
                ValueAnimator valueAnimator = this.access100;
                if (valueAnimator != null) {
                    int i3 = onMinimized + 75;
                    onActivityResized = i3 % 128;
                    int i4 = i3 % 2;
                    boolean zIsRunning = valueAnimator.isRunning();
                    if (i4 != 0) {
                        if (zIsRunning) {
                            return;
                        }
                    } else if (zIsRunning) {
                        return;
                    }
                }
                ValueAnimator valueAnimator2 = this.IAuthTabCallbackStub;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.access100;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(1500L);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                final float f = 3.75f;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda18
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 33;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        GradientButtonView.IAuthTabCallback(1004450642, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this.f$0, responseNetwork, Float.valueOf(f), valueAnimator4}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1004450637);
                        int i8 = onWarmupCompleted + 55;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                valueAnimatorOfFloat.start();
                this.access100 = valueAnimatorOfFloat;
            }
        }
        int i5 = onMinimized + 75;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0088 A[PHI: r5
      0x0088: PHI (r5v8 float) = (r5v5 float), (r5v10 float) binds: [B:8:0x0065, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067 A[PHI: r5 r9
      0x0067: PHI (r5v6 float) = (r5v5 float), (r5v10 float) binds: [B:8:0x0065, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r9v6 float) = (r9v5 float), (r9v24 float) binds: [B:8:0x0065, B:5:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        float fFloatValue;
        float interpolation;
        GradientButtonView gradientButtonView = (GradientButtonView) objArr[0];
        ResponseNetwork responseNetwork = (ResponseNetwork) objArr[1];
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[3];
        int i = 2 % 2;
        int i2 = onMinimized + 33;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            fFloatValue = ((Float) animatedValue).floatValue();
            interpolation = gradientButtonView.asBinder().getInterpolation(fFloatValue);
            int i3 = 17 / 0;
            if (gradientButtonView.IAuthTabCallbackStubProxy == onExtraCallback.ERROR) {
                responseNetwork.asBinder.setTextColor(gradientButtonView.IAuthTabCallback_Parcel().IAuthTabCallback(gradientButtonView.asBinder().getInterpolation(Math.min(fFloatValue * fFloatValue2, 1.0f))).intValue());
            } else {
                responseNetwork.asBinder.setTextColor(gradientButtonView.IAuthTabCallbackDefault().IAuthTabCallback(interpolation).intValue());
                int i4 = onMinimized + 37;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            fFloatValue = ((Float) animatedValue2).floatValue();
            interpolation = gradientButtonView.asBinder().getInterpolation(fFloatValue);
            if (gradientButtonView.IAuthTabCallbackStubProxy == onExtraCallback.ERROR) {
            }
        }
        responseNetwork.onExtraCallback.setAlpha(interpolation);
        responseNetwork.onNavigationEvent.setScaleX(interpolation);
        responseNetwork.onNavigationEvent.setScaleY(interpolation);
        responseNetwork.onExtraCallbackWithResult.setScaleX(interpolation);
        responseNetwork.onExtraCallbackWithResult.setScaleY(interpolation);
        return null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        final ResponseNetwork responseNetwork = this.onExtraCallback;
        if (this.asInterface || responseNetwork.onExtraCallback.getAlpha() <= 0.0f) {
            return;
        }
        ValueAnimator valueAnimator = this.IAuthTabCallbackStub;
        if (valueAnimator != null) {
            int i3 = onMinimized + 101;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0 ? valueAnimator.isRunning() : !valueAnimator.isRunning()) {
                int i4 = onActivityResized + 115;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.access100;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda17
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 123;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                GradientButtonView.onExtraCallbackWithResult(this.f$0, responseNetwork, valueAnimator3);
                int i9 = onWarmupCompleted + 15;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }
        });
        valueAnimatorOfFloat.start();
        this.IAuthTabCallbackStub = valueAnimatorOfFloat;
    }

    private static final void onNavigationEvent(GradientButtonView gradientButtonView, ResponseNetwork responseNetwork, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 107;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float interpolation = gradientButtonView.asBinder().getInterpolation(((Float) animatedValue).floatValue());
        if (gradientButtonView.IAuthTabCallbackStubProxy == onExtraCallback.ERROR) {
            int i4 = onMinimized + 33;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            responseNetwork.asBinder.setTextColor(gradientButtonView.IAuthTabCallback_Parcel().IAuthTabCallback(interpolation).intValue());
        } else {
            responseNetwork.asBinder.setTextColor(gradientButtonView.IAuthTabCallbackDefault().IAuthTabCallback(interpolation).intValue());
            int i6 = onActivityResized + 5;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
        }
        responseNetwork.onExtraCallback.setAlpha(interpolation);
        responseNetwork.onNavigationEvent.setScaleX(interpolation);
        responseNetwork.onNavigationEvent.setScaleY(interpolation);
        responseNetwork.onExtraCallbackWithResult.setScaleX(interpolation);
        responseNetwork.onExtraCallbackWithResult.setScaleY(interpolation);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 != 0) {
            return null;
        }
        int i4 = 16 / 0;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnClickListener(@NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda16
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                GradientButtonView.IAuthTabCallback(function0, view);
                int i5 = onExtraCallback + 115;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.access000 = function0;
        int i2 = onMinimized + 67;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            writeTypedObject();
            return true;
        }
        if (action == 1) {
            onActivityLayout();
            Function0<Unit> function0 = this.access000;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        int i2 = onActivityResized + 111;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        if (action == 3) {
            onActivityLayout();
            return true;
        }
        int i5 = i3 + 33;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1 r2
      0x0023: PHI (r1v5 float) = (r1v4 float), (r1v7 float) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r2v2 android.animation.ValueAnimator) = (r2v1 android.animation.ValueAnimator), (r2v11 android.animation.ValueAnimator) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void writeTypedObject() {
        final float scaleX;
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = onMinimized + 85;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            scaleX = getScaleX();
            valueAnimator = this.ICustomTabsCallback;
            int i3 = 57 / 0;
            if (valueAnimator != null) {
                int i4 = onActivityResized + 73;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
                valueAnimator.cancel();
                int i6 = onActivityResized + 109;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            scaleX = getScaleX();
            valueAnimator = this.ICustomTabsCallback;
            if (valueAnimator != null) {
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(readTypedObject().IAuthTabCallback());
        valueAnimatorOfFloat.setInterpolator(readTypedObject());
        final float f = 0.96f - scaleX;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 89;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                GradientButtonView.onExtraCallbackWithResult(scaleX, f, this, valueAnimator2);
                int i11 = IAuthTabCallback + 77;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
            }
        });
        valueAnimatorOfFloat.start();
        this.ICustomTabsCallback = valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + (f2 * fFloatValue);
        gradientButtonView.setScaleX(f3);
        gradientButtonView.setScaleY(f3);
        gradientButtonView.onExtraCallback.IAuthTabCallback.setAlpha(fFloatValue);
        int i4 = onActivityResized + 47;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        final float scaleX = getScaleX();
        ValueAnimator valueAnimator = this.ICustomTabsCallback;
        if (valueAnimator != null) {
            int i4 = onMinimized + 123;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator.cancel();
            int i6 = onMinimized + 41;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(readTypedObject().IAuthTabCallback());
        valueAnimatorOfFloat.setInterpolator(readTypedObject());
        final float f = 1.0f - scaleX;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.GradientButtonView$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 81;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                GradientButtonView.onWarmupCompleted(scaleX, f, this, valueAnimator2);
                int i11 = onExtraCallback + 107;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOfFloat.start();
        this.ICustomTabsCallback = valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(float f, float f2, GradientButtonView gradientButtonView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onActivityResized + 85;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f3 = f + (f2 * fFloatValue);
        gradientButtonView.setScaleX(f3);
        gradientButtonView.setScaleY(f3);
        gradientButtonView.onExtraCallback.IAuthTabCallback.setAlpha(1.0f - fFloatValue);
        int i4 = onMinimized + 33;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(GradientButtonView gradientButtonView) {
        return (String) IAuthTabCallback(657467513, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -657467505);
    }

    private static final String IAuthTabCallbackStubProxy(GradientButtonView gradientButtonView) {
        return (String) IAuthTabCallback(295633495, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -295633486);
    }

    private final String access100() {
        return (String) IAuthTabCallback(1671404752, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1671404749);
    }

    private static final int getInterfaceDescriptor(GradientButtonView gradientButtonView) {
        return ((Integer) IAuthTabCallback(-1805208056, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1805208063)).intValue();
    }

    private static final void onWarmupCompleted(GradientButtonView gradientButtonView, ResponseNetwork responseNetwork, float f, ValueAnimator valueAnimator) {
        IAuthTabCallback(-1296101371, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{gradientButtonView, responseNetwork, Float.valueOf(f), valueAnimator}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1296101371);
    }

    private static final void onWarmupCompleted(Function0 function0, View view) {
        IAuthTabCallback(258878283, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{function0, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -258878279);
    }
}
