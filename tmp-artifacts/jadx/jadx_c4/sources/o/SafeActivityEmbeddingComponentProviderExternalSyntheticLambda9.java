package o;

import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreRequest;
import im.toss.appsintoss.leaderboard.model.SubmitGameCenterLeaderBoardScoreResponse;
import im.toss.network.model.BaseApiResponse;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9 implements SafeWindowLayoutComponentProviderExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 IAuthTabCallback;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9.this.onWarmupCompleted(null, null, null, this);
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9(@NotNull SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 splitAttributesSplitTypeCompanionExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(splitAttributesSplitTypeCompanionExternalSyntheticLambda0, "");
        this.IAuthTabCallback = splitAttributesSplitTypeCompanionExternalSyntheticLambda0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // o.SafeWindowLayoutComponentProviderExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull access13800<? super String> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallback + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = iAuthTabCallback.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 splitAttributesSplitTypeCompanionExternalSyntheticLambda0 = this.IAuthTabCallback;
            SubmitGameCenterLeaderBoardScoreRequest submitGameCenterLeaderBoardScoreRequest = new SubmitGameCenterLeaderBoardScoreRequest(str3);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(str2);
            iAuthTabCallback.L$2 = access15400.onNavigationEvent(str3);
            iAuthTabCallback.label = 1;
            objOnExtraCallback = splitAttributesSplitTypeCompanionExternalSyntheticLambda0.onExtraCallback(str, str2, submitGameCenterLeaderBoardScoreRequest, iAuthTabCallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        SubmitGameCenterLeaderBoardScoreResponse submitGameCenterLeaderBoardScoreResponse = (SubmitGameCenterLeaderBoardScoreResponse) ((BaseApiResponse) objOnExtraCallback).onTransact();
        if (submitGameCenterLeaderBoardScoreResponse == null) {
            return null;
        }
        int i8 = onWarmupCompleted + 43;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return submitGameCenterLeaderBoardScoreResponse.onNavigationEvent();
        }
        submitGameCenterLeaderBoardScoreResponse.onNavigationEvent();
        throw null;
    }
}
