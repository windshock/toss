package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ax implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;

    public ax(av avVar, av avVar2, av avVar3) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        return new aw(((u) this.a).b(), (co) this.b.a(), (ea) this.c.a());
    }
}
