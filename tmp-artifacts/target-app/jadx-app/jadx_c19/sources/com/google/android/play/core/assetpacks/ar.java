package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ar extends al {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ aw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(aw awVar, TaskCompletionSource taskCompletionSource, int i2, String str, int i3) {
        super(awVar, taskCompletionSource);
        this.f = awVar;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.al, com.google.android.play.core.assetpacks.internal.h
    public final void d(Bundle bundle) {
        this.f.f.u(this.a);
        aw.a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.e;
        if (i2 > 0) {
            this.f.D(this.c, this.d, i2 - 1);
        }
    }
}
