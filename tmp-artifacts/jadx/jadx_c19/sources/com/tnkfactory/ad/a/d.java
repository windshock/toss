package com.tnkfactory.ad.a;

import com.tnkfactory.ad.AdListViewImpl;
import com.tnkfactory.ad.rwd.BannerItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdListViewImpl a;
    public final /* synthetic */ BannerItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdListViewImpl adListViewImpl, BannerItem bannerItem, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adListViewImpl;
        this.b = bannerItem;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new d(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new d(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        ResultKt.onNavigationEvent(obj);
        this.a.getAdClickProcessor().onBannerSelected(this.b, this.a);
        return Unit.INSTANCE;
    }
}
