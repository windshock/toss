package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mue {
    public static final <T> jp<T> onExtraCallback(@NotNull xf<T> xfVar, @NotNull yw ywVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(xfVar, "");
        Intrinsics.checkNotNullParameter(ywVar, "");
        jp<T> jpVarOnExtraCallbackWithResult = xfVar.onExtraCallbackWithResult(ywVar, str);
        if (jpVarOnExtraCallbackWithResult != null) {
            return jpVarOnExtraCallbackWithResult;
        }
        zk.onExtraCallbackWithResult(str, xfVar.onExtraCallbackWithResult());
        throw new setWrite();
    }

    public static final <T> py<T> onNavigationEvent(@NotNull xf<T> xfVar, @NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(xfVar, "");
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        py<T> pyVarOnWarmupCompleted = xfVar.onWarmupCompleted(encoder, t);
        if (pyVarOnWarmupCompleted != null) {
            return pyVarOnWarmupCompleted;
        }
        zk.onExtraCallback(Reflection.getOrCreateKotlinClass(t.getClass()), xfVar.onExtraCallbackWithResult());
        throw new setWrite();
    }
}
