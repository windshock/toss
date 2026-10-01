package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.StatusManager;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class doWork implements ReflectionUtilsExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @Inject
    public doWork() {
    }

    @Override // o.ReflectionUtilsExternalSyntheticLambda0
    public void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            StatusManager.Companion.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        StatusManager.Companion.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i3 = onExtraCallback + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
