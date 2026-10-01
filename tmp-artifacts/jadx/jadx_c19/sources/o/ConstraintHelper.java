package o;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ConstraintHelper extends InputStream {
    private static final Queue<ConstraintHelper> onWarmupCompleted = applyConstraintsFromLayoutParams.onWarmupCompleted(0);
    private InputStream IAuthTabCallback;
    private IOException onExtraCallback;

    public static ConstraintHelper onExtraCallback(@NonNull InputStream inputStream) {
        ConstraintHelper constraintHelperPoll;
        Queue<ConstraintHelper> queue = onWarmupCompleted;
        synchronized (queue) {
            constraintHelperPoll = queue.poll();
        }
        if (constraintHelperPoll == null) {
            constraintHelperPoll = new ConstraintHelper();
        }
        constraintHelperPoll.onExtraCallbackWithResult(inputStream);
        return constraintHelperPoll;
    }

    ConstraintHelper() {
    }

    void onExtraCallbackWithResult(@NonNull InputStream inputStream) {
        this.IAuthTabCallback = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.IAuthTabCallback.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.IAuthTabCallback.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.IAuthTabCallback.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.IAuthTabCallback.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.IAuthTabCallback.read();
        } catch (IOException e) {
            this.onExtraCallback = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.IAuthTabCallback.read(bArr);
        } catch (IOException e) {
            this.onExtraCallback = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return this.IAuthTabCallback.read(bArr, i2, i3);
        } catch (IOException e) {
            this.onExtraCallback = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            this.IAuthTabCallback.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.IAuthTabCallback.skip(j);
        } catch (IOException e) {
            this.onExtraCallback = e;
            throw e;
        }
    }

    public IOException onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public void onNavigationEvent() {
        this.onExtraCallback = null;
        this.IAuthTabCallback = null;
        Queue<ConstraintHelper> queue = onWarmupCompleted;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
