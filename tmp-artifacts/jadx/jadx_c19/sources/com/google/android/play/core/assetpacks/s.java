package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.af;
import com.google.android.play.core.assetpacks.internal.av;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class s implements com.google.android.play.core.assetpacks.internal.as {
    private final av a;
    private final av b;

    public s(av avVar, av avVar2) {
        this.a = avVar;
        this.b = avVar2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.av
    public final /* bridge */ /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        Object objA = this.a.a();
        Context contextB = ((u) this.b).b();
        l lVar = (l) objA;
        af.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        af.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        com.google.android.play.core.assetpacks.internal.ar.a(lVar);
        return lVar;
    }
}
