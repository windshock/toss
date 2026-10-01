package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.AppCompatEditText;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.uikit.R;
import im.toss.uikit.widget.textField.BaseEditText$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertificatePinnerBuilder;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.ICrashFilter;
import o.IOOMCallback;
import o.enableThreadsBoost;
import o.getDid;
import o.getInstallBeginTimestampServerSeconds;
import o.getReferrerClickTimestampSeconds;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.safeSizeOf;
import o.setCustomDataCallback;
import o.setDone;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class BaseEditText extends AppCompatEditText implements registerCrashCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder;
    private onExtraCallback IAuthTabCallback;
    private IAuthTabCallback onExtraCallback;
    private final InputFilter onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onWarmupCompleted;
    private static char[] IAuthTabCallbackDefault = {32412, 32611, 32400};
    private static int asInterface = -1184334072;
    private static boolean IAuthTabCallbackStub = true;
    private static boolean onTransact = true;

    public interface onExtraCallback {
        void onWarmupCompleted(@NotNull int[] iArr);
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[ICrashFilter.values().length];
            try {
                iArr[ICrashFilter.Impression.ordinal()] = 1;
                int i = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ICrashFilter.Click.ordinal()] = 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i4 = onExtraCallback + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(BaseEditText baseEditText, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(baseEditText, onnavigationevent);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = asBinder + 55;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(charSequence, i, i2, spanned, i3, i4);
        if (i7 == 0) {
            int i8 = 10 / 0;
        }
        return charSequenceOnNavigationEvent;
    }

    public static /* synthetic */ safeSizeOf onNavigationEvent(BaseEditText baseEditText) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(baseEditText);
            obj.hashCode();
            throw null;
        }
        safeSizeOf safesizeofOnExtraCallbackWithResult = onExtraCallbackWithResult(baseEditText);
        int i3 = IAuthTabCallback_Parcel + 63;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return safesizeofOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
            throw null;
        }
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i3 = IAuthTabCallback_Parcel + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = asBinder + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventAccess000;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.initSDK*/.access100();
            throw null;
        }
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i3 = IAuthTabCallback_Parcel + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = asBinder + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = IAuthTabCallback_Parcel + 81;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return zExtraCallback;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = asBinder + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.onExtraCallback();
            throw null;
        }
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i3 = IAuthTabCallback_Parcel + 91;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = asBinder + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return initminiappOnExtraCallbackWithResult;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        super/*o.MonitorCrashConfig*/.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = asBinder + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onTransact();
        }
        super/*o.MonitorCrashConfig*/.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = asBinder + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = IAuthTabCallback_Parcel + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        int i4 = IAuthTabCallback_Parcel + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IAuthTabCallback_Parcel + 85;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 69;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = asBinder + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = asBinder + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public setCustomDataCallback asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return setcustomdatacallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(BaseEditText baseEditText, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        CharSequence hint = baseEditText.getHint();
        Editable text = baseEditText.getText();
        if (text != null) {
            int i4 = IAuthTabCallback_Parcel + 125;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (getInstallBeginTimestampServerSeconds.IAuthTabCallbackStub(baseEditText)) {
                int i6 = asBinder + 65;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 10 / 0;
                }
            } else {
                text = null;
            }
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr[0]).intern(), new CharSequence[]{hint, text});
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent extends GestureDetector.SimpleOnGestureListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        onNavigationEvent() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(motionEvent, "");
                Object[] objArr = {onInstallReferrerSetupFinished.onWarmupCompleted, BaseEditText.this, motionEvent};
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                getInstallBeginTimestampServerSeconds.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1713702609, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 1713702611, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr);
                return false;
            }
            Intrinsics.checkNotNullParameter(motionEvent, "");
            Object[] objArr2 = {onInstallReferrerSetupFinished.onWarmupCompleted, BaseEditText.this, motionEvent};
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            getInstallBeginTimestampServerSeconds.onExtraCallbackWithResult(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1713702609, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, 1713702611, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr2);
            return false;
        }
    }

    private final safeSizeOf readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        safeSizeOf safesizeof = (safeSizeOf) this.onNavigationEvent.getValue();
        int i4 = asBinder + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return safesizeof;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final safeSizeOf onExtraCallbackWithResult(BaseEditText baseEditText) {
        int i = 2 % 2;
        safeSizeOf safesizeof = new safeSizeOf(baseEditText.getContext(), baseEditText.new onNavigationEvent());
        int i2 = asBinder + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return safesizeof;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = reportCustomErr.onNavigationEvent(this, IOOMCallback.TextField, false, (Function0) null, new BaseEditText$.ExternalSyntheticLambda0(this), 4, (Object) null);
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new BaseEditText$.ExternalSyntheticLambda1(this));
        this.onExtraCallbackWithResult = new BaseEditText$.ExternalSyntheticLambda2();
        onExtraCallback(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = reportCustomErr.onNavigationEvent(this, IOOMCallback.TextField, false, (Function0) null, new BaseEditText$.ExternalSyntheticLambda0(this), 4, (Object) null);
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new BaseEditText$.ExternalSyntheticLambda1(this));
        this.onExtraCallbackWithResult = new BaseEditText$.ExternalSyntheticLambda2();
        onExtraCallback(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseEditText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 89;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            int i5 = i2 + 123;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = reportCustomErr.onNavigationEvent(this, IOOMCallback.TextField, false, (Function0) null, new BaseEditText$.ExternalSyntheticLambda0(this), 4, (Object) null);
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new BaseEditText$.ExternalSyntheticLambda1(this));
        this.onExtraCallbackWithResult = new BaseEditText$.ExternalSyntheticLambda2();
        onExtraCallback(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = asBinder;
            int i5 = i4 + 125;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2 == 0 ? 1 : 0;
            int i7 = i4 + 125;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i = i6;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super/*android.view.View*/.onDraw(canvas);
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted implements TextWatcher {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Context IAuthTabCallback;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onWarmupCompleted + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallback + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onWarmupCompleted(Context context) {
            this.IAuthTabCallback = context;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            Object obj = null;
            if (editable == null) {
                int i2 = onExtraCallback + 5;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) editable, "️", 0, false, 6, (Object) null);
            if (iIndexOf$default < 0) {
                CertificatePinnerBuilder.Companion.onExtraCallback(this.IAuthTabCallback, editable);
                int i3 = onWarmupCompleted + 113;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            editable.replace(iIndexOf$default, iIndexOf$default + 1, _UrlKt.FRAGMENT_ENCODE_SET);
            int i5 = onWarmupCompleted + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[PHI: r6
      0x0046: PHI (r6v7 int) = (r6v3 int), (r6v8 int) binds: [B:12:0x0044, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(Context context, AttributeSet attributeSet) {
        int index;
        int i = 2 % 2;
        int resId = response.Regular.getResId();
        if (attributeSet != null) {
            int i2 = IAuthTabCallback_Parcel + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BaseEditText);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount) {
                int i5 = IAuthTabCallback_Parcel + 119;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    index = typedArrayObtainStyledAttributes.getIndex(i4);
                    int i6 = 32 / 0;
                    if (index == R.styleable.BaseEditText_android_fontFamily) {
                        resId = typedArrayObtainStyledAttributes.getResourceId(index, resId);
                    }
                } else {
                    index = typedArrayObtainStyledAttributes.getIndex(i4);
                    if (index == R.styleable.BaseEditText_android_fontFamily) {
                    }
                }
                i4++;
                int i7 = asBinder + 113;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i9 = IAuthTabCallback_Parcel + 119;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        super.setEmojiCompatEnabled(false);
        InputFilter[] filters = getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        setFilters((InputFilter[]) ArraysKt___ArraysJvmKt.plus(filters, this.onExtraCallbackWithResult));
        addTextChangedListener(new onWarmupCompleted(context));
        Editable editableText = getEditableText();
        if (editableText != null) {
            int i11 = IAuthTabCallback_Parcel + 25;
            asBinder = i11 % 128;
            if (i11 % 2 != 0) {
                CertificatePinnerBuilder.Companion.onExtraCallback(context, editableText);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CertificatePinnerBuilder.Companion.onExtraCallback(context, editableText);
        }
        setFont(resId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            return true;
        }
        if (!readTypedObject().onExtraCallbackWithResult(motionEvent)) {
            int i2 = IAuthTabCallback_Parcel + 13;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (!super/*android.view.View*/.onTouchEvent(motionEvent)) {
                int i4 = asBinder + 51;
                int i5 = i4 % 128;
                IAuthTabCallback_Parcel = i5;
                z = i4 % 2 == 0;
                int i6 = i5 + 35;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = isEnabled();
        r1 = im.toss.uikit.widget.textField.BaseEditText.asBinder + 51;
        im.toss.uikit.widget.textField.BaseEditText.IAuthTabCallback_Parcel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return super/*o.setDeviceId*\/.onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 != 2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 19;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
            i = onExtraCallbackWithResult.onWarmupCompleted[iCrashFilter.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
            i = onExtraCallbackWithResult.onWarmupCompleted[iCrashFilter.ordinal()];
        }
    }

    public static final class IAuthTabCallbackDefault implements IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function2<Integer, KeyEvent, Boolean> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackDefault(Function2<? super Integer, ? super KeyEvent, Boolean> function2) {
            this.onNavigationEvent = function2;
        }

        public boolean onExtraCallbackWithResult(int i, KeyEvent keyEvent) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(keyEvent, "");
                this.onNavigationEvent.invoke(Integer.valueOf(i), keyEvent).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(keyEvent, "");
            boolean zBooleanValue = this.onNavigationEvent.invoke(Integer.valueOf(i), keyEvent).booleanValue();
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        }
    }

    public final void setOnKeyPreImeListener(@NotNull Function2<? super Integer, ? super KeyEvent, Boolean> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallback = new IAuthTabCallbackDefault(function2);
        int i2 = asBinder + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asBinder implements onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function1<int[], Unit> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        asBinder(Function1<? super int[], Unit> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        @Override // im.toss.uikit.widget.textField.BaseEditText.onExtraCallback
        public void onWarmupCompleted(int[] iArr) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(iArr, "");
            this.onExtraCallbackWithResult.invoke(iArr);
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setOnDrawableStateChangedListener(@NotNull Function1<? super int[], Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = new asBinder(function1);
        int i2 = asBinder + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, @NotNull KeyEvent keyEvent) {
        boolean zOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(keyEvent, "");
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        boolean z = false;
        if (iAuthTabCallback != null) {
            int i3 = asBinder + 115;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(i, keyEvent);
                int i4 = 21 / 0;
            } else {
                zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(i, keyEvent);
            }
            z = zOnExtraCallbackWithResult;
        }
        if (!(!z)) {
            return z;
        }
        int i5 = IAuthTabCallback_Parcel + 11;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        int i = 2 % 2;
        super.drawableStateChanged();
        onExtraCallback onextracallback = this.IAuthTabCallback;
        if (onextracallback != null) {
            int i2 = IAuthTabCallback_Parcel + 83;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int[] drawableState = getDrawableState();
            Intrinsics.checkNotNullExpressionValue(drawableState, "");
            onextracallback.onWarmupCompleted(drawableState);
            int i4 = IAuthTabCallback_Parcel + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackDefault;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 76 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), 74 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onTransact) {
            int i4 = $11 + 63;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i6 = $10 + 83;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $10 + 69;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) + 63, (ViewConfiguration.getPressedStateDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 62 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CharSequence onNavigationEvent(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback_Parcel + 17;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = i; i8 < i2; i8++) {
            int i9 = asBinder + 65;
            IAuthTabCallback_Parcel = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 62 / 0;
                if (charSequence.charAt(i8) == 65039) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
                    int i11 = IAuthTabCallback_Parcel + 69;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                    for (length = spannableStringBuilder.length() - 1; length >= 0; length--) {
                        if (spannableStringBuilder.charAt(length) == 65039) {
                            int i13 = IAuthTabCallback_Parcel + 105;
                            asBinder = i13 % 128;
                            int i14 = i13 % 2;
                            spannableStringBuilder.delete(length, length + 1);
                        }
                    }
                    return spannableStringBuilder;
                }
            } else {
                if (charSequence.charAt(i8) == 65039) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence, i, i2);
                    int i112 = IAuthTabCallback_Parcel + 69;
                    asBinder = i112 % 128;
                    int i122 = i112 % 2;
                    while (length >= 0) {
                    }
                    return spannableStringBuilder2;
                }
            }
        }
        int i15 = IAuthTabCallback_Parcel + 103;
        asBinder = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 38 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFont(@NotNull response responseVar) {
        Typeface typeface$default;
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(responseVar, "");
            typeface$default = response.toTypeface$default(responseVar, getContext(), (setDone) null, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(responseVar, "");
            typeface$default = response.toTypeface$default(responseVar, getContext(), (setDone) null, 2, (Object) null);
        }
        setTypeface(typeface$default);
        int i3 = asBinder + 23;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFont(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 69;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (i == 0 || isInEditMode()) {
            return;
        }
        int i5 = asBinder + 41;
        IAuthTabCallback_Parcel = i5 % 128;
        setTypeface(i5 % 2 == 0 ? response.toTypeface$default(response.Companion.onExtraCallback(i), getContext(), (setDone) null, 4, (Object) null) : response.toTypeface$default(response.Companion.onExtraCallback(i), getContext(), (setDone) null, 2, (Object) null));
    }
}
