package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda5 {

    public static final class onExtraCallbackWithResult {
        public final long[] IAuthTabCallback;
        public final long[] IAuthTabCallbackStub;
        public final long asInterface;
        public final int[] onExtraCallback;
        public final long onExtraCallbackWithResult;
        public final int[] onNavigationEvent;
        public final int onWarmupCompleted;

        private onExtraCallbackWithResult(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j, long j2) {
            this.IAuthTabCallback = jArr;
            this.onExtraCallback = iArr;
            this.onWarmupCompleted = i2;
            this.IAuthTabCallbackStub = jArr2;
            this.onNavigationEvent = iArr2;
            this.onExtraCallbackWithResult = j;
            this.asInterface = j2;
        }
    }

    public static onExtraCallbackWithResult IAuthTabCallback(int i2, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i3 = 8192 / i2;
        int i4 = 0;
        int iOnWarmupCompleted = 0;
        for (int i5 : iArr2) {
            iOnWarmupCompleted += TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(i5, i3);
        }
        long[] jArr2 = new long[iOnWarmupCompleted];
        int[] iArr3 = new int[iOnWarmupCompleted];
        long[] jArr3 = new long[iOnWarmupCompleted];
        int[] iArr4 = new int[iOnWarmupCompleted];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int iMax = 0;
        while (i4 < iArr2.length) {
            int i9 = iArr2[i4];
            long j2 = jArr[i4];
            while (i9 > 0) {
                int iMin = Math.min(i3, i9);
                jArr2[i8] = j2;
                int i10 = i2 * iMin;
                iArr3[i8] = i10;
                i7 += i10;
                iMax = Math.max(iMax, i10);
                jArr3[i8] = i6 * j;
                iArr4[i8] = 1;
                j2 += iArr3[i8];
                i6 += iMin;
                i9 -= iMin;
                i8++;
                i3 = i3;
            }
            i4++;
            iArr2 = iArr;
        }
        return new onExtraCallbackWithResult(jArr2, iArr3, iMax, jArr3, iArr4, j * i6, i7);
    }
}
