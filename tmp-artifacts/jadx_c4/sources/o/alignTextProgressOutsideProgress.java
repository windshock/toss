package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class alignTextProgressOutsideProgress {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ alignTextProgressOutsideProgress[] $VALUES;
    private static int IAuthTabCallback;
    public static final alignTextProgressOutsideProgress LTE;
    public static final alignTextProgressOutsideProgress TYPE_2G;
    public static final alignTextProgressOutsideProgress TYPE_3G;
    public static final alignTextProgressOutsideProgress TYPE_5G;
    public static final alignTextProgressOutsideProgress UNKNOWN;
    private static int asBinder;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {41, -64, -63, -4};
    private static final int $$b = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = b * 3;
        byte[] bArr = $$a;
        int i3 = 4 - (b2 * 2);
        int i4 = (s * 4) + 115;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            int i7 = i2;
            i4 = (-i4) + i7;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i3];
            int i8 = i3;
            i7 = i4;
            i4 = b3;
            i6 = i + 1;
            i5 = i8;
            i4 = (-i4) + i7;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    private static final /* synthetic */ alignTextProgressOutsideProgress[] $values() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        alignTextProgressOutsideProgress[] aligntextprogressoutsideprogressArr = {TYPE_2G, TYPE_3G, LTE, TYPE_5G, UNKNOWN};
        int i5 = i2 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return aligntextprogressoutsideprogressArr;
        }
        throw null;
    }

    public static EnumEntries<alignTextProgressOutsideProgress> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<alignTextProgressOutsideProgress> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return enumEntries;
    }

    public static alignTextProgressOutsideProgress valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        alignTextProgressOutsideProgress aligntextprogressoutsideprogress = (alignTextProgressOutsideProgress) Enum.valueOf(alignTextProgressOutsideProgress.class, str);
        int i4 = asInterface + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aligntextprogressoutsideprogress;
    }

    public static alignTextProgressOutsideProgress[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        alignTextProgressOutsideProgress[] aligntextprogressoutsideprogressArr = (alignTextProgressOutsideProgress[]) $VALUES.clone();
        int i4 = IAuthTabCallbackDefault + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return aligntextprogressoutsideprogressArr;
    }

    private alignTextProgressOutsideProgress(String str, int i) {
    }

    static {
        asBinder = 1;
        onExtraCallbackWithResult();
        TYPE_2G = new alignTextProgressOutsideProgress("TYPE_2G", 0);
        TYPE_3G = new alignTextProgressOutsideProgress("TYPE_3G", 1);
        LTE = new alignTextProgressOutsideProgress("LTE", 2);
        TYPE_5G = new alignTextProgressOutsideProgress("TYPE_5G", 3);
        Object[] objArr = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 17), 1421477552 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-747144728) + (ViewConfiguration.getTouchSlop() >> 8), (-102) - TextUtils.getCapsMode("", 0, 0), objArr);
        UNKNOWN = new alignTextProgressOutsideProgress(((String) objArr[0]).intern(), 4);
        alignTextProgressOutsideProgress[] aligntextprogressoutsideprogressArr$values = $values();
        $VALUES = aligntextprogressoutsideprogressArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aligntextprogressoutsideprogressArr$values);
        int i = onTransact + 33;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), 42 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54, (ViewConfiguration.getEdgeSlop() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, (ViewConfiguration.getEdgeSlop() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 86, 9567 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i10 = $11 + 91;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
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

    static void onExtraCallbackWithResult() {
        onExtraCallback = 251797849;
        IAuthTabCallback = -1538795411;
        onWarmupCompleted = -1999675803;
        onNavigationEvent = new byte[]{-86, -18, 17, 24, 26, -28, -32};
    }
}
