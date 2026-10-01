package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeLongNullableCollection extends AtomicReference<deserializeFloatArray> implements deserializeUriNullableCollection {
    private static final long serialVersionUID = 5718521705281392066L;

    public deserializeLongNullableCollection(deserializeFloatArray deserializefloatarray) {
        super(deserializefloatarray);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return get() == null;
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeFloatArray andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            NumberConverter.onWarmupCompleted(e);
            RxJavaPlugins.onExtraCallbackWithResult(e);
        }
    }
}
