package org.apache.commons.digester;

import o.PAGVideoAdListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class Rule {
    protected PAGVideoAdListener IAuthTabCallback = null;
    protected String onExtraCallback = null;

    @Deprecated
    public Rule(PAGVideoAdListener pAGVideoAdListener) {
        IAuthTabCallback(pAGVideoAdListener);
    }

    public Rule() {
    }

    public void IAuthTabCallback(PAGVideoAdListener pAGVideoAdListener) {
        this.IAuthTabCallback = pAGVideoAdListener;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }
}
