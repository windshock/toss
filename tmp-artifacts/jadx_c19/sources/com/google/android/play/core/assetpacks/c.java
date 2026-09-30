package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;
    private final av d;

    public c(av avVar, av avVar2, av avVar3, av avVar4) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        return new b(((u) this.a).b(), (bh) this.b.a(), (l) this.c.a(), (ci) this.d.a());
    }
}
