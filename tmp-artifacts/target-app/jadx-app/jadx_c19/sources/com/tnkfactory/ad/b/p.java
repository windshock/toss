package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkAdListLayoutCpsF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Function1 {
    public p(TnkAdListLayoutCpsF tnkAdListLayoutCpsF) {
        super(1, tnkAdListLayoutCpsF, TnkAdListLayoutCpsF.class, "onClickReload", "onClickReload(I)V", 0);
    }

    public final Object invoke(Object obj) {
        ((TnkAdListLayoutCpsF) ((CallableReference) this).receiver).onClickReload(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
