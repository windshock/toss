package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.alltab.feature.total_service.feature.mini_home.TotalServiceMiniHomeActivity;
import im.toss.features.alltab.feature.total_service.feature.mini_home.investment.TotalServiceMiniHomeInvestmentActivity;
import im.toss.features.alltab.feature.total_service.feature.play_at_toss.all.PlayAtTossAllActivity;
import im.toss.features.alltab.feature.total_service.feature.play_at_toss.overlay.PlayAtTossOverlayStartActivity;
import im.toss.features.alltab.feature.total_service.feature.recent_service.RecentServiceActivity;
import im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceLauncherWrapperActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = 97 - (b * 3);
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            i4 = i6;
            int i8 = 0;
            i4 += i5;
            i5 = i7;
            i2 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i10 = i2 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i8 = i10;
            i4 += i5;
            i5 = i7;
            i2 = i8;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$4cs6EgDliZFNQnA7w2JmrRrzD8o() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$7();
            throw null;
        }
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$7;
    }

    public static /* synthetic */ Class $r8$lambda$HddRsllVCqThuhIpvqpWAppNHKQ() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$WTqsFA60yMtGSaFCJe3rl6f86NM() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$6();
            throw null;
        }
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i3 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$6;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$aF-gi3-EG2wIt9WSxUyLjCIOu1c, reason: not valid java name */
    public static /* synthetic */ Class m107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$4();
        }
        _init_$lambda$4();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw() {
        Class cls_init_$lambda$3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$3 = _init_$lambda$3();
            int i3 = 13 / 0;
        } else {
            cls_init_$lambda$3 = _init_$lambda$3();
        }
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$fKIwMF9mH1_36dIY8ZX3XvATrpg() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$5();
            throw null;
        }
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$5;
    }

    /* renamed from: $r8$lambda$imr_EEXcaNTp7ez0Ny-DyHg1JBU, reason: not valid java name */
    public static /* synthetic */ Class m108$r8$lambda$imr_EEXcaNTp7ez0NyDyHg1JBU() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$mlVyOc1Ac2AROPr44F9rEL6q2E8() {
        Class cls_init_$lambda$2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$2 = _init_$lambda$2();
            int i3 = 39 / 0;
        } else {
            cls_init_$lambda$2 = _init_$lambda$2();
        }
        int i4 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        int i = onExtraCallback + 97;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$HddRsllVCqThuhIpvqpWAppNHKQ = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$HddRsllVCqThuhIpvqpWAppNHKQ();
                if (i3 != 0) {
                    int i4 = 6 / 0;
                }
                return cls$r8$lambda$HddRsllVCqThuhIpvqpWAppNHKQ;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(Process.myTid() >> 22, 36 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf("", "") + 54082), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 47 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (30250 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.m108$r8$lambda$imr_EEXcaNTp7ez0NyDyHg1JBU();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class clsM108$r8$lambda$imr_EEXcaNTp7ez0NyDyHg1JBU = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.m108$r8$lambda$imr_EEXcaNTp7ez0NyDyHg1JBU();
                int i3 = onExtraCallbackWithResult + 95;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM108$r8$lambda$imr_EEXcaNTp7ez0NyDyHg1JBU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 83, TextUtils.getOffsetBefore("", 0) + 43, (char) (22073 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$mlVyOc1Ac2AROPr44F9rEL6q2E8 = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$mlVyOc1Ac2AROPr44F9rEL6q2E8();
                if (i3 == 0) {
                    int i4 = 49 / 0;
                }
                return cls$r8$lambda$mlVyOc1Ac2AROPr44F9rEL6q2E8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 126, (ViewConfiguration.getPressedStateDuration() >> 16) + 40, (char) (Process.myTid() >> 22), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class cls$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw();
                    int i3 = 38 / 0;
                } else {
                    cls$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw();
                }
                int i4 = onWarmupCompleted + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$dXkeDhEtH5Wtu3YRYFyVeN9sZnw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 166, 47 - TextUtils.indexOf("", ""), (char) (17738 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class clsM107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.m107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c();
                    int i3 = 34 / 0;
                } else {
                    clsM107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.m107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c();
                }
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM107$r8$lambda$aFgi3EG2wIt9WSxUyLjCIOu1c;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 214, View.MeasureSpec.makeMeasureSpec(0, 0) + 47, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$fKIwMF9mH1_36dIY8ZX3XvATrpg();
                }
                FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$fKIwMF9mH1_36dIY8ZX3XvATrpg();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a(260 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 32 - TextUtils.lastIndexOf("", '0', 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$WTqsFA60yMtGSaFCJe3rl6f86NM = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$WTqsFA60yMtGSaFCJe3rl6f86NM();
                int i4 = onNavigationEvent + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$WTqsFA60yMtGSaFCJe3rl6f86NM;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(293 - View.resolveSizeAndState(0, 0, 0), View.resolveSize(0, 0) + 37, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr8);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$4cs6EgDliZFNQnA7w2JmrRrzD8o = FeaturesAlltabFeatureTotal_serviceKspDeepLinkRegistry.$r8$lambda$4cs6EgDliZFNQnA7w2JmrRrzD8o();
                int i4 = onWarmupCompleted + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$4cs6EgDliZFNQnA7w2JmrRrzD8o;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return TotalServiceMiniHomeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return TotalServiceMiniHomeInvestmentActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return PlayAtTossAllActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return TotalServiceLauncherWrapperActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return PlayAtTossOverlayStartActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return PlayAtTossOverlayStartActivity.class;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return RecentServiceActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return RecentServiceActivity.class;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.green(0) + 17, MotionEvent.axisFromString("") + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - MotionEvent.axisFromString("")), 31 - (Process.myPid() >> 22), 20220 - KeyEvent.keyCodeFromString(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), 44 - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = $11 + 121;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 69;
        $11 = i7 % 128;
        while (true) {
            int i8 = i7 % 2;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 49123), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1494 - Color.green(0), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i7 = $11 + 97;
            $10 = i7 % 128;
        }
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{16101, 6987, 30134, 19979, 43076, 33450, 57097, 14717, 5029, 27716, 17961, 41089, 64770, 55153, 12754, 2607, 25722, 48787, 39733, 62859, 53188, 10280, 655, 23789, 47411, 37773, 60841, 50755, 8351, 31472, 22351, 45539, 35838, 58449, 16043, 6923, 39821, 48675, 53470, 60259, 3372, 10178, 31329, 39957, 46797, 51500, 58177, 1513, 22634, 29209, 38074, 44871, 49426, 7163, 15965, 20707, 27308, 36160, 42983, 63877, 7259, 14053, 18625, 25387, 34295, 57240, 61991, 5259, 11926, 16697, 39875, 48739, 53361, 60127, 3424, 10000, 31195, 40037, 46618, 51371, 58235, 1304, 24506, 48031, 40497, 61644, 52081, 11582, 2000, 23155, 48135, 38623, 59710, 50003, 9723, 30840, 21003, 46248, 36693, 57600, 15337, 7759, 28913, 19134, 44370, 34805, 55703, 15433, 5879, 26835, 17188, 42464, 65413, 53797, 13465, 3725, 24880, 48017, 40544, 61475, 51927, 11631, 1883, 22989, 48232, 38416, 60839, 51209, 42740, 40265, 31494, 20968, 3147, 59967, 49383, 48902, 38251, 29635, 11868, 1075, 57993, 55657, 46971, 28048, 18533, 9945, 7322, 64383, 53708, 36777, 27238, 16531, 16048, 5379, 62400, 43453, 33800, 25249, 22695, 14105, 60918, 51290, 42525, 40191, 31553, 20799, 43246, 36160, 58301, 55296, 15951, 5281, 18690, 44918, 34222, 64079, 53282, 13962, 27401, 16762, 42969, 39972, 62065, 10392, 3390, 25472, 22991, 48675, 38020, 51942, 12088, 1414, 31650, 20565, 46737, 60660, 49492, 10216, 7676, 29249, 43232, 36113, 58194, 55718, 15902, 5160, 19122, 44803, 34152, 64471, 53265, 13940, 27860, 60839, 51209, 42740, 40265, 31494, 20968, 3147, 59967, 49383, 48902, 38251, 29635, 11840, 1075, 58000, 55661, 46904, 28113, 18551, 9929, 7302, 64362, 53709, 36783, 27249, 16591, 16107, 5404, 62424, 43453, 33821, 25249, 22709, 14088, 60841, 51288, 42523, 40175, 31575, 20835, 4091, 59978, 49185, 48798, 38232, 29501, 10653, 60839, 51209, 42740, 40265, 31494, 20968, 3147, 59967, 49383, 48902, 38251, 29635, 11840, 1075, 58000, 55661, 46904, 28113, 18551, 9929, 7302, 64362, 53709, 36783, 27249, 16591, 16107, 5406, 62417, 43455, 33793, 25314, 22688, 60839, 51209, 42740, 40265, 31494, 20968, 3147, 59967, 49383, 48902, 38251, 29635, 11840, 1075, 58000, 55661, 46904, 28113, 18551, 9929, 7302, 64362, 53709, 36783, 27249, 16591, 16107, 5406, 62417, 43455, 33793, 25314, 22688, 14163, 60901, 51264, 42520};
        onWarmupCompleted = 1279633319409010812L;
    }
}
