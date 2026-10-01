package com.swmansion.rnscreens;

import android.content.Context;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderCreatePublicKeyCredentialControllerresultReceiver1onReceiveResult1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class ScreenStackHeaderConfig$DebugMenuToolbar extends CustomToolbar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackHeaderConfig$DebugMenuToolbar(@NotNull Context context, @NotNull ScreenStackHeaderConfig screenStackHeaderConfig) {
        super(context, screenStackHeaderConfig);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean showOverflowMenu() {
        CredentialProviderCreatePublicKeyCredentialControllerresultReceiver1onReceiveResult1 credentialProviderCreatePublicKeyCredentialControllerresultReceiver1onReceiveResult1IAuthTabCallback;
        ReactApplication applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "");
        ReactHost reactHostOnExtraCallback = applicationContext.onExtraCallback();
        if (reactHostOnExtraCallback == null || (credentialProviderCreatePublicKeyCredentialControllerresultReceiver1onReceiveResult1IAuthTabCallback = reactHostOnExtraCallback.IAuthTabCallback()) == null) {
            return true;
        }
        credentialProviderCreatePublicKeyCredentialControllerresultReceiver1onReceiveResult1IAuthTabCallback.onRelationshipValidationResult();
        return true;
    }
}
