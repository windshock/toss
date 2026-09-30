package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getUserFileSize$onExtraCallbackWithResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getUserFileSize$onExtraCallbackWithResult[] $VALUES;
    public static final getUserFileSize$onExtraCallbackWithResult ALL_FAIL;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final getUserFileSize$onExtraCallbackWithResult IN_PROCESS;
    public static final getUserFileSize$onExtraCallbackWithResult PARTIAL_FAIL;
    public static final getUserFileSize$onExtraCallbackWithResult SUCCESS;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {35, -11, -97, -73};
    private static final int $$b = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        int i4 = (i * 3) + 1;
        byte[] bArr = $$a;
        int i5 = 115 - (s * 4);
        int i6 = b + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = i6 + i7;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            int i11 = i6 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i11];
            int i12 = i5;
            i8 = i11;
            i6 = i12;
            int i92 = i6 + i7;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            int i112 = i6 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i1122 = i6 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    private static final /* synthetic */ getUserFileSize$onExtraCallbackWithResult[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getUserFileSize$onExtraCallbackWithResult[] getuserfilesize_onextracallbackwithresultArr = {SUCCESS, ALL_FAIL, PARTIAL_FAIL, IN_PROCESS};
        int i5 = i2 + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return getuserfilesize_onextracallbackwithresultArr;
    }

    public static EnumEntries<getUserFileSize$onExtraCallbackWithResult> getEntries() {
        EnumEntries<getUserFileSize$onExtraCallbackWithResult> enumEntries;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 38 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 39;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getUserFileSize$onExtraCallbackWithResult valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getUserFileSize$onExtraCallbackWithResult getuserfilesize_onextracallbackwithresult = (getUserFileSize$onExtraCallbackWithResult) Enum.valueOf(getUserFileSize$onExtraCallbackWithResult.class, str);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = IAuthTabCallbackStub + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return getuserfilesize_onextracallbackwithresult;
    }

    public static getUserFileSize$onExtraCallbackWithResult[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getUserFileSize$onExtraCallbackWithResult[] getuserfilesize_onextracallbackwithresultArr = (getUserFileSize$onExtraCallbackWithResult[]) $VALUES.clone();
        int i4 = asBinder + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return getuserfilesize_onextracallbackwithresultArr;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        boolean z;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.blue(0)), 42 - View.MeasureSpec.getSize(0), View.combineMeasuredStates(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) ($$b - 2);
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0)), 55 - TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2166, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $10 + 55;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString("")), 42 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9566 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i12 = $10;
                    int i13 = i12 + 119;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 + 11;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
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
            String string = sb.toString();
            int i17 = $11 + 83;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private getUserFileSize$onExtraCallbackWithResult(String str, int i) {
    }

    static {
        IAuthTabCallbackDefault = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a((short) (38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) ((-37) - (ViewConfiguration.getScrollBarSize() >> 8)), 945719041 - MotionEvent.axisFromString(""), 1212299398 + (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) - 68, objArr);
        SUCCESS = new getUserFileSize$onExtraCallbackWithResult(((String) objArr[0]).intern(), 0);
        ALL_FAIL = new getUserFileSize$onExtraCallbackWithResult("ALL_FAIL", 1);
        PARTIAL_FAIL = new getUserFileSize$onExtraCallbackWithResult("PARTIAL_FAIL", 2);
        IN_PROCESS = new getUserFileSize$onExtraCallbackWithResult("IN_PROCESS", 3);
        getUserFileSize$onExtraCallbackWithResult[] getuserfilesize_onextracallbackwithresultArr$values = $values();
        $VALUES = getuserfilesize_onextracallbackwithresultArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getuserfilesize_onextracallbackwithresultArr$values);
        int i = asInterface + 39;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 1676058870;
        onNavigationEvent = -1538795445;
        onWarmupCompleted = 335159237;
        onExtraCallback = new byte[]{-52, -66, -72, -68, -66, 24, -68};
    }
}
