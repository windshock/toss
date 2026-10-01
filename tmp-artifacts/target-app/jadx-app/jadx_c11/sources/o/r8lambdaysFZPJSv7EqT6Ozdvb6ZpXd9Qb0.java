package o;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 {
    Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Date date, @NotNull access13800<? super setRequestListener> access13800Var);

    static /* synthetic */ Object onExtraCallback(r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, String str, String str2, String str3, Date date, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBundle");
        }
        if ((i & 8) != 0) {
            date = null;
        }
        return r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0.onNavigationEvent(str, str2, str3, date, access13800Var);
    }
}
