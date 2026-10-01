package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class getCausesOrBuilderList {
    public static final void onNavigationEvent(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        getCommandLineBytes.onExtraCallbackWithResult.onNavigationEvent().nextBytes(bArr);
    }

    public static final Object onNavigationEvent(@NotNull getCommandLine getcommandline) {
        Intrinsics.checkNotNullParameter(getcommandline, "");
        return new getCausesList(getcommandline.onExtraCallback(), getcommandline.onNavigationEvent());
    }

    public static final long onWarmupCompleted(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return getCausesOrBuilder.onExtraCallback(bArr, i);
    }

    public static final void onNavigationEvent(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        getCausesOrBuilder.onExtraCallback(j, bArr, i, i2, i3);
    }

    public static final getCommandLine IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getCausesOrBuilder.onWarmupCompleted(str);
    }

    public static final getCommandLine onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getCausesOrBuilder.onNavigationEvent(str);
    }
}
