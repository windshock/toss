package o;

import com.krc.pl_card.enums.ResponseCode;
import com.krc.pl_card.exceptions.EpTagException;
import com.krc.pl_card.model.KorailTradeLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setPropagation extends TransitionTransitionNotificationExternalSyntheticLambda2<ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0, List<? extends KorailTradeLog>> {
    private final ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPropagation(@NotNull ThreePaneScaffoldNavigatorKtExternalSyntheticLambda0 threePaneScaffoldNavigatorKtExternalSyntheticLambda0) {
        super(threePaneScaffoldNavigatorKtExternalSyntheticLambda0);
        Intrinsics.checkNotNullParameter(threePaneScaffoldNavigatorKtExternalSyntheticLambda0, "");
        this.onWarmupCompleted = threePaneScaffoldNavigatorKtExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.TransitionTransitionNotificationExternalSyntheticLambda2
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public List<KorailTradeLog> onWarmupCompleted() throws EpTagException {
        try {
            this.onWarmupCompleted.onExtraCallbackWithResult();
            try {
                List<setProgressViewEndTarget> listIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
                Iterator<T> it = listIAuthTabCallback.iterator();
                while (it.hasNext()) {
                    arrayList.add(KorailTradeLog.Companion.a((setProgressViewEndTarget) it.next()));
                }
                return arrayList;
            } catch (Exception e) {
                ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e);
                throw new EpTagException(ResponseCode.ERROR_UNRECOGNIZED_CARD, "카드가 인식되지 않습니다.", null, 4, null);
            }
        } catch (Exception e2) {
            ApmHelper11.onNavigationEvent("통신 중 카드가 분리되었습니다.", e2);
            throw new EpTagException(ResponseCode.ERROR_UNRECOGNIZED_CARD, "카드가 인식되지 않습니다.", null, 4, null);
        }
    }
}
