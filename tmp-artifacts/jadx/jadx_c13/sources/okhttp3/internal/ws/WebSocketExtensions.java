package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.perMessageDeflate);
        Integer num = this.clientMaxWindowBits;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = Boolean.hashCode(this.clientNoContextTakeover);
        Integer num2 = this.serverMaxWindowBits;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.serverNoContextTakeover)) * 31) + Boolean.hashCode(this.unknownValues);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final boolean noContextTakeover(boolean z) {
        if (z) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        
            if (r6 != false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        
            if (r12 >= r14) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            r2 = okhttp3.internal._UtilCommonKt.delimiterOffset(r5, ';', r12, r14);
            r3 = okhttp3.internal._UtilCommonKt.delimiterOffset(r5, '=', r12, r2);
            r6 = okhttp3.internal._UtilCommonKt.trimSubstring(r5, r12, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        
            if (r3 >= r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            r3 = kotlin.text.StringsKt__StringsKt.removeSurrounding(okhttp3.internal._UtilCommonKt.trimSubstring(r5, r3 + 1, r2), (java.lang.CharSequence) "\"");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        
            r12 = r2 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
        
            if (kotlin.text.StringsKt__StringsJVMKt.equals(r6, "client_max_window_bits", true) == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        
            if (r7 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            if (r3 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        
            r2 = kotlin.text.StringsKt__StringNumberConversionsKt.toIntOrNull(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            r7 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        
            if (r2 != null) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        
            if (kotlin.text.StringsKt__StringsJVMKt.equals(r6, "client_no_context_takeover", true) == false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        
            if (r8 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
        
            if (r3 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
        
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        
            if (kotlin.text.StringsKt__StringsJVMKt.equals(r6, "server_max_window_bits", true) == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        
            if (r9 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
        
            if (r3 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        
            r2 = kotlin.text.StringsKt__StringNumberConversionsKt.toIntOrNull(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
        
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        
            if (r2 != null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
        
            if (kotlin.text.StringsKt__StringsJVMKt.equals(r6, "server_no_context_takeover", true) == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
        
            if (r10 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
        
            if (r3 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Path cross not found for [B:54:0x00c5, B:83:?], limit reached: 80 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00c5 -> B:15:0x0055). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final WebSocketExtensions parse(@NotNull Headers headers) throws IOException {
            Intrinsics.checkNotNullParameter(headers, "");
            int size = headers.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals(headers.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = headers.value(i);
                    int i2 = 0;
                    while (i2 < strValue.length()) {
                        int iDelimiterOffset$default = _UtilCommonKt.delimiterOffset$default(strValue, ',', i2, 0, 4, (Object) null);
                        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(strValue, ';', i2, iDelimiterOffset$default);
                        String strTrimSubstring = _UtilCommonKt.trimSubstring(strValue, i2, iDelimiterOffset);
                        int i3 = iDelimiterOffset + 1;
                        if (StringsKt__StringsJVMKt.equals(strTrimSubstring, "permessage-deflate", true)) {
                            i2 = i3;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }
    }
}
