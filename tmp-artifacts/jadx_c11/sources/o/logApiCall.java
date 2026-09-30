package o;

import java.util.Date;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface logApiCall {
    Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super Unit> access13800Var);

    Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Long l, @Nullable Date date, boolean z5, @Nullable String str5, boolean z6, @NotNull access13800<? super setAdReviewListener> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super Unit> access13800Var);

    static /* synthetic */ Object onExtraCallback(logApiCall logapicall, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, Long l, Date date, boolean z5, String str5, boolean z6, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return logapicall.onNavigationEvent(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : date, (i & 1024) != 0 ? true : z5, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? false : z6, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBundle");
    }
}
