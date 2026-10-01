package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceRecycler<V> {
    private final V onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final Object onNavigationEvent;

    public ResourceRecycler(V v, @Nullable Object obj, @Nullable Object obj2) {
        this.onExtraCallback = v;
        this.onNavigationEvent = obj;
        this.onExtraCallbackWithResult = obj2;
    }

    public final Object onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final V onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final Object onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ResourceRecycler(V v) {
        LibraryGlideModule libraryGlideModule = LibraryGlideModule.IAuthTabCallback;
        this(v, libraryGlideModule, libraryGlideModule);
    }

    public ResourceRecycler(V v, @Nullable Object obj) {
        this(v, obj, LibraryGlideModule.IAuthTabCallback);
    }

    public final ResourceRecycler<V> IAuthTabCallback(V v) {
        return new ResourceRecycler<>(v, this.onNavigationEvent, this.onExtraCallbackWithResult);
    }

    public final ResourceRecycler<V> onNavigationEvent(@Nullable Object obj) {
        return new ResourceRecycler<>(this.onExtraCallback, obj, this.onExtraCallbackWithResult);
    }

    public final ResourceRecycler<V> onWarmupCompleted(@Nullable Object obj) {
        return new ResourceRecycler<>(this.onExtraCallback, this.onNavigationEvent, obj);
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult != LibraryGlideModule.IAuthTabCallback;
    }

    public final boolean IAuthTabCallback() {
        return this.onNavigationEvent != LibraryGlideModule.IAuthTabCallback;
    }
}
