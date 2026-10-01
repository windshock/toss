package kotlinx.datetime.internal.format;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.jw4;

/* JADX INFO: Add missing generic type declarations: [Target] */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class ReducedIntFieldDirective$formatter$1<Target> extends FunctionReferenceImpl implements Function1<Target, Integer> {
    ReducedIntFieldDirective$formatter$1(Object obj) {
        super(1, obj, jw4.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Integer invoke(Target target) {
        return (Integer) ((jw4) this.receiver).onExtraCallback(target);
    }
}
