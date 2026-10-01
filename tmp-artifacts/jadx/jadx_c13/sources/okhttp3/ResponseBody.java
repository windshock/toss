package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.setExecute;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion;
    public static final ResponseBody EMPTY;
    private Reader reader;

    @JvmStatic
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @JvmStatic
    public static final ResponseBody create(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @Nullable MediaType mediaType, long j) {
        return Companion.create(tTAppOpenAdTransActivity, mediaType, j);
    }

    @JvmStatic
    public static final ResponseBody create(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @Nullable MediaType mediaType) {
        return Companion.create(tTBaseLandingPageActivity, mediaType);
    }

    @Deprecated
    @JvmStatic
    public static final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        return Companion.create(mediaType, j, tTAppOpenAdTransActivity);
    }

    @Deprecated
    @JvmStatic
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.create(mediaType, str);
    }

    @Deprecated
    @JvmStatic
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return Companion.create(mediaType, tTBaseLandingPageActivity);
    }

    @Deprecated
    @JvmStatic
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @JvmStatic
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract TTAppOpenAdTransActivity source();

    public final InputStream byteStream() {
        return source().IAuthTabCallbackStubProxy();
    }

    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super TTAppOpenAdTransActivity, ? extends T> function1, Function1<? super T, Integer> function12) throws Throwable {
        T tInvoke;
        long jContentLength = responseBody.contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBody.source();
        Throwable th = null;
        try {
            tInvoke = function1.invoke(tTAppOpenAdTransActivitySource);
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            th = th3;
            tInvoke = (Object) null;
        }
        if (th == null) {
            int iIntValue = function12.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        }
        throw th;
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() throws Throwable {
        String strIAuthTabCallback;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = source();
        Throwable th = null;
        try {
            strIAuthTabCallback = tTAppOpenAdTransActivitySource.IAuthTabCallback(_UtilJvmKt.readBomAsCharset(tTAppOpenAdTransActivitySource, charset()));
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            strIAuthTabCallback = null;
            th = th3;
        }
        if (th == null) {
            return strIAuthTabCallback;
        }
        throw th;
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(contentType());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(source());
    }

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final TTAppOpenAdTransActivity source;

        public BomAwareReader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            Intrinsics.checkNotNullParameter(charset, "");
            this.source = tTAppOpenAdTransActivity;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cArr, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cArr, "");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.source.IAuthTabCallbackStubProxy(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "");
            Pair<Charset, MediaType> pairChooseCharset = Internal.chooseCharset(mediaType);
            Charset charsetOnExtraCallbackWithResult = pairChooseCharset.onExtraCallbackWithResult();
            MediaType mediaTypeIAuthTabCallback = pairChooseCharset.IAuthTabCallback();
            TTBaseActivity tTBaseActivityOnExtraCallbackWithResult = new TTBaseActivity().onExtraCallbackWithResult(str, charsetOnExtraCallbackWithResult);
            return create(tTBaseActivityOnExtraCallbackWithResult, mediaTypeIAuthTabCallback, tTBaseActivityOnExtraCallbackWithResult.ICustomTabsCallbackDefault());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create(new TTBaseActivity().onExtraCallback(bArr), mediaType, bArr.length);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, TTBaseLandingPageActivity tTBaseLandingPageActivity, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(tTBaseLandingPageActivity, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            return create(new TTBaseActivity().onExtraCallback(tTBaseLandingPageActivity), mediaType, tTBaseLandingPageActivity.access100());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, TTAppOpenAdTransActivity tTAppOpenAdTransActivity, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(tTAppOpenAdTransActivity, mediaType, j);
        }

        @JvmStatic
        public final ResponseBody create(@NotNull final TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @Nullable final MediaType mediaType, final long j) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public TTAppOpenAdTransActivity source() {
                    return tTAppOpenAdTransActivity;
                }
            };
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return create(str, mediaType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create(bArr, mediaType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            return create(tTBaseLandingPageActivity, mediaType);
        }

        @Deprecated
        @JvmStatic
        public final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            return create(tTAppOpenAdTransActivity, mediaType, j);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        EMPTY = Companion.create$default(companion, TTBaseLandingPageActivity.EMPTY, (MediaType) null, 1, (Object) null);
    }

    public final byte[] bytes() throws Throwable {
        byte[] bArrExtraCallback;
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = source();
        Throwable th = null;
        try {
            bArrExtraCallback = tTAppOpenAdTransActivitySource.extraCallback();
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            bArrExtraCallback = null;
            th = th3;
        }
        if (th == null) {
            int length = bArrExtraCallback.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrExtraCallback;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        }
        throw th;
    }

    public final TTBaseLandingPageActivity byteString() throws Throwable {
        TTBaseLandingPageActivity tTBaseLandingPageActivityWriteTypedObject;
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = source();
        Throwable th = null;
        try {
            tTBaseLandingPageActivityWriteTypedObject = tTAppOpenAdTransActivitySource.writeTypedObject();
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (tTAppOpenAdTransActivitySource != null) {
                try {
                    tTAppOpenAdTransActivitySource.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            tTBaseLandingPageActivityWriteTypedObject = null;
            th = th3;
        }
        if (th == null) {
            int iAccess100 = tTBaseLandingPageActivityWriteTypedObject.access100();
            if (jContentLength == -1 || jContentLength == iAccess100) {
                return tTBaseLandingPageActivityWriteTypedObject;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iAccess100 + ") disagree");
        }
        throw th;
    }
}
