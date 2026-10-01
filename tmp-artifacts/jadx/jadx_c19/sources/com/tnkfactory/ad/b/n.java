package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkAdListItemLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
    public n(TnkAdListItemLayout tnkAdListItemLayout) {
        super(1, tnkAdListItemLayout, TnkAdListItemLayout.class, "onClickReload", "onClickReload(I)V", 0);
    }

    public final Object invoke(Object obj) {
        ((TnkAdListItemLayout) ((CallableReference) this).receiver).onClickReload(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
