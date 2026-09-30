package o;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import o.IABLandingPageActivity5;
import o.IABLandingPageActivity5.onExtraCallback;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class IABLandingPageActivityycx<W extends IABLandingPageActivity5.onExtraCallback> {
    private final Set<W> IAuthTabCallback = new HashSet();

    IABLandingPageActivityycx() {
    }

    public Set<W> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    boolean onNavigationEvent() {
        return this.IAuthTabCallback.isEmpty();
    }

    void onExtraCallback(@NonNull W w) {
        this.IAuthTabCallback.add(w);
    }

    boolean IAuthTabCallback(@NonNull onScrollChange onscrollchange) {
        Iterator<W> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            onScrollChange onscrollchange2 = it.next().onNavigationEvent;
            if (onscrollchange2 == onscrollchange) {
                return true;
            }
            if ((onscrollchange2 instanceof TTAppOpenAdActivity4) && ((TTAppOpenAdActivity4) onscrollchange2).onExtraCallbackWithResult() == onscrollchange) {
                return true;
            }
        }
        return false;
    }

    W onExtraCallback(@NonNull onScrollChange onscrollchange) {
        for (W w : this.IAuthTabCallback) {
            onScrollChange onscrollchange2 = w.onNavigationEvent;
            if (onscrollchange2 == onscrollchange) {
                return w;
            }
            if ((onscrollchange2 instanceof TTAppOpenAdActivity4) && ((TTAppOpenAdActivity4) onscrollchange2).onExtraCallbackWithResult() == onscrollchange) {
                this.IAuthTabCallback.remove(w);
                return w;
            }
        }
        onWarmupCompleted();
        return null;
    }

    private void onWarmupCompleted() {
        LinkedList linkedList = new LinkedList();
        for (W w : this.IAuthTabCallback) {
            onScrollChange onscrollchange = w.onNavigationEvent;
            if ((onscrollchange instanceof TTAppOpenAdActivity4) && ((TTAppOpenAdActivity4) onscrollchange).onExtraCallback()) {
                linkedList.add(w);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.IAuthTabCallback.remove((IABLandingPageActivity5.onExtraCallback) it.next());
        }
    }
}
