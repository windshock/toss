package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.basic.TnkCpsSearchResultHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
    public f(TnkFilterDialog tnkFilterDialog) {
        super(1, tnkFilterDialog, TnkFilterDialog.class, "onFilterSelected", "onFilterSelected(Lcom/tnkfactory/ad/basic/TnkCpsSearchResultHeader$FilterOption;)V", 0);
    }

    public final Object invoke(Object obj) {
        TnkCpsSearchResultHeader.FilterOption filterOption = (TnkCpsSearchResultHeader.FilterOption) obj;
        Intrinsics.checkNotNullParameter(filterOption, "");
        ((TnkFilterDialog) ((CallableReference) this).receiver).onFilterSelected(filterOption);
        return Unit.INSTANCE;
    }
}
