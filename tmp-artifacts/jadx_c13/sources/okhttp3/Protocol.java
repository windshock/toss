package okhttp3;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.access15300;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Protocol {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Protocol[] $VALUES;
    public static final Companion Companion;
    private final String protocol;
    public static final Protocol HTTP_1_0 = new Protocol("HTTP_1_0", 0, "http/1.0");
    public static final Protocol HTTP_1_1 = new Protocol("HTTP_1_1", 1, "http/1.1");

    @Deprecated
    public static final Protocol SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
    public static final Protocol HTTP_2 = new Protocol("HTTP_2", 3, "h2");
    public static final Protocol H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final Protocol QUIC = new Protocol("QUIC", 5, "quic");
    public static final Protocol HTTP_3 = new Protocol("HTTP_3", 6, "h3");

    private static final /* synthetic */ Protocol[] $values() {
        return new Protocol[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    @JvmStatic
    public static final Protocol get(@NotNull String str) throws IOException {
        return Companion.get(str);
    }

    public static EnumEntries<Protocol> getEntries() {
        return $ENTRIES;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) $VALUES.clone();
    }

    private Protocol(String str, int i, String str2) {
        this.protocol = str2;
    }

    static {
        Protocol[] protocolArr$values = $values();
        $VALUES = protocolArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(protocolArr$values);
        Companion = new Companion(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Protocol get(@NotNull String str) throws IOException {
            Intrinsics.checkNotNullParameter(str, "");
            Protocol protocol = Protocol.HTTP_1_0;
            if (Intrinsics.areEqual(str, protocol.protocol)) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (Intrinsics.areEqual(str, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.areEqual(str, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (Intrinsics.areEqual(str, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (Intrinsics.areEqual(str, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (Intrinsics.areEqual(str, protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.HTTP_3;
            if (StringsKt__StringsJVMKt.startsWith$default(str, protocol7.protocol, false, 2, null)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: " + str);
        }
    }
}
