package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.access5800;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access5500<T, V> extends addAllCauses<T, V>, access5800<V> {

    public interface onExtraCallbackWithResult<T, V> extends access5800.onExtraCallbackWithResult<V>, Function2<T, V, Unit> {
    }

    onExtraCallbackWithResult<T, V> getSetter();

    void set(T t, V v);
}
