package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o.applyConstraintsFromLayoutParams;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestTracker {
    private boolean onNavigationEvent;
    private final Set<Request> onExtraCallbackWithResult = Collections.newSetFromMap(new WeakHashMap());
    private final Set<Request> onWarmupCompleted = new HashSet();

    public void IAuthTabCallback(@NonNull Request request) {
        this.onExtraCallbackWithResult.add(request);
        if (!this.onNavigationEvent) {
            request.onNavigationEvent();
        } else {
            request.onExtraCallbackWithResult();
            this.onWarmupCompleted.add(request);
        }
    }

    public boolean onExtraCallbackWithResult(@Nullable Request request) {
        boolean z = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = this.onExtraCallbackWithResult.remove(request);
        if (!this.onWarmupCompleted.remove(request) && !zRemove) {
            z = false;
        }
        if (z) {
            request.onExtraCallbackWithResult();
        }
        return z;
    }

    public void onExtraCallbackWithResult() {
        this.onNavigationEvent = true;
        for (Request request : applyConstraintsFromLayoutParams.IAuthTabCallback(this.onExtraCallbackWithResult)) {
            if (request.IAuthTabCallbackStub()) {
                request.asInterface();
                this.onWarmupCompleted.add(request);
            }
        }
    }

    public void onNavigationEvent() {
        this.onNavigationEvent = true;
        for (Request request : applyConstraintsFromLayoutParams.IAuthTabCallback(this.onExtraCallbackWithResult)) {
            if (request.IAuthTabCallbackStub() || request.asBinder()) {
                request.onExtraCallbackWithResult();
                this.onWarmupCompleted.add(request);
            }
        }
    }

    public void onWarmupCompleted() {
        this.onNavigationEvent = false;
        for (Request request : applyConstraintsFromLayoutParams.IAuthTabCallback(this.onExtraCallbackWithResult)) {
            if (!request.asBinder() && !request.IAuthTabCallbackStub()) {
                request.onNavigationEvent();
            }
        }
        this.onWarmupCompleted.clear();
    }

    public void onExtraCallback() {
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.onExtraCallbackWithResult).iterator();
        while (it.hasNext()) {
            onExtraCallbackWithResult((Request) it.next());
        }
        this.onWarmupCompleted.clear();
    }

    public void IAuthTabCallback() {
        for (Request request : applyConstraintsFromLayoutParams.IAuthTabCallback(this.onExtraCallbackWithResult)) {
            if (!request.asBinder() && !request.onExtraCallback()) {
                request.onExtraCallbackWithResult();
                if (!this.onNavigationEvent) {
                    request.onNavigationEvent();
                } else {
                    this.onWarmupCompleted.add(request);
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.onExtraCallbackWithResult.size() + ", isPaused=" + this.onNavigationEvent + "}";
    }
}
