package o;

import java.util.Arrays;
import java.util.Random;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BottomNavigationKtExternalSyntheticLambda7 {
    int IAuthTabCallback();

    BottomNavigationKtExternalSyntheticLambda7 IAuthTabCallback(int i2, int i3);

    int onExtraCallback();

    int onExtraCallback(int i2);

    BottomNavigationKtExternalSyntheticLambda7 onExtraCallback(int i2, int i3);

    int onNavigationEvent();

    int onNavigationEvent(int i2);

    BottomNavigationKtExternalSyntheticLambda7 onWarmupCompleted();

    default BottomNavigationKtExternalSyntheticLambda7 onWarmupCompleted(int i2, int i3, int i4) {
        return this;
    }

    public static class onExtraCallbackWithResult implements BottomNavigationKtExternalSyntheticLambda7 {
        private final int[] onExtraCallbackWithResult;
        private final int[] onNavigationEvent;
        private final Random onWarmupCompleted;

        public onExtraCallbackWithResult(int i2) {
            this(i2, new Random());
        }

        private onExtraCallbackWithResult(int i2, Random random) {
            this(onWarmupCompleted(i2, random), random);
        }

        private onExtraCallbackWithResult(int[] iArr, Random random) {
            this.onExtraCallbackWithResult = iArr;
            this.onWarmupCompleted = random;
            this.onNavigationEvent = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.onNavigationEvent[iArr[i2]] = i2;
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public int onExtraCallback() {
            return this.onExtraCallbackWithResult.length;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public int onExtraCallback(int i2) {
            int i3 = this.onNavigationEvent[i2] + 1;
            int[] iArr = this.onExtraCallbackWithResult;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public int onNavigationEvent(int i2) {
            int i3 = this.onNavigationEvent[i2] - 1;
            if (i3 >= 0) {
                return this.onExtraCallbackWithResult[i3];
            }
            return -1;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public int IAuthTabCallback() {
            int[] iArr = this.onExtraCallbackWithResult;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public int onNavigationEvent() {
            int[] iArr = this.onExtraCallbackWithResult;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public BottomNavigationKtExternalSyntheticLambda7 IAuthTabCallback(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.onWarmupCompleted.nextInt(this.onExtraCallbackWithResult.length + 1);
                int i6 = i5 + 1;
                int iNextInt = this.onWarmupCompleted.nextInt(i6);
                iArr2[i5] = iArr2[iNextInt];
                iArr2[iNextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.onExtraCallbackWithResult.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.onExtraCallbackWithResult;
                if (i4 < iArr4.length + i3) {
                    if (i7 < i3 && i8 == iArr[i7]) {
                        iArr3[i4] = iArr2[i7];
                        i7++;
                    } else {
                        int i9 = iArr4[i8];
                        iArr3[i4] = i9;
                        if (i9 >= i2) {
                            iArr3[i4] = i9 + i3;
                        }
                        i8++;
                    }
                    i4++;
                } else {
                    return new onExtraCallbackWithResult(iArr3, new Random(this.onWarmupCompleted.nextLong()));
                }
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public BottomNavigationKtExternalSyntheticLambda7 onExtraCallback(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.onExtraCallbackWithResult.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.onExtraCallbackWithResult;
                if (i5 < iArr2.length) {
                    int i7 = iArr2[i5];
                    if (i7 < i2 || i7 >= i3) {
                        if (i7 >= i2) {
                            i7 -= i4;
                        }
                        iArr[i5 - i6] = i7;
                    } else {
                        i6++;
                    }
                    i5++;
                } else {
                    return new onExtraCallbackWithResult(iArr, new Random(this.onWarmupCompleted.nextLong()));
                }
            }
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda7
        public BottomNavigationKtExternalSyntheticLambda7 onWarmupCompleted() {
            return new onExtraCallbackWithResult(0, new Random(this.onWarmupCompleted.nextLong()));
        }

        private static int[] onWarmupCompleted(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }
    }
}
