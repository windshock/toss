package o;

import android.content.Context;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkForegroundRunnableExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final String onExtraCallback(@NotNull String str, @NotNull Object... objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(objArr, "");
            int length = objArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        if (objArr.length == 0) {
            return str;
        }
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int i3 = onWarmupCompleted + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            return str2;
        } catch (IllegalFormatException unused) {
            return str;
        }
    }

    public static final String onWarmupCompleted(@NotNull String str, @NotNull Locale locale, @NotNull Object... objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        if (objArr.length != 0) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            } catch (IllegalFormatException unused) {
                return str;
            }
        }
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String onExtraCallbackWithResult(@NotNull Context context, int i, @NotNull Object... objArr) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intrinsics.checkNotNull(locale);
        String strOnWarmupCompleted = onWarmupCompleted(string, locale, Arrays.copyOf(objArr, objArr.length));
        int i5 = onWarmupCompleted + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return strOnWarmupCompleted;
    }
}
