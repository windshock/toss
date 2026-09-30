package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class saveOldPosition extends isScrap<getOldPosition> {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saveOldPosition(@NotNull getOldPosition getoldposition) {
        super(getoldposition);
        Intrinsics.checkNotNullParameter(getoldposition, "");
        this.onNavigationEvent = getoldposition.writeTypedObject();
        this.IAuthTabCallback = getoldposition.extraCallback();
        this.onWarmupCompleted = getoldposition.readTypedObject();
        this.onExtraCallback = getoldposition.ICustomTabsCallback();
        this.onExtraCallbackWithResult = getoldposition.newSession();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onNavigationEvent));
        writableMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        writableMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted));
        writableMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putInt("duration", this.onExtraCallbackWithResult);
    }
}
