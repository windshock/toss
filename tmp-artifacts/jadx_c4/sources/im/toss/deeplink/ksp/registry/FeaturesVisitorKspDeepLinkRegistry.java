package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.visitor.tmoney.charge.VisitorTmoneyChargeSchemeActivity;
import im.toss.features.visitor.tossmoney.VisitorTossMoneyChargeBottomSheetActivity;
import im.toss.features.visitor.tossmoney.VisitorTossMoneyChargeGuideActivity;
import im.toss.features.visitor.tossmoney.limit.intro.VisitorTossMoneyLimitIntroActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesVisitorKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char[] onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$XTC42cqzP7BLKWX9PMnAUYjJdi4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$XoON1Sj1a66QnclYblGDZdKFjK0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$2;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$kIblRfRmzYquFsxRruaru-TSyvY, reason: not valid java name */
    public static /* synthetic */ Class m256$r8$lambda$kIblRfRmzYquFsxRruaruTSyvY() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$nEGZByPOJeTwPdtEXBfgCCGRVIc() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        int i = onExtraCallback + 75;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public FeaturesVisitorKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVisitorKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM256$r8$lambda$kIblRfRmzYquFsxRruaruTSyvY = FeaturesVisitorKspDeepLinkRegistry.m256$r8$lambda$kIblRfRmzYquFsxRruaruTSyvY();
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM256$r8$lambda$kIblRfRmzYquFsxRruaruTSyvY;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{7, 15, '\t', 17, 20, 1, 20, '\t', 6, 5, 13783, 13783, 20, '\f', '\n', 15, 4, 20, 24, 1, 4, '\n', 20, 19, 18, '\t', 1, 19, 16, 6, 23, 16, 15, 20, 19, 3, 6, 2, '\r', 18, 19, 21, '\f', '\t', 24, 15, 4, 15}, (byte) (Color.green(0) + 34), 48 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{7, 15, '\t', 17, 20, 1, 20, '\t', 6, 5, 13835, 13835, 20, '\f', '\n', 15, 4, 20, 24, 1, 4, 22, 13892, 13892, 4, 19, 6, '\n', 13909, 13909, 1, 0, 4, 20, 13887, 13887, 19, 4, 16, 15, '\r', 18, 21, 16, 6, 1, 19, 15}, (byte) (86 - Gravity.getAbsoluteGravity(0, 0)), 47 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVisitorKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$nEGZByPOJeTwPdtEXBfgCCGRVIc();
                    throw null;
                }
                Class cls$r8$lambda$nEGZByPOJeTwPdtEXBfgCCGRVIc = FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$nEGZByPOJeTwPdtEXBfgCCGRVIc();
                int i3 = onWarmupCompleted + 117;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$nEGZByPOJeTwPdtEXBfgCCGRVIc;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{7, 15, '\t', 17, 20, 1, 20, '\t', 6, 5, 13846, 13846, 20, '\f', '\n', 15, 4, 20, 24, 1, 4, 20, 13898, 13898, 19, 4, 16, 15, '\t', 3, 21, 16, 6, 1, 19, 15, 3, 19, 15, '\f', 24, 18}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 97), 42 - TextUtils.getCapsMode("", 0, 0), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVisitorKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$XoON1Sj1a66QnclYblGDZdKFjK0();
                }
                FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$XoON1Sj1a66QnclYblGDZdKFjK0();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{7, 15, '\t', 17, 20, 1, 20, '\t', 6, 5, 13840, 13840, 20, '\f', '\n', 15, 4, 20, 24, 1, 4, 20, 13892, 13892, 19, 4, 16, 15, '\t', 3, 0, 15, '\n', 11, 1, 0, 15, 20, 21, 1, 16, 4, '\t', 15}, (byte) ((Process.myPid() >> 22) + 91), (KeyEvent.getMaxKeyCode() >> 16) + 44, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVisitorKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$XTC42cqzP7BLKWX9PMnAUYjJdi4();
                }
                FeaturesVisitorKspDeepLinkRegistry.$r8$lambda$XTC42cqzP7BLKWX9PMnAUYjJdi4();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return VisitorTmoneyChargeSchemeActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return VisitorTossMoneyChargeBottomSheetActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return VisitorTossMoneyChargeGuideActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return VisitorTossMoneyLimitIntroActivity.class;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 26 - (ViewConfiguration.getJumpTapTimeout() >> 16), 23139 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(j) + 24824), 74 - View.resolveSize(0, 0), 8088 - TextUtils.getTrimmedLength(""), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i5 = $10 + 25;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 30, 19488 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } else {
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i12 = $10 + 15;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    obj2 = obj;
                    j = 0;
                }
            }
            int i14 = 0;
            while (i14 < i) {
                int i15 = $11 + 47;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[i14] = (char) (cArr4[i14] ^ 19351);
                    i14 += 95;
                } else {
                    cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                    i14++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{64967, 64978, 64977, 64979, 64924, 64960, 64984, 64963, 64970, 64905, 64986, 64987, 64985, 64926, 64990, 64989, 64976, 64966, 64980, 64982, 64991, 64961, 64965, 64983, 64988};
        onNavigationEvent = (char) 51244;
    }
}
