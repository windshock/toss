package o;

import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.generateAesIV;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class cryptVerifySignatureValue implements generateAesIV, decryptRSA {
    public abstract Object IAuthTabCallback(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public void IAuthTabCallback(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue) {
        Intrinsics.checkNotNullParameter(cryptverifysignaturevalue, "");
    }

    public abstract Object IAuthTabCallbackDefault(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public abstract Object asInterface(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public abstract Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var);

    public abstract void onExtraCallback(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue);

    public abstract Object onExtraCallbackWithResult(@NotNull ListIterator<? extends cryptVerifySignatureValue> listIterator, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public abstract Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    public abstract Object onNavigationEvent(@NotNull certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public abstract List<cryptVerifySignatureValue> onNavigationEvent();

    /* renamed from: onTransact */
    public abstract cryptVerifySignatureValue IAuthTabCallbackDefault();

    public abstract Object onWarmupCompleted(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public abstract <E extends certGetOCSPAddress> Object onWarmupCompleted(@NotNull logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Pair<? extends logicIssueCertGenmGenp<E>, ? extends logicIssueClose>> access13800Var);

    public abstract Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

    public Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        return generateAesIV.onExtraCallback.onWarmupCompleted(this, access13800Var);
    }

    public Object onExtraCallback(@NotNull logicVerifyCMSSignedData logicverifycmssigneddata, @NotNull access13800<? super Unit> access13800Var) {
        return generateAesIV.onExtraCallback.onNavigationEvent(this, logicverifycmssigneddata, access13800Var);
    }

    @Override // o.generateAesIV
    public void onExtraCallback(@NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8) {
        generateAesIV.onExtraCallback.IAuthTabCallback(this, pkcs12getcertwithpfxencpkcs8);
    }

    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        return generateAesIV.onExtraCallback.onExtraCallbackWithResult(this, access13800Var);
    }

    @Override // o.generateAesIV
    public generateAesIV ICustomTabsCallback() {
        return IAuthTabCallbackDefault();
    }
}
