package o;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class convertFromFingerToNPKI implements decryptForHidingPrivateKeyWithFinger {
    private final Function1<Context, readFileToByteArray> IAuthTabCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public convertFromFingerToNPKI(@NotNull Function1<? super Context, ? extends readFileToByteArray> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = function1;
    }

    @Override // o.decryptForHidingPrivateKeyWithFinger
    public readFileToByteArray onWarmupCompleted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.IAuthTabCallback.invoke(context);
    }
}
