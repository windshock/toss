package ru.nsk.kstatemachine.persistence;

import o.access13800;
import o.checkLicense;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RestoreByRecordedEventsKt {
    public static /* synthetic */ Object onWarmupCompleted(logicDisuseCertRr logicdisusecertrr, RecordedEvents recordedEvents, boolean z, boolean z2, RestorationResultValidator restorationResultValidator, access13800 access13800Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            restorationResultValidator = checkLicense.onNavigationEvent;
        }
        return IAuthTabCallback(logicdisusecertrr, recordedEvents, z3, z4, restorationResultValidator, access13800Var);
    }

    public static final Object IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull RecordedEvents recordedEvents, boolean z, boolean z2, @NotNull RestorationResultValidator restorationResultValidator, @NotNull access13800<? super RestorationResult> access13800Var) {
        return logicdisusecertrr.cC_().onNavigationEvent(new RestoreByRecordedEventsKt$restoreByRecordedEvents$2(logicdisusecertrr, z2, recordedEvents, z, restorationResultValidator, null), access13800Var);
    }
}
