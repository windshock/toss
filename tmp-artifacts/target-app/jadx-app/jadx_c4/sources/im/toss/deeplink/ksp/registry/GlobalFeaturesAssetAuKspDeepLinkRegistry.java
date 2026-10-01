package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.global.features.asset.au.ui.AssetAuFunnelActivity;
import im.toss.global.features.asset.au.ui.devtool.AssetAuDevToolActivity;
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
public final class GlobalFeaturesAssetAuKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static byte[] IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {35, -27, Byte.MIN_VALUE, 50};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 115 - (i * 4);
        int i5 = 3 - (i2 * 4);
        int i6 = b * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            i4 = i7;
            int i9 = 0;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            int i10 = i5 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i11 = i3 + 1;
            i8 = i10;
            i5 = bArr[i10];
            i9 = i11;
            i4 += i5;
            i5 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            int i102 = i5 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i1022 = i5 + 1;
            if (i3 == i7) {
            }
        }
    }

    /* renamed from: $r8$lambda$MZE48CO-ebPX6C5UUv_N6N7HmMs, reason: not valid java name */
    public static /* synthetic */ Class m257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onTransact + 53;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$W1ed18GNfRsoU7rDN9mFgctFipU() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$mZNs3LZ9jrWCkGDVAlLVRp_dBPk() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = IAuthTabCallbackDefault + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    static {
        IAuthTabCallbackStub = 0;
        IAuthTabCallback();
        int i = asInterface + 51;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public GlobalFeaturesAssetAuKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetAuKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Class clsM257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs = GlobalFeaturesAssetAuKspDeepLinkRegistry.m257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs();
                    int i3 = 12 / 0;
                } else {
                    clsM257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs = GlobalFeaturesAssetAuKspDeepLinkRegistry.m257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs();
                }
                int i4 = IAuthTabCallback + 85;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return clsM257$r8$lambda$MZE48COebPX6C5UUv_N6N7HmMs;
            }
        };
        TargetRegion targetRegion = TargetRegion.GLOBAL;
        Object[] objArr = new Object[1];
        a((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1992603132 - Color.rgb(0, 0, 0), 1967838237 - TextUtils.lastIndexOf("", '0', 0), (-51) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) View.MeasureSpec.getMode(0), 2009380385 - View.resolveSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1967838238, (-53) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetAuKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    GlobalFeaturesAssetAuKspDeepLinkRegistry.$r8$lambda$mZNs3LZ9jrWCkGDVAlLVRp_dBPk();
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$mZNs3LZ9jrWCkGDVAlLVRp_dBPk = GlobalFeaturesAssetAuKspDeepLinkRegistry.$r8$lambda$mZNs3LZ9jrWCkGDVAlLVRp_dBPk();
                int i3 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$mZNs3LZ9jrWCkGDVAlLVRp_dBPk;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Color.blue(0) + 2009380420, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1967838238, (-61) - TextUtils.lastIndexOf("", '0', 0), objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalFeaturesAssetAuKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    GlobalFeaturesAssetAuKspDeepLinkRegistry.$r8$lambda$W1ed18GNfRsoU7rDN9mFgctFipU();
                    throw null;
                }
                Class cls$r8$lambda$W1ed18GNfRsoU7rDN9mFgctFipU = GlobalFeaturesAssetAuKspDeepLinkRegistry.$r8$lambda$W1ed18GNfRsoU7rDN9mFgctFipU();
                int i3 = onExtraCallback + 99;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return cls$r8$lambda$W1ed18GNfRsoU7rDN9mFgctFipU;
                }
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetAuDevToolActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 7;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return AssetAuFunnelActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return AssetAuFunnelActivity.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTouchSlop() >> 8)), 41 - MotionEvent.axisFromString(""), Color.alpha(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = $10 + 27;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), 54 - TextUtils.lastIndexOf("", '0', 0), View.resolveSizeAndState(0, 0, 0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 1;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = IAuthTabCallback;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43423), 42 - View.getDefaultSize(0, 0), Process.getGidForName("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
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
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + (!(z2 ^ true) ? 1 : 0);
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 86 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $11 + 17;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i14 = $11 + 119;
                    int i15 = i14 % 128;
                    $10 = i15;
                    if (i14 % 2 != 0) {
                        int i16 = 98 / 0;
                        if (z) {
                            int i17 = i15 + 33;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                byte[] bArr6 = IAuthTabCallback;
                                int i18 = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = 0;
                                i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[i18] ^ (-4629411779493505016L))) / s)) ^ b);
                            } else {
                                byte[] bArr7 = IAuthTabCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i4 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i4;
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                    } else if (z) {
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

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 746361356;
        onExtraCallback = -1538795438;
        onNavigationEvent = 787674205;
        IAuthTabCallback = new byte[]{-11, 8, -13, 79, -50, -6, 27, -11, 9, 61, -78, 28, 58, -77, 7, -6, 8, 26, 58, -53, 3, -9, -5, 11, 13, 48, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 25, -10, -5, 1, 13, -9, -5, 75, -78, 28, 58, -77, 7, -6, 8, 26, 58, -53, 3, -9, -5, 11, 13, 48, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 15, -10, 7, -5, 75, -77, 7, -6, 8, 26, 58, -53, 3, -9, -5, 11, 13, 48, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8, 8, 8};
    }
}
