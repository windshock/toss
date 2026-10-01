package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.clearTmpDetachFlag;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerRegistry implements clearTmpDetachFlag {
    private final SparseArray<addChangePayload> onExtraCallback = new SparseArray<>();
    private final SparseArray<Integer> onWarmupCompleted = new SparseArray<>();
    private final SparseArray<ArrayList<addChangePayload>> onNavigationEvent = new SparseArray<>();

    public final void onWarmupCompleted(@NotNull addChangePayload addchangepayload) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(addchangepayload, "");
            this.onExtraCallback.put(addchangepayload.onUnminimized(), addchangepayload);
        }
    }

    public final addChangePayload onNavigationEvent(int i) {
        addChangePayload addchangepayload;
        synchronized (this) {
            addchangepayload = this.onExtraCallback.get(i);
        }
        return addchangepayload;
    }

    public final boolean onExtraCallbackWithResult(int i, int i2, int i3) {
        boolean z;
        synchronized (this) {
            addChangePayload addchangepayload = this.onExtraCallback.get(i);
            if (addchangepayload != null) {
                onExtraCallbackWithResult(addchangepayload);
                addchangepayload.onExtraCallback(i3);
                IAuthTabCallback(i2, addchangepayload);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private final void IAuthTabCallback(int i, addChangePayload addchangepayload) {
        synchronized (this) {
            if (this.onWarmupCompleted.get(addchangepayload.onUnminimized()) != null) {
                throw new IllegalStateException(("Handler " + addchangepayload + " already attached").toString());
            }
            this.onWarmupCompleted.put(addchangepayload.onUnminimized(), Integer.valueOf(i));
            ArrayList<addChangePayload> arrayList = this.onNavigationEvent.get(i);
            if (arrayList == null) {
                ArrayList<addChangePayload> arrayList2 = new ArrayList<>(1);
                arrayList2.add(addchangepayload);
                this.onNavigationEvent.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(addchangepayload);
                }
            }
        }
    }

    private final void onExtraCallbackWithResult(final addChangePayload addchangepayload) {
        synchronized (this) {
            Integer num = this.onWarmupCompleted.get(addchangepayload.onUnminimized());
            if (num != null) {
                this.onWarmupCompleted.remove(addchangepayload.onUnminimized());
                ArrayList<addChangePayload> arrayList = this.onNavigationEvent.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(addchangepayload);
                    }
                    if (arrayList.size() == 0) {
                        this.onNavigationEvent.remove(num.intValue());
                    }
                }
            }
            if (addchangepayload.ICustomTabsCallbackStub() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerRegistry$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNGestureHandlerRegistry.IAuthTabCallback(addchangepayload);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(addChangePayload addchangepayload) {
        addchangepayload.onTransact();
    }

    public final void onWarmupCompleted(int i) {
        synchronized (this) {
            addChangePayload addchangepayload = this.onExtraCallback.get(i);
            if (addchangepayload != null) {
                onExtraCallbackWithResult(addchangepayload);
                this.onExtraCallback.remove(i);
            }
        }
    }

    public final void onNavigationEvent() {
        synchronized (this) {
            this.onExtraCallback.clear();
            this.onWarmupCompleted.clear();
            this.onNavigationEvent.clear();
        }
    }

    public final ArrayList<addChangePayload> IAuthTabCallback(int i) {
        ArrayList<addChangePayload> arrayList;
        synchronized (this) {
            arrayList = this.onNavigationEvent.get(i);
        }
        return arrayList;
    }

    @Override // o.clearTmpDetachFlag
    public ArrayList<addChangePayload> IAuthTabCallback(@NotNull View view) {
        ArrayList<addChangePayload> arrayListIAuthTabCallback;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(view, "");
            arrayListIAuthTabCallback = IAuthTabCallback(view.getId());
        }
        return arrayListIAuthTabCallback;
    }
}
