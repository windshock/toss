package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.payment.alipay.rewards.activity.AlipayRewardsExternalWebViewActivity;
import im.toss.features.payment.alipay.rewards.activity.AlipayRewardsInternalOpenSchemeActivity;
import im.toss.features.payment.alipay.rewards.activity.AlipayRewardsOpenSchemeActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesPaymentAlipayRewardsKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$09PehRyHfH_XIWGrriz2geqhbx4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$MIZkGy5hESw2ht5QRmgLaWIIkVk() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$SV9s6lERPGOPtqWHT8Vjp2d-YWg, reason: not valid java name */
    public static /* synthetic */ Class m201$r8$lambda$SV9s6lERPGOPtqWHT8Vjp2dYWg() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$3();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$hUclZL_K_auCzd-0mUA2-9hEO-4, reason: not valid java name */
    public static /* synthetic */ Class m202$r8$lambda$hUclZL_K_auCzd0mUA29hEO4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$paQFy5rNuYjm1fxv5UmkqwBMOSM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        int i = IAuthTabCallback + 31;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
    }

    public FeaturesPaymentAlipayRewardsKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentAlipayRewardsKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.$r8$lambda$MIZkGy5hESw2ht5QRmgLaWIIkVk();
                }
                FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.$r8$lambda$MIZkGy5hESw2ht5QRmgLaWIIkVk();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{2308, 973, 7321, 10623, 8761, 16136, 18882, 17069, 24444, 26634, 25934, 32701, 34978, 34200, 40524, 43814, 42470, 48817, 52182, 50247, 53554, 60386, 58580, 61854, 2669, 1839, 4118, 10960, 10162, 12393, 19738, 17923, 20719, 28076, 26220, 29512, 35845, 34557, 37793, 44241, 47448, 45621, 52451}, Color.green(0) + 2767, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{2308, 20273, 34145, 56203, 4553, 22524, 44074, 57953, 14492, 32390, 46246, 3433, 17266, 39308, 57300, 5626, 27174, 41069, 59086, 15571, 29410, 52022, 380, 18322, 40397, 54243, 10302, 28260, 42114, 64221, 12450, 35123, 53113, 1424, 23508, 37372, 54837, 11337, 25225, 47261, 65248, 14124, 36172, 50056, 6642, 24560, 37933, 60003, 8323}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17970, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentAlipayRewardsKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$09PehRyHfH_XIWGrriz2geqhbx4 = FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.$r8$lambda$09PehRyHfH_XIWGrriz2geqhbx4();
                int i4 = IAuthTabCallback + 97;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$09PehRyHfH_XIWGrriz2geqhbx4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{2308, 13927, 30669, 46909, 62609, 13818, 30022, 45767, 61996, 13248, 28842, 45071, 61866, 12602, 32408, 49132, 65350, 15547, 31810, 48485, 64250, 14928, 31664, 47892, 63613, 14789, 31058, 42658, 58906, 10091, 25742, 42021, 58809, 9478, 25208, 41930, 58157, 8335, 25061, 41275, 61136, 11818, 28544, 44270, 60542, 11716, 27965}, 16229 - Color.blue(0), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentAlipayRewardsKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.m202$r8$lambda$hUclZL_K_auCzd0mUA29hEO4();
                }
                FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.m202$r8$lambda$hUclZL_K_auCzd0mUA29hEO4();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{2308, 5817, 13937, 22051, 30697, 38820, 46970, 55065, 62684, 5342, 13334, 21585, 30162, 38244, 46372, 54002, 62118, 4709, 12926, 21499, 29570, 37710, 45836, 53450, 61581, 4187, 12782, 20924, 29026, 37173, 48818, 57021, 65127, 7689, 16335, 24487, 32587, 40704, 48380, 56430}, 8123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentAlipayRewardsKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 103;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM201$r8$lambda$SV9s6lERPGOPtqWHT8Vjp2dYWg = FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.m201$r8$lambda$SV9s6lERPGOPtqWHT8Vjp2dYWg();
                int i4 = onExtraCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM201$r8$lambda$SV9s6lERPGOPtqWHT8Vjp2dYWg;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new char[]{2308, 6153, 11025, 14899, 19753, 23604, 28506, 32329, 33116, 36910, 41782, 45601, 50578, 54420, 59268, 63138, 6566, 10421, 15262, 19147, 24002, 27902, 32748, 36602, 36877, 41739, 45582, 50476, 54306, 59173, 62994, 6477, 10343, 15225, 19055, 23971, 27785, 32652}, 4364 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesPaymentAlipayRewardsKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$paQFy5rNuYjm1fxv5UmkqwBMOSM = FeaturesPaymentAlipayRewardsKspDeepLinkRegistry.$r8$lambda$paQFy5rNuYjm1fxv5UmkqwBMOSM();
                int i4 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$paQFy5rNuYjm1fxv5UmkqwBMOSM;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return AlipayRewardsExternalWebViewActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return AlipayRewardsInternalOpenSchemeActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return AlipayRewardsInternalOpenSchemeActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return AlipayRewardsOpenSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return AlipayRewardsOpenSchemeActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 1;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0) + 24, 19627 - View.MeasureSpec.getMode(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 59, Color.blue(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 123;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 35;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 59, 6382 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 59 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = -2285213354156520384L;
    }
}
