package o;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface s8ExternalSyntheticLambda2 {
    void IAuthTabCallback(@NotNull Context context);

    void onExtraCallback(@NotNull Context context);

    Object onExtraCallbackWithResult(@NotNull Context context, @NotNull access13800<? super Unit> access13800Var);

    Intent onWarmupCompleted(@NotNull Context context);
}
