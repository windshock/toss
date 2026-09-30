package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.basic.TnkCpsSearchResultHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
    public e(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog) {
        super(1, tnkCpsSearchWithFilterDialog, TnkCpsSearchWithFilterDialog.class, "onFilterSelected", "onFilterSelected(Lcom/tnkfactory/ad/basic/TnkCpsSearchResultHeader$FilterOption;)V", 0);
    }

    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
        TnkCpsSearchResultHeader.FilterOption filterOption = (TnkCpsSearchResultHeader.FilterOption) obj;
        Intrinsics.checkNotNullParameter(filterOption, "");
        ((TnkCpsSearchWithFilterDialog) ((CallableReference) this).receiver).onFilterSelected(filterOption);
        return Unit.INSTANCE;
    }
}
