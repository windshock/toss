package o;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isNeedUnzip {
    public static /* synthetic */ waitForLayout onExtraCallbackWithResult(getPackageType getpackagetype, int i, Object obj) {
        if ((i & 1) != 0) {
            getpackagetype = null;
        }
        return IAuthTabCallback(getpackagetype);
    }

    public static final waitForLayout IAuthTabCallback(@Nullable getPackageType getpackagetype) {
        return new getMd5(getpackagetype);
    }

    public static final <R> Object onWarmupCompleted(@NotNull Function2<? super findResAndMsg, ? super access13800<? super R>, ? extends Object> function2, @NotNull access13800<? super R> access13800Var) {
        getUrlList geturllist = new getUrlList(access13800Var.getContext(), access13800Var);
        Object objOnWarmupCompleted = fromInt.onWarmupCompleted(geturllist, geturllist, function2);
        if (objOnWarmupCompleted == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnWarmupCompleted;
    }
}
