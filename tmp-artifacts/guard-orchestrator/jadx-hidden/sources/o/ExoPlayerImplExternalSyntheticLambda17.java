package o;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda17 {
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final int onExtraCallback;
    public static final ExoPlayerImplExternalSyntheticLambda17 IAuthTabCallback = new ExoPlayerImplExternalSyntheticLambda17(0);
    public static final ExoPlayerImplExternalSyntheticLambda17 onWarmupCompleted = new ExoPlayerImplExternalSyntheticLambda17(32);

    static {
        int i = asBinder;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private ExoPlayerImplExternalSyntheticLambda17(int i) {
        this.onExtraCallback = i;
    }

    public static ExoPlayerImplExternalSyntheticLambda17 IAuthTabCallback(byte b) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((b & 32) == 0) {
            int i6 = i2 + 11;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return IAuthTabCallback;
            }
            throw new ArithmeticException();
        }
        ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17 = onWarmupCompleted;
        int i7 = i4 + 31;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return exoPlayerImplExternalSyntheticLambda17;
        }
        throw new NullPointerException();
    }

    public static Set onExtraCallbackWithResult(Object... objArr) {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(objArr.length);
        hashSet.addAll(Arrays.asList(objArr));
        SystemClock.elapsedRealtime();
        new Random().nextInt(1944802111);
        return hashSet;
    }
}
