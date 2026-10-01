package o;

import j$.time.Duration;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TRANS_V2_ExportCert {
    CompletableFuture<byte[]> onWarmupCompleted(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, onChildViewAdded onchildviewadded, byte[] bArr, Duration duration);
}
