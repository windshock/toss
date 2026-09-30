package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import im.toss.features.home.ui.action.HomeHideAmountAction;
import im.toss.features.home.ui.action.HomeUpdateHideAmountAction;
import im.toss.features.home.ui.view.alarm.HomeMydataServiceAvailableActivity;
import im.toss.features.home.ui.view.asset.edit.v2.AssetHomeEditV2Activity;
import im.toss.features.home.ui.view.asset.filter.HomeAssetFilterActivity;
import im.toss.features.home.ui.view.asset.filter.category.HomeAssetCategoryFilterBottomSheetActivity;
import im.toss.features.home.ui.view.asset.mydata.MydataAssetAddBottomSheetSchemeActivity;
import im.toss.features.home.ui.view.consumption.ConsumptionCardNoticeMinorSchemeActivity;
import im.toss.features.home.ui.view.consumption.mydata.MydataChildBlockActivity;
import im.toss.features.home.ui.view.hideamount.HomeHideAmountBottomSheetActivity;
import im.toss.features.home.ui.view.history.AccountDetailRouteSchemeActivity;
import im.toss.features.home.ui.view.history.AccountHistorySchemeActivity;
import im.toss.features.home.ui.view.lock.HomeAppLockOfferBottomSheetActivity;
import im.toss.features.home.ui.view.lock.HomeHideAmountOfferBottomSheetActivity;
import im.toss.features.home.ui.view.primaryaccount.SchemeUpdatePrimaryAccountActivity;
import im.toss.features.home.ui.view.setting.HomeSettingBottomSheetActivity;
import im.toss.features.home.ui.view.transaction.amount.HomeTransactionAmountEditBottomSheetActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 205;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 3);
        int i4 = 1 - (s * 4);
        int i5 = b2 + 109;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            i2 = 0;
            i3++;
            i5 = i6 + (-i7);
            i = i2;
            int i8 = i5;
            int i9 = i3;
            i2 = i + 1;
            bArr2[i] = (byte) i8;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i9];
            i6 = i8;
            i3 = i9;
            i3++;
            i5 = i6 + (-i7);
            i = i2;
            int i82 = i5;
            int i92 = i3;
            i2 = i + 1;
            bArr2[i] = (byte) i82;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i822 = i5;
            int i922 = i3;
            i2 = i + 1;
            bArr2[i] = (byte) i822;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$31ju_LnusGWw4wtWXDseW4FCqFg() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$4sbZNfub-_NAsMTegrb_oUnBpHE, reason: not valid java name */
    public static /* synthetic */ Class m166$r8$lambda$4sbZNfub_NAsMTegrb_oUnBpHE() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$13();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$13 = _init_$lambda$13();
        int i3 = asBinder + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$13;
    }

    public static /* synthetic */ Class $r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$14 = _init_$lambda$14();
        int i4 = asBinder + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$14;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$77Dtrbe81_Ojah9fOn1mbetvqlU() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = asBinder + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$AAAoHdjCJe1FRA_wtWnpcPatkdU() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$19();
        }
        _init_$lambda$19();
        throw null;
    }

    /* renamed from: $r8$lambda$C4JZiAu5aZY-JdPq0AcJ5RwMesw, reason: not valid java name */
    public static /* synthetic */ Class m167$r8$lambda$C4JZiAu5aZYJdPq0AcJ5RwMesw() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$18 = _init_$lambda$18();
        int i4 = onWarmupCompleted + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$18;
    }

    /* renamed from: $r8$lambda$PLsum-RSZTqm6vyxvtzOrlBe3h4, reason: not valid java name */
    public static /* synthetic */ Class m168$r8$lambda$PLsumRSZTqm6vyxvtzOrlBe3h4() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$11 = _init_$lambda$11();
        int i4 = onWarmupCompleted + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$PzUI1AKS9ctE_aGqf6FnXebQuPc() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$10 = _init_$lambda$10();
        int i4 = onWarmupCompleted + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return cls_init_$lambda$10;
    }

    public static /* synthetic */ Class $r8$lambda$QSISMZ1YUJjoCena33ihVrjAJpg() {
        Class cls_init_$lambda$3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$3 = _init_$lambda$3();
            int i3 = 79 / 0;
        } else {
            cls_init_$lambda$3 = _init_$lambda$3();
        }
        int i4 = asBinder + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    /* renamed from: $r8$lambda$TdhbS7Izza46T6nJ4mgCdpuz-v8, reason: not valid java name */
    public static /* synthetic */ Class m169$r8$lambda$TdhbS7Izza46T6nJ4mgCdpuzv8() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$15();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$15 = _init_$lambda$15();
        int i3 = asBinder + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$15;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = onWarmupCompleted + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$6;
    }

    public static /* synthetic */ Class $r8$lambda$XQ5MSNz0C8MPSKnk8nJUpYiQjyA() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$16();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$16 = _init_$lambda$16();
        int i3 = onWarmupCompleted + 19;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$16;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$eGIK4TUxizH1Q8RPT7gmtvabhiA() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$17();
        }
        _init_$lambda$17();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$fkZD91d_cmvDrxArjZ3GogAjUEc() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$iiXIr5G-AANG9b_mtp8HeIQqK5c, reason: not valid java name */
    public static /* synthetic */ Class m170$r8$lambda$iiXIr5GAANG9b_mtp8HeIQqK5c() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$8();
        }
        _init_$lambda$8();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$ivI0FlKuW1Ite_h-urVf8onAbzQ, reason: not valid java name */
    public static /* synthetic */ Class m171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$7();
        }
        _init_$lambda$7();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$jJd_LegeHhuJP70u48Hoakg10ac() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$9 = _init_$lambda$9();
        int i4 = asBinder + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return cls_init_$lambda$9;
    }

    public static /* synthetic */ Class $r8$lambda$jcIIyq26qHOTi1wTrgW2RrGTYlw() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onWarmupCompleted + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$qX_pPVYnKuRgY_1h5GXdxY7jgU4() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i4 = asBinder + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$tWdlvPFS6yWM6Q1DVDOyGtYW0wI() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$12 = _init_$lambda$12();
        int i4 = onWarmupCompleted + 101;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$wp735yHlFbaPyfG7V_2AcqVVKC4() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$20 = _init_$lambda$20();
        int i4 = onWarmupCompleted + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return cls_init_$lambda$20;
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallback();
        int i = asInterface + 121;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FeaturesHomeUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$31ju_LnusGWw4wtWXDseW4FCqFg();
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$31ju_LnusGWw4wtWXDseW4FCqFg = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$31ju_LnusGWw4wtWXDseW4FCqFg();
                int i3 = onExtraCallback + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$31ju_LnusGWw4wtWXDseW4FCqFg;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, 1682210729, -1816290851, 619207108, -540791064, 1502980250, -515383970, 315009996, 1267611934, 208614439, 560759032}, 35 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        b(Color.alpha(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32413), new char[]{7804, 29672, 46752, 12344, 54583, 31797, 6493, 58714, 54167, 50625, 12309, 19034, 62534, 20527, 47022, 44756, 24340, 45068, 41780, 13306, 30610, 21725, 39336, 27658, 64466, 45763, 2026, 23138, 59291, 54553, 44802, 64748, 43946, 18924, 23965, 20967, 31349, 29343, 5737, 19026, 10610, 50844}, new char[]{35529, 1638, 40612, 35454}, new char[]{31735, 32354, 9466, 8960}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$jcIIyq26qHOTi1wTrgW2RrGTYlw = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$jcIIyq26qHOTi1wTrgW2RrGTYlw();
                int i4 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$jcIIyq26qHOTi1wTrgW2RrGTYlw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, -915621352, 1249460584, 1525690757, 1366581209, 1328926011, -673808993, -1207611370, 1649556486}, 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$77Dtrbe81_Ojah9fOn1mbetvqlU = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$77Dtrbe81_Ojah9fOn1mbetvqlU();
                int i4 = onNavigationEvent + 117;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 27 / 0;
                }
                return cls$r8$lambda$77Dtrbe81_Ojah9fOn1mbetvqlU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, -2017601406, 1370279249, -2024467709, -1988658221, -1521521573, -1589056181, -200794437, 833702412}, 28 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$QSISMZ1YUJjoCena33ihVrjAJpg = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$QSISMZ1YUJjoCena33ihVrjAJpg();
                int i4 = onExtraCallback + 107;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$QSISMZ1YUJjoCena33ihVrjAJpg;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        b(KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{23346, 21634, 47149, 29693, 36557, 16716, 36453, 36759, 24224, 4628, 4184, 14218, 63951, 12974, 2420, 30856, 34242, 31846, 61597, 27819, 33678, 26321, 61997, 46391, 39540, 8523, 60744, 28199, 11762, 15888, 34212, 55716, 58053, 31776, 45759, 9210, 11645, 41180, 37355, 28058, 14981, 12116, 20764, 9789, 24342, 40611, 63872, 65181, 8443, 4719}, new char[]{45036, 46995, 6062, 23621}, new char[]{31735, 32354, 9466, 8960}, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda15
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$fkZD91d_cmvDrxArjZ3GogAjUEc();
                    throw null;
                }
                Class cls$r8$lambda$fkZD91d_cmvDrxArjZ3GogAjUEc = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$fkZD91d_cmvDrxArjZ3GogAjUEc();
                int i3 = onExtraCallback + 27;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$fkZD91d_cmvDrxArjZ3GogAjUEc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{57361, 42125, 24359, 42377, 4756, 17206, 34656, 15087, 35923, 12674, 36297, 27089, 14795, 7386, 21442, 56348, 27250, 12165, 46831, 53848, 59848, 46500, 44191, 26434, 956, 20215, 11606, 53386, 16733, 2230, 64970, 8470, 27052, 22923, 20069, 16506, 29094, 58185, 1911, 57179, 27629, 9353, 38097, 59279, 2973, 14759}, new char[]{34471, 59243, 5454, 15602}, new char[]{31735, 32354, 9466, 8960}, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda16
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$qX_pPVYnKuRgY_1h5GXdxY7jgU4 = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$qX_pPVYnKuRgY_1h5GXdxY7jgU4();
                int i4 = onExtraCallback + 47;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$qX_pPVYnKuRgY_1h5GXdxY7jgU4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, 498016499, -1154546373, -11840435, -144268387, 651531926, 98646335, 1165600550, 163229535, 602514690, -494180801}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda17
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class cls$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k();
                    int i3 = 19 / 0;
                } else {
                    cls$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k();
                }
                int i4 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$XJpMyTcXbaudFl0PiRpzm_8Th2k;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        b((-1510824785) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{47346, 63246, 16470, 54846, 23680, 11043, 51935, 27098, 50224, 14291, 57559, 15574, 10960, 40887, 4903, 28417, 65518, 7266, 36066, 55356, 5229, 7202, 29123, 44406, 14506, 52283, 55366, 64990, 7206, 2173, 39688, 19847, 9156}, new char[]{45046, 62116, 43173, 61246}, new char[]{31735, 32354, 9466, 8960}, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class clsM171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ = FeaturesHomeUiKspDeepLinkRegistry.m171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ();
                    int i3 = 83 / 0;
                } else {
                    clsM171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ = FeaturesHomeUiKspDeepLinkRegistry.m171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ();
                }
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM171$r8$lambda$ivI0FlKuW1Ite_hurVf8onAbzQ;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, 576917458, -1804453113, -488172714, -1188166249, -1795392508, -1178048787, -357903348, 1518443213}, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda19
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM170$r8$lambda$iiXIr5GAANG9b_mtp8HeIQqK5c = FeaturesHomeUiKspDeepLinkRegistry.m170$r8$lambda$iiXIr5GAANG9b_mtp8HeIQqK5c();
                int i4 = onNavigationEvent + 17;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM170$r8$lambda$iiXIr5GAANG9b_mtp8HeIQqK5c;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)));
        Object[] objArr10 = new Object[1];
        b((-206317414) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (KeyEvent.getDeadChar(0, 0) + 26295), new char[]{63510, 11206, 5529, 37734, 44325, 36175, 26415, 52571, 49199, 9843, 58668, 16249, 16738, 56060, 4612, 7414, 38549, 51908, 10544, 43435, 4561, 372, 52795, 57808, 57262, 60893, 7568, 24727, 51056, 58132, 29984, 50123, 60313, 29561, 53973, 55723, 57297, 28763, 24249, 29715, 60445, 57228, 32157}, new char[]{39255, 46040, 47091, 11622}, new char[]{31735, 32354, 9466, 8960}, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$jJd_LegeHhuJP70u48Hoakg10ac = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$jJd_LegeHhuJP70u48Hoakg10ac();
                int i4 = IAuthTabCallback + 73;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$jJd_LegeHhuJP70u48Hoakg10ac;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        b(Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), new char[]{58864, 33008, 63002, 59711, 50844, 5799, 56160, 19901, 21803, 17816, 16821, 45733, 62985, 12471, 53969, 50972, 8490, 28954, 54391, 50468, 43258, 54038, 56399, 34882, 48135, 3665, 19132, 49212, 20401, 39593, 5798, 3494, 43532, 32794, 28303, 54731, 63146, 45006, 13181, 50882, 12785, 21954, 10838, 13972, 5022, 44921}, new char[]{15921, 27807, 47090, 63725}, new char[]{31735, 32354, 9466, 8960}, objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$PzUI1AKS9ctE_aGqf6FnXebQuPc = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$PzUI1AKS9ctE_aGqf6FnXebQuPc();
                int i4 = onExtraCallback + 83;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$PzUI1AKS9ctE_aGqf6FnXebQuPc;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        b((ViewConfiguration.getPressedStateDuration() >> 16) + 597302348, (char) (49833 - (ViewConfiguration.getScrollBarSize() >> 8)), new char[]{48766, 6468, 26888, 32609, 16528, 14254, 51146, 26413, 48177, 51378, 24716, 15238, 41602, 24936, 40185, 59853, 37228, 21765, 17516, 27165, 48133, 27950, 18598, 32110, 56738, 33129, 20472, 37699, 1445, 55152, 36312, 19299, 32383, 24670, 7155, 39072, 52939, 10194, 58573}, new char[]{19593, 39452, 43299, 24258}, new char[]{31735, 32354, 9466, 8960}, objArr12);
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM168$r8$lambda$PLsumRSZTqm6vyxvtzOrlBe3h4 = FeaturesHomeUiKspDeepLinkRegistry.m168$r8$lambda$PLsumRSZTqm6vyxvtzOrlBe3h4();
                if (i3 != 0) {
                    int i4 = 34 / 0;
                }
                return clsM168$r8$lambda$PLsumRSZTqm6vyxvtzOrlBe3h4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr13 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, 1963916329, -1061007317, 454624005, 1651345566, 381633040, 548760264, 624238136, 1199635379, -1352086409, 238046545}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, objArr13);
        Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(((String) objArr13[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$tWdlvPFS6yWM6Q1DVDOyGtYW0wI = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$tWdlvPFS6yWM6Q1DVDOyGtYW0wI();
                int i4 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$tWdlvPFS6yWM6Q1DVDOyGtYW0wI;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr14 = new Object[1];
        b(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (51865 - View.resolveSize(0, 0)), new char[]{39919, 5612, 31656, 8526, 35208, 40304, 56862, 51680, 32439, 3203, 36620, 43677, 15612, 53490, 16149, 22298, 14466, 6757, 49830, 26565, 24003, 13415, 49868, 35991, 28064, 18241, 39425, 62679, 17242, 38529, 7174, 63718, 2276, 58313, 30596, 9599, 13598, 40884, 2590, 10498, 27330, 18518, 33658, 37149, 23569, 37534, 15218, 11921, 40351, 32399, 3547, 24383}, new char[]{58743, 32674, 39179, 14538}, new char[]{31735, 32354, 9466, 8960}, objArr14);
        Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(((String) objArr14[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 61;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM166$r8$lambda$4sbZNfub_NAsMTegrb_oUnBpHE = FeaturesHomeUiKspDeepLinkRegistry.m166$r8$lambda$4sbZNfub_NAsMTegrb_oUnBpHE();
                int i4 = onNavigationEvent + 73;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM166$r8$lambda$4sbZNfub_NAsMTegrb_oUnBpHE;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr15 = new Object[1];
        b(2093062603 - Color.alpha(0), (char) (50312 - MotionEvent.axisFromString("")), new char[]{51730, 62202, 2507, 29078, 54353, 17763, 12097, 17140, 42791, 5135, 32745, 31605, 64270, 25890, 60868, 24310, 27021, 54743, 44768, 46796, 39789, 46342, 22905, 4473, 35901, 19210, 49340, 54459, 46422, 12614, 19785, 6724, 42731, 46689, 15904, 15574, 42869, 3096, 24668, 37210, 31856, 30608, 11750}, new char[]{52033, 49561, 35196, 61892}, new char[]{31735, 32354, 9466, 8960}, objArr15);
        Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(((String) objArr15[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                Class cls$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs();
                    int i3 = 38 / 0;
                } else {
                    cls$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs();
                }
                int i4 = onExtraCallback + 19;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 82 / 0;
                }
                return cls$r8$lambda$4xrFTascbTWueNLkcrwGbV6ELrs;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr16 = new Object[1];
        b((ViewConfiguration.getTapTimeout() >> 16) - 653476848, (char) (View.MeasureSpec.getSize(0) + 20850), new char[]{12787, 48823, 4339, 23512, 60661, 9641, 24455, 38619, 41320, 46169, 45870, 50915, 10404, 59916, 11023, 47049, 17383, 28468, 16224, 45970, 7627, 45953, 42604, 44161, 52438, 15489, 17528, 1910, 22449, 2033, 34590, 60462, 54607, 15033, 40053, 51737, 18800, 34119, 46512, 54236, 60970, 18102, 3465}, new char[]{4200, 3260, 29401, 30545}, new char[]{31735, 32354, 9466, 8960}, objArr16);
        Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback(((String) objArr16[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    FeaturesHomeUiKspDeepLinkRegistry.m169$r8$lambda$TdhbS7Izza46T6nJ4mgCdpuzv8();
                    throw null;
                }
                Class clsM169$r8$lambda$TdhbS7Izza46T6nJ4mgCdpuzv8 = FeaturesHomeUiKspDeepLinkRegistry.m169$r8$lambda$TdhbS7Izza46T6nJ4mgCdpuzv8();
                int i3 = onNavigationEvent + 99;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return clsM169$r8$lambda$TdhbS7Izza46T6nJ4mgCdpuzv8;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr17 = new Object[1];
        b(833341896 - View.resolveSize(0, 0), (char) (51758 - TextUtils.indexOf("", "")), new char[]{34999, 5722, 59707, 46245, 41520, 25207, 56852, 51987, 6468, 4659, 7288, 16811, 41704, 23633, 7224, 56477, 36880, 6463, 15822, 59360, 17654, 42911, 2149, 9845, 14609, 19035, 47167, 8420, 30119, 45236, 38854, 28550, 40275, 10611, 31474, 44614, 63716, 22119, 10246}, new char[]{51281, 43977, 11825, 19146}, new char[]{31735, 32354, 9466, 8960}, objArr17);
        Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(((String) objArr17[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$XQ5MSNz0C8MPSKnk8nJUpYiQjyA = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$XQ5MSNz0C8MPSKnk8nJUpYiQjyA();
                int i4 = onNavigationEvent + 113;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$XQ5MSNz0C8MPSKnk8nJUpYiQjyA;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr18 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1713602835, 773006709, -2017601406, 1370279249, -467698026, -1460799324, -1439908443, -2001354949, -1517082284, 867824377, 583957858, -1608274909, 227747549, 1991939288, -407750996, 553934154, 70628095, -1558383812}, TextUtils.indexOf((CharSequence) "", '0') + 46, objArr18);
        Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(((String) objArr18[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$eGIK4TUxizH1Q8RPT7gmtvabhiA();
                }
                FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$eGIK4TUxizH1Q8RPT7gmtvabhiA();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr19 = new Object[1];
        a(new int[]{1258552603, -1286857820, -1797977930, -1601791246, 2114052820, -1557911292, -1509760406, 353280016, 208614439, 560759032}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, objArr19);
        Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(((String) objArr19[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM167$r8$lambda$C4JZiAu5aZYJdPq0AcJ5RwMesw = FeaturesHomeUiKspDeepLinkRegistry.m167$r8$lambda$C4JZiAu5aZYJdPq0AcJ5RwMesw();
                if (i3 != 0) {
                    int i4 = 68 / 0;
                }
                return clsM167$r8$lambda$C4JZiAu5aZYJdPq0AcJ5RwMesw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr20 = new Object[1];
        b(KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{2024, 7375, 42546, 25065, 64538, 42225, 61276, 52946, 41733, 1151, 9362, 38641, 53778, 33952, 40880, 5107, 26149, 19686, 46368, 19918, 33412, 57784, 56812, 48026}, new char[]{37942, 21258, 560, 60403}, new char[]{31735, 32354, 9466, 8960}, objArr20);
        Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(((String) objArr20[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$AAAoHdjCJe1FRA_wtWnpcPatkdU = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$AAAoHdjCJe1FRA_wtWnpcPatkdU();
                int i4 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$AAAoHdjCJe1FRA_wtWnpcPatkdU;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr21 = new Object[1];
        b(ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getOffsetBefore("", 0), new char[]{35536, 6504, 52390, 56560, 13748, 62709, 43094, 51040, 60839, 18758, 47804, 39428, 25589, 40556, 5778, 21243, 33443, 36087, 35233, 61828, 18209, 53512, 49467, 51092}, new char[]{2253, 41693, 56667, 49621}, new char[]{31735, 32354, 9466, 8960}, objArr21);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, pairIAuthTabCallback13, pairIAuthTabCallback14, pairIAuthTabCallback15, pairIAuthTabCallback16, pairIAuthTabCallback17, pairIAuthTabCallback18, pairIAuthTabCallback19, pairIAuthTabCallback20, getWrite.IAuthTabCallback(((String) objArr21[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeUiKspDeepLinkRegistry$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$wp735yHlFbaPyfG7V_2AcqVVKC4 = FeaturesHomeUiKspDeepLinkRegistry.$r8$lambda$wp735yHlFbaPyfG7V_2AcqVVKC4();
                int i4 = IAuthTabCallback + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$wp735yHlFbaPyfG7V_2AcqVVKC4;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return HomeHideAmountAction.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 93;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return HomeUpdateHideAmountAction.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return AssetHomeEditV2Activity.class;
    }

    private static final Class _init_$lambda$3() {
        Class<HomeAssetFilterActivity> cls;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            cls = HomeAssetFilterActivity.class;
            int i4 = 7 / 0;
        } else {
            cls = HomeAssetFilterActivity.class;
        }
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return HomeAssetCategoryFilterBottomSheetActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return ConsumptionCardNoticeMinorSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return MydataChildBlockActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return HomeHideAmountBottomSheetActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return AccountDetailRouteSchemeActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return HomeAppLockOfferBottomSheetActivity.class;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return HomeHideAmountOfferBottomSheetActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return SchemeUpdatePrimaryAccountActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$12() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return HomeSettingBottomSheetActivity.class;
    }

    private static final Class _init_$lambda$13() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return HomeTransactionAmountEditBottomSheetActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$14() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return HomeMydataServiceAvailableActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$15() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return HomeMydataServiceAvailableActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$16() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return MydataAssetAddBottomSheetSchemeActivity.class;
    }

    private static final Class _init_$lambda$17() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return MydataAssetAddBottomSheetSchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$18() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return AccountHistorySchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$19() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return AccountHistorySchemeActivity.class;
    }

    private static final Class _init_$lambda$20() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return AccountHistorySchemeActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 43 - View.MeasureSpec.getSize(0), 1450 - ExpandableListView.getPackedPositionChild(0L), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, 1494 - View.MeasureSpec.getMode(0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0')), 50 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 49;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 7;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i5 = -1469660336;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i3++;
                    int i9 = $10 + 49;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        long j = 0;
        if (iArr5 != null) {
            int i11 = $11 + 25;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(j), ((Process.getThreadPriority(i7) + 20) >> 6) + 72, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i13++;
                    i6 = 1;
                    i7 = 0;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $11 + 77;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 39 - KeyEvent.getDeadChar(0, 0), 10302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 7398 - TextUtils.indexOf("", ""), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i21 = $11 + 33;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new int[]{188952644, 910961958, -2024907260, 53752607, -319749583, -2093884776, 598074171, -1940045126, 2084807587, 992483509, 1221205491, 1936077481, -1067781091, -240109984, 875669522, -146601074, -1314501039, -614823944};
        onExtraCallbackWithResult = 5708920338180673548L;
        IAuthTabCallback = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
