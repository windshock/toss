package o;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import o.sya18;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class sya38 extends sya44 {
    private final Optional<String> onExtraCallbackWithResult;
    private final sya19 onNavigationEvent;
    private final boolean onWarmupCompleted;

    public sya38(Optional<sya18> optional, Optional<String> optional2, boolean z, sya19 sya19Var, Optional<sya8> optional3, Optional<sya8> optional4) {
        super(optional, optional3, optional4);
        Objects.requireNonNull(optional2);
        this.onExtraCallbackWithResult = optional2;
        this.onWarmupCompleted = z;
        Objects.requireNonNull(sya19Var);
        this.onNavigationEvent = sya19Var;
    }

    public Optional<String> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public sya19 IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public boolean onWarmupCompleted() {
        return sya19.FLOW == this.onNavigationEvent;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        onTransact().ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.events.CollectionStartEvent$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                sb.append(" &" + ((sya18) obj));
            }
        });
        if (!this.onWarmupCompleted) {
            onExtraCallbackWithResult().ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.events.CollectionStartEvent$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    sb.append(" <" + ((String) obj) + ">");
                }
            });
        }
        return sb.toString();
    }
}
