package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialRenewalIntroActivity;
import im.toss.features.credit.ui.plus.freetrial.CreditPlusFreeTrialSchemeActivity;
import im.toss.features.credit.ui.plus.gift.receive.CreditPlusGiftReceiveActivity;
import im.toss.features.credit.ui.plus.gift.receive.CreditPlusGiftReceiveUnavailableActivity;
import im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftIntroActivity;
import im.toss.features.credit.ui.plus.home.CreditPlusHomeActivity;
import im.toss.features.credit.ui.plus.insurance.CreditPlusInsuranceActivity;
import im.toss.features.credit.ui.plus.insurance.CreditPlusRequestRewardActivity;
import im.toss.features.credit.ui.plus.intro.CreditPlusIntroActivity;
import im.toss.features.credit.ui.plus.lab.CreditPlusLabActivity;
import im.toss.features.credit.ui.plus.setting.CreditPlusGiftHistoryActivity;
import im.toss.features.credit.ui.plus.setting.CreditPlusSettingActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCreditUiPlusKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    private static String $$c(int i, short s, byte b) {
        int i2 = b * 4;
        int i3 = s + 97;
        int i4 = 4 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i3);
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            int i7 = i4 + 1;
            i3 = i6 + (-bArr[i4]);
            i4 = i7;
        }
    }

    /* renamed from: $r8$lambda$-Eg2KL7n9r9s4yqNr4goOC6FM6M, reason: not valid java name */
    public static /* synthetic */ Class m124$r8$lambda$Eg2KL7n9r9s4yqNr4goOC6FM6M() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$10 = _init_$lambda$10();
        int i4 = asInterface + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$10;
    }

    public static /* synthetic */ Class $r8$lambda$3bIjfxqgkF1fZUVJ3U0L_fJc0KQ() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = asInterface + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$8;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$51tayCW1rLayw5YFDy-sO6rEdrI, reason: not valid java name */
    public static /* synthetic */ Class m125$r8$lambda$51tayCW1rLayw5YFDysO6rEdrI() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = asBinder + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$DojmcgiQ_sF-c97f9lcIjQx6GYY, reason: not valid java name */
    public static /* synthetic */ Class m126$r8$lambda$DojmcgiQ_sFc97f9lcIjQx6GYY() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = asInterface + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$IMw8_yaN1Vxqn5Jg3AOAVMAO6KU() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$5();
        }
        _init_$lambda$5();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$IqvVtsmwTrSrfo-UTqwd8iq7gw4, reason: not valid java name */
    public static /* synthetic */ Class m127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$Ma8mbWP6M_lrDHbWKcF3LxyVuvo() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$9 = _init_$lambda$9();
        int i4 = asBinder + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$9;
    }

    public static /* synthetic */ Class $r8$lambda$PXpTkbpI61TOzKW4ADDBU2Ua1k4() {
        Class cls_init_$lambda$11;
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$11 = _init_$lambda$11();
            int i3 = 34 / 0;
        } else {
            cls_init_$lambda$11 = _init_$lambda$11();
        }
        int i4 = asBinder + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$11;
    }

    public static /* synthetic */ Class $r8$lambda$ppn3zKc0ljEl1zppY9lajemne8k() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$s59mUqr7SYr3JgUDCLy-9OGKANo, reason: not valid java name */
    public static /* synthetic */ Class m128$r8$lambda$s59mUqr7SYr3JgUDCLy9OGKANo() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$2();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = asBinder + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$2;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$wnCJjxD95CgJx__PJTKNqH-pIcY, reason: not valid java name */
    public static /* synthetic */ Class m129$r8$lambda$wnCJjxD95CgJx__PJTKNqHpIcY() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$xNJSZkMoek-DlY3JsQg7B2UZnT8, reason: not valid java name */
    public static /* synthetic */ Class m130$r8$lambda$xNJSZkMoekDlY3JsQg7B2UZnT8() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i4 = asInterface + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$7;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        int i = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public FeaturesCreditUiPlusKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM129$r8$lambda$wnCJjxD95CgJx__PJTKNqHpIcY = FeaturesCreditUiPlusKspDeepLinkRegistry.m129$r8$lambda$wnCJjxD95CgJx__PJTKNqHpIcY();
                int i4 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM129$r8$lambda$wnCJjxD95CgJx__PJTKNqHpIcY;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((char) ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.getDeadChar(0, 0) - 1051112079, new char[]{6396, 63709, 38378, 49541, 641, 37421, 2696, 17548, 24486, 29537, 48969, 51750, 57360, 64213, 39681, 17698, 57928, 45199, 9634, 50794, 46574, 25203, 15737, 60757, 58253, '\\', 53758, 22617, 41528, 56685, 9407, 17845, 24092, 49187, 31010, 39415, 32982, 15174, 58543, 3365, 52989, 53001, 5721, 62165, 47406, 56508, 28761, 16504, 53844, 57082, 65192}, new char[]{0, 0, 0, 0}, new char[]{29068, 22861, 2497, 64296}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) (18783 - ExpandableListView.getPackedPositionType(0L)), ViewConfiguration.getTouchSlop() >> 8, new char[]{23491, 49703, 52114, 64751, 18669, 19862, 65392, 20469, 64317, 50412, 47938, 30014, 9678, 3178, 12786, 2115, 5706, 61651, 59193, 17420, 12372, 37179, 50979, 54141, 54983, 22906, 47043, 54666, 9400, 7524, 56419, 15567, 32418, 14159, 18778, 63342, 59405, 38926, 2805, 48479, 52227, 39652}, new char[]{0, 0, 0, 0}, new char[]{26706, 18915, 24518, 38729}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                Class clsM127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4 = FeaturesCreditUiPlusKspDeepLinkRegistry.m127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4();
                    int i3 = 84 / 0;
                } else {
                    clsM127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4 = FeaturesCreditUiPlusKspDeepLinkRegistry.m127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4();
                }
                int i4 = IAuthTabCallback + 39;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM127$r8$lambda$IqvVtsmwTrSrfoUTqwd8iq7gw4;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        b(36 - TextUtils.indexOf("", "", 0, 0), (char) (19873 - KeyEvent.keyCodeFromString("")), ViewConfiguration.getScrollBarSize() >> 8, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM128$r8$lambda$s59mUqr7SYr3JgUDCLy9OGKANo = FeaturesCreditUiPlusKspDeepLinkRegistry.m128$r8$lambda$s59mUqr7SYr3JgUDCLy9OGKANo();
                int i4 = onNavigationEvent + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM128$r8$lambda$s59mUqr7SYr3JgUDCLy9OGKANo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        b((Process.myTid() >> 22) + 40, (char) (41574 - (KeyEvent.getMaxKeyCode() >> 16)), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesCreditUiPlusKspDeepLinkRegistry.m125$r8$lambda$51tayCW1rLayw5YFDysO6rEdrI();
                }
                FeaturesCreditUiPlusKspDeepLinkRegistry.m125$r8$lambda$51tayCW1rLayw5YFDysO6rEdrI();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{63395, 51860, 35560, 36601, 25754, 24993, 1475, 3497, 10599, 52735, 20323, 34078, 2538, 3094, 55262, 463, 59868, 354, 42696, 44917, 16335, 31929, 7373, 30765, 33433, 1531, 32040, 51074, 56290, 54321, 42513, 51915, 57319, 2396}, new char[]{0, 0, 0, 0}, new char[]{32811, 40251, 59521, 58293}, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$ppn3zKc0ljEl1zppY9lajemne8k = FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$ppn3zKc0ljEl1zppY9lajemne8k();
                int i4 = onExtraCallback + 85;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$ppn3zKc0ljEl1zppY9lajemne8k;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a((char) ((Process.myPid() >> 22) + 42420), Process.myTid() >> 22, new char[]{32405, 26307, 6916, 3825, 37448, 15669, 38380, 14929, 14931, 54056, 54164, 65409, 32794, 24487, 28207, 56748, 34035, 14509, 55494, 18043, 15352, 7271, 50278, 7022, 26875, 26498, 21511, 40187}, new char[]{0, 0, 0, 0}, new char[]{64477, 54767, 46110, 2469}, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$IMw8_yaN1Vxqn5Jg3AOAVMAO6KU = FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$IMw8_yaN1Vxqn5Jg3AOAVMAO6KU();
                int i4 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$IMw8_yaN1Vxqn5Jg3AOAVMAO6KU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1280436846) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{38206, 24277, 3485, 58684, 13316, 42382, 57831, 61266, 42589, 45296, 18508, 33558, 38005, 8170, 27328, 46669, 38966, 57120, 18783, 35935, 63687, 58307, 2240, 33480, 62251, 32973, 28580, 50992, 54410, 59115, 34102, 5312, 17142}, new char[]{0, 0, 0, 0}, new char[]{37404, 44565, 56243, 36966}, objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesCreditUiPlusKspDeepLinkRegistry.m126$r8$lambda$DojmcgiQ_sFc97f9lcIjQx6GYY();
                }
                FeaturesCreditUiPlusKspDeepLinkRegistry.m126$r8$lambda$DojmcgiQ_sFc97f9lcIjQx6GYY();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a((char) (View.MeasureSpec.getSize(0) + 19075), TextUtils.indexOf("", "", 0) - 163798845, new char[]{54756, 51107, 32875, 58910, 19291, 55448, 57067, 59941, 36404, 4975, 10647, 47489, 33935, 43026, 38607, 28103, 55570, 37713, 21631, 2517, 63286, 10760, 57376, 57744, 23113, 42771, 9073, 29982, 23292, 39763, 60186, 17403, 60240, 45944, 60949, 61113, 49602, 27174, 63059, 62915, 62497}, new char[]{0, 0, 0, 0}, new char[]{50118, 15520, 33782, 33098}, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesCreditUiPlusKspDeepLinkRegistry.m130$r8$lambda$xNJSZkMoekDlY3JsQg7B2UZnT8();
                    throw null;
                }
                Class clsM130$r8$lambda$xNJSZkMoekDlY3JsQg7B2UZnT8 = FeaturesCreditUiPlusKspDeepLinkRegistry.m130$r8$lambda$xNJSZkMoekDlY3JsQg7B2UZnT8();
                int i3 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM130$r8$lambda$xNJSZkMoekDlY3JsQg7B2UZnT8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a((char) (TextUtils.getCapsMode("", 0, 0) + 29030), 438269730 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{42269, 42419, 10798, 32879, 37560, 44700, 916, 16009, 31003, 36984, 46559, 21256, 18034, 55711, 26807, 33013, 37585, 27318, 49814, 1994, 26514, 54493, 27079, 54051, 6113, 47016, 36700, 23231, 11825}, new char[]{0, 0, 0, 0}, new char[]{8672, 8055, 26138, 63089}, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$3bIjfxqgkF1fZUVJ3U0L_fJc0KQ = FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$3bIjfxqgkF1fZUVJ3U0L_fJc0KQ();
                if (i3 != 0) {
                    int i4 = 1 / 0;
                }
                return cls$r8$lambda$3bIjfxqgkF1fZUVJ3U0L_fJc0KQ;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) - 462945119, new char[]{41780, 957, 33965, 36659, 10996, 44292, 22483, 64967, 51572, 53779, 64404, 16805, 52836, 10946, 45067, 7183, 4719, 38699, 41673, 53341, 22185, 5841, 48260}, new char[]{0, 0, 0, 0}, new char[]{41216, 26628, 62948, 49436}, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$Ma8mbWP6M_lrDHbWKcF3LxyVuvo();
                    throw null;
                }
                Class cls$r8$lambda$Ma8mbWP6M_lrDHbWKcF3LxyVuvo = FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$Ma8mbWP6M_lrDHbWKcF3LxyVuvo();
                int i3 = onExtraCallback + 17;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$Ma8mbWP6M_lrDHbWKcF3LxyVuvo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{24841, 51688, 53959, 46099, 6018, 26320, 19826, 5039, 46363, 22227, 43384, 56956, 1732, 43332, 47623, 32750, 27576, 34062, 24292, 53009, 48307, 60746, 29796, 63248, 31825, 41032, 7346, 10840, 14314, 30705, 40027, 53886, 42820, 56120, 4723, 60590}, new char[]{0, 0, 0, 0}, new char[]{2476, 49902, 65462, 30267}, objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM124$r8$lambda$Eg2KL7n9r9s4yqNr4goOC6FM6M = FeaturesCreditUiPlusKspDeepLinkRegistry.m124$r8$lambda$Eg2KL7n9r9s4yqNr4goOC6FM6M();
                int i4 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM124$r8$lambda$Eg2KL7n9r9s4yqNr4goOC6FM6M;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, (char) (Drawable.resolveOpacity(0, 0) + 53210), 75 - TextUtils.lastIndexOf("", '0', 0, 0), objArr12);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiPlusKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$PXpTkbpI61TOzKW4ADDBU2Ua1k4 = FeaturesCreditUiPlusKspDeepLinkRegistry.$r8$lambda$PXpTkbpI61TOzKW4ADDBU2Ua1k4();
                int i4 = onExtraCallback + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$PXpTkbpI61TOzKW4ADDBU2Ua1k4;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return CreditPlusFreeTrialRenewalIntroActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return CreditPlusFreeTrialSchemeActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return CreditPlusGiftReceiveActivity.class;
        }
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        Class<CreditPlusGiftReceiveUnavailableActivity> cls;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            cls = CreditPlusGiftReceiveUnavailableActivity.class;
            int i4 = 55 / 0;
        } else {
            cls = CreditPlusGiftReceiveUnavailableActivity.class;
        }
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return CreditPlusGiftIntroActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return CreditPlusHomeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 85;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return CreditPlusInsuranceActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return CreditPlusRequestRewardActivity.class;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return CreditPlusIntroActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$9() {
        Class<CreditPlusLabActivity> cls;
        int i = 2 % 2;
        int i2 = asBinder + 69;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            cls = CreditPlusLabActivity.class;
            int i4 = 18 / 0;
        } else {
            cls = CreditPlusLabActivity.class;
        }
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return CreditPlusGiftHistoryActivity.class;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return CreditPlusSettingActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 111;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.makeMeasureSpec(0, 0)), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Gravity.getAbsoluteGravity(0, 0)), 30 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49123), 43 - MotionEvent.axisFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $11 + 99;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $10 + 87;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iIndexOf = 42 - TextUtils.indexOf((CharSequence) "", '0');
                    int iAlpha = 1451 - Color.alpha(i5);
                    byte b = (byte) i5;
                    String str$$c = $$c(b, (byte) (b | 13), b);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, iIndexOf, iAlpha, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) "", '0', i5));
                    int iBlue = Color.blue(i5) + 44;
                    int mode = View.MeasureSpec.getMode(i5) + 1494;
                    byte b2 = (byte) i5;
                    String str$$c2 = $$c(b2, (byte) (b2 | 12), b2);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iBlue, mode, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char c2 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23971);
                    int modifierMetaStateMask = 49 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int offsetAfter = 22939 - TextUtils.getOffsetAfter("", i5);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, modifierMetaStateMask, offsetAfter, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i11);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45848);
                    int iAlpha2 = 29 - Color.alpha(i5);
                    int iIndexOf2 = 12576 - TextUtils.indexOf((CharSequence) "", '0');
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, iAlpha2, iIndexOf2, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallback = -1776194565;
        onExtraCallbackWithResult = (char) 11197;
        IAuthTabCallback = new char[]{40966, 48647, 39947, 64005, 55323, 13858, 5168, 29239, 20542, 44656, 35868, 59927, 51266, 9820, 1138, 25208, 16492, 24182, 48164, 39552, 63637, 54931, 13468, 4859, 28858, 20147, 44197, 35516, 59550, 50892, 9410, 719, 24816, 32507, 23789, 47845, 20417, 20928, 29644, 5570, 14300, 55781, 64503, 40432, 49145, 16823, 25563, 1488, 10117, 51611, 60341, 36287, 44971, 45489, 21475, 30023, 5970, 14676, 56155, 64828, 40829, 41332, 17250, 25979, 1881, 10508, 51982, 60682, 36644, 37172, 45877, 21803, 30511, 6355, 15060, 56518, 8829, 15484, 7792, 30846, 23136, 46169, 38475, 61516, 53829, 11275, 3687, 26732, 19001, 42023, 34313, 57347, 49687, 56333, 15967, 6395, 31470, 21736, 46823, 36992, 62165, 52420, 11980, 2247, 27299, 17579, 42683};
        onWarmupCompleted = -7017305130553969709L;
    }
}
