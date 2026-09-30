package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNSScreenFooterManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenFooterManagerInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = ScreenFooterManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenFooterManager extends ViewGroupManager<ScreenFooter> implements RNSScreenFooterManagerInterface<ScreenFooter> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenFooter";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenFooter> delegate;

    public ScreenFooterManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenFooterManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenFooter createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenFooter(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenFooter> getDelegate() {
        return this.delegate;
    }
}
