package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class exitPage {
    private final sendToApp onNavigationEvent;

    @Inject
    public exitPage(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onNavigationEvent = sendtoapp;
    }
}
