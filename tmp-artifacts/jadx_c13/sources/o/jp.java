package o;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jp<T> {
    T deserialize(@NotNull Decoder decoder);

    SerialDescriptor getDescriptor();
}
