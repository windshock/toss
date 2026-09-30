package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class cd {
    private p a;

    private cd() {
    }

    /* synthetic */ cd(cc ccVar) {
    }

    public final cd b(p pVar) {
        this.a = pVar;
        return this;
    }

    public final a a() {
        p pVar = this.a;
        if (pVar != null) {
            return new cb(pVar, null);
        }
        throw new IllegalStateException(String.valueOf(p.class.getCanonicalName()).concat(" must be set"));
    }
}
