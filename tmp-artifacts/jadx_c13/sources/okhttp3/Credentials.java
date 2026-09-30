package okhttp3;

import java.nio.charset.Charset;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    @JvmStatic
    public static final String basic(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return basic$default(str, str2, null, 4, null);
    }

    private Credentials() {
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = Charsets.ISO_8859_1;
        }
        return basic(str, str2, charset);
    }

    @JvmStatic
    public static final String basic(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return "Basic " + TTBaseLandingPageActivity.Companion.onExtraCallbackWithResult(str + ':' + str2, charset).IAuthTabCallback();
    }
}
