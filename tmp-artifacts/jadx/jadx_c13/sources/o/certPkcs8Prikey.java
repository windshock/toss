package o;

import kotlin.NoWhenBranchMatchedException;
import o.certGetPublicKeyAlgorithm;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certPkcs8Prikey {
    /* JADX INFO: Access modifiers changed from: private */
    public static final logicIssueCertMakePOPOSigningInputMsg<?> onWarmupCompleted(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg) {
        certGetPublicKeyAlgorithm certgetpublickeyalgorithm;
        if (!(logicissuecertmakepoposigninginputmsg.onWarmupCompleted() instanceof certGetSerial)) {
            return logicissuecertmakepoposigninginputmsg;
        }
        certGetSerial certgetserial = (certGetSerial) logicissuecertmakepoposigninginputmsg.onWarmupCompleted();
        if (certgetserial instanceof certGetPublicKeyAlgorithmType) {
            certgetpublickeyalgorithm = new certGetPublicKeyAlgorithm(certGetPublicKeyAlgorithm.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallback);
        } else if (certgetserial instanceof certGetSignatureAlgorithm) {
            certgetpublickeyalgorithm = new certGetPublicKeyAlgorithm(certGetPublicKeyAlgorithm.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted);
        } else {
            if (!(certgetserial instanceof certGetIssuerDN)) {
                if (certgetserial instanceof certGetPublicKey) {
                    return null;
                }
                if (certgetserial instanceof certGetSignAlgType) {
                    throw new IllegalStateException("Never get here");
                }
                if (certgetserial instanceof certGetPublicKeyAlgorithm) {
                    throw new IllegalStateException("Never get here, SerializableGeneratedEvent should not be processed");
                }
                throw new NoWhenBranchMatchedException();
            }
            certgetpublickeyalgorithm = new certGetPublicKeyAlgorithm(new certGetPublicKeyAlgorithm.onExtraCallbackWithResult.C0025onExtraCallbackWithResult(((certGetIssuerDN) logicissuecertmakepoposigninginputmsg.onWarmupCompleted()).onExtraCallbackWithResult()));
        }
        return new logicIssueCertMakePOPOSigningInputMsg<>(certgetpublickeyalgorithm, logicissuecertmakepoposigninginputmsg.onNavigationEvent());
    }
}
