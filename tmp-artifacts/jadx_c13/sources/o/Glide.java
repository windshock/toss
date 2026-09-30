package o;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ResourceEncoder;
import o.getRevision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Glide<K, V> extends access6300<K, V> implements getRevision<K, V> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final Glide onWarmupCompleted = new Glide(ResourceEncoder.Companion.onExtraCallback(), 0);
    private final ResourceEncoder<K, V> IAuthTabCallback;
    private final int onExtraCallback;

    public final ResourceEncoder<K, V> asInterface() {
        return this.IAuthTabCallback;
    }

    public Glide(@NotNull ResourceEncoder<K, V> resourceEncoder, int i) {
        Intrinsics.checkNotNullParameter(resourceEncoder, "");
        this.IAuthTabCallback = resourceEncoder;
        this.onExtraCallback = i;
    }

    @Override // o.access6300
    public int asBinder() {
        return this.onExtraCallback;
    }

    @Override // o.access6300
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getOpenFdsOrBuilderList<K> IAuthTabCallbackStub() {
        return new RequestManagerRequestManagerConnectivityListener(this);
    }

    @Override // o.access6300
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public getOpenFds<V> access000() {
        return new isWebp(this);
    }

    private final getOpenFdsOrBuilderList<Map.Entry<K, V>> onTransact() {
        return new ImageHeaderParserImageType(this);
    }

    @Override // o.access6300
    public final Set<Map.Entry<K, V>> onExtraCallbackWithResult() {
        return onTransact();
    }

    @Override // o.access6300, java.util.Map
    public boolean containsKey(Object obj) {
        return this.IAuthTabCallback.onWarmupCompleted(obj != null ? obj.hashCode() : 0, (int) obj, 0);
    }

    @Override // o.access6300, java.util.Map
    public V get(Object obj) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(obj != null ? obj.hashCode() : 0, (int) obj, 0);
    }

    public Glide<K, V> onNavigationEvent(K k, V v) {
        ResourceEncoder.onWarmupCompleted<K, V> onwarmupcompletedIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(k != null ? k.hashCode() : 0, k, v, 0);
        return onwarmupcompletedIAuthTabCallback == null ? this : new Glide<>(onwarmupcompletedIAuthTabCallback.onNavigationEvent(), size() + onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult());
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
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RegistryNoImageHeaderParserException<K, V> onWarmupCompleted() {
        return new RegistryNoImageHeaderParserException<>(this);
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
            return this.IAuthTabCallback.onExtraCallback(((ResourceLoaderStreamFactory) obj).onExtraCallback().IAuthTabCallback, onWarmupCompleted.onExtraCallbackWithResult);
        }
        if (map instanceof ResourceLoader) {
            return this.IAuthTabCallback.onExtraCallback(((ResourceLoader) obj).onExtraCallbackWithResult().asBinder(), onExtraCallback.onExtraCallback);
        }
        if (map instanceof Glide) {
            return this.IAuthTabCallback.onExtraCallback(((Glide) obj).IAuthTabCallback, onExtraCallbackWithResult.onExtraCallback);
        }
        if (map instanceof RegistryNoImageHeaderParserException) {
            return this.IAuthTabCallback.onExtraCallback(((RegistryNoImageHeaderParserException) obj).asBinder(), IAuthTabCallback.IAuthTabCallback);
        }
        return super.equals(obj);
    }

    static final class onWarmupCompleted extends Lambda implements Function2<V, ?, Boolean> {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @NotNull ResourceRecycler<? extends Object> resourceRecycler) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(v, resourceRecycler.onNavigationEvent()));
        }
    }

    static final class onExtraCallback extends Lambda implements Function2<V, ?, Boolean> {
        public static final onExtraCallback onExtraCallback = new onExtraCallback();

        onExtraCallback() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @NotNull ResourceRecycler<? extends Object> resourceRecycler) {
            Intrinsics.checkNotNullParameter(resourceRecycler, "");
            return Boolean.valueOf(Intrinsics.areEqual(v, resourceRecycler.onNavigationEvent()));
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function2<V, ?, Boolean> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @Nullable Object obj) {
            return Boolean.valueOf(Intrinsics.areEqual(v, obj));
        }
    }

    static final class IAuthTabCallback extends Lambda implements Function2<V, ?, Boolean> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(V v, @Nullable Object obj) {
            return Boolean.valueOf(Intrinsics.areEqual(v, obj));
        }
    }

    @Override // o.access6300, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final <K, V> Glide<K, V> onExtraCallbackWithResult() {
            Glide<K, V> glide = Glide.onWarmupCompleted;
            Intrinsics.checkNotNull(glide, "");
            return glide;
        }
    }
}
