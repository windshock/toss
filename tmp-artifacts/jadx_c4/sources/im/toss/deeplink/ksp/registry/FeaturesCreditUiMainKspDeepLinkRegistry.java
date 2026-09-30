package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingFunnelHandleActivity;
import im.toss.feature.credit.ui.main.home.CreditHomeActivity;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity;
import im.toss.feature.credit.ui.main.intro.CreditIntroActivity;
import im.toss.feature.credit.ui.main.report.CreditHighInterestComparisonActivity;
import im.toss.feature.credit.ui.main.report.CreditScoreReportActivity;
import im.toss.feature.credit.ui.main.test.CreditTestActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCreditUiMainKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static char IAuthTabCallback;
    private static int asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static long onTransact;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = (b * 3) + 97;
        int i5 = s * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i4 = i6;
            int i7 = i3;
            int i8 = 0;
            i4 += -i3;
            i3 = i7;
            i2 = i8;
            int i9 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i9;
            i3 = bArr[i9];
            i4 += -i3;
            i3 = i7;
            i2 = i8;
            int i92 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* renamed from: $r8$lambda$4Fy-MffFCiCIvX7AesgI_Y0DMRM, reason: not valid java name */
    public static /* synthetic */ Class m118$r8$lambda$4FyMffFCiCIvX7AesgI_Y0DMRM() {
        Class cls_init_$lambda$9;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$9 = _init_$lambda$9();
            int i3 = 84 / 0;
        } else {
            cls_init_$lambda$9 = _init_$lambda$9();
        }
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$9;
    }

    /* renamed from: $r8$lambda$6-oq80fAGuDmVM6O850Wj3NOcuM, reason: not valid java name */
    public static /* synthetic */ Class m119$r8$lambda$6oq80fAGuDmVM6O850Wj3NOcuM() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$7 = _init_$lambda$7();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return cls_init_$lambda$7;
    }

    /* renamed from: $r8$lambda$MFDvxJHG-N6oZdbG7chl3y64gw4, reason: not valid java name */
    public static /* synthetic */ Class m120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$3();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$3;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$Po_JDl2B-kZ-O_c-d7etFKhLp_4, reason: not valid java name */
    public static /* synthetic */ Class m121$r8$lambda$Po_JDl2BkZO_cd7etFKhLp_4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$QqHJXtvRmNDAOUARBo3lPLi5OfQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$_9K0bvliIT9xdlT9bSdSM42dd-M, reason: not valid java name */
    public static /* synthetic */ Class m122$r8$lambda$_9K0bvliIT9xdlT9bSdSM42ddM() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$_t_AtBwIH3fmnjlPG2dHAPE-b-g, reason: not valid java name */
    public static /* synthetic */ Class m123$r8$lambda$_t_AtBwIH3fmnjlPG2dHAPEbg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i4 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$apI0cNoRxUEvyllGikzMUQid7Zk() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$nyLrcXEoGD_QHxaGyTwLeUMH3L8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$w363kcNN4jaD72Mc7a8ZfWbEH74() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return cls_init_$lambda$8;
    }

    static {
        asInterface = 1;
        onExtraCallbackWithResult();
        int i = asBinder + 37;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public FeaturesCreditUiMainKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM122$r8$lambda$_9K0bvliIT9xdlT9bSdSM42ddM = FeaturesCreditUiMainKspDeepLinkRegistry.m122$r8$lambda$_9K0bvliIT9xdlT9bSdSM42ddM();
                int i4 = IAuthTabCallback + 1;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM122$r8$lambda$_9K0bvliIT9xdlT9bSdSM42ddM;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 63618, 21195, 58674, 17035, 32947, 9797, 60428, 39417, 1830, 23620, 53064, 40206, 34383, 36740, 54892, 38036, 59929, 1571}, 29 - TextUtils.getTrimmedLength(""), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 63618, 21195, 58674, 17035, 32947, 9797, 43172, 34884, 5491, 56544, 4136, 55880, 60428, 39417, 19916, 55614, 25711, 29712, 4109, 33329, 48221, 57187}, View.resolveSize(0, 0) + 34, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM121$r8$lambda$Po_JDl2BkZO_cd7etFKhLp_4 = FeaturesCreditUiMainKspDeepLinkRegistry.m121$r8$lambda$Po_JDl2BkZO_cd7etFKhLp_4();
                int i4 = onExtraCallback + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM121$r8$lambda$Po_JDl2BkZO_cd7etFKhLp_4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        b(23 - TextUtils.lastIndexOf("", '0'), (char) Color.red(0), ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$nyLrcXEoGD_QHxaGyTwLeUMH3L8();
                    throw null;
                }
                Class cls$r8$lambda$nyLrcXEoGD_QHxaGyTwLeUMH3L8 = FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$nyLrcXEoGD_QHxaGyTwLeUMH3L8();
                int i3 = onNavigationEvent + 7;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$nyLrcXEoGD_QHxaGyTwLeUMH3L8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        b(31 - (Process.myTid() >> 22), (char) View.getDefaultSize(0, 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                Class clsM120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4;
                int i = 2 % 2;
                int i2 = onExtraCallback + 101;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4 = FeaturesCreditUiMainKspDeepLinkRegistry.m120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4();
                    int i3 = 49 / 0;
                } else {
                    clsM120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4 = FeaturesCreditUiMainKspDeepLinkRegistry.m120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4();
                }
                int i4 = IAuthTabCallback + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM120$r8$lambda$MFDvxJHGN6oZdbG7chl3y64gw4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 63618, 21195, 58674, 17035, 32947, 9797, 62805, 4543, 13342, 162, 22260, 28506, 50600, 18851, 47623, 221, 26326, 7247, 46428, 57181}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 31, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$QqHJXtvRmNDAOUARBo3lPLi5OfQ();
                }
                FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$QqHJXtvRmNDAOUARBo3lPLi5OfQ();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 63618, 21195, 58674, 17035, 32947, 9797, 53132, 1529, 63690, 63639, 25055, 8707, 36643, 6449, 58866, 39478, 24454, 7266}, ((Process.getThreadPriority(0) + 20) >> 6) + 29, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesCreditUiMainKspDeepLinkRegistry.m123$r8$lambda$_t_AtBwIH3fmnjlPG2dHAPEbg();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class clsM123$r8$lambda$_t_AtBwIH3fmnjlPG2dHAPEbg = FeaturesCreditUiMainKspDeepLinkRegistry.m123$r8$lambda$_t_AtBwIH3fmnjlPG2dHAPEbg();
                int i3 = onWarmupCompleted + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM123$r8$lambda$_t_AtBwIH3fmnjlPG2dHAPEbg;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, (char) TextUtils.indexOf("", ""), 55 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$apI0cNoRxUEvyllGikzMUQid7Zk = FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$apI0cNoRxUEvyllGikzMUQid7Zk();
                int i4 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 37 / 0;
                }
                return cls$r8$lambda$apI0cNoRxUEvyllGikzMUQid7Zk;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        b(28 - View.combineMeasuredStates(0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 44750), 78 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesCreditUiMainKspDeepLinkRegistry.m119$r8$lambda$6oq80fAGuDmVM6O850Wj3NOcuM();
                }
                FeaturesCreditUiMainKspDeepLinkRegistry.m119$r8$lambda$6oq80fAGuDmVM6O850Wj3NOcuM();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 45011, 25867, 38332, 42699, 54892, 38036, 57911, 32500, 63618, 21195, 58674, 17035, 32947, 9797}, 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$w363kcNN4jaD72Mc7a8ZfWbEH74 = FeaturesCreditUiMainKspDeepLinkRegistry.$r8$lambda$w363kcNN4jaD72Mc7a8ZfWbEH74();
                int i4 = onExtraCallback + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$w363kcNN4jaD72Mc7a8ZfWbEH74;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        a(new char[]{53064, 40206, 11492, 26143, 34329, 39340, 45025, 32315, 29848, 40556, 36291, 38045, 63618, 21195, 58674, 17035, 32947, 9797}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr10);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiMainKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesCreditUiMainKspDeepLinkRegistry.m118$r8$lambda$4FyMffFCiCIvX7AesgI_Y0DMRM();
                }
                FeaturesCreditUiMainKspDeepLinkRegistry.m118$r8$lambda$4FyMffFCiCIvX7AesgI_Y0DMRM();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return CreditConsultingFunnelHandleActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return CreditScoreRaiseCoolTimeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return CreditIntroActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        Class<CreditHighInterestComparisonActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            cls = CreditHighInterestComparisonActivity.class;
            int i4 = 37 / 0;
        } else {
            cls = CreditHighInterestComparisonActivity.class;
        }
        int i5 = i3 + 5;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$4() {
        Class<CreditScoreReportActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 5;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            cls = CreditScoreReportActivity.class;
            int i4 = 59 / 0;
        } else {
            cls = CreditScoreReportActivity.class;
        }
        int i5 = i2 + 103;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return CreditTestActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return CreditHomeActivity.class;
    }

    private static final Class _init_$lambda$7() {
        Class<CreditHomeActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 29;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            cls = CreditHomeActivity.class;
            int i4 = 45 / 0;
        } else {
            cls = CreditHomeActivity.class;
        }
        int i5 = i2 + 109;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return CreditHomeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 73;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return CreditHomeActivity.class;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $10 + 115;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 % i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 59697), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10973 - KeyEvent.getDeadChar(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onTransact), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46135), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 20220 - (ViewConfiguration.getScrollBarSize() >> 8), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49123), 44 - View.resolveSizeAndState(0, 0, 0), 1495 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i2 + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 17 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onTransact), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), (KeyEvent.getMaxKeyCode() >> 16) + 31, 20220 - View.MeasureSpec.getMode(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, 1494 - (ViewConfiguration.getLongPressTimeout() >> 16), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i7 = $10 + 29;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1494 - Color.alpha(0), -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int i10 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 10;
                        int iBlue = Color.blue(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i10, iBlue, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 10, (KeyEvent.getMaxKeyCode() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16015), Color.red(0) + 14, 19901 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 45;
        $10 = i11 % 128;
        if (i11 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i12 = 43 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = (char) 25577;
        onExtraCallbackWithResult = (char) 32876;
        IAuthTabCallback = (char) 22929;
        onWarmupCompleted = (char) 19806;
        onNavigationEvent = new char[]{60839, 23879, 35944, 65283, 11838, 39390, 51423, 15341, 27287, 54776, 1287, 29721, 42879, 5640, 16677, 45258, 58333, 21222, 40407, 52399, 15426, 28542, 56930, 2321, 60839, 23879, 35944, 65283, 11838, 39390, 51423, 15341, 27287, 54776, 1287, 29721, 42879, 5640, 16677, 45258, 58333, 21222, 40407, 52394, 15427, 28523, 56958, 2385, 30759, 43981, 6885, 17894, 46237, 59304, 22341, 60839, 23879, 35944, 65283, 11838, 39390, 51423, 15341, 27287, 54776, 1287, 29721, 42879, 5640, 16677, 45258, 58333, 21222, 40407, 52395, 15437, 28515, 56958, 17257, 62345, 8870, 20941, 33008, 14096, 26129, 38179, 50265, 31542, 43977, 56023, 2486, 47317, 61437, 7688, 19736, 64563, 13143, 25210, 37510, 49643, 28861, 42946, 55023, 1288, 46127, 60204};
        onTransact = -5210220865582703310L;
    }
}
