package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSScreenContentWrapperManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenContentWrapperManagerInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = ScreenContentWrapperManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenContentWrapperManager extends ViewGroupManager<ScreenContentWrapper> implements RNSScreenContentWrapperManagerInterface<ScreenContentWrapper> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenContentWrapper";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenContentWrapper> delegate;

    public ScreenContentWrapperManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenContentWrapperManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenContentWrapper createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenContentWrapper(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenContentWrapper> getDelegate() {
        return this.delegate;
    }
}
