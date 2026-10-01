package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16400 implements Sequence<String> {
    private final BufferedReader onExtraCallback;

    public access16400(@NotNull BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "");
        this.onExtraCallback = bufferedReader;
    }

    public static final class IAuthTabCallback implements Iterator<String>, KMappedMarker {
        private String IAuthTabCallback;
        private boolean onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IAuthTabCallback() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.IAuthTabCallback == null && !this.onWarmupCompleted) {
                String line = access16400.this.onExtraCallback.readLine();
                this.IAuthTabCallback = line;
                if (line == null) {
                    this.onWarmupCompleted = true;
                }
            }
            return this.IAuthTabCallback != null;
        }

        @Override // java.util.Iterator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.IAuthTabCallback;
            this.IAuthTabCallback = null;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<String> IAuthTabCallback() {
        return new IAuthTabCallback();
    }
}
