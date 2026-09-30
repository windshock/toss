package com.swmansion.gesturehandler.react.eventbuilders;

import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.RotationGestureHandler;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0;
import o.isScrap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RotationGestureHandlerEventDataBuilder extends isScrap<RotationGestureHandler> {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotationGestureHandlerEventDataBuilder(@NotNull RotationGestureHandler rotationGestureHandler) {
        super(rotationGestureHandler);
        Intrinsics.checkNotNullParameter(rotationGestureHandler, "");
        this.onNavigationEvent = rotationGestureHandler.receiveFile();
        this.onExtraCallback = rotationGestureHandler.newSession();
        this.IAuthTabCallback = rotationGestureHandler.postMessage();
        this.onExtraCallbackWithResult = rotationGestureHandler.requestPostMessageChannel();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putDouble("rotation", this.onNavigationEvent);
        writableMap.putDouble("anchorX", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.onExtraCallback));
        writableMap.putDouble("anchorY", CredentialProviderControllermaybeReportErrorFromResultReceiver1ExternalSyntheticLambda0.onExtraCallback(this.IAuthTabCallback));
        writableMap.putDouble("velocity", this.onExtraCallbackWithResult);
    }
}
