package im.toss.uikit.widget.actionbar;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.Typography6;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ICrashFilter;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.deprecated_certificatePinner;
import o.deprecated_noTransform;
import o.enableThreadsBoost;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDid;
import o.getReferrerClickTimestampSeconds;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.head;
import o.initMiniApp;
import o.initSDK;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.onCrash;
import o.onInstallReferrerServiceDisconnected;
import o.onInstallReferrerSetupFinished;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.setCustomDataCallback;
import o.setHasUserConsent;
import o.setTagsokhttp;
import o.setVisitUrl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsActionBarText extends Typography6 implements registerCrashCallback {
    private final Lazy onExtraCallback;
    private final head onExtraCallbackWithResult;
    private float onNavigationEvent;
    private static final byte[] $$a = {109, 5, -57, 108};
    private static final int $$b = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onTransact = -1776194565;
    private static char asInterface = 33293;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 110 - b;
        int i4 = b2 * 2;
        int i5 = 3 - (i * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i3 += i5;
            i5 = i7;
            i2 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i9];
            i5 = i3;
            i3 = b3;
            i8 = i2 + 1;
            i7 = i9;
            i3 += i5;
            i5 = i7;
            i2 = i8;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(TdsActionBarText tdsActionBarText, int i, int i2, boolean z) {
        int i3 = 2 % 2;
        int i4 = asBinder + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsActionBarText, i, i2, z);
        if (i5 != 0) {
            int i6 = 5 / 0;
        }
        int i7 = asBinder + 113;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 23 / 0;
        }
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsActionBarText tdsActionBarText, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tdsActionBarText, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsActionBarText, onnavigationevent);
        int i3 = IAuthTabCallbackDefault + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsActionBarText(@NotNull Context context) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = reportCustomErr.onNavigationEvent(this, onCrash.NavigationButton, false, (Function0) null, new Function1() { // from class: im.toss.uikit.widget.actionbar.TdsActionBarText$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = TdsActionBarText.onExtraCallback(this.f$0, (initSDK.onNavigationEvent) obj);
                int i4 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 6, (Object) null);
        setClickable(true);
        setMinWidth(setTagsokhttp.onExtraCallbackWithResult(this, 48));
        setGravity(17);
        onNavigationEvent(response.SemiBold);
        int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 8);
        int iOnExtraCallbackWithResult2 = setTagsokhttp.onExtraCallbackWithResult(this, 12);
        setPadding(iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        setTextSize(2, 16.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        final int iOnUnminimized = new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Resources resources = context3.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        final int iIAuthTabCallback_Parcel = new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration2)).IAuthTabCallback_Parcel();
        setTextColor(iIAuthTabCallback_Parcel);
        Drawable drawableOnExtraCallback = deprecated_noTransform.onExtraCallback(setTagsokhttp.onExtraCallbackWithResult(this, 16));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration3 = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        drawableOnExtraCallback.setTint(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallbackWithResult(configuration3))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        drawableOnExtraCallback.setAlpha(0);
        setBackground(drawableOnExtraCallback);
        this.onExtraCallbackWithResult = new head(this, (View) null, false, new Function1() { // from class: im.toss.uikit.widget.actionbar.TdsActionBarText$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onExtraCallback = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    TdsActionBarText.IAuthTabCallback(this.f$0, iIAuthTabCallback_Parcel, iOnUnminimized, ((Boolean) obj).booleanValue());
                    throw null;
                }
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = TdsActionBarText.IAuthTabCallback(this.f$0, iIAuthTabCallback_Parcel, iOnUnminimized, ((Boolean) obj).booleanValue());
                int i3 = IAuthTabCallback + 119;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return appLovinSdkSettingsIAuthTabCallback;
                }
                obj2.hashCode();
                throw null;
            }
        }, 6, (DefaultConstructorMarker) null);
        onWarmupCompleted(setTagsokhttp.onExtraCallbackWithResult(this, 20));
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = asBinder + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallbackOnMinimized = onMinimized();
        int i4 = asBinder + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomdatacallbackOnMinimized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        }
        super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i4 = asBinder + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return initsdkIAuthTabCallbackStubProxy;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback_Parcel = super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        int i4 = asBinder + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return zIAuthTabCallback_Parcel;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
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
        boolean zAccess100;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zAccess100 = super/*o.initSDK*/.access100();
            int i3 = 38 / 0;
        } else {
            zAccess100 = super/*o.initSDK*/.access100();
        }
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zAccess100;
        }
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = asBinder + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i4 = IAuthTabCallbackDefault + 41;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return interfaceDescriptor;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onExtraCallback();
        }
        super/*o.MonitorCrashConfig*/.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        int i4 = asBinder + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        enableThreadsBoost enablethreadsboostOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
            int i3 = 77 / 0;
        } else {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        int i4 = asBinder + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(map);
        int i4 = IAuthTabCallbackDefault + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        int i4 = IAuthTabCallbackDefault + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = asBinder + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return getdidOnTransact;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        }
        super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.initSDK*/.setAsCtaButton();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = IAuthTabCallbackDefault + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = asBinder + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = IAuthTabCallbackDefault + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = asBinder + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public setCustomDataCallback onMinimized() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallback.getValue();
        int i3 = asBinder + 27;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return setcustomdatacallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TdsActionBarText tdsActionBarText, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        TextView[] textViewArr = {tdsActionBarText};
        Object[] objArr = new Object[1];
        a((char) (41069 - (Process.myTid() >> 22)), '0' - AndroidCharacter.getMirror('0'), new char[]{56700, 40816, 65479, 55777}, new char[]{0, 0, 0, 0}, new char[]{1025, 57195, 28112, 21664}, objArr);
        getReferrerClickTimestampSeconds.onExtraCallbackWithResult(onnavigationevent, ((String) objArr[0]).intern(), textViewArr);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final AppLovinSdkSettings onExtraCallbackWithResult(final TdsActionBarText tdsActionBarText, final int i, final int i2, boolean z) {
        int i3 = 2 % 2;
        int i4 = asBinder + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (z) {
            isOneShot.onExtraCallbackWithResult(tdsActionBarText, noStore.Companion.IAuthTabCallbackDefault());
        }
        float f = tdsActionBarText.onNavigationEvent;
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        float f2 = 1.0f;
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{!(z ^ true) ? deprecated_certificatepinner.asInterface() : deprecated_certificatepinner.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), Float.valueOf(tdsActionBarText.getScaleX()), Float.valueOf(z ? 0.9f : 1.0f), (Function1) null, 4, (Object) null);
        if (z) {
            int i5 = IAuthTabCallbackDefault + 81;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        } else {
            f2 = 0.0f;
        }
        return (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsAsBinder, Float.valueOf(f), Float.valueOf(f2), new Function1() { // from class: im.toss.uikit.widget.actionbar.TdsActionBarText$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = TdsActionBarText.onNavigationEvent(this.f$0, i, i2, ((Float) obj).floatValue());
                int i10 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit onNavigationEvent(TdsActionBarText tdsActionBarText, int i, int i2, float f) {
        int i3 = 2 % 2;
        tdsActionBarText.onNavigationEvent = f;
        tdsActionBarText.setTextColor(new setHasUserConsent(i, i2).IAuthTabCallback(f).intValue());
        tdsActionBarText.getBackground().setAlpha((int) (f * 255.0f));
        tdsActionBarText.getBackground().invalidateSelf();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r4.onExtraCallbackWithResult.onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return super/*android.view.View*\/.onTouchEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((!o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (o.onInstallReferrerServiceDisconnected.onExtraCallback.onExtraCallback(r4, r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r5 = im.toss.uikit.widget.actionbar.TdsActionBarText.asBinder + 13;
        im.toss.uikit.widget.actionbar.TdsActionBarText.IAuthTabCallbackDefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int i3 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(motionEvent, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super/*android.view.View*/.setPressed(z);
            this.onExtraCallbackWithResult.onNavigationEvent(z);
        } else {
            super/*android.view.View*/.setPressed(z);
            this.onExtraCallbackWithResult.onNavigationEvent(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*im.toss.tds.view.component.atom.text.LineHeightBasedTextView*/.onDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(canvas, "");
            super/*im.toss.tds.view.component.atom.text.LineHeightBasedTextView*/.onDraw(canvas);
            onInstallReferrerServiceDisconnected.onExtraCallbackWithResult(onInstallReferrerServiceDisconnected.onExtraCallback, this, canvas, (SizeF) null, 4, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, this, (initMiniApp) null, 2, (Object) null);
        boolean zPerformClick = super/*android.view.View*/.performClick();
        int i4 = asBinder + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zPerformClick;
        }
        obj.hashCode();
        throw null;
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
            int i4 = $10 + 5;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 43, 1451 - (ViewConfiguration.getFadingEdgeLength() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 49123), (Process.myTid() >> 22) + 44, 1494 - (ViewConfiguration.getTouchSlop() >> 8), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.getDefaultSize(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, 22939 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45848), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12577 - View.MeasureSpec.getSize(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onTransact ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
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
        int i6 = $11 + 49;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }
}
