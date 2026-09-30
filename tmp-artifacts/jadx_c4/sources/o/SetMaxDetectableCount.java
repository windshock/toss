package o;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SetMaxDetectableCount {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private final File IAuthTabCallback;
    private final String onExtraCallback;
    private final long onNavigationEvent;
    private final String onWarmupCompleted;

    public SetMaxDetectableCount(@NotNull File file, long j, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = file;
        this.onNavigationEvent = j;
        this.onWarmupCompleted = str;
        this.onExtraCallback = str2;
    }

    public final File onExtraCallbackWithResult() {
        File file;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            file = this.IAuthTabCallback;
            int i4 = 55 / 0;
        } else {
            file = this.IAuthTabCallback;
        }
        int i5 = i2 + 35;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
