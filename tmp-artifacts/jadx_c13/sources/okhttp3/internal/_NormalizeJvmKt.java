package okhttp3.internal;

import java.text.Normalizer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class _NormalizeJvmKt {
    public static final String normalizeNfc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "");
        return strNormalize;
    }
}
