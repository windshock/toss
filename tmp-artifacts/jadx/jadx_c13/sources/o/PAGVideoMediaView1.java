package o;

import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PAGVideoMediaView1 {
    public static void onExtraCallback(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T onExtraCallback(T t) {
        return (T) IAuthTabCallback(t, "The validated object is null", new Object[0]);
    }

    public static <T> T IAuthTabCallback(T t, String str, Object... objArr) {
        Objects.requireNonNull(t, (Supplier<String>) new Validate$.ExternalSyntheticLambda2(str, objArr));
        return t;
    }

    public static <T> T[] onExtraCallbackWithResult(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, (Supplier<String>) new Validate$.ExternalSyntheticLambda5(str, objArr));
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T> T[] onNavigationEvent(T[] tArr) {
        return (T[]) onExtraCallbackWithResult(tArr, "The validated array is empty", new Object[0]);
    }

    public static <T> T[] onWarmupCompleted(T[] tArr, String str, Object... objArr) {
        onExtraCallback(tArr);
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                throw new IllegalArgumentException(String.format(str, getVideoProgress.onNavigationEvent(objArr, Integer.valueOf(i))));
            }
        }
        return tArr;
    }

    public static <T> T[] IAuthTabCallback(T[] tArr) {
        return (T[]) onWarmupCompleted(tArr, "The validated array contains null element at index: %d", new Object[0]);
    }
}
