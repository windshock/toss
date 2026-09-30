package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkAdListLayoutCpsB;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class o extends FunctionReferenceImpl implements Function1 {
    public o(TnkAdListLayoutCpsB tnkAdListLayoutCpsB) {
        super(1, tnkAdListLayoutCpsB, TnkAdListLayoutCpsB.class, "onClickReload", "onClickReload(I)V", 0);
    }

    public final Object invoke(Object obj) {
        ((TnkAdListLayoutCpsB) ((CallableReference) this).receiver).onClickReload(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
