package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.au;
import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dz implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;
    private final av d;
    private final av e;
    private final av f;

    public dz(av avVar, av avVar2, av avVar3, av avVar4, av avVar5, av avVar6) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
        this.e = avVar5;
        this.f = avVar6;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        Object objA = this.a.a();
        com.google.android.play.core.assetpacks.internal.aq aqVarC = com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.b));
        Object objA2 = this.c.a();
        return new dy((bh) objA, aqVarC, (de) objA2, com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.d)), (co) this.e.a(), (ea) this.f.a());
    }
}
