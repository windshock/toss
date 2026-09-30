package ru.nsk.kstatemachine.visitors;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import o.generateAesIV;
import o.logicIssueCertSendConf;
import o.pkcs12GetCertWithPFXEncPKCS8;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RecursiveVisitor extends pkcs12GetCertWithPFXEncPKCS8 {

    public static final class DefaultImpls {
        public static void onExtraCallbackWithResult(@NotNull RecursiveVisitor recursiveVisitor, @NotNull generateAesIV generateaesiv) {
            Intrinsics.checkNotNullParameter(generateaesiv, "");
            Iterator<T> it = generateaesiv.access000().iterator();
            while (it.hasNext()) {
                recursiveVisitor.onExtraCallbackWithResult((logicIssueCertSendConf) it.next());
            }
            Iterator<T> it2 = generateaesiv.getInterfaceDescriptor().iterator();
            while (it2.hasNext()) {
                recursiveVisitor.onExtraCallbackWithResult((generateAesIV) it2.next());
            }
        }
    }
}
