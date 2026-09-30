package o;

import o.uci;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class wqq extends vzs {
    vzs onWarmupCompleted;

    wqq() {
    }

    static class asBinder extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar == qgrVar2;
        }

        asBinder() {
        }
    }

    static class onExtraCallbackWithResult extends wqq {
        final uci.onExtraCallbackWithResult onNavigationEvent;

        public onExtraCallbackWithResult(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
            this.onNavigationEvent = new uci.onExtraCallbackWithResult(vzsVar);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            for (int i = 0; i < qgrVar2.cz_(); i++) {
                qq qqVarOnExtraCallbackWithResult = qgrVar2.onExtraCallbackWithResult(i);
                if ((qqVarOnExtraCallbackWithResult instanceof qgr) && this.onNavigationEvent.IAuthTabCallback(qgrVar2, (qgr) qqVarOnExtraCallbackWithResult) != null) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.onWarmupCompleted);
        }
    }

    static class IAuthTabCallback extends wqq {
        public IAuthTabCallback(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return !this.onWarmupCompleted.onExtraCallback(qgrVar, qgrVar2);
        }

        public String toString() {
            return String.format(":not(%s)", this.onWarmupCompleted);
        }
    }

    static class onExtraCallback extends wqq {
        public onExtraCallback(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            if (qgrVar == qgrVar2) {
                return false;
            }
            do {
                qgrVar2 = qgrVar2.ICustomTabsCallbackDefault();
                if (qgrVar2 == null) {
                    break;
                }
                if (this.onWarmupCompleted.onExtraCallback(qgrVar, qgrVar2)) {
                    return true;
                }
            } while (qgrVar2 != qgrVar);
            return false;
        }

        public String toString() {
            return String.format("%s ", this.onWarmupCompleted);
        }
    }

    static class onNavigationEvent extends wqq {
        public onNavigationEvent(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault;
            return (qgrVar == qgrVar2 || (qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault()) == null || !this.onWarmupCompleted.onExtraCallback(qgrVar, qgrVarICustomTabsCallbackDefault)) ? false : true;
        }

        public String toString() {
            return String.format("%s > ", this.onWarmupCompleted);
        }
    }

    static class onTransact extends wqq {
        public onTransact(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            if (qgrVar == qgrVar2) {
                return false;
            }
            for (qgr qgrVarOnRelationshipValidationResult = qgrVar2.onRelationshipValidationResult(); qgrVarOnRelationshipValidationResult != null; qgrVarOnRelationshipValidationResult = qgrVarOnRelationshipValidationResult.onRelationshipValidationResult()) {
                if (this.onWarmupCompleted.onExtraCallback(qgrVar, qgrVarOnRelationshipValidationResult)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.onWarmupCompleted);
        }
    }

    static class onWarmupCompleted extends wqq {
        public onWarmupCompleted(vzs vzsVar) {
            this.onWarmupCompleted = vzsVar;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarOnRelationshipValidationResult;
            return (qgrVar == qgrVar2 || (qgrVarOnRelationshipValidationResult = qgrVar2.onRelationshipValidationResult()) == null || !this.onWarmupCompleted.onExtraCallback(qgrVar, qgrVarOnRelationshipValidationResult)) ? false : true;
        }

        public String toString() {
            return String.format("%s + ", this.onWarmupCompleted);
        }
    }
}
