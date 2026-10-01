package o;

import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o.SidecarAdapterExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExtensionWindowBackendApi0ExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final hasOverlappingRendering onExtraCallbackWithResult(@NotNull Context context, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull SidecarAdapterExternalSyntheticLambda1.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        setImageDrawable setimagedrawable = new setImageDrawable(context);
        Executor mainExecutor = ContextCompat.getMainExecutor(context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        setimagedrawable.onNavigationEvent(mainExecutor, new SidecarAdapterExternalSyntheticLambda1(null, 0L, onnavigationevent, 3, null));
        setimagedrawable.IAuthTabCallback_Parcel();
        setimagedrawable.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0);
        setimagedrawable.onNavigationEvent(0);
        setimagedrawable.onExtraCallbackWithResult(1);
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return setimagedrawable;
    }
}
