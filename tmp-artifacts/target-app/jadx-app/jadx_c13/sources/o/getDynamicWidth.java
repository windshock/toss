package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getDynamicWidth<K, V, R> implements KSerializer<R> {
    private final KSerializer<K> onExtraCallback;
    private final KSerializer<V> onNavigationEvent;

    public /* synthetic */ getDynamicWidth(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    protected abstract K IAuthTabCallback(R r);

    protected abstract V onExtraCallback(R r);

    protected abstract R onExtraCallback(K k, V v);

    private getDynamicWidth(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        this.onExtraCallback = kSerializer;
        this.onNavigationEvent = kSerializer2;
    }

    protected final KSerializer<K> onExtraCallback() {
        return this.onExtraCallback;
    }

    protected final KSerializer<V> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, R r) {
        Intrinsics.checkNotNullParameter(encoder, "");
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(getDescriptor());
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor(), 0, this.onExtraCallback, IAuthTabCallback(r));
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor(), 1, this.onNavigationEvent, onExtraCallback(r));
        vylVarOnExtraCallback.onNavigationEvent(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.jp
    public R deserialize(@NotNull Decoder decoder) {
        R r;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor descriptor = getDescriptor();
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Object objOnExtraCallback = pmi111.onWarmupCompleted;
            Object objOnExtraCallback2 = pmi111.onWarmupCompleted;
            while (true) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(getDescriptor());
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent == 0) {
                        objOnExtraCallback = yw.onExtraCallback(ywVarOnWarmupCompleted, getDescriptor(), 0, onExtraCallback(), null, 8, null);
                    } else if (iOnNavigationEvent == 1) {
                        objOnExtraCallback2 = yw.onExtraCallback(ywVarOnWarmupCompleted, getDescriptor(), 1, IAuthTabCallback(), null, 8, null);
                    } else {
                        throw new qn("Invalid index: " + iOnNavigationEvent);
                    }
                } else if (objOnExtraCallback != pmi111.onWarmupCompleted) {
                    if (objOnExtraCallback2 == pmi111.onWarmupCompleted) {
                        throw new qn("Element 'value' is missing");
                    }
                    r = (R) onExtraCallback(objOnExtraCallback, objOnExtraCallback2);
                } else {
                    throw new qn("Element 'key' is missing");
                }
            }
        } else {
            r = (R) onExtraCallback(yw.onExtraCallback(ywVarOnWarmupCompleted, getDescriptor(), 0, onExtraCallback(), null, 8, null), yw.onExtraCallback(ywVarOnWarmupCompleted, getDescriptor(), 1, IAuthTabCallback(), null, 8, null));
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(descriptor);
        return r;
    }
}
