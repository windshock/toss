package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.tosscert.ui.more.CertificateSettingActivity;
import im.toss.features.tosscert.ui.renew.TossCertRenewRouteActivity;
import im.toss.features.tosscert.ui.tosscacert.TossCertIssueRouteActivity;
import im.toss.features.tosscert.ui.tosscacert.TossCertMydataActivity;
import im.toss.features.tosscert.ui.tosscacert.TossCertScrapingActivity;
import im.toss.features.tosscert.ui.tosscacert.TossCertServiceActivity;
import im.toss.features.tosscert.ui.tosscacert.TossCertificationHistoryActivity;
import im.toss.features.tosscert.ui.tosscacert.certificationcenter.TossCertificationCenterRouteActivity;
import im.toss.features.tosscert.ui.tosscacert.certificationcenter.TossCertificationCenterStoreRouteActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.positiveTextColor;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesTosscertUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;

    /* renamed from: $r8$lambda$-9KVHkirAbM45yLgrJsAu02NySw, reason: not valid java name */
    public static /* synthetic */ Class m235$r8$lambda$9KVHkirAbM45yLgrJsAu02NySw() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = asBinder + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$0O4RexMRV8YOtfqmrCP1SDFJKaI() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$13 = _init_$lambda$13();
        int i4 = IAuthTabCallbackDefault + 43;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return cls_init_$lambda$13;
    }

    /* renamed from: $r8$lambda$1rYip12qQM-LkY48cFFuGxNxQ3I, reason: not valid java name */
    public static /* synthetic */ Class m236$r8$lambda$1rYip12qQMLkY48cFFuGxNxQ3I() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = IAuthTabCallbackDefault + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return cls_init_$lambda$8;
    }

    /* renamed from: $r8$lambda$2MShQ1ZOGdXiywGJ8AcR-w1igVA, reason: not valid java name */
    public static /* synthetic */ Class m237$r8$lambda$2MShQ1ZOGdXiywGJ8AcRw1igVA() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$6();
            throw null;
        }
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i3 = asBinder + 95;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$5FfRAB37jAAFPurVYwejHKq6LEg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$12 = _init_$lambda$12();
        int i4 = asBinder + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$12;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$8slbzXxoL-gbD20ZzCWoDpz0bsw, reason: not valid java name */
    public static /* synthetic */ Class m238$r8$lambda$8slbzXxoLgbD20ZzCWoDpz0bsw() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$9();
        }
        _init_$lambda$9();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$AeAAny1sd9fbprzrZXANA0FoKh0() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = IAuthTabCallbackDefault + 87;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$PU1cHeAkJLmAnOjEbbVVpC0Tsyg() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$17 = _init_$lambda$17();
        int i4 = asBinder + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$17;
    }

    /* renamed from: $r8$lambda$X67GISZMITqm1A6II6phA_uNG-8, reason: not valid java name */
    public static /* synthetic */ Class m239$r8$lambda$X67GISZMITqm1A6II6phA_uNG8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$5();
            throw null;
        }
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i3 = IAuthTabCallbackDefault + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$Y6IwcbgTeORzNtvNaR5UwzwBeZc() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$11 = _init_$lambda$11();
        int i4 = asBinder + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$11;
    }

    /* renamed from: $r8$lambda$YnLdM5XWo-woJlDtz_-xyj_UAWs, reason: not valid java name */
    public static /* synthetic */ Class m240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$18 = _init_$lambda$18();
        int i4 = IAuthTabCallbackDefault + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$18;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$ZdE1ZccqkuZtIQiV4dlR7sutG0s() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$3();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = asBinder + 73;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$3;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$bEB3E-s5GzsmrzhCz0kB5m_BEgM, reason: not valid java name */
    public static /* synthetic */ Class m241$r8$lambda$bEB3Es5GzsmrzhCz0kB5m_BEgM() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$20();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$20 = _init_$lambda$20();
        int i3 = IAuthTabCallbackDefault + 119;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$20;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$cVMWC8ATlQmFHGhrY--ZWo72j40, reason: not valid java name */
    public static /* synthetic */ Class m242$r8$lambda$cVMWC8ATlQmFHGhrYZWo72j40() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = IAuthTabCallbackDefault + 119;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$4;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$dCbKWKIsOsJDpzTN7qfQ9FxXopQ() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$14();
            throw null;
        }
        Class cls_init_$lambda$14 = _init_$lambda$14();
        int i3 = asBinder + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$14;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$qWd7GfGERXy1SmJgqd9jGhL2Nyo() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 84 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = IAuthTabCallbackDefault + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$r1Fzd1Q4q26s_yRUiEmJMh51qWg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$19();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$19 = _init_$lambda$19();
        int i3 = IAuthTabCallbackDefault + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$19;
    }

    public static /* synthetic */ Class $r8$lambda$tQCzqNoKiJjtC4ltbG7zzhuJ_ZM() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$15 = _init_$lambda$15();
        int i4 = IAuthTabCallbackDefault + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return cls_init_$lambda$15;
    }

    /* renamed from: $r8$lambda$u3d-flvuvPy8L0W6i5qDNW_-kdE, reason: not valid java name */
    public static /* synthetic */ Class m243$r8$lambda$u3dflvuvPy8L0W6i5qDNW_kdE() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$7();
        }
        _init_$lambda$7();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$vmS968xNUP8vy4Kno8GjmhqPiyo() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$16 = _init_$lambda$16();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return cls_init_$lambda$16;
    }

    public static /* synthetic */ Class $r8$lambda$zmsRxgJtUL6Fhqme5T9CMNr40PM() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$10();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$10 = _init_$lambda$10();
        int i3 = asBinder + 7;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$10;
    }

    static {
        onExtraCallback();
        int i = onTransact + 87;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public FeaturesTosscertUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$qWd7GfGERXy1SmJgqd9jGhL2Nyo = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$qWd7GfGERXy1SmJgqd9jGhL2Nyo();
                int i4 = onNavigationEvent + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$qWd7GfGERXy1SmJgqd9jGhL2Nyo;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{0, 32, 0, 5}, false, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 29737, 46634, 50562, 24208, 24432, 2266}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesTosscertUiKspDeepLinkRegistry.m235$r8$lambda$9KVHkirAbM45yLgrJsAu02NySw();
                }
                FeaturesTosscertUiKspDeepLinkRegistry.m235$r8$lambda$9KVHkirAbM45yLgrJsAu02NySw();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{32, 35, 67, 17}, true, new byte[]{0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0}, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$AeAAny1sd9fbprzrZXANA0FoKh0 = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$AeAAny1sd9fbprzrZXANA0FoKh0();
                int i4 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 84 / 0;
                }
                return cls$r8$lambda$AeAAny1sd9fbprzrZXANA0FoKh0;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{67, 30, 0, 0}, true, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda14
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$ZdE1ZccqkuZtIQiV4dlR7sutG0s();
                }
                FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$ZdE1ZccqkuZtIQiV4dlR7sutG0s();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new int[]{97, 44, 180, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda15
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM242$r8$lambda$cVMWC8ATlQmFHGhrYZWo72j40 = FeaturesTosscertUiKspDeepLinkRegistry.m242$r8$lambda$cVMWC8ATlQmFHGhrYZWo72j40();
                int i4 = onExtraCallbackWithResult + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM242$r8$lambda$cVMWC8ATlQmFHGhrYZWo72j40;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 55598, 22236, 32489, 64450, 11266, 49749, 55261, 21029, 58602, 3195, 26336, 17350, 7886, 43806, 45202, 48776, 45617, 46184, 39093, 11696, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 2410, 1187}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 54, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda16
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM239$r8$lambda$X67GISZMITqm1A6II6phA_uNG8 = FeaturesTosscertUiKspDeepLinkRegistry.m239$r8$lambda$X67GISZMITqm1A6II6phA_uNG8();
                int i4 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM239$r8$lambda$X67GISZMITqm1A6II6phA_uNG8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 54731, 57537, 49164, 10771, 58259, 39743, 65297, 47911}, 33 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM237$r8$lambda$2MShQ1ZOGdXiywGJ8AcRw1igVA = FeaturesTosscertUiKspDeepLinkRegistry.m237$r8$lambda$2MShQ1ZOGdXiywGJ8AcRw1igVA();
                int i4 = onWarmupCompleted + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM237$r8$lambda$2MShQ1ZOGdXiywGJ8AcRw1igVA;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(new int[]{141, 33, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1}, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM243$r8$lambda$u3dflvuvPy8L0W6i5qDNW_kdE = FeaturesTosscertUiKspDeepLinkRegistry.m243$r8$lambda$u3dflvuvPy8L0W6i5qDNW_kdE();
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM243$r8$lambda$u3dflvuvPy8L0W6i5qDNW_kdE;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a(new int[]{174, 30, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1}, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda19
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesTosscertUiKspDeepLinkRegistry.m236$r8$lambda$1rYip12qQMLkY48cFFuGxNxQ3I();
                    throw null;
                }
                Class clsM236$r8$lambda$1rYip12qQMLkY48cFFuGxNxQ3I = FeaturesTosscertUiKspDeepLinkRegistry.m236$r8$lambda$1rYip12qQMLkY48cFFuGxNxQ3I();
                int i3 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return clsM236$r8$lambda$1rYip12qQMLkY48cFFuGxNxQ3I;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        a(new int[]{204, 20, 25, 0}, false, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0}, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM238$r8$lambda$8slbzXxoLgbD20ZzCWoDpz0bsw = FeaturesTosscertUiKspDeepLinkRegistry.m238$r8$lambda$8slbzXxoLgbD20ZzCWoDpz0bsw();
                if (i3 != 0) {
                    int i4 = 43 / 0;
                }
                return clsM238$r8$lambda$8slbzXxoLgbD20ZzCWoDpz0bsw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 9049, 45506, 25009, 26744, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 4934, 40153}, 28 - TextUtils.indexOf((CharSequence) "", '0'), objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$zmsRxgJtUL6Fhqme5T9CMNr40PM();
                    throw null;
                }
                Class cls$r8$lambda$zmsRxgJtUL6Fhqme5T9CMNr40PM = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$zmsRxgJtUL6Fhqme5T9CMNr40PM();
                int i3 = IAuthTabCallback + 41;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return cls$r8$lambda$zmsRxgJtUL6Fhqme5T9CMNr40PM;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 9049, 45506, 25009, 26744, 55598, 22236, 53751, 28605, 49504, 33392, 61467, 63040, 39093, 11696}, TextUtils.getOffsetBefore("", 0) + 30, objArr12);
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$Y6IwcbgTeORzNtvNaR5UwzwBeZc();
                    throw null;
                }
                Class cls$r8$lambda$Y6IwcbgTeORzNtvNaR5UwzwBeZc = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$Y6IwcbgTeORzNtvNaR5UwzwBeZc();
                int i3 = onWarmupCompleted + 15;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return cls$r8$lambda$Y6IwcbgTeORzNtvNaR5UwzwBeZc;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr13 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 9049, 45506, 25009, 26744, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 2410, 1187}, View.MeasureSpec.makeMeasureSpec(0, 0) + 30, objArr13);
        Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(((String) objArr13[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$5FfRAB37jAAFPurVYwejHKq6LEg = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$5FfRAB37jAAFPurVYwejHKq6LEg();
                int i4 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$5FfRAB37jAAFPurVYwejHKq6LEg;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr14 = new Object[1];
        a(new int[]{224, 32, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0}, objArr14);
        Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(((String) objArr14[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$0O4RexMRV8YOtfqmrCP1SDFJKaI();
                }
                FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$0O4RexMRV8YOtfqmrCP1SDFJKaI();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr15 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, objArr15);
        Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(((String) objArr15[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 77;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$dCbKWKIsOsJDpzTN7qfQ9FxXopQ();
                }
                FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$dCbKWKIsOsJDpzTN7qfQ9FxXopQ();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr16 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 4934, 40153}, KeyEvent.keyCodeFromString("") + 33, objArr16);
        Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback(((String) objArr16[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 29;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$tQCzqNoKiJjtC4ltbG7zzhuJ_ZM = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$tQCzqNoKiJjtC4ltbG7zzhuJ_ZM();
                int i4 = onExtraCallback + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$tQCzqNoKiJjtC4ltbG7zzhuJ_ZM;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr17 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 60200, 45336, 856, 3540, 31450, 52027, 45202, 48776, 60927, 7799}, View.resolveSize(0, 0) + 41, objArr17);
        Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(((String) objArr17[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$vmS968xNUP8vy4Kno8GjmhqPiyo = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$vmS968xNUP8vy4Kno8GjmhqPiyo();
                if (i3 != 0) {
                    int i4 = 38 / 0;
                }
                return cls$r8$lambda$vmS968xNUP8vy4Kno8GjmhqPiyo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr18 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 55598, 22236, 53751, 28605, 49504, 33392, 6839, 5664, 60200, 45336, 21706, 32109, 47002, 64666, 24459, 26246}, Color.blue(0) + 39, objArr18);
        Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(((String) objArr18[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$PU1cHeAkJLmAnOjEbbVVpC0Tsyg = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$PU1cHeAkJLmAnOjEbbVVpC0Tsyg();
                if (i3 == 0) {
                    int i4 = 13 / 0;
                }
                return cls$r8$lambda$PU1cHeAkJLmAnOjEbbVVpC0Tsyg;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr19 = new Object[1];
        a(new int[]{256, 34, 74, 0}, true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr19);
        Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(((String) objArr19[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                Class clsM240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs = FeaturesTosscertUiKspDeepLinkRegistry.m240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs();
                    int i3 = 62 / 0;
                } else {
                    clsM240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs = FeaturesTosscertUiKspDeepLinkRegistry.m240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs();
                }
                int i4 = IAuthTabCallback + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM240$r8$lambda$YnLdM5XWowoJlDtz_xyj_UAWs;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr20 = new Object[1];
        b(new char[]{856, 3540, 3834, 40446, 25009, 26744, 24505, 1852, 21324, 19087, 17312, 21906, 58259, 39743, 51447, 19669, 54472, 32334, 39093, 11696, 20572, 60721, 26336, 17350, 55598, 22236, 53751, 28605, 49504, 33392, 61467, 63040, 39093, 11696, 41090, 46222, 61693, 55663, 40142, 47756}, 39 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr20);
        Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(((String) objArr20[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$r1Fzd1Q4q26s_yRUiEmJMh51qWg = FeaturesTosscertUiKspDeepLinkRegistry.$r8$lambda$r1Fzd1Q4q26s_yRUiEmJMh51qWg();
                int i4 = onNavigationEvent + 101;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$r1Fzd1Q4q26s_yRUiEmJMh51qWg;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr21 = new Object[1];
        a(new int[]{290, 40, 159, 24}, true, null, objArr21);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, pairIAuthTabCallback13, pairIAuthTabCallback14, pairIAuthTabCallback15, pairIAuthTabCallback16, pairIAuthTabCallback17, pairIAuthTabCallback18, pairIAuthTabCallback19, pairIAuthTabCallback20, getWrite.IAuthTabCallback(((String) objArr21[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTosscertUiKspDeepLinkRegistry$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM241$r8$lambda$bEB3Es5GzsmrzhCz0kB5m_BEgM = FeaturesTosscertUiKspDeepLinkRegistry.m241$r8$lambda$bEB3Es5GzsmrzhCz0kB5m_BEgM();
                if (i3 != 0) {
                    int i4 = 6 / 0;
                }
                return clsM241$r8$lambda$bEB3Es5GzsmrzhCz0kB5m_BEgM;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return CertificateSettingActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return TossCertRenewRouteActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return positiveTextColor.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return TossCertIssueRouteActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return TossCertMydataActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return TossCertScrapingActivity.class;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TossCertificationHistoryActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return TossCertificationCenterRouteActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return TossCertificationCenterStoreRouteActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$9() {
        Class<TossCertServiceActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            cls = TossCertServiceActivity.class;
            int i4 = 41 / 0;
        } else {
            cls = TossCertServiceActivity.class;
        }
        int i5 = i2 + 27;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$12() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return TossCertServiceActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$13() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return TossCertServiceActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$14() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return TossCertServiceActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$15() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$16() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$17() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$18() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$19() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static final Class _init_$lambda$20() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return TossCertServiceActivity.class;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $11 + 115;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 57;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (Process.myTid() >> 22)), TextUtils.getTrimmedLength("") + 14, (Process.myPid() >> 22) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onWarmupCompleted;
        Object obj = null;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1))), 35 - ((Process.getThreadPriority(0) + 20) >> 6), 14239 - (ViewConfiguration.getPressedStateDuration() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    f = 0.0f;
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
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.lastIndexOf("", '0', 0)), 64 - ImageFormat.getBitsPerPixel(0), TextUtils.getOffsetAfter("", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49467), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 69, (ViewConfiguration.getTapTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
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
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i13 = $11 + 125;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(trackGroupExternalSyntheticLambda0.onNavigationEvent * i4) + 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            int i14 = $11 + 27;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 111;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{27258, 27176, 27180, 27172, 27170, 27170, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27170, 27170, 27194, 27168, 27173, 27172, 27171, 27167, 27143, 27178, 27173, 27197, 27168, 27177, 27254, 27357, 27384, 27386, 27386, 27354, 27196, 27193, 27351, 27384, 27386, 27386, 27384, 27360, 27363, 27387, 27385, 27384, 27386, 27362, 27362, 27362, 27367, 27369, 27364, 27364, 27364, 27359, 27197, 27353, 27355, 27354, 27384, 27360, 27369, 27260, 27171, 27194, 27197, 27168, 27138, 27262, 27162, 27164, 27167, 27197, 27173, 27178, 27142, 27166, 27197, 27199, 27199, 27167, 27233, 27258, 27160, 27197, 27199, 27199, 27197, 27173, 27172, 27196, 27194, 27357, 27494, 27496, 27472, 27473, 27497, 27499, 27499, 27497, 27460, 27302, 27309, 27467, 27499, 27499, 27497, 27466, 27314, 27478, 27473, 27497, 27467, 27464, 27462, 27306, 27468, 27497, 27500, 27480, 27472, 27472, 27314, 27464, 27465, 27306, 27467, 27500, 27474, 27472, 27468, 27315, 27475, 27475, 27473, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27199, 27199, 27197, 27166, 27142, 27178, 27173, 27197, 27167, 27143, 27178, 27173, 27197, 27166, 27142, 27178, 27175, 27199, 27170, 27173, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27167, 27199, 27199, 27197, 27166, 27142, 27178, 27173, 27197, 27167, 27164, 27162, 27262, 27167, 27197, 27199, 27198, 27173, 27144, 27331, 27333, 27341, 27338, 27330, 27332, 27332, 27330, 27169, 27139, 27142, 27172, 27332, 27332, 27330, 27194, 27171, 27338, 27330, 27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27143, 27178, 27173, 27197, 27167, 27136, 27177, 27177, 27177, 27178, 27176, 27143, 27145, 27176, 27170, 27138, 27142, 27178, 27173, 27197, 27152, 27387, 27389, 27389, 27357, 27350, 27386, 27388, 27382, 27349, 27188, 27344, 27346, 27349, 27379, 27387, 27360, 27356, 27348, 27379, 27381, 27381, 27349, 27191, 27184, 27374, 27379, 27381, 27381, 27379, 27387, 27386, 27378, 27376, 27295, 27483, 27264, 27485, 27487, 27466, 27468, 27266, 27484, 27484, 27456, 27485, 27264, 27264, 27287, 27484, 27484, 27456, 27485, 27487, 27466, 27457, 27482, 27484, 27459, 27462, 27464, 27456, 27461, 27264, 27487, 27466, 27484, 27482, 27264, 27459, 27464, 27462, 27484, 27264};
        onNavigationEvent = (char) 23463;
        onExtraCallbackWithResult = (char) 54796;
        IAuthTabCallback = (char) 30399;
        onExtraCallback = (char) 5686;
    }
}
