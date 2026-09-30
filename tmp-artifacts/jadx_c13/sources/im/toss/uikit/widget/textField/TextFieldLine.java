package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ICrashFilter;
import o.IOOMCallback;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.enableThreadsBoost;
import o.getAdService;
import o.getDid;
import o.getInstallBeginTimestampServerSeconds;
import o.getReferrerClickTimestampSeconds;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.setCustomDataCallback;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TextFieldLine extends TextFieldLineLayout implements registerCrashCallback {
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onNavigationEvent = 1399737204;
    private static char onTransact = 27643;
    private final Lazy IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final Lazy onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[ICrashFilter.values().length];
            try {
                iArr[ICrashFilter.Impression.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ICrashFilter.Click.ordinal()] = 2;
                int i = IAuthTabCallback + 31;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i3 = onNavigationEvent + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 0;
            }
        }
    }

    private static String $$c(int i, byte b, short s) {
        int i2 = b * 2;
        byte[] bArr = $$a;
        int i3 = s + 109;
        int i4 = 4 - (i * 2);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            int i8 = i4 + 1;
            i3 = i7 + bArr[i4];
            i4 = i8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLine(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLine(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        TextFieldLine textFieldLine = (TextFieldLine) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(textFieldLine, onnavigationevent);
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ GestureDetector onExtraCallbackWithResult(Context context, TextFieldLine textFieldLine) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        GestureDetector gestureDetectorIAuthTabCallback = IAuthTabCallback(context, textFieldLine);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return gestureDetectorIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i5)) | i8 | (~(i2 | i5));
        int i10 = (~(i7 | (~i5))) | i8;
        int i11 = (~(i5 | i4)) | (~((~i2) | i4));
        int i12 = i4 + i2 + i3 + (929125522 * i) + (1849324972 * i6);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i4) + 1146290176 + ((-1462591364) * i2) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i3) + ((-291241984) * i) + (1012400128 * i6) + ((-1810169856) * i13);
        int i15 = ((i4 * (-2058557531)) - 518432259) + (i2 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i3 * (-2058558961)) + (i * 548722830) + (i6 * 1549712660) + (i13 * (-2087387136));
        return i14 + ((i15 * i15) * (-343605248)) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TextFieldLine textFieldLine = (TextFieldLine) objArr[0];
        View view = (View) objArr[1];
        MotionEvent motionEvent = (MotionEvent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(textFieldLine, view, motionEvent);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 55;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ GestureDetector onNavigationEvent(Context context, TextFieldLine textFieldLine) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(context, textFieldLine);
        }
        onWarmupCompleted(context, textFieldLine);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldLine(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = reportCustomErr.onNavigationEvent(this, IOOMCallback.TextField, false, (Function0) null, new Function1() { // from class: im.toss.uikit.widget.textField.TextFieldLine$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {this.f$0, (initSDK.onNavigationEvent) obj};
                    int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    unit = (Unit) TextFieldLine.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1487782555, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1487782554, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                    int i4 = 63 / 0;
                } else {
                    Object[] objArr2 = {this.f$0, (initSDK.onNavigationEvent) obj};
                    int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    unit = (Unit) TextFieldLine.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1487782555, objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1487782554, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                }
                int i5 = onWarmupCompleted + 23;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }, 4, (Object) null);
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.textField.TextFieldLine$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 79;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Context context2 = context;
                if (i4 != 0) {
                    return TextFieldLine.onExtraCallbackWithResult(context2, this);
                }
                TextFieldLine.onExtraCallbackWithResult(context2, this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.textField.TextFieldLine$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Context context2 = context;
                if (i4 == 0) {
                    return TextFieldLine.onNavigationEvent(context2, this);
                }
                int i5 = 83 / 0;
                return TextFieldLine.onNavigationEvent(context2, this);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldLine(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 125;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = asInterface + 69;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = asInterface + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = asInterface + 67;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackDefault + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.access000();
        }
        super/*o.setDeviceId*/.access000();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.initSDK*/.access100();
        }
        super/*o.initSDK*/.access100();
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.asBinder();
            obj.hashCode();
            throw null;
        }
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i3 = asInterface + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return function1AsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.extraCallback();
        }
        super/*o.MonitorCrashConfig*/.extraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        super/*o.MonitorCrashConfig*/.onNavigationEvent();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.onTransact();
            obj.hashCode();
            throw null;
        }
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i3 = IAuthTabCallbackDefault + 87;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return getdidOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = asInterface + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = asInterface + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = asInterface + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallbackDefault + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public setCustomDataCallback asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.IAuthTabCallback.getValue();
        int i3 = IAuthTabCallbackDefault + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return setcustomdatacallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(TextFieldLine textFieldLine, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        EditText editText;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        CharSequence hint = textFieldLine.getHint();
        Editable text = null;
        if (hint == null) {
            int i2 = IAuthTabCallbackDefault + 77;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                textFieldLine.getEditText();
                throw null;
            }
            EditText editText2 = textFieldLine.getEditText();
            hint = editText2 != null ? editText2.getHint() : null;
        }
        EditText editText3 = textFieldLine.getEditText();
        if (editText3 != null) {
            if (!getInstallBeginTimestampServerSeconds.IAuthTabCallbackStub(textFieldLine) && ((editText = textFieldLine.getEditText()) == null || !getInstallBeginTimestampServerSeconds.IAuthTabCallbackStub(editText))) {
                editText3 = null;
            }
            if (editText3 != null) {
                int i3 = asInterface + 95;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                text = editText3.getText();
                int i5 = asInterface + 25;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 61704), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), new char[]{33350, 54718, 16365, 23411}, new char[]{0, 0, 0, 0}, new char[]{32795, 59071, 2117, 9969}, objArr);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr[0]).intern(), new CharSequence[]{hint, text});
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackDefault extends GestureDetector.SimpleOnGestureListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallbackDefault() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(motionEvent, "");
                Object[] objArr = {onInstallReferrerSetupFinished.onWarmupCompleted, TextFieldLine.this, motionEvent};
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                getInstallBeginTimestampServerSeconds.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1713702609, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 1713702611, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr);
                return false;
            }
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Object[] objArr2 = {onInstallReferrerSetupFinished.onWarmupCompleted, TextFieldLine.this, motionEvent};
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            getInstallBeginTimestampServerSeconds.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1713702609, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, 1713702611, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2);
            return false;
        }
    }

    private final GestureDetector writeTypedObject() {
        GestureDetector gestureDetector;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            gestureDetector = (GestureDetector) this.onWarmupCompleted.getValue();
            int i3 = 40 / 0;
        } else {
            gestureDetector = (GestureDetector) this.onWarmupCompleted.getValue();
        }
        int i4 = IAuthTabCallbackDefault + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return gestureDetector;
    }

    private static final GestureDetector IAuthTabCallback(Context context, TextFieldLine textFieldLine) {
        int i = 2 % 2;
        GestureDetector gestureDetector = new GestureDetector(context, textFieldLine.new IAuthTabCallbackDefault());
        int i2 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return gestureDetector;
    }

    public static final class onExtraCallback extends GestureDetector.SimpleOnGestureListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallback() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            EditText editText = TextFieldLine.this.getEditText();
            if (editText != null) {
                getInstallBeginTimestampServerSeconds.onWarmupCompleted(onInstallReferrerSetupFinished.onWarmupCompleted, TextFieldLine.this, editText, motionEvent);
                return false;
            }
            int i4 = onWarmupCompleted + 39;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
    }

    private final GestureDetector readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        GestureDetector gestureDetector = (GestureDetector) this.onExtraCallback.getValue();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return gestureDetector;
    }

    private static final GestureDetector onWarmupCompleted(Context context, TextFieldLine textFieldLine) {
        int i = 2 % 2;
        GestureDetector gestureDetector = new GestureDetector(context, textFieldLine.new onExtraCallback());
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return gestureDetector;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onNavigationEvent + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    private static final boolean onWarmupCompleted(TextFieldLine textFieldLine, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTouchEvent = textFieldLine.readTypedObject().onTouchEvent(motionEvent);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.textField.TextFieldLineLayout
    public void onExtraCallbackWithResult(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        EditText editText;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(R.layout.text_field_line, (ViewGroup) this, true);
        int[] iArr = R.styleable.TextFieldLine;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TextFieldLine_editTextId, -1);
        if (resourceId != -1 && (editText = getEditText()) != null) {
            int i2 = asInterface + 47;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            editText.setId(resourceId);
        }
        typedArrayObtainStyledAttributes.recycle();
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getChildAt(0).setBackgroundResource(readIntokhttp.onWarmupCompleted(configuration) ? R.drawable.bg_text_field_underline_normal_selector_accessibility : R.drawable.bg_text_field_underline_normal_selector);
        AppCompatEditText editText2 = getEditText();
        AppCompatEditText appCompatEditText = editText2 instanceof AppCompatEditText ? editText2 : null;
        if (appCompatEditText != null) {
            appCompatEditText.setEmojiCompatEnabled(false);
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.textField.TextFieldLine$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 95;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {this.f$0, view, motionEvent};
                    if (i6 == 0) {
                        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                        return ((Boolean) TextFieldLine.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1139738834, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1139738834, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue();
                    }
                    int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    int i7 = 28 / 0;
                    return ((Boolean) TextFieldLine.onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1139738834, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1139738834, iOnExtraCallbackWithResult2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue();
                }
            });
        }
        EditText editText4 = getEditText();
        if (editText4 != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            int iOnActivityResized = new getUrlokhttp(new IAuthTabCallback(configuration2)).onActivityResized();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            editText4.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{iOnActivityResized, new getUrlokhttp(new onNavigationEvent(configuration3)).onRelationshipValidationResult()}));
            int i4 = asInterface + 83;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        super.onExtraCallbackWithResult(context, attributeSet);
    }

    public void setEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.setEnabled(z);
        EditText editText = getEditText();
        if (editText != null) {
            int i4 = IAuthTabCallbackDefault + 81;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            editText.setEnabled(z);
        }
    }

    public static /* synthetic */ void setNumberFormat$default(TextFieldLine textFieldLine, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNumberFormat");
        }
        int i7 = i4 + 33;
        int i8 = i7 % 128;
        asInterface = i8;
        if (i7 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            int i9 = i8 + 17;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            i = -1;
        }
        textFieldLine.setNumberFormat(i);
    }

    public static final class onWarmupCompleted implements TextWatcher {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private String IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        final /* synthetic */ int onExtraCallback;
        private int onExtraCallbackWithResult;
        final /* synthetic */ DecimalFormat onNavigationEvent;
        final /* synthetic */ EditText onWarmupCompleted;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackStub + 7;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            if (i6 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onWarmupCompleted(EditText editText, int i, DecimalFormat decimalFormat) {
            this.onWarmupCompleted = editText;
            this.onExtraCallback = i;
            this.onNavigationEvent = decimalFormat;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = onTransact + 59;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(editable, "");
            this.onWarmupCompleted.removeTextChangedListener(this);
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(new InputFilter[0]);
            editable.replace(0, editable.length(), this.IAuthTabCallback);
            editable.setFilters(filters);
            EditText editText = this.onWarmupCompleted;
            editText.setSelection(Math.max(0, Math.min(this.onExtraCallbackWithResult, editText.length())));
            this.onWarmupCompleted.addTextChangedListener(this);
            int i4 = onTransact + 85;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            long jLongValue;
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            String strReplace = new Regex("[^0-9-]").replace(charSequence, _UrlKt.FRAGMENT_ENCODE_SET);
            if (strReplace.length() <= 0) {
                this.IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
                this.onExtraCallbackWithResult = 0;
                return;
            }
            int length = i - new Regex("[^,]").replace(charSequence.subSequence(0, i), _UrlKt.FRAGMENT_ENCODE_SET).length();
            int length2 = new Regex("[^0-9-]").replace(charSequence.subSequence(i, i3 + i).toString(), _UrlKt.FRAGMENT_ENCODE_SET).length();
            String str = StringsKt__StringsJVMKt.startsWith$default(strReplace, "-", false, 2, null) ? "-" : _UrlKt.FRAGMENT_ENCODE_SET;
            if (this.onExtraCallback > 0) {
                int i6 = onTransact + 97;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0 ? strReplace.length() - str.length() > this.onExtraCallback : strReplace.length() + str.length() > this.onExtraCallback) {
                    String strSubstring = strReplace.substring(0, length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String strSubstring2 = strReplace.substring(length + length2, strReplace.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    String strSubstring3 = strReplace.substring(length, Math.min(length2, (this.onExtraCallback - (strSubstring.length() - str.length())) - strSubstring2.length()) + length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    strReplace = strSubstring + strSubstring3 + strSubstring2;
                    length2 = strSubstring3.length();
                }
            }
            int i7 = length + length2;
            int length3 = strReplace.length() - i7;
            int i8 = length3 / 3;
            if (i7 - str.length() == 0) {
                int i9 = onTransact + 69;
                IAuthTabCallbackStub = i9 % 128;
                i4 = (i9 % 2 == 0 ? length3 % 3 != 0 : length3 / 2 != 0) ? 0 : 1;
            }
            int iMax = Math.max(0, i8 - i4);
            if (!Intrinsics.areEqual(strReplace, "-")) {
                int i10 = IAuthTabCallbackStub + 3;
                onTransact = i10 % 128;
                if (i10 % 2 == 0) {
                    StringsKt__StringNumberConversionsKt.toLongOrNull(strReplace);
                    throw null;
                }
                DecimalFormat decimalFormat = this.onNavigationEvent;
                Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(strReplace);
                if (longOrNull != null) {
                    jLongValue = longOrNull.longValue();
                    int i11 = IAuthTabCallbackStub + 33;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    jLongValue = 0;
                }
                strReplace = decimalFormat.format(jLongValue);
                Intrinsics.checkNotNullExpressionValue(strReplace, "");
            }
            this.IAuthTabCallback = strReplace;
            this.onExtraCallbackWithResult = (strReplace.length() - length3) - iMax;
        }
    }

    public final void setNumberFormat(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        EditText editText = getEditText();
        if (editText != null) {
            editText.setText(_UrlKt.FRAGMENT_ENCODE_SET);
            editText.setInputType(4098);
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            decimalFormat.setNegativePrefix("-");
            editText.addTextChangedListener(new onWarmupCompleted(editText, i, decimalFormat));
            int i5 = asInterface + 99;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 59;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 43 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 1451 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 44 - Gravity.getAbsoluteGravity(0, 0), 1494 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), Color.argb(0, 0, 0, 0) + 50, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22938, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45848), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12577 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 15;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 87 / 0;
            objArr[0] = str;
        }
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        EditText editText = getEditText();
        Object obj = null;
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(new Regex("[^0-9-]").replace(String.valueOf(editText != null ? editText.getText() : null), _UrlKt.FRAGMENT_ENCODE_SET));
        if (longOrNull == null) {
            int i2 = IAuthTabCallbackDefault + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return 0L;
        }
        int i4 = asInterface + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return longOrNull.longValue();
        }
        longOrNull.longValue();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            if (!writeTypedObject().onTouchEvent(motionEvent) && !super/*android.view.View*/.onTouchEvent(motionEvent)) {
                return false;
            }
            int i4 = asInterface + 73;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iCrashFilter, "");
        int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[iCrashFilter.ordinal()];
        if (i2 == 1) {
            return super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        }
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 7;
        asInterface = i4 % 128;
        if (i4 % 2 != 0 ? i2 != 2 : i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = i3 + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return isEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@NotNull Canvas canvas) {
        onInstallReferrerServiceDisconnected oninstallreferrerservicedisconnected;
        SizeF sizeF;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 81;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*android.view.View*/.onDraw(canvas);
            oninstallreferrerservicedisconnected = onInstallReferrerServiceDisconnected.onExtraCallback;
            sizeF = null;
            i = 2;
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*android.view.View*/.onDraw(canvas);
            oninstallreferrerservicedisconnected = onInstallReferrerServiceDisconnected.onExtraCallback;
            sizeF = null;
            i = 4;
        }
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(oninstallreferrerservicedisconnected, this, canvas, sizeF, i, (Object) null);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TextFieldLine textFieldLine, initSDK.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1487782555, new Object[]{textFieldLine, onnavigationevent}, iOnExtraCallbackWithResult2, -1487782554, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static /* synthetic */ boolean IAuthTabCallback(TextFieldLine textFieldLine, View view, MotionEvent motionEvent) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1139738834, new Object[]{textFieldLine, view, motionEvent}, iOnExtraCallbackWithResult2, -1139738834, iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue();
    }
}
