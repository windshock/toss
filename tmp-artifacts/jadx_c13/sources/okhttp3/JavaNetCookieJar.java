package okhttp3;

import java.io.IOException;
import java.net.CookieHandler;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JavaNetCookieJar implements CookieJar {
    private final /* synthetic */ okhttp3.java.net.cookiejar.JavaNetCookieJar $$delegate_0;

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        return this.$$delegate_0.loadForRequest(httpUrl);
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) throws IOException {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.$$delegate_0.saveFromResponse(httpUrl, list);
    }

    private JavaNetCookieJar(okhttp3.java.net.cookiejar.JavaNetCookieJar javaNetCookieJar) {
        this.$$delegate_0 = javaNetCookieJar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavaNetCookieJar(@NotNull CookieHandler cookieHandler) {
        this(new okhttp3.java.net.cookiejar.JavaNetCookieJar(cookieHandler));
        Intrinsics.checkNotNullParameter(cookieHandler, "");
    }
}
