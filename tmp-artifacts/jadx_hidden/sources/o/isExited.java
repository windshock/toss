package o;

import im.toss.devtool.domain.entity.SchemeHistoryEntity;
import java.util.Date;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class isExited {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(isExited.class);
    private final getStartParams onWarmupCompleted;

    @Inject
    public isExited(@NotNull getStartParams getstartparams) {
        Intrinsics.checkNotNullParameter(getstartparams, "");
        this.onWarmupCompleted = getstartparams;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512);
        Intrinsics.checkNotNullParameter(str, "");
        getStartParams getstartparams = this.onWarmupCompleted;
        String str2 = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(new Date());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        SchemeHistoryEntity schemeHistoryEntity = new SchemeHistoryEntity(str, str2);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3487);
        getstartparams.onExtraCallbackWithResult(schemeHistoryEntity);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4550);
    }
}
