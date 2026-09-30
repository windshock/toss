package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.global.features.useronboarding.dev.GlobalOnboardingDevActivity;
import im.toss.global.features.useronboarding.welcome.au.mydataactivation.GlobalMydataActivationActivity;
import im.toss.global.features.useronboarding.welcome.au.mydataactivation.GlobalMydataActivationBanksActivity;
import im.toss.global.features.useronboarding.welcome.dev.GlobalOnboardingWelcomeDevActivity;
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
public final class GlobalFeaturesUserOnboardingKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onNavigationEvent + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$7_kN7Th0ZWPTwHjaLEJW77niAXc() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = onNavigationEvent + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$imWU9SunBB5W9TsZO9dPNVd7kMY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    /* renamed from: $r8$lambda$pWKTP9CI5isBf-GibDyi3mptCoc, reason: not valid java name */
    public static /* synthetic */ Class m270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc() {
        Class cls_init_$lambda$1;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$1 = _init_$lambda$1();
            int i3 = 17 / 0;
        } else {
            cls_init_$lambda$1 = _init_$lambda$1();
        }
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return cls_init_$lambda$1;
    }

    static {
        onExtraCallbackWithResult();
        int i = IAuthTabCallback + 61;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public GlobalFeaturesUserOnboardingKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesUserOnboardingKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class cls$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g();
                    int i3 = 10 / 0;
                } else {
                    cls$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g();
                }
                int i4 = onExtraCallback + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$10xesA95kB7l0vcYg2ZkihElO_g;
            }
        };
        TargetRegion targetRegion = TargetRegion.GLOBAL;
        Object[] objArr = new Object[1];
        a(new int[]{0, 33, 172, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new int[]{33, 43, 187, 28}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesUserOnboardingKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class clsM270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.m270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc();
                    int i3 = 39 / 0;
                } else {
                    clsM270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.m270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc();
                }
                int i4 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM270$r8$lambda$pWKTP9CI5isBfGibDyi3mptCoc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{76, 49, 67, 28}, false, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesUserOnboardingKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$imWU9SunBB5W9TsZO9dPNVd7kMY = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.$r8$lambda$imWU9SunBB5W9TsZO9dPNVd7kMY();
                if (i3 == 0) {
                    int i4 = 56 / 0;
                }
                return cls$r8$lambda$imWU9SunBB5W9TsZO9dPNVd7kMY;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{125, 41, 152, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1}, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesUserOnboardingKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$7_kN7Th0ZWPTwHjaLEJW77niAXc = GlobalFeaturesUserOnboardingKspDeepLinkRegistry.$r8$lambda$7_kN7Th0ZWPTwHjaLEJW77niAXc();
                int i4 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$7_kN7Th0ZWPTwHjaLEJW77niAXc;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return GlobalOnboardingDevActivity.class;
    }

    private static final Class _init_$lambda$1() {
        Class<GlobalMydataActivationActivity> cls;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            cls = GlobalMydataActivationActivity.class;
            int i4 = 17 / 0;
        } else {
            cls = GlobalMydataActivationActivity.class;
        }
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return GlobalMydataActivationBanksActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return GlobalOnboardingWelcomeDevActivity.class;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "")), ImageFormat.getBitsPerPixel(0) + 36, 14238 - TextUtils.indexOf("", c, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10935), TextUtils.indexOf("", "", 0, 0) + 65, 16717 - Process.getGidForName(""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-16777187) - Color.rgb(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49467), 70 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12486 - TextUtils.indexOf("", "", 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i9 = $11 + 91;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 1, cArr3, i3 * i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 + i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i10, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i10);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            int i11 = $11 + 79;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = new char[]{27359, 27479, 27486, 27323, 27321, 27480, 27481, 27484, 27481, 27483, 27482, 27482, 27482, 27476, 27317, 27319, 27484, 27459, 27482, 27479, 27483, 27321, 27285, 27310, 27468, 27473, 27475, 27475, 27473, 27481, 27480, 27472, 27502, 27348, 27488, 27463, 27464, 27495, 27518, 27488, 27493, 27497, 27467, 27465, 27503, 27474, 27501, 27494, 27498, 27464, 27300, 27297, 27487, 27488, 27490, 27490, 27488, 27496, 27499, 27491, 27489, 27493, 27495, 27497, 27495, 27499, 27496, 27492, 27495, 27496, 27475, 27468, 27468, 27499, 27499, 27475, 27159, 27384, 27382, 27391, 27328, 27359, 27384, 27391, 27371, 27363, 27363, 27332, 27332, 27371, 27360, 27391, 27388, 27360, 27363, 27391, 27361, 27391, 27359, 27333, 27370, 27364, 27361, 27388, 27384, 27385, 27387, 27363, 27360, 27384, 27386, 27386, 27384, 27351, 27193, 27196, 27328, 27362, 27390, 27365, 27370, 27367, 27329, 27331, 27361, 27339, 27458, 27460, 27468, 27469, 27461, 27463, 27463, 27461, 27296, 27266, 27273, 27309, 27471, 27467, 27470, 27319, 27312, 27307, 27305, 27464, 27470, 27470, 27470, 27471, 27469, 27312, 27469, 27468, 27309, 27301, 27464, 27470, 27313, 27471, 27464, 27471, 27311, 27310, 27314, 27467};
    }
}
