package im.toss.rn.toss.core.legacy.bundle.v2;

import java.util.Date;
import kotlin.Deprecated;
import kotlin.Unit;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface ReactLocalCacheBundleSource {
    void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    Object onExtraCallbackWithResult(@NotNull String str, @Nullable Long l, @Nullable Date date, @NotNull String str2, @NotNull String str3, @NotNull access13800<? super ReactBundle> access13800Var);

    Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var);
}
