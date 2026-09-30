package com.teleport.managers;

import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class TeleportViewManager extends ReactViewManager {
    protected abstract ReactViewGroup createTeleportView(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2);

    public final void forceBoxNone(@NotNull ReactViewGroup reactViewGroup) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        super.setPointerEvents(reactViewGroup, "box-none");
    }

    public ReactViewGroup createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        ReactViewGroup reactViewGroupCreateTeleportView = createTeleportView(credentialProviderGetSignInIntentControllerhandleResponse2);
        forceBoxNone(reactViewGroupCreateTeleportView);
        return reactViewGroupCreateTeleportView;
    }

    public ReactViewGroup prepareToRecycleView(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull ReactViewGroup reactViewGroup) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        super.prepareToRecycleView(credentialProviderGetSignInIntentControllerhandleResponse2, reactViewGroup);
        forceBoxNone(reactViewGroup);
        return reactViewGroup;
    }
}
