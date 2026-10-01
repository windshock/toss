package o;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import o.getLocationStatus;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class readBase64<T> {
    private final ConcurrentMap<String, getLocationStatus<T>> IAuthTabCallback = new ConcurrentHashMap(1);
    private final String onExtraCallbackWithResult;
    private final Function<String, getLocationStatus<T>> onWarmupCompleted;

    private readBase64(String str, Function<String, getLocationStatus<T>> function) {
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = function;
    }

    public static readBase64<List<String>> onExtraCallbackWithResult(String str) {
        return new readBase64<>(str, new Function() { // from class: io.opentelemetry.semconv.AttributeKeyTemplate$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return getLocationStatus.onTransact((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getLocationStatus<T> onWarmupCompleted(String str) {
        return this.onWarmupCompleted.apply(this.onExtraCallbackWithResult + "." + str);
    }
}
