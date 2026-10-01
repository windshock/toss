package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkAdListLayoutCpsPopular;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class q extends FunctionReferenceImpl implements Function1 {
    public q(TnkAdListLayoutCpsPopular tnkAdListLayoutCpsPopular) {
        super(1, tnkAdListLayoutCpsPopular, TnkAdListLayoutCpsPopular.class, "onClickReload", "onClickReload(I)V", 0);
    }

    public final Object invoke(Object obj) {
        ((TnkAdListLayoutCpsPopular) ((CallableReference) this).receiver).onClickReload(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
