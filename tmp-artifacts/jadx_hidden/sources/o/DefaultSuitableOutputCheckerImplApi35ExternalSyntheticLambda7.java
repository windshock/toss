package o;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda7 {
    private static char[] IAuthTabCallback = null;
    private static boolean IAuthTabCallbackDefault = false;
    private static int[] IAuthTabCallbackStub = null;
    private static int access000 = 1;
    private static boolean asBinder = false;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 0;
    private static long onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0606 A[LOOP:0: B:52:0x03fe->B:106:0x0606, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b13 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b08 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x052b A[Catch: Exception -> 0x05fe, TryCatch #5 {Exception -> 0x05fe, blocks: (B:67:0x0514, B:69:0x051a, B:70:0x051b, B:78:0x0525, B:80:0x052b, B:81:0x052c, B:93:0x05e9, B:95:0x05ef, B:96:0x05f0, B:98:0x05f2, B:100:0x05f8, B:101:0x05f9, B:83:0x052e, B:85:0x0538, B:86:0x0539, B:90:0x057a, B:58:0x040d, B:88:0x0548, B:64:0x048f), top: B:195:0x057a, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x052c A[Catch: Exception -> 0x05fe, TryCatch #5 {Exception -> 0x05fe, blocks: (B:67:0x0514, B:69:0x051a, B:70:0x051b, B:78:0x0525, B:80:0x052b, B:81:0x052c, B:93:0x05e9, B:95:0x05ef, B:96:0x05f0, B:98:0x05f2, B:100:0x05f8, B:101:0x05f9, B:83:0x052e, B:85:0x0538, B:86:0x0539, B:90:0x057a, B:58:0x040d, B:88:0x0548, B:64:0x048f), top: B:195:0x057a, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v90, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v121 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v95 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int onExtraCallbackWithResult(java.util.List<java.lang.String> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda7.onExtraCallbackWithResult(java.util.List):int");
    }

    private static void onNavigationEvent(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 55;
        access000 = i3 % 128;
        char[] charArray = str;
        if (i3 % 2 == 0) {
            throw new ArithmeticException();
        }
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda4 utilExternalSyntheticLambda4 = new UtilExternalSyntheticLambda4();
        utilExternalSyntheticLambda4.onExtraCallbackWithResult = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        int i4 = access000 + 9;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            int i6 = access000 + 115;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            jArr[utilExternalSyntheticLambda4.IAuthTabCallback] = (cArr[utilExternalSyntheticLambda4.IAuthTabCallback] ^ (utilExternalSyntheticLambda4.IAuthTabCallback * utilExternalSyntheticLambda4.onExtraCallbackWithResult)) ^ (onExtraCallback - (-916733648318839497L));
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        char[] cArr2 = new char[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            cArr2[utilExternalSyntheticLambda4.IAuthTabCallback] = (char) jArr[utilExternalSyntheticLambda4.IAuthTabCallback];
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        String str2 = new String(cArr2);
        int i8 = getInterfaceDescriptor + 71;
        access000 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str2;
    }

    private static void onExtraCallbackWithResult(int[] iArr, int i, Object[] objArr) {
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = IAuthTabCallbackStub;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-2238453702121083934L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-2238453702121083934L));
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        utilExternalSyntheticLambda3.onExtraCallback = 0;
        while (utilExternalSyntheticLambda3.onExtraCallback < iArr.length) {
            cArr[0] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback] >> 16);
            cArr[1] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback + 1] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback + 1];
            utilExternalSyntheticLambda3.IAuthTabCallback = (cArr[0] << 16) + cArr[1];
            utilExternalSyntheticLambda3.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[i4];
                utilExternalSyntheticLambda3.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda3.IAuthTabCallback) ^ utilExternalSyntheticLambda3.onNavigationEvent;
                int i5 = utilExternalSyntheticLambda3.IAuthTabCallback;
                utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                utilExternalSyntheticLambda3.onNavigationEvent = i5;
            }
            int i6 = utilExternalSyntheticLambda3.IAuthTabCallback;
            utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
            utilExternalSyntheticLambda3.onNavigationEvent = i6;
            utilExternalSyntheticLambda3.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[17];
            int i7 = utilExternalSyntheticLambda3.IAuthTabCallback;
            int i8 = utilExternalSyntheticLambda3.onNavigationEvent;
            cArr[0] = (char) (utilExternalSyntheticLambda3.IAuthTabCallback >>> 16);
            cArr[1] = (char) utilExternalSyntheticLambda3.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda3.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda3.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda3.onExtraCallback << 1] = cArr[0];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 1] = cArr[1];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 3] = cArr[3];
            utilExternalSyntheticLambda3.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void onNavigationEvent(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        ListenerSetExternalSyntheticLambda0 listenerSetExternalSyntheticLambda0 = new ListenerSetExternalSyntheticLambda0();
        long[] jArr = new long[i2];
        listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
            int i4 = listenerSetExternalSyntheticLambda0.IAuthTabCallback;
            int i5 = IAuthTabCallback[i + i4] & 65535;
            long j = onExtraCallbackWithResult;
            jArr[i4] = (((char) ((i5 << 13) | (i5 >>> 3))) ^ (i4 * ((j << 45) | (j >>> 19)))) ^ c;
            listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
        }
        char[] cArr = new char[i2];
        while (true) {
            listenerSetExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (listenerSetExternalSyntheticLambda0.IAuthTabCallback < i2) {
                int i6 = access000 + 11;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback];
                    listenerSetExternalSyntheticLambda0.IAuthTabCallback++;
                }
            }
            String str = new String(cArr);
            int i7 = getInterfaceDescriptor + 39;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
            return;
            cArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[listenerSetExternalSyntheticLambda0.IAuthTabCallback];
            int i9 = listenerSetExternalSyntheticLambda0.IAuthTabCallback;
        }
    }

    private static void onExtraCallbackWithResult(int i, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda1 utilExternalSyntheticLambda1 = new UtilExternalSyntheticLambda1();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (cArr2[i2] - 3038365681431118716L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (onWarmupCompleted - 3038365681431118716L);
        if (asBinder) {
            utilExternalSyntheticLambda1.onNavigationEvent = bArr.length;
            char[] cArr4 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr4[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[bArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] + i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallbackDefault) {
            utilExternalSyntheticLambda1.onNavigationEvent = cArr.length;
            char[] cArr5 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                cArr5[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[cArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
                utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        utilExternalSyntheticLambda1.onNavigationEvent = iArr.length;
        char[] cArr6 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
        utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
        while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
            cArr6[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[iArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i3);
            utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onWarmupCompleted();
        onExtraCallback = -4880525189906196352L;
        IAuthTabCallback = new char[]{776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37507, 11, 30418, 58377, 23241, 51256, 15960, 44207, 8575, 38742, 1846, 31437, 59420, 24204, 52283, 17139, 45386, 10074, 38185, 2889, 31008, 61239, 23951, 54270, 23399, 10552, 48905, 3481, 37778, 24962, 63371, 18427, 51948, 22628, 11965, 48230, 678, 36951, 26167, 62656, 30992, 53049, 24409, 8770, 45211, 1643, 38020, 6684, 59677, 32613, 52622, 776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37507, 11, 30418, 58377, 23241, 51256, 15960, 44207, 8575, 38742, 1846, 31477, 59564, 24108, 52331, 17099, 45466, 10114, 38329, 2857, 31216, 61247, 23911, 54254, 18022, 46149, 10941, 39140, 3724, 31931, 62106, 24810, 55097, 17673, 48088, 9622, 22473, 49656, 29544, 60771, 8051, 35194, 14602, 46109, 9877, 20556, 49815, 31831, 61094, 6342, 35377, 2017, 45512, 8616, 23739, 52818, 30746, 60021, 25733, 38884, 268, 46071, 11631, 24446, 51505, 31633, 62848, 24608, 37619, 3243, 48858, 10338, 23173, 54468, 776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37507, 11, 30418, 58377, 23241, 51256, 15960, 44207, 8575, 38742, 1846, 31461, 59644, 24124, 52323, 16923, 45426, 10074, 38369, 2857, 31152, 61423, 24031, 54254, 18086, 46189, 10813, 38932, 3612, 776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37507, 11, 30418, 58377, 23241, 51256, 15960, 44207, 8575, 38742, 1846, 31317, 59644, 24116, 52459, 17115, 45458, 10074, 38377, 2833, 31136, 61279, 23903, 54222, 18070, 46229, 10765, 39036, 3756, 776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37451, 'S', 30434, 58441, 23281, 51200, 15536, 44271, 8479, 38790, 1294, 31517, 59892, 24020, 52387, 17051, 45338, 10026, 38177, 2889, 31096, 61375, 23943, 54254, 18038, 46109, 10861, 38980, 28654, 7601, 35712, 14608, 42779, 21771, 49922, 29554, 65197, 27829, 6660, 34991, 13847, 42214, 20566, 49161, 19961, 64352, 27112, 6139, 34066, 12594, 41101, 11853, 56772, 19260, 63799, 26543, 5390, 33593, 12689, 48936, 10944, 776, 29015, 59238, 22006, 52221, 14829, 45028, 8084, 37507, 11, 30418, 58377, 23241, 51256, 15960, 44207, 8575, 38742, 1846, 31349, 59596, 24276, 52451, 16923, 45394, 10074, 38225, 2969, 31000, 61327, 23895, 54102, 17998, 46141, 10861, 5536, 26599, 61846, 16814, 56581, 12133, 47364, 2916, 34011, 5811, 25226, 62017, 19505, 56872, 10320, 47687, 14231, 33262, 4958, 28149, 65452};
        onExtraCallbackWithResult = 8452698392963943616L;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{33849, 33862, 33852, 33866, 33863, 33857, 33798, 33851, 33868, 33853, 33819, 33872, 33855, 33832, 33859, 33829, 33854, 33864, 33861, 33867, 33824, 33860, 33788, 33834, 33870, 33825, 33822, 33865, 33869, 33873, 33818, 33817, 33835};
        onWarmupCompleted = 1131447256;
        IAuthTabCallbackDefault = true;
        asBinder = true;
        IAuthTabCallbackStub = new int[]{457458057, -701422142, -1930713750, -103417411, 716372158, -242351552, -115984789, 754126968, -1472642026, 908935489, -83015132, 1760476862, -2016619796, -1820143936, 518737659, 1974979975, -1331528429, -1228051603};
    }
}
