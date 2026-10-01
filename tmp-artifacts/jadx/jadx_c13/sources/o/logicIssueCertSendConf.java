package o;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import o.certGetOCSPAddress;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface logicIssueCertSendConf<E extends certGetOCSPAddress> {
    Object IAuthTabCallback(@NotNull certGetOCSPAddress certgetocspaddress, @NotNull access13800<? super Boolean> access13800Var);

    certSetTrustRootCACert IAuthTabCallback();

    logicRenewCertResult IAuthTabCallbackStub();

    Collection<IAuthTabCallback> onExtraCallback();

    generateAesIV onExtraCallbackWithResult();

    String onNavigationEvent();

    certGetCertValidityNotAfter<E> onWarmupCompleted();

    public interface IAuthTabCallback {
        Object onExtraCallbackWithResult(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        Object onNavigationEvent(@NotNull Set<? extends generateAesIV> set, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var);

        /* renamed from: o.logicIssueCertSendConf$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0036IAuthTabCallback {
            public static Object onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull Set<? extends generateAesIV> set, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
                return Unit.INSTANCE;
            }
        }
    }
}
