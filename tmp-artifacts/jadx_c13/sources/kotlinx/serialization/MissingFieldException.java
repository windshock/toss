package kotlinx.serialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import o.qn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MissingFieldException extends qn {
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> list, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(list, "");
        this.missingFields = list;
    }

    public final List<String> onWarmupCompleted() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(@NotNull List<String> list, @NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String str, @NotNull String str2) {
        this(CollectionsKt__CollectionsJVMKt.listOf(str), "Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
