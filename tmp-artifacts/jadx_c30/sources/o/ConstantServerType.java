package o;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ConstantServerType {
    private final Clock IAuthTabCallback;
    private int onExtraCallback;
    private long onNavigationEvent;
    private final Map<String, onExtraCallback> onWarmupCompleted;

    public ConstantServerType() {
        this(Clock.systemUTC());
    }

    public ConstantServerType(Clock clock) {
        this.onNavigationEvent = 900L;
        this.onExtraCallback = 1000;
        this.IAuthTabCallback = clock;
        this.onWarmupCompleted = Collections.synchronizedMap(new LinkedHashMap<String, onExtraCallback>() { // from class: o.ConstantServerType.2
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<String, onExtraCallback> entry) {
                return size() >= ConstantServerType.this.onExtraCallback;
            }
        });
    }

    public JCertTransfer onNavigationEvent(yzp2 yzp2Var, int i) {
        while (yzp2Var.IAuthTabCallback() > 0) {
            JCertTransfer jCertTransferOnExtraCallbackWithResult = onExtraCallbackWithResult(onWarmupCompleted(yzp2Var, i));
            if (jCertTransferOnExtraCallbackWithResult != null) {
                return jCertTransferOnExtraCallbackWithResult;
            }
            yzp2Var = new yzp2(yzp2Var, 1);
        }
        return null;
    }

    public void IAuthTabCallback(JCertTransfer jCertTransfer) {
        if ((jCertTransfer.access000() || jCertTransfer.getInterfaceDescriptor()) && jCertTransfer.onExtraCallback() == 48) {
            this.onWarmupCompleted.put(onWarmupCompleted(jCertTransfer.asInterface(), jCertTransfer.onTransact()), new onExtraCallback(jCertTransfer, this.onNavigationEvent));
        }
    }

    private String onWarmupCompleted(yzp2 yzp2Var, int i) {
        return "K" + i + "/" + yzp2Var;
    }

    private JCertTransfer onExtraCallbackWithResult(String str) {
        onExtraCallback onextracallback = this.onWarmupCompleted.get(str);
        if (onextracallback == null) {
            return null;
        }
        if (onextracallback.IAuthTabCallback.isBefore(this.IAuthTabCallback.instant())) {
            this.onWarmupCompleted.remove(str);
            return null;
        }
        return onextracallback.onWarmupCompleted;
    }

    class onExtraCallback {
        private final Instant IAuthTabCallback;
        private final JCertTransfer onWarmupCompleted;

        onExtraCallback(JCertTransfer jCertTransfer, long j) {
            long jAsBinder = jCertTransfer.asBinder();
            this.IAuthTabCallback = ConstantServerType.this.IAuthTabCallback.instant().plus(jAsBinder <= j ? jAsBinder : j, ChronoUnit.SECONDS);
            this.onWarmupCompleted = jCertTransfer;
        }
    }
}
