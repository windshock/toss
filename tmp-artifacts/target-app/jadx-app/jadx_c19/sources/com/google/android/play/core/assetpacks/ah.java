package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ah extends com.google.android.play.core.assetpacks.internal.p {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(aw awVar, TaskCompletionSource taskCompletionSource, int i2, String str, TaskCompletionSource taskCompletionSource2, int i3) {
        super(taskCompletionSource);
        this.a = i2;
        this.b = str;
        this.c = taskCompletionSource2;
        this.d = i3;
        this.e = awVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.assetpacks.internal.f] */
    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        try {
            this.e.f.e().h(this.e.c, aw.z(this.a, this.b), aw.A(), new ar(this.e, this.c, this.a, this.b, this.d));
        } catch (RemoteException e) {
            aw.a.c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
