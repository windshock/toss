package o;

import im.toss.core.tracker.TossReferrerTemplate;
import java.util.List;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface GetInputImageFromPathAsGrayScale {
    String IAuthTabCallback(@Nullable downloadZip downloadzip);

    boolean onExtraCallback(@Nullable downloadZip downloadzip);

    List<Regex> onExtraCallbackWithResult();

    boolean onExtraCallbackWithResult(@Nullable downloadZip downloadzip);

    TossReferrerTemplate onWarmupCompleted(@NotNull String str);

    void onWarmupCompleted();
}
