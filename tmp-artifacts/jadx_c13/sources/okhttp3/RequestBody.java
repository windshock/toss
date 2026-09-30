package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RequestBody {
    public static final Companion Companion;
    public static final RequestBody EMPTY;

    @JvmStatic
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull FileDescriptor fileDescriptor, @Nullable MediaType mediaType) {
        return Companion.create(fileDescriptor, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @Nullable MediaType mediaType) {
        return Companion.create(tTBaseLandingPageActivity, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull FileSystem fileSystem, @Nullable MediaType mediaType) {
        return Companion.create(tTFullScreenVideoActivity3, fileSystem, mediaType);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        return Companion.create(mediaType, file);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.create(mediaType, str);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return Companion.create(mediaType, tTBaseLandingPageActivity);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    @Deprecated
    @JvmStatic
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
        return Companion.create(mediaType, bArr, i, i2);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull byte[] bArr) {
        return Companion.create(bArr);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    @JvmStatic
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
        return Companion.create(bArr, mediaType, i, i2);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException;

    public final TTBaseLandingPageActivity sha256() throws IOException {
        TTCeilingLandingPageActivity tTCeilingLandingPageActivityOnWarmupCompleted = TTCeilingLandingPageActivity.Companion.onWarmupCompleted(TTCeilingLandingPageActivity5.onExtraCallback());
        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult((TTHistoryActivity41) tTCeilingLandingPageActivityOnWarmupCompleted);
        try {
            writeTo(tTAppOpenAdActivity9OnExtraCallbackWithResult);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, null);
            return tTCeilingLandingPageActivityOnWarmupCompleted.onWarmupCompleted();
        } finally {
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @JvmStatic
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @JvmStatic
        public final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "");
            Pair<Charset, MediaType> pairChooseCharset = Internal.chooseCharset(mediaType);
            Charset charsetOnExtraCallbackWithResult = pairChooseCharset.onExtraCallbackWithResult();
            MediaType mediaTypeIAuthTabCallback = pairChooseCharset.IAuthTabCallback();
            byte[] bytes = str.getBytes(charsetOnExtraCallbackWithResult);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return create(bytes, mediaTypeIAuthTabCallback, 0, bytes.length);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, TTBaseLandingPageActivity tTBaseLandingPageActivity, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(tTBaseLandingPageActivity, mediaType);
        }

        @JvmStatic
        public final RequestBody create(@NotNull final TTBaseLandingPageActivity tTBaseLandingPageActivity, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return tTBaseLandingPageActivity.access100();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
                    Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
                    tTAppOpenAdActivity9.onExtraCallback(tTBaseLandingPageActivity);
                }
            };
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, FileDescriptor fileDescriptor, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        @JvmStatic
        public final RequestBody create(@NotNull final FileDescriptor fileDescriptor, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(fileDescriptor, "");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
                    Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
                    FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                    try {
                        tTAppOpenAdActivity9.access100().onExtraCallbackWithResult(TTCeilingLandingPageActivity5.IAuthTabCallback(fileInputStream));
                        CloseableKt.closeFinally(fileInputStream, null);
                    } finally {
                    }
                }
            };
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        @JvmStatic
        public final RequestBody create(@NotNull final byte[] bArr, @Nullable final MediaType mediaType, final int i, final int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
                    Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
                    tTAppOpenAdActivity9.onExtraCallback(bArr, i, i2);
                }
            };
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @JvmStatic
        public final RequestBody create(@NotNull final File file, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(file, "");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
                    Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
                    TTHistoryActivity42 tTHistoryActivity42OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(file);
                    try {
                        tTAppOpenAdActivity9.onExtraCallbackWithResult(tTHistoryActivity42OnWarmupCompleted);
                        CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted, null);
                    } finally {
                    }
                }
            };
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, FileSystem fileSystem, MediaType mediaType, int i, Object obj) {
            if ((i & 2) != 0) {
                mediaType = null;
            }
            return companion.create(tTFullScreenVideoActivity3, fileSystem, mediaType);
        }

        @JvmStatic
        public final RequestBody create(@NotNull final TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull final FileSystem fileSystem, @Nullable final MediaType mediaType) {
            Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
            Intrinsics.checkNotNullParameter(fileSystem, "");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    Long lOnExtraCallback = fileSystem.metadata(tTFullScreenVideoActivity3).onExtraCallback();
                    if (lOnExtraCallback != null) {
                        return lOnExtraCallback.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
                    Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
                    TTHistoryActivity42 tTHistoryActivity42Source = fileSystem.source(tTFullScreenVideoActivity3);
                    try {
                        tTAppOpenAdActivity9.onExtraCallbackWithResult(tTHistoryActivity42Source);
                        CloseableKt.closeFinally(tTHistoryActivity42Source, null);
                    } finally {
                    }
                }
            };
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return create(str, mediaType);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            return create(tTBaseLandingPageActivity, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return create(bArr, mediaType, i, i2);
        }

        @Deprecated
        @JvmStatic
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "");
            return create(file, mediaType);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        EMPTY = Companion.create$default(companion, TTBaseLandingPageActivity.EMPTY, (MediaType) null, 1, (Object) null);
    }
}
