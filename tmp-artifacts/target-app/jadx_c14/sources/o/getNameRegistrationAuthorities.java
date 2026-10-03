package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNameRegistrationAuthorities {
    private final String IAuthTabCallback;
    private final List<String> onExtraCallback;

    public getNameRegistrationAuthorities(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = list;
    }

    public final List<String> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }
}
