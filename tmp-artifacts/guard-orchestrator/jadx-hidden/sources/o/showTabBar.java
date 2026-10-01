package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class showTabBar {
    private final sendToApp onExtraCallbackWithResult;

    @Inject
    public showTabBar(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onExtraCallbackWithResult = sendtoapp;
    }
}
