package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.au;
import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class bc implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;
    private final av c;
    private final av d;
    private final av e;
    private final av f;
    private final av g;
    private final av h;

    /* renamed from: i, reason: collision with root package name */
    private final av f9i;

    public bc(av avVar, av avVar2, av avVar3, av avVar4, av avVar5, av avVar6, av avVar7, av avVar8, av avVar9) {
        this.a = avVar;
        this.b = avVar2;
        this.c = avVar3;
        this.d = avVar4;
        this.e = avVar5;
        this.f = avVar6;
        this.g = avVar7;
        this.h = avVar8;
        this.f9i = avVar9;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() {
        Context contextB = ((u) this.a).b();
        Object objA = this.b.a();
        Object objA2 = this.c.a();
        com.google.android.play.core.assetpacks.internal.aq aqVarC = com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.d));
        Object objA3 = this.e.a();
        return new bb(contextB, (de) objA, (cl) objA2, aqVarC, (co) objA3, (bx) this.f.a(), com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.g)), com.google.android.play.core.assetpacks.internal.aq.c(au.a(this.h)), (ea) this.f9i.a());
    }
}
