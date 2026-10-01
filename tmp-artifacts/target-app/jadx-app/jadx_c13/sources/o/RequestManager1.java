package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManager1<K, V> extends RegistryMissingComponentException<K, V, K> {
    /* JADX WARN: Illegal instructions before constructor call */
    public RequestManager1(@NotNull ResourceEncoder<K, V> resourceEncoder) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new RuntimeCompat();
        }
        super(resourceEncoder, rewindVarArr);
    }
}
