package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface updateLayoutState {
    updateLayoutState IAuthTabCallback(@NotNull String str);

    String onExtraCallback(@NotNull String str, @Nullable String str2);

    updateLayoutState onWarmupCompleted();

    updateLayoutState onWarmupCompleted(@NotNull String str, @NotNull String str2);

    public static final class onExtraCallback {
        public static /* synthetic */ String onExtraCallbackWithResult(updateLayoutState updatelayoutstate, String str, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return updatelayoutstate.onExtraCallback(str, str2);
        }
    }
}
