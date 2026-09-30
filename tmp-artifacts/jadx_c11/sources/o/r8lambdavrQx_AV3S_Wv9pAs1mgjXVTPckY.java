package o;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY {
    Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Long l, @Nullable Date date, @Nullable String str4, @NotNull access13800<? super setRequestListener> access13800Var);

    static /* synthetic */ Object onExtraCallbackWithResult(r8lambdavrQx_AV3S_Wv9pAs1mgjXVTPckY r8lambdavrqx_av3s_wv9pas1mgjxvtpcky, String str, String str2, String str3, Long l, Date date, String str4, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return r8lambdavrqx_av3s_wv9pas1mgjxvtpcky.onNavigationEvent(str, str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : str4, access13800Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBundle");
    }
}
