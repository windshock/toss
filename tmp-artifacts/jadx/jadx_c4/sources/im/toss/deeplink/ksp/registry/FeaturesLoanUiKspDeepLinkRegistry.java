package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.loan.calculator.LoanInterestCalculatorActivity;
import im.toss.features.loan.calculator.LoanInterestFluctuationActivity;
import im.toss.features.loan.calculator.LoanInterestInfoActivity;
import im.toss.features.loan.common.LoanComparisonWebViewActivity;
import im.toss.features.loan.comparison.LoanSchemeActivity;
import im.toss.features.loan.comparison.common.LoanComparisonAppliedListActivity;
import im.toss.features.loan.comparison.common.LoanComparisonProductNavigatorActivity;
import im.toss.features.loan.comparison.common.LoanProductApplySuccessActivity;
import im.toss.features.loan.comparison.common.LoanProductFailureActivity;
import im.toss.features.loan.comparison.common.LoanScrapingFailedActivity;
import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelActivity;
import im.toss.features.loan.comparison.result.LoanComparisonPreScreenFailedActivity;
import im.toss.features.loan.home.LoanAllAppliedListActivity;
import im.toss.features.loan.home.LoanHomeSchemeActivity;
import im.toss.features.loan.home.LoanRefinancingListActivity;
import im.toss.features.loan.refinancing.LoanRefinancingProductNavigatorActivity;
import im.toss.features.loan.refinancing.LoanRefinancingWebActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesLoanUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int asBinder;
    private static char asInterface;
    private static char onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static char onTransact;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$-YJm4sl4YT1NM78WYkhyY8NVqtw, reason: not valid java name */
    public static /* synthetic */ Class m180$r8$lambda$YJm4sl4YT1NM78WYkhyY8NVqtw() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$12 = _init_$lambda$12();
        int i4 = asBinder + 83;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$12;
    }

    public static /* synthetic */ Class $r8$lambda$01jPEQb2yTc0lwcHfCBNuXQoA9k() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$9();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$9 = _init_$lambda$9();
        int i3 = asBinder + 103;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return cls_init_$lambda$9;
    }

    public static /* synthetic */ Class $r8$lambda$1Fb1pH3XSVSDYkJV4juqY_cNXBc() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = IAuthTabCallbackDefault + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$8;
    }

    public static /* synthetic */ Class $r8$lambda$5zbWmNUcynwYuaMxr0HAX672a2c() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$10();
        }
        _init_$lambda$10();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$7OGfPG9ezsPZZVqZcyGmRk5EaRE() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$13();
            throw null;
        }
        Class cls_init_$lambda$13 = _init_$lambda$13();
        int i3 = IAuthTabCallbackDefault + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$13;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$BWHr4ag76W5WjgXvUskOJPngfkY() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$21();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$21 = _init_$lambda$21();
        int i3 = IAuthTabCallbackDefault + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$21;
    }

    public static /* synthetic */ Class $r8$lambda$CjWj_8ZY8Shy5eqBj8OFtFA81mU() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$24();
            throw null;
        }
        Class cls_init_$lambda$24 = _init_$lambda$24();
        int i3 = asBinder + 65;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$24;
    }

    public static /* synthetic */ Class $r8$lambda$GXOgEtWPCHq4C9XVCugoGqJDtGc() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$20();
        }
        _init_$lambda$20();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$LzHoutuIAQByz4NM9r1x2hxvNio() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = IAuthTabCallbackDefault + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$Ni_vbQ9ITrxjO0AIZ_jbUkluen4() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$17();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$17 = _init_$lambda$17();
        int i3 = asBinder + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$17;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$OPCwuARdvQ451lvOWe4Bp21SXqw() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$25();
        }
        _init_$lambda$25();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$Pg0Oyiij_cTX6wnrkIOqdi24pUQ() {
        Class cls_init_$lambda$19;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$19 = _init_$lambda$19();
            int i3 = 70 / 0;
        } else {
            cls_init_$lambda$19 = _init_$lambda$19();
        }
        int i4 = IAuthTabCallbackDefault + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$19;
    }

    public static /* synthetic */ Class $r8$lambda$R0npyklg8Gd_gN9J1qQbCtQnrHY() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$26();
        }
        _init_$lambda$26();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$TUXRaPbODBWDtL2mdcal0uJod3w() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        throw null;
    }

    /* renamed from: $r8$lambda$VcpXvk45Z4ZzJ-oG3JcIHkg9DrM, reason: not valid java name */
    public static /* synthetic */ Class m181$r8$lambda$VcpXvk45Z4ZzJoG3JcIHkg9DrM() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$4();
            throw null;
        }
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i3 = IAuthTabCallbackDefault + 23;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$at96el3dLOqJRSIt7-uYsqQfQXU, reason: not valid java name */
    public static /* synthetic */ Class m182$r8$lambda$at96el3dLOqJRSIt7uYsqQfQXU() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$22();
            throw null;
        }
        Class cls_init_$lambda$22 = _init_$lambda$22();
        int i3 = asBinder + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$22;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$c8Pq-CfcqGf95-K0AsKqNmL2MDs, reason: not valid java name */
    public static /* synthetic */ Class m183$r8$lambda$c8PqCfcqGf95K0AsKqNmL2MDs() {
        Class cls_init_$lambda$15;
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$15 = _init_$lambda$15();
            int i3 = 93 / 0;
        } else {
            cls_init_$lambda$15 = _init_$lambda$15();
        }
        int i4 = IAuthTabCallbackDefault + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$15;
    }

    /* renamed from: $r8$lambda$cPE-0cbOUJPFQt9R1c8U-9m2-Xc, reason: not valid java name */
    public static /* synthetic */ Class m184$r8$lambda$cPE0cbOUJPFQt9R1c8U9m2Xc() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$2();
        }
        _init_$lambda$2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$d9EQvOTBDNuJWR1xKQ_bx1Ag3MQ() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = asBinder + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$eILMGVrwivoIZkjGTw7CEtgmaxY() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$18 = _init_$lambda$18();
        int i4 = asBinder + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$18;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$hPI3qqC_41lmgtNrrGnC7bWpLkw() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$11 = _init_$lambda$11();
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return cls_init_$lambda$11;
    }

    public static /* synthetic */ Class $r8$lambda$kizlXzd3NqiwnYFBPAUi6bqGLjI() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = asBinder + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$6;
    }

    /* renamed from: $r8$lambda$pLneK4yilg0f4n29yw-fdIX0Mso, reason: not valid java name */
    public static /* synthetic */ Class m185$r8$lambda$pLneK4yilg0f4n29ywfdIX0Mso() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$5();
            throw null;
        }
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i3 = IAuthTabCallbackDefault + 3;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$5;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$sAl_5LF4yi5pnYPhJ2DsvdmVFEU() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$7();
        }
        _init_$lambda$7();
        throw null;
    }

    /* renamed from: $r8$lambda$yTHOdUq9pIfOGZlTUYOE-Ipt5b4, reason: not valid java name */
    public static /* synthetic */ Class m186$r8$lambda$yTHOdUq9pIfOGZlTUYOEIpt5b4() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$16 = _init_$lambda$16();
        int i4 = asBinder + 107;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return cls_init_$lambda$16;
    }

    public static /* synthetic */ Class $r8$lambda$yapZ41NUhlzFQWW9OxkFdN2VpJM() {
        Class cls_init_$lambda$14;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$14 = _init_$lambda$14();
            int i3 = 59 / 0;
        } else {
            cls_init_$lambda$14 = _init_$lambda$14();
        }
        int i4 = asBinder + 5;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$14;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$23 = _init_$lambda$23();
        int i4 = IAuthTabCallbackDefault + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$23;
    }

    static {
        onExtraCallbackWithResult();
        int i = access000 + 43;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesLoanUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$d9EQvOTBDNuJWR1xKQ_bx1Ag3MQ = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$d9EQvOTBDNuJWR1xKQ_bx1Ag3MQ();
                int i4 = onExtraCallbackWithResult + 5;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$d9EQvOTBDNuJWR1xKQ_bx1Ag3MQ;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -121, -122, -117, -118, -126, -114, -118, -117, -114, -119, -122, -127, -124, -123, -124, -122, -116, -115, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-125, -118, -124, -112, -119, -116, -121, -115, -122, -117, -126, -122, -114, -126, -118, -113, -119, -122, -127, -124, -123, -124, -122, -116, -115, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$LzHoutuIAQByz4NM9r1x2hxvNio();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$LzHoutuIAQByz4NM9r1x2hxvNio = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$LzHoutuIAQByz4NM9r1x2hxvNio();
                int i3 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$LzHoutuIAQByz4NM9r1x2hxvNio;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 46595, 26147, 61240, 45048, 38928, 3736, 57476, 41717, 6092, 34197, 8534, 50309, 59156, 7430, 9647, 24207, 36938, 25284, 7615, 33032, 34294, 44331, 10975, 60914, 39098, 57977}, 41 - View.resolveSizeAndState(0, 0, 0), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda19
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM184$r8$lambda$cPE0cbOUJPFQt9R1c8U9m2Xc = FeaturesLoanUiKspDeepLinkRegistry.m184$r8$lambda$cPE0cbOUJPFQt9R1c8U9m2Xc();
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return clsM184$r8$lambda$cPE0cbOUJPFQt9R1c8U9m2Xc;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-109, -124, -110, -119, -116, -121, -127, -115, -123, -117, -125, -111, -121, -114, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - KeyEvent.getDeadChar(0, 0), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 115;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$TUXRaPbODBWDtL2mdcal0uJod3w = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$TUXRaPbODBWDtL2mdcal0uJod3w();
                int i4 = onWarmupCompleted + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$TUXRaPbODBWDtL2mdcal0uJod3w;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-108, -124, -115, -118, -125, -125, -117, -119, -116, -121, -127, -115, -123, -117, -125, -111, -121, -114, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 11;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.m181$r8$lambda$VcpXvk45Z4ZzJoG3JcIHkg9DrM();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class clsM181$r8$lambda$VcpXvk45Z4ZzJoG3JcIHkg9DrM = FeaturesLoanUiKspDeepLinkRegistry.m181$r8$lambda$VcpXvk45Z4ZzJoG3JcIHkg9DrM();
                int i3 = IAuthTabCallback + 79;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM181$r8$lambda$VcpXvk45Z4ZzJoG3JcIHkg9DrM;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-122, -114, -126, -108, -121, -123, -125, -119, -116, -121, -127, -115, -123, -117, -125, -111, -121, -114, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda22
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM185$r8$lambda$pLneK4yilg0f4n29ywfdIX0Mso = FeaturesLoanUiKspDeepLinkRegistry.m185$r8$lambda$pLneK4yilg0f4n29ywfdIX0Mso();
                if (i3 == 0) {
                    int i4 = 67 / 0;
                }
                return clsM185$r8$lambda$pLneK4yilg0f4n29ywfdIX0Mso;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 54676, 3188, 41231, 9933, 63742, 55657, 57447, 23332, 48874, 41536, 15381, 20026, 31569, 48977, 59772, 11180}, 31 - MotionEvent.axisFromString(""), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda23
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$kizlXzd3NqiwnYFBPAUi6bqGLjI();
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$kizlXzd3NqiwnYFBPAUi6bqGLjI = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$kizlXzd3NqiwnYFBPAUi6bqGLjI();
                int i3 = onExtraCallbackWithResult + 121;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$kizlXzd3NqiwnYFBPAUi6bqGLjI;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(null, null, new byte[]{-124, -123, -126, -118, -115, -117, -113, -119, -122, -114, -126, -108, -121, -123, -125, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda24
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$sAl_5LF4yi5pnYPhJ2DsvdmVFEU();
                }
                FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$sAl_5LF4yi5pnYPhJ2DsvdmVFEU();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a(null, null, new byte[]{-124, -123, -126, -118, -115, -117, -113, -119, -107, -116, -115, -125, -117, -123, -114, -127, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda25
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$1Fb1pH3XSVSDYkJV4juqY_cNXBc();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$1Fb1pH3XSVSDYkJV4juqY_cNXBc = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$1Fb1pH3XSVSDYkJV4juqY_cNXBc();
                int i3 = IAuthTabCallback + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$1Fb1pH3XSVSDYkJV4juqY_cNXBc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 1866, 34084, 36912, 56120, 57871, 10082, 53179, 41350, 34907, 61042, 22845, 48451, 64978, 25200, 51211, 62269, 57476, 41717, 6092, 34197, 35187, 26849, 26994, 5859, 43807, 17856, 64978, 25200, 23547, 64842}, 46 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$01jPEQb2yTc0lwcHfCBNuXQoA9k = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$01jPEQb2yTc0lwcHfCBNuXQoA9k();
                if (i3 == 0) {
                    int i4 = 28 / 0;
                }
                return cls$r8$lambda$01jPEQb2yTc0lwcHfCBNuXQoA9k;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 1866, 34084, 36912, 56120, 57871, 10082, 53179, 41350, 34907, 61042, 22845, 48451, 46949, 30209, 15338, 65423, 56408, 64664, 8085, 33763, 50663, 2046, 15381, 20026, 456, 32759}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42, objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$5zbWmNUcynwYuaMxr0HAX672a2c();
                }
                FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$5zbWmNUcynwYuaMxr0HAX672a2c();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        a(null, null, new byte[]{-108, -124, -115, -118, -125, -125, -117, -119, -118, -118, -117, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr12);
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$hPI3qqC_41lmgtNrrGnC7bWpLkw = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$hPI3qqC_41lmgtNrrGnC7bWpLkw();
                int i4 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$hPI3qqC_41lmgtNrrGnC7bWpLkw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr13 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 11859, 53579, 44483, 20468, 456, 32759}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, objArr13);
        Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(((String) objArr13[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM180$r8$lambda$YJm4sl4YT1NM78WYkhyY8NVqtw = FeaturesLoanUiKspDeepLinkRegistry.m180$r8$lambda$YJm4sl4YT1NM78WYkhyY8NVqtw();
                int i4 = onWarmupCompleted + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM180$r8$lambda$YJm4sl4YT1NM78WYkhyY8NVqtw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr14 = new Object[1];
        a(null, null, new byte[]{-109, -124, -110, -119, -107, -116, -115, -114, -116, -117, -116, -115, -113, -124, -123, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, objArr14);
        Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(((String) objArr14[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$7OGfPG9ezsPZZVqZcyGmRk5EaRE();
                    throw null;
                }
                Class cls$r8$lambda$7OGfPG9ezsPZZVqZcyGmRk5EaRE = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$7OGfPG9ezsPZZVqZcyGmRk5EaRE();
                int i3 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$7OGfPG9ezsPZZVqZcyGmRk5EaRE;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr15 = new Object[1];
        a(null, null, new byte[]{-116, -121, -127, -115, -123, -117, -125, -111, -121, -114, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getEdgeSlop() >> 16) + 127, objArr15);
        Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(((String) objArr15[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$yapZ41NUhlzFQWW9OxkFdN2VpJM = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$yapZ41NUhlzFQWW9OxkFdN2VpJM();
                int i4 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$yapZ41NUhlzFQWW9OxkFdN2VpJM;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr16 = new Object[1];
        a(null, null, new byte[]{-122, -127, -115, -118, -119, -116, -121, -127, -115, -123, -117, -125, -111, -121, -114, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr16);
        Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback(((String) objArr16[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.m183$r8$lambda$c8PqCfcqGf95K0AsKqNmL2MDs();
                    throw null;
                }
                Class clsM183$r8$lambda$c8PqCfcqGf95K0AsKqNmL2MDs = FeaturesLoanUiKspDeepLinkRegistry.m183$r8$lambda$c8PqCfcqGf95K0AsKqNmL2MDs();
                int i3 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return clsM183$r8$lambda$c8PqCfcqGf95K0AsKqNmL2MDs;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr17 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 1866, 34084, 36912, 56120, 57871, 10082, 53179, 41350, 34907, 61042, 22845, 48451, 64978, 25200, 45097, 10709, 14417, 35903}, 33 - ImageFormat.getBitsPerPixel(0), objArr17);
        Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(((String) objArr17[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesLoanUiKspDeepLinkRegistry.m186$r8$lambda$yTHOdUq9pIfOGZlTUYOEIpt5b4();
                }
                FeaturesLoanUiKspDeepLinkRegistry.m186$r8$lambda$yTHOdUq9pIfOGZlTUYOEIpt5b4();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr18 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 1866, 34084, 36912, 56120, 57871, 10082, 53179, 41350, 34907, 61042, 22845, 48451, 64978, 25200, 57816, 56388, 53093, 25783, 134, 7502, 53093, 25783, 15719, 22036, 46595, 26147, 61240, 45048, 41231, 9933}, TextUtils.indexOf("", "") + 46, objArr18);
        Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(((String) objArr18[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Ni_vbQ9ITrxjO0AIZ_jbUkluen4 = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$Ni_vbQ9ITrxjO0AIZ_jbUkluen4();
                int i4 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
                return cls$r8$lambda$Ni_vbQ9ITrxjO0AIZ_jbUkluen4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr19 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 34294, 44331, 36912, 56120, 20916, 33235}, 20 - TextUtils.lastIndexOf("", '0', 0), objArr19);
        Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(((String) objArr19[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$eILMGVrwivoIZkjGTw7CEtgmaxY();
                }
                FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$eILMGVrwivoIZkjGTw7CEtgmaxY();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr20 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 41715, 27564, 41231, 9933, 20124, 64009, 63202, 43961, 53751, 7970}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, objArr20);
        Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(((String) objArr20[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Pg0Oyiij_cTX6wnrkIOqdi24pUQ = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$Pg0Oyiij_cTX6wnrkIOqdi24pUQ();
                int i4 = onExtraCallback + 107;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$Pg0Oyiij_cTX6wnrkIOqdi24pUQ;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr21 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 54676, 3188, 41231, 9933, 63742, 55657, 57447, 23332}, TextUtils.lastIndexOf("", '0', 0, 0) + 37, objArr21);
        Pair pairIAuthTabCallback21 = getWrite.IAuthTabCallback(((String) objArr21[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda12
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$GXOgEtWPCHq4C9XVCugoGqJDtGc = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$GXOgEtWPCHq4C9XVCugoGqJDtGc();
                int i4 = onExtraCallback + 81;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 58 / 0;
                }
                return cls$r8$lambda$GXOgEtWPCHq4C9XVCugoGqJDtGc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr22 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 28917, 23034, 8227, 42445, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 54676, 3188, 41231, 9933, 63742, 55657, 57447, 23332}, 40 - Drawable.resolveOpacity(0, 0), objArr22);
        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(((String) objArr22[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$BWHr4ag76W5WjgXvUskOJPngfkY();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$BWHr4ag76W5WjgXvUskOJPngfkY = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$BWHr4ag76W5WjgXvUskOJPngfkY();
                int i3 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$BWHr4ag76W5WjgXvUskOJPngfkY;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr23 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962}, TextUtils.getTrimmedLength("") + 28, objArr23);
        Pair pairIAuthTabCallback23 = getWrite.IAuthTabCallback(((String) objArr23[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM182$r8$lambda$at96el3dLOqJRSIt7uYsqQfQXU = FeaturesLoanUiKspDeepLinkRegistry.m182$r8$lambda$at96el3dLOqJRSIt7uYsqQfQXU();
                int i4 = onExtraCallbackWithResult + 85;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM182$r8$lambda$at96el3dLOqJRSIt7uYsqQfQXU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr24 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 53047, 12357, 53093, 25783, 15719, 22036}, 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr24);
        Pair pairIAuthTabCallback24 = getWrite.IAuthTabCallback(((String) objArr24[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda15
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                Class cls$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 27;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    cls$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk();
                    int i3 = 4 / 0;
                } else {
                    cls$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk();
                }
                int i4 = onExtraCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$yxQtagj0XBoFe03tLAPxOioBsLk;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr25 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 17917, 19367, 58302, 43498, 34292, 63745, 26294, 4626, 54676, 3188, 64978, 25200, 33258, 44218, 43152, 48420, 24098, 52114, 26383, 26242}, 48 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr25);
        Pair pairIAuthTabCallback25 = getWrite.IAuthTabCallback(((String) objArr25[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$CjWj_8ZY8Shy5eqBj8OFtFA81mU();
                }
                FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$CjWj_8ZY8Shy5eqBj8OFtFA81mU();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr26 = new Object[1];
        a(null, null, new byte[]{-107, -116, -115, -114, -116, -117, -116, -115, -113, -124, -123, -119, -106, -115, -109, -119, -116, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, MotionEvent.axisFromString("") + 128, objArr26);
        Pair pairIAuthTabCallback26 = getWrite.IAuthTabCallback(((String) objArr26[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda17
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 93;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$OPCwuARdvQ451lvOWe4Bp21SXqw();
                    throw null;
                }
                Class cls$r8$lambda$OPCwuARdvQ451lvOWe4Bp21SXqw = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$OPCwuARdvQ451lvOWe4Bp21SXqw();
                int i3 = onNavigationEvent + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$OPCwuARdvQ451lvOWe4Bp21SXqw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr27 = new Object[1];
        b(new char[]{45097, 10709, 39153, 8281, 26095, 30320, 35266, 51161, 43391, 59495, 59344, 3749, 32493, 18999, 43074, 46031, 28917, 23034, 8227, 42445, 17917, 19367, 17329, 57435, 23191, 43238, 43074, 46031, 33156, 16169, 13551, 50962, 17917, 19367, 58302, 43498, 34292, 63745, 26294, 4626, 54676, 3188, 64978, 25200, 33258, 44218, 43152, 48420, 24098, 52114, 26383, 26242}, (Process.myPid() >> 22) + 51, objArr27);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, pairIAuthTabCallback13, pairIAuthTabCallback14, pairIAuthTabCallback15, pairIAuthTabCallback16, pairIAuthTabCallback17, pairIAuthTabCallback18, pairIAuthTabCallback19, pairIAuthTabCallback20, pairIAuthTabCallback21, pairIAuthTabCallback22, pairIAuthTabCallback23, pairIAuthTabCallback24, pairIAuthTabCallback25, pairIAuthTabCallback26, getWrite.IAuthTabCallback(((String) objArr27[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLoanUiKspDeepLinkRegistry$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$R0npyklg8Gd_gN9J1qQbCtQnrHY = FeaturesLoanUiKspDeepLinkRegistry.$r8$lambda$R0npyklg8Gd_gN9J1qQbCtQnrHY();
                int i4 = IAuthTabCallback + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$R0npyklg8Gd_gN9J1qQbCtQnrHY;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        Class<LoanInterestCalculatorActivity> cls;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            cls = LoanInterestCalculatorActivity.class;
            int i4 = 90 / 0;
        } else {
            cls = LoanInterestCalculatorActivity.class;
        }
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return LoanInterestFluctuationActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 7;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return LoanInterestInfoActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return LoanComparisonWebViewActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return LoanComparisonAppliedListActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return LoanComparisonProductNavigatorActivity.class;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return LoanProductApplySuccessActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return LoanProductFailureActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return LoanScrapingFailedActivity.class;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return LoanComparisonFunnelActivity.class;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 77;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return LoanComparisonPreScreenFailedActivity.class;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 89;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return LoanAllAppliedListActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$12() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return LoanRefinancingListActivity.class;
    }

    private static final Class _init_$lambda$13() {
        Class<LoanRefinancingWebActivity> cls;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            cls = LoanRefinancingWebActivity.class;
            int i4 = 85 / 0;
        } else {
            cls = LoanRefinancingWebActivity.class;
        }
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$14() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return LoanSchemeActivity.class;
    }

    private static final Class _init_$lambda$15() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return LoanSchemeActivity.class;
    }

    private static final Class _init_$lambda$16() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 81;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return LoanSchemeActivity.class;
    }

    private static final Class _init_$lambda$17() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return LoanSchemeActivity.class;
    }

    private static final Class _init_$lambda$18() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return LoanHomeSchemeActivity.class;
    }

    private static final Class _init_$lambda$19() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 81;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return LoanHomeSchemeActivity.class;
    }

    private static final Class _init_$lambda$20() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return LoanRefinancingProductNavigatorActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$21() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return LoanRefinancingProductNavigatorActivity.class;
    }

    private static final Class _init_$lambda$22() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return LoanRefinancingFunnelActivity.class;
    }

    private static final Class _init_$lambda$23() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return LoanRefinancingFunnelActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$24() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return LoanRefinancingFunnelActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$25() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return LoanRefinancingFunnelActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$26() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return LoanRefinancingFunnelActivity.class;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 67;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, i11, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, KeyEvent.getDeadChar(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i12 = $11 + 119;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 16014), 13 - ExpandableListView.getPackedPositionChild(0L), 19901 - Drawable.resolveOpacity(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 115;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 77 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 20952 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), '}' - AndroidCharacter.getMirror('0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            int i8 = $10 + 51;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.resolveSize(0, 0) + 75, KeyEvent.getDeadChar(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onNavigationEvent) {
            int i10 = $10 + 43;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $11 + 49;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] / iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 62 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 63, 12213 - TextUtils.indexOf((CharSequence) "", '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $10 + 125;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i14 = $11 + 37;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] >> iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 63, 12214 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr8 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 63 - (ViewConfiguration.getScrollBarSize() >> 8), Color.blue(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{32509, 32499, 32504, 32451, 32510, 32508, 32505, 32438, 32441, 32452, 32463, 32506, 32455, 32461, 32450, 32448, 32507, 32497, 32462, 32460, 32449, 32502};
        onWarmupCompleted = -1184333976;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
        onExtraCallback = (char) 27963;
        onTransact = (char) 21764;
        IAuthTabCallbackStub = (char) 43191;
        asInterface = (char) 12374;
    }
}
