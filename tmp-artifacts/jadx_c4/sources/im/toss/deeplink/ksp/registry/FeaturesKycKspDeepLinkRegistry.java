package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.kyc.activities.KycEddSuccessActivity;
import im.toss.features.kyc.activities.KycSchemeActivity;
import im.toss.features.kyc.activities.KycTestActivity;
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
public final class FeaturesKycKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$EDaePlAPR51YRB_kaZkRaoZf1Vw() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$hly8vwHOGZ0O7m_39CD2FtVpZhc() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$s3-7T-AlDmsaMNsEgkG1pz4oLx0, reason: not valid java name */
    public static /* synthetic */ Class m178$r8$lambda$s37TAlDmsaMNsEgkG1pz4oLx0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = onWarmupCompleted + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        int i = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public FeaturesKycKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesKycKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$hly8vwHOGZ0O7m_39CD2FtVpZhc = FeaturesKycKspDeepLinkRegistry.$r8$lambda$hly8vwHOGZ0O7m_39CD2FtVpZhc();
                int i4 = onNavigationEvent + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$hly8vwHOGZ0O7m_39CD2FtVpZhc;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{0, 31, 0, 6}, true, new byte[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new int[]{31, 22, 0, 9}, true, new byte[]{1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesKycKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM178$r8$lambda$s37TAlDmsaMNsEgkG1pz4oLx0 = FeaturesKycKspDeepLinkRegistry.m178$r8$lambda$s37TAlDmsaMNsEgkG1pz4oLx0();
                int i4 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM178$r8$lambda$s37TAlDmsaMNsEgkG1pz4oLx0;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{53, 20, 195, 0}, false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1}, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesKycKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$EDaePlAPR51YRB_kaZkRaoZf1Vw = FeaturesKycKspDeepLinkRegistry.$r8$lambda$EDaePlAPR51YRB_kaZkRaoZf1Vw();
                int i4 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$EDaePlAPR51YRB_kaZkRaoZf1Vw;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return KycEddSuccessActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return KycSchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return KycTestActivity.class;
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
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.red(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, 14287 - AndroidCharacter.getMirror(c), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
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
            int i8 = $10 + 55;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "", 0)), 66 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, TextUtils.lastIndexOf("", '0', 0) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49468), (Process.myTid() >> 22) + 70, 12486 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
            int i13 = $11 + 79;
            $10 = i13 % 128;
            i = 2;
            if (i13 % 2 != 0) {
                int i14 = 5 / 2;
            }
        } else {
            i = 2;
        }
        if (z) {
            int i15 = $11 + 7;
            $10 = i15 % 128;
            int i16 = i15 % i;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 99;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{27252, 27197, 27173, 27172, 27196, 27194, 27170, 27175, 27168, 27175, 27143, 27137, 27172, 27172, 27173, 27141, 27138, 27177, 27178, 27176, 27179, 27143, 27143, 27168, 27196, 27139, 27233, 27258, 27160, 27197, 27199, 27255, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27197, 27194, 27194, 27172, 27172, 27197, 27167, 27143, 27168, 27196, 27139, 27233, 27258, 27349, 27513, 27515, 27491, 27488, 27512, 27514, 27514, 27512, 27479, 27321, 27324, 27486, 27515, 27519, 27458, 27482, 27489, 27489, 27512};
    }
}
