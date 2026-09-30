package com.google.android.play.core.assetpacks.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ap implements as {
    private as a;

    public static void b(as asVar, as asVar2) {
        ap apVar = (ap) asVar;
        if (apVar.a != null) {
            throw new IllegalStateException();
        }
        apVar.a = asVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final Object a() {
        as asVar = this.a;
        if (asVar != null) {
            return asVar.a();
        }
        throw new IllegalStateException();
    }
}
