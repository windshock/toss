package o;

import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreRequest;
import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreResponse;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 {
    @getIv8(onExtraCallback = "api/v3/apps-in-toss-growth/game-center/leaderboard/score")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull SubmitGameCenterLeaderBoardScoreRequest submitGameCenterLeaderBoardScoreRequest, @NotNull access13800<? super BaseApiResponse<SubmitGameCenterLeaderBoardScoreResponse>> access13800Var);
}
