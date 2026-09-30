package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class markHierarchyDirty {
    public static void onExtraCallbackWithResult(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T onExtraCallbackWithResult(@Nullable T t) {
        return (T) onExtraCallbackWithResult(t, "Argument must not be null");
    }

    public static <T> T onExtraCallbackWithResult(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String onExtraCallbackWithResult(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends Collection<Y>, Y> T IAuthTabCallback(@NonNull T t) {
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t;
    }
}
