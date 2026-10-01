package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class resetInternal extends isScrap<hasAnyOfTheFlags> {
    private final float IAuthTabCallback;
    private final float IAuthTabCallbackDefault;
    private final float IAuthTabCallbackStub;
    private final float asBinder;
    private final float asInterface;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final isAttachedToTransitionOverlay onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetInternal(@NotNull hasAnyOfTheFlags hasanyoftheflags) {
        super(hasanyoftheflags);
        Intrinsics.checkNotNullParameter(hasanyoftheflags, "");
        this.asBinder = hasanyoftheflags.writeTypedObject();
        this.asInterface = hasanyoftheflags.extraCallback();
        this.onExtraCallbackWithResult = hasanyoftheflags.readTypedObject();
        this.onNavigationEvent = hasanyoftheflags.ICustomTabsCallback();
        this.IAuthTabCallback = hasanyoftheflags.postMessage();
        this.onExtraCallback = hasanyoftheflags.receiveFile();
        this.IAuthTabCallbackDefault = hasanyoftheflags.prefetchWithMultipleUrls();
        this.IAuthTabCallbackStub = hasanyoftheflags.requestPostMessageChannelWithExtras();
        this.onWarmupCompleted = hasanyoftheflags.newSession();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("x", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.asBinder));
        writableMap.putDouble("y", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.asInterface));
        writableMap.putDouble("absoluteX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallbackWithResult));
        writableMap.putDouble("absoluteY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onNavigationEvent));
        writableMap.putDouble("translationX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        writableMap.putDouble("translationY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("velocityX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallbackDefault));
        writableMap.putDouble("velocityY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallbackStub));
        if (this.onWarmupCompleted.onNavigationEvent() == -1.0d) {
            return;
        }
        writableMap.putMap("stylusData", this.onWarmupCompleted.IAuthTabCallback());
    }
}
