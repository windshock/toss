package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.getCurrentNetworkType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceHeroV2ViewHolder$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ getCurrentNetworkType f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) getCurrentNetworkType.onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 682793093, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -682793093);
        int i4 = onExtraCallback + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
