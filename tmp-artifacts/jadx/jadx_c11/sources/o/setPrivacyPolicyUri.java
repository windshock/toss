package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setPrivacyPolicyUri {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Uri.parse(str).getQueryParameter(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Uri uri = Uri.parse(str);
        if (uri.getQueryParameter(str2) == null) {
            String string = uri.buildUpon().appendQueryParameter(str2, str3).build().toString();
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = uri.toString();
        Intrinsics.checkNotNull(string2);
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return string2;
    }

    public static final Uri.Builder onWarmupCompleted(@NotNull Uri.Builder builder, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 != null) {
            builder = builder.appendQueryParameter(str, str2);
            Intrinsics.checkNotNull(builder);
            int i4 = onExtraCallbackWithResult + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
        }
        int i6 = onExtraCallback + 37;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return builder;
    }
}
