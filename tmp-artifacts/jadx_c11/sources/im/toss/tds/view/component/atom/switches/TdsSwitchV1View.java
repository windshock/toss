package im.toss.tds.view.component.atom.switches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageFormat;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EnumC0079certificatePinner;
import o.ICrashFilter;
import o.OkHttpClientCompanion;
import o.deprecated_certificatePinner;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.eExternalSyntheticLambda0;
import o.enableThreadsBoost;
import o.getDid;
import o.getExtraParameters;
import o.getInstallBeginTimestampServerSeconds;
import o.getReferrerClickTimestampSeconds;
import o.head;
import o.initMiniApp;
import o.initSDK;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.pxToDp;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.runOnUiThreadDelayed;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsSwitchV1View extends CompoundButton implements registerCrashCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static boolean ICustomTabsCallback = false;
    private static char[] access000 = null;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static boolean getInterfaceDescriptor = false;
    private static int readTypedObject = 1;
    private static int writeTypedObject = 1;
    private final Lazy IAuthTabCallback;
    private runOnUiThreadDelayed IAuthTabCallbackDefault;
    private Paint IAuthTabCallbackStub;
    private final head IAuthTabCallback_Parcel;
    private Rally access100;
    private Rally asBinder;
    private float asInterface;
    private float onExtraCallback;
    private final int onExtraCallbackWithResult;
    private float onNavigationEvent;
    private final Paint onTransact;
    private CompoundButton.OnCheckedChangeListener onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[ICrashFilter.values().length];
            try {
                iArr[ICrashFilter.Click.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
            int i3 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static {
        extraCallbackWithResult();
        Companion = new onWarmupCompleted(null);
        int i = extraCallbackWithResult + 25;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSwitchV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSwitchV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(tdsSwitchV1View, fFloatValue);
        }
        IAuthTabCallbackDefault(tdsSwitchV1View, fFloatValue);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(tdsSwitchV1View, f);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = extraCallback + 9;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        String str;
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i5));
        int i10 = ~(i6 | i5);
        int i11 = ~i5;
        int i12 = (~(i4 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i6 + i5 + i + ((-1570926368) * i3) + ((-1409401439) * i2);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i6) - 657981440) + (821186744 * i5) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i) + (1124073472 * i3) + ((-332922880) * i2) + ((-1182662656) * i15);
        int i17 = (i6 * 1410161459) + 847508490 + (i5 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i * 1410159841) + (i3 * 1126552800) + (i2 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        if (i18 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 3) {
            return onExtraCallback(objArr);
        }
        if (i18 == 4) {
            return onNavigationEvent(objArr);
        }
        if (i18 != 5) {
            return onExtraCallbackWithResult(objArr);
        }
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        int i19 = 2 % 2;
        int i20 = writeTypedObject + 49;
        extraCallback = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (tdsSwitchV1View.isChecked()) {
            int i22 = extraCallback + 93;
            writeTypedObject = i22 % 128;
            int i23 = i22 % 2;
            str = "on";
        } else {
            str = "off";
        }
        onnavigationevent.onExtraCallback("status", str);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, 126 - ImageFormat.getBitsPerPixel(0), objArr2);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr2[0]).intern(), tdsSwitchV1View.getContentDescription());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(tdsSwitchV1View, fFloatValue);
        int i4 = extraCallback + 53;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(tdsSwitchV1View, f);
        int i4 = writeTypedObject + 115;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsSwitchV1View tdsSwitchV1View, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 690462419, new Object[]{tdsSwitchV1View, onnavigationevent}, -690462414);
        int i4 = extraCallback + 67;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsSwitchV1View, iIntValue, iIntValue2, fFloatValue);
        int i4 = extraCallback + 39;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(tdsSwitchV1View, fFloatValue);
        int i4 = writeTypedObject + 111;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            access000(tdsSwitchV1View, f);
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(tdsSwitchV1View, f);
        int i3 = extraCallback + 9;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAccess000;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(TdsSwitchV1View tdsSwitchV1View, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(tdsSwitchV1View, z);
        int i4 = extraCallback + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsSwitchV1View tdsSwitchV1View, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = writeTypedObject + 73;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsSwitchV1View, i, i2, f);
        if (i5 != 0) {
            int i6 = 55 / 0;
        }
        int i7 = extraCallback + 13;
        writeTypedObject = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 9 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsSwitchV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = reportCustomErr.onNavigationEvent(this, onCrash.Switch, false, (Function0) null, new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    TdsSwitchV1View.onExtraCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                    throw null;
                }
                Unit unitOnExtraCallback = TdsSwitchV1View.onExtraCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = onWarmupCompleted + 23;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 48 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 6, (Object) null);
        this.onExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SwitchHandleFill));
        this.onTransact = paint;
        this.IAuthTabCallback_Parcel = new head(this, (View) null, false, new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = TdsSwitchV1View.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
                int i5 = onNavigationEvent + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return appLovinSdkSettingsOnNavigationEvent;
            }
        }, 6, (DefaultConstructorMarker) null);
        setClickable(true);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(ICustomTabsCallback());
        paint2.setAlpha(writeTypedObject());
        this.IAuthTabCallbackStub = paint2;
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallback();
            throw null;
        }
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i3 = extraCallback + 75;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return setcustomdatacallbackAsInterface;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        Set<String> setIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
            int i3 = 17 / 0;
        } else {
            setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        int i4 = writeTypedObject + 43;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setIAuthTabCallbackStub;
        }
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
            throw null;
        }
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i3 = writeTypedObject + 77;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = writeTypedObject + 57;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.access000();
        }
        super/*o.setDeviceId*/.access000();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = extraCallback + 63;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return zAccess100;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = writeTypedObject + 23;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return function1AsBinder;
        }
        throw null;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = extraCallback + 85;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = writeTypedObject + 29;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        int i4 = writeTypedObject + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enablethreadsboostOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = extraCallback + 97;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ getDid onTransact() {
        getDid getdidOnTransact;
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
            int i3 = 37 / 0;
        } else {
            getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        }
        int i4 = extraCallback + 113;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return getdidOnTransact;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = writeTypedObject + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = extraCallback + 59;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = writeTypedObject + 107;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = writeTypedObject + 79;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 53;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = extraCallback + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = writeTypedObject + 105;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = extraCallback + 125;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsSwitchV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = writeTypedObject + 35;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = writeTypedObject + 21;
            extraCallback = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public setCustomDataCallback asInterface() {
        setCustomDataCallback setcustomdatacallback;
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setcustomdatacallback = (setCustomDataCallback) this.IAuthTabCallback.getValue();
            int i3 = 56 / 0;
        } else {
            setcustomdatacallback = (setCustomDataCallback) this.IAuthTabCallback.getValue();
        }
        int i4 = writeTypedObject + 73;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return setcustomdatacallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return o.RequestBodyCompanion.onNavigationEvent(r4, o.authParams.FillBrand);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((!isChecked()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((!isChecked()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = o.OkHttpClientCompanion.onWarmupCompleted(r4, o.eExternalSyntheticLambda0.SwitchContainerFillUncheckedEnabled);
        r2 = im.toss.tds.view.component.atom.switches.TdsSwitchV1View.extraCallback + 101;
        im.toss.tds.view.component.atom.switches.TdsSwitchV1View.writeTypedObject = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
    }

    private final int writeTypedObject() {
        float f;
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (isEnabled()) {
            int i4 = extraCallback + 123;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return ICustomTabsCallback() >>> 24;
        }
        float fICustomTabsCallback = ICustomTabsCallback() >>> 24;
        if (!(!isChecked())) {
            int i6 = extraCallback + 65;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            f = 0.3f;
        } else {
            f = 0.4f;
        }
        return (int) (fICustomTabsCallback * f);
    }

    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = f;
        invalidate();
        int i4 = extraCallback + 9;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = f;
        onActivityResized();
        invalidate();
        int i4 = extraCallback + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AppLovinSdkSettings IAuthTabCallback(TdsSwitchV1View tdsSwitchV1View, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 37;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
            if (z) {
                int i5 = i2 + 81;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                if (!tdsSwitchV1View.isEnabled()) {
                    int i7 = writeTypedObject + 81;
                    extraCallback = i7 % 128;
                    Object obj = null;
                    if (i7 % 2 == 0) {
                        tdsSwitchV1View.onMessageChannelReady();
                        return null;
                    }
                    tdsSwitchV1View.onMessageChannelReady();
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (z) {
        }
        if (z) {
            Object[] objArr = {noStore.Companion};
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            isOneShot.onExtraCallbackWithResult(tdsSwitchV1View, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        }
        Rally rally = tdsSwitchV1View.asBinder;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        return tdsSwitchV1View.onExtraCallback(z);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.onWarmupCompleted = onCheckedChangeListener;
        int i4 = writeTypedObject + 65;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setCheckedState$default(TdsSwitchV1View tdsSwitchV1View, boolean z, boolean z2, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = writeTypedObject + 69;
            extraCallback = i3 % 128;
            z2 = i3 % 2 == 0;
        }
        tdsSwitchV1View.setCheckedState(z, z2);
        int i4 = writeTypedObject + 77;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public final void setCheckedState(boolean z, boolean z2) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.setOnCheckedChangeListener(null);
            setChecked(z, z2);
            super.setOnCheckedChangeListener(this.onWarmupCompleted);
        } else {
            super.setOnCheckedChangeListener(null);
            setChecked(z, z2);
            super.setOnCheckedChangeListener(this.onWarmupCompleted);
            throw null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setChecked(z, true);
        int i4 = extraCallback + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setChecked(boolean z, boolean z2) throws Throwable {
        Object objValueOf;
        float f;
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsChecked = isChecked();
        super.setChecked(z);
        if (zIsChecked != z && !(!getInstallBeginTimestampServerSeconds.asInterface(this))) {
            onInstallReferrerSetupFinished.onExtraCallback(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        }
        onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 36614441, new Object[]{this}, -36614440);
        try {
            Result.Companion companion = Result.Companion;
            objValueOf = Result.constructor-impl(Float.valueOf(Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objValueOf = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objValueOf)) {
            objValueOf = Float.valueOf(1.0f);
        }
        float fFloatValue = ((Number) objValueOf).floatValue();
        if (z2) {
            int i4 = extraCallback;
            int i5 = i4 + 95;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            if (fFloatValue != 0.0f) {
                runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackDefault;
                if (runonuithreaddelayed != null) {
                    int i7 = i4 + 7;
                    writeTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                    runonuithreaddelayed.onNavigationEvent();
                }
                Rally rally = this.asBinder;
                if (rally != null) {
                    rally.ICustomTabsServiceStub();
                }
                this.IAuthTabCallbackDefault = IAuthTabCallback(z);
                this.asBinder = onNavigationEvent(z);
                runOnUiThreadDelayed runonuithreaddelayed2 = this.IAuthTabCallbackDefault;
                if (runonuithreaddelayed2 != null) {
                }
                Rally rally2 = this.asBinder;
                if (rally2 != null) {
                    int i9 = extraCallback + 101;
                    writeTypedObject = i9 % 128;
                    if (i9 % 2 == 0) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        runOnUiThreadDelayed runonuithreaddelayed3 = this.IAuthTabCallbackDefault;
        if (runonuithreaddelayed3 != null) {
            int i10 = extraCallback + 37;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            runonuithreaddelayed3.onNavigationEvent();
        }
        Rally rally3 = this.asBinder;
        if (rally3 != null) {
            rally3.ICustomTabsServiceStub();
        }
        if (z) {
            int i12 = writeTypedObject + 3;
            extraCallback = i12 % 128;
            int i13 = i12 % 2;
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        onExtraCallbackWithResult(f);
        this.onExtraCallback = z ? 1.0f : 0.0f;
        Paint paint = this.IAuthTabCallbackStub;
        if (paint != null) {
            paint.setColor(ICustomTabsCallback());
            paint.setAlpha(writeTypedObject());
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setChecked(!isChecked());
        int i4 = writeTypedObject + 55;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = access000;
        if (cArr3 != null) {
            int i5 = $10 + 95;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $11 + 15;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 77, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 77 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                i3 = 2;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 74 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0') + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (ICustomTabsCallback) {
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 111;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 63, 12215 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr4);
            int i11 = $10 + 47;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                int i12 = 74 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (!getInterfaceDescriptor) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62, TextUtils.indexOf("", "") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str2 = new String(cArr6);
        int i13 = $11 + 99;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str2;
        } else {
            int i14 = 65 / 0;
            objArr[0] = str2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCallback + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            super.onMeasure(i, i2);
            View.MeasureSpec.getMode(i);
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            throw null;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            int i5 = extraCallback + 23;
            int i6 = i5 % 128;
            writeTypedObject = i6;
            int i7 = i5 % 2;
            if (mode2 == 1073741824) {
                int i8 = i6 + 35;
                extraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    setMeasuredDimension(size, size2);
                    throw null;
                }
                setMeasuredDimension(size, size2);
                int i9 = extraCallback + 83;
                writeTypedObject = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(50.0f));
        int paddingLeft = getPaddingLeft();
        setMeasuredDimension(iOnExtraCallbackWithResult + paddingLeft + getPaddingRight(), setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(30.0f)) + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, Float.valueOf(999.0f));
        canvas.save();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float measuredWidth = getMeasuredWidth();
        float paddingRight = getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        float paddingBottom = getPaddingBottom();
        Paint paint = this.IAuthTabCallbackStub;
        Intrinsics.checkNotNull(paint);
        canvas.drawRoundRect(paddingLeft, paddingTop, measuredWidth - paddingRight, measuredHeight - paddingBottom, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult, paint);
        canvas.restore();
        canvas.save();
        float fOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(this, 16) + (setTagsokhttp.onExtraCallbackWithResult(this, 8) * this.asInterface);
        float f = this.onExtraCallbackWithResult;
        float fOnExtraCallbackWithResult3 = setTagsokhttp.onExtraCallbackWithResult(this, 4);
        float f2 = this.onExtraCallback;
        float measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        canvas.translate(f + (fOnExtraCallbackWithResult3 * (1.0f - f2)) + (((measuredWidth2 - fOnExtraCallbackWithResult2) - (this.onExtraCallbackWithResult << 1)) * this.onExtraCallback), (getMeasuredHeight() - fOnExtraCallbackWithResult2) / 2.0f);
        canvas.drawOval(0.0f, 0.0f, fOnExtraCallbackWithResult2, fOnExtraCallbackWithResult2, this.onTransact);
        canvas.restore();
        onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        int i4 = extraCallback + 21;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(this, motionEvent)) {
            this.IAuthTabCallback_Parcel.onNavigationEvent(motionEvent);
            return super.onTouchEvent(motionEvent);
        }
        int i2 = writeTypedObject;
        int i3 = i2 + 7;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.setPressed(z);
        this.IAuthTabCallback_Parcel.onNavigationEvent(z);
        int i4 = extraCallback + 53;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = this.access100;
        if (rally == null || !rally.postMessage()) {
            Rally typedObject = readTypedObject();
            this.access100 = typedObject;
            if (typedObject != null) {
                int i4 = extraCallback + 113;
                writeTypedObject = i4 % 128;
            }
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.access100());
        }
    }

    private final Rally readTypedObject() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 81;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyOnWarmupCompleted = RallysKt.onWarmupCompleted((View) this, (List) deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 100L, false, 1404, (Object) null);
        int i4 = extraCallback + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return rallyOnWarmupCompleted;
    }

    @Override // android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return "android.widget.Switch";
        }
        int i3 = 33 / 0;
        return "android.widget.Switch";
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) objArr[0];
        int i2 = 2 % 2;
        int i3 = extraCallback + 121;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            if (tdsSwitchV1View.isChecked()) {
                i = R.string.abc_capital_on;
                int i4 = writeTypedObject + 27;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i = R.string.abc_capital_off;
            }
            ViewCompat.onWarmupCompleted(tdsSwitchV1View, tdsSwitchV1View.getResources().getString(i));
            return null;
        }
        tdsSwitchV1View.isChecked();
        throw null;
    }

    private static final Unit asBinder(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            tdsSwitchV1View.onWarmupCompleted(f);
            return Unit.INSTANCE;
        }
        tdsSwitchV1View.onWarmupCompleted(f);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a0, code lost:
    
        r5 = (o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{o.deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368);
        r11 = o.isMuted.asBinder(r5, r2, r6, null, 4, null);
        r1 = r20.onNavigationEvent;
        r4 = new java.lang.Object[]{r11, java.lang.Float.valueOf(r1), java.lang.Float.valueOf(0.0f), new im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda1(r20), null, 8, null};
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0106, code lost:
    
        return (o.AppLovinSdkSettings) o.isMuted.onWarmupCompleted(com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), 757421567, r4, -757421537, com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r21 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r21 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r7 = (o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{o.deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368);
        r13 = o.isMuted.asBinder(r7, r6, r2, null, 4, null);
        r2 = r20.onNavigationEvent;
        r8 = new java.lang.Object[]{r13, java.lang.Float.valueOf(r2), java.lang.Float.valueOf(1.0f), new im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda0(r20), null, 8, null};
        r2 = (o.AppLovinSdkSettings) o.isMuted.onWarmupCompleted(com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), 757421567, r8, -757421537, com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult());
        r3 = im.toss.tds.view.component.atom.switches.TdsSwitchV1View.extraCallback + 27;
        im.toss.tds.view.component.atom.switches.TdsSwitchV1View.writeTypedObject = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AppLovinSdkSettings onExtraCallback(boolean z) {
        Float fValueOf;
        Float fValueOf2;
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            fValueOf = Float.valueOf(0.96f);
            fValueOf2 = Float.valueOf(0.0f);
        } else {
            fValueOf = Float.valueOf(0.96f);
            fValueOf2 = Float.valueOf(1.0f);
        }
    }

    private static final Unit IAuthTabCallbackStub(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        tdsSwitchV1View.onWarmupCompleted(f);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r2
      0x002b: PHI (r2v6 int) = (r2v5 int), (r2v12 int) binds: [B:10:0x0029, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[PHI: r2
      0x0032: PHI (r2v11 int) = (r2v5 int), (r2v12 int) binds: [B:10:0x0029, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityResized() {
        int iICustomTabsCallback;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        Paint paint = this.IAuthTabCallbackStub;
        if (paint != null) {
            int i2 = writeTypedObject + 41;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iICustomTabsCallback = ICustomTabsCallback();
                int i3 = 46 / 0;
                if (isChecked()) {
                    iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SwitchContainerFillCheckedPressed);
                } else {
                    iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SwitchContainerFillUncheckedPressed);
                }
            } else {
                iICustomTabsCallback = ICustomTabsCallback();
                if (isChecked()) {
                }
            }
            paint.setColor(new setHasUserConsent(iICustomTabsCallback, iOnWarmupCompleted).IAuthTabCallback(this.onNavigationEvent).intValue());
        }
        Paint paint2 = this.IAuthTabCallbackStub;
        if (paint2 != null) {
            paint2.setAlpha(writeTypedObject());
            int i4 = writeTypedObject + 69;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        }
    }

    private static final Unit asInterface(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
        if (runonuithreaddelayed != null) {
            int i2 = extraCallback + 17;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (runonuithreaddelayed.postMessage()) {
                int i4 = extraCallback + 43;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                tdsSwitchV1View.onExtraCallbackWithResult(f);
                int i6 = writeTypedObject + 53;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            runOnUiThreadDelayed runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = tdsSwitchV1View.IAuthTabCallbackDefault;
        if (runonuithreaddelayed2 != null && runonuithreaddelayed2.postMessage()) {
            tdsSwitchV1View.onExtraCallback = f;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = extraCallback + 93;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final runOnUiThreadDelayed IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
            return RallysKt.onWarmupCompleted(null, iAuthTabCallback, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.asInterface), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = {this.f$0, Float.valueOf(((Float) obj2).floatValue())};
                    int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                    Unit unit = (Unit) TdsSwitchV1View.onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -180955447, objArr, 180955450);
                    int i6 = IAuthTabCallback + 117;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 52 / 0;
                    }
                    return unit;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.onExtraCallback), Float.valueOf(1.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 125;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = {this.f$0, Float.valueOf(((Float) obj2).floatValue())};
                        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {this.f$0, Float.valueOf(((Float) obj2).floatValue())};
                    int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                    Unit unit = (Unit) TdsSwitchV1View.onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, -1502898444, objArr2, 1502898446);
                    int i5 = onExtraCallback + 105;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
        }
        pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
        deprecated_certificatePinner deprecated_certificatepinner2 = deprecated_certificatePinner.onExtraCallbackWithResult;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(null, iAuthTabCallback2, CollectionsKt.listOf(new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.asInterface), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 1;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = TdsSwitchV1View.onNavigationEvent(this.f$0, ((Float) obj2).floatValue());
                int i6 = onExtraCallback + 29;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return unitOnNavigationEvent;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatepinner2.IAuthTabCallback()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.onExtraCallback), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = TdsSwitchV1View.IAuthTabCallback(this.f$0, ((Float) obj2).floatValue());
                if (i5 == 0) {
                    int i6 = 31 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3833, null);
        int i3 = extraCallback + 109;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return runonuithreaddelayedOnWarmupCompleted;
    }

    private static final Unit access000(TdsSwitchV1View tdsSwitchV1View, float f) {
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
        if (runonuithreaddelayed != null) {
            int i2 = extraCallback + 103;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (runonuithreaddelayed.postMessage()) {
                tdsSwitchV1View.onExtraCallbackWithResult(f);
                int i4 = writeTypedObject + 109;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.runOnUiThreadDelayed) = (r1v4 o.runOnUiThreadDelayed), (r1v7 o.runOnUiThreadDelayed) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStubProxy(TdsSwitchV1View tdsSwitchV1View, float f) {
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
            int i3 = 58 / 0;
            if (runonuithreaddelayed != null) {
                if (runonuithreaddelayed.postMessage()) {
                    tdsSwitchV1View.onExtraCallback = f;
                    int i4 = writeTypedObject + 113;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } else {
            runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
            if (runonuithreaddelayed != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(TdsSwitchV1View tdsSwitchV1View, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = extraCallback + 105;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        int i6 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
        if (runonuithreaddelayed != null) {
            int i7 = i5 + 47;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (runonuithreaddelayed.postMessage()) {
                Paint paint = tdsSwitchV1View.IAuthTabCallbackStub;
                if (paint != null) {
                    paint.setColor(new setHasUserConsent(i, i2).IAuthTabCallback(tdsSwitchV1View.asInterface).intValue());
                    int i9 = writeTypedObject + 85;
                    extraCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
                Paint paint2 = tdsSwitchV1View.IAuthTabCallbackStub;
                if (paint2 != null) {
                    paint2.setAlpha(tdsSwitchV1View.writeTypedObject());
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i11 = extraCallback + 83;
        writeTypedObject = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0031, PHI: r0
      0x0022: PHI (r0v28 android.graphics.Paint) = (r0v27 android.graphics.Paint), (r0v35 android.graphics.Paint) binds: [B:9:0x0020, B:6:0x0019] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0012, B:12:0x002c, B:10:0x0022, B:8:0x001c), top: B:32:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Rally onNavigationEvent(boolean z) {
        Object obj;
        final int iICustomTabsCallback;
        Paint paint;
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        writeTypedObject = i2 % 128;
        Object obj2 = null;
        try {
            if (i2 % 2 == 0) {
                Result.Companion companion = Result.Companion;
                paint = this.IAuthTabCallbackStub;
                int i3 = 91 / 0;
                numValueOf = paint != null ? Integer.valueOf(paint.getColor()) : null;
            } else {
                Result.Companion companion2 = Result.Companion;
                paint = this.IAuthTabCallbackStub;
                if (paint != null) {
                }
            }
            obj = Result.constructor-impl(numValueOf);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = extraCallback + 71;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            obj2 = obj;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            int i6 = extraCallback + 35;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                iICustomTabsCallback = num.intValue();
                int i7 = 2 / 0;
            } else {
                iICustomTabsCallback = num.intValue();
            }
        } else {
            iICustomTabsCallback = ICustomTabsCallback();
        }
        final int iICustomTabsCallback2 = ICustomTabsCallback();
        if (z) {
            return (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.asInterface), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 11;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    TdsSwitchV1View tdsSwitchV1View = this.f$0;
                    if (i10 != 0) {
                        Object[] objArr = {tdsSwitchV1View, Integer.valueOf(iICustomTabsCallback), Integer.valueOf(iICustomTabsCallback2), Float.valueOf(((Float) obj3).floatValue())};
                        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                        return (Unit) TdsSwitchV1View.onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -533601250, objArr, 533601250);
                    }
                    Object[] objArr2 = {tdsSwitchV1View, Integer.valueOf(iICustomTabsCallback), Integer.valueOf(iICustomTabsCallback2), Float.valueOf(((Float) obj3).floatValue())};
                    int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
                    int i11 = 25 / 0;
                    return (Unit) TdsSwitchV1View.onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, -533601250, objArr2, 533601250);
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        }
        return (Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{(AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(this.asInterface), Float.valueOf(0.0f), new Function1() { // from class: im.toss.tds.view.component.atom.switches.TdsSwitchV1View$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj3) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 73;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                TdsSwitchV1View tdsSwitchV1View = this.f$0;
                if (i10 != 0) {
                    return TdsSwitchV1View.onWarmupCompleted(tdsSwitchV1View, iICustomTabsCallback2, iICustomTabsCallback, ((Float) obj3).floatValue());
                }
                Unit unitOnWarmupCompleted = TdsSwitchV1View.onWarmupCompleted(tdsSwitchV1View, iICustomTabsCallback2, iICustomTabsCallback, ((Float) obj3).floatValue());
                int i11 = 3 / 0;
                return unitOnWarmupCompleted;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
    }

    private static final Unit onExtraCallbackWithResult(TdsSwitchV1View tdsSwitchV1View, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = extraCallback;
        int i5 = i4 + 7;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = tdsSwitchV1View.IAuthTabCallbackDefault;
        if (runonuithreaddelayed != null) {
            int i7 = i4 + 117;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            if (runonuithreaddelayed.postMessage()) {
                Paint paint = tdsSwitchV1View.IAuthTabCallbackStub;
                if (paint != null) {
                    paint.setColor(new setHasUserConsent(i, i2).IAuthTabCallback(tdsSwitchV1View.asInterface).intValue());
                    int i9 = extraCallback + 51;
                    writeTypedObject = i9 % 128;
                    int i10 = i9 % 2;
                }
                Paint paint2 = tdsSwitchV1View.IAuthTabCallbackStub;
                if (paint2 != null) {
                    int i11 = extraCallback + 15;
                    writeTypedObject = i11 % 128;
                    int i12 = i11 % 2;
                    paint2.setAlpha(tdsSwitchV1View.writeTypedObject());
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zPerformClick = super.performClick();
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        int i4 = writeTypedObject + 5;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zPerformClick;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return super/*o.setDeviceId*\/.onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (im.toss.tds.view.component.atom.switches.TdsSwitchV1View.onExtraCallback.IAuthTabCallback[r5.ordinal()] == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (im.toss.tds.view.component.atom.switches.TdsSwitchV1View.onExtraCallback.IAuthTabCallback[r5.ordinal()] == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r5 = im.toss.tds.view.component.atom.switches.TdsSwitchV1View.writeTypedObject + 83;
        im.toss.tds.view.component.atom.switches.TdsSwitchV1View.extraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
        } else {
            Intrinsics.checkNotNullParameter(iCrashFilter, "");
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(TdsSwitchV1View tdsSwitchV1View, int i, int i2, float f) {
        Object[] objArr = {tdsSwitchV1View, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -533601250, objArr, 533601250);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsSwitchV1View tdsSwitchV1View, float f) {
        Object[] objArr = {tdsSwitchV1View, Float.valueOf(f)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -1502898444, objArr, 1502898446);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsSwitchV1View tdsSwitchV1View, float f) {
        Object[] objArr = {tdsSwitchV1View, Float.valueOf(f)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -180955447, objArr, 180955450);
    }

    public static /* synthetic */ Unit onTransact(TdsSwitchV1View tdsSwitchV1View, float f) {
        Object[] objArr = {tdsSwitchV1View, Float.valueOf(f)};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onExtraCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, 430067090, objArr, -430067086);
    }

    private static final Unit IAuthTabCallback(TdsSwitchV1View tdsSwitchV1View, initSDK.onNavigationEvent onnavigationevent) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (Unit) onExtraCallback(iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 690462419, new Object[]{tdsSwitchV1View, onnavigationevent}, -690462414);
    }

    private final void onActivityLayout() throws Throwable {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        onExtraCallback(iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 36614441, new Object[]{this}, -36614440);
    }

    static void extraCallbackWithResult() {
        access000 = new char[]{32411, 32618, 32415};
        IAuthTabCallbackStubProxy = -1184334057;
        getInterfaceDescriptor = true;
        ICustomTabsCallback = true;
    }
}
