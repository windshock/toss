package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Charsets;
import okhttp3.internal.url._UrlKt;
import okio.Timeout;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTBaseActivity implements TTAppOpenAdTransActivity, TTAppOpenAdActivity9, Cloneable, ByteChannel {
    public TTHistoryActivity2 head;
    private long size;

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseActivity IAuthTabCallback() {
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity asInterface() {
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity asBinder() {
        return this;
    }

    @Override // o.TTAppOpenAdTransActivity, o.TTAppOpenAdActivity9
    public TTBaseActivity access100() {
        return this;
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() {
    }

    @Override // o.TTAppOpenAdActivity9, o.TTHistoryActivity41, java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long ICustomTabsCallbackDefault() {
        return this.size;
    }

    public final void asInterface(long j) {
        this.size = j;
    }

    public static final class onWarmupCompleted extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        onWarmupCompleted() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            TTBaseActivity.this.onExtraCallbackWithResult(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            TTBaseActivity.this.onExtraCallback(bArr, i, i2);
        }

        public String toString() {
            return TTBaseActivity.this + ".outputStream()";
        }
    }

    @Override // o.TTAppOpenAdActivity9
    public OutputStream access000() {
        return new onWarmupCompleted();
    }

    public static /* synthetic */ onNavigationEvent onWarmupCompleted(TTBaseActivity tTBaseActivity, onNavigationEvent onnavigationevent, int i, Object obj) {
        if ((i & 1) != 0) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            onnavigationevent = (onNavigationEvent) TTAppOpenAdActivity6.onNavigationEvent(iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult(), new Object[0], 1075536718, -1075536718, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
        }
        return tTBaseActivity.onExtraCallback(onnavigationevent);
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean IAuthTabCallback_Parcel() {
        return this.size == 0;
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallbackStub(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean asBinder(long j) {
        return this.size >= j;
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTAppOpenAdTransActivity getInterfaceDescriptor() {
        return TTCeilingLandingPageActivity5.onExtraCallback(new TTHistoryActivity3(this));
    }

    public static final class onExtraCallback extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        onExtraCallback() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (TTBaseActivity.this.ICustomTabsCallbackDefault() > 0) {
                return TTBaseActivity.this.ICustomTabsCallback() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return TTBaseActivity.this.onNavigationEvent(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(TTBaseActivity.this.ICustomTabsCallbackDefault(), 2147483647L);
        }

        public String toString() {
            return TTBaseActivity.this + ".inputStream()";
        }
    }

    @Override // o.TTAppOpenAdTransActivity
    public InputStream IAuthTabCallbackStubProxy() {
        return new onExtraCallback();
    }

    public static /* synthetic */ TTBaseActivity onNavigationEvent(TTBaseActivity tTBaseActivity, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = tTBaseActivity.size;
        }
        return tTBaseActivity.onWarmupCompleted(outputStream, j);
    }

    public final TTBaseActivity onWarmupCompleted(@NotNull OutputStream outputStream, long j) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "");
        TTAppOpenAdActivity6.onExtraCallbackWithResult(this.size, 0L, j);
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        while (j > 0) {
            Intrinsics.checkNotNull(tTHistoryActivity2);
            int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
            outputStream.write(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
            int i = tTHistoryActivity2.pos + iMin;
            tTHistoryActivity2.pos = i;
            long j2 = iMin;
            this.size -= j2;
            j -= j2;
            if (i == tTHistoryActivity2.limit) {
                TTHistoryActivity2 tTHistoryActivity2OnExtraCallback = tTHistoryActivity2.onExtraCallback();
                this.head = tTHistoryActivity2OnExtraCallback;
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
                tTHistoryActivity2 = tTHistoryActivity2OnExtraCallback;
            }
        }
        return this;
    }

    @Override // o.TTAppOpenAdTransActivity
    public short ICustomTabsCallbackStubProxy() throws EOFException {
        return TTAppOpenAdActivity6.onExtraCallbackWithResult(onActivityResized());
    }

    @Override // o.TTAppOpenAdTransActivity
    public int onActivityLayout() throws EOFException {
        return TTAppOpenAdActivity6.onExtraCallbackWithResult(onPostMessage());
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onMinimized() throws EOFException {
        return TTAppOpenAdActivity6.IAuthTabCallback(onMessageChannelReady());
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onRelationshipValidationResult() {
        return onExtraCallback(this.size, Charsets.UTF_8);
    }

    @Override // o.TTAppOpenAdTransActivity
    public String IAuthTabCallback(long j) throws EOFException {
        return onExtraCallback(j, Charsets.UTF_8);
    }

    @Override // o.TTAppOpenAdTransActivity
    public String IAuthTabCallback(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "");
        return onExtraCallback(this.size, charset);
    }

    public String onExtraCallback(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.size < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.pos;
        if (i + j > tTHistoryActivity2.limit) {
            return new String(onWarmupCompleted(j), charset);
        }
        int i2 = (int) j;
        String str = new String(tTHistoryActivity2.data, i, i2, charset);
        int i3 = tTHistoryActivity2.pos + i2;
        tTHistoryActivity2.pos = i3;
        this.size -= j;
        if (i3 == tTHistoryActivity2.limit) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
        }
        return str;
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onUnminimized() throws EOFException {
        return onExtraCallback(LongCompanionObject.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), tTHistoryActivity2.limit - tTHistoryActivity2.pos);
        byteBuffer.put(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
        int i = tTHistoryActivity2.pos + iMin;
        tTHistoryActivity2.pos = i;
        this.size -= iMin;
        if (i == tTHistoryActivity2.limit) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
        }
        return iMin;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onNavigationEvent(str, 0, str.length());
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallbackWithResult(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return onWarmupCompleted(str, 0, str.length(), charset);
    }

    public TTBaseActivity onWarmupCompleted(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return onNavigationEvent(str, i, i2);
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return onExtraCallback(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(1);
            int iMin = Math.min(i, 8192 - tTHistoryActivity2OnNavigationEvent.limit);
            byteBuffer.get(tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, iMin);
            i -= iMin;
            tTHistoryActivity2OnNavigationEvent.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity IAuthTabCallbackStub(int i) {
        return asBinder(TTAppOpenAdActivity6.onExtraCallbackWithResult(i));
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity writeTypedObject(long j) {
        return access100(TTAppOpenAdActivity6.IAuthTabCallback(j));
    }

    public long IAuthTabCallback(byte b, long j) {
        return onExtraCallback(b, j, LongCompanionObject.MAX_VALUE);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onExtraCallback(tTBaseLandingPageActivity, 0L);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onNavigationEvent(tTBaseLandingPageActivity, j, LongCompanionObject.MAX_VALUE);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return TTHistoryActivity711.onExtraCallback(this, tTBaseLandingPageActivity, j, (24 & 4) != 0 ? Long.MAX_VALUE : j2, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? tTBaseLandingPageActivity.access100() : 0);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onExtraCallbackWithResult(tTBaseLandingPageActivity, 0L);
    }

    @Override // o.TTAppOpenAdTransActivity
    public boolean onNavigationEvent(long j, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return onWarmupCompleted(j, tTBaseLandingPageActivity, 0, tTBaseLandingPageActivity.access100());
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return Timeout.onNavigationEvent;
    }

    public String toString() {
        return mayLaunchUrl().toString();
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity clone() {
        return onTransact();
    }

    public final onNavigationEvent onExtraCallback(@NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        return TTHistoryActivity711.IAuthTabCallback(this, onnavigationevent);
    }

    @Deprecated
    public final long onNavigationEvent() {
        return this.size;
    }

    public static final class onNavigationEvent implements Closeable {
        public byte[] IAuthTabCallback;
        private TTHistoryActivity2 IAuthTabCallbackDefault;
        public TTBaseActivity onExtraCallback;
        public boolean onWarmupCompleted;
        public long onExtraCallbackWithResult = -1;
        public int IAuthTabCallbackStub = -1;
        public int onNavigationEvent = -1;

        public final void IAuthTabCallback(@Nullable TTHistoryActivity2 tTHistoryActivity2) {
            this.IAuthTabCallbackDefault = tTHistoryActivity2;
        }

        public final TTHistoryActivity2 onExtraCallback() {
            return this.IAuthTabCallbackDefault;
        }

        public final int IAuthTabCallback() {
            long j = this.onExtraCallbackWithResult;
            TTBaseActivity tTBaseActivity = this.onExtraCallback;
            Intrinsics.checkNotNull(tTBaseActivity);
            if (j == tTBaseActivity.ICustomTabsCallbackDefault()) {
                throw new IllegalStateException("no more bytes");
            }
            long j2 = this.onExtraCallbackWithResult;
            return onNavigationEvent(j2 == -1 ? 0L : j2 + (this.onNavigationEvent - this.IAuthTabCallbackStub));
        }

        public final int onNavigationEvent(long j) {
            TTHistoryActivity2 tTHistoryActivity2OnExtraCallback;
            TTBaseActivity tTBaseActivity = this.onExtraCallback;
            if (tTBaseActivity == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > tTBaseActivity.ICustomTabsCallbackDefault()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + tTBaseActivity.ICustomTabsCallbackDefault());
            }
            if (j == -1 || j == tTBaseActivity.ICustomTabsCallbackDefault()) {
                IAuthTabCallback(null);
                this.onExtraCallbackWithResult = j;
                this.IAuthTabCallback = null;
                this.IAuthTabCallbackStub = -1;
                this.onNavigationEvent = -1;
                return -1;
            }
            long jICustomTabsCallbackDefault = tTBaseActivity.ICustomTabsCallbackDefault();
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.head;
            long j2 = 0;
            if (onExtraCallback() != null) {
                long j3 = this.onExtraCallbackWithResult;
                int i = this.IAuthTabCallbackStub;
                Intrinsics.checkNotNull(onExtraCallback());
                long j4 = j3 - (i - r9.pos);
                if (j4 > j) {
                    tTHistoryActivity2OnExtraCallback = onExtraCallback();
                    jICustomTabsCallbackDefault = j4;
                } else {
                    j2 = j4;
                    tTHistoryActivity2OnExtraCallback = tTHistoryActivity2OnNavigationEvent;
                    tTHistoryActivity2OnNavigationEvent = onExtraCallback();
                }
            } else {
                tTHistoryActivity2OnExtraCallback = tTHistoryActivity2OnNavigationEvent;
            }
            if (jICustomTabsCallbackDefault - j > j - j2) {
                while (true) {
                    Intrinsics.checkNotNull(tTHistoryActivity2OnNavigationEvent);
                    long j5 = (tTHistoryActivity2OnNavigationEvent.limit - tTHistoryActivity2OnNavigationEvent.pos) + j2;
                    if (j < j5) {
                        break;
                    }
                    tTHistoryActivity2OnNavigationEvent = tTHistoryActivity2OnNavigationEvent.next;
                    j2 = j5;
                }
            } else {
                while (jICustomTabsCallbackDefault > j) {
                    Intrinsics.checkNotNull(tTHistoryActivity2OnExtraCallback);
                    tTHistoryActivity2OnExtraCallback = tTHistoryActivity2OnExtraCallback.prev;
                    Intrinsics.checkNotNull(tTHistoryActivity2OnExtraCallback);
                    jICustomTabsCallbackDefault -= tTHistoryActivity2OnExtraCallback.limit - tTHistoryActivity2OnExtraCallback.pos;
                }
                j2 = jICustomTabsCallbackDefault;
                tTHistoryActivity2OnNavigationEvent = tTHistoryActivity2OnExtraCallback;
            }
            if (this.onWarmupCompleted) {
                Intrinsics.checkNotNull(tTHistoryActivity2OnNavigationEvent);
                if (tTHistoryActivity2OnNavigationEvent.shared) {
                    TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent2 = tTHistoryActivity2OnNavigationEvent.onNavigationEvent();
                    if (tTBaseActivity.head == tTHistoryActivity2OnNavigationEvent) {
                        tTBaseActivity.head = tTHistoryActivity2OnNavigationEvent2;
                    }
                    tTHistoryActivity2OnNavigationEvent = tTHistoryActivity2OnNavigationEvent.onNavigationEvent(tTHistoryActivity2OnNavigationEvent2);
                    TTHistoryActivity2 tTHistoryActivity2 = tTHistoryActivity2OnNavigationEvent.prev;
                    Intrinsics.checkNotNull(tTHistoryActivity2);
                    tTHistoryActivity2.onExtraCallback();
                }
            }
            IAuthTabCallback(tTHistoryActivity2OnNavigationEvent);
            this.onExtraCallbackWithResult = j;
            Intrinsics.checkNotNull(tTHistoryActivity2OnNavigationEvent);
            this.IAuthTabCallback = tTHistoryActivity2OnNavigationEvent.data;
            int i2 = tTHistoryActivity2OnNavigationEvent.pos + ((int) (j - j2));
            this.IAuthTabCallbackStub = i2;
            int i3 = tTHistoryActivity2OnNavigationEvent.limit;
            this.onNavigationEvent = i3;
            return i3 - i2;
        }

        public final long onExtraCallback(long j) {
            TTBaseActivity tTBaseActivity = this.onExtraCallback;
            if (tTBaseActivity == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.onWarmupCompleted) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long jICustomTabsCallbackDefault = tTBaseActivity.ICustomTabsCallbackDefault();
            if (j <= jICustomTabsCallbackDefault) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = jICustomTabsCallbackDefault - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
                    Intrinsics.checkNotNull(tTHistoryActivity2);
                    TTHistoryActivity2 tTHistoryActivity22 = tTHistoryActivity2.prev;
                    Intrinsics.checkNotNull(tTHistoryActivity22);
                    int i = tTHistoryActivity22.limit;
                    long j3 = i - tTHistoryActivity22.pos;
                    if (j3 <= j2) {
                        tTBaseActivity.head = tTHistoryActivity22.onExtraCallback();
                        TTHistoryActivity.onExtraCallback(tTHistoryActivity22);
                        j2 -= j3;
                    } else {
                        tTHistoryActivity22.limit = i - ((int) j2);
                        break;
                    }
                }
                IAuthTabCallback(null);
                this.onExtraCallbackWithResult = j;
                this.IAuthTabCallback = null;
                this.IAuthTabCallbackStub = -1;
                this.onNavigationEvent = -1;
            } else if (j > jICustomTabsCallbackDefault) {
                long j4 = j - jICustomTabsCallbackDefault;
                boolean z = true;
                while (j4 > 0) {
                    TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(1);
                    int iMin = (int) Math.min(j4, 8192 - tTHistoryActivity2OnNavigationEvent.limit);
                    tTHistoryActivity2OnNavigationEvent.limit += iMin;
                    j4 -= iMin;
                    if (z) {
                        IAuthTabCallback(tTHistoryActivity2OnNavigationEvent);
                        this.onExtraCallbackWithResult = jICustomTabsCallbackDefault;
                        this.IAuthTabCallback = tTHistoryActivity2OnNavigationEvent.data;
                        int i2 = tTHistoryActivity2OnNavigationEvent.limit;
                        this.IAuthTabCallbackStub = i2 - iMin;
                        this.onNavigationEvent = i2;
                        z = false;
                    }
                }
            }
            tTBaseActivity.asInterface(j);
            return jICustomTabsCallbackDefault;
        }

        public final long onExtraCallbackWithResult(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
            }
            if (i > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
            }
            TTBaseActivity tTBaseActivity = this.onExtraCallback;
            if (tTBaseActivity == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.onWarmupCompleted) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long jICustomTabsCallbackDefault = tTBaseActivity.ICustomTabsCallbackDefault();
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(i);
            int i2 = 8192 - tTHistoryActivity2OnNavigationEvent.limit;
            tTHistoryActivity2OnNavigationEvent.limit = TTHistoryActivity2.SIZE;
            long j = i2;
            tTBaseActivity.asInterface(jICustomTabsCallbackDefault + j);
            IAuthTabCallback(tTHistoryActivity2OnNavigationEvent);
            this.onExtraCallbackWithResult = jICustomTabsCallbackDefault;
            this.IAuthTabCallback = tTHistoryActivity2OnNavigationEvent.data;
            this.IAuthTabCallbackStub = 8192 - i2;
            this.onNavigationEvent = TTHistoryActivity2.SIZE;
            return j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.onExtraCallback == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.onExtraCallback = null;
            IAuthTabCallback(null);
            this.onExtraCallbackWithResult = -1L;
            this.IAuthTabCallback = null;
            this.IAuthTabCallbackStub = -1;
            this.onNavigationEvent = -1;
        }
    }

    public final TTBaseActivity IAuthTabCallback(@NotNull TTBaseActivity tTBaseActivity, long j, long j2) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        TTAppOpenAdActivity6.onExtraCallbackWithResult(ICustomTabsCallbackDefault(), j, j2);
        if (j2 != 0) {
            tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + j2);
            TTHistoryActivity2 tTHistoryActivity2 = this.head;
            while (true) {
                Intrinsics.checkNotNull(tTHistoryActivity2);
                long j3 = tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                if (j < j3) {
                    break;
                }
                j -= j3;
                tTHistoryActivity2 = tTHistoryActivity2.next;
            }
            while (j2 > 0) {
                Intrinsics.checkNotNull(tTHistoryActivity2);
                TTHistoryActivity2 tTHistoryActivity2IAuthTabCallback = tTHistoryActivity2.IAuthTabCallback();
                int i = tTHistoryActivity2IAuthTabCallback.pos + ((int) j);
                tTHistoryActivity2IAuthTabCallback.pos = i;
                tTHistoryActivity2IAuthTabCallback.limit = Math.min(i + ((int) j2), tTHistoryActivity2IAuthTabCallback.limit);
                TTHistoryActivity2 tTHistoryActivity22 = tTBaseActivity.head;
                if (tTHistoryActivity22 == null) {
                    tTHistoryActivity2IAuthTabCallback.prev = tTHistoryActivity2IAuthTabCallback;
                    tTHistoryActivity2IAuthTabCallback.next = tTHistoryActivity2IAuthTabCallback;
                    tTBaseActivity.head = tTHistoryActivity2IAuthTabCallback;
                } else {
                    Intrinsics.checkNotNull(tTHistoryActivity22);
                    TTHistoryActivity2 tTHistoryActivity23 = tTHistoryActivity22.prev;
                    Intrinsics.checkNotNull(tTHistoryActivity23);
                    tTHistoryActivity23.onNavigationEvent(tTHistoryActivity2IAuthTabCallback);
                }
                j2 -= tTHistoryActivity2IAuthTabCallback.limit - tTHistoryActivity2IAuthTabCallback.pos;
                tTHistoryActivity2 = tTHistoryActivity2.next;
                j = 0;
            }
        }
        return this;
    }

    public final long onExtraCallbackWithResult() {
        long jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        if (jICustomTabsCallbackDefault == 0) {
            return 0L;
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        TTHistoryActivity2 tTHistoryActivity22 = tTHistoryActivity2.prev;
        Intrinsics.checkNotNull(tTHistoryActivity22);
        return (tTHistoryActivity22.limit >= 8192 || !tTHistoryActivity22.owner) ? jICustomTabsCallbackDefault : jICustomTabsCallbackDefault - (r3 - tTHistoryActivity22.pos);
    }

    @Override // o.TTAppOpenAdTransActivity
    public byte ICustomTabsCallback() throws EOFException {
        if (ICustomTabsCallbackDefault() == 0) {
            throw new EOFException();
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.pos;
        int i2 = tTHistoryActivity2.limit;
        int i3 = i + 1;
        byte b = tTHistoryActivity2.data[i];
        asInterface(ICustomTabsCallbackDefault() - 1);
        if (i3 == i2) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            return b;
        }
        tTHistoryActivity2.pos = i3;
        return b;
    }

    public final byte onExtraCallbackWithResult(long j) {
        TTAppOpenAdActivity6.onExtraCallbackWithResult(ICustomTabsCallbackDefault(), j, 1L);
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (ICustomTabsCallbackDefault() - j < j) {
            long jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
            while (jICustomTabsCallbackDefault > j) {
                tTHistoryActivity2 = tTHistoryActivity2.prev;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                jICustomTabsCallbackDefault -= tTHistoryActivity2.limit - tTHistoryActivity2.pos;
            }
            Intrinsics.checkNotNull(tTHistoryActivity2);
            return tTHistoryActivity2.data[(int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (tTHistoryActivity2.limit - tTHistoryActivity2.pos) + j2;
            if (j3 > j) {
                Intrinsics.checkNotNull(tTHistoryActivity2);
                return tTHistoryActivity2.data[(int) ((tTHistoryActivity2.pos + j) - j2)];
            }
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            j2 = j3;
        }
    }

    @Override // o.TTAppOpenAdTransActivity
    public short onActivityResized() throws EOFException {
        int iICustomTabsCallback;
        int iICustomTabsCallback2;
        if (ICustomTabsCallbackDefault() < 2) {
            throw new EOFException();
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.pos;
        int i2 = tTHistoryActivity2.limit;
        if (i2 - i < 2) {
            iICustomTabsCallback = (ICustomTabsCallback() & 255) << 8;
            iICustomTabsCallback2 = ICustomTabsCallback() & 255;
        } else {
            byte[] bArr = tTHistoryActivity2.data;
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            asInterface(ICustomTabsCallbackDefault() - 2);
            if (i3 == i2) {
                this.head = tTHistoryActivity2.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            } else {
                tTHistoryActivity2.pos = i3;
            }
            iICustomTabsCallback = b2 & 255;
            iICustomTabsCallback2 = (b & 255) << 8;
        }
        return (short) (iICustomTabsCallback | iICustomTabsCallback2);
    }

    @Override // o.TTAppOpenAdTransActivity
    public int onPostMessage() throws EOFException {
        if (ICustomTabsCallbackDefault() < 4) {
            throw new EOFException();
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.pos;
        int i2 = tTHistoryActivity2.limit;
        if (i2 - i < 4) {
            return ((ICustomTabsCallback() & 255) << 24) | ((ICustomTabsCallback() & 255) << 16) | ((ICustomTabsCallback() & 255) << 8) | (ICustomTabsCallback() & 255);
        }
        byte[] bArr = tTHistoryActivity2.data;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        asInterface(ICustomTabsCallbackDefault() - 4);
        if (i3 == i2) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            return i4;
        }
        tTHistoryActivity2.pos = i3;
        return i4;
    }

    @Override // o.TTAppOpenAdTransActivity
    public long onMessageChannelReady() throws EOFException {
        if (ICustomTabsCallbackDefault() < 8) {
            throw new EOFException();
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.pos;
        int i2 = tTHistoryActivity2.limit;
        if (i2 - i < 8) {
            return ((onPostMessage() & 4294967295L) << 32) | (4294967295L & onPostMessage());
        }
        byte[] bArr = tTHistoryActivity2.data;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        int i3 = i + 8;
        long j6 = (bArr[i + 5] & 255) << 16;
        long j7 = j6 | ((j5 & 255) << 24) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255);
        asInterface(ICustomTabsCallbackDefault() - 8);
        if (i3 == i2) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            return j7;
        }
        tTHistoryActivity2.pos = i3;
        return j7;
    }

    @Override // o.TTAppOpenAdTransActivity
    public long readTypedObject() throws EOFException {
        if (ICustomTabsCallbackDefault() == 0) {
            throw new EOFException();
        }
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            TTHistoryActivity2 tTHistoryActivity2 = this.head;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            byte[] bArr = tTHistoryActivity2.data;
            int i2 = tTHistoryActivity2.pos;
            int i3 = tTHistoryActivity2.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        TTBaseActivity tTBaseActivityOnExtraCallbackWithResult = new TTBaseActivity().IAuthTabCallbackStubProxy(j).onExtraCallbackWithResult((int) b);
                        if (!z2) {
                            tTBaseActivityOnExtraCallbackWithResult.ICustomTabsCallback();
                        }
                        throw new NumberFormatException("Number too large: " + tTBaseActivityOnExtraCallbackWithResult.onRelationshipValidationResult());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b != 45 || i != 0) {
                        z = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = tTHistoryActivity2.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            } else {
                tTHistoryActivity2.pos = i2;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        asInterface(ICustomTabsCallbackDefault() - i);
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j : -j;
        }
        if (ICustomTabsCallbackDefault() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z2 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + TTAppOpenAdActivity6.onExtraCallback(onExtraCallbackWithResult(0L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // o.TTAppOpenAdTransActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long extraCallbackWithResult() throws EOFException {
        int i;
        if (ICustomTabsCallbackDefault() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            TTHistoryActivity2 tTHistoryActivity2 = this.head;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            byte[] bArr = tTHistoryActivity2.data;
            int i3 = tTHistoryActivity2.pos;
            int i4 = tTHistoryActivity2.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + TTAppOpenAdActivity6.onExtraCallback(b));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.head = tTHistoryActivity2.onExtraCallback();
                        TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
                    } else {
                        tTHistoryActivity2.pos = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new TTBaseActivity().access000(j).onExtraCallbackWithResult((int) b).onRelationshipValidationResult());
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.head != null);
        asInterface(ICustomTabsCallbackDefault() - i2);
        return j;
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseLandingPageActivity writeTypedObject() {
        return onNavigationEvent(ICustomTabsCallbackDefault());
    }

    @Override // o.TTAppOpenAdTransActivity
    public TTBaseLandingPageActivity onNavigationEvent(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (ICustomTabsCallbackDefault() < j) {
            throw new EOFException();
        }
        if (j >= 4096) {
            TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallback = IAuthTabCallback((int) j);
            IAuthTabCallbackDefault(j);
            return tTBaseLandingPageActivityIAuthTabCallback;
        }
        return new TTBaseLandingPageActivity(onWarmupCompleted(j));
    }

    @Override // o.TTAppOpenAdTransActivity
    public int IAuthTabCallback(@NotNull TTFullScreenVideoActivity1 tTFullScreenVideoActivity1) throws EOFException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity1, "");
        int iOnNavigationEvent = TTHistoryActivity711.onNavigationEvent(this, tTFullScreenVideoActivity1, false, 2, (Object) null);
        if (iOnNavigationEvent == -1) {
            return -1;
        }
        IAuthTabCallbackDefault(tTFullScreenVideoActivity1.IAuthTabCallback()[iOnNavigationEvent].access100());
        return iOnNavigationEvent;
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallback(@NotNull TTBaseActivity tTBaseActivity, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (ICustomTabsCallbackDefault() < j) {
            tTBaseActivity.write(this, ICustomTabsCallbackDefault());
            throw new EOFException();
        }
        tTBaseActivity.write(this, j);
    }

    @Override // o.TTAppOpenAdTransActivity
    public long IAuthTabCallback(@NotNull TTHistoryActivity41 tTHistoryActivity41) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        long jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        if (jICustomTabsCallbackDefault > 0) {
            tTHistoryActivity41.write(this, jICustomTabsCallbackDefault);
        }
        return jICustomTabsCallbackDefault;
    }

    @Override // o.TTAppOpenAdTransActivity
    public String onExtraCallback(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j + 1;
        }
        long jOnExtraCallback = onExtraCallback((byte) 10, 0L, j2);
        if (jOnExtraCallback != -1) {
            return TTHistoryActivity711.onNavigationEvent(this, jOnExtraCallback);
        }
        if (j2 < ICustomTabsCallbackDefault() && onExtraCallbackWithResult(j2 - 1) == 13 && onExtraCallbackWithResult(j2) == 10) {
            return TTHistoryActivity711.onNavigationEvent(this, j2);
        }
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        IAuthTabCallback(tTBaseActivity, 0L, Math.min(32L, ICustomTabsCallbackDefault()));
        throw new EOFException("\\n not found: limit=" + Math.min(ICustomTabsCallbackDefault(), j) + " content=" + tTBaseActivity.writeTypedObject().asInterface() + (char) 8230);
    }

    @Override // o.TTAppOpenAdTransActivity
    public int ICustomTabsCallbackStub() throws EOFException {
        int i;
        int i2;
        int i3;
        if (ICustomTabsCallbackDefault() == 0) {
            throw new EOFException();
        }
        byte bOnExtraCallbackWithResult = onExtraCallbackWithResult(0L);
        if ((bOnExtraCallbackWithResult & ByteCompanionObject.MIN_VALUE) == 0) {
            i = bOnExtraCallbackWithResult & ByteCompanionObject.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((bOnExtraCallbackWithResult & 224) == 192) {
            i = bOnExtraCallbackWithResult & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bOnExtraCallbackWithResult & 240) == 224) {
            i = bOnExtraCallbackWithResult & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bOnExtraCallbackWithResult & 248) != 240) {
                IAuthTabCallbackDefault(1L);
                return 65533;
            }
            i = bOnExtraCallbackWithResult & 7;
            i2 = 4;
            i3 = Imgproc.FLOODFILL_FIXED_RANGE;
        }
        long j = i2;
        if (ICustomTabsCallbackDefault() < j) {
            throw new EOFException("size < " + i2 + ": " + ICustomTabsCallbackDefault() + " (to read code point prefixed 0x" + TTAppOpenAdActivity6.onExtraCallback(bOnExtraCallbackWithResult) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bOnExtraCallbackWithResult2 = onExtraCallbackWithResult(j2);
            if ((bOnExtraCallbackWithResult2 & 192) != 128) {
                IAuthTabCallbackDefault(j2);
                return 65533;
            }
            i = (i << 6) | (bOnExtraCallbackWithResult2 & 63);
        }
        IAuthTabCallbackDefault(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // o.TTAppOpenAdTransActivity
    public byte[] extraCallback() {
        return onWarmupCompleted(ICustomTabsCallbackDefault());
    }

    public byte[] onWarmupCompleted(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (ICustomTabsCallbackDefault() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        onExtraCallbackWithResult(bArr);
        return bArr;
    }

    @Override // o.TTAppOpenAdTransActivity
    public int IAuthTabCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return onNavigationEvent(bArr, 0, bArr.length);
    }

    @Override // o.TTAppOpenAdTransActivity
    public void onExtraCallbackWithResult(@NotNull byte[] bArr) throws EOFException {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i = 0;
        while (i < bArr.length) {
            int iOnNavigationEvent = onNavigationEvent(bArr, i, bArr.length - i);
            if (iOnNavigationEvent == -1) {
                throw new EOFException();
            }
            i += iOnNavigationEvent;
        }
    }

    public int onNavigationEvent(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i, i2);
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            return -1;
        }
        int iMin = Math.min(i2, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
        byte[] bArr2 = tTHistoryActivity2.data;
        int i3 = tTHistoryActivity2.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + iMin);
        tTHistoryActivity2.pos += iMin;
        asInterface(ICustomTabsCallbackDefault() - iMin);
        if (tTHistoryActivity2.pos == tTHistoryActivity2.limit) {
            this.head = tTHistoryActivity2.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
        }
        return iMin;
    }

    public final void onWarmupCompleted() throws EOFException {
        IAuthTabCallbackDefault(ICustomTabsCallbackDefault());
    }

    @Override // o.TTAppOpenAdTransActivity
    public void IAuthTabCallbackDefault(long j) throws EOFException {
        while (j > 0) {
            TTHistoryActivity2 tTHistoryActivity2 = this.head;
            if (tTHistoryActivity2 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
            long j2 = iMin;
            asInterface(ICustomTabsCallbackDefault() - j2);
            j -= j2;
            int i = tTHistoryActivity2.pos + iMin;
            tTHistoryActivity2.pos = i;
            if (i == tTHistoryActivity2.limit) {
                this.head = tTHistoryActivity2.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            }
        }
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        tTBaseLandingPageActivity.onWarmupCompleted(this, 0, tTBaseLandingPageActivity.access100());
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onNavigationEvent(@NotNull String str, int i, int i2) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(1);
                byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
                int i3 = tTHistoryActivity2OnNavigationEvent.limit - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = tTHistoryActivity2OnNavigationEvent.limit;
                int i6 = (i3 + i) - i5;
                tTHistoryActivity2OnNavigationEvent.limit = i5 + i6;
                asInterface(ICustomTabsCallbackDefault() + i6);
            } else {
                if (cCharAt2 < 2048) {
                    TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent2 = onNavigationEvent(2);
                    byte[] bArr2 = tTHistoryActivity2OnNavigationEvent2.data;
                    int i7 = tTHistoryActivity2OnNavigationEvent2.limit;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | BERTags.PRIVATE);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    tTHistoryActivity2OnNavigationEvent2.limit = i7 + 2;
                    asInterface(ICustomTabsCallbackDefault() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent3 = onNavigationEvent(3);
                    byte[] bArr3 = tTHistoryActivity2OnNavigationEvent3.data;
                    int i8 = tTHistoryActivity2OnNavigationEvent3.limit;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    tTHistoryActivity2OnNavigationEvent3.limit = i8 + 3;
                    asInterface(ICustomTabsCallbackDefault() + 3);
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        onExtraCallbackWithResult(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + Imgproc.FLOODFILL_FIXED_RANGE;
                        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent4 = onNavigationEvent(4);
                        byte[] bArr4 = tTHistoryActivity2OnNavigationEvent4.data;
                        int i11 = tTHistoryActivity2OnNavigationEvent4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        tTHistoryActivity2OnNavigationEvent4.limit = i11 + 4;
                        asInterface(ICustomTabsCallbackDefault() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: IAuthTabCallbackStubProxy, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity access100(int i) {
        if (i < 128) {
            onExtraCallbackWithResult(i);
            return this;
        }
        if (i < 2048) {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(2);
            byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
            int i2 = tTHistoryActivity2OnNavigationEvent.limit;
            bArr[i2] = (byte) ((i >> 6) | BERTags.PRIVATE);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            tTHistoryActivity2OnNavigationEvent.limit = i2 + 2;
            asInterface(ICustomTabsCallbackDefault() + 2);
            return this;
        }
        if (55296 <= i && i < 57344) {
            onExtraCallbackWithResult(63);
            return this;
        }
        if (i < 65536) {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent2 = onNavigationEvent(3);
            byte[] bArr2 = tTHistoryActivity2OnNavigationEvent2.data;
            int i3 = tTHistoryActivity2OnNavigationEvent2.limit;
            bArr2[i3] = (byte) ((i >> 12) | BERTags.FLAGS);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            tTHistoryActivity2OnNavigationEvent2.limit = i3 + 3;
            asInterface(ICustomTabsCallbackDefault() + 3);
            return this;
        }
        if (i <= 1114111) {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent3 = onNavigationEvent(4);
            byte[] bArr3 = tTHistoryActivity2OnNavigationEvent3.data;
            int i4 = tTHistoryActivity2OnNavigationEvent3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            tTHistoryActivity2OnNavigationEvent3.limit = i4 + 4;
            asInterface(ICustomTabsCallbackDefault() + 4);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x" + TTAppOpenAdActivity6.onNavigationEvent(i));
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallback(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return onExtraCallback(bArr, 0, bArr.length);
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallback(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        TTAppOpenAdActivity6.onExtraCallbackWithResult(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(1);
            int iMin = Math.min(i3 - i, 8192 - tTHistoryActivity2OnNavigationEvent.limit);
            int i4 = i + iMin;
            ArraysKt___ArraysJvmKt.copyInto(bArr, tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, i, i4);
            tTHistoryActivity2OnNavigationEvent.limit += iMin;
            i = i4;
        }
        asInterface(ICustomTabsCallbackDefault() + j);
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    public long onExtraCallbackWithResult(@NotNull TTHistoryActivity42 tTHistoryActivity42) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        long j = 0;
        while (true) {
            long j2 = tTHistoryActivity42.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public TTBaseActivity onExtraCallbackWithResult(@NotNull TTHistoryActivity42 tTHistoryActivity42, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        while (j > 0) {
            long j2 = tTHistoryActivity42.read(this, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity onExtraCallbackWithResult(int i) {
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(1);
        byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
        int i2 = tTHistoryActivity2OnNavigationEvent.limit;
        tTHistoryActivity2OnNavigationEvent.limit = i2 + 1;
        bArr[i2] = (byte) i;
        asInterface(ICustomTabsCallbackDefault() + 1);
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity IAuthTabCallbackDefault(int i) {
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(2);
        byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
        int i2 = tTHistoryActivity2OnNavigationEvent.limit;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        tTHistoryActivity2OnNavigationEvent.limit = i2 + 2;
        asInterface(ICustomTabsCallbackDefault() + 2);
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity asBinder(int i) {
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(4);
        byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
        int i2 = tTHistoryActivity2OnNavigationEvent.limit;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        tTHistoryActivity2OnNavigationEvent.limit = i2 + 4;
        asInterface(ICustomTabsCallbackDefault() + 4);
        return this;
    }

    public TTBaseActivity access100(long j) {
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(8);
        byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
        int i = tTHistoryActivity2OnNavigationEvent.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        tTHistoryActivity2OnNavigationEvent.limit = i + 8;
        asInterface(ICustomTabsCallbackDefault() + 8);
        return this;
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity IAuthTabCallbackStubProxy(long j) {
        boolean z;
        if (j != 0) {
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    return onExtraCallback("-9223372036854775808");
                }
                z = true;
            } else {
                z = false;
            }
            int iOnNavigationEvent = TTHistoryActivity711.onNavigationEvent(j);
            if (z) {
                iOnNavigationEvent++;
            }
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(iOnNavigationEvent);
            byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
            int i = tTHistoryActivity2OnNavigationEvent.limit + iOnNavigationEvent;
            while (j != 0) {
                i--;
                bArr[i] = TTHistoryActivity711.onWarmupCompleted()[(int) (j % 10)];
                j /= 10;
            }
            if (z) {
                bArr[i - 1] = 45;
            }
            tTHistoryActivity2OnNavigationEvent.limit += iOnNavigationEvent;
            asInterface(ICustomTabsCallbackDefault() + iOnNavigationEvent);
            return this;
        }
        return onExtraCallbackWithResult(48);
    }

    @Override // o.TTAppOpenAdActivity9
    /* renamed from: IAuthTabCallback_Parcel, reason: merged with bridge method [inline-methods] */
    public TTBaseActivity access000(long j) {
        if (j == 0) {
            return onExtraCallbackWithResult(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = onNavigationEvent(i);
        byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
        int i2 = tTHistoryActivity2OnNavigationEvent.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = TTHistoryActivity711.onWarmupCompleted()[(int) (15 & j)];
            j >>>= 4;
        }
        tTHistoryActivity2OnNavigationEvent.limit += i;
        asInterface(ICustomTabsCallbackDefault() + i);
        return this;
    }

    public final TTHistoryActivity2 onNavigationEvent(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            TTHistoryActivity2 tTHistoryActivity2OnWarmupCompleted = TTHistoryActivity.onWarmupCompleted();
            this.head = tTHistoryActivity2OnWarmupCompleted;
            tTHistoryActivity2OnWarmupCompleted.prev = tTHistoryActivity2OnWarmupCompleted;
            tTHistoryActivity2OnWarmupCompleted.next = tTHistoryActivity2OnWarmupCompleted;
            return tTHistoryActivity2OnWarmupCompleted;
        }
        Intrinsics.checkNotNull(tTHistoryActivity2);
        TTHistoryActivity2 tTHistoryActivity22 = tTHistoryActivity2.prev;
        Intrinsics.checkNotNull(tTHistoryActivity22);
        return (tTHistoryActivity22.limit + i > 8192 || !tTHistoryActivity22.owner) ? tTHistoryActivity22.onNavigationEvent(TTHistoryActivity.onWarmupCompleted()) : tTHistoryActivity22;
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) {
        TTHistoryActivity2 tTHistoryActivity2;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (tTBaseActivity == this) {
            throw new IllegalArgumentException("source == this");
        }
        TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
        while (j > 0) {
            TTHistoryActivity2 tTHistoryActivity22 = tTBaseActivity.head;
            Intrinsics.checkNotNull(tTHistoryActivity22);
            int i = tTHistoryActivity22.limit;
            Intrinsics.checkNotNull(tTBaseActivity.head);
            if (j < i - r1.pos) {
                TTHistoryActivity2 tTHistoryActivity23 = this.head;
                if (tTHistoryActivity23 != null) {
                    Intrinsics.checkNotNull(tTHistoryActivity23);
                    tTHistoryActivity2 = tTHistoryActivity23.prev;
                } else {
                    tTHistoryActivity2 = null;
                }
                if (tTHistoryActivity2 != null && tTHistoryActivity2.owner) {
                    if ((tTHistoryActivity2.limit + j) - (tTHistoryActivity2.shared ? 0 : tTHistoryActivity2.pos) <= 8192) {
                        TTHistoryActivity2 tTHistoryActivity24 = tTBaseActivity.head;
                        Intrinsics.checkNotNull(tTHistoryActivity24);
                        tTHistoryActivity24.onWarmupCompleted(tTHistoryActivity2, (int) j);
                        tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() - j);
                        asInterface(ICustomTabsCallbackDefault() + j);
                        return;
                    }
                }
                TTHistoryActivity2 tTHistoryActivity25 = tTBaseActivity.head;
                Intrinsics.checkNotNull(tTHistoryActivity25);
                tTBaseActivity.head = tTHistoryActivity25.onNavigationEvent((int) j);
            }
            TTHistoryActivity2 tTHistoryActivity26 = tTBaseActivity.head;
            Intrinsics.checkNotNull(tTHistoryActivity26);
            long j2 = tTHistoryActivity26.limit - tTHistoryActivity26.pos;
            tTBaseActivity.head = tTHistoryActivity26.onExtraCallback();
            TTHistoryActivity2 tTHistoryActivity27 = this.head;
            if (tTHistoryActivity27 == null) {
                this.head = tTHistoryActivity26;
                tTHistoryActivity26.prev = tTHistoryActivity26;
                tTHistoryActivity26.next = tTHistoryActivity26;
            } else {
                Intrinsics.checkNotNull(tTHistoryActivity27);
                TTHistoryActivity2 tTHistoryActivity28 = tTHistoryActivity27.prev;
                Intrinsics.checkNotNull(tTHistoryActivity28);
                tTHistoryActivity28.onNavigationEvent(tTHistoryActivity26).onWarmupCompleted();
            }
            tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() - j2);
            asInterface(ICustomTabsCallbackDefault() + j2);
            j -= j2;
        }
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (ICustomTabsCallbackDefault() == 0) {
            return -1L;
        }
        if (j > ICustomTabsCallbackDefault()) {
            j = ICustomTabsCallbackDefault();
        }
        tTBaseActivity.write(this, j);
        return j;
    }

    public long onExtraCallback(byte b, long j, long j2) {
        TTHistoryActivity2 tTHistoryActivity2;
        int i;
        long jICustomTabsCallbackDefault = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + ICustomTabsCallbackDefault() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > ICustomTabsCallbackDefault()) {
            j2 = ICustomTabsCallbackDefault();
        }
        if (j == j2 || (tTHistoryActivity2 = this.head) == null) {
            return -1L;
        }
        if (ICustomTabsCallbackDefault() - j < j) {
            jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
            while (jICustomTabsCallbackDefault > j) {
                tTHistoryActivity2 = tTHistoryActivity2.prev;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                jICustomTabsCallbackDefault -= tTHistoryActivity2.limit - tTHistoryActivity2.pos;
            }
            while (jICustomTabsCallbackDefault < j2) {
                byte[] bArr = tTHistoryActivity2.data;
                int iMin = (int) Math.min(tTHistoryActivity2.limit, (tTHistoryActivity2.pos + j2) - jICustomTabsCallbackDefault);
                i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                j = jICustomTabsCallbackDefault;
            }
            return -1L;
        }
        while (true) {
            long j3 = (tTHistoryActivity2.limit - tTHistoryActivity2.pos) + jICustomTabsCallbackDefault;
            if (j3 > j) {
                break;
            }
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            jICustomTabsCallbackDefault = j3;
        }
        while (jICustomTabsCallbackDefault < j2) {
            byte[] bArr2 = tTHistoryActivity2.data;
            int iMin2 = (int) Math.min(tTHistoryActivity2.limit, (tTHistoryActivity2.pos + j2) - jICustomTabsCallbackDefault);
            i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            j = jICustomTabsCallbackDefault;
        }
        return -1L;
        return (i - tTHistoryActivity2.pos) + jICustomTabsCallbackDefault;
    }

    public long onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        long jICustomTabsCallbackDefault = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            return -1L;
        }
        if (ICustomTabsCallbackDefault() - j >= j) {
            while (true) {
                long j2 = (tTHistoryActivity2.limit - tTHistoryActivity2.pos) + jICustomTabsCallbackDefault;
                if (j2 > j) {
                    break;
                }
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                jICustomTabsCallbackDefault = j2;
            }
            if (tTBaseLandingPageActivity.access100() == 2) {
                byte bOnExtraCallbackWithResult = tTBaseLandingPageActivity.onExtraCallbackWithResult(0);
                byte bOnExtraCallbackWithResult2 = tTBaseLandingPageActivity.onExtraCallbackWithResult(1);
                while (jICustomTabsCallbackDefault < ICustomTabsCallbackDefault()) {
                    byte[] bArr = tTHistoryActivity2.data;
                    i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
                    int i3 = tTHistoryActivity2.limit;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bOnExtraCallbackWithResult || b == bOnExtraCallbackWithResult2) {
                            i2 = tTHistoryActivity2.pos;
                        } else {
                            i++;
                        }
                    }
                    jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                    tTHistoryActivity2 = tTHistoryActivity2.next;
                    Intrinsics.checkNotNull(tTHistoryActivity2);
                    j = jICustomTabsCallbackDefault;
                }
            } else {
                byte[] bArrIAuthTabCallbackStub = tTBaseLandingPageActivity.IAuthTabCallbackStub();
                while (jICustomTabsCallbackDefault < ICustomTabsCallbackDefault()) {
                    byte[] bArr2 = tTHistoryActivity2.data;
                    i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
                    int i4 = tTHistoryActivity2.limit;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : bArrIAuthTabCallbackStub) {
                            if (b2 == b3) {
                                i2 = tTHistoryActivity2.pos;
                            }
                        }
                        i++;
                    }
                    jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                    tTHistoryActivity2 = tTHistoryActivity2.next;
                    Intrinsics.checkNotNull(tTHistoryActivity2);
                    j = jICustomTabsCallbackDefault;
                }
            }
            return -1L;
        }
        jICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        while (jICustomTabsCallbackDefault > j) {
            tTHistoryActivity2 = tTHistoryActivity2.prev;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            jICustomTabsCallbackDefault -= tTHistoryActivity2.limit - tTHistoryActivity2.pos;
        }
        if (tTBaseLandingPageActivity.access100() == 2) {
            byte bOnExtraCallbackWithResult3 = tTBaseLandingPageActivity.onExtraCallbackWithResult(0);
            byte bOnExtraCallbackWithResult4 = tTBaseLandingPageActivity.onExtraCallbackWithResult(1);
            while (jICustomTabsCallbackDefault < ICustomTabsCallbackDefault()) {
                byte[] bArr3 = tTHistoryActivity2.data;
                i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
                int i5 = tTHistoryActivity2.limit;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bOnExtraCallbackWithResult3 || b4 == bOnExtraCallbackWithResult4) {
                        i2 = tTHistoryActivity2.pos;
                    } else {
                        i++;
                    }
                }
                jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                j = jICustomTabsCallbackDefault;
            }
        } else {
            byte[] bArrIAuthTabCallbackStub2 = tTBaseLandingPageActivity.IAuthTabCallbackStub();
            while (jICustomTabsCallbackDefault < ICustomTabsCallbackDefault()) {
                byte[] bArr4 = tTHistoryActivity2.data;
                i = (int) ((tTHistoryActivity2.pos + j) - jICustomTabsCallbackDefault);
                int i6 = tTHistoryActivity2.limit;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : bArrIAuthTabCallbackStub2) {
                        if (b5 == b6) {
                            i2 = tTHistoryActivity2.pos;
                        }
                    }
                    i++;
                }
                jICustomTabsCallbackDefault += tTHistoryActivity2.limit - tTHistoryActivity2.pos;
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                j = jICustomTabsCallbackDefault;
            }
        }
        return -1L;
        return (i - i2) + jICustomTabsCallbackDefault;
    }

    public boolean onWarmupCompleted(long j, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i, int i2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        return i2 >= 0 && j >= 0 && ((long) i2) + j <= ICustomTabsCallbackDefault() && i >= 0 && i + i2 <= tTBaseLandingPageActivity.access100() && (i2 == 0 || TTHistoryActivity711.onExtraCallback(this, tTBaseLandingPageActivity, j, j + 1, i, i2) != -1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTBaseActivity)) {
            return false;
        }
        TTBaseActivity tTBaseActivity = (TTBaseActivity) obj;
        if (ICustomTabsCallbackDefault() != tTBaseActivity.ICustomTabsCallbackDefault()) {
            return false;
        }
        long j = 0;
        if (ICustomTabsCallbackDefault() == 0) {
            return true;
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        TTHistoryActivity2 tTHistoryActivity22 = tTBaseActivity.head;
        Intrinsics.checkNotNull(tTHistoryActivity22);
        int i = tTHistoryActivity2.pos;
        int i2 = tTHistoryActivity22.pos;
        long j2 = 0;
        while (j2 < ICustomTabsCallbackDefault()) {
            long jMin = Math.min(tTHistoryActivity2.limit - i, tTHistoryActivity22.limit - i2);
            long j3 = j;
            while (j3 < jMin) {
                if (tTHistoryActivity2.data[i] != tTHistoryActivity22.data[i2]) {
                    return false;
                }
                j3++;
                i++;
                i2++;
            }
            if (i == tTHistoryActivity2.limit) {
                tTHistoryActivity2 = tTHistoryActivity2.next;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                i = tTHistoryActivity2.pos;
            }
            if (i2 == tTHistoryActivity22.limit) {
                tTHistoryActivity22 = tTHistoryActivity22.next;
                Intrinsics.checkNotNull(tTHistoryActivity22);
                i2 = tTHistoryActivity22.pos;
            }
            j2 += jMin;
            j = 0;
        }
        return true;
    }

    public int hashCode() {
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        if (tTHistoryActivity2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = tTHistoryActivity2.limit;
            for (int i3 = tTHistoryActivity2.pos; i3 < i2; i3++) {
                i = (i * 31) + tTHistoryActivity2.data[i3];
            }
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
        } while (tTHistoryActivity2 != this.head);
        return i;
    }

    public final TTBaseActivity onTransact() {
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        if (ICustomTabsCallbackDefault() == 0) {
            return tTBaseActivity;
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        TTHistoryActivity2 tTHistoryActivity2IAuthTabCallback = tTHistoryActivity2.IAuthTabCallback();
        tTBaseActivity.head = tTHistoryActivity2IAuthTabCallback;
        tTHistoryActivity2IAuthTabCallback.prev = tTHistoryActivity2IAuthTabCallback;
        tTHistoryActivity2IAuthTabCallback.next = tTHistoryActivity2IAuthTabCallback;
        for (TTHistoryActivity2 tTHistoryActivity22 = tTHistoryActivity2.next; tTHistoryActivity22 != tTHistoryActivity2; tTHistoryActivity22 = tTHistoryActivity22.next) {
            TTHistoryActivity2 tTHistoryActivity23 = tTHistoryActivity2IAuthTabCallback.prev;
            Intrinsics.checkNotNull(tTHistoryActivity23);
            Intrinsics.checkNotNull(tTHistoryActivity22);
            tTHistoryActivity23.onNavigationEvent(tTHistoryActivity22.IAuthTabCallback());
        }
        tTBaseActivity.asInterface(ICustomTabsCallbackDefault());
        return tTBaseActivity;
    }

    public final TTBaseLandingPageActivity mayLaunchUrl() {
        if (ICustomTabsCallbackDefault() > 2147483647L) {
            throw new IllegalStateException(("size > Int.MAX_VALUE: " + ICustomTabsCallbackDefault()).toString());
        }
        return IAuthTabCallback((int) ICustomTabsCallbackDefault());
    }

    public final TTBaseLandingPageActivity IAuthTabCallback(int i) {
        if (i == 0) {
            return TTBaseLandingPageActivity.EMPTY;
        }
        TTAppOpenAdActivity6.onExtraCallbackWithResult(ICustomTabsCallbackDefault(), 0L, i);
        TTHistoryActivity2 tTHistoryActivity2 = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(tTHistoryActivity2);
            int i5 = tTHistoryActivity2.limit;
            int i6 = tTHistoryActivity2.pos;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            tTHistoryActivity2 = tTHistoryActivity2.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 << 1];
        TTHistoryActivity2 tTHistoryActivity22 = this.head;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(tTHistoryActivity22);
            bArr[i7] = tTHistoryActivity22.data;
            i2 += tTHistoryActivity22.limit - tTHistoryActivity22.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = tTHistoryActivity22.pos;
            tTHistoryActivity22.shared = true;
            i7++;
            tTHistoryActivity22 = tTHistoryActivity22.next;
        }
        return new TTHistoryActivity51(bArr, iArr);
    }
}
