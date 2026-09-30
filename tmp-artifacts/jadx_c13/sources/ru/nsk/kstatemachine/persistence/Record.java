package ru.nsk.kstatemachine.persistence;

import kotlin.jvm.internal.Intrinsics;
import o.logicChangeCertPW;
import o.logicIssueCertMakePOPOSigningInputMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Record {
    private final logicIssueCertMakePOPOSigningInputMsg<?> onNavigationEvent;
    private final logicChangeCertPW onWarmupCompleted;

    public Record(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull logicChangeCertPW logicchangecertpw) {
        Intrinsics.checkNotNullParameter(logicissuecertmakepoposigninginputmsg, "");
        Intrinsics.checkNotNullParameter(logicchangecertpw, "");
        this.onNavigationEvent = logicissuecertmakepoposigninginputmsg;
        this.onWarmupCompleted = logicchangecertpw;
    }

    public final logicIssueCertMakePOPOSigningInputMsg<?> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final logicChangeCertPW onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Record.class != obj.getClass()) {
            return false;
        }
        Record record = (Record) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, record.onNavigationEvent) && this.onWarmupCompleted == record.onWarmupCompleted;
    }

    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "Record(eventAndArgument=" + this.onNavigationEvent + ", processingResult=" + this.onWarmupCompleted + ")";
    }
}
