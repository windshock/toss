package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.payment.ui.setting.activity.CashReceiptActivity;
import im.toss.features.payment.ui.setting.activity.OfflinePayAuthSkipSettingActivity;
import im.toss.features.payment.ui.setting.activity.OfflinePayOverseasExchangeRateNotificationSettingActivity;
import im.toss.features.payment.ui.setting.activity.PaymentTermDetailsActivity;
import im.toss.features.payment.ui.setting.activity.TossPaySettingActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesPaymentUiSettingKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$7syebIOBBiaJnczZeiROpN_ef2g() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$4();
        }
        _init_$lambda$4();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$D9LIE1rNUEVCsFaliv-lK1aiajs, reason: not valid java name */
    public static /* synthetic */ Class m212$r8$lambda$D9LIE1rNUEVCsFalivlK1aiajs() {
        Class cls_init_$lambda$3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$3 = _init_$lambda$3();
            int i3 = 55 / 0;
        } else {
            cls_init_$lambda$3 = _init_$lambda$3();
        }
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$WBeXRQvZGHOI0x44KBtIXCvtBOg() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$clPNKpfHr5zCbF5k_uinyf8aab8() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$hTY1D2AiWm38ep4MOiyBbzkgDDg() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    static {
        onExtraCallback();
        int i = onExtraCallback + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public FeaturesPaymentUiSettingKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiSettingKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesPaymentUiSettingKspDeepLinkRegistry.$r8$lambda$WBeXRQvZGHOI0x44KBtIXCvtBOg();
                }
                FeaturesPaymentUiSettingKspDeepLinkRegistry.$r8$lambda$WBeXRQvZGHOI0x44KBtIXCvtBOg();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{0, 40, 46, 0}, true, new byte[]{0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new int[]{40, 35, 0, 8}, true, new byte[]{1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiSettingKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$clPNKpfHr5zCbF5k_uinyf8aab8 = FeaturesPaymentUiSettingKspDeepLinkRegistry.$r8$lambda$clPNKpfHr5zCbF5k_uinyf8aab8();
                int i4 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 70 / 0;
                }
                return cls$r8$lambda$clPNKpfHr5zCbF5k_uinyf8aab8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{75, 60, 104, 0}, true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiSettingKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$hTY1D2AiWm38ep4MOiyBbzkgDDg = FeaturesPaymentUiSettingKspDeepLinkRegistry.$r8$lambda$hTY1D2AiWm38ep4MOiyBbzkgDDg();
                int i4 = onWarmupCompleted + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$hTY1D2AiWm38ep4MOiyBbzkgDDg;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{135, 29, 0, 12}, false, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1}, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiSettingKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 27;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesPaymentUiSettingKspDeepLinkRegistry.m212$r8$lambda$D9LIE1rNUEVCsFalivlK1aiajs();
                }
                FeaturesPaymentUiSettingKspDeepLinkRegistry.m212$r8$lambda$D9LIE1rNUEVCsFalivlK1aiajs();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new int[]{164, 28, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0}, objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentUiSettingKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$7syebIOBBiaJnczZeiROpN_ef2g = FeaturesPaymentUiSettingKspDeepLinkRegistry.$r8$lambda$7syebIOBBiaJnczZeiROpN_ef2g();
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 49 / 0;
                }
                return cls$r8$lambda$7syebIOBBiaJnczZeiROpN_ef2g;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return CashReceiptActivity.class;
        }
        int i3 = 2 / 0;
        return CashReceiptActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return OfflinePayAuthSkipSettingActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return OfflinePayOverseasExchangeRateNotificationSettingActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return PaymentTermDetailsActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return TossPaySettingActivity.class;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35283), KeyEvent.normalizeMetaState(0) + 35, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (Process.myPid() >> 22)), 65 - TextUtils.getOffsetAfter("", 0), 16718 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17657 - View.MeasureSpec.makeMeasureSpec(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 49467), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 69, 12486 - View.combineMeasuredStates(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i12 = $11 + 55;
            $10 = i12 % 128;
            i = 2;
            int i13 = i12 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i14 = $10 + 65;
            $11 = i14 % 128;
            if (i14 % i == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 % i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >>> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i16 = $11 + 65;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i18 = $11 + 67;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[3]);
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{27167, 27374, 27348, 27355, 27356, 27356, 27351, 27349, 27349, 27350, 27358, 27193, 27185, 27345, 27353, 27353, 27375, 27349, 27352, 27187, 27185, 27349, 27350, 27351, 27346, 27372, 27348, 27348, 27185, 27155, 27180, 27338, 27375, 27345, 27345, 27375, 27351, 27350, 27374, 27372, 27255, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27199, 27170, 27172, 27169, 27171, 27168, 27194, 27173, 27142, 27140, 27178, 27180, 27176, 27168, 27137, 27167, 27171, 27172, 27173, 27168, 27194, 27170, 27170, 27167, 27233, 27258, 27160, 27173, 27288, 27290, 27288, 27292, 27268, 27264, 27265, 27265, 27288, 27287, 27272, 27279, 27290, 27292, 27279, 27277, 27264, 27292, 27265, 27266, 27267, 27291, 27288, 27388, 27383, 27292, 27269, 27290, 27284, 27293, 27291, 27284, 27385, 27388, 27266, 27268, 27264, 27288, 27385, 27383, 27291, 27292, 27293, 27288, 27282, 27290, 27290, 27383, 27353, 27346, 27376, 27285, 27287, 27287, 27285, 27293, 27292, 27284, 27282, 27257, 27172, 27171, 27167, 27137, 27174, 27171, 27183, 27157, 27153, 27158, 27171, 27192, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27170, 27170, 27194, 27168, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27170, 27170, 27194, 27168, 27173, 27172, 27171, 27167, 27137, 27174, 27171, 27197, 27175, 27175, 27199};
    }
}
