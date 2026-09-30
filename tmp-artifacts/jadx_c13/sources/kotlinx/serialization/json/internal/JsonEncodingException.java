package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
