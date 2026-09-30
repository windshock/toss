package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.certGetOCSPAddress;
import o.logicIssueCertSendConf;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class logicIssueCertResult<E extends certGetOCSPAddress> {
    private final List<logicIssueCertSendConf.IAuthTabCallback> IAuthTabCallback;
    public certGetCertValidityNotAfter<E> onExtraCallback;
    private certSetTrustRootCACert onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private logicRenewCertResult onTransact;
    private final generateAesIV onWarmupCompleted;

    public logicIssueCertResult(@Nullable String str, @NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = generateaesiv;
        this.IAuthTabCallback = new ArrayList();
        this.onTransact = logicRenewCertResult.LOCAL;
    }

    protected final String IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    protected final generateAesIV asInterface() {
        return this.onWarmupCompleted;
    }

    public final List<logicIssueCertSendConf.IAuthTabCallback> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final void onExtraCallbackWithResult(@NotNull certGetCertValidityNotAfter<E> certgetcertvaliditynotafter) {
        Intrinsics.checkNotNullParameter(certgetcertvaliditynotafter, "");
        this.onExtraCallback = certgetcertvaliditynotafter;
    }

    public final certGetCertValidityNotAfter<E> onNavigationEvent() {
        certGetCertValidityNotAfter<E> certgetcertvaliditynotafter = this.onExtraCallback;
        if (certgetcertvaliditynotafter != null) {
            return certgetcertvaliditynotafter;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    public final logicRenewCertResult asBinder() {
        return this.onTransact;
    }

    public final certSetTrustRootCACert onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@Nullable certSetTrustRootCACert certsettrustrootcacert) {
        this.onExtraCallbackWithResult = certsettrustrootcacert;
    }
}
