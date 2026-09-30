package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class removeRecyclerListener {

    public interface IAuthTabCallback {
        boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener);
    }

    public static removeOnItemTouchListener onExtraCallback(@NonNull IAuthTabCallback iAuthTabCallback) {
        return new onExtraCallback(iAuthTabCallback);
    }

    public static removeOnItemTouchListener onWarmupCompleted(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.5
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallback() <= i2;
            }
        });
    }

    public static removeOnItemTouchListener onTransact(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.2
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallback() >= i2;
            }
        });
    }

    public static removeOnItemTouchListener onNavigationEvent(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.4
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallbackWithResult() <= i2;
            }
        });
    }

    public static removeOnItemTouchListener onExtraCallback(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.3
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallbackWithResult() >= i2;
            }
        });
    }

    public static removeOnItemTouchListener onWarmupCompleted(removeItemDecoration removeitemdecoration, final float f) {
        final float fOnWarmupCompleted = removeitemdecoration.onWarmupCompleted();
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.1
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                float fOnWarmupCompleted2 = removeItemDecoration.onExtraCallback(removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult()).onWarmupCompleted();
                float f2 = fOnWarmupCompleted;
                float f3 = f;
                return fOnWarmupCompleted2 >= f2 - f3 && fOnWarmupCompleted2 <= f2 + f3;
            }
        });
    }

    public static removeOnItemTouchListener IAuthTabCallback() {
        return new removeOnItemTouchListener() { // from class: o.removeRecyclerListener.7
            public List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult(@NonNull List<removeOnChildAttachStateChangeListener> list) {
                Collections.sort(list);
                Collections.reverse(list);
                return list;
            }
        };
    }

    public static removeOnItemTouchListener onExtraCallbackWithResult() {
        return new removeOnItemTouchListener() { // from class: o.removeRecyclerListener.9
            public List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult(@NonNull List<removeOnChildAttachStateChangeListener> list) {
                Collections.sort(list);
                return list;
            }
        };
    }

    public static removeOnItemTouchListener IAuthTabCallback(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.10
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallbackWithResult() * removeonchildattachstatechangelistener.onExtraCallback() <= i2;
            }
        });
    }

    public static removeOnItemTouchListener onExtraCallbackWithResult(final int i2) {
        return onExtraCallback(new IAuthTabCallback() { // from class: o.removeRecyclerListener.8
            @Override // o.removeRecyclerListener.IAuthTabCallback
            public boolean onExtraCallbackWithResult(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
                return removeonchildattachstatechangelistener.onExtraCallbackWithResult() * removeonchildattachstatechangelistener.onExtraCallback() >= i2;
            }
        });
    }

    public static removeOnItemTouchListener IAuthTabCallback(removeOnItemTouchListener... removeonitemtouchlistenerArr) {
        return new onExtraCallbackWithResult(removeonitemtouchlistenerArr);
    }

    public static removeOnItemTouchListener onExtraCallback(removeOnItemTouchListener... removeonitemtouchlistenerArr) {
        return new onNavigationEvent(removeonitemtouchlistenerArr);
    }

    static class onExtraCallback implements removeOnItemTouchListener {
        private IAuthTabCallback onExtraCallback;

        private onExtraCallback(@NonNull IAuthTabCallback iAuthTabCallback) {
            this.onExtraCallback = iAuthTabCallback;
        }

        public List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult(@NonNull List<removeOnChildAttachStateChangeListener> list) {
            ArrayList arrayList = new ArrayList();
            for (removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener : list) {
                if (this.onExtraCallback.onExtraCallbackWithResult(removeonchildattachstatechangelistener)) {
                    arrayList.add(removeonchildattachstatechangelistener);
                }
            }
            return arrayList;
        }
    }

    static class onExtraCallbackWithResult implements removeOnItemTouchListener {
        private removeOnItemTouchListener[] onNavigationEvent;

        private onExtraCallbackWithResult(@NonNull removeOnItemTouchListener... removeonitemtouchlistenerArr) {
            this.onNavigationEvent = removeonitemtouchlistenerArr;
        }

        public List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult(@NonNull List<removeOnChildAttachStateChangeListener> list) {
            for (removeOnItemTouchListener removeonitemtouchlistener : this.onNavigationEvent) {
                list = removeonitemtouchlistener.onExtraCallbackWithResult(list);
            }
            return list;
        }
    }

    static class onNavigationEvent implements removeOnItemTouchListener {
        private removeOnItemTouchListener[] IAuthTabCallback;

        private onNavigationEvent(@NonNull removeOnItemTouchListener... removeonitemtouchlistenerArr) {
            this.IAuthTabCallback = removeonitemtouchlistenerArr;
        }

        public List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult(@NonNull List<removeOnChildAttachStateChangeListener> list) {
            List<removeOnChildAttachStateChangeListener> listOnExtraCallbackWithResult = null;
            for (removeOnItemTouchListener removeonitemtouchlistener : this.IAuthTabCallback) {
                listOnExtraCallbackWithResult = removeonitemtouchlistener.onExtraCallbackWithResult(list);
                if (!listOnExtraCallbackWithResult.isEmpty()) {
                    break;
                }
            }
            return listOnExtraCallbackWithResult == null ? new ArrayList() : listOnExtraCallbackWithResult;
        }
    }
}
