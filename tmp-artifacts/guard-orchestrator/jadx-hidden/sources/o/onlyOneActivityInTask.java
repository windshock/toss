package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class onlyOneActivityInTask {
    private final sendToApp onWarmupCompleted;

    @Inject
    public onlyOneActivityInTask(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onWarmupCompleted = sendtoapp;
    }
}
