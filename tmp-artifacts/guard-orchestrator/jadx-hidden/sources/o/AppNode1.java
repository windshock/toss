package o;

import im.toss.devtool.domain.entity.SchemeHistoryEntity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppNode1 implements getStartParams {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode1.class);
    public static final AppNode1 onExtraCallback = new AppNode1();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
    }

    @Override // o.getStartParams
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 23) & 1) != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.getStartParams
    public void onExtraCallbackWithResult(@NotNull SchemeHistoryEntity schemeHistoryEntity) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        Intrinsics.checkNotNullParameter(schemeHistoryEntity, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
    }

    @Override // o.getStartParams
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
        Intrinsics.checkNotNullParameter(str, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
    }

    private AppNode1() {
    }

    @Override // o.getStartParams
    public List<SchemeHistoryEntity> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 11) & 1) != 0) {
            CollectionsKt.emptyList();
            throw null;
        }
        List<SchemeHistoryEntity> listEmptyList = CollectionsKt.emptyList();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        return listEmptyList;
    }

    @Override // o.getStartParams
    public List<SchemeHistoryEntity> onExtraCallback(int i) {
        int i2 = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        List<SchemeHistoryEntity> listEmptyList = CollectionsKt.emptyList();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        return listEmptyList;
    }
}
