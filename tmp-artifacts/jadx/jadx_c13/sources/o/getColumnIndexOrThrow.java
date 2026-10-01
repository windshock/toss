package o;

import j$.time.Duration;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getColumnIndexOrThrow implements TRANS_V2_ExportCert, TRANS_IsPCconnected {
    private final TRANS_V2_ExportCert onWarmupCompleted = new fby8();
    private final TRANS_IsPCconnected IAuthTabCallback = new fby9();

    @Override // o.TRANS_V2_ExportCert
    public CompletableFuture<byte[]> onWarmupCompleted(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, onChildViewAdded onchildviewadded, byte[] bArr, Duration duration) {
        return this.onWarmupCompleted.onWarmupCompleted(inetSocketAddress, inetSocketAddress2, onchildviewadded, bArr, duration);
    }

    @Override // o.TRANS_IsPCconnected
    public CompletableFuture<byte[]> onNavigationEvent(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, onChildViewAdded onchildviewadded, byte[] bArr, int i, Duration duration) {
        return this.IAuthTabCallback.onNavigationEvent(inetSocketAddress, inetSocketAddress2, onchildviewadded, bArr, i, duration);
    }
}
