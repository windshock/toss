package okhttp3.internal.http;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HttpMethod {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final HttpMethod INSTANCE;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onTransact = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = b2 + 4;
        int i4 = 1 - (b * 3);
        byte[] bArr = $$a;
        int i5 = 115 - (s * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i5 = i4;
            int i6 = i3;
            i2 = 0;
            i5 += -i3;
            i3 = i6;
            i = i2;
            int i7 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i3 = bArr[i7];
            i5 += -i3;
            i3 = i6;
            i = i2;
            int i72 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i722 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onExtraCallbackWithResult();
        INSTANCE = new HttpMethod();
        int i = onTransact + 31;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private HttpMethod() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean invalidatesCache(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (byte) ((-1) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 496403553 - View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 802037273, AndroidCharacter.getMirror('0') - 'S', objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i4 = IAuthTabCallbackDefault + 3;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(str, "PATCH");
                throw null;
            }
            if (!Intrinsics.areEqual(str, "PATCH") && !Intrinsics.areEqual(str, "PUT")) {
                int i5 = IAuthTabCallbackDefault + 111;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                    if (!Intrinsics.areEqual(str, "DELETE")) {
                        if (!Intrinsics.areEqual(str, "MOVE")) {
                            return false;
                        }
                    }
                } else if (!Intrinsics.areEqual(str, "DELETE")) {
                }
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean requiresRequestBody(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a((short) KeyEvent.getDeadChar(0, 0), (byte) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 496403552, Drawable.resolveOpacity(0, 0) - 802037272, (-35) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i2 = IAuthTabCallbackDefault + 105;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(str, "PUT") && (!Intrinsics.areEqual(str, "PATCH")) && !Intrinsics.areEqual(str, "PROPPATCH")) {
                int i4 = IAuthTabCallbackDefault + 17;
                asInterface = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    Intrinsics.areEqual(str, "QUERY");
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(str, "QUERY") && (!Intrinsics.areEqual(str, "REPORT"))) {
                    int i5 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
                    asInterface = i5 % 128;
                    if (i5 % 2 != 0) {
                        return false;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        r10 = okhttp3.internal.http.HttpMethod.asInterface + 5;
        okhttp3.internal.http.HttpMethod.IAuthTabCallbackDefault = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if ((r10 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r10 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (r10 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (r10 == false) goto L10;
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean permitsRequestBody(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), 496403555 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.getSize(0) - 802037281, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 36, objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i2 = IAuthTabCallbackDefault + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = Intrinsics.areEqual(str, "HEAD");
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
        }
        return false;
    }

    public final boolean redirectsWithBody(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zAreEqual = Intrinsics.areEqual(str, "PROPFIND");
        int i4 = IAuthTabCallbackDefault + 51;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return zAreEqual;
    }

    public final boolean redirectsToGet(@NotNull String str) {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            zAreEqual = Intrinsics.areEqual(str, "PROPFIND");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            zAreEqual = !Intrinsics.areEqual(str, "PROPFIND");
        }
        int i3 = asInterface + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return zAreEqual;
    }

    public final boolean isCacheable(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) Gravity.getAbsoluteGravity(0, 0), 496403555 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (-802037281) - View.MeasureSpec.makeMeasureSpec(0, 0), (-36) - View.MeasureSpec.getSize(0), objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i4 = IAuthTabCallbackDefault + 41;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(str, "QUERY")) {
                int i6 = IAuthTabCallbackDefault + 85;
                asInterface = i6 % 128;
                return !(i6 % 2 != 0);
            }
        }
        return true;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43425), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, Color.green(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i6 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int i7 = $10 + 57;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 12843);
                            int longPressTimeout = 55 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 2166;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, longPressTimeout, i8, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr[i4] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i4++;
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43424), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), Color.blue(0) + 86, 9567 - ExpandableListView.getPackedPositionType(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i10 = $10 + 65;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i12 = $11 + 87;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i13 = $11 + 111;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
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
        onNavigationEvent = 1177461655;
        onExtraCallbackWithResult = -1538795473;
        IAuthTabCallback = -1953905056;
        onExtraCallback = new byte[]{9, 12, -9, 7, -10, 8, 8};
    }
}
