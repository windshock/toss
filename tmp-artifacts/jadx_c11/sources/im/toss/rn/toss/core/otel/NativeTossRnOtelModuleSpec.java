package im.toss.rn.toss.core.otel;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class NativeTossRnOtelModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "TossRnOtelModule";
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @ReactMethod
    public abstract void exportOtlp(String str, String str2, ReadableMap readableMap, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCurrentNativeContext();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getNativeResource();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getTimeOffsetMs();

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean shouldExportMetric();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean shouldSample(ReadableMap readableMap);

    public NativeTossRnOtelModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nonnull
    public String getName() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return NAME;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getConstants() {
        int i = 2 % 2;
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        Object obj = null;
        if (!ReactBuildConfig.onNavigationEvent) {
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                boolean z = ReactBuildConfig.onWarmupCompleted;
                obj.hashCode();
                throw null;
            }
            if (ReactBuildConfig.onWarmupCompleted) {
                HashSet hashSet = new HashSet(Arrays.asList("moduleVersion"));
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
                hashSet3.removeAll(hashSet);
                hashSet3.removeAll(hashSet2);
                if (!hashSet3.isEmpty()) {
                    throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
                }
                int i3 = onNavigationEvent + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                hashSet.removeAll(typedExportedConstants.keySet());
                if (!hashSet.isEmpty()) {
                    throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
                }
            }
        }
        int i5 = onNavigationEvent + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return typedExportedConstants;
        }
        obj.hashCode();
        throw null;
    }
}
