package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
    public static final Regex$findAll$2 onWarmupCompleted = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final MatchResult invoke(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.onNavigationEvent();
    }
}
