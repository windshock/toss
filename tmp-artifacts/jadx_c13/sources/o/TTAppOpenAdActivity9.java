package o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TTAppOpenAdActivity9 extends TTHistoryActivity41, WritableByteChannel {
    TTAppOpenAdActivity9 IAuthTabCallbackDefault(int i) throws IOException;

    TTAppOpenAdActivity9 IAuthTabCallbackStub(int i) throws IOException;

    TTAppOpenAdActivity9 IAuthTabCallbackStubProxy(long j) throws IOException;

    OutputStream access000();

    TTAppOpenAdActivity9 access000(long j) throws IOException;

    TTAppOpenAdActivity9 access100(int i) throws IOException;

    TTBaseActivity access100();

    TTAppOpenAdActivity9 asBinder() throws IOException;

    TTAppOpenAdActivity9 asBinder(int i) throws IOException;

    TTAppOpenAdActivity9 asInterface() throws IOException;

    @Override // o.TTHistoryActivity41, java.io.Flushable
    void flush() throws IOException;

    TTAppOpenAdActivity9 onExtraCallback(@NotNull String str) throws IOException;

    TTAppOpenAdActivity9 onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException;

    TTAppOpenAdActivity9 onExtraCallback(@NotNull byte[] bArr) throws IOException;

    TTAppOpenAdActivity9 onExtraCallback(@NotNull byte[] bArr, int i, int i2) throws IOException;

    long onExtraCallbackWithResult(@NotNull TTHistoryActivity42 tTHistoryActivity42) throws IOException;

    TTAppOpenAdActivity9 onExtraCallbackWithResult(int i) throws IOException;

    TTAppOpenAdActivity9 onExtraCallbackWithResult(@NotNull String str, @NotNull Charset charset) throws IOException;

    TTAppOpenAdActivity9 onNavigationEvent(@NotNull String str, int i, int i2) throws IOException;

    TTAppOpenAdActivity9 writeTypedObject(long j) throws IOException;
}
