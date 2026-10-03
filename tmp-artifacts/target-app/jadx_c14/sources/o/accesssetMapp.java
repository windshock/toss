package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.asArraylambda5;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetMapp {
    public static final String onWarmupCompleted(@NotNull Throwable th, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (th instanceof asArraylambda5.onExtraCallback) {
            String string = context.getString(R.string.create_password_not_three_or_more_numbers_exception);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        String string2 = context.getString(R.string.create_password_unexpected_exception);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }
}
