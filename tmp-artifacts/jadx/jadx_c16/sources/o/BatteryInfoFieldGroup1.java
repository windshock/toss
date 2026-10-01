package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BatteryInfoFieldGroup1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BatteryInfoFieldGroup1[] $VALUES;
    public static final BatteryInfoFieldGroup1 ALLOWED;
    public static final BatteryInfoFieldGroup1 DENIED;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final BatteryInfoFieldGroup1 UNKNOWN;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {77, -67, -125, 9};
    private static final int $$b = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 4) + 1;
        int i5 = 115 - (s * 3);
        int i6 = (b * 4) + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = i6 + i7;
            i2 = i3;
            i6 = i8 + 1;
            i5 = i9;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            int i10 = i6;
            i6 = i5;
            i8 = i10;
            int i92 = i6 + i7;
            i2 = i3;
            i6 = i8 + 1;
            i5 = i92;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    private static final /* synthetic */ BatteryInfoFieldGroup1[] $values() {
        BatteryInfoFieldGroup1[] batteryInfoFieldGroup1Arr;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            BatteryInfoFieldGroup1 batteryInfoFieldGroup1 = ALLOWED;
            BatteryInfoFieldGroup1 batteryInfoFieldGroup12 = DENIED;
            BatteryInfoFieldGroup1 batteryInfoFieldGroup13 = UNKNOWN;
            batteryInfoFieldGroup1Arr = new BatteryInfoFieldGroup1[3];
            batteryInfoFieldGroup1Arr[0] = batteryInfoFieldGroup1;
            batteryInfoFieldGroup1Arr[1] = batteryInfoFieldGroup12;
            batteryInfoFieldGroup1Arr[5] = batteryInfoFieldGroup13;
        } else {
            batteryInfoFieldGroup1Arr = new BatteryInfoFieldGroup1[]{ALLOWED, DENIED, UNKNOWN};
        }
        int i4 = i2 + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return batteryInfoFieldGroup1Arr;
    }

    public static EnumEntries<BatteryInfoFieldGroup1> getEntries() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<BatteryInfoFieldGroup1> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return enumEntries;
    }

    public static BatteryInfoFieldGroup1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BatteryInfoFieldGroup1 batteryInfoFieldGroup1 = (BatteryInfoFieldGroup1) Enum.valueOf(BatteryInfoFieldGroup1.class, str);
        int i4 = onTransact + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return batteryInfoFieldGroup1;
    }

    public static BatteryInfoFieldGroup1[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BatteryInfoFieldGroup1[] batteryInfoFieldGroup1Arr = (BatteryInfoFieldGroup1[]) $VALUES.clone();
        int i4 = onTransact + 9;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return batteryInfoFieldGroup1Arr;
    }

    private BatteryInfoFieldGroup1(String str, int i) {
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        ALLOWED = new BatteryInfoFieldGroup1("ALLOWED", 0);
        Object[] objArr = new Object[1];
        a((short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 28), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) - 14250938, 779377455 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 25, objArr);
        DENIED = new BatteryInfoFieldGroup1(((String) objArr[0]).intern(), 1);
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.indexOf("", "", 0, 0) - 35), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-14250932) - TextUtils.getOffsetAfter("", 0), 779377472 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) - 24, objArr2);
        UNKNOWN = new BatteryInfoFieldGroup1(((String) objArr2[0]).intern(), 2);
        BatteryInfoFieldGroup1[] batteryInfoFieldGroup1Arr$values = $values();
        $VALUES = batteryInfoFieldGroup1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(batteryInfoFieldGroup1Arr$values);
        int i = asBinder + 65;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, 22440 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 12843), 55 - (ViewConfiguration.getEdgeSlop() >> 16), Color.green(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i7 = $11 + 89;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43472 - AndroidCharacter.getMirror('0')), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getMode(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 86 - (ViewConfiguration.getTouchSlop() >> 8), 9567 - Gravity.getAbsoluteGravity(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 55;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            bArr5[i9] = (byte) (bArr4[i9] - (-4629411779493505016L));
                        } else {
                            bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                            i9++;
                        }
                    }
                    int i11 = $10 + 107;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 105;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $10 + 105;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i16 = $11 + 59;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i18 = $11 + 57;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = -1533105230;
        onWarmupCompleted = -1538795489;
        onNavigationEvent = 1976335645;
        onExtraCallbackWithResult = new byte[]{-25, 19, 16, 31, 45, 21, -8, 18, 35, 44, 46, 40, 20};
    }
}
