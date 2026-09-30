package o;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface py<T> {
    SerialDescriptor getDescriptor();

    void serialize(@NotNull Encoder encoder, T t);
}
