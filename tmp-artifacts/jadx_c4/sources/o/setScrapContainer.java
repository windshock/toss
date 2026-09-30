package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setScrapContainer extends isScrap<isRecyclable> {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setScrapContainer(@NotNull isRecyclable isrecyclable) {
        super(isrecyclable);
        Intrinsics.checkNotNullParameter(isrecyclable, "");
        this.IAuthTabCallback = isrecyclable.writeTypedObject();
        this.onExtraCallbackWithResult = isrecyclable.extraCallback();
        this.onExtraCallback = isrecyclable.readTypedObject();
        this.onNavigationEvent = isrecyclable.ICustomTabsCallback();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        writableMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallbackWithResult));
        writableMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onNavigationEvent));
    }
}
