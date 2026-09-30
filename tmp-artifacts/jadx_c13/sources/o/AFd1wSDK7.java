package o;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFd1wSDK7 {
    void IAuthTabCallback(@NotNull String str, @Nullable Throwable th, @NotNull Map<String, ? extends Object> map);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(AFd1wSDK7 aFd1wSDK7, String str, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            map = access8000.IAuthTabCallback();
        }
        aFd1wSDK7.IAuthTabCallback(str, th, map);
    }
}
