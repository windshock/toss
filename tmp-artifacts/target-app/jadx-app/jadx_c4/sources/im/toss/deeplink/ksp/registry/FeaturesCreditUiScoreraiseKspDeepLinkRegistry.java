package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
import im.toss.feature.credit.ui.scoreraise.LastScoreRaiseActivity;
import im.toss.feature.credit.ui.scoreraise.ScoreRaiseMainActivity;
import im.toss.feature.credit.ui.scoreraise.fullscreen_banner.CreditFullScreenBannerActivity;
import im.toss.feature.credit.ui.scoreraise.queueing.ScoreRaiseWaitActivity;
import im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeActivity;
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
public final class FeaturesCreditUiScoreraiseKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int asInterface;
    private static short[] onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 4 - (s * 3);
        int i4 = b2 * 2;
        int i5 = 115 - (b * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3 += i5;
            i2 = i7 + 1;
            i = i8;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
                return new String(bArr2, 0);
            }
            i7 = i2;
            i5 = bArr[i2];
            i3 += i5;
            i2 = i7 + 1;
            i = i8;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
            }
        } else {
            i = 0;
            i3 = i5;
            i2 = i3;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
            }
        }
    }

    /* renamed from: $r8$lambda$5-y4OkMLsc3CKSf8_Pv7GE3Rqz4, reason: not valid java name */
    public static /* synthetic */ Class m133$r8$lambda$5y4OkMLsc3CKSf8_Pv7GE3Rqz4() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$5i3DE60siN9cZCXYJpgEVLgN58s() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$4;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$AzhHs2A7SwhoxPKm9GvS7lZneYU() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = onTransact + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$F_zQgx_zwysnJGpbiaPSoFum5J4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$qs68R6W3IrODGzTVIGuHNCHjJ9Y() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onTransact + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return cls_init_$lambda$1;
    }

    static {
        asInterface = 1;
        onExtraCallbackWithResult();
        int i = IAuthTabCallbackDefault + 115;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public FeaturesCreditUiScoreraiseKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiScoreraiseKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesCreditUiScoreraiseKspDeepLinkRegistry.$r8$lambda$F_zQgx_zwysnJGpbiaPSoFum5J4();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$F_zQgx_zwysnJGpbiaPSoFum5J4 = FeaturesCreditUiScoreraiseKspDeepLinkRegistry.$r8$lambda$F_zQgx_zwysnJGpbiaPSoFum5J4();
                int i3 = onNavigationEvent + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$F_zQgx_zwysnJGpbiaPSoFum5J4;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) Color.red(0), 528361213 - Color.alpha(0), (-2079978975) - Color.blue(0), Color.argb(0, 0, 0, 0) - 76, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 528361242 - TextUtils.lastIndexOf("", '0', 0, 0), Gravity.getAbsoluteGravity(0, 0) - 2079978975, (-83) - Color.green(0), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiScoreraiseKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$qs68R6W3IrODGzTVIGuHNCHjJ9Y = FeaturesCreditUiScoreraiseKspDeepLinkRegistry.$r8$lambda$qs68R6W3IrODGzTVIGuHNCHjJ9Y();
                if (i3 == 0) {
                    int i4 = 24 / 0;
                }
                return cls$r8$lambda$qs68R6W3IrODGzTVIGuHNCHjJ9Y;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 528361266, (-2079978975) - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 75, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiScoreraiseKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM133$r8$lambda$5y4OkMLsc3CKSf8_Pv7GE3Rqz4 = FeaturesCreditUiScoreraiseKspDeepLinkRegistry.m133$r8$lambda$5y4OkMLsc3CKSf8_Pv7GE3Rqz4();
                if (i3 == 0) {
                    int i4 = 49 / 0;
                }
                return clsM133$r8$lambda$5y4OkMLsc3CKSf8_Pv7GE3Rqz4;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (KeyEvent.getMaxKeyCode() >> 16), 528361297 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-2079978975) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 65506 - AndroidCharacter.getMirror('0'), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiScoreraiseKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$AzhHs2A7SwhoxPKm9GvS7lZneYU = FeaturesCreditUiScoreraiseKspDeepLinkRegistry.$r8$lambda$AzhHs2A7SwhoxPKm9GvS7lZneYU();
                int i4 = IAuthTabCallback + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$AzhHs2A7SwhoxPKm9GvS7lZneYU;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a((short) KeyEvent.normalizeMetaState(0), (byte) Color.green(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 528361324, (-2079978974) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.alpha(0) - 74, objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiScoreraiseKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$5i3DE60siN9cZCXYJpgEVLgN58s = FeaturesCreditUiScoreraiseKspDeepLinkRegistry.$r8$lambda$5i3DE60siN9cZCXYJpgEVLgN58s();
                int i4 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$5i3DE60siN9cZCXYJpgEVLgN58s;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 63;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return LastScoreRaiseActivity.class;
        }
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return ScoreRaiseMainActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return CreditFullScreenBannerActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 51;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return ScoreRaiseWaitActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return JoinTossbankBridgeActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[PHI: r4
      0x0081: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v18 byte[]) binds: [B:18:0x007f, B:15:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 77;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    bArr = onExtraCallbackWithResult;
                    int i8 = 35 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $10 + 19;
                            $11 = i10 % 128;
                            int i11 = i10 % i4;
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), KeyEvent.normalizeMetaState(0) + 55, View.resolveSize(0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            i4 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        int i12 = $10 + 85;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr3 = onExtraCallbackWithResult;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 43424), 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                            j = -4629411779493505016L;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85, TextUtils.indexOf((CharSequence) "", '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $10 + 43;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 78 / 0;
                        if (!z) {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                            int i17 = $10 + 9;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                    } else if (!z) {
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 1153827083;
        onNavigationEvent = -1538795421;
        onWarmupCompleted = -541184422;
        onExtraCallbackWithResult = new byte[]{0, -1, 10, 6, -5, 75, -62, -6, 2, 0, -25, 75, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -6, 2, 0, -25, 75, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 11, 60, -73, 1, 8, -5, 7, -8, 15, 8, -1, 7, 63, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 3, 0, -30, 64, -62, -6, 2, 0, -25, 75, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -11, -10, 14, 13, 50, -52, -11, 5, -9, -25, 8, 12, -13, 77, -77, 3, 13, -9, -5, 7, 60, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8, 8, 8, 8, 8};
    }
}
