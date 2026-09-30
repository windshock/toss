package im.toss.rn.toss.core.bundle.source;

import im.toss.rn.toss.core.bundle.model.RemoteBundleResult;
import java.util.Date;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface RemoteBundleSource {
    Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @Nullable Date date, @Nullable String str5, @NotNull access13800<? super RemoteBundleResult> access13800Var);

    Object onWarmupCompleted(@NotNull String str, int i, @NotNull access13800<? super Boolean> access13800Var);

    static /* synthetic */ Object IAuthTabCallback(RemoteBundleSource remoteBundleSource, String str, String str2, String str3, String str4, boolean z, Date date, String str5, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return remoteBundleSource.onNavigationEvent(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : date, (i & 64) != 0 ? null : str5, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBundle");
    }
}
