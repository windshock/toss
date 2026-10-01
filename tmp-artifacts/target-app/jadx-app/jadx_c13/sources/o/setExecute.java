package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setExecute {
    public static String onExtraCallbackWithResult(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StringWriter stringWriter = new StringWriter();
        new PrintWriter(stringWriter).flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static void onNavigationEvent(@NotNull Throwable th, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (th != th2) {
            access15700.onExtraCallbackWithResult.onExtraCallbackWithResult(th, th2);
        }
    }

    public static List<Throwable> IAuthTabCallback(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return access15700.onExtraCallbackWithResult.IAuthTabCallback(th);
    }
}
