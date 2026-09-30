package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import o.TTAppOpenAdActivity6;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity1;
import o.TTHistoryActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryActivity711;
import o.TTHistoryLandingPageActivity111;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealBufferedSource implements TTAppOpenAdTransActivity {
    public final TTBaseActivity IAuthTabCallback;
    public final TTHistoryActivity42 onNavigationEvent;
    public boolean onWarmupCompleted;

    public RealBufferedSource(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        this.onNavigationEvent = tTHistoryActivity42;
        this.IAuthTabCallback = new TTBaseActivity();
    }

    @Override // o.TTAppOpenAdTransActivity, o.TTAppOpenAdActivity9
    public TTBaseActivity access100() {
        return this.IAuthTabCallback;
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseActivity IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.TTAppOpenAdTransActivity
    public int IAuthTabCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return onExtraCallback(bArr, 0, bArr.length);
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onUnminimized() {
        return onExtraCallback(LongCompanionObject.MAX_VALUE);
    }

    public long onExtraCallbackWithResult(byte b) {
        return onNavigationEvent(b, 0L, LongCompanionObject.MAX_VALUE);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onExtraCallback(tTBaseLandingPageActivity, 0L);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onNavigationEvent(tTBaseLandingPageActivity, j, LongCompanionObject.MAX_VALUE);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j, long j2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return TTHistoryLandingPageActivity111.onExtraCallback(this, tTBaseLandingPageActivity, (6 & 2) != 0 ? 0 : 0, (6 & 4) != 0 ? tTBaseLandingPageActivity.access100() : 0, j, (6 & 16) != 0 ? Long.MAX_VALUE : j2);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onWarmupCompleted(tTBaseLandingPageActivity, 0L);
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean onNavigationEvent(long j, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onExtraCallbackWithResult(j, tTBaseLandingPageActivity, 0, tTBaseLandingPageActivity.access100());
    }

    @Override // o.TTAppOpenAdTransActivity
    public InputStream IAuthTabCallbackStubProxy() {
        return new InputStream() { // from class: okio.RealBufferedSource$inputStream$1
            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = this.onWarmupCompleted;
                if (realBufferedSource.onWarmupCompleted) {
                    throw new IOException("closed");
                }
                if (realBufferedSource.IAuthTabCallback.ICustomTabsCallbackDefault() == 0) {
                    RealBufferedSource realBufferedSource2 = this.onWarmupCompleted;
                    if (realBufferedSource2.onNavigationEvent.read(realBufferedSource2.IAuthTabCallback, 8192L) == -1) {
                        return -1;
                    }
                }
                return this.onWarmupCompleted.IAuthTabCallback.ICustomTabsCallback() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                Intrinsics.checkNotNullParameter(bArr, "");
                if (this.onWarmupCompleted.onWarmupCompleted) {
                    throw new IOException("closed");
                }
                TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i, i2);
                if (this.onWarmupCompleted.IAuthTabCallback.ICustomTabsCallbackDefault() == 0) {
                    RealBufferedSource realBufferedSource = this.onWarmupCompleted;
                    if (realBufferedSource.onNavigationEvent.read(realBufferedSource.IAuthTabCallback, 8192L) == -1) {
                        return -1;
                    }
                }
                return this.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = this.onWarmupCompleted;
                if (realBufferedSource.onWarmupCompleted) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.IAuthTabCallback.ICustomTabsCallbackDefault(), 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.onWarmupCompleted.close();
            }

            public String toString() {
                return this.onWarmupCompleted + ".inputStream()";
            }

            @Override // java.io.InputStream
            public long transferTo(OutputStream outputStream) throws IOException {
                Intrinsics.checkNotNullParameter(outputStream, "");
                if (this.onWarmupCompleted.onWarmupCompleted) {
                    throw new IOException("closed");
                }
                long jICustomTabsCallbackDefault = 0;
                while (true) {
                    if (this.onWarmupCompleted.IAuthTabCallback.ICustomTabsCallbackDefault() == 0) {
                        RealBufferedSource realBufferedSource = this.onWarmupCompleted;
                        if (realBufferedSource.onNavigationEvent.read(realBufferedSource.IAuthTabCallback, 8192L) == -1) {
                            return jICustomTabsCallbackDefault;
                        }
                    }
                    jICustomTabsCallbackDefault += this.onWarmupCompleted.IAuthTabCallback.ICustomTabsCallbackDefault();
                    TTBaseActivity.onNavigationEvent(this.onWarmupCompleted.IAuthTabCallback, outputStream, 0L, 2, null);
                }
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.onWarmupCompleted;
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        if (this.IAuthTabCallback.ICustomTabsCallbackDefault() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                return -1L;
            }
        }
        return this.IAuthTabCallback.read(tTBaseActivity, Math.min(j, this.IAuthTabCallback.ICustomTabsCallbackDefault()));
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean IAuthTabCallback_Parcel() {
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        return this.IAuthTabCallback.IAuthTabCallback_Parcel() && this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1;
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallbackStub(long j) throws EOFException {
        if (!asBinder(j)) {
            throw new EOFException();
        }
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean asBinder(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        while (this.IAuthTabCallback.ICustomTabsCallbackDefault() < j) {
            if (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // o.TTAppOpenAdTransActivity
    public byte ICustomTabsCallback() throws EOFException {
        IAuthTabCallbackStub(1L);
        return this.IAuthTabCallback.ICustomTabsCallback();
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseLandingPageActivity writeTypedObject() throws IOException {
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent);
        return this.IAuthTabCallback.writeTypedObject();
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseLandingPageActivity onNavigationEvent(long j) throws EOFException {
        IAuthTabCallbackStub(j);
        return this.IAuthTabCallback.onNavigationEvent(j);
    }

    @Override // o.TTAppOpenAdTransActivity
    public int IAuthTabCallback(@NotNull TTFullScreenVideoActivity1 tTFullScreenVideoActivity1) throws EOFException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity1, "");
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        do {
            int iOnWarmupCompleted = TTHistoryActivity711.onWarmupCompleted(this.IAuthTabCallback, tTFullScreenVideoActivity1, true);
            if (iOnWarmupCompleted != -2) {
                if (iOnWarmupCompleted == -1) {
                    return -1;
                }
                this.IAuthTabCallback.IAuthTabCallbackDefault(tTFullScreenVideoActivity1.IAuthTabCallback()[iOnWarmupCompleted].access100());
                return iOnWarmupCompleted;
            }
        } while (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) != -1);
        return -1;
    }

    @Override // o.TTAppOpenAdTransActivity
    public byte[] extraCallback() throws IOException {
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent);
        return this.IAuthTabCallback.extraCallback();
    }

    @Override // o.TTAppOpenAdTransActivity
    public void onExtraCallbackWithResult(@NotNull byte[] bArr) throws EOFException {
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            IAuthTabCallbackStub(bArr.length);
            this.IAuthTabCallback.onExtraCallbackWithResult(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.IAuthTabCallback.ICustomTabsCallbackDefault() > 0) {
                TTBaseActivity tTBaseActivity = this.IAuthTabCallback;
                int iOnNavigationEvent = tTBaseActivity.onNavigationEvent(bArr, i, (int) tTBaseActivity.ICustomTabsCallbackDefault());
                if (iOnNavigationEvent == -1) {
                    throw new AssertionError();
                }
                i += iOnNavigationEvent;
            }
            throw e;
        }
    }

    public int onExtraCallback(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i, j);
        if (this.IAuthTabCallback.ICustomTabsCallbackDefault() == 0) {
            if (i2 == 0) {
                return 0;
            }
            if (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                return -1;
            }
        }
        return this.IAuthTabCallback.onNavigationEvent(bArr, i, (int) Math.min(j, this.IAuthTabCallback.ICustomTabsCallbackDefault()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.IAuthTabCallback.ICustomTabsCallbackDefault() == 0 && this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
            return -1;
        }
        return this.IAuthTabCallback.read(byteBuffer);
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallback(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        try {
            IAuthTabCallbackStub(j);
            this.IAuthTabCallback.IAuthTabCallback(tTBaseActivity, j);
        } catch (EOFException e) {
            tTBaseActivity.onExtraCallbackWithResult(this.IAuthTabCallback);
            throw e;
        }
    }

    @Override // o.TTAppOpenAdTransActivity
    public long IAuthTabCallback(@NotNull TTHistoryActivity41 tTHistoryActivity41) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        long j = 0;
        while (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) != -1) {
            long jOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
            if (jOnExtraCallbackWithResult > 0) {
                j += jOnExtraCallbackWithResult;
                tTHistoryActivity41.write(this.IAuthTabCallback, jOnExtraCallbackWithResult);
            }
        }
        if (this.IAuthTabCallback.ICustomTabsCallbackDefault() <= 0) {
            return j;
        }
        long jICustomTabsCallbackDefault = j + this.IAuthTabCallback.ICustomTabsCallbackDefault();
        TTBaseActivity tTBaseActivity = this.IAuthTabCallback;
        tTHistoryActivity41.write(tTBaseActivity, tTBaseActivity.ICustomTabsCallbackDefault());
        return jICustomTabsCallbackDefault;
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onRelationshipValidationResult() throws IOException {
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent);
        return this.IAuthTabCallback.onRelationshipValidationResult();
    }

    @Override // o.TTAppOpenAdTransActivity
    public String IAuthTabCallback(long j) throws EOFException {
        IAuthTabCallbackStub(j);
        return this.IAuthTabCallback.IAuthTabCallback(j);
    }

    @Override // o.TTAppOpenAdTransActivity
    public String IAuthTabCallback(@NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "");
        this.IAuthTabCallback.onExtraCallbackWithResult(this.onNavigationEvent);
        return this.IAuthTabCallback.IAuthTabCallback(charset);
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onExtraCallback(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jOnNavigationEvent = onNavigationEvent((byte) 10, 0L, j2);
        if (jOnNavigationEvent != -1) {
            return TTHistoryActivity711.onNavigationEvent(this.IAuthTabCallback, jOnNavigationEvent);
        }
        if (j2 < LongCompanionObject.MAX_VALUE && asBinder(j2) && this.IAuthTabCallback.onExtraCallbackWithResult(j2 - 1) == 13 && asBinder(1 + j2) && this.IAuthTabCallback.onExtraCallbackWithResult(j2) == 10) {
            return TTHistoryActivity711.onNavigationEvent(this.IAuthTabCallback, j2);
        }
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        TTBaseActivity tTBaseActivity2 = this.IAuthTabCallback;
        tTBaseActivity2.IAuthTabCallback(tTBaseActivity, 0L, Math.min(32L, tTBaseActivity2.ICustomTabsCallbackDefault()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.IAuthTabCallback.ICustomTabsCallbackDefault(), j) + " content=" + tTBaseActivity.writeTypedObject().asInterface() + (char) 8230);
    }

    @Override // o.TTAppOpenAdTransActivity
    public int ICustomTabsCallbackStub() throws EOFException {
        IAuthTabCallbackStub(1L);
        byte bOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(0L);
        if ((bOnExtraCallbackWithResult & 224) == 192) {
            IAuthTabCallbackStub(2L);
        } else if ((bOnExtraCallbackWithResult & 240) == 224) {
            IAuthTabCallbackStub(3L);
        } else if ((bOnExtraCallbackWithResult & 248) == 240) {
            IAuthTabCallbackStub(4L);
        }
        return this.IAuthTabCallback.ICustomTabsCallbackStub();
    }

    @Override // o.TTAppOpenAdTransActivity
    public short onActivityResized() throws EOFException {
        IAuthTabCallbackStub(2L);
        return this.IAuthTabCallback.onActivityResized();
    }

    @Override // o.TTAppOpenAdTransActivity
    public short ICustomTabsCallbackStubProxy() throws EOFException {
        IAuthTabCallbackStub(2L);
        return this.IAuthTabCallback.ICustomTabsCallbackStubProxy();
    }

    @Override // o.TTAppOpenAdTransActivity
    public int onPostMessage() throws EOFException {
        IAuthTabCallbackStub(4L);
        return this.IAuthTabCallback.onPostMessage();
    }

    @Override // o.TTAppOpenAdTransActivity
    public int onActivityLayout() throws EOFException {
        IAuthTabCallbackStub(4L);
        return this.IAuthTabCallback.onActivityLayout();
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onMessageChannelReady() throws EOFException {
        IAuthTabCallbackStub(8L);
        return this.IAuthTabCallback.onMessageChannelReady();
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onMinimized() throws EOFException {
        IAuthTabCallbackStub(8L);
        return this.IAuthTabCallback.onMinimized();
    }

    @Override // o.TTAppOpenAdTransActivity
    public long readTypedObject() throws EOFException {
        byte bOnExtraCallbackWithResult;
        IAuthTabCallbackStub(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!asBinder(j2)) {
                break;
            }
            bOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(j);
            if ((bOnExtraCallbackWithResult < 48 || bOnExtraCallbackWithResult > 57) && !(j == 0 && bOnExtraCallbackWithResult == 45)) {
                break;
            }
            j = j2;
        }
        if (j == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bOnExtraCallbackWithResult, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.IAuthTabCallback.readTypedObject();
    }

    @Override // o.TTAppOpenAdTransActivity
    public long extraCallbackWithResult() throws EOFException {
        byte bOnExtraCallbackWithResult;
        IAuthTabCallbackStub(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!asBinder(i2)) {
                break;
            }
            bOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(i);
            if ((bOnExtraCallbackWithResult < 48 || bOnExtraCallbackWithResult > 57) && ((bOnExtraCallbackWithResult < 97 || bOnExtraCallbackWithResult > 102) && (bOnExtraCallbackWithResult < 65 || bOnExtraCallbackWithResult > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bOnExtraCallbackWithResult, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.IAuthTabCallback.extraCallbackWithResult();
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallbackDefault(long j) throws EOFException {
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.IAuthTabCallback.ICustomTabsCallbackDefault() == 0 && this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.IAuthTabCallback.ICustomTabsCallbackDefault());
            this.IAuthTabCallback.IAuthTabCallbackDefault(jMin);
            j -= jMin;
        }
    }

    public long onNavigationEvent(byte b, long j, long j2) {
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long jOnExtraCallback = this.IAuthTabCallback.onExtraCallback(b, j, j2);
            if (jOnExtraCallback != -1) {
                return jOnExtraCallback;
            }
            long jICustomTabsCallbackDefault = this.IAuthTabCallback.ICustomTabsCallbackDefault();
            if (jICustomTabsCallbackDefault >= j2 || this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                break;
            }
            j = Math.max(j, jICustomTabsCallbackDefault);
        }
        return -1L;
    }

    public long onWarmupCompleted(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(tTBaseLandingPageActivity, j);
            if (jOnExtraCallbackWithResult != -1) {
                return jOnExtraCallbackWithResult;
            }
            long jICustomTabsCallbackDefault = this.IAuthTabCallback.ICustomTabsCallbackDefault();
            if (this.onNavigationEvent.read(this.IAuthTabCallback, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, jICustomTabsCallbackDefault);
        }
    }

    public boolean onExtraCallbackWithResult(long j, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i, int i2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (this.onWarmupCompleted) {
            throw new IllegalStateException("closed");
        }
        return i2 >= 0 && j >= 0 && i >= 0 && i + i2 <= tTBaseLandingPageActivity.access100() && (i2 == 0 || TTHistoryLandingPageActivity111.onExtraCallback(this, tTBaseLandingPageActivity, i, i2, j, j + 1) != -1);
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTAppOpenAdTransActivity getInterfaceDescriptor() {
        return TTCeilingLandingPageActivity5.onExtraCallback(new TTHistoryActivity3(this));
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() throws IOException {
        if (this.onWarmupCompleted) {
            return;
        }
        this.onWarmupCompleted = true;
        this.onNavigationEvent.close();
        this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onNavigationEvent.timeout();
    }

    public String toString() {
        return "buffer(" + this.onNavigationEvent + ')';
    }
}
