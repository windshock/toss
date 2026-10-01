package im.toss.devtool.sharedpref.domain.usecase.item;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RestorePrefUseCase {
    private final Object onExtraCallback;

    @Inject
    public RestorePrefUseCase(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.onExtraCallback = obj;
    }
}
