package im.toss.deeplink.ksp.registry;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.presentation.long_press.HomeLongPressBottomSheetActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomePresentationLong_pressKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static short[] IAuthTabCallback;
    private static final byte[] $$a = {112, 44, -46, -27};
    private static final int $$b = 160;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onWarmupCompleted = -1292895879;
    private static int onExtraCallback = -1538795418;
    private static int onNavigationEvent = 1754870054;
    private static byte[] onExtraCallbackWithResult = {-14, -29, -32, -24, 57, -93, -31, -18, -29, -8, -16, 40, -83, -29, -15, -42, -27, 38, -71, -20, -30, -26, 32, -67, -21, -31, -6, 44, -29, -24, -70, -29, -25, -18, -27, -16, -24, -18, -27, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 4 - (s2 * 2);
        int i5 = 115 - (i * 4);
        byte[] bArr = $$a;
        int i6 = s * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += -i5;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i2 + 1;
            i7 = i3;
            i5 = bArr[i3];
            i8 = i9;
            i4 += -i5;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = i5;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ Class $r8$lambda$8g097xc_IJ1pSg5XEP7nlstznpg() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = asBinder + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomePresentationLong_pressKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 21), (byte) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 380117361, TextUtils.lastIndexOf("", '0', 0, 0) + 857806662, (-70) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomePresentationLong_pressKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$8g097xc_IJ1pSg5XEP7nlstznpg = FeaturesHomePresentationLong_pressKspDeepLinkRegistry.$r8$lambda$8g097xc_IJ1pSg5XEP7nlstznpg();
                int i4 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$8g097xc_IJ1pSg5XEP7nlstznpg;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return HomeLongPressBottomSheetActivity.class;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0, 0)), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22438 - TextUtils.indexOf((CharSequence) "", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            long j2 = 0;
            if (z) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int i7 = $11 + 99;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j2) + 12844), View.MeasureSpec.makeMeasureSpec(0, 0) + 55, 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j2 = 0;
                    }
                    int i10 = $11 + 61;
                    $10 = i10 % 128;
                    i5 = 2;
                    int i11 = i10 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = new Object[i5];
                    objArr4[1] = Integer.valueOf(onWarmupCompleted);
                    objArr4[0] = Integer.valueOf(i);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0', 0)), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 22438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j));
                if (z) {
                    int i13 = $10 + 47;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 86 - ExpandableListView.getPackedPositionGroup(0L), 9567 - View.resolveSize(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = $11 + 103;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            bArr5[i15] = (byte) (bArr4[i15] * (-4629411779493505016L));
                            i15--;
                        } else {
                            bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            i15++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $11 + 119;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    if (z2) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
}
