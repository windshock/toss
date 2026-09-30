package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isUpdated extends isScrap<addFlags> {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isUpdated(@NotNull addFlags addflags) {
        super(addflags);
        Intrinsics.checkNotNullParameter(addflags, "");
        this.onExtraCallback = addflags.writeTypedObject();
        this.IAuthTabCallback = addflags.extraCallback();
        this.onWarmupCompleted = addflags.readTypedObject();
        this.onNavigationEvent = addflags.ICustomTabsCallback();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        writableMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted));
        writableMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onNavigationEvent));
    }
}
