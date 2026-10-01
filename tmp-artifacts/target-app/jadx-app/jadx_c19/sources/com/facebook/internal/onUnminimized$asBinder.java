package com.facebook.internal;

import java.util.TreeSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class onUnminimized$asBinder {
    private TreeSet<Integer> onExtraCallbackWithResult;

    public abstract String onExtraCallbackWithResult();

    public abstract String onWarmupCompleted();

    public String onNavigationEvent() {
        return "token,signed_request,graph_domain";
    }

    public final TreeSet<Integer> onTransact() {
        TreeSet<Integer> treeSet = this.onExtraCallbackWithResult;
        if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
            onExtraCallback(false);
        }
        return this.onExtraCallbackWithResult;
    }

    public final void onExtraCallback(boolean z) {
        synchronized (this) {
            if (!z) {
                TreeSet<Integer> treeSet = this.onExtraCallbackWithResult;
                if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                }
            }
            this.onExtraCallbackWithResult = onUnminimized.onNavigationEvent(onUnminimized.onExtraCallback, this);
        }
    }
}
