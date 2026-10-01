package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class createFragmentManager {
    private final sendToApp onNavigationEvent;

    @Inject
    public createFragmentManager(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onNavigationEvent = sendtoapp;
    }
}
