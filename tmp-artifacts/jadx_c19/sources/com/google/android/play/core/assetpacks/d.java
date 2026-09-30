package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d {
    private static a a;

    static a a(Context context) {
        a aVar;
        synchronized (d.class) {
            if (a == null) {
                cd cdVar = new cd(null);
                cdVar.b(new p(com.google.android.play.core.assetpacks.internal.ag.a(context)));
                a = cdVar.a();
            }
            aVar = a;
        }
        return aVar;
    }
}
