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
public final class ResourceLoader<K, V> extends access6200<K, V> implements getRevision.onExtraCallbackWithResult<K, V> {
    private ResourceLoaderStreamFactory<K, V> onExtraCallback;
    private Object onExtraCallbackWithResult;
    private Object onNavigationEvent;
    private final RegistryNoImageHeaderParserException<K, ResourceRecycler<V>> onWarmupCompleted;

    public ResourceLoader(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.onExtraCallback = resourceLoaderStreamFactory;
        this.onExtraCallbackWithResult = resourceLoaderStreamFactory.IAuthTabCallback();
        this.onNavigationEvent = resourceLoaderStreamFactory.asInterface();
        this.onWarmupCompleted = resourceLoaderStreamFactory.onExtraCallback().onWarmupCompleted();
    }

    public final Object IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final RegistryNoImageHeaderParserException<K, ResourceRecycler<V>> onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.access6200
    public int asInterface() {
        return this.onWarmupCompleted.size();
    }

    @Override // o.getRevision.onExtraCallbackWithResult
    public getRevision<K, V> onWarmupCompleted() {
        ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory = this.onExtraCallback;
        if (resourceLoaderStreamFactory != null) {
            this.onWarmupCompleted.IAuthTabCallback();
            resourceLoaderStreamFactory.IAuthTabCallback();
            resourceLoaderStreamFactory.asInterface();
            return resourceLoaderStreamFactory;
        }
        this.onWarmupCompleted.IAuthTabCallback();
        ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory2 = new ResourceLoaderStreamFactory<>(this.onExtraCallbackWithResult, this.onNavigationEvent, this.onWarmupCompleted.onWarmupCompleted());
        this.onExtraCallback = resourceLoaderStreamFactory2;
        return resourceLoaderStreamFactory2;
    }

    @Override // o.access6200
    public Set<Map.Entry<K, V>> onNavigationEvent() {
        return new ResourceLoaderFileDescriptorFactory(this);
    }

    @Override // o.access6200
    public Set<K> onExtraCallback() {
        return new RecyclableBufferedInputStreamInvalidMarkException(this);
    }

    @Override // o.access6200
    public Collection<V> IAuthTabCallbackDefault() {
        return new ResourceLoaderUriFactory(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.onWarmupCompleted.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        ResourceRecycler<V> resourceRecycler = this.onWarmupCompleted.get(obj);
        if (resourceRecycler != null) {
            return resourceRecycler.onNavigationEvent();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ResourceRecycler<V> resourceRecycler = this.onWarmupCompleted.get(k);
        if (resourceRecycler != null) {
            if (resourceRecycler.onNavigationEvent() == v) {
                return v;
            }
            this.onExtraCallback = null;
            this.onWarmupCompleted.put(k, resourceRecycler.IAuthTabCallback(v));
            return resourceRecycler.onNavigationEvent();
        }
        this.onExtraCallback = null;
        if (isEmpty()) {
            this.onExtraCallbackWithResult = k;
            this.onNavigationEvent = k;
            this.onWarmupCompleted.put(k, new ResourceRecycler<>(v));
        } else {
            Object obj = this.onNavigationEvent;
            ResourceRecycler<V> resourceRecycler2 = this.onWarmupCompleted.get(obj);
            Intrinsics.checkNotNull(resourceRecycler2);
            ResourceRecycler<V> resourceRecycler3 = resourceRecycler2;
            resourceRecycler3.onExtraCallbackWithResult();
            this.onWarmupCompleted.put(obj, resourceRecycler3.onWarmupCompleted(k));
            this.onWarmupCompleted.put(k, new ResourceRecycler<>(v, obj));
            this.onNavigationEvent = k;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ResourceRecycler<V> resourceRecyclerRemove = this.onWarmupCompleted.remove(obj);
        if (resourceRecyclerRemove == null) {
            return null;
        }
        this.onExtraCallback = null;
        if (resourceRecyclerRemove.IAuthTabCallback()) {
            ResourceRecycler<V> resourceRecycler = this.onWarmupCompleted.get(resourceRecyclerRemove.onExtraCallback());
            Intrinsics.checkNotNull(resourceRecycler);
            this.onWarmupCompleted.put(resourceRecyclerRemove.onExtraCallback(), resourceRecycler.onWarmupCompleted(resourceRecyclerRemove.onWarmupCompleted()));
        } else {
            this.onExtraCallbackWithResult = resourceRecyclerRemove.onWarmupCompleted();
        }
        if (resourceRecyclerRemove.onExtraCallbackWithResult()) {
            ResourceRecycler<V> resourceRecycler2 = this.onWarmupCompleted.get(resourceRecyclerRemove.onWarmupCompleted());
            Intrinsics.checkNotNull(resourceRecycler2);
            this.onWarmupCompleted.put(resourceRecyclerRemove.onWarmupCompleted(), resourceRecycler2.onNavigationEvent(resourceRecyclerRemove.onExtraCallback()));
        } else {
            this.onNavigationEvent = resourceRecyclerRemove.onExtraCallback();
        }
        return resourceRecyclerRemove.onNavigationEvent();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        ResourceRecycler<V> resourceRecycler = this.onWarmupCompleted.get(obj);
        if (resourceRecycler == null || !Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.onWarmupCompleted.isEmpty()) {
            this.onExtraCallback = null;
        }
        this.onWarmupCompleted.clear();
        LibraryGlideModule libraryGlideModule = LibraryGlideModule.IAuthTabCallback;
        this.onExtraCallbackWithResult = libraryGlideModule;
        this.onNavigationEvent = libraryGlideModule;
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
        if (map instanceof ResourceLoaderStreamFactory) {
            return this.onWarmupCompleted.asBinder().onExtraCallback(((ResourceLoaderStreamFactory) obj).onExtraCallback().asInterface(), onExtraCallbackWithResult.onExtraCallbackWithResult);
        }
        if (map instanceof ResourceLoader) {
            return this.onWarmupCompleted.asBinder().onExtraCallback(((ResourceLoader) obj).onWarmupCompleted.asBinder(), onWarmupCompleted.IAuthTabCallback);
        }
        if (map instanceof Glide) {
            return this.onWarmupCompleted.asBinder().onExtraCallback(((Glide) obj).asInterface(), onNavigationEvent.onExtraCallbackWithResult);
        }
        if (map instanceof RegistryNoImageHeaderParserException) {
            return this.onWarmupCompleted.asBinder().onExtraCallback(((RegistryNoImageHeaderParserException) obj).asBinder(), IAuthTabCallback.onExtraCallbackWithResult);
        }
        return RequestCoordinatorRequestState.onExtraCallback.onExtraCallback(this, map);
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @NotNull ResourceRecycler<? extends Object> resourceRecycler2) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            Intrinsics.checkNotNullParameter(resourceRecycler2, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), resourceRecycler2.onNavigationEvent()));
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @NotNull ResourceRecycler<? extends Object> resourceRecycler2) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            Intrinsics.checkNotNullParameter(resourceRecycler2, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), resourceRecycler2.onNavigationEvent()));
        }
    }

    static final class onNavigationEvent extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        onNavigationEvent() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), obj));
        }
    }

    static final class IAuthTabCallback extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), obj));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return RequestCoordinatorRequestState.onExtraCallback.onNavigationEvent(this);
    }
}
