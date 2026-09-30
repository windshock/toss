package o;

import java.util.LinkedHashSet;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RawQueries {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final Throwable onWarmupCompleted(@NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (th.getCause() != null) {
            int i4 = IAuthTabCallback + 43;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                if (th.getCause() == th) {
                    break;
                }
                th = th.getCause();
                Intrinsics.checkNotNull(th);
            } else {
                int i5 = 49 / 0;
                if (th.getCause() == th) {
                    break;
                }
                th = th.getCause();
                Intrinsics.checkNotNull(th);
            }
        }
        return th;
    }

    public static /* synthetic */ String onNavigationEvent(Throwable th, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 35;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        if (i5 % 2 != 0 && (i3 & 1) != 0) {
            int i7 = i6 + 87;
            onWarmupCompleted = i7 % 128;
            i = i7 % 2 != 0 ? 114 : 50;
        }
        if ((i3 & 2) != 0) {
            int i8 = i6 + 111;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 51;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            i2 = 5;
        }
        return onExtraCallbackWithResult(th, i, i2);
    }

    public static final String onExtraCallbackWithResult(@NotNull Throwable th, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            IAuthTabCallback(th, i, i2);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        String strIAuthTabCallback = IAuthTabCallback(th, i, i2);
        int i5 = IAuthTabCallback + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final String IAuthTabCallback(Throwable th, int i, int i2) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder(1024);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i4 = 0;
        while (true) {
            if (th == null) {
                break;
            }
            int i5 = onWarmupCompleted + 125;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i4 >= i2) {
                break;
            }
            if (!linkedHashSet.add(th)) {
                sb.append("\t... (circular reference detected)");
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                break;
            }
            if (i4 > 0) {
                sb.append("Caused by: ");
                int i6 = onWarmupCompleted + 63;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 3;
                }
            }
            sb.append(th.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            int i8 = IAuthTabCallback + 27;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            for (StackTraceElement stackTraceElement : ArraysKt.take(stackTrace, i)) {
                sb.append("\tat ");
                sb.append(stackTraceElement);
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
            }
            if (stackTrace.length > i) {
                sb.append("\t... " + (stackTrace.length - i) + " more");
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
            }
            th = th.getCause();
            i4++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
