package okhttp3;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final TTBaseLandingPageActivity boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    public MultipartBody(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull MediaType mediaType, @NotNull List<Part> list) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.boundaryByteString = tTBaseLandingPageActivity;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    public final MediaType type() {
        return this.type;
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final String boundary() {
        return this.boundaryByteString.IAuthTabCallback_Parcel();
    }

    public final int size() {
        return this.parts.size();
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        List<Part> list = this.parts;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).body().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    @Deprecated
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m246deprecated_type() {
        return this.type;
    }

    @Deprecated
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m243deprecated_boundary() {
        return boundary();
    }

    @Deprecated
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m245deprecated_size() {
        return size();
    }

    @Deprecated
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m244deprecated_parts() {
        return this.parts;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        writeOrCountBytes(tTAppOpenAdActivity9, false);
    }

    private final long writeOrCountBytes(TTAppOpenAdActivity9 tTAppOpenAdActivity9, boolean z) throws IOException {
        TTAppOpenAdActivity9 tTAppOpenAdActivity92;
        TTBaseActivity tTBaseActivity;
        if (z) {
            tTBaseActivity = new TTBaseActivity();
            tTAppOpenAdActivity92 = tTBaseActivity;
        } else {
            tTAppOpenAdActivity92 = tTAppOpenAdActivity9;
            tTBaseActivity = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            Intrinsics.checkNotNull(tTAppOpenAdActivity92);
            tTAppOpenAdActivity92.onExtraCallback(DASHDASH);
            tTAppOpenAdActivity92.onExtraCallback(this.boundaryByteString);
            tTAppOpenAdActivity92.onExtraCallback(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    tTAppOpenAdActivity92.onExtraCallback(headers.name(i2)).onExtraCallback(COLONSPACE).onExtraCallback(headers.value(i2)).onExtraCallback(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                tTAppOpenAdActivity92.onExtraCallback("Content-Type: ").onExtraCallback(mediaTypeContentType.toString()).onExtraCallback(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength == -1 && z) {
                Intrinsics.checkNotNull(tTBaseActivity);
                tTBaseActivity.onWarmupCompleted();
                return -1L;
            }
            byte[] bArr = CRLF;
            tTAppOpenAdActivity92.onExtraCallback(bArr);
            if (z) {
                j += jContentLength;
            } else {
                requestBodyBody.writeTo(tTAppOpenAdActivity92);
            }
            tTAppOpenAdActivity92.onExtraCallback(bArr);
        }
        Intrinsics.checkNotNull(tTAppOpenAdActivity92);
        byte[] bArr2 = DASHDASH;
        tTAppOpenAdActivity92.onExtraCallback(bArr2);
        tTAppOpenAdActivity92.onExtraCallback(this.boundaryByteString);
        tTAppOpenAdActivity92.onExtraCallback(bArr2);
        tTAppOpenAdActivity92.onExtraCallback(CRLF);
        if (!z) {
            return j;
        }
        Intrinsics.checkNotNull(tTBaseActivity);
        long jICustomTabsCallbackDefault = j + tTBaseActivity.ICustomTabsCallbackDefault();
        tTBaseActivity.onWarmupCompleted();
        return jICustomTabsCallbackDefault;
    }

    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(@NotNull RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @JvmStatic
        public static final Part createFormData(@NotNull String str, @NotNull String str2) {
            return Companion.createFormData(str, str2);
        }

        @JvmStatic
        public static final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public final Headers headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        @Deprecated
        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m248deprecated_headers() {
            return this.headers;
        }

        @Deprecated
        /* renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m247deprecated_body() {
            return this.body;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Part create(@NotNull RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(requestBody, "");
                return create(null, requestBody);
            }

            @JvmStatic
            public final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(requestBody, "");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.get("Content-Length") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new Part(headers, requestBody, defaultConstructorMarker);
            }

            @JvmStatic
            public final Part createFormData(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            @JvmStatic
            public final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(requestBody, "");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder sb, @NotNull String str) {
            Intrinsics.checkNotNullParameter(sb, "");
            Intrinsics.checkNotNullParameter(str, "");
            sb.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }
}
