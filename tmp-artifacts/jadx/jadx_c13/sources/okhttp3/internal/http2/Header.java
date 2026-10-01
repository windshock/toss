package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final TTBaseLandingPageActivity PSEUDO_PREFIX;
    public static final TTBaseLandingPageActivity RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final TTBaseLandingPageActivity TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final TTBaseLandingPageActivity TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final TTBaseLandingPageActivity TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final TTBaseLandingPageActivity TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final TTBaseLandingPageActivity name;
    public final TTBaseLandingPageActivity value;

    public static /* synthetic */ Header copy$default(Header header, TTBaseLandingPageActivity tTBaseLandingPageActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity2, int i, Object obj) {
        if ((i & 1) != 0) {
            tTBaseLandingPageActivity = header.name;
        }
        if ((i & 2) != 0) {
            tTBaseLandingPageActivity2 = header.value;
        }
        return header.copy(tTBaseLandingPageActivity, tTBaseLandingPageActivity2);
    }

    public final TTBaseLandingPageActivity component1() {
        return this.name;
    }

    public final TTBaseLandingPageActivity component2() {
        return this.value;
    }

    public final Header copy(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity2, "");
        return new Header(tTBaseLandingPageActivity, tTBaseLandingPageActivity2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public Header(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity2) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity2, "");
        this.name = tTBaseLandingPageActivity;
        this.value = tTBaseLandingPageActivity2;
        this.hpackSize = tTBaseLandingPageActivity.access100() + 32 + tTBaseLandingPageActivity2.access100();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        this(iAuthTabCallback.IAuthTabCallback(str), iAuthTabCallback.IAuthTabCallback(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull String str) {
        this(tTBaseLandingPageActivity, TTBaseLandingPageActivity.Companion.IAuthTabCallback(str));
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public String toString() {
        return this.name.IAuthTabCallback_Parcel() + ": " + this.value.IAuthTabCallback_Parcel();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        PSEUDO_PREFIX = iAuthTabCallback.IAuthTabCallback(":");
        RESPONSE_STATUS = iAuthTabCallback.IAuthTabCallback(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = iAuthTabCallback.IAuthTabCallback(TARGET_METHOD_UTF8);
        TARGET_PATH = iAuthTabCallback.IAuthTabCallback(TARGET_PATH_UTF8);
        TARGET_SCHEME = iAuthTabCallback.IAuthTabCallback(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = iAuthTabCallback.IAuthTabCallback(TARGET_AUTHORITY_UTF8);
    }
}
