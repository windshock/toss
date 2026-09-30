package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ag extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ TaskCompletionSource e;
    final /* synthetic */ aw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aw awVar, TaskCompletionSource taskCompletionSource, int i2, String str, String str2, int i3, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = i3;
        this.e = taskCompletionSource2;
        this.f = awVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        try {
            this.f.f.e().g(this.f.c, aw.k(this.a, this.b, this.c, this.d), aw.A(), new aq(this.f, this.e));
        } catch (RemoteException e) {
            aw.a.c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
