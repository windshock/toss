package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum getLogs implements Callable<List<Object>>, deserializeIntNullableCollection<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> deserializeIntNullableCollection<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }

    @Override // o.deserializeIntNullableCollection
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }
}
