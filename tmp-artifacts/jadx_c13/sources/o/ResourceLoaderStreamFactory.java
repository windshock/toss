package o;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getRevision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceLoaderStreamFactory<K, V> extends access6300<K, V> implements getRevision<K, V> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final ResourceLoaderStreamFactory onNavigationEvent;
    private final Object IAuthTabCallback;
    private final Glide<K, ResourceRecycler<V>> onExtraCallback;
    private final Object onWarmupCompleted;

    public final Object IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final Object asInterface() {
        return this.onWarmupCompleted;
    }

    public final Glide<K, ResourceRecycler<V>> onExtraCallback() {
        return this.onExtraCallback;
    }

    public ResourceLoaderStreamFactory(@Nullable Object obj, @Nullable Object obj2, @NotNull Glide<K, ResourceRecycler<V>> glide) {
        Intrinsics.checkNotNullParameter(glide, "");
        this.IAuthTabCallback = obj;
        this.onWarmupCompleted = obj2;
        this.onExtraCallback = glide;
    }

    @Override // o.access6300
    public int asBinder() {
        return this.onExtraCallback.size();
    }

    @Override // o.access6300
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public getOpenFdsOrBuilderList<K> IAuthTabCallbackStub() {
        return new ResourceTranscoder(this);
    }

    @Override // o.access6300
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public getOpenFds<V> access000() {
        return new RequestManagerRetriever1(this);
    }

    private final getOpenFdsOrBuilderList<Map.Entry<K, V>> IAuthTabCallbackStubProxy() {
        return new ResourceDrawableDecoder(this);
    }

    @Override // o.access6300
    public final Set<Map.Entry<K, V>> onExtraCallbackWithResult() {
        return IAuthTabCallbackStubProxy();
    }

    @Override // o.access6300, java.util.Map
    public boolean containsKey(Object obj) {
        return this.onExtraCallback.containsKey(obj);
    }

    @Override // o.access6300, java.util.Map
    public V get(Object obj) {
        ResourceRecycler<V> resourceRecycler = this.onExtraCallback.get(obj);
        if (resourceRecycler != null) {
            return resourceRecycler.onNavigationEvent();
        }
        return null;
    }

    @Override // o.getRevision
    public getRevision<K, V> IAuthTabCallback(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return this;
        }
        Intrinsics.checkNotNull(this, "");
        getRevision.onExtraCallbackWithResult<K, V> onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted();
        onextracallbackwithresultOnWarmupCompleted.putAll(map);
        return onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted();
    }

    @Override // o.getRevision
    public getRevision.onExtraCallbackWithResult<K, V> onWarmupCompleted() {
        return new ResourceLoader(this);
    }

    @Override // o.access6300, java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        if (map instanceof ResourceLoaderStreamFactory) {
            return this.onExtraCallback.asInterface().onExtraCallback(((ResourceLoaderStreamFactory) obj).onExtraCallback.asInterface(), onNavigationEvent.onWarmupCompleted);
        }
        if (map instanceof ResourceLoader) {
            return this.onExtraCallback.asInterface().onExtraCallback(((ResourceLoader) obj).onExtraCallbackWithResult().asBinder(), onExtraCallbackWithResult.onNavigationEvent);
        }
        if (map instanceof Glide) {
            return this.onExtraCallback.asInterface().onExtraCallback(((Glide) obj).asInterface(), onWarmupCompleted.onExtraCallbackWithResult);
        }
        if (map instanceof RegistryNoImageHeaderParserException) {
            return this.onExtraCallback.asInterface().onExtraCallback(((RegistryNoImageHeaderParserException) obj).asBinder(), onExtraCallback.onExtraCallback);
        }
        return super.equals(obj);
    }

    static final class onNavigationEvent extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @NotNull ResourceRecycler<? extends Object> resourceRecycler2) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            Intrinsics.checkNotNullParameter(resourceRecycler2, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), resourceRecycler2.onNavigationEvent()));
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @NotNull ResourceRecycler<? extends Object> resourceRecycler2) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            Intrinsics.checkNotNullParameter(resourceRecycler2, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), resourceRecycler2.onNavigationEvent()));
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), obj));
        }
    }

    static final class onExtraCallback extends Lambda implements Function2<ResourceRecycler<V>, ?, Boolean> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ResourceRecycler<V> resourceRecycler, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(resourceRecycler.onNavigationEvent(), obj));
        }
    }

    @Override // o.access6300, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final <K, V> ResourceLoaderStreamFactory<K, V> onExtraCallback() {
            ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory = ResourceLoaderStreamFactory.onNavigationEvent;
            Intrinsics.checkNotNull(resourceLoaderStreamFactory, "");
            return resourceLoaderStreamFactory;
        }
    }

    static {
        LibraryGlideModule libraryGlideModule = LibraryGlideModule.IAuthTabCallback;
        onNavigationEvent = new ResourceLoaderStreamFactory(libraryGlideModule, libraryGlideModule, Glide.Companion.onExtraCallbackWithResult());
    }
}
