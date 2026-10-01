package o;

import kotlin.sequences.Sequence;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface addMemoryMappings<T> extends Sequence<T> {
    Sequence<T> onNavigationEvent(int i);

    Sequence<T> onWarmupCompleted(int i);
}
