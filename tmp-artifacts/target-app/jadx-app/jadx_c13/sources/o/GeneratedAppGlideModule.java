package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class GeneratedAppGlideModule<K, V, T> extends RegistryMissingComponentException<K, V, T> implements Iterator<T>, KMutableIterator {
    private int IAuthTabCallback;
    private K onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final RegistryNoImageHeaderParserException<K, V> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratedAppGlideModule(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException, @NotNull rewind<K, V, T>[] rewindVarArr) {
        super(registryNoImageHeaderParserException.asBinder(), rewindVarArr);
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        Intrinsics.checkNotNullParameter(rewindVarArr, "");
        this.onWarmupCompleted = registryNoImageHeaderParserException;
        this.IAuthTabCallback = registryNoImageHeaderParserException.onTransact();
    }

    @Override // o.RegistryMissingComponentException, java.util.Iterator
    public T next() {
        onExtraCallback();
        this.onExtraCallbackWithResult = onWarmupCompleted();
        this.onNavigationEvent = true;
        return (T) super.next();
    }

    @Override // o.RegistryMissingComponentException, java.util.Iterator
    public void remove() {
        onNavigationEvent();
        if (hasNext()) {
            K kOnWarmupCompleted = onWarmupCompleted();
            TypeIntrinsics.asMutableMap(this.onWarmupCompleted).remove(this.onExtraCallbackWithResult);
            onWarmupCompleted(kOnWarmupCompleted != null ? kOnWarmupCompleted.hashCode() : 0, this.onWarmupCompleted.asBinder(), kOnWarmupCompleted, 0);
        } else {
            TypeIntrinsics.asMutableMap(this.onWarmupCompleted).remove(this.onExtraCallbackWithResult);
        }
        this.onExtraCallbackWithResult = null;
        this.onNavigationEvent = false;
        this.IAuthTabCallback = this.onWarmupCompleted.onTransact();
    }

    public final void onWarmupCompleted(K k, V v) {
        if (this.onWarmupCompleted.containsKey(k)) {
            if (hasNext()) {
                K kOnWarmupCompleted = onWarmupCompleted();
                this.onWarmupCompleted.put(k, v);
                onWarmupCompleted(kOnWarmupCompleted != null ? kOnWarmupCompleted.hashCode() : 0, this.onWarmupCompleted.asBinder(), kOnWarmupCompleted, 0);
            } else {
                this.onWarmupCompleted.put(k, v);
            }
            this.IAuthTabCallback = this.onWarmupCompleted.onTransact();
        }
    }

    private final void onWarmupCompleted(int i, ResourceEncoder<?, ?> resourceEncoder, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            IAuthTabCallback()[i2].IAuthTabCallback(resourceEncoder.onExtraCallbackWithResult(), resourceEncoder.onExtraCallbackWithResult().length, 0);
            while (!Intrinsics.areEqual(IAuthTabCallback()[i2].onExtraCallback(), k)) {
                IAuthTabCallback()[i2].asInterface();
            }
            IAuthTabCallback(i2);
            return;
        }
        int iIAuthTabCallback = 1 << ResourceCacheKey.IAuthTabCallback(i, i3);
        if (resourceEncoder.onNavigationEvent(iIAuthTabCallback)) {
            IAuthTabCallback()[i2].IAuthTabCallback(resourceEncoder.onExtraCallbackWithResult(), resourceEncoder.IAuthTabCallback() << 1, resourceEncoder.onExtraCallback(iIAuthTabCallback));
            IAuthTabCallback(i2);
        } else {
            int iOnWarmupCompleted = resourceEncoder.onWarmupCompleted(iIAuthTabCallback);
            ResourceEncoder<?, ?> resourceEncoderOnExtraCallbackWithResult = resourceEncoder.onExtraCallbackWithResult(iOnWarmupCompleted);
            IAuthTabCallback()[i2].IAuthTabCallback(resourceEncoder.onExtraCallbackWithResult(), resourceEncoder.IAuthTabCallback() << 1, iOnWarmupCompleted);
            onWarmupCompleted(i, resourceEncoderOnExtraCallbackWithResult, k, i2 + 1);
        }
    }

    private final void onNavigationEvent() {
        if (!this.onNavigationEvent) {
            throw new IllegalStateException();
        }
    }

    private final void onExtraCallback() {
        if (this.onWarmupCompleted.onTransact() != this.IAuthTabCallback) {
            throw new ConcurrentModificationException();
        }
    }
}
