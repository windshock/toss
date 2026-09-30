package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeSubmitPersistentPostbacks implements addSdk {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Inject
    public maybeSubmitPersistentPostbacks() {
    }

    @Override // o.addSdk
    public Dialog onNavigationEvent(@NotNull Throwable th, @Nullable Context context, boolean z, @Nullable Function0<Unit> function0, @Nullable Function1<? super DialogInterface, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return getParamImp.onExtraCallback(th, context, z, (initMiniApp) null, function0, function1);
        }
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onExtraCallback(th, context, z, (initMiniApp) null, function0, function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
