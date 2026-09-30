package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.appsintoss.iap.InAppPurchaseHistoryActivity;
import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
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
public final class AppsintossKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int IAuthTabCallback;
    private static int asBinder;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {68, -59, -116, 119};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;

    private static String $$c(byte b, short s, byte b2) {
        int i = b2 + 4;
        byte[] bArr = $$a;
        int i2 = (s * 2) + 115;
        int i3 = b * 3;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + (-i);
            i = i;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i + 1;
            i2 += -bArr[i7];
            i = i7;
            i5 = i6;
        }
    }

    public static /* synthetic */ Class $r8$lambda$0YVWuECXEroRZP3UdP7pVgF6ZZI() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$oRSxb5tNE_TcLzbP3nv9yWrCaBI() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = IAuthTabCallbackDefault + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    static {
        asBinder = 1;
        onNavigationEvent();
        int i = asInterface + 27;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppsintossKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.AppsintossKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$0YVWuECXEroRZP3UdP7pVgF6ZZI = AppsintossKspDeepLinkRegistry.$r8$lambda$0YVWuECXEroRZP3UdP7pVgF6ZZI();
                int i4 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$0YVWuECXEroRZP3UdP7pVgF6ZZI;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a((short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 81), (-1292856081) - Color.argb(0, 0, 0, 0), (-1197717514) + Process.getGidForName(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 34, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-54) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1292856024) - View.resolveSize(0, 0), 18373 + AndroidCharacter.getMirror('0'), (-34) - ExpandableListView.getPackedPositionType(0L), objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.AppsintossKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$oRSxb5tNE_TcLzbP3nv9yWrCaBI = AppsintossKspDeepLinkRegistry.$r8$lambda$oRSxb5tNE_TcLzbP3nv9yWrCaBI();
                int i4 = IAuthTabCallback + 53;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$oRSxb5tNE_TcLzbP3nv9yWrCaBI;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return InAppPurchaseHistoryActivity.class;
    }

    private static final Class _init_$lambda$1() {
        Class<InAppPurchaseHistoryDetailActivity> cls;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 123;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            cls = InAppPurchaseHistoryDetailActivity.class;
            int i4 = 11 / 0;
        } else {
            cls = InAppPurchaseHistoryDetailActivity.class;
        }
        int i5 = i2 + 57;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getSize(0)), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22440 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            char c = '0';
            if (z) {
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int i7 = $11 + 43;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 12842);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 55;
                            int iLastIndexOf = 2166 - TextUtils.lastIndexOf("", c, 0, 0);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iIndexOf, iLastIndexOf, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        j = 0;
                        c = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43425), View.MeasureSpec.getMode(0) + 42, (ViewConfiguration.getScrollBarSize() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i9 = $11 + 27;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i8 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 86 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $10 + 79;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                        } else {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 51;
                    $11 = i13 % 128;
                    boolean z2 = i13 % 2 != 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!(!z2)) {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    static void onNavigationEvent() {
        IAuthTabCallback = -381111527;
        onExtraCallbackWithResult = -1538795479;
        onNavigationEvent = -484155274;
        onExtraCallback = new byte[]{16, 94, 90, -94, 88, 83, 88, 98, -111, -85, 75, -96, 92, -88, -92, 92, 24, -109, -85, 75, -96, 92, -88, -92, 92, 26, -28, 89, 86, 109, -26, 92, 99, -27, 89, 93, -94, 30, -26, 92, 101, -29, 90, 89, 86, 107, 89, -84, -98, 89, 93, -94, 91, 84, -84, -94, 91, 23, -63, -54, 47, -51, -61, -11, 118, -59, -63, 57, -61, -56, -61, -7, 10, 48, -48, 59, -57, 51, 63, -57, -125, 8, 48, -48, 59, -57, 51, 63, -57, -127, Byte.MAX_VALUE, -62, -51, -10, 125, -57, -8, 126, -62, -58, 57, -123, 125, -57, -2, 120, -63, -62, -51, -16, -62, 55, 5, -62, -58, 57, -64, -49, 55, 57, -64};
    }
}
