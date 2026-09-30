package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(@NotNull Protocol protocol, int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(protocol, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        return sb.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StatusLine get(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(@NotNull String str) throws IOException {
            Protocol protocol;
            int i;
            String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt__StringsJVMKt.startsWith$default(str, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (iCharAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "ICY ", false, 2, null)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else if (StringsKt__StringsJVMKt.startsWith$default(str, "SOURCETABLE ", false, 2, null)) {
                protocol = Protocol.HTTP_1_1;
                i = 12;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strSubstring);
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iIntValue = intOrNull.intValue();
            if (str.length() > i2) {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                String strSubstring2 = str.substring(i + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                str2 = strSubstring2;
            }
            return new StatusLine(protocol, iIntValue, str2);
        }
    }
}
