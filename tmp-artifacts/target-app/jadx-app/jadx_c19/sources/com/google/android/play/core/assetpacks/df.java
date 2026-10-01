package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.au;
import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class df implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;
    private final av d;

    public df(av avVar, av avVar2, av avVar3, av avVar4) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        Object objA = this.a.a();
        return new de((bh) objA, com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.b)), (co) this.c.a(), com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.d)));
    }
}
