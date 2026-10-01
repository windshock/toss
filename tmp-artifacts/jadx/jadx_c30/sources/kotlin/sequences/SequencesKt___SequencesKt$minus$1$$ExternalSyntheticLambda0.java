package kotlin.sequences;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.ensureCausesIsMutable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$minus$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ Ref.BooleanRef f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SequencesKt___SequencesKt$minus$1$$ExternalSyntheticLambda0(Ref.BooleanRef booleanRef, Object obj) {
        this.f$0 = booleanRef;
        this.f$1 = obj;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(ensureCausesIsMutable.onExtraCallbackWithResult.onExtraCallback(this.f$0, this.f$1, obj));
    }
}
