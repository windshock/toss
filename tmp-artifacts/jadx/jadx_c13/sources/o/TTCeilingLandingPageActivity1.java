package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okio.RealBufferedSource;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTCeilingLandingPageActivity1 implements TTHistoryActivity42 {
    private final TTCeilingLandingPageActivity4 IAuthTabCallback;
    private final Inflater onExtraCallback;
    private final RealBufferedSource onExtraCallbackWithResult;
    private final CRC32 onNavigationEvent;
    private byte onWarmupCompleted;

    public TTCeilingLandingPageActivity1(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        RealBufferedSource realBufferedSource = new RealBufferedSource(tTHistoryActivity42);
        this.onExtraCallbackWithResult = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.onExtraCallback = inflater;
        this.IAuthTabCallback = new TTCeilingLandingPageActivity4((TTAppOpenAdTransActivity) realBufferedSource, inflater);
        this.onNavigationEvent = new CRC32();
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws DataFormatException, IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.onWarmupCompleted == 0) {
            onWarmupCompleted();
            this.onWarmupCompleted = (byte) 1;
        }
        if (this.onWarmupCompleted == 1) {
            long jICustomTabsCallbackDefault = tTBaseActivity.ICustomTabsCallbackDefault();
            long j2 = this.IAuthTabCallback.read(tTBaseActivity, j);
            if (j2 != -1) {
                onExtraCallback(tTBaseActivity, jICustomTabsCallbackDefault, j2);
                return j2;
            }
            this.onWarmupCompleted = (byte) 2;
        }
        if (this.onWarmupCompleted == 2) {
            onExtraCallback();
            this.onWarmupCompleted = (byte) 3;
            if (!this.onExtraCallbackWithResult.IAuthTabCallback_Parcel()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private final void onWarmupCompleted() throws IOException {
        this.onExtraCallbackWithResult.IAuthTabCallbackStub(10L);
        byte bOnExtraCallbackWithResult = this.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallbackWithResult(3L);
        boolean z = ((bOnExtraCallbackWithResult >> 1) & 1) == 1;
        if (z) {
            onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, 0L, 10L);
        }
        onExtraCallbackWithResult("ID1ID2", 8075, this.onExtraCallbackWithResult.onActivityResized());
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault(8L);
        if (((bOnExtraCallbackWithResult >> 2) & 1) == 1) {
            this.onExtraCallbackWithResult.IAuthTabCallbackStub(2L);
            if (z) {
                onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, 0L, 2L);
            }
            long jICustomTabsCallbackStubProxy = this.onExtraCallbackWithResult.IAuthTabCallback.ICustomTabsCallbackStubProxy() & 65535;
            this.onExtraCallbackWithResult.IAuthTabCallbackStub(jICustomTabsCallbackStubProxy);
            if (z) {
                onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, 0L, jICustomTabsCallbackStubProxy);
            }
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault(jICustomTabsCallbackStubProxy);
        }
        if (((bOnExtraCallbackWithResult >> 3) & 1) == 1) {
            long jOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult((byte) 0);
            if (jOnExtraCallbackWithResult == -1) {
                throw new EOFException();
            }
            if (z) {
                onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, 0L, jOnExtraCallbackWithResult + 1);
            }
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault(jOnExtraCallbackWithResult + 1);
        }
        if (((bOnExtraCallbackWithResult >> 4) & 1) == 1) {
            long jOnExtraCallbackWithResult2 = this.onExtraCallbackWithResult.onExtraCallbackWithResult((byte) 0);
            if (jOnExtraCallbackWithResult2 == -1) {
                throw new EOFException();
            }
            if (z) {
                onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback, 0L, jOnExtraCallbackWithResult2 + 1);
            }
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault(jOnExtraCallbackWithResult2 + 1);
        }
        if (z) {
            onExtraCallbackWithResult("FHCRC", this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy(), (short) this.onNavigationEvent.getValue());
            this.onNavigationEvent.reset();
        }
    }

    private final void onExtraCallback() throws IOException {
        onExtraCallbackWithResult("CRC", this.onExtraCallbackWithResult.onActivityLayout(), (int) this.onNavigationEvent.getValue());
        onExtraCallbackWithResult("ISIZE", this.onExtraCallbackWithResult.onActivityLayout(), (int) this.onExtraCallback.getBytesWritten());
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onExtraCallbackWithResult.timeout();
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() throws IOException {
        this.IAuthTabCallback.close();
    }

    private final void onExtraCallback(TTBaseActivity tTBaseActivity, long j, long j2) {
        TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        while (true) {
            long j3 = tTHistoryActivity2.limit - tTHistoryActivity2.pos;
            if (j < j3) {
                break;
            }
            j -= j3;
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(tTHistoryActivity2.limit - r6, j2);
            this.onNavigationEvent.update(tTHistoryActivity2.data, (int) (tTHistoryActivity2.pos + j), iMin);
            j2 -= iMin;
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            j = 0;
        }
    }

    private final void onExtraCallbackWithResult(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + StringsKt__StringsKt.padStart(TTAppOpenAdActivity6.onNavigationEvent(i2), 8, '0') + " != expected 0x" + StringsKt__StringsKt.padStart(TTAppOpenAdActivity6.onNavigationEvent(i), 8, '0'));
    }
}
