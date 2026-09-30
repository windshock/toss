package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ycxExternalSyntheticApiModelOutline1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxExternalSyntheticApiModelOutline1<Output> implements setTextLocales<Output> {
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Function2<Output, Boolean, Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ycxExternalSyntheticApiModelOutline1(@NotNull Function2<? super Output, ? super Boolean, Unit> function2, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = function2;
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = str;
    }

    @Override // o.setTextLocales
    public Object onExtraCallback(Output output, @NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i >= charSequence.length()) {
            return fbyycx.Companion.onExtraCallbackWithResult(i);
        }
        final char cCharAt = charSequence.charAt(i);
        if (cCharAt == '-') {
            this.onNavigationEvent.invoke(output, Boolean.TRUE);
            return fbyycx.Companion.onExtraCallbackWithResult(i + 1);
        }
        if (cCharAt == '+' && this.onExtraCallbackWithResult) {
            this.onNavigationEvent.invoke(output, Boolean.FALSE);
            return fbyycx.Companion.onExtraCallbackWithResult(i + 1);
        }
        return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.SignParser$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ycxExternalSyntheticApiModelOutline1.onNavigationEvent(this.f$0, cCharAt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onNavigationEvent(ycxExternalSyntheticApiModelOutline1 ycxexternalsyntheticapimodeloutline1, char c) {
        return "Expected " + ycxexternalsyntheticapimodeloutline1.onExtraCallback + " but got " + c;
    }

    public String toString() {
        return this.onExtraCallback;
    }
}
