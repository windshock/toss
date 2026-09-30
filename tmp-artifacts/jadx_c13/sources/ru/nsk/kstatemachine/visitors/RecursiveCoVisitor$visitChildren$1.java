package ru.nsk.kstatemachine.visitors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveCoVisitor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RecursiveCoVisitor$visitChildren$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    RecursiveCoVisitor$visitChildren$1(access13800<? super RecursiveCoVisitor$visitChildren$1> access13800Var) {
        super(access13800Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RecursiveCoVisitor.DefaultImpls.onExtraCallbackWithResult(null, null, this);
    }
}
