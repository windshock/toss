package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.payment.ui.BNPLLeaveActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.ToolbarMenu;
import o.access8100;
import o.getWrite;
import o.setToolbarMenus;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesPaymentUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$KtFh02r_rnHeIwA5qlaKiTYP_F0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$ci8tWGKKW8erZ82V7Jfm_7W29VE() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$jSQe4kLwrqwFI53VLUH7mGHr2IY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        int i = onTransact + 37;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FeaturesPaymentUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesPaymentUiKspDeepLinkRegistry.$r8$lambda$KtFh02r_rnHeIwA5qlaKiTYP_F0();
                    throw null;
                }
                Class cls$r8$lambda$KtFh02r_rnHeIwA5qlaKiTYP_F0 = FeaturesPaymentUiKspDeepLinkRegistry.$r8$lambda$KtFh02r_rnHeIwA5qlaKiTYP_F0();
                int i3 = onExtraCallback + 57;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 42 / 0;
                }
                return cls$r8$lambda$KtFh02r_rnHeIwA5qlaKiTYP_F0;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{11, 22, 5, 7, 23, 21, 7, '\r', 14, 22, 13798, 13798, 19, 17, 7, 4, 7, 0, '\b', 21, 16, 7}, (byte) (49 - Color.red(0)), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{11, 22, 5, 7, 23, 21, 7, '\r', 14, 22, 13845, 13845, '\b', 24, 15, '\t', 24, '\b', 7, 4, '\b', 11, 17, 16, 13898, 13898, '\b', 2, 15, 1, 1, 18, 13917}, (byte) (Process.getGidForName("") + 97), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesPaymentUiKspDeepLinkRegistry.$r8$lambda$jSQe4kLwrqwFI53VLUH7mGHr2IY();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$jSQe4kLwrqwFI53VLUH7mGHr2IY = FeaturesPaymentUiKspDeepLinkRegistry.$r8$lambda$jSQe4kLwrqwFI53VLUH7mGHr2IY();
                int i3 = onExtraCallback + 31;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$jSQe4kLwrqwFI53VLUH7mGHr2IY;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{11, 22, 5, 7, 23, 21, 7, '\r', 14, 22, 13766, 13766, '\b', 24, 15, 14, '\r', 6, 11, '\t', '\b', 15, 23, 2, 1, 0, 13840}, (byte) (View.combineMeasuredStates(0, 0) + 17), (Process.myTid() >> 22) + 27, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$ci8tWGKKW8erZ82V7Jfm_7W29VE = FeaturesPaymentUiKspDeepLinkRegistry.$r8$lambda$ci8tWGKKW8erZ82V7Jfm_7W29VE();
                int i4 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$ci8tWGKKW8erZ82V7Jfm_7W29VE;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return BNPLLeaveActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return ToolbarMenu.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return setToolbarMenus.class;
        }
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 26 - KeyEvent.getDeadChar(0, 0), 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23139 - (ViewConfiguration.getPressedStateDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i5 = $11 + 1;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 24825), TextUtils.getOffsetAfter("", 0) + 74, 8087 - TextUtils.indexOf((CharSequence) "", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $10 + 23;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (ViewConfiguration.getPressedStateDuration() >> 16) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i14 = $10 + 1;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{64983, 65065, 64991, 64986, 64980, 64924, 64982, 65009, 64988, 64963, 64926, 64987, 64960, 65018, 64990, 65010, 64989, 64965, 64977, 64970, 64967, 64966, 64961, 64978, 64905};
        IAuthTabCallback = (char) 51244;
    }
}
