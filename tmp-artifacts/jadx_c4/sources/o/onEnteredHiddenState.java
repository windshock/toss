package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onEnteredHiddenState extends isScrap<flagRemovedAndOffsetPosition> {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final isAttachedToTransitionOverlay onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onEnteredHiddenState(@NotNull flagRemovedAndOffsetPosition flagremovedandoffsetposition) {
        super(flagremovedandoffsetposition);
        Intrinsics.checkNotNullParameter(flagremovedandoffsetposition, "");
        this.onWarmupCompleted = flagremovedandoffsetposition.writeTypedObject();
        this.onExtraCallback = flagremovedandoffsetposition.extraCallback();
        this.onNavigationEvent = flagremovedandoffsetposition.readTypedObject();
        this.IAuthTabCallback = flagremovedandoffsetposition.ICustomTabsCallback();
        this.onExtraCallbackWithResult = flagremovedandoffsetposition.postMessage();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onWarmupCompleted));
        writableMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onNavigationEvent));
        writableMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        if (this.onExtraCallbackWithResult.onNavigationEvent() == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", this.onExtraCallbackWithResult.IAuthTabCallback());
    }
}
