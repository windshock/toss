package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class lt39 {
    private static final /* synthetic */ lt39[] $VALUES;
    public static final lt39 CNAME;
    public static final lt39 DELEGATION;
    public static final lt39 DNAME;
    private static int IAuthTabCallback;
    public static final lt39 NXDOMAIN;
    public static final lt39 NXRRSET;
    public static final lt39 SUCCESSFUL;
    public static final lt39 UNKNOWN;
    private static int asInterface;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean isSealed;
    private final boolean printRecords;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2 = 115 - (s2 * 3);
        byte[] bArr = $$a;
        int i3 = b * 2;
        int i4 = 3 - (s * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2 += i6;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i4++;
            i6 = bArr[i4];
            i2 += i6;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    private static /* synthetic */ lt39[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        lt39[] lt39VarArr = {UNKNOWN, NXDOMAIN, NXRRSET, DELEGATION, CNAME, DNAME, SUCCESSFUL};
        int i5 = i3 + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return lt39VarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static lt39 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        lt39 lt39Var = (lt39) Enum.valueOf(lt39.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return lt39Var;
    }

    public static lt39[] values() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        lt39[] lt39VarArr = $VALUES;
        if (i3 == 0) {
            return (lt39[]) lt39VarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private lt39(String str, int i, boolean z, boolean z2) {
        this.printRecords = z;
        this.isSealed = z2;
    }

    static {
        asInterface = 0;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) ((-22) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) ((Process.myPid() >> 22) - 46), (-1825736584) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-1118359730) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), (-14) - ExpandableListView.getPackedPositionChild(0L), objArr);
        UNKNOWN = new lt39(((String) objArr[0]).intern(), 0, false, true);
        NXDOMAIN = new lt39("NXDOMAIN", 1, false, true);
        NXRRSET = new lt39("NXRRSET", 2, false, true);
        DELEGATION = new lt39("DELEGATION", 3, true, false);
        CNAME = new lt39("CNAME", 4, true, false);
        DNAME = new lt39("DNAME", 5, true, false);
        SUCCESSFUL = new lt39("SUCCESSFUL", 6, false, false);
        $VALUES = $values();
        int i = onTransact + 31;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean isPrintRecords() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.printRecords;
        }
        throw null;
    }

    public boolean isSealed() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSealed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 16777258 + Color.rgb(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 13;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 0;
            }
            long j2 = 0;
            if (i4 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int i10 = $10 + 31;
                    int i11 = i10 % 128;
                    $11 = i11;
                    int i12 = i10 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i13 = i11 + 31;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i15])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12843);
                            int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55;
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(j2) + 2168;
                            byte b2 = (byte) ($$a[0] - 1);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, i16, packedPositionChild, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i15] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i15++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43424), 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 22439 - (Process.myTid() >> 22), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        int i17 = $10 + 21;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
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
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 85, 9566 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        int i20 = $11 + 101;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
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

    static void onExtraCallback() {
        onExtraCallback = -929734784;
        onWarmupCompleted = -1538795492;
        IAuthTabCallback = -420542194;
        onExtraCallbackWithResult = new byte[]{51, -8, -31, -17, 77, 73, 8};
    }
}
