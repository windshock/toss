package com.fasterxml.jackson.core.type;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ResolvedType {
    public abstract String onExtraCallbackWithResult();

    public abstract ResolvedType onNavigationEvent();

    public boolean IAuthTabCallback() {
        return onNavigationEvent() != null;
    }
}
