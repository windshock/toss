package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class v extends ContinuationImpl {
    public AdEventHandler a;
    public AdListVo b;
    public AdEventListener c;
    public AdActionInfoVo d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AdEventHandler f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AdEventHandler adEventHandler, access13800 access13800Var) {
        super(access13800Var);
        this.f = adEventHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((AdListVo) null, (AdEventListener) null, (access13800) this);
    }
}
