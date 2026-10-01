package o;

import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.EpTagException;
import com.krc.pl_card.model.dto.info.KorailCardInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setStartDelay extends TransitionTransitionNotificationExternalSyntheticLambda2<ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0, KorailCardInfo> {
    private final ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setStartDelay(@NotNull ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 threePaneScaffoldNavigatorKtExternalSyntheticLambda0) {
        super(threePaneScaffoldNavigatorKtExternalSyntheticLambda0);
        Intrinsics.checkNotNullParameter(threePaneScaffoldNavigatorKtExternalSyntheticLambda0, "");
        this.onWarmupCompleted = threePaneScaffoldNavigatorKtExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.TransitionTransitionNotificationExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public KorailCardInfo onWarmupCompleted() throws EpTagException {
        try {
            ThreePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0 threePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
            try {
                try {
                    return new KorailCardInfo(threePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallback(), threePaneScaffoldPredictiveBackHandler_androidKtExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback(), this.onWarmupCompleted.onNavigationEvent(), this.onWarmupCompleted.onWarmupCompleted());
                } catch (Exception e) {
                    ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e);
                    throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
                }
            } catch (Exception e2) {
                ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e2);
                throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
            }
        } catch (EpTagException e3) {
            ApmHelper11.onNavigationEvent("인식된 카드가 레일플러스 카드가 아닙니다.", e3);
            throw e3;
        } catch (Exception e4) {
            ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e4);
            throw new EpTagException(ResponseCode.ERROR_TAG_LOST, "통신 중 카드가 분리되었습니다.", null, 4, null);
        }
    }
}
