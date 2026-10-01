package o;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import net.sf.scuba.smartcards.BuildConfig;
import o.sya18;
import o.sya43;
import o.sya492;
import o.sya61;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya492 extends sya44 {
    private final Optional<String> IAuthTabCallback;
    private final sya6 onExtraCallback;
    private final sya46 onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public static /* synthetic */ boolean IAuthTabCallback(int i) {
        return i < 65535;
    }

    public sya492(Optional<sya18> optional, Optional<String> optional2, sya46 sya46Var, String str, sya6 sya6Var, Optional<sya8> optional3, Optional<sya8> optional4) {
        super(optional, optional3, optional4);
        Objects.requireNonNull(optional2);
        this.IAuthTabCallback = optional2;
        this.onExtraCallbackWithResult = sya46Var;
        Objects.requireNonNull(str);
        this.onWarmupCompleted = str;
        Objects.requireNonNull(sya6Var);
        this.onExtraCallback = sya6Var;
    }

    public Optional<String> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public sya6 onExtraCallback() {
        return this.onExtraCallback;
    }

    public String IAuthTabCallbackDefault() {
        return this.onWarmupCompleted;
    }

    public sya46 onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.Scalar;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.onExtraCallback == sya6.PLAIN;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.onExtraCallback == sya6.LITERAL;
    }

    public boolean access100() {
        return this.onExtraCallback == sya6.SINGLE_QUOTED;
    }

    public boolean asBinder() {
        return this.onExtraCallback == sya6.DOUBLE_QUOTED;
    }

    public boolean getInterfaceDescriptor() {
        return this.onExtraCallback == sya6.FOLDED;
    }

    public boolean access000() {
        return this.onExtraCallback == sya6.JSON_SCALAR_STYLE;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("=VAL");
        onTransact().ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.events.ScalarEvent$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sb.append(" &" + ((sya18) obj));
            }
        });
        if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
            IAuthTabCallback().ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.events.ScalarEvent$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    sb.append(" <" + ((String) obj) + ">");
                }
            });
        }
        sb.append(" ");
        sb.append(onExtraCallback().toString());
        sb.append(onExtraCallbackWithResult());
        return sb.toString();
    }

    public String onExtraCallbackWithResult() {
        return (String) this.onWarmupCompleted.codePoints().filter(new IntPredicate() { // from class: org.snakeyaml.engine.v2.events.ScalarEvent$$ExternalSyntheticLambda2
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return sya492.IAuthTabCallback(i);
            }
        }).mapToObj(new IntFunction() { // from class: org.snakeyaml.engine.v2.events.ScalarEvent$$ExternalSyntheticLambda3
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return sya61.onExtraCallback(String.valueOf(Character.toChars(i)));
            }
        }).collect(Collectors.joining(BuildConfig.FLAVOR));
    }
}
