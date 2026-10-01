package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Response<T> {

    @Nullable
    private final T body;

    @Nullable
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    public static <T> Response<T> IAuthTabCallback(@Nullable T t, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        return IAuthTabCallback(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> IAuthTabCallback(@Nullable T t, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new Response<>(response, t, null);
    }

    public static <T> Response<T> onWarmupCompleted(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response<>(response, null, responseBody);
    }

    private Response(okhttp3.Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = responseBody;
    }

    public okhttp3.Response IAuthTabCallbackStub() {
        return this.rawResponse;
    }

    public int onNavigationEvent() {
        return this.rawResponse.code();
    }

    public String asBinder() {
        return this.rawResponse.message();
    }

    public Headers IAuthTabCallback() {
        return this.rawResponse.headers();
    }

    public boolean onExtraCallbackWithResult() {
        return this.rawResponse.isSuccessful();
    }

    @Nullable
    public T onExtraCallback() {
        return this.body;
    }

    @Nullable
    public ResponseBody onWarmupCompleted() {
        return this.errorBody;
    }

    public String toString() {
        return this.rawResponse.toString();
    }
}
