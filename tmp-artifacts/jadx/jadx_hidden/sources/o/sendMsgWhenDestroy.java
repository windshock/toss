package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class sendMsgWhenDestroy {
    private final sendToApp onWarmupCompleted;

    @Inject
    public sendMsgWhenDestroy(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onWarmupCompleted = sendtoapp;
    }
}
