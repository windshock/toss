package okhttp3;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TrailersSource {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final TrailersSource EMPTY = new TrailersSource() { // from class: okhttp3.TrailersSource$Companion$EMPTY$1
        @Override // okhttp3.TrailersSource
        public Headers peek() {
            return Headers.EMPTY;
        }

        @Override // okhttp3.TrailersSource
        public Headers get() {
            return Headers.EMPTY;
        }
    };

    Headers get() throws IOException;

    default Headers peek() throws IOException {
        return null;
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
