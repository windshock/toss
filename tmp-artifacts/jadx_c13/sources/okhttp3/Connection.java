package okhttp3;

import java.net.Socket;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
