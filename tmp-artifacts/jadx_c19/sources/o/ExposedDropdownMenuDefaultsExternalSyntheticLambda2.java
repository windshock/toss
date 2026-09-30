package o;

import com.google.android.exoplayer2.audio.OpusUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenuDefaultsExternalSyntheticLambda2 {
    private static final String[] asBinder = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] asInterface = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] onExtraCallback = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] onWarmupCompleted = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] onExtraCallbackWithResult = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] IAuthTabCallback = {32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] onNavigationEvent = {8000, 16000, 24000, 32000, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IAuthTabCallback(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static final class IAuthTabCallback {
        public int IAuthTabCallback;
        public int IAuthTabCallbackStub;
        public int onExtraCallback;
        public int onExtraCallbackWithResult;
        public int onNavigationEvent;
        public int onTransact;
        public String onWarmupCompleted;

        public IAuthTabCallback() {
        }

        public IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
            this.onTransact = iAuthTabCallback.onTransact;
            this.onWarmupCompleted = iAuthTabCallback.onWarmupCompleted;
            this.onExtraCallback = iAuthTabCallback.onExtraCallback;
            this.onNavigationEvent = iAuthTabCallback.onNavigationEvent;
            this.IAuthTabCallback = iAuthTabCallback.IAuthTabCallback;
            this.onExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult;
            this.IAuthTabCallbackStub = iAuthTabCallback.IAuthTabCallbackStub;
        }

        public boolean onWarmupCompleted(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.onTransact = i3;
            this.onWarmupCompleted = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.asBinder[3 - i4];
            int i7 = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.asInterface[i6];
            this.onNavigationEvent = i7;
            if (i3 == 2) {
                this.onNavigationEvent = i7 / 2;
            } else if (i3 == 0) {
                this.onNavigationEvent = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.IAuthTabCallbackStub = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onExtraCallback(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onExtraCallback[i5 - 1] : ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onWarmupCompleted[i5 - 1];
                this.onExtraCallbackWithResult = i9;
                this.onExtraCallback = (((i9 * 12) / this.onNavigationEvent) + i8) << 2;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onExtraCallbackWithResult[i5 - 1] : ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback[i5 - 1];
                    this.onExtraCallbackWithResult = i10;
                    this.onExtraCallback = ((i10 * 144) / this.onNavigationEvent) + i8;
                } else {
                    int i11 = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onNavigationEvent[i5 - 1];
                    this.onExtraCallbackWithResult = i11;
                    this.onExtraCallback = (((i4 == 1 ? 72 : 144) * i11) / this.onNavigationEvent) + i8;
                }
            }
            this.IAuthTabCallback = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int onWarmupCompleted(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!IAuthTabCallback(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = asInterface[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? onExtraCallback[i5 - 1] : onWarmupCompleted[i5 - 1]) * 12) / i8) + i9) << 2;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? onExtraCallbackWithResult[i5 - 1] : IAuthTabCallback[i5 - 1];
        } else {
            i7 = onNavigationEvent[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static int onExtraCallbackWithResult(int i2) {
        int i3;
        int i4;
        int i5;
        if (!IAuthTabCallback(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || ((i2 >>> 10) & 3) == 3) {
            return -1;
        }
        return onExtraCallback(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onExtraCallback(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
