package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import o.qn;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class JsonException extends qn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
