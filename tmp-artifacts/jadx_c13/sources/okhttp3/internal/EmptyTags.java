package okhttp3.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class EmptyTags extends Tags {
    public static final EmptyTags INSTANCE = new EmptyTags();

    @Override // okhttp3.internal.Tags
    public <T> T get(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return null;
    }

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(@NotNull KClass<T> kClass, @Nullable T t) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return t != null ? new LinkedTags(kClass, t, this) : this;
    }

    public String toString() {
        return "{}";
    }
}
