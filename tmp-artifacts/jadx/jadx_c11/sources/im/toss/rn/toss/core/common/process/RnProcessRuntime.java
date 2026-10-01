package im.toss.rn.toss.core.common.process;

import android.app.Application;
import android.os.Build;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnProcessRuntime {
    private static volatile String IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final RnProcessRuntime onWarmupCompleted = new RnProcessRuntime();

    static {
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private RnProcessRuntime() {
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(onExtraCallbackWithResult());
        int i4 = onExtraCallback + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback = str;
        int i3 = onExtraCallback + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean onExtraCallbackWithResult(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str2 = IAuthTabCallback;
        if (str2 != null) {
            return onWarmupCompleted(str, str2);
        }
        int i4 = onTransact;
        int i5 = i4 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 71;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean onWarmupCompleted(@Nullable String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zAreEqual = Intrinsics.areEqual(str, str2 + ":rn_remote");
        int i2 = onExtraCallback + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return zAreEqual;
    }

    private final String onExtraCallbackWithResult() {
        Object obj;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj2 = null;
            try {
                Result.Companion companion = Result.Companion;
                String strSubstringBefore$default = StringsKt.substringBefore$default(FilesKt.readText(new File("/proc/self/cmdline"), Charsets.ISO_8859_1), (char) 0, (String) null, 2, (Object) null);
                if (StringsKt.isBlank(strSubstringBefore$default)) {
                    strSubstringBefore$default = null;
                }
                obj = Result.constructor-impl(strSubstringBefore$default);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (!Result.onExtraCallback(obj)) {
                obj2 = obj;
            } else {
                int i2 = onTransact + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            return (String) obj2;
        }
        int i4 = onTransact + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return Application.getProcessName();
        }
        int i5 = 5 / 0;
        return Application.getProcessName();
    }
}
