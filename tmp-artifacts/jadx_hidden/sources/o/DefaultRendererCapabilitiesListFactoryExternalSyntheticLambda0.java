package o;

import android.os.Process;

/* loaded from: classes.dex */
final class DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static long onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long jOnWarmupCompleted = 0;
        if (str == null) {
            int i5 = i3 + 109;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 27;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return 0L;
            }
            throw new ArithmeticException();
        }
        int i9 = ((i3 | 77) << 1) - (i3 ^ 77);
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        int i11 = 0;
        while (i11 < str.length()) {
            int i12 = onExtraCallback + 19;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            char cCharAt = str.charAt(i11);
            i11++;
            jOnWarmupCompleted = onWarmupCompleted(jOnWarmupCompleted, cCharAt);
        }
        int i14 = onExtraCallback;
        int i15 = (i14 ^ 15) + ((i14 & 15) << 1);
        onExtraCallbackWithResult = i15 % 128;
        if (i15 % 2 == 0) {
            return jOnWarmupCompleted;
        }
        throw new NullPointerException();
    }

    private static long onWarmupCompleted(long j, char c) {
        long j2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j2 = ((j << 3) % (((-134217728) * j) >>> 112)) * c;
        } else {
            j2 = ((j << 5) ^ ((j & (-134217728)) >> 27)) ^ c;
        }
        int i4 = i2 + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j2;
    }

    public static int onExtraCallback(String str, int i, int i2) {
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback;
        int i6 = 1;
        int i7 = ((i5 | 83) << 1) - (i5 ^ 83);
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        int length = str.length() - i;
        int i9 = 0;
        if (length < 0) {
            int i10 = onExtraCallback;
            int i11 = (i10 & 75) + (i10 | 75);
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return 0;
        }
        int i13 = 0;
        while (i13 <= length) {
            int i14 = onExtraCallback;
            int i15 = (i14 & 119) + (i14 | 119);
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % i3;
            int iMyPid = Process.myPid();
            int i17 = i * 50;
            int i18 = -(-(i13 * (-97)));
            int i19 = (i17 & i18) + (i17 | i18);
            int i20 = ~i13;
            int i21 = ~iMyPid;
            int i22 = ~((i20 ^ i21) | (i20 & i21));
            int i23 = ~((i20 ^ i) | (i20 & i));
            int i24 = (i19 - (~(((i22 & i23) | (i22 ^ i23)) * 98))) - i6;
            int i25 = ~i;
            int i26 = ~((i21 & i25) | (i25 ^ i21));
            int i27 = (i26 & i20) | (i20 ^ i26);
            int i28 = ~((i ^ iMyPid) | (i & iMyPid));
            int i29 = -(-(((i27 & i28) | (i27 ^ i28)) * (-49)));
            String strSubstring = str.substring(i13, (((i24 ^ i29) + ((i29 & i24) << i6)) - (~(((~((iMyPid & i20) | (i20 ^ iMyPid))) | (~(i | i13))) * 49))) - i6);
            int i30 = ExoPlayerBuilderExternalSyntheticLambda17.onExtraCallback;
            int i31 = (i30 & 43) + (i30 | 43);
            ExoPlayerBuilderExternalSyntheticLambda17.onWarmupCompleted = i31 % 128;
            int i32 = i31 % i3;
            long j = ExoPlayerBuilderExternalSyntheticLambda17.read(strSubstring, 931995);
            long j2 = 1118830492;
            long j3 = 983;
            int i33 = length;
            long j4 = -1;
            long j5 = j ^ j4;
            long j6 = ((-1965) * j2) + (984 * j) + ((j2 | j5) * j3);
            int i34 = i13;
            long j7 = j2 ^ j4;
            long jFreeMemory = ((int) Runtime.getRuntime().freeMemory()) ^ j4;
            long j8 = ((j6 + ((-983) * (j7 | ((j5 | jFreeMemory) ^ j4)))) + (j3 * ((j4 ^ (j | j7)) | ((j7 | jFreeMemory) ^ j4)))) - 1469648496;
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i35 = (((int) (j8 >> 32)) & ((((-745680838) + (((-268542017) | startElapsedRealtime) * (-381))) + (((~((~startElapsedRealtime) | (-445358147))) | 1790858671) * 381)) - 764707008)) | (((int) j8) & (1453938690 + (((~(638429915 | i25)) | (-798796495)) * 519) + (((~((-160432133) | i25)) | (~((-638364363) | i))) * (-519)) + (((~((-798796495) | i)) | (-638429916)) * 519)));
            int i36 = ExoPlayerBuilderExternalSyntheticLambda17.onExtraCallback;
            int i37 = (i36 & 95) + (i36 | 95);
            ExoPlayerBuilderExternalSyntheticLambda17.onWarmupCompleted = i37 % 128;
            int i38 = i37 % 2;
            if (i35 != i2) {
                i13 = i34 + 1;
                int i39 = onExtraCallbackWithResult;
                int i40 = (i39 ^ 43) + ((i39 & 43) << 1);
                onExtraCallback = i40 % 128;
                int i41 = i40 % 2;
                length = i33;
                i3 = 2;
                i9 = 0;
                i6 = 1;
            } else {
                int i42 = onExtraCallbackWithResult;
                int i43 = (i42 & 9) + (i42 | 9);
                onExtraCallback = i43 % 128;
                int i44 = i43 % 2;
                return 1;
            }
        }
        return i9;
    }
}
