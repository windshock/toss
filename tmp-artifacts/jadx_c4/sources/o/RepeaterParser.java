package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RepeaterParser {
    private static final /* synthetic */ RepeaterParser[] $VALUES;
    public static final RepeaterParser AES;
    private static int IAuthTabCallback;
    public static final RepeaterParser RSA;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = s * 4;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 115;
        int i5 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = i5 + (-i6);
            i5 = i7;
            i4 = i8;
            bArr2[i2] = (byte) i4;
            int i9 = i5 + 1;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i9];
            i5 = i4;
            i7 = i9;
            int i82 = i5 + (-i6);
            i5 = i7;
            i4 = i82;
            bArr2[i2] = (byte) i4;
            int i92 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i922 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    private static /* synthetic */ RepeaterParser[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        RepeaterParser[] repeaterParserArr = {AES, RSA};
        int i5 = i2 + 121;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return repeaterParserArr;
        }
        throw null;
    }

    private RepeaterParser(String str, int i) {
    }

    public static RepeaterParser valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RepeaterParser repeaterParser = (RepeaterParser) Enum.valueOf(RepeaterParser.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return repeaterParser;
    }

    public static RepeaterParser[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RepeaterParser[] repeaterParserArr = (RepeaterParser[]) $VALUES.clone();
        int i3 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return repeaterParserArr;
        }
        throw null;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionType(0L) - 37), (-1772724168) - View.resolveSize(0, 0), 506264037 - View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 50, objArr);
        AES = new RepeaterParser(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (44 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 24587 + AndroidCharacter.getMirror('0'), 506264055 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-51) - View.getDefaultSize(0, 0), objArr2);
        RSA = new RepeaterParser(((String) objArr2[0]).intern(), 1);
        $VALUES = $values();
        int i = asInterface + 101;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0 A[PHI: r0
      0x01a0: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:38:0x019e, B:35:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2 A[PHI: r0
      0x01a2: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:38:0x019e, B:35:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 43424), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, 22440 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 43;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 12843), 55 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 22439 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 57;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = ((i - iIntValue) / 3) >>> ((int) (IAuthTabCallback / (-4629411779493505016L)));
                    i5 = z ? 1 : 0;
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 86, (Process.myTid() >> 22) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i11 = $11 + 107;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 3 % 2;
                        }
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z2) {
                            short[] sArr = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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
        IAuthTabCallback = -840022080;
        onWarmupCompleted = -1538795462;
        onExtraCallback = 1167384148;
        onExtraCallbackWithResult = new byte[]{-39, -35, -41, -39, -51, 34};
    }
}
