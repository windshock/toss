package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManagerClearTarget<K, V> extends RegistryMissingComponentException<K, V, Map.Entry<? extends K, ? extends V>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public RequestManagerClearTarget(@NotNull ResourceEncoder<K, V> resourceEncoder) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new ParcelFileDescriptorRewinderInternalRewinder();
        }
        super(resourceEncoder, rewindVarArr);
    }
}
