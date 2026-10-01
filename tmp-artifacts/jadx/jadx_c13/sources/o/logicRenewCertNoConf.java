package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveVisitor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicRenewCertNoConf implements RecursiveVisitor {
    public void IAuthTabCallback(@NotNull generateAesIV generateaesiv) {
        RecursiveVisitor.DefaultImpls.onExtraCallbackWithResult(this, generateaesiv);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        certSetTrustRootCACert certsettrustrootcacertIAuthTabCallback_Parcel = logicdisusecertrr.IAuthTabCallback_Parcel();
        if (certsettrustrootcacertIAuthTabCallback_Parcel != null) {
            onExtraCallback(certsettrustrootcacertIAuthTabCallback_Parcel);
        }
        IAuthTabCallback((generateAesIV) logicdisusecertrr);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        certSetTrustRootCACert certsettrustrootcacertIAuthTabCallback_Parcel = generateaesiv.IAuthTabCallback_Parcel();
        if (certsettrustrootcacertIAuthTabCallback_Parcel != null) {
            onExtraCallback(certsettrustrootcacertIAuthTabCallback_Parcel);
        }
        if (generateaesiv instanceof logicDisuseCertRr) {
            return;
        }
        IAuthTabCallback(generateaesiv);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public <E extends certGetOCSPAddress> void onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        certSetTrustRootCACert certsettrustrootcacertIAuthTabCallback = logicissuecertsendconf.IAuthTabCallback();
        if (certsettrustrootcacertIAuthTabCallback != null) {
            onExtraCallback(certsettrustrootcacertIAuthTabCallback);
        }
    }

    private final void onExtraCallback(certSetTrustRootCACert certsettrustrootcacert) {
        if (certsettrustrootcacert instanceof certGetSubjectAltName) {
            Set<certSetTrustRootCACert> setOnWarmupCompleted = ((certGetSubjectAltName) certsettrustrootcacert).onWarmupCompleted();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setOnWarmupCompleted) {
                certSetTrustRootCACert certsettrustrootcacert2 = (certSetTrustRootCACert) obj;
                if (certsettrustrootcacert2 instanceof certGetSubjectAltName) {
                    throw new IllegalStateException("CompositeMetaInfo cannot nest each other");
                }
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(certsettrustrootcacert2.getClass());
                Object arrayList = linkedHashMap.get(orCreateKotlinClass);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(orCreateKotlinClass, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() != 1) {
                    throw new IllegalStateException(("MetaInfo " + entry.getKey() + " is repeated more than once").toString());
                }
            }
        }
    }
}
