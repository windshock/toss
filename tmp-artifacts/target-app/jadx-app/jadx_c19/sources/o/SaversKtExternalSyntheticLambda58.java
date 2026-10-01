package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SaversKtExternalSyntheticLambda58 {
    public static final SaversKtExternalSyntheticLambda58 onWarmupCompleted = new SaversKtExternalSyntheticLambda58() { // from class: o.SaversKtExternalSyntheticLambda58.1
        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallback() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            return saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.REMOTE;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23) {
            return (saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE || saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.MEMORY_CACHE) ? false : true;
        }
    };
    public static final SaversKtExternalSyntheticLambda58 IAuthTabCallback = new SaversKtExternalSyntheticLambda58() { // from class: o.SaversKtExternalSyntheticLambda58.2
        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallback() {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent() {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23) {
            return false;
        }
    };
    public static final SaversKtExternalSyntheticLambda58 onNavigationEvent = new SaversKtExternalSyntheticLambda58() { // from class: o.SaversKtExternalSyntheticLambda58.3
        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallback() {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23) {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            return (saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.DATA_DISK_CACHE || saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.MEMORY_CACHE) ? false : true;
        }
    };
    public static final SaversKtExternalSyntheticLambda58 onExtraCallbackWithResult = new SaversKtExternalSyntheticLambda58() { // from class: o.SaversKtExternalSyntheticLambda58.5
        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallback() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent() {
            return false;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23) {
            return (saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.RESOURCE_DISK_CACHE || saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.MEMORY_CACHE) ? false : true;
        }
    };
    public static final SaversKtExternalSyntheticLambda58 onExtraCallback = new SaversKtExternalSyntheticLambda58() { // from class: o.SaversKtExternalSyntheticLambda58.4
        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallback() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent() {
            return true;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
            return saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.REMOTE;
        }

        @Override // o.SaversKtExternalSyntheticLambda58
        public boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23) {
            return ((z && saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.DATA_DISK_CACHE) || saversKtExternalSyntheticLambda21 == SaversKtExternalSyntheticLambda21.LOCAL) && saversKtExternalSyntheticLambda23 == SaversKtExternalSyntheticLambda23.TRANSFORMED;
        }
    };

    public abstract boolean onExtraCallback();

    public abstract boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21);

    public abstract boolean onNavigationEvent();

    public abstract boolean onNavigationEvent(boolean z, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, SaversKtExternalSyntheticLambda23 saversKtExternalSyntheticLambda23);
}
