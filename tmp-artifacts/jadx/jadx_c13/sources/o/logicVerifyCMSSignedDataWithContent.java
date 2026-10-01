package o;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveVisitor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicVerifyCMSSignedDataWithContent implements RecursiveVisitor {
    private final Set<String> IAuthTabCallback = new LinkedHashSet();
    private final Set<String> onExtraCallbackWithResult = new LinkedHashSet();

    public void onNavigationEvent(@NotNull generateAesIV generateaesiv) {
        RecursiveVisitor.DefaultImpls.onExtraCallbackWithResult(this, generateaesiv);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        String strIAuthTabCallbackStubProxy = logicdisusecertrr.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy == null || this.IAuthTabCallback.add(strIAuthTabCallbackStubProxy)) {
            onNavigationEvent(logicdisusecertrr);
            return;
        }
        throw new IllegalStateException(("State name is not unique: " + strIAuthTabCallbackStubProxy).toString());
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        String strIAuthTabCallbackStubProxy = generateaesiv.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy == null || this.IAuthTabCallback.add(strIAuthTabCallbackStubProxy)) {
            if (generateaesiv instanceof logicDisuseCertRr) {
                return;
            }
            onNavigationEvent(generateaesiv);
        } else {
            throw new IllegalStateException(("State name is not unique: " + strIAuthTabCallbackStubProxy).toString());
        }
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public <E extends certGetOCSPAddress> void onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        String strOnNavigationEvent = logicissuecertsendconf.onNavigationEvent();
        if (strOnNavigationEvent == null || this.onExtraCallbackWithResult.add(strOnNavigationEvent)) {
            return;
        }
        throw new IllegalStateException(("Transition name is not unique: " + strOnNavigationEvent).toString());
    }
}
