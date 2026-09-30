package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class vsb extends vzs {
    int onNavigationEvent;
    final ArrayList<vzs> onWarmupCompleted;

    vsb() {
        this.onNavigationEvent = 0;
        this.onWarmupCompleted = new ArrayList<>();
    }

    vsb(Collection<vzs> collection) {
        this();
        this.onWarmupCompleted.addAll(collection);
        onExtraCallback();
    }

    @Nullable
    vzs onNavigationEvent() {
        int i = this.onNavigationEvent;
        if (i > 0) {
            return this.onWarmupCompleted.get(i - 1);
        }
        return null;
    }

    void onNavigationEvent(vzs vzsVar) {
        this.onWarmupCompleted.set(this.onNavigationEvent - 1, vzsVar);
    }

    void onExtraCallback() {
        this.onNavigationEvent = this.onWarmupCompleted.size();
    }

    public static final class onExtraCallback extends vsb {
        onExtraCallback(Collection<vzs> collection) {
            super(collection);
        }

        onExtraCallback(vzs... vzsVarArr) {
            this(Arrays.asList(vzsVarArr));
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            for (int i = this.onNavigationEvent - 1; i >= 0; i--) {
                if (!this.onWarmupCompleted.get(i).onExtraCallback(qgrVar, qgrVar2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return nfe.onExtraCallbackWithResult(this.onWarmupCompleted, _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    public static final class IAuthTabCallback extends vsb {
        IAuthTabCallback(Collection<vzs> collection) {
            if (this.onNavigationEvent > 1) {
                this.onWarmupCompleted.add(new onExtraCallback(collection));
            } else {
                this.onWarmupCompleted.addAll(collection);
            }
            onExtraCallback();
        }

        IAuthTabCallback(vzs... vzsVarArr) {
            this(Arrays.asList(vzsVarArr));
        }

        IAuthTabCallback() {
        }

        public void onExtraCallbackWithResult(vzs vzsVar) {
            this.onWarmupCompleted.add(vzsVar);
            onExtraCallback();
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            for (int i = 0; i < this.onNavigationEvent; i++) {
                if (this.onWarmupCompleted.get(i).onExtraCallback(qgrVar, qgrVar2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return nfe.onExtraCallbackWithResult(this.onWarmupCompleted, ", ");
        }
    }
}
