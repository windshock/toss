package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Function1<q4ExternalSyntheticLambda10, Unit> onExtraCallbackWithResult;
    private final Function0<q4ExternalSyntheticLambda3> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public q4ExternalSyntheticLambda4(@NotNull Function0<q4ExternalSyntheticLambda3> function0, @NotNull Function1<? super q4ExternalSyntheticLambda10, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function0;
        this.onExtraCallbackWithResult = function1;
    }

    public final void onNavigationEvent(@NotNull q4ExternalSyntheticLambda10 q4externalsyntheticlambda10) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
            q4ExternalSyntheticLambda8.IAuthTabCallback(q4externalsyntheticlambda10, this.onExtraCallbackWithResult);
        } else {
            Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
            q4ExternalSyntheticLambda8.IAuthTabCallback(q4externalsyntheticlambda10, this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public final q4ExternalSyntheticLambda3 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) this.onWarmupCompleted.invoke();
        int i4 = IAuthTabCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return q4externalsyntheticlambda3;
    }
}
