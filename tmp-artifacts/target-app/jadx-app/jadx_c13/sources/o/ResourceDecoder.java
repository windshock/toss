package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceDecoder<K, V> extends RegistryMissingComponentException<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public ResourceDecoder(@NotNull ResourceEncoder<K, V> resourceEncoder) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new ResourceRecyclerResourceRecyclerCallback();
        }
        super(resourceEncoder, rewindVarArr);
    }
}
