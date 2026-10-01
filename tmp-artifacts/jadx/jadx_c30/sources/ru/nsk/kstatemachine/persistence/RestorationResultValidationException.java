package ru.nsk.kstatemachine.persistence;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RestorationResultValidationException extends RuntimeException {
    private final RestorationResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestorationResultValidationException(@NotNull RestorationResult restorationResult, @NotNull String str, @Nullable Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(restorationResult, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.result = restorationResult;
    }
}
