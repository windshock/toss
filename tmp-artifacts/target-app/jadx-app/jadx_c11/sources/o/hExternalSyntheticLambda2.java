package o;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface hExternalSyntheticLambda2 {
    @ReactMethod
    void evaluateScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise);

    Map<String, Object> getConstants();

    @ReactMethod
    void prefetchScript(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise);
}
