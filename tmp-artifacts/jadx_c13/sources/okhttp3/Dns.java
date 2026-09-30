package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    List<InetAddress> lookup(@NotNull String str) throws UnknownHostException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(@NotNull String str) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(str, "");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    Intrinsics.checkNotNullExpressionValue(allByName, "");
                    return ArraysKt___ArraysKt.toList(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }
}
