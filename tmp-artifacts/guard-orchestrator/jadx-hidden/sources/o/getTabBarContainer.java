package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class getTabBarContainer {
    private final sendToApp IAuthTabCallback;

    @Inject
    public getTabBarContainer(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.IAuthTabCallback = sendtoapp;
    }
}
