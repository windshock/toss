package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class createTabBar {
    private final sendToApp IAuthTabCallback;

    @Inject
    public createTabBar(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.IAuthTabCallback = sendtoapp;
    }
}
