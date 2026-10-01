package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFlags extends isScrap<isInvalid> {
    private final double IAuthTabCallback;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final double onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFlags(@NotNull isInvalid isinvalid) {
        super(isinvalid);
        Intrinsics.checkNotNullParameter(isinvalid, "");
        this.onWarmupCompleted = isinvalid.receiveFile();
        this.onExtraCallback = isinvalid.newSession();
        this.onExtraCallbackWithResult = isinvalid.postMessage();
        this.IAuthTabCallback = isinvalid.prefetchWithMultipleUrls();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("scale", this.onWarmupCompleted);
        writableMap.putDouble("focalX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("focalY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallbackWithResult));
        writableMap.putDouble("velocity", this.IAuthTabCallback);
    }
}
