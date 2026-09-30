package im.toss.global.features.kyc.test;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class GlobalKycTestViewModel$onExtraCallback extends ContinuationImpl {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestViewModel$onExtraCallback.class);
    public int I$0;
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ GlobalKycTestViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalKycTestViewModel$onExtraCallback(GlobalKycTestViewModel globalKycTestViewModel, access13800<? super GlobalKycTestViewModel$onExtraCallback> access13800Var) {
        super(access13800Var);
        this.this$0 = globalKycTestViewModel;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        this.result = obj;
        int i2 = this.label;
        int i3 = i2 ^ Integer.MIN_VALUE;
        int i4 = i2 & Integer.MIN_VALUE;
        this.label = (i4 & i3) | (i3 ^ i4);
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        Object[] objArr = {this.this$0, this};
        Object objOnNavigationEvent = GlobalKycTestViewModel.onNavigationEvent(1018514968, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1018514948, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
        return objOnNavigationEvent;
    }
}
