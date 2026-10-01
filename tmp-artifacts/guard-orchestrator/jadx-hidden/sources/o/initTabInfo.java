package o;

import im.toss.devtool.domain.entity.SchemeHistoryEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class initTabInfo {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(initTabInfo.class);

    public static final getRunScene onNavigationEvent(@NotNull SchemeHistoryEntity schemeHistoryEntity) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
        Intrinsics.checkNotNullParameter(schemeHistoryEntity, "");
        getRunScene getrunscene = new getRunScene(schemeHistoryEntity.onExtraCallbackWithResult(), schemeHistoryEntity.onExtraCallback());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
        return getrunscene;
    }
}
