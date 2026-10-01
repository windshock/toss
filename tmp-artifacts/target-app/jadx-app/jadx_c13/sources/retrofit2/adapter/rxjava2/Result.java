package retrofit2.adapter.rxjava2;

import javax.annotation.Nullable;
import retrofit2.Response;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Result<T> {

    @Nullable
    private final Response<T> onExtraCallback;

    @Nullable
    private final Throwable onNavigationEvent;

    public static <T> Result<T> onExtraCallback(Throwable th) {
        if (th == null) {
            throw new NullPointerException("error == null");
        }
        return new Result<>(null, th);
    }

    public static <T> Result<T> onWarmupCompleted(Response<T> response) {
        if (response == null) {
            throw new NullPointerException("response == null");
        }
        return new Result<>(response, null);
    }

    private Result(@Nullable Response<T> response, @Nullable Throwable th) {
        this.onExtraCallback = response;
        this.onNavigationEvent = th;
    }
}
