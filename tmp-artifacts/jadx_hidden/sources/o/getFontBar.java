package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class getFontBar {
    private final sendToApp onExtraCallbackWithResult;

    @Inject
    public getFontBar(@NotNull sendToApp sendtoapp) {
        Intrinsics.checkNotNullParameter(sendtoapp, "");
        this.onExtraCallbackWithResult = sendtoapp;
    }
}
