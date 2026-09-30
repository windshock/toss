package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealBufferedSink implements TTAppOpenAdActivity9 {
    public final TTBaseActivity IAuthTabCallback;
    public boolean onExtraCallback;
    public final TTHistoryActivity41 onWarmupCompleted;

    public RealBufferedSink(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        this.onWarmupCompleted = tTHistoryActivity41;
        this.IAuthTabCallback = new TTBaseActivity();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTBaseActivity access100() {
        return this.IAuthTabCallback;
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallbackWithResult(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallbackWithResult(str, charset);
        return asInterface();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.IAuthTabCallback.write(byteBuffer);
        asInterface();
        return iWrite;
    }

    @Override // o.TTAppOpenAdActivity9
    public OutputStream access000() {
        return new OutputStream() { // from class: okio.RealBufferedSink$outputStream$1
            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                RealBufferedSink realBufferedSink = this.onExtraCallbackWithResult;
                if (realBufferedSink.onExtraCallback) {
                    throw new IOException("closed");
                }
                realBufferedSink.IAuthTabCallback.onExtraCallbackWithResult((int) ((byte) i));
                this.onExtraCallbackWithResult.asInterface();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(bArr, "");
                RealBufferedSink realBufferedSink = this.onExtraCallbackWithResult;
                if (realBufferedSink.onExtraCallback) {
                    throw new IOException("closed");
                }
                realBufferedSink.IAuthTabCallback.onExtraCallback(bArr, i, i2);
                this.onExtraCallbackWithResult.asInterface();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = this.onExtraCallbackWithResult;
                if (realBufferedSink.onExtraCallback) {
                    return;
                }
                realBufferedSink.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                this.onExtraCallbackWithResult.close();
            }

            public String toString() {
                return this.onExtraCallbackWithResult + ".outputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.onExtraCallback;
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.write(tTBaseActivity, j);
        asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallback(tTBaseLandingPageActivity);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallback(str);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onNavigationEvent(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onNavigationEvent(str, i, i2);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 access100(int i) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.access100(i);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallback(bArr);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallback(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallback(bArr, i, i2);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public long onExtraCallbackWithResult(@NotNull TTHistoryActivity42 tTHistoryActivity42) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        long j = 0;
        while (true) {
            long j2 = tTHistoryActivity42.read(this.IAuthTabCallback, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            asInterface();
        }
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 onExtraCallbackWithResult(int i) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.onExtraCallbackWithResult(i);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 IAuthTabCallbackDefault(int i) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.IAuthTabCallbackDefault(i);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 asBinder(int i) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.asBinder(i);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 IAuthTabCallbackStub(int i) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.IAuthTabCallbackStub(i);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 writeTypedObject(long j) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.writeTypedObject(j);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 IAuthTabCallbackStubProxy(long j) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.IAuthTabCallbackStubProxy(j);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 access000(long j) {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        this.IAuthTabCallback.access000(j);
        return asInterface();
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 asInterface() throws IOException {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        long jOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
        if (jOnExtraCallbackWithResult > 0) {
            this.onWarmupCompleted.write(this.IAuthTabCallback, jOnExtraCallbackWithResult);
        }
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    public TTAppOpenAdActivity9 asBinder() throws IOException {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        long jICustomTabsCallbackDefault = this.IAuthTabCallback.ICustomTabsCallbackDefault();
        if (jICustomTabsCallbackDefault > 0) {
            this.onWarmupCompleted.write(this.IAuthTabCallback, jICustomTabsCallbackDefault);
        }
        return this;
    }

    @Override // o.TTAppOpenAdActivity9, o.TTHistoryActivity41, java.io.Flushable
    public void flush() throws IOException {
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        if (this.IAuthTabCallback.ICustomTabsCallbackDefault() > 0) {
            TTHistoryActivity41 tTHistoryActivity41 = this.onWarmupCompleted;
            TTBaseActivity tTBaseActivity = this.IAuthTabCallback;
            tTHistoryActivity41.write(tTBaseActivity, tTBaseActivity.ICustomTabsCallbackDefault());
        }
        this.onWarmupCompleted.flush();
    }

    @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.onExtraCallback) {
            return;
        }
        try {
            if (this.IAuthTabCallback.ICustomTabsCallbackDefault() > 0) {
                TTHistoryActivity41 tTHistoryActivity41 = this.onWarmupCompleted;
                TTBaseActivity tTBaseActivity = this.IAuthTabCallback;
                tTHistoryActivity41.write(tTBaseActivity, tTBaseActivity.ICustomTabsCallbackDefault());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.onWarmupCompleted.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.onExtraCallback = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onWarmupCompleted.timeout();
    }

    public String toString() {
        return "buffer(" + this.onWarmupCompleted + ')';
    }
}
