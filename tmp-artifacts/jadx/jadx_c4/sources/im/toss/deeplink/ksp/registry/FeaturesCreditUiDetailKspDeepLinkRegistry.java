package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.credit.ui.legacy.detail.CreditDetailActivity;
import im.toss.features.credit.ui.legacy.detail.CreditStatusItemDetailActivity;
import im.toss.features.credit.ui.legacy.detail.tips.CreditTipSchemeActivity;
import im.toss.features.credit.ui.legacy.scheme.CreditDetailCardSchemeActivity;
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
public final class FeaturesCreditUiDetailKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$09xYqa-nHC3S0PHRiVJ9M2CP6q8, reason: not valid java name */
    public static /* synthetic */ Class m117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$6V5zNaHzXWoz4mPFLN5udcfdPjw() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$2;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$8849910AG_3pNgIMAoh6Juyx0xU() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$8vdc1rxXkWJZ7Vm16wxMIFflkmk() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$aLi2dmE8P1WUrqQGxP2okTsR7M4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        onExtraCallback();
        int i = onExtraCallback + 105;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesCreditUiDetailKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiDetailKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$8849910AG_3pNgIMAoh6Juyx0xU = FeaturesCreditUiDetailKspDeepLinkRegistry.$r8$lambda$8849910AG_3pNgIMAoh6Juyx0xU();
                int i4 = IAuthTabCallback + 113;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$8849910AG_3pNgIMAoh6Juyx0xU;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{0, 25, 138, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new int[]{25, 22, 91, 2}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiDetailKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesCreditUiDetailKspDeepLinkRegistry.$r8$lambda$aLi2dmE8P1WUrqQGxP2okTsR7M4();
                    throw null;
                }
                Class cls$r8$lambda$aLi2dmE8P1WUrqQGxP2okTsR7M4 = FeaturesCreditUiDetailKspDeepLinkRegistry.$r8$lambda$aLi2dmE8P1WUrqQGxP2okTsR7M4();
                int i3 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return cls$r8$lambda$aLi2dmE8P1WUrqQGxP2okTsR7M4;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{47, 30, 57, 10}, false, new byte[]{0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiDetailKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$6V5zNaHzXWoz4mPFLN5udcfdPjw = FeaturesCreditUiDetailKspDeepLinkRegistry.$r8$lambda$6V5zNaHzXWoz4mPFLN5udcfdPjw();
                int i4 = onExtraCallback + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$6V5zNaHzXWoz4mPFLN5udcfdPjw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{77, 30, 58, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiDetailKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$8vdc1rxXkWJZ7Vm16wxMIFflkmk = FeaturesCreditUiDetailKspDeepLinkRegistry.$r8$lambda$8vdc1rxXkWJZ7Vm16wxMIFflkmk();
                int i4 = IAuthTabCallback + 53;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$8vdc1rxXkWJZ7Vm16wxMIFflkmk;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new int[]{107, 23, 197, 1}, false, new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiDetailKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Class clsM117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8 = FeaturesCreditUiDetailKspDeepLinkRegistry.m117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8();
                    int i3 = 14 / 0;
                } else {
                    clsM117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8 = FeaturesCreditUiDetailKspDeepLinkRegistry.m117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8();
                }
                int i4 = onExtraCallbackWithResult + 93;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM117$r8$lambda$09xYqanHC3S0PHRiVJ9M2CP6q8;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return CreditDetailActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return CreditTipSchemeActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return CreditDetailCardSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return CreditStatusItemDetailActivity.class;
    }

    private static final Class _init_$lambda$4() {
        Class<CreditStatusItemDetailActivity> cls;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            cls = CreditStatusItemDetailActivity.class;
            int i4 = 41 / 0;
        } else {
            cls = CreditStatusItemDetailActivity.class;
        }
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return cls;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onNavigationEvent;
        char c = '0';
        if (cArr != null) {
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 35283), TextUtils.indexOf("", "") + 35, 14238 - TextUtils.lastIndexOf("", c, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    c = '0';
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
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $10 + 39;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = $11 + 67;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 65 - (KeyEvent.getMaxKeyCode() >> 16), 16718 - TextUtils.getCapsMode("", 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 29, AndroidCharacter.getMirror('0') + 17609, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 70 - Gravity.getAbsoluteGravity(0, 0), 12486 - Color.argb(0, 0, 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i16 = $10 + 7;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 * i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i17 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i17, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i17);
            }
        }
        if (z) {
            int i18 = $10 + 57;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i20 = $11 + 19;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent + i4];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i21 = $11 + 101;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{27184, 27312, 27314, 27322, 27323, 27315, 27317, 27317, 27315, 27310, 27376, 27383, 27293, 27322, 27323, 27296, 27326, 27318, 27285, 27293, 27296, 27320, 27322, 27297, 27322, 27174, 27265, 27266, 27273, 27271, 27362, 27362, 27271, 27279, 27377, 27272, 27275, 27370, 27332, 27329, 27391, 27264, 27266, 27266, 27264, 27272, 27275, 27137, 27371, 27373, 27344, 27373, 27336, 27340, 27349, 27372, 27370, 27370, 27363, 27365, 27373, 27370, 27362, 27364, 27364, 27362, 27329, 27171, 27174, 27340, 27373, 27370, 27347, 27345, 27369, 27332, 27340, 27162, 27375, 27372, 27369, 27337, 27337, 27370, 27345, 27370, 27368, 27344, 27341, 27333, 27366, 27374, 27344, 27371, 27370, 27341, 27175, 27168, 27358, 27363, 27365, 27365, 27363, 27371, 27370, 27362, 27360, 27351, 27515, 27511, 27513, 27489, 27518, 27510, 27512, 27512, 27510, 27477, 27319, 27322, 27456, 27489, 27518, 27495, 27493, 27517, 27480, 27484, 27516, 27491};
    }
}
