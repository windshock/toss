package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.addFeatureFlag;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addFeatureFlags {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final addFeatureFlags onNavigationEvent = new addFeatureFlags();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 13;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private addFeatureFlags() {
    }

    public final addFeatureFlag IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Query constraint must not be empty");
        }
        Object obj = null;
        if (StringsKt__StringsJVMKt.startsWith$default(str, "!", false, 2, null)) {
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (strSubstring.length() <= 0) {
                throw new IllegalArgumentException("Absent constraint must have a key after '!'");
            }
            addFeatureFlag.onWarmupCompleted onwarmupcompleted = new addFeatureFlag.onWarmupCompleted(strSubstring);
            int i4 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return new addFeatureFlag.onNavigationEvent(str);
        }
        String strSubstring2 = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        String strSubstring3 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        if (strSubstring2.length() <= 0) {
            throw new IllegalArgumentException(("Query constraint must have a non-empty key: '" + str + "'").toString());
        }
        int i6 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0 ? StringsKt__StringsJVMKt.startsWith$default(strSubstring3, "{", false, 2, null) : StringsKt__StringsJVMKt.startsWith$default(strSubstring3, "{", false, 5, null)) {
            if (StringsKt__StringsJVMKt.endsWith$default(strSubstring3, "}", false, 2, null)) {
                String strSubstring4 = strSubstring3.substring(1, strSubstring3.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                return onNavigationEvent(strSubstring2, strSubstring4, str);
            }
        }
        addFeatureFlag.IAuthTabCallback iAuthTabCallback = new addFeatureFlag.IAuthTabCallback(strSubstring2, strSubstring3);
        int i7 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return iAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final addFeatureFlag onNavigationEvent(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0 ? StringsKt__StringsJVMKt.startsWith$default(str2, ":", false, 2, null) : StringsKt__StringsJVMKt.startsWith$default(str2, ":", true, 3, null)) {
            String strSubstring = str2.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            addFeatureFlag.onExtraCallback onextracallback = new addFeatureFlag.onExtraCallback(str, new Regex(strSubstring));
            int i3 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onextracallback;
        }
        throw new IllegalArgumentException("Query constraint '" + str3 + "' uses named capture form which is no longer supported. Use anonymous regex '{:regex}' for value matching, and access raw query value via result.query.getString(\"" + str + "\") in the handler.");
    }
}
