package o;

import kotlin.properties.ReadWriteProperty;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMemoryDumpCount {
    public static final getMemoryDumpCount onNavigationEvent = new getMemoryDumpCount();

    private getMemoryDumpCount() {
    }

    public final <T> ReadWriteProperty<Object, T> onWarmupCompleted() {
        return new getMemoryDump();
    }
}
