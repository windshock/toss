package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TopLayoutDislike27 {
    private static int IAuthTabCallback(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    TopLayoutDislike27() {
    }

    private static void IAuthTabCallback(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    private static int IAuthTabCallback(int[] iArr, int i, int i2) {
        int i3;
        int i4 = 1 << (i - i2);
        while (i < 15 && (i3 = i4 - iArr[i]) > 0) {
            i++;
            i4 = i3 << 1;
        }
        return i - i2;
    }

    static void onNavigationEvent(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr2[i5];
            iArr4[i6] = iArr4[i6] + 1;
        }
        iArr5[1] = 0;
        int i7 = 1;
        while (i7 < 15) {
            int i8 = i7 + 1;
            iArr5[i8] = iArr5[i7] + iArr4[i7];
            i7 = i8;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = iArr2[i9];
            if (i10 != 0) {
                int i11 = iArr5[i10];
                iArr5[i10] = i11 + 1;
                iArr3[i11] = i9;
            }
        }
        int i12 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i + i13] = iArr3[0];
            }
            return;
        }
        int i14 = 2;
        int i15 = 2;
        int iIAuthTabCallback = 0;
        int i16 = 1;
        while (i16 <= i2) {
            while (iArr4[i16] > 0) {
                IAuthTabCallback(iArr, i + iIAuthTabCallback, i15, i12, iArr3[i4] | (i16 << 16));
                iIAuthTabCallback = IAuthTabCallback(iIAuthTabCallback, i16);
                iArr4[i16] = iArr4[i16] - 1;
                i4++;
            }
            i16++;
            i15 <<= 1;
        }
        int i17 = i2 + 1;
        int i18 = -1;
        int i19 = i;
        int i20 = i12;
        while (i17 <= 15) {
            while (iArr4[i17] > 0) {
                int i21 = (i12 - 1) & iIAuthTabCallback;
                if (i21 != i18) {
                    i19 += i20;
                    int iIAuthTabCallback2 = IAuthTabCallback(iArr4, i17, i2);
                    iArr[i + i21] = ((iIAuthTabCallback2 + i2) << 16) | ((i19 - i) - i21);
                    i20 = 1 << iIAuthTabCallback2;
                    i18 = i21;
                }
                IAuthTabCallback(iArr, (iIAuthTabCallback >> i2) + i19, i14, i20, ((i17 - i2) << 16) | iArr3[i4]);
                iIAuthTabCallback = IAuthTabCallback(iIAuthTabCallback, i17);
                iArr4[i17] = iArr4[i17] - 1;
                i4++;
            }
            i17++;
            i14 <<= 1;
        }
    }
}
