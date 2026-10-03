package o;

import com.google.gson.JsonObject;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.AbsTransferRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class initializeLifecycleEventListenersForViewTag extends AbsTransferRequest {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Override // viva.republica.toss.network.model.SignatureRequest
    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userNo", PlayerErrorCode.onMinimized());
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        jsonObject.addProperty("to", (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()));
        jsonObject.addProperty("date", str);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
