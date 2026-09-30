package o;

import javax.annotation.Nullable;
import o.wbt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class uci {
    @Nullable
    public static qgr onWarmupCompleted(vzs vzsVar, qgr qgrVar) {
        return new onExtraCallbackWithResult(vzsVar).IAuthTabCallback(qgrVar, qgrVar);
    }

    static class onExtraCallbackWithResult implements wbt {
        private final vzs onExtraCallback;

        @Nullable
        private qgr onWarmupCompleted = null;

        @Nullable
        private qgr IAuthTabCallback = null;

        onExtraCallbackWithResult(vzs vzsVar) {
            this.onExtraCallback = vzsVar;
        }

        @Nullable
        qgr IAuthTabCallback(qgr qgrVar, qgr qgrVar2) {
            this.onWarmupCompleted = qgrVar;
            this.IAuthTabCallback = null;
            vb.onNavigationEvent(this, qgrVar2);
            return this.IAuthTabCallback;
        }

        @Override // o.wbt
        public wbt.onExtraCallback onExtraCallback(qq qqVar, int i) {
            if (qqVar instanceof qgr) {
                qgr qgrVar = (qgr) qqVar;
                if (this.onExtraCallback.onExtraCallback(this.onWarmupCompleted, qgrVar)) {
                    this.IAuthTabCallback = qgrVar;
                    return wbt.onExtraCallback.STOP;
                }
            }
            return wbt.onExtraCallback.CONTINUE;
        }

        @Override // o.wbt
        public wbt.onExtraCallback onExtraCallbackWithResult(qq qqVar, int i) {
            return wbt.onExtraCallback.CONTINUE;
        }
    }
}
