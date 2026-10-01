package com.teleport.host;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.teleport.managers.TeleportViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.onViewReleased;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import o.tryCaptureView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = PortalHostViewManager.NAME)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PortalHostViewManager extends TeleportViewManager implements onViewReleased<ReactViewGroup> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
    public static final String NAME = "PortalHostView";
    private final tryCaptureView<ReactViewGroup, PortalHostViewManager> delegate = new tryCaptureView<>(this);

    public String getName() {
        return NAME;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ReactViewGroup> getDelegate() {
        return this.delegate;
    }

    @Override // com.teleport.managers.TeleportViewManager
    public ReactViewGroup createTeleportView(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new PortalHostView(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void onDropViewInstance(@NotNull ReactViewGroup reactViewGroup) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        super.onDropViewInstance(reactViewGroup);
        PortalHostView portalHostView = reactViewGroup instanceof PortalHostView ? (PortalHostView) reactViewGroup : null;
        if (portalHostView != null) {
            portalHostView.onWarmupCompleted();
        }
    }

    @ReactProp(IAuthTabCallbackStub = "name")
    public void setName(@Nullable ReactViewGroup reactViewGroup, @Nullable String str) {
        PortalHostView portalHostView = reactViewGroup instanceof PortalHostView ? (PortalHostView) reactViewGroup : null;
        if (portalHostView != null) {
            portalHostView.setName(str);
        }
    }
}
