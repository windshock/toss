package okhttp3;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl);

    void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                Intrinsics.checkNotNullParameter(httpUrl, "");
                Intrinsics.checkNotNullParameter(list, "");
            }

            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                Intrinsics.checkNotNullParameter(httpUrl, "");
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
    }
}
