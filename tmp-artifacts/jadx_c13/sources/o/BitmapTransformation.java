package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BitmapTransformation<K, V> implements Iterator<ResourceRecycler<V>>, KMutableIterator {
    private final ResourceLoader<K, V> IAuthTabCallback;
    private Object onExtraCallback;
    private Object onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onTransact;
    private int onWarmupCompleted;

    public BitmapTransformation(@Nullable Object obj, @NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.onExtraCallback = obj;
        this.IAuthTabCallback = resourceLoader;
        this.onExtraCallbackWithResult = LibraryGlideModule.IAuthTabCallback;
        this.onNavigationEvent = resourceLoader.onExtraCallbackWithResult().onTransact();
    }

    public final ResourceLoader<K, V> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final Object onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onWarmupCompleted < this.IAuthTabCallback.size();
    }

    @Override // java.util.Iterator
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ResourceRecycler<V> next() {
        onExtraCallbackWithResult();
        onExtraCallback();
        this.onExtraCallbackWithResult = this.onExtraCallback;
        this.onTransact = true;
        this.onWarmupCompleted++;
        ResourceRecycler<V> resourceRecycler = this.IAuthTabCallback.onExtraCallbackWithResult().get(this.onExtraCallback);
        if (resourceRecycler == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.onExtraCallback + ") has changed after it was added to the persistent map.");
        }
        ResourceRecycler<V> resourceRecycler2 = resourceRecycler;
        this.onExtraCallback = resourceRecycler2.onWarmupCompleted();
        return resourceRecycler2;
    }

    @Override // java.util.Iterator
    public void remove() {
        onTransact();
        TypeIntrinsics.asMutableMap(this.IAuthTabCallback).remove(this.onExtraCallbackWithResult);
        this.onExtraCallbackWithResult = null;
        this.onTransact = false;
        this.onNavigationEvent = this.IAuthTabCallback.onExtraCallbackWithResult().onTransact();
        this.onWarmupCompleted--;
    }

    private final void onExtraCallback() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void onTransact() {
        if (!this.onTransact) {
            throw new IllegalStateException();
        }
    }

    private final void onExtraCallbackWithResult() {
        if (this.IAuthTabCallback.onExtraCallbackWithResult().onTransact() != this.onNavigationEvent) {
            throw new ConcurrentModificationException();
        }
    }
}
