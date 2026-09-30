package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getRevision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegistryNoImageHeaderParserException<K, V> extends access6200<K, V> implements getRevision.onExtraCallbackWithResult<K, V> {
    private ResourceEncoderRegistry IAuthTabCallback;
    private int asInterface;
    private ResourceEncoder<K, V> onExtraCallback;
    private V onExtraCallbackWithResult;
    private Glide<K, V> onNavigationEvent;
    private int onWarmupCompleted;

    public RegistryNoImageHeaderParserException(@NotNull Glide<K, V> glide) {
        Intrinsics.checkNotNullParameter(glide, "");
        this.onNavigationEvent = glide;
        this.IAuthTabCallback = new ResourceEncoderRegistry();
        this.onExtraCallback = glide.asInterface();
        this.asInterface = glide.size();
    }

    public final Glide<K, V> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final ResourceEncoderRegistry IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public final ResourceEncoder<K, V> asBinder() {
        return this.onExtraCallback;
    }

    public final void onExtraCallback(@NotNull ResourceEncoder<K, V> resourceEncoder) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        if (resourceEncoder != this.onExtraCallback) {
            this.onExtraCallback = resourceEncoder;
            this.onNavigationEvent = null;
        }
    }

    public final void IAuthTabCallback(@Nullable V v) {
        this.onExtraCallbackWithResult = v;
    }

    public final void onExtraCallbackWithResult(int i) {
        this.onWarmupCompleted = i;
    }

    public final int onTransact() {
        return this.onWarmupCompleted;
    }

    @Override // o.access6200
    public int asInterface() {
        return this.asInterface;
    }

    public void onWarmupCompleted(int i) {
        this.asInterface = i;
        this.onWarmupCompleted++;
    }

    @Override // o.getRevision.onExtraCallbackWithResult
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Glide<K, V> onWarmupCompleted() {
        Glide<K, V> glide = this.onNavigationEvent;
        if (glide != null) {
            return glide;
        }
        Glide<K, V> glide2 = new Glide<>(this.onExtraCallback, size());
        this.onNavigationEvent = glide2;
        this.IAuthTabCallback = new ResourceEncoderRegistry();
        return glide2;
    }

    @Override // o.access6200
    public Set<Map.Entry<K, V>> onNavigationEvent() {
        return new RegistryNoModelLoaderAvailableException(this);
    }

    @Override // o.access6200
    public Set<K> onExtraCallback() {
        return new RegistryNoSourceEncoderAvailableException(this);
    }

    @Override // o.access6200
    public Collection<V> IAuthTabCallbackDefault() {
        return new RequestManager(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.onExtraCallback.onWarmupCompleted(obj != null ? obj.hashCode() : 0, (int) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.onExtraCallback.onExtraCallbackWithResult(obj != null ? obj.hashCode() : 0, (int) obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        this.onExtraCallbackWithResult = null;
        onExtraCallback(this.onExtraCallback.onExtraCallbackWithResult(k != null ? k.hashCode() : 0, k, v, 0, this));
        return this.onExtraCallbackWithResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return;
        }
        Glide<K, V> glideOnWarmupCompleted = map instanceof Glide ? (Glide) map : null;
        if (glideOnWarmupCompleted == null) {
            RegistryNoImageHeaderParserException registryNoImageHeaderParserException = map instanceof RegistryNoImageHeaderParserException ? (RegistryNoImageHeaderParserException) map : null;
            glideOnWarmupCompleted = registryNoImageHeaderParserException != null ? registryNoImageHeaderParserException.onWarmupCompleted() : null;
        }
        if (glideOnWarmupCompleted != null) {
            AppGlideModule appGlideModule = new AppGlideModule(0, 1, null);
            int size = size();
            ResourceEncoder<K, V> resourceEncoder = this.onExtraCallback;
            ResourceEncoder<K, V> resourceEncoderAsInterface = glideOnWarmupCompleted.asInterface();
            Intrinsics.checkNotNull(resourceEncoderAsInterface, "");
            onExtraCallback(resourceEncoder.onWarmupCompleted(resourceEncoderAsInterface, 0, appGlideModule, this));
            int size2 = (glideOnWarmupCompleted.size() + size) - appGlideModule.IAuthTabCallback();
            if (size != size2) {
                onWarmupCompleted(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.onExtraCallbackWithResult = null;
        ResourceEncoder resourceEncoderOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(obj != null ? obj.hashCode() : 0, (int) obj, 0, (RegistryNoImageHeaderParserException<int, V>) this);
        if (resourceEncoderOnWarmupCompleted == null) {
            resourceEncoderOnWarmupCompleted = ResourceEncoder.Companion.onExtraCallback();
            Intrinsics.checkNotNull(resourceEncoderOnWarmupCompleted, "");
        }
        onExtraCallback(resourceEncoderOnWarmupCompleted);
        return this.onExtraCallbackWithResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        ResourceEncoder resourceEncoderOnExtraCallback = this.onExtraCallback.onExtraCallback(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (resourceEncoderOnExtraCallback == null) {
            resourceEncoderOnExtraCallback = ResourceEncoder.Companion.onExtraCallback();
            Intrinsics.checkNotNull(resourceEncoderOnExtraCallback, "");
        }
        onExtraCallback(resourceEncoderOnExtraCallback);
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        ResourceEncoder resourceEncoderOnExtraCallback = ResourceEncoder.Companion.onExtraCallback();
        Intrinsics.checkNotNull(resourceEncoderOnExtraCallback, "");
        onExtraCallback(resourceEncoderOnExtraCallback);
        onWarmupCompleted(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map<?, ?> map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        if (map instanceof Glide) {
            return this.onExtraCallback.onExtraCallback(((Glide) obj).asInterface(), onExtraCallbackWithResult.onExtraCallbackWithResult);
        }
        if (map instanceof RegistryNoImageHeaderParserException) {
            return this.onExtraCallback.onExtraCallback(((RegistryNoImageHeaderParserException) obj).onExtraCallback, onNavigationEvent.onWarmupCompleted);
        }
        if (map instanceof ResourceLoaderStreamFactory) {
            return this.onExtraCallback.onExtraCallback(((ResourceLoaderStreamFactory) obj).onExtraCallback().asInterface(), IAuthTabCallback.onExtraCallbackWithResult);
        }
        if (map instanceof ResourceLoader) {
            return this.onExtraCallback.onExtraCallback(((ResourceLoader) obj).onExtraCallbackWithResult().onExtraCallback, onWarmupCompleted.onWarmupCompleted);
        }
        return RequestCoordinatorRequestState.onExtraCallback.onExtraCallback(this, map);
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<V, ?, Boolean> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @Nullable Object obj) {
            return Boolean.valueOf(Intrinsics.areEqual(v, obj));
        }
    }

    static final class onNavigationEvent extends Lambda implements Function2<V, ?, Boolean> {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @Nullable Object obj) {
            return Boolean.valueOf(Intrinsics.areEqual(v, obj));
        }
    }

    static final class IAuthTabCallback extends Lambda implements Function2<V, ?, Boolean> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @NotNull ResourceRecycler<? extends Object> resourceRecycler) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(v, resourceRecycler.onNavigationEvent()));
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<V, ?, Boolean> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @NotNull ResourceRecycler<? extends Object> resourceRecycler) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(v, resourceRecycler.onNavigationEvent()));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return RequestCoordinatorRequestState.onExtraCallback.onNavigationEvent(this);
    }
}
