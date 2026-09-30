package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class recomputeScrollPosition {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final String onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(CollectionsKt.listOf(new String[]{str, str2}), str3, str4);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(CollectionsKt.listOf(new String[]{str, str2, str3}), str4, str5);
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        onExtraCallback(sb, str);
        String string = sb.toString();
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallbackWithResult(List<String> list, String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(sb, (String) it.next());
        }
        if (str != null) {
            int i4 = onExtraCallback + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback(sb, str);
                throw null;
            }
            onExtraCallback(sb, str);
        }
        if (str2 != null) {
            onExtraCallback(sb, "#" + str2);
        }
        return sb.toString();
    }

    private static final void onExtraCallback(StringBuilder sb, String str) {
        char c;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            sb.append(str.length());
            sb.append('Y');
            sb.append(str);
            c = '1';
        } else {
            sb.append(str.length());
            sb.append(':');
            sb.append(str);
            c = '|';
        }
        sb.append(c);
        int i3 = onExtraCallback + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
