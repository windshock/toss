package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya151 extends getLoadingProgressBar {
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final int[][] onNavigationEvent;
    private static final byte[] $$a = {CVCAFile.CAR_TAG, ISO7816.INS_PSO, ISO7816.INS_MANAGE_CHANNEL, 97};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = s * 2;
        int i5 = 3 - (i * 2);
        int i6 = (i2 * 2) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i6 = (-i6) + i7;
            i3 = i8;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i9 = i3 + 1;
            i7 = i6;
            i6 = bArr[i5];
            i8 = i9;
            i6 = (-i6) + i7;
            i3 = i8;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static {
        int i = 0;
        onExtraCallback = 0;
        IAuthTabCallback = 1;
        onExtraCallback();
        onNavigationEvent = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 2);
        int[] iArr = {8, 10, 16};
        while (i < 3) {
            int i2 = iArr[i];
            onNavigationEvent[i2] = new int[]{onExtraCallbackWithResult(Integer.MAX_VALUE, i2), onNavigationEvent(Long.MAX_VALUE, i2)};
            i++;
            int i3 = onExtraCallback + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        int i6 = IAuthTabCallback + 47;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int length = Integer.toString(i, i2).length();
        if (i5 == 0) {
            int i6 = 93 / 0;
        }
        int i7 = IAuthTabCallbackDefault + 83;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 8 / 0;
        }
        return length;
    }

    private static int onNavigationEvent(long j, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int length = Long.toString(j, i).length();
        int i5 = asBinder + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return length;
        }
        throw null;
    }

    protected static Number IAuthTabCallback(String str, int i) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        IAuthTabCallbackDefault = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                Long lValueOf = Long.valueOf(str, i);
                int i4 = asBinder + 103;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return lValueOf;
                }
                throw null;
            }
            Long.valueOf(str, i);
            throw null;
        } catch (NumberFormatException unused) {
            return new BigInteger(str, i);
        }
    }

    @Override // o.setAdCreativeClickListener
    public Object onExtraCallbackWithResult(uh2 uh2Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(uh2Var);
        if (!strOnExtraCallback.isEmpty()) {
            int i4 = IAuthTabCallbackDefault + 27;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return onNavigationEvent(strOnExtraCallback);
            }
            onNavigationEvent(strOnExtraCallback);
            throw null;
        }
        throw new sya9("while constructing an int", uh2Var.onNavigationEvent(), "found empty value", uh2Var.onNavigationEvent());
    }

    public Object onNavigationEvent(String str) throws Throwable {
        int i;
        String strSubstring;
        int i2 = 2 % 2;
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            str = str.substring(1);
            i = -1;
        } else {
            if (cCharAt == '+') {
                int i3 = asBinder + 111;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                str = str.substring(1);
            }
            i = 1;
        }
        int i5 = 16;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, (ViewConfiguration.getTapTimeout() >> 16) + 1, new char[]{0}, true, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + ISO7816.TAG_SM_ENCRYPTED_DATA_WITH_PADDING_INDICATOR, objArr);
        if (!((String) objArr[0]).intern().equals(str)) {
            if (str.startsWith("0x")) {
                strSubstring = str.substring(2);
            } else if (!(!str.startsWith("0o"))) {
                strSubstring = str.substring(2);
                i5 = 8;
            } else {
                return onExtraCallback(i, str, 10);
            }
            return onExtraCallback(i, strSubstring, i5);
        }
        int i6 = IAuthTabCallbackDefault + 15;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    private Number onExtraCallback(int i, String str, int i2) {
        int length;
        int i3 = 2 % 2;
        if (str != null) {
            length = str.length();
            int i4 = asBinder + 101;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            length = 0;
        }
        if (i < 0) {
            str = "-" + str;
        }
        int[][] iArr = onNavigationEvent;
        int[] iArr2 = null;
        if (i2 < iArr.length) {
            int i6 = IAuthTabCallbackDefault + 35;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int[] iArr3 = iArr[i2];
                iArr2.hashCode();
                throw null;
            }
            iArr2 = iArr[i2];
        }
        if (iArr2 == null || length <= iArr2[0]) {
            try {
                return Integer.valueOf(str, i2);
            } catch (NumberFormatException unused) {
                return IAuthTabCallback(str, i2);
            }
        }
        int i7 = IAuthTabCallbackDefault + 119;
        asBinder = i7 % 128;
        return (i7 % 2 == 0 ? length <= iArr2[1] : length <= iArr2[1]) ? IAuthTabCallback(str, i2) : new BigInteger(str, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $11 + 53;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35124), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, 10277 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 12844), 55 - ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 113;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $10 + 65;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 / 2;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), 55 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf(BuildConfig.FLAVOR, c) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = '0';
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i13 = $11 + 41;
        $10 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 478308991;
    }
}
