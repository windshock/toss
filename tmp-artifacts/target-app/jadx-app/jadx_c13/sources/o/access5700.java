package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.access5800;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access5700<V> extends addAllMemoryMappings<V>, access5800<V> {

    public interface onExtraCallback<V> extends access5800.onExtraCallbackWithResult<V>, Function1<V, Unit> {
    }

    onExtraCallback<V> getSetter();

    void set(V v);
}
