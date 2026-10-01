package im.toss.features.kyc.edd;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.readToArray;
import o.setTemplateVersion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EddInfoRepository$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        List list = (List) readToArray.IAuthTabCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(setTemplateVersion) obj}, 1137952763, iOnExtraCallback, iOnExtraCallback2, -1137952762);
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
