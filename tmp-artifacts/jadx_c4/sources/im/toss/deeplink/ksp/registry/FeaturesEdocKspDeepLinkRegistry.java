package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.edoc.EDocAuthActivity;
import im.toss.features.edoc.EDocHomeTabActivity;
import im.toss.features.edoc.EDocIssuableListActivity;
import im.toss.features.edoc.EDocIssueCandidatesActivity;
import im.toss.features.edoc.EDocIssueSchemeActivity;
import im.toss.features.edoc.EDocOpenSchemeActivity;
import im.toss.features.edoc.ElectronicDocumentDetailWebActivity;
import im.toss.features.edoc.register.AptBillActivity;
import im.toss.features.edoc.register.AptIntroActivity;
import im.toss.features.edoc.univ.UnivExternalWebActivity;
import im.toss.features.edoc.univ.UnivLoadingActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesEdocKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char[] IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static boolean onWarmupCompleted;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = (b * 2) + 4;
        int i3 = (s * 4) + 105;
        byte[] bArr = $$a;
        int i4 = (s2 * 4) + 1;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2++;
            i3 += -i5;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i2];
            i2++;
            i3 += -i5;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    /* renamed from: $r8$lambda$-xqQnM_NuUXHVYHbaMpjE_hptpE, reason: not valid java name */
    public static /* synthetic */ Class m134$r8$lambda$xqQnM_NuUXHVYHbaMpjE_hptpE() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$4();
            throw null;
        }
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i3 = IAuthTabCallbackStub + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$1NYbruRtoJFyzrgGtHV9sgtaHdQ() {
        Class cls_init_$lambda$6;
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$6 = _init_$lambda$6();
            int i3 = 50 / 0;
        } else {
            cls_init_$lambda$6 = _init_$lambda$6();
        }
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$5v-L3aKpd5IYPSetB9KCrXmaQPk, reason: not valid java name */
    public static /* synthetic */ Class m135$r8$lambda$5vL3aKpd5IYPSetB9KCrXmaQPk() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$9 = _init_$lambda$9();
        int i4 = onTransact + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$9;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$DrO4oJFy5VV8oMkIgVGygWTFPag() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$I8xANjAutc9cWKqfO97WI2mZ_4k() {
        Class cls_init_$lambda$12;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$12 = _init_$lambda$12();
            int i3 = 49 / 0;
        } else {
            cls_init_$lambda$12 = _init_$lambda$12();
        }
        int i4 = onTransact + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$J9Z8f4LH6HIJ4hIgI53z7qPBLUc() {
        Class cls_init_$lambda$5;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$5 = _init_$lambda$5();
            int i3 = 92 / 0;
        } else {
            cls_init_$lambda$5 = _init_$lambda$5();
        }
        int i4 = onTransact + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$5;
    }

    /* renamed from: $r8$lambda$MzayljAyHSp4-ZjM51gBmxI_TYo, reason: not valid java name */
    public static /* synthetic */ Class m136$r8$lambda$MzayljAyHSp4ZjM51gBmxI_TYo() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$13 = _init_$lambda$13();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return cls_init_$lambda$13;
    }

    /* renamed from: $r8$lambda$QJ3s15mK-_ZXULIHNzhcTpj308Q, reason: not valid java name */
    public static /* synthetic */ Class m137$r8$lambda$QJ3s15mK_ZXULIHNzhcTpj308Q() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$VIi3_KlY3xfbgRqsZ3UXloKrY5c() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$11();
        }
        _init_$lambda$11();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Q-ly0Y, reason: not valid java name */
    public static /* synthetic */ Class m138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$10 = _init_$lambda$10();
        int i4 = IAuthTabCallbackStub + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$10;
    }

    public static /* synthetic */ Class $r8$lambda$_zko_reYv5S_9qgzFhPpsAoLRHA() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$eK-1_rxna4AnkxhQov_rO_6qbao, reason: not valid java name */
    public static /* synthetic */ Class m139$r8$lambda$eK1_rxna4AnkxhQov_rO_6qbao() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$gLyLC2jB9_EQPE_8aFTgdyAVE70() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$hi9-ppRbxdkbgQPo1i6sL0Z0iQc, reason: not valid java name */
    public static /* synthetic */ Class m140$r8$lambda$hi9ppRbxdkbgQPo1i6sL0Z0iQc() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = IAuthTabCallbackStub + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$8;
    }

    static {
        asBinder = 0;
        onNavigationEvent();
        int i = IAuthTabCallbackDefault + 101;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesEdocKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM137$r8$lambda$QJ3s15mK_ZXULIHNzhcTpj308Q = FeaturesEdocKspDeepLinkRegistry.m137$r8$lambda$QJ3s15mK_ZXULIHNzhcTpj308Q();
                if (i3 == 0) {
                    int i4 = 40 / 0;
                }
                return clsM137$r8$lambda$QJ3s15mK_ZXULIHNzhcTpj308Q;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, new char[]{15, 65494, 65483, 65483, 1, '\b', 1, 65535, 16, 14, 11, '\n', 5, 65535, 65481, 0, 11, 65535, 17, '\t', 1, '\n', 16, 65483, 65533, 17, 16, 4, 15, 17, '\f', 1, 14, 16, 11, 15}, false, 133 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-127, -124, -122, -111, -113, -115, -113, -116, -111, -117, -119, -124, -126, -127, -127, -115, -119, -122, -116, -124, -112, -126, -117, -121, -113, -114, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, (Process.myPid() >> 22) + 127, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesEdocKspDeepLinkRegistry.$r8$lambda$DrO4oJFy5VV8oMkIgVGygWTFPag();
                }
                FeaturesEdocKspDeepLinkRegistry.$r8$lambda$DrO4oJFy5VV8oMkIgVGygWTFPag();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 42, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, new char[]{0, 65533, 16, 1, 15, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 1, '\b', 1, 65535, 16, 14, 11, '\n', 5, 65535, 65481, 0, 11, 65535, 17, '\t', 1, '\n', 16, 65483, 65535, 65533, '\n', 0, 5}, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 132, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM139$r8$lambda$eK1_rxna4AnkxhQov_rO_6qbao = FeaturesEdocKspDeepLinkRegistry.m139$r8$lambda$eK1_rxna4AnkxhQov_rO_6qbao();
                int i4 = onExtraCallbackWithResult + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM139$r8$lambda$eK1_rxna4AnkxhQov_rO_6qbao;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-122, -124, -118, -118, -111, -110, -119, -122, -116, -124, -112, -126, -117, -121, -113, -119, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$_zko_reYv5S_9qgzFhPpsAoLRHA = FeaturesEdocKspDeepLinkRegistry.$r8$lambda$_zko_reYv5S_9qgzFhPpsAoLRHA();
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$_zko_reYv5S_9qgzFhPpsAoLRHA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{-109, -124, -110, -119, -122, -116, -124, -112, -126, -117, -121, -113, -119, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - ExpandableListView.getPackedPositionGroup(0L), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 79;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM134$r8$lambda$xqQnM_NuUXHVYHbaMpjE_hptpE = FeaturesEdocKspDeepLinkRegistry.m134$r8$lambda$xqQnM_NuUXHVYHbaMpjE_hptpE();
                if (i3 != 0) {
                    int i4 = 71 / 0;
                }
                return clsM134$r8$lambda$xqQnM_NuUXHVYHbaMpjE_hptpE;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 37, (KeyEvent.getMaxKeyCode() >> 16) + 6, new char[]{16, 14, 1, '\f', 17, 15, 5, 16, '\f', 65533, 65483, 16, '\n', 1, '\t', 17, 65535, 11, 0, 65483, 65535, 5, '\n', 11, 14, 16, 65535, 1, '\b', 1, 65483, 65483, 65494, 15, 15, 11}, true, (-16777084) - Color.rgb(0, 0, 0), objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesEdocKspDeepLinkRegistry.$r8$lambda$J9Z8f4LH6HIJ4hIgI53z7qPBLUc();
                }
                FeaturesEdocKspDeepLinkRegistry.$r8$lambda$J9Z8f4LH6HIJ4hIgI53z7qPBLUc();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a(45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 9 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{5, 15, 16, 1, 14, 65483, 65533, '\f', 16, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 1, '\b', 1, 65535, 16, 14, 11, '\n', 5, 65535, 65483, 0, 11, 65535, 17, '\t', 1, '\n', 16, 65483, 14, 1, 3}, false, 132 - KeyEvent.normalizeMetaState(0), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$1NYbruRtoJFyzrgGtHV9sgtaHdQ = FeaturesEdocKspDeepLinkRegistry.$r8$lambda$1NYbruRtoJFyzrgGtHV9sgtaHdQ();
                int i4 = onNavigationEvent + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$1NYbruRtoJFyzrgGtHV9sgtaHdQ;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(39 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getCapsMode("", 0, 0) + 5, new char[]{18, 65483, 19, 1, 65534, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 1, '\b', 1, 65535, 16, 14, 11, '\n', 5, 65535, 65481, 0, 11, 65535, 17, '\t', 1, '\n', 16, 65483, 17, '\n', 5}, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 132, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$gLyLC2jB9_EQPE_8aFTgdyAVE70 = FeaturesEdocKspDeepLinkRegistry.$r8$lambda$gLyLC2jB9_EQPE_8aFTgdyAVE70();
                int i4 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 99 / 0;
                }
                return cls$r8$lambda$gLyLC2jB9_EQPE_8aFTgdyAVE70;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        b(null, new byte[]{-107, -116, -115, -113, -111, -121, -118, -119, -108, -115, -116, -126, -119, -122, -116, -124, -112, -126, -117, -121, -113, -114, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - (Process.myTid() >> 22), objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesEdocKspDeepLinkRegistry.m140$r8$lambda$hi9ppRbxdkbgQPo1i6sL0Z0iQc();
                }
                FeaturesEdocKspDeepLinkRegistry.m140$r8$lambda$hi9ppRbxdkbgQPo1i6sL0Z0iQc();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        b(null, new byte[]{-124, -112, -121, -106, -119, -122, -116, -124, -112, -126, -117, -121, -113, -114, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda13
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM135$r8$lambda$5vL3aKpd5IYPSetB9KCrXmaQPk = FeaturesEdocKspDeepLinkRegistry.m135$r8$lambda$5vL3aKpd5IYPSetB9KCrXmaQPk();
                int i4 = onExtraCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM135$r8$lambda$5vL3aKpd5IYPSetB9KCrXmaQPk;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 37, 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{4, '\t', '\n', '\r', 15, 65534, 0, 7, 0, 65482, 65482, 65493, 14, 14, '\n', 15, '\r', 0, 11, 16, 14, 0, 16, 14, 14, 4, 65482, 15, '\t', 0, '\b', 16, 65534, '\n', 65535, 65480, 65534}, true, TextUtils.getOffsetBefore("", 0) + 133, objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Class clsM138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y = FeaturesEdocKspDeepLinkRegistry.m138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y();
                    int i3 = 56 / 0;
                } else {
                    clsM138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y = FeaturesEdocKspDeepLinkRegistry.m138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y();
                }
                int i4 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 50 / 0;
                }
                return clsM138$r8$lambda$_k6Sz5IjhZup1Cb1Wd8p6Qly0Y;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        b(null, new byte[]{-116, -124, -125, -121, -119, -122, -116, -124, -112, -126, -117, -121, -113, -114, -117, -115, -116, -121, -123, -122, -117, -124, -118, -124, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, ExpandableListView.getPackedPositionChild(0L) + 128, objArr12);
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$VIi3_KlY3xfbgRqsZ3UXloKrY5c = FeaturesEdocKspDeepLinkRegistry.$r8$lambda$VIi3_KlY3xfbgRqsZ3UXloKrY5c();
                int i4 = IAuthTabCallback + 49;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 16 / 0;
                }
                return cls$r8$lambda$VIi3_KlY3xfbgRqsZ3UXloKrY5c;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr13 = new Object[1];
        a(45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{14, 1, '\f', 17, 15, 1, 17, 15, 15, 5, 65483, 16, 1, '\b', '\b', 65533, 19, 65483, 16, '\n', 1, '\t', 17, 65535, 11, 0, 65483, 65535, 5, '\n', 11, 14, 16, 65535, 1, '\b', 1, 65483, 65483, 65494, 15, 15, 11, 16}, true, (-16777084) - Color.rgb(0, 0, 0), objArr13);
        Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(((String) objArr13[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$I8xANjAutc9cWKqfO97WI2mZ_4k = FeaturesEdocKspDeepLinkRegistry.$r8$lambda$I8xANjAutc9cWKqfO97WI2mZ_4k();
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$I8xANjAutc9cWKqfO97WI2mZ_4k;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr14 = new Object[1];
        a(38 - TextUtils.indexOf("", ""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, new char[]{15, '\t', 0, '\b', 16, 65534, '\n', 65535, 65480, 65534, 4, '\t', '\n', '\r', 15, 65534, 0, 7, 0, 65482, 65482, 65493, 14, 14, '\n', 15, '\r', 0, 11, 16, 14, 15, 4, '\b', 65533, 16, 14, 65482}, true, 133 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, pairIAuthTabCallback13, getWrite.IAuthTabCallback(((String) objArr14[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesEdocKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM136$r8$lambda$MzayljAyHSp4ZjM51gBmxI_TYo = FeaturesEdocKspDeepLinkRegistry.m136$r8$lambda$MzayljAyHSp4ZjM51gBmxI_TYo();
                int i4 = onWarmupCompleted + 1;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM136$r8$lambda$MzayljAyHSp4ZjM51gBmxI_TYo;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return EDocAuthActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return EDocIssuableListActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        Class<EDocIssueCandidatesActivity> cls;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            cls = EDocIssueCandidatesActivity.class;
            int i4 = 36 / 0;
        } else {
            cls = EDocIssueCandidatesActivity.class;
        }
        int i5 = i2 + 99;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return EDocOpenSchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return ElectronicDocumentDetailWebActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return AptBillActivity.class;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return AptIntroActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return UnivExternalWebActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return UnivLoadingActivity.class;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return EDocHomeTabActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return EDocHomeTabActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return EDocHomeTabActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$12() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return EDocIssueSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$13() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return EDocIssueSchemeActivity.class;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 85;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.lastIndexOf("", '0', 0, 0) + 24, 10278 - Color.green(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0')), 55 - (ViewConfiguration.getPressedStateDuration() >> 16), 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i9 = $11 + 109;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 75;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12843), View.resolveSize(0, 0) + 55, 2167 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2;
        long j;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = $11 + 83;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 77 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetAfter("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j2 = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.getTrimmedLength("") + 75, ExpandableListView.getPackedPositionType(0L) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!onWarmupCompleted) {
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 121;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i9 = $11 + 77;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 62 - TextUtils.lastIndexOf("", '0', 0), 12214 - View.resolveSizeAndState(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i10 = $10 + 89;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            i2 = defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback;
        }
        char[] cArr6 = new char[i2];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 59;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] + iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j2), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                j = 0;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    j = 0;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 62 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                } else {
                    j = 0;
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            j2 = j;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onExtraCallback = 478308873;
        IAuthTabCallback = new char[]{32738, 32736, 32749, 32752, 32739, 32737, 32750, 32731, 32686, 32745, 32754, 32751, 32756, 32680, 32753, 32744, 32764, 32742, 32755, 32743, 32758, 32757};
        onExtraCallbackWithResult = -1184333923;
        onNavigationEvent = true;
        onWarmupCompleted = true;
    }
}
