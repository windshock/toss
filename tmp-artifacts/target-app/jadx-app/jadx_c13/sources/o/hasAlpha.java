package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class hasAlpha<K, V> extends GeneratedAppGlideModule<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public hasAlpha(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new ResourceRecyclerResourceRecyclerCallback();
        }
        super(registryNoImageHeaderParserException, rewindVarArr);
    }
}
