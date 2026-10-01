package kotlin.text;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Regex$special$$inlined$fromInt$1 implements Function1<RegexOption, Boolean> {
    final /* synthetic */ int onExtraCallback;

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(RegexOption regexOption) {
        RegexOption regexOption2 = regexOption;
        return Boolean.valueOf((this.onExtraCallback & regexOption2.getMask()) == regexOption2.getValue());
    }
}
