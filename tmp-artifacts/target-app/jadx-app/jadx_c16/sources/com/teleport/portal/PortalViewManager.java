package com.teleport.portal;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.teleport.managers.TeleportViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.DataBinderMapperImpl;
import o.MergedDataBinderMapper;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = PortalViewManager.NAME)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PortalViewManager extends TeleportViewManager implements MergedDataBinderMapper<ReactViewGroup> {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    public static final String NAME = "PortalView";
    private final DataBinderMapperImpl<ReactViewGroup, PortalViewManager> delegate = new DataBinderMapperImpl<>(this);

    public String getName() {
        return NAME;
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ReactViewGroup> getDelegate() {
        return this.delegate;
    }

    @Override // com.teleport.managers.TeleportViewManager
    public ReactViewGroup createTeleportView(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new PortalView(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public void onDropViewInstance(@NotNull ReactViewGroup reactViewGroup) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        PortalView portalView = reactViewGroup instanceof PortalView ? (PortalView) reactViewGroup : null;
        if (portalView != null) {
            portalView.onExtraCallback();
        }
        super.onDropViewInstance(reactViewGroup);
    }

    public Object updateState(@NotNull ReactViewGroup reactViewGroup, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        PortalView portalView = reactViewGroup instanceof PortalView ? (PortalView) reactViewGroup : null;
        if (portalView != null) {
            portalView.setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        }
        return super/*com.facebook.react.uimanager.ViewManager*/.updateState(reactViewGroup, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
    }

    @ReactProp(IAuthTabCallbackStub = "hostName")
    public void setHostName(@Nullable ReactViewGroup reactViewGroup, @Nullable String str) {
        PortalView portalView = reactViewGroup instanceof PortalView ? (PortalView) reactViewGroup : null;
        if (portalView != null) {
            portalView.setHostName(str);
        }
    }
}
