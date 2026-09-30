package run.granite.microfrontend;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class NativeGraniteMicroFrontendRuntimeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "GraniteMicroFrontendRuntime";

    @ReactMethod
    public abstract void evaluateScript(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startEventDelivery();

    public NativeGraniteMicroFrontendRuntimeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nonnull
    public String getName() {
        return NAME;
    }

    protected final void emitOnEvent(ReadableMap readableMap) {
        ((BaseJavaModule) this).mEventEmitterCallback.invoke(new Object[]{"onEvent", readableMap});
    }
}
