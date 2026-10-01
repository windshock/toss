package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_tlsVersions {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final deprecated_tlsVersions onExtraCallbackWithResult = new deprecated_tlsVersions();
    private static final int[] IAuthTabCallback = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
    public static final int onExtraCallback = 8;

    private deprecated_tlsVersions() {
    }

    static {
        int i = onWarmupCompleted + 47;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public final int onExtraCallback(int i) {
        int i2;
        int i3 = 2 % 2;
        if (i <= 2) {
            int i4 = IAuthTabCallbackDefault + 3;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 != 0 ? 4 : 2;
        }
        int[] iArr = IAuthTabCallback;
        int length = iArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = IAuthTabCallbackStub;
            int i7 = i6 + 89;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                i2 = iArr[i5];
                int i8 = 37 / 0;
                if (i2 >= i) {
                    return i2;
                }
                i5++;
                int i9 = i6 + 69;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i2 = iArr[i5];
                if (i2 >= i) {
                    return i2;
                }
                i5++;
                int i92 = i6 + 69;
                IAuthTabCallbackDefault = i92 % 128;
                int i102 = i92 % 2;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final long onExtraCallbackWithResult(long j) {
        long jOnExtraCallback;
        long j2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = onExtraCallback((int) (j >>> 32));
            jOnExtraCallback = onExtraCallback((int) j) + 4294967295L;
            j2 = iOnExtraCallback >>> 34;
        } else {
            int iOnExtraCallback2 = onExtraCallback((int) (j >> 32));
            jOnExtraCallback = onExtraCallback((int) j) & 4294967295L;
            j2 = iOnExtraCallback2 << 32;
        }
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted(jOnExtraCallback | j2);
        int i3 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return jOnWarmupCompleted;
    }
}
