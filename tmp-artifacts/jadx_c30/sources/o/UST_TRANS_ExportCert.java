package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import o.Cert;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_ExportCert {
    private final Queue<Cert> onExtraCallback;
    private final UST_TRANS_V2_ExportCert[] onExtraCallbackWithResult;
    private List<UST_TRANS_V2_Finalize> onWarmupCompleted = new ArrayList();

    public UST_TRANS_ExportCert(Queue<Cert> queue, UST_TRANS_V2_ExportCert... uST_TRANS_V2_ExportCertArr) {
        this.onExtraCallback = queue;
        this.onExtraCallbackWithResult = uST_TRANS_V2_ExportCertArr;
    }

    private boolean IAuthTabCallback(Cert cert) {
        if (cert != null && cert.onExtraCallback(Cert.onNavigationEvent.Comment)) {
            UST_TRNAS_Password_GenOut uST_TRNAS_Password_GenOut = (UST_TRNAS_Password_GenOut) cert;
            for (UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert : this.onExtraCallbackWithResult) {
                if (uST_TRNAS_Password_GenOut.onExtraCallbackWithResult() == uST_TRANS_V2_ExportCert) {
                    return true;
                }
            }
        }
        return false;
    }

    public UST_TRANS_ExportCert onExtraCallbackWithResult() {
        onNavigationEvent(null);
        return this;
    }

    public Cert onNavigationEvent(Cert cert) {
        if (cert != null) {
            if (!IAuthTabCallback(cert)) {
                return cert;
            }
            this.onWarmupCompleted.add(new UST_TRANS_V2_Finalize((UST_TRNAS_Password_GenOut) cert));
        }
        while (IAuthTabCallback(this.onExtraCallback.peek())) {
            this.onWarmupCompleted.add(new UST_TRANS_V2_Finalize((UST_TRNAS_Password_GenOut) this.onExtraCallback.poll()));
        }
        return null;
    }

    public Cert onWarmupCompleted(Cert cert) {
        Cert certOnNavigationEvent = onNavigationEvent(cert);
        return certOnNavigationEvent != null ? certOnNavigationEvent : this.onExtraCallback.poll();
    }

    public List<UST_TRANS_V2_Finalize> onWarmupCompleted() {
        try {
            return this.onWarmupCompleted;
        } finally {
            this.onWarmupCompleted = new ArrayList();
        }
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted.isEmpty();
    }
}
