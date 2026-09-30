package o;

import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface hz {

    public enum onWarmupCompleted {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    ByteBuffer IAuthTabCallback();

    boolean IAuthTabCallbackStub();

    boolean asBinder();

    boolean asInterface();

    onWarmupCompleted onNavigationEvent();

    boolean onTransact();
}
