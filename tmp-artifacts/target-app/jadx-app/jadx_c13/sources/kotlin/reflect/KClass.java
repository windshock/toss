package kotlin.reflect;

import java.util.Collection;
import o.access4600;
import o.access5000;
import o.access5200;
import o.access5300;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface KClass<T> extends access5000, access4600, access5200 {
    Collection<access5300<T>> getConstructors();

    String getQualifiedName();

    String getSimpleName();

    int hashCode();

    boolean isInstance(@Nullable Object obj);
}
