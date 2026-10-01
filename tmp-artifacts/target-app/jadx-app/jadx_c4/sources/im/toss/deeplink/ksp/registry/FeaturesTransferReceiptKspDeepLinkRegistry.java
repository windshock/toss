package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.transfer.receipt.TransferHistoryReceiptActivity;
import im.toss.features.transfer.receipt.receipt.TransferReceiptTransparentActivity;
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
public final class FeaturesTransferReceiptKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = (i2 * 2) + 1;
        int i7 = 4 - (i3 * 2);
        int i8 = 115 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i8 = i6;
            int i9 = i7;
            int i10 = 0;
            i8 += -i7;
            i7 = i9 + 1;
            i4 = i10;
            bArr2[i4] = (byte) i8;
            i5 = i4 + 1;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            i9 = i7;
            i7 = bArr[i7];
            i10 = i5;
            i8 += -i7;
            i7 = i9 + 1;
            i4 = i10;
            bArr2[i4] = (byte) i8;
            i5 = i4 + 1;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i8;
            i5 = i4 + 1;
            if (i5 == i6) {
            }
        }
    }

    /* renamed from: $r8$lambda$GPOh9fjE8y4hvKl-U1oUuTetrgc, reason: not valid java name */
    public static /* synthetic */ Class m249$r8$lambda$GPOh9fjE8y4hvKlU1oUuTetrgc() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$3();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = IAuthTabCallbackStub + 25;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$3;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$rMtgfFyReyO90VfN0tMRgaqIXRM() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$tm16kgsa4rBfaQk0wCu8QIf3Iwg() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = asInterface + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onTransact = 0;
        IAuthTabCallback();
        int i = IAuthTabCallbackDefault + 33;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FeaturesTransferReceiptKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferReceiptKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesTransferReceiptKspDeepLinkRegistry.$r8$lambda$rMtgfFyReyO90VfN0tMRgaqIXRM();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$rMtgfFyReyO90VfN0tMRgaqIXRM = FeaturesTransferReceiptKspDeepLinkRegistry.$r8$lambda$rMtgfFyReyO90VfN0tMRgaqIXRM();
                int i3 = onWarmupCompleted + 107;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 99 / 0;
                }
                return cls$r8$lambda$rMtgfFyReyO90VfN0tMRgaqIXRM;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) View.getDefaultSize(0, 0), (byte) (Process.myTid() >> 22), 915695062 - Color.alpha(0), (-190471267) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 21, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), 915695089 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 190471266, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 23, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferReceiptKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                Class cls$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    cls$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus = FeaturesTransferReceiptKspDeepLinkRegistry.$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus();
                    int i3 = 0 / 0;
                } else {
                    cls$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus = FeaturesTransferReceiptKspDeepLinkRegistry.$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus();
                }
                int i4 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$hB6MB5cSZKNTQ3sJaPU56s2Axus;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a((short) KeyEvent.normalizeMetaState(0), (byte) TextUtils.indexOf("", "", 0), AndroidCharacter.getMirror('0') + 26074, (-190471266) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-14) - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferReceiptKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$tm16kgsa4rBfaQk0wCu8QIf3Iwg = FeaturesTransferReceiptKspDeepLinkRegistry.$r8$lambda$tm16kgsa4rBfaQk0wCu8QIf3Iwg();
                int i4 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$tm16kgsa4rBfaQk0wCu8QIf3Iwg;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a((short) Color.alpha(0), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 915695148, (-190471266) - View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") - 16, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferReceiptKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM249$r8$lambda$GPOh9fjE8y4hvKlU1oUuTetrgc = FeaturesTransferReceiptKspDeepLinkRegistry.m249$r8$lambda$GPOh9fjE8y4hvKlU1oUuTetrgc();
                int i4 = IAuthTabCallback + 123;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                return clsM249$r8$lambda$GPOh9fjE8y4hvKlU1oUuTetrgc;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return TransferReceiptTransparentActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return TransferHistoryReceiptActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 71;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return TransferHistoryReceiptActivity.class;
        }
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return TransferHistoryReceiptActivity.class;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 43424), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22439 - (KeyEvent.getMaxKeyCode() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = onExtraCallbackWithResult;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $11 + 83;
                        $10 = i8 % 128;
                        if (i8 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf("", c, 0, 0)), 55 - Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7 >>>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0')), (-16777161) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 2168, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i7++;
                        }
                        i4 = 2;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 43425), 42 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
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
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i6;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 86 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i9 = $10 + 89;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $10 + 99;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    int i14 = $10 + 43;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i16 = $10 + 91;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
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
        onExtraCallback = 1831617058;
        IAuthTabCallback = -1538795463;
        onWarmupCompleted = -1357019939;
        onExtraCallbackWithResult = new byte[]{12, 15, 12, 10, -10, -5, 75, -75, 5, -9, -5, 13, 5, -25, -10, 77, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -9, -8, 10, 8, 2, 50, -77, 12, 15, 12, 10, -10, -5, 75, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, -9, -8, 10, 8, 2, 50, -77, 12, 15, 12, 10, -10, -5, 75, -75, 5, -9, -5, 13, 5, -25, -10, 77, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 9, 2, -11, 53, -77, 12, 15, 12, 10, -10, -5, 75, -75, 5, -9, -5, 13, 5, -25, -10, 77, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8, 8, 8, 8};
    }
}
