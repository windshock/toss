package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestBuilder1<K, V> extends GeneratedAppGlideModule<K, V, K> {
    /* JADX WARN: Illegal instructions before constructor call */
    public RequestBuilder1(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new RuntimeCompat();
        }
        super(registryNoImageHeaderParserException, rewindVarArr);
    }
}
