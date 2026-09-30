package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class di implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;

    public di(av avVar, av avVar2, av avVar3) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        av avVar = this.c;
        av avVar2 = this.b;
        return new dh((de) this.a.a(), (bh) avVar2.a(), (bu) avVar.a());
    }
}
