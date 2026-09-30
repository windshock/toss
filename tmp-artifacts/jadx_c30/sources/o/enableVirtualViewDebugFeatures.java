package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class enableVirtualViewDebugFeatures {
    public static final String onWarmupCompleted(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = context.getString(R.string.guest_password_reset_account_verification_title);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        return string;
    }
}
