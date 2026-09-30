package o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface RetrofitInstance {
    static /* synthetic */ Object onExtraCallbackWithResult(RetrofitInstance retrofitInstance, Throwable th, List<JsonObject> list, access13800<? super kotlin.Result<Unit>> access13800Var) {
        int i = 2 % 2;
        return null;
    }

    default boolean IAuthTabCallback(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        return false;
    }

    default Object onExtraCallback(@NotNull Throwable th, @NotNull List<JsonObject> list, @NotNull access13800<? super kotlin.Result<Unit>> access13800Var) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(this, th, list, access13800Var);
    }

    Object onWarmupCompleted(@NotNull List<JsonObject> list, @NotNull access13800<? super kotlin.Result<Unit>> access13800Var);
}
