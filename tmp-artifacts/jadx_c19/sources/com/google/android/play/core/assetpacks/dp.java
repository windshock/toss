package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.au;
import com.google.android.play.core.assetpacks.internal.av;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dp implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;
    private final av d;
    private final av e;
    private final av f;
    private final av g;

    public dp(av avVar, av avVar2, av avVar3, av avVar4, av avVar5, av avVar6, av avVar7) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
        this.e = avVar5;
        this.f = avVar6;
        this.g = avVar7;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        String str = (String) this.a.a();
        Object objA = this.b.a();
        Object objA2 = this.c.a();
        Context contextB = ((u) this.d).b();
        Object objA3 = this.e.a();
        return new Cdo(str != null ? new File(contextB.getExternalFilesDir(null), str) : contextB.getExternalFilesDir(null), (bb) objA, (co) objA2, contextB, (ec) objA3, com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.f)), (ea) this.g.a());
    }
}
