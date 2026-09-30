package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14100;
import o.access15400;
import o.clearCommandLine;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super String>, access13800<? super Unit>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, access13800<? super Regex$splitToSequence$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, access13800Var);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(clearCommandLine<? super String> clearcommandline, access13800<? super Unit> access13800Var) {
        return ((Regex$splitToSequence$1) create(clearcommandline, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r0.onNavigationEvent(r4, r10) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (r0.onNavigationEvent(r2, r10) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:20:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Matcher matcher;
        int i2;
        String string;
        clearCommandLine clearcommandline = (clearCommandLine) this.L$0;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            Matcher matcher2 = this.this$0.nativePattern.matcher(this.$input);
            if (this.$limit == 1 || !matcher2.find()) {
                String string2 = this.$input.toString();
                this.L$0 = access15400.onNavigationEvent(clearcommandline);
                this.L$1 = access15400.onNavigationEvent(matcher2);
                this.label = 1;
            } else {
                i = 0;
                matcher = matcher2;
                i2 = 0;
                string = this.$input.subSequence(i, matcher.start()).toString();
                this.L$0 = clearcommandline;
                this.L$1 = matcher;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                if (clearcommandline.onNavigationEvent(string, this) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
        } else if (i3 == 1) {
            ResultKt.onNavigationEvent(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            int i4 = this.I$1;
            matcher = (Matcher) this.L$1;
            ResultKt.onNavigationEvent(obj);
            int iEnd = matcher.end();
            int i5 = i4 + 1;
            if (i5 == this.$limit - 1 && matcher.find()) {
                i = iEnd;
                i2 = i5;
                string = this.$input.subSequence(i, matcher.start()).toString();
                this.L$0 = clearcommandline;
                this.L$1 = matcher;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 2;
                if (clearcommandline.onNavigationEvent(string, this) != objOnExtraCallback) {
                    i4 = i2;
                    int iEnd2 = matcher.end();
                    int i52 = i4 + 1;
                    if (i52 == this.$limit - 1) {
                    }
                    CharSequence charSequence = this.$input;
                    String string3 = charSequence.subSequence(iEnd2, charSequence.length()).toString();
                    this.L$0 = access15400.onNavigationEvent(clearcommandline);
                    this.L$1 = access15400.onNavigationEvent(matcher);
                    this.I$0 = iEnd2;
                    this.I$1 = i52;
                    this.label = 3;
                }
                return objOnExtraCallback;
            }
            CharSequence charSequence2 = this.$input;
            String string32 = charSequence2.subSequence(iEnd2, charSequence2.length()).toString();
            this.L$0 = access15400.onNavigationEvent(clearcommandline);
            this.L$1 = access15400.onNavigationEvent(matcher);
            this.I$0 = iEnd2;
            this.I$1 = i52;
            this.label = 3;
        }
        return Unit.INSTANCE;
    }
}
