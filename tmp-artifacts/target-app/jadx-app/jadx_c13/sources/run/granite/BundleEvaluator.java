package run.granite;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BundleEvaluator {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final ReactContext onNavigationEvent;

    private final native void evaluateFileSync(long j, String str, String str2);

    private final native void evaluateJavascriptSync(long j, byte[] bArr, String str);

    public BundleEvaluator(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "");
        this.onNavigationEvent = reactContext;
    }

    public final void onNavigationEvent(@NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        JavaScriptContextHolder javaScriptContextHolder = this.onNavigationEvent.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null) {
            throw new IllegalStateException("javaScriptContextHolder is null.");
        }
        evaluateJavascriptSync(javaScriptContextHolder.get(), bArr, str);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException("Bundle file not found: " + str);
        }
        if (!file.canRead()) {
            throw new IOException("Bundle file not readable (permission denied): " + str);
        }
        JavaScriptContextHolder javaScriptContextHolder = this.onNavigationEvent.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null) {
            throw new IllegalStateException("javaScriptContextHolder is null.");
        }
        evaluateFileSync(javaScriptContextHolder.get(), str, str2);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final void IAuthTabCallback(@NotNull byte[] bArr, @NotNull String str, @NotNull ReactContext reactContext) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(reactContext, "");
            new BundleEvaluator(reactContext).onNavigationEvent(bArr, str);
        }

        public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull ReactContext reactContext) throws IOException {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(reactContext, "");
            new BundleEvaluator(reactContext).onExtraCallbackWithResult(str, str2);
        }
    }

    static {
        System.loadLibrary("granite-screen");
    }
}
