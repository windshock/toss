package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkBasicCurationTypeNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class u extends FunctionReferenceImpl implements Function1 {
    public u(TnkBasicCurationTypeNew tnkBasicCurationTypeNew) {
        super(1, tnkBasicCurationTypeNew, TnkBasicCurationTypeNew.class, "onClickReload", "onClickReload(I)V", 0);
    }

    public final Object invoke(Object obj) {
        ((TnkBasicCurationTypeNew) ((CallableReference) this).receiver).onClickReload(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
