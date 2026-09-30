package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.th3rdwave.safeareacontext.Rect;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StaggeredGridLayoutManager {
    public static final WritableMap onNavigationEvent(@NotNull destroyCallbacks destroycallbacks) {
        Intrinsics.checkNotNullParameter(destroycallbacks, "");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onExtraCallback()));
        writableMapCreateMap.putDouble("right", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.IAuthTabCallback()));
        writableMapCreateMap.putDouble("bottom", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onWarmupCompleted()));
        writableMapCreateMap.putDouble("left", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onExtraCallbackWithResult()));
        return writableMapCreateMap;
    }

    public static final Map<String, Float> onExtraCallbackWithResult(@NotNull destroyCallbacks destroycallbacks) {
        Intrinsics.checkNotNullParameter(destroycallbacks, "");
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("top", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onExtraCallback()))), getWrite.IAuthTabCallback("right", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.IAuthTabCallback()))), getWrite.IAuthTabCallback("bottom", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onWarmupCompleted()))), getWrite.IAuthTabCallback("left", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(destroycallbacks.onExtraCallbackWithResult())))});
    }

    public static final WritableMap onExtraCallback(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onExtraCallbackWithResult()));
        writableMapCreateMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onNavigationEvent()));
        writableMapCreateMap.putDouble("width", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onExtraCallback()));
        writableMapCreateMap.putDouble("height", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.IAuthTabCallback()));
        return writableMapCreateMap;
    }

    public static final Map<String, Float> onExtraCallbackWithResult(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "");
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("x", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onExtraCallbackWithResult()))), getWrite.IAuthTabCallback("y", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onNavigationEvent()))), getWrite.IAuthTabCallback("width", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.onExtraCallback()))), getWrite.IAuthTabCallback("height", Float.valueOf(CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(rect.IAuthTabCallback())))});
    }
}
