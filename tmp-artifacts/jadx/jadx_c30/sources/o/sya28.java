package o;

import java.util.Optional;
import java.util.function.Supplier;
import o.sya28;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya28 extends sya44 {
    private final sya18 onExtraCallback;

    public sya28(Optional<sya18> optional, Optional<sya8> optional2, Optional<sya8> optional3) {
        super(optional, optional2, optional3);
        this.onExtraCallback = optional.orElseThrow(new Supplier() { // from class: org.snakeyaml.engine.v2.events.AliasEvent$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return sya28.onExtraCallback();
            }
        });
    }

    public static /* synthetic */ NullPointerException onExtraCallback() {
        return new NullPointerException("Anchor is required in AliasEvent");
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.Alias;
    }

    public String toString() {
        return "=ALI *" + this.onExtraCallback;
    }

    public sya18 IAuthTabCallback() {
        return this.onExtraCallback;
    }
}
