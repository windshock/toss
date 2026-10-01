package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import im.toss.features.cardissue.event.ui.eligibility.CardIssueEventCheckEligibilityActivity;
import im.toss.features.cardissue.event.ui.eligibility.CardIssueEventCheckResultActivity;
import im.toss.features.cardissue.event.ui.info.CardIssueEventInfoActivity;
import im.toss.features.cardissue.event.ui.list.CardIssueEventListActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesCardIssueEventKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int asBinder;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 79;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = 4 - (b * 3);
        int i3 = 115 - (b2 * 4);
        byte[] bArr = $$a;
        int i4 = (b3 * 2) + 1;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i2];
            i2++;
            i3 += i5;
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

    public static /* synthetic */ Class $r8$lambda$5MmUe8RwbCNlf1RUjDRmWuxwVOU() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$Jlflvwi7hKC_JHNEkP15w8AEWxI() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$Qkdxq-_Cyo0a3ILh4QPTZVVpnf8, reason: not valid java name */
    public static /* synthetic */ Class m111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i4 = IAuthTabCallbackDefault + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$SF1Ny6D4Qx6zRTI0nMYeXAswW2g() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$qXsOKMl94ridJDRaWInmKorc5xA() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$2();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onTransact + 35;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$2;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$t0toYY2gPX267A4TmqkVtI5vYrs() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onTransact + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return cls_init_$lambda$0;
    }

    static {
        asBinder = 0;
        onExtraCallback();
        int i = IAuthTabCallbackStub + 103;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public FeaturesCardIssueEventKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$t0toYY2gPX267A4TmqkVtI5vYrs = FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$t0toYY2gPX267A4TmqkVtI5vYrs();
                if (i3 != 0) {
                    int i4 = 99 / 0;
                }
                return cls$r8$lambda$t0toYY2gPX267A4TmqkVtI5vYrs;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) (65 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) (ExpandableListView.getPackedPositionChild(0L) + 56), (-1390783508) - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 2012159679, View.MeasureSpec.getMode(0) - 98, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 29), (byte) (44 - ((Process.getThreadPriority(0) + 20) >> 6)), (-1390783466) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 2012159678, (ViewConfiguration.getScrollBarSize() >> 8) - 98, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$5MmUe8RwbCNlf1RUjDRmWuxwVOU();
                }
                FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$5MmUe8RwbCNlf1RUjDRmWuxwVOU();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((short) ((-42) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 35), (-1390783424) - (ViewConfiguration.getEdgeSlop() >> 16), (-2012159679) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 98, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$qXsOKMl94ridJDRaWInmKorc5xA = FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$qXsOKMl94ridJDRaWInmKorc5xA();
                if (i3 != 0) {
                    int i4 = 11 / 0;
                }
                return cls$r8$lambda$qXsOKMl94ridJDRaWInmKorc5xA;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((short) (TextUtils.indexOf("", "") + 115), (byte) ((-83) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) - 1390783374, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2012159678, (-98) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$SF1Ny6D4Qx6zRTI0nMYeXAswW2g = FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$SF1Ny6D4Qx6zRTI0nMYeXAswW2g();
                int i4 = onExtraCallback + 9;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$SF1Ny6D4Qx6zRTI0nMYeXAswW2g;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 11), (byte) (TextUtils.getOffsetBefore("", 0) - 102), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1390783337, (-2012159678) - Color.red(0), View.MeasureSpec.getMode(0) - 98, objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Jlflvwi7hKC_JHNEkP15w8AEWxI = FeaturesCardIssueEventKspDeepLinkRegistry.$r8$lambda$Jlflvwi7hKC_JHNEkP15w8AEWxI();
                int i4 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$Jlflvwi7hKC_JHNEkP15w8AEWxI;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 65), (byte) ((-96) - (ViewConfiguration.getTapTimeout() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1390783279, (-2012159678) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "") - 98, objArr6);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCardIssueEventKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                Class clsM111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8 = FeaturesCardIssueEventKspDeepLinkRegistry.m111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8();
                    int i3 = 53 / 0;
                } else {
                    clsM111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8 = FeaturesCardIssueEventKspDeepLinkRegistry.m111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8();
                }
                int i4 = IAuthTabCallback + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM111$r8$lambda$Qkdxq_Cyo0a3ILh4QPTZVVpnf8;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return CardIssueEventInfoActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return CardIssueEventListActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return CardIssueEventCheckEligibilityActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return CardIssueEventCheckEligibilityActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return CardIssueEventCheckResultActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return CardIssueEventCheckResultActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba A[PHI: r0
      0x01ba: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:43:0x01b8, B:40:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bc A[PHI: r0
      0x01bc: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:43:0x01b8, B:40:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            long j = 0;
            if (z) {
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int i9 = $11 + 13;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 0;
                    }
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), 55 - (ViewConfiguration.getPressedStateDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    int i10 = $10 + 53;
                    $11 = i10 % 128;
                    i6 = 2;
                    int i11 = i10 % 2;
                    bArr2 = bArr;
                } else {
                    i6 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(onWarmupCompleted);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 42 - View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i12 = $11 + 77;
                int i13 = i12 % 128;
                $10 = i13;
                if (i12 % 2 != 0) {
                    i4 = ((i << iIntValue) * 5) << ((int) (onWarmupCompleted - (-4629411779493505016L)));
                    if (z) {
                        int i14 = i13 + 89;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 4 / 5;
                        }
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    if (!z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 86, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = -157125604;
        IAuthTabCallback = -1538795415;
        onExtraCallback = -743913671;
        onNavigationEvent = new byte[]{-63, -11, -122, -7, -60, 67, -8, -11, -97, -19, -56, -67, -113, -8, -119, -21, -127, -120, -11, -122, -2, Byte.MIN_VALUE, -14, Byte.MIN_VALUE, -117, 57, -75, -116, -19, Byte.MIN_VALUE, -54, -2, -119, -89, -2, -6, -125, -4, -15, -119, -125, -4, -63, 66, 75, -26, 38, -68, 79, 74, -24, 82, 63, 2, -8, 79, -2, 84, -26, -1, 74, -7, 65, -25, 53, -25, -12, -114, 10, -13, 82, -25, 61, 65, -2, 0, 65, 77, -4, 67, 54, -2, -4, 67, -39, 13, -9, 69, 15, 11, 89, 14, 66, 69, 11, 24, 78, 8, 66, 69, 13, 28, -121, 10, 9, 83, -15, 26, 55, 94, -15, 66, 26, 72, 81, -1, 88, 69, 15, 15, 0, 13, 30, 0, 93, 75, 0, 12, 71, 14, -11, 93, 71, 14, -51, 38, -43, 49, 56, 35, -84, 63, 58, -40, 66, 47, -4, -29, 66, -41, 47, -7, -30, 68, -23, -42, 52, 52, 49, 62, 35, 49, -18, -16, 49, 61, -20, 51, 38, -18, -20, 51, -48, -107, 112, -85, -105, 124, -20, 63, -94, -108, 122, -84, -96, 102, -85, 103, 122, -96, -91, 107, -107, 103, 122, -94, -79, 36, -81, -106, -120, -98, -65, 84, 123, -98, 103, -65, 85, 126, -100, 101, 122, -84, -84, -83, -94, -69, -83, 114, 96, -83, -95, 100, -85, -86, 114, 100, -85, -60, -31, -112, -21, -25, -100, 44, 95, -26, -107, -23, -8, -37, 84, -17, -30, -104, -6, -33, -92, -101, -6, -105, -33, -95, -102, -4, -111, -106, -20, -20, -23, -18, -37, -23, -98, -96, -23, -19, -108, -21, -26, -98, -108, -21};
    }
}
