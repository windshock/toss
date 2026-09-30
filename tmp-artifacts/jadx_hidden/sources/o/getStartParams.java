package o;

import im.toss.devtool.domain.entity.SchemeHistoryEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface getStartParams {
    String onExtraCallback();

    List<SchemeHistoryEntity> onExtraCallback(int i);

    void onExtraCallbackWithResult(@NotNull SchemeHistoryEntity schemeHistoryEntity);

    void onExtraCallbackWithResult(@NotNull String str);

    List<SchemeHistoryEntity> onWarmupCompleted();
}
