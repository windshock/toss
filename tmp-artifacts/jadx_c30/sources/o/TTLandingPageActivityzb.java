package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTLandingPageActivityzb {
    private final Class<?>[] IAuthTabCallback;

    Object onExtraCallback(TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, InputStream inputStream) throws IOException {
        return null;
    }

    abstract InputStream onNavigationEvent(String str, InputStream inputStream, long j, TTPlayableLandingPageActivity4 tTPlayableLandingPageActivity4, byte[] bArr, int i) throws IOException;

    protected static int onExtraCallbackWithResult(Object obj, int i) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    protected TTLandingPageActivityzb(Class<?>... clsArr) {
        Objects.requireNonNull(clsArr, "optionClasses");
        this.IAuthTabCallback = clsArr;
    }

    byte[] onWarmupCompleted(Object obj) throws IOException {
        return showPrivacyActivity.onExtraCallback;
    }

    boolean onNavigationEvent(final Object obj) {
        return Stream.of((Object[]) this.IAuthTabCallback).anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.sevenz.AbstractCoder$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Class) obj2).isInstance(obj);
            }
        });
    }
}
