package ua.naiksoftware.stomp.provider;

import o.getByteBuffer;
import o.wasLastName;
import ua.naiksoftware.stomp.dto.LifecycleEvent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ConnectionProvider {
    void cancel();

    wasLastName disconnect();

    getByteBuffer<LifecycleEvent> lifecycle();

    getByteBuffer<String> messages();

    wasLastName send(String str);
}
