package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import im.toss.global.features.home.features.account.creditcard_detail.GlobalHomeAccountCreditCardDetailActivity;
import im.toss.global.features.home.features.account.creditcard_payment_detail.GlobalHomeCreditCardPaymentActivity;
import im.toss.global.features.home.features.account.loan.GlobalHomeAccountLoanActivity;
import im.toss.global.features.home.features.account.mortgage.GlobalHomeAccountMortgageActivity;
import im.toss.global.features.home.features.account.offset_account.GlobalHomeAccountOffsetAccountActivity;
import im.toss.global.features.home.features.account.savings.GlobalHomeAccountSavingsActivity;
import im.toss.global.features.home.features.account.savings_detail.GlobalHomeAccountSavingsDetailActivity;
import im.toss.global.features.home.features.account.transaction.GlobalHomeAccountTransactionActivity;
import im.toss.global.features.home.features.asset_home.GlobalAssetHomeActivity;
import im.toss.global.features.home.features.card_bill.GlobalHomeCardBillActivity;
import im.toss.global.features.home.features.cashflow.GlobalHomeCashFlowActivity;
import im.toss.global.features.home.features.payment_detail.GlobalHomePaymentDetailActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GlobalFeaturesHomeKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static boolean IAuthTabCallbackDefault;
    private static boolean asInterface;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2 = 4 - (b2 * 4);
        int i3 = s * 2;
        int i4 = 110 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i2;
            int i7 = 0;
            i2++;
            i4 = (-i4) + i6;
            i = i7;
            int i8 = i2;
            int i9 = i4;
            bArr2[i] = (byte) i9;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8;
            i4 = bArr[i8];
            i7 = i + 1;
            i6 = i9;
            i2++;
            i4 = (-i4) + i6;
            i = i7;
            int i82 = i2;
            int i92 = i4;
            bArr2[i] = (byte) i92;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i822 = i2;
            int i922 = i4;
            bArr2[i] = (byte) i922;
            if (i == i5) {
            }
        }
    }

    /* renamed from: $r8$lambda$0JFh-d-hKFE0rehtOuCNDdRf9og, reason: not valid java name */
    public static /* synthetic */ Class m261$r8$lambda$0JFhdhKFE0rehtOuCNDdRf9og() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$7;
    }

    public static /* synthetic */ Class $r8$lambda$1sMTZDprKoSnQfdXNE0DUnGaZF8() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 80 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = asBinder + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$8RkJVmzOswV3gGnWHpjkqqzt39U() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$4();
        }
        _init_$lambda$4();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$9YMLBXsv4NLwOVCKcUN5gmSTxOg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$11 = _init_$lambda$11();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return cls_init_$lambda$11;
    }

    public static /* synthetic */ Class $r8$lambda$DJ0_IyqMaeF0MGUcnhN7bp4oVV0() {
        Class cls_init_$lambda$1;
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$1 = _init_$lambda$1();
            int i3 = 23 / 0;
        } else {
            cls_init_$lambda$1 = _init_$lambda$1();
        }
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$MoE6cXVWDD_nmLUjDnn7Q9bX4SA() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$Zya_WbxffnAz48hKKMv60yyrvPA() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i4 = asBinder + 115;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$5;
    }

    /* renamed from: $r8$lambda$bt7RgjgM7-GL3haxofPymIGnajM, reason: not valid java name */
    public static /* synthetic */ Class m262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = IAuthTabCallbackStub + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$gfB-NQqlaj6XGI2El9MvnblMm0M, reason: not valid java name */
    public static /* synthetic */ Class m263$r8$lambda$gfBNQqlaj6XGI2El9MvnblMm0M() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = asBinder + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$8;
    }

    /* renamed from: $r8$lambda$k-pMdgKHzmOHZL8OT_eHYy_7U5I, reason: not valid java name */
    public static /* synthetic */ Class m264$r8$lambda$kpMdgKHzmOHZL8OT_eHYy_7U5I() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$10 = _init_$lambda$10();
        int i4 = IAuthTabCallbackStub + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$10;
    }

    /* renamed from: $r8$lambda$kelig7ovcudea3HW-MbA0jHex6E, reason: not valid java name */
    public static /* synthetic */ Class m265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$2();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = asBinder + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$2;
    }

    /* renamed from: $r8$lambda$zaBdyVtAwQ8_iNgv5n5zi-nNMQc, reason: not valid java name */
    public static /* synthetic */ Class m266$r8$lambda$zaBdyVtAwQ8_iNgv5n5zinNMQc() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$9();
            throw null;
        }
        Class cls_init_$lambda$9 = _init_$lambda$9();
        int i3 = asBinder + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$9;
    }

    static {
        onTransact = 0;
        onWarmupCompleted();
        int i = access000 + 3;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public GlobalFeaturesHomeKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$1sMTZDprKoSnQfdXNE0DUnGaZF8 = GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$1sMTZDprKoSnQfdXNE0DUnGaZF8();
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$1sMTZDprKoSnQfdXNE0DUnGaZF8;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.GLOBAL;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), (-1004757370) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{48512, 39139, 25776, 40013, 16532, 60107, 17249, 21218, 48572, 63486, 27526, 42588, 40989, 47105, 48212, 22696, 28039, 41911, 25069, 34293, 11306}, new char[]{5962, 15741, 65371, 13399}, new char[]{34356, 7326, 20932, 12528}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.indexOf("", "", 0) + 36475), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{33527, 46763, 10337, 11070, 59457, 40347, 9331, 11955, 55747, 34064, 13211, 839, 55342, 22292, 29530, 7761, 14306, 28214, 23814, 32562, 3593, 12062, 2379, 53440, 57142, 49100, 26286, 51802, 44529, 64033, 5612, 232, 965, 17702, 19220, 24782, 45825, 8712, 28116, 64666}, new char[]{5962, 15741, 65371, 13399}, new char[]{50020, 26415, 31646, 10894}, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$DJ0_IyqMaeF0MGUcnhN7bp4oVV0();
                }
                GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$DJ0_IyqMaeF0MGUcnhN7bp4oVV0();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        b(null, new byte[]{-122, -114, -126, -121, -115, -115, -116, -112, -114, -116, -121, -113, -119, -122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                Class clsM265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E = GlobalFeaturesHomeKspDeepLinkRegistry.m265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E();
                    int i3 = 31 / 0;
                } else {
                    clsM265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E = GlobalFeaturesHomeKspDeepLinkRegistry.m265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E();
                }
                int i4 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return clsM265$r8$lambda$kelig7ovcudea3HWMbA0jHex6E;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((char) (View.combineMeasuredStates(0, 0) + 51950), KeyEvent.normalizeMetaState(0) - 1231270637, new char[]{53465, 54668, 21287, 48958, 18003, 44830, 30447, 62713, 44717, 22388, 17733, 23029, 1984, 27715, 63530, 62054, 23938, 22544, 28920, 27830, 47013, 34136, 55059, 15819, 31189, 45694, 28042, 61408, 35746, 59774, 9139, 58330, 55761, 13733, 46637, 1236, 55019, 21418, 42197, 52766, 24440}, new char[]{5962, 15741, 65371, 13399}, new char[]{5027, 40013, 61110, 63434}, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$MoE6cXVWDD_nmLUjDnn7Q9bX4SA = GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$MoE6cXVWDD_nmLUjDnn7Q9bX4SA();
                int i4 = onNavigationEvent + 33;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 19 / 0;
                }
                return cls$r8$lambda$MoE6cXVWDD_nmLUjDnn7Q9bX4SA;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{-122, -114, -126, -121, -115, -115, -116, -112, -122, -124, -127, -111, -111, -121, -119, -122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, TextUtils.lastIndexOf("", '0', 0) + 128, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$8RkJVmzOswV3gGnWHpjkqqzt39U = GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$8RkJVmzOswV3gGnWHpjkqqzt39U();
                int i4 = onExtraCallbackWithResult + 15;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$8RkJVmzOswV3gGnWHpjkqqzt39U;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a((char) (49736 - AndroidCharacter.getMirror('0')), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{31505, 54506, 25943, 39249, 47427, 33515, 50030, 60172, 55663, 56578, 4408, 37718, 20378, 47907, 16955, 52392, 59857, 41083, 29749, 64852, 60504, 16915, 37640, 1953, 60315, 63947, 25839, 16786, 50033, 3318, 41912, 15601, 56642, 59430, 33158, 54513, 21379, 54984, 47055, 4650}, new char[]{5962, 15741, 65371, 13399}, new char[]{44428, 61692, 6316, 47554}, objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Zya_WbxffnAz48hKKMv60yyrvPA = GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$Zya_WbxffnAz48hKKMv60yyrvPA();
                int i4 = IAuthTabCallback + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$Zya_WbxffnAz48hKKMv60yyrvPA;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        b(null, new byte[]{-122, -127, -124, -123, -124, -122, -114, -109, -112, -107, -113, -123, -116, -124, -107, -112, -127, -108, -114, -109, -110, -116, -127, -119, -122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, ExpandableListView.getPackedPositionChild(0L) + 128, objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                Class clsM262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM = GlobalFeaturesHomeKspDeepLinkRegistry.m262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM();
                    int i3 = 8 / 0;
                } else {
                    clsM262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM = GlobalFeaturesHomeKspDeepLinkRegistry.m262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM();
                }
                int i4 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM262$r8$lambda$bt7RgjgM7GL3haxofPymIGnajM;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        b(null, new byte[]{-122, -114, -126, -121, -115, -115, -116, -112, -114, -121, -109, -122, -115, -116, -127, -114, -116, -123, -122, -119, -122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM261$r8$lambda$0JFhdhKFE0rehtOuCNDdRf9og = GlobalFeaturesHomeKspDeepLinkRegistry.m261$r8$lambda$0JFhdhKFE0rehtOuCNDdRf9og();
                int i4 = IAuthTabCallback + 65;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 53 / 0;
                }
                return clsM261$r8$lambda$0JFhdhKFE0rehtOuCNDdRf9og;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        a((char) (65001 - View.combineMeasuredStates(0, 0)), (-1329128573) + (ViewConfiguration.getScrollBarSize() >> 8), new char[]{35477, 5026, 6335, 61865, 1911, 55618, 30738, 30540, 37581, 4508, 22273, 18395, 52902, 55384, 29056, 2010, 40478, 1041, 46858, 2788, 18323, 56728, 54320, 42162, 51341, 62962, 48031}, new char[]{5962, 15741, 65371, 13399}, new char[]{33615, 50971, 59824, 2301}, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM263$r8$lambda$gfBNQqlaj6XGI2El9MvnblMm0M = GlobalFeaturesHomeKspDeepLinkRegistry.m263$r8$lambda$gfBNQqlaj6XGI2El9MvnblMm0M();
                if (i3 == 0) {
                    int i4 = 77 / 0;
                }
                return clsM263$r8$lambda$gfBNQqlaj6XGI2El9MvnblMm0M;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        a((char) (((Process.getThreadPriority(0) + 20) >> 6) + 39423), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, new char[]{18478, 47354, 51353, 38520, 5589, 26231, 49777, 18923, 53223, 55038, 62853, 27660, 54558, 39660, 5275, 62891, 17473, 48948, 27964, 63854, 30836, 6815, 10551, 41940, 54432, 41898}, new char[]{5962, 15741, 65371, 13399}, new char[]{14598, 51463, 65456, 7577}, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    GlobalFeaturesHomeKspDeepLinkRegistry.m266$r8$lambda$zaBdyVtAwQ8_iNgv5n5zinNMQc();
                    throw null;
                }
                Class clsM266$r8$lambda$zaBdyVtAwQ8_iNgv5n5zinNMQc = GlobalFeaturesHomeKspDeepLinkRegistry.m266$r8$lambda$zaBdyVtAwQ8_iNgv5n5zinNMQc();
                int i3 = onExtraCallback + 73;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return clsM266$r8$lambda$zaBdyVtAwQ8_iNgv5n5zinNMQc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        b(null, new byte[]{-106, -121, -113, -111, -112, -118, -127, -116, -115, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM264$r8$lambda$kpMdgKHzmOHZL8OT_eHYy_7U5I = GlobalFeaturesHomeKspDeepLinkRegistry.m264$r8$lambda$kpMdgKHzmOHZL8OT_eHYy_7U5I();
                int i4 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM264$r8$lambda$kpMdgKHzmOHZL8OT_eHYy_7U5I;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr12 = new Object[1];
        b(null, new byte[]{-113, -109, -116, -122, -124, -105, -112, -114, -121, -109, -122, -115, -116, -127, -114, -116, -123, -122, -119, -122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, View.combineMeasuredStates(0, 0) + 127, objArr12);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesHomeKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$9YMLBXsv4NLwOVCKcUN5gmSTxOg = GlobalFeaturesHomeKspDeepLinkRegistry.$r8$lambda$9YMLBXsv4NLwOVCKcUN5gmSTxOg();
                if (i3 != 0) {
                    int i4 = 50 / 0;
                }
                return cls$r8$lambda$9YMLBXsv4NLwOVCKcUN5gmSTxOg;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return GlobalHomeAccountCreditCardDetailActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeCreditCardPaymentActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 27;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return GlobalHomeAccountLoanActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeAccountMortgageActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return GlobalHomeAccountOffsetAccountActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeAccountSavingsActivity.class;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeAccountSavingsDetailActivity.class;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeAccountTransactionActivity.class;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return GlobalAssetHomeActivity.class;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return GlobalHomeCardBillActivity.class;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return GlobalHomeCashFlowActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$11() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return GlobalHomePaymentDetailActivity.class;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cRed = (char) Color.red(0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 44;
                    int maxKeyCode = 1451 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b = (byte) ($$a[i2] + 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, packedPositionChild, maxKeyCode, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char maxKeyCode2 = (char) (49123 - (KeyEvent.getMaxKeyCode() >> 16));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1494;
                    byte b3 = (byte) (-$$a[i2]);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maxKeyCode2, scrollDefaultDelay, iNormalizeMetaState, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (Process.myTid() >> 22)), 50 - (ViewConfiguration.getFadingEdgeLength() >> 16), 22939 - View.combineMeasuredStates(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 45848), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 23;
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
        objArr[0] = new String(cArr6);
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 77 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), '{' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!(!asInterface)) {
            int i4 = $11 + 85;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 63 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $10 + 19;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 3;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            loop3: while (true) {
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        break;
                    }
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] + iIntValue);
                int i9 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
            }
            String str = new String(cArr5);
            int i10 = $11 + 9;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $11 + 23;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 63 - (Process.myTid() >> 22), MotionEvent.axisFromString("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0, 0) + 1), 63 - (ViewConfiguration.getTouchSlop() >> 8), 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                c = '0';
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onWarmupCompleted() {
        onExtraCallback = 6372016700151069873L;
        onExtraCallbackWithResult = -1776194565;
        onNavigationEvent = (char) 27643;
        onWarmupCompleted = new char[]{32417, 32423, 32428, 32439, 32418, 32416, 32429, 32410, 32621, 32436, 32431, 32435, 32433, 32430, 32424, 32623, 32438, 32422, 32427, 32437, 32475, 32421, 32432};
        IAuthTabCallback = -1184333988;
        IAuthTabCallbackDefault = true;
        asInterface = true;
    }
}
