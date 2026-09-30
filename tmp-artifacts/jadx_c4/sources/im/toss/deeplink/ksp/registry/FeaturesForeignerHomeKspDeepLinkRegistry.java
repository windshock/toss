package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.foreigner.home.ui.ForeignerHomeSwitchActivity;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestActivity;
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
public final class FeaturesForeignerHomeKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static byte[] IAuthTabCallback;
    private static int asBinder;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (i2 * 4) + 115;
        int i6 = 4 - (i * 3);
        int i7 = (s * 3) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i6++;
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i6];
            i6++;
            i5 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$G3c39KDuY7eJvc2HHyqkhWg72_0() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$xnjIM63yHuis4e3vW0_o7akd4x0() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 40 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = onTransact + 7;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 0;
        onExtraCallbackWithResult();
        int i = IAuthTabCallbackStub + 5;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    public FeaturesForeignerHomeKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesForeignerHomeKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesForeignerHomeKspDeepLinkRegistry.$r8$lambda$xnjIM63yHuis4e3vW0_o7akd4x0();
                }
                FeaturesForeignerHomeKspDeepLinkRegistry.$r8$lambda$xnjIM63yHuis4e3vW0_o7akd4x0();
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-971764012) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.red(0) + 2035773002, 24 - TextUtils.indexOf("", "", 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 971763980, View.getDefaultSize(0, 0) + 2035773002, 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesForeignerHomeKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$G3c39KDuY7eJvc2HHyqkhWg72_0 = FeaturesForeignerHomeKspDeepLinkRegistry.$r8$lambda$G3c39KDuY7eJvc2HHyqkhWg72_0();
                int i4 = onExtraCallbackWithResult + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$G3c39KDuY7eJvc2HHyqkhWg72_0;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        Class<ForeignerHomeSwitchActivity> cls;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            cls = ForeignerHomeSwitchActivity.class;
            int i4 = 94 / 0;
        } else {
            cls = ForeignerHomeSwitchActivity.class;
        }
        int i5 = i2 + 53;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return ForeignerHomeTestActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0239 A[PHI: r0
      0x0239: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:52:0x0237, B:49:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023b A[PHI: r0
      0x023b: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:52:0x0237, B:49:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 43424), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, 22439 - TextUtils.indexOf("", "", 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $11 + 9;
                $10 = i9 % 128;
                z = i9 % 2 == 0;
            }
            if (z) {
                int i10 = $10;
                int i11 = i10 + 33;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = i10 + 31;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    for (int i15 = 0; i15 < length; i15++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 12844), Color.red(0) + 55, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i15] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    int i16 = $11 + 107;
                    $10 = i16 % 128;
                    i6 = 2;
                    int i17 = i16 % 2;
                    bArr = bArr2;
                } else {
                    i6 = 2;
                }
                if (bArr != null) {
                    int i18 = $11 + 117;
                    $10 = i18 % 128;
                    if (i18 % i6 != 0) {
                        byte[] bArr3 = IAuthTabCallback;
                        Object[] objArr4 = new Object[i6];
                        objArr4[1] = Integer.valueOf(onNavigationEvent);
                        objArr4[0] = Integer.valueOf(i);
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22439 - View.combineMeasuredStates(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] & (-4629411779493505016L))) << ((int) (onWarmupCompleted - (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = IAuthTabCallback;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43424), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22439 - TextUtils.indexOf("", ""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i7;
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i19 = $10 + 25;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    i4 = ((i + iIntValue) - 3) - ((int) (onNavigationEvent / (-4629411779493505016L)));
                    i5 = z ^ true ? 0 : 1;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 86 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        int i21 = $10 + 85;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        bArr6[i20] = (byte) (bArr5[i20] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i23 = $11 + 19;
                    int i24 = i23 % 128;
                    $10 = i24;
                    int i25 = i23 % 2;
                    if (z2) {
                        int i26 = i24 + 35;
                        $11 = i26 % 128;
                        int i27 = i26 % 2;
                        byte[] bArr7 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
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

    static void onExtraCallbackWithResult() {
        onNavigationEvent = -1649661660;
        onWarmupCompleted = -1538795519;
        onExtraCallbackWithResult = 586107425;
        IAuthTabCallback = new byte[]{13, -25, 3, -6, 12, 76, -62, -16, -10, 15, 49, -75, 5, -1, 15, -10, 12, -5, 11, 1, 63, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 9, 6, -7, 77, -62, -16, -10, 15, 49, -75, 5, -1, 15, -10, 12, -5, 11, 1, 63, 8, -3, -49, 8, 12, -13, 10, 5, -3, -13, 10, 8, 8};
    }
}
