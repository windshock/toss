package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access3902 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static volatile Boolean IAuthTabCallback = null;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static char asInterface = 0;
    private static final Object onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static final ZoneId onNavigationEvent;
    private static int onTransact = 1;
    public static final access3902 onWarmupCompleted;

    public interface IAuthTabCallback {
        fromRawRes setWindowCallback();
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return access3902.this.onWarmupCompleted(this);
        }
    }

    private access3902() {
    }

    static {
        IAuthTabCallback();
        onWarmupCompleted = new access3902();
        onExtraCallback = new Object();
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 2, 1, '\r', '\t', 7, 0, '\b', 0, 11}, (byte) (41 - Color.red(0)), KeyEvent.keyCodeFromString("") + 10, objArr);
        onNavigationEvent = ZoneId.of(((String) objArr[0]).intern());
        onExtraCallbackWithResult = 8;
        int i = onTransact + 95;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r0 == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access3902.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    public final boolean onExtraCallbackWithResult(@NotNull getPricingPhaseList getpricingphaselist) throws Throwable {
        Intrinsics.checkNotNullParameter(getpricingphaselist, "");
        Boolean bool = IAuthTabCallback;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (onExtraCallback) {
            Boolean bool2 = IAuthTabCallback;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            onExtraCallback onextracallbackOnNavigationEvent = onWarmupCompleted.onNavigationEvent(getpricingphaselist);
            IAuthTabCallback = Boolean.valueOf(onextracallbackOnNavigationEvent.onExtraCallbackWithResult());
            onExtraCallbackWithResult(onextracallbackOnNavigationEvent, getpricingphaselist);
            return onextracallbackOnNavigationEvent.onExtraCallbackWithResult();
        }
    }

    public final Boolean onNavigationEvent() {
        Boolean bool;
        synchronized (onExtraCallback) {
            bool = IAuthTabCallback;
            IAuthTabCallback = null;
        }
        return bool;
    }

    private final void onExtraCallbackWithResult(onExtraCallback onextracallback, getPricingPhaseList getpricingphaselist) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("enabled", String.valueOf(onextracallback.onExtraCallbackWithResult()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("region", getpricingphaselist.name());
        Object[] objArr = new Object[1];
        a(new char[]{4, 14, '\r', 5, 7, '\f'}, (byte) (118 - (ViewConfiguration.getScrollBarSize() >> 8)), 6 - TextUtils.indexOf("", "", 0, 0), objArr);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "HomeLauncherExperimentGate", "판정 확정", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onextracallback.IAuthTabCallback())}), (String) null, false, (String) null, 56, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback {
        private final String IAuthTabCallback;
        private final boolean onExtraCallback;

        public onExtraCallback(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = z;
            this.IAuthTabCallback = str;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final boolean onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }
    }

    private final onExtraCallback onNavigationEvent(getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        if (getpricingphaselist != getPricingPhaseList.KR) {
            onExtraCallback onextracallback = new onExtraCallback(false, "notKr");
            int i2 = asBinder + 49;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }
        if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            return new onExtraCallback(false, "notAdult");
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("launcher.home.enabled");
        if (strOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallback_Parcel + 33;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (Boolean.parseBoolean(strOnExtraCallbackWithResult)) {
                access4402 access4402Var = access4402.onExtraCallbackWithResult;
                String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult("launcher.home.employee.forcedDays");
                DayOfWeek dayOfWeek = LocalDate.now(onNavigationEvent).getDayOfWeek();
                Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
                return access4402Var.IAuthTabCallback(strOnExtraCallbackWithResult2, dayOfWeek) ? new onExtraCallback(true, "tuba") : new onExtraCallback(false, "forcedDays");
            }
        }
        return new onExtraCallback(false, "tuba");
    }

    private final String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        Response response = Response.onNavigationEvent;
        ServiceLoaderComponentRegistryExternalSyntheticLambda0 serviceLoaderComponentRegistryExternalSyntheticLambda0 = (ServiceLoaderComponentRegistryExternalSyntheticLambda0) Response.onExtraCallback(contextOnExtraCallback, ServiceLoaderComponentRegistryExternalSyntheticLambda0.class);
        if (serviceLoaderComponentRegistryExternalSyntheticLambda0.onPostMessage().onWarmupCompleted()) {
            int i2 = asBinder + 115;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (serviceLoaderComponentRegistryExternalSyntheticLambda0.onMessageChannelReady().onExtraCallback(str)) {
                int i4 = asBinder + 105;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return serviceLoaderComponentRegistryExternalSyntheticLambda0.onMessageChannelReady().onNavigationEvent(str);
            }
        }
        String strOnExtraCallback = ((ServiceLoaderComponentRegistryExternalSyntheticLambda1) Response.onExtraCallback(contextOnExtraCallback, ServiceLoaderComponentRegistryExternalSyntheticLambda1.class)).onActivityLayout().onExtraCallback(str);
        if (strOnExtraCallback != null) {
            return strOnExtraCallback;
        }
        int i6 = asBinder + 85;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return ((IAuthTabCallback) Response.onExtraCallback(contextOnExtraCallback, IAuthTabCallback.class)).setWindowCallback().onNavigationEvent(str);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackDefault;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) + 26, 23139 - (ViewConfiguration.getEdgeSlop() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 25 - MotionEvent.axisFromString(""), 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i5 = $11 + 91;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24823), 74 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8089 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $10 + 19;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 29 - ImageFormat.getBitsPerPixel(0), (Process.myTid() >> 22) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 67;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackDefault = new char[]{51243, 64960, 51245, 64966, 64988, 64992, 64961, 51242, 64991, 64978, 65010, 64924, 64982, 64986, 51240, 64989};
        asInterface = (char) 51245;
    }
}
