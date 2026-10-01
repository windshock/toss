package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class HttpException extends RuntimeException {
    private final transient Response<?> IAuthTabCallback;
    private final int code;
    private final String message;

    private static String getMessage(Response<?> response) {
        Objects.requireNonNull(response, "response == null");
        return "HTTP " + response.onNavigationEvent() + " " + response.asBinder();
    }

    public HttpException(Response<?> response) {
        super(getMessage(response));
        this.code = response.onNavigationEvent();
        this.message = response.asBinder();
        this.IAuthTabCallback = response;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public Response<?> response() {
        return this.IAuthTabCallback;
    }
}
