package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes.dex */
public class createDataSource {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onWarmupCompleted;
    private static final int $$b = 123;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact = 0;
    private static int onNavigationEvent = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.createDataSource.$$a
            int r6 = r6 * 46
            int r6 = 49 - r6
            int r8 = r8 * 38
            int r8 = 111 - r8
            int r7 = r7 * 31
            int r1 = r7 + 16
            byte[] r1 = new byte[r1]
            int r7 = r7 + 15
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L33
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L33:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-6)
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createDataSource.a(short, short, int, java.lang.Object[]):void");
    }

    public static native long read(String str);

    static {
        byte[] bArr = {107, -21, -54, -113, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        IAuthTabCallbackDefault = 1;
        IAuthTabCallback();
        onExtraCallback();
        byte b = (byte) (123 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onTransact + 17;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
                throw new NullPointerException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static int onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            onNavigationEvent(new int[]{-1214587924, -1188576659, 1153901134, -287360963, 1692758861, -102164396, -871763960, -750926421, 1131555122, 695755126, 1693707705, -909448856, 2067885334, 986919678}, ExpandableListView.getPackedPositionChild(0L) + 27, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            onNavigationEvent(new int[]{-774106133, -1219455907, -119876705, -385048497, -462120181, -1239827501, -1643907556, -1028763224, 1709407413, -1888765073}, TextUtils.lastIndexOf("", '0', 0) + 19, objArr2);
            Object objInvoke = cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = asBinder;
            int i3 = i2 + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr3 = new Object[1];
                onExtraCallbackWithResult("嵏芄ʂ⍣", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getTrimmedLength("") - 2105375651, "\u0000\u0000\u0000\u0000", "⼿ο擏흚駃괦\udcafⵁ䴩揪쒶☡㴘ӷ耙⻰饥\ue786ꊷ抯껓\uefe6Ვ", objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                onExtraCallbackWithResult("읃顉糇揎", (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 52860), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", "惶\ue92a늵崤⓫햛癲菭晹㒲훣皡↪ᇚ귅柳榋犚춴ᖢ䶢챀섁얤簉滄ࣛ\udb77", objArr4);
                return ((Integer) cls2.getMethod((String) objArr4[0], String.class).invoke(objInvoke, str)).intValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void onExtraCallbackWithResult(String str, char c, int i, String str2, String str3, Object[] objArr) {
        char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i2 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i3 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr[i3] ^ charArray[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (onWarmupCompleted ^ 5161337353776785399L)) ^ ((int) (IAuthTabCallback ^ 5161337353776785399L))) ^ ((char) (onExtraCallbackWithResult ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr3);
    }

    private static void onNavigationEvent(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        int i3 = 1;
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = onExtraCallback;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr3[i5] = (int) (iArr2[i5] ^ (-2238453702121083934L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i6 = IAuthTabCallbackStub + 15;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                iArr6[i8] = (int) (iArr5[i8] ^ (-2238453702121083934L));
                i8++;
                int i9 = IAuthTabCallbackStub + 77;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                iArr4 = iArr4;
                i3 = 1;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i4, iArr4, i4, length2);
        utilExternalSyntheticLambda3.onExtraCallback = i4;
        while (utilExternalSyntheticLambda3.onExtraCallback < iArr.length) {
            cArr[i4] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback] >> 16);
            cArr[i3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback + i3] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback + i3];
            utilExternalSyntheticLambda3.IAuthTabCallback = (cArr[i4] << 16) + cArr[i3];
            utilExternalSyntheticLambda3.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            int i11 = IAuthTabCallbackStub + 125;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = i4; i13 < 16; i13++) {
                utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[i13];
                utilExternalSyntheticLambda3.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda3.IAuthTabCallback) ^ utilExternalSyntheticLambda3.onNavigationEvent;
                int i14 = utilExternalSyntheticLambda3.IAuthTabCallback;
                utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                utilExternalSyntheticLambda3.onNavigationEvent = i14;
            }
            int i15 = utilExternalSyntheticLambda3.IAuthTabCallback;
            utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
            utilExternalSyntheticLambda3.onNavigationEvent = i15;
            utilExternalSyntheticLambda3.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[17];
            int i16 = utilExternalSyntheticLambda3.IAuthTabCallback;
            int i17 = utilExternalSyntheticLambda3.onNavigationEvent;
            cArr[i4] = (char) (utilExternalSyntheticLambda3.IAuthTabCallback >>> 16);
            cArr[i3] = (char) utilExternalSyntheticLambda3.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda3.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda3.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda3.onExtraCallback << i3] = cArr[i4];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i3) + i3] = cArr[i3];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i3) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << i3) + 3] = cArr[3];
            utilExternalSyntheticLambda3.onExtraCallback += 2;
        }
        String str = new String(cArr2, i4, i);
        int i18 = asInterface + 15;
        IAuthTabCallbackStub = i18 % 128;
        if (i18 % 2 != 0) {
            throw new NullPointerException();
        }
        objArr[i4] = str;
    }

    static void onExtraCallback() {
        onExtraCallback = new int[]{1622390523, 734491063, -452398330, 405111687, 487169727, 1293931358, -1628085188, 1068502858, 2123012172, -980275451, -988046204, 155497891, 1675545918, 1015797151, -441399867, -1018583012, -999824547, 1014863648};
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 5161337353776785399L;
        IAuthTabCallback = 404893997;
        onExtraCallbackWithResult = (char) 59383;
    }
}
