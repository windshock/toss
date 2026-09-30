package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceCacheGenerator<K, V> extends rewind<K, V, Map.Entry<K, V>> {
    private final RegistryNoResultEncoderAvailableException<K, V> IAuthTabCallback;

    public ResourceCacheGenerator(@NotNull RegistryNoResultEncoderAvailableException<K, V> registryNoResultEncoderAvailableException) {
        Intrinsics.checkNotNullParameter(registryNoResultEncoderAvailableException, "");
        this.IAuthTabCallback = registryNoResultEncoderAvailableException;
    }

    @Override // java.util.Iterator
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        onWarmupCompleted();
        onExtraCallbackWithResult(onNavigationEvent() + 2);
        return new getMultiplier(this.IAuthTabCallback, IAuthTabCallback()[onNavigationEvent() - 2], IAuthTabCallback()[onNavigationEvent() - 1]);
    }
}
