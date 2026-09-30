package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.au;
import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class t implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;

    public t(av avVar, av avVar2, av avVar3) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        y yVar = p.b(((u) this.a).b()) == null ? (y) com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.b)).a() : (y) com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.c)).a();
        com.google.android.play.core.assetpacks.internal.ar.a(yVar);
        return yVar;
    }
}
