package okhttp3.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Tags {
    public /* synthetic */ Tags(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T> T get(@NotNull KClass<T> kClass);

    public abstract <T> Tags plus(@NotNull KClass<T> kClass, @Nullable T t);

    private Tags() {
    }
}
