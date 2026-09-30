package o;

import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.persistence.RecordedEvents;
import ru.nsk.kstatemachine.persistence.RestorationResult;
import ru.nsk.kstatemachine.persistence.RestorationResultValidationException;
import ru.nsk.kstatemachine.persistence.RestorationResultValidator;
import ru.nsk.kstatemachine.persistence.RestoredEventResult;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class checkLicense implements RestorationResultValidator {
    public static final checkLicense onNavigationEvent = new checkLicense();

    private checkLicense() {
    }

    @Override // ru.nsk.kstatemachine.persistence.RestorationResultValidator
    public void onExtraCallback(@NotNull RestorationResult restorationResult, @NotNull RecordedEvents recordedEvents, @NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(restorationResult, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(recordedEvents, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(logicdisusecertrr, BuildConfig.FLAVOR);
        if (!restorationResult.onNavigationEvent().isEmpty()) {
            throw new RestorationResultValidationException(restorationResult, "The " + Reflection.getOrCreateKotlinClass(RestorationResult.class).getSimpleName() + " contains warnings", (Throwable) CollectionsKt.first(restorationResult.onNavigationEvent()));
        }
        for (RestoredEventResult restoredEventResult : restorationResult.onExtraCallbackWithResult()) {
            if (!restoredEventResult.IAuthTabCallback().isEmpty()) {
                throw new RestorationResultValidationException(restorationResult, "The " + Reflection.getOrCreateKotlinClass(RestorationResult.class).getSimpleName() + " contains warnings", (Throwable) CollectionsKt.first(restoredEventResult.IAuthTabCallback()));
            }
            if (Result.onExtraCallback(restoredEventResult.onNavigationEvent())) {
                throw new RestorationResultValidationException(restorationResult, "The " + Reflection.getOrCreateKotlinClass(RestorationResult.class).getSimpleName() + " contains failed processing result", Result.exceptionOrNull-impl(restoredEventResult.onNavigationEvent()));
            }
        }
    }
}
