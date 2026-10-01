package ru.nsk.kstatemachine.persistence;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RecordedEvents {
    private final int onExtraCallbackWithResult;
    private final List<Record> onWarmupCompleted;

    public final int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final List<Record> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RecordedEvents.class != obj.getClass()) {
            return false;
        }
        RecordedEvents recordedEvents = (RecordedEvents) obj;
        return this.onExtraCallbackWithResult == recordedEvents.onExtraCallbackWithResult && Intrinsics.areEqual(this.onWarmupCompleted, recordedEvents.onWarmupCompleted);
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "RecordedEvents(structureHashCode=" + this.onExtraCallbackWithResult + ", records=" + this.onWarmupCompleted + ")";
    }
}
