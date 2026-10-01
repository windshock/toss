package o;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya14 {
    private final Queue<sya43> onExtraCallbackWithResult;
    private List<sya15> onNavigationEvent = new ArrayList();
    private final sya17[] onWarmupCompleted;

    public sya14(final uh28 uh28Var, sya17... sya17VarArr) {
        this.onExtraCallbackWithResult = new AbstractQueue<sya43>() { // from class: o.sya14.2
            @Override // java.util.Queue
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public boolean offer(sya43 sya43Var) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Queue
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public sya43 poll() {
                return uh28Var.onExtraCallback();
            }

            @Override // java.util.Queue
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public sya43 peek() {
                return uh28Var.onNavigationEvent();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator<sya43> iterator() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                throw new UnsupportedOperationException();
            }
        };
        this.onWarmupCompleted = sya17VarArr;
    }

    private boolean IAuthTabCallback(sya43 sya43Var) {
        if (sya43Var != null && sya43Var.onNavigationEvent() == sya43.IAuthTabCallback.Comment) {
            sya40 sya40Var = (sya40) sya43Var;
            for (sya17 sya17Var : this.onWarmupCompleted) {
                if (sya40Var.onWarmupCompleted() == sya17Var) {
                    return true;
                }
            }
        }
        return false;
    }

    public sya14 onNavigationEvent() {
        onExtraCallback(null);
        return this;
    }

    public sya43 onExtraCallback(sya43 sya43Var) {
        if (sya43Var != null) {
            if (!IAuthTabCallback(sya43Var)) {
                return sya43Var;
            }
            this.onNavigationEvent.add(new sya15((sya40) sya43Var));
        }
        while (IAuthTabCallback(this.onExtraCallbackWithResult.peek())) {
            this.onNavigationEvent.add(new sya15((sya40) this.onExtraCallbackWithResult.poll()));
        }
        return null;
    }

    public sya43 onExtraCallbackWithResult(sya43 sya43Var) {
        sya43 sya43VarOnExtraCallback = onExtraCallback(sya43Var);
        return sya43VarOnExtraCallback != null ? sya43VarOnExtraCallback : this.onExtraCallbackWithResult.poll();
    }

    public List<sya15> IAuthTabCallback() {
        try {
            return this.onNavigationEvent;
        } finally {
            this.onNavigationEvent = new ArrayList();
        }
    }

    public boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent.isEmpty();
    }
}
