package com.tnkfactory.ad.a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.clearWrite;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class b implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public b(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    public final clearWrite getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.a.invoke(obj);
    }
}
