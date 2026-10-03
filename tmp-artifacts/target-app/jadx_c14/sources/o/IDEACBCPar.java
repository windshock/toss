package o;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class IDEACBCPar {
    public static /* synthetic */ void onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, int i, Bundle bundle, setPositionProvider setpositionprovider, PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            setpositionprovider = null;
        }
        if ((i2 & 8) != 0) {
            iAuthTabCallback = null;
        }
        onWarmupCompleted(typographyKtExternalSyntheticLambda0, i, bundle, setpositionprovider, iAuthTabCallback);
    }

    public static final void onWarmupCompleted(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, int i, @Nullable Bundle bundle, @Nullable setPositionProvider setpositionprovider, @Nullable PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        TextKtExternalSyntheticLambda5 textKtExternalSyntheticLambda5IAuthTabCallback;
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface = typographyKtExternalSyntheticLambda0.asInterface();
        if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface == null || (textKtExternalSyntheticLambda5IAuthTabCallback = exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface.IAuthTabCallback(i)) == null) {
            textKtExternalSyntheticLambda5IAuthTabCallback = typographyKtExternalSyntheticLambda0.asBinder().IAuthTabCallback(i);
        }
        if (textKtExternalSyntheticLambda5IAuthTabCallback != null) {
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda2 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 = typographyKtExternalSyntheticLambda0.asInterface();
            if (exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2 == null || exposedDropdownMenuPopup_androidKtExternalSyntheticLambda2AsInterface2.asInterface() != textKtExternalSyntheticLambda5IAuthTabCallback.onWarmupCompleted()) {
                typographyKtExternalSyntheticLambda0.onExtraCallbackWithResult(i, bundle, setpositionprovider, iAuthTabCallback);
            }
        }
    }
}
