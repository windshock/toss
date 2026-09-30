package o;

import kotlin.jvm.functions.Function1;
import o.addAllCommandLine;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addAllCauses<T, V> extends addAllCommandLine<V>, Function1<T, V> {

    public interface IAuthTabCallback<T, V> extends addAllCommandLine.IAuthTabCallback<V>, Function1<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    IAuthTabCallback<T, V> getGetter();
}
