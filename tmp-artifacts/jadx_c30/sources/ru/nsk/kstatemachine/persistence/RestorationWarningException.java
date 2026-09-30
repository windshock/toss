package ru.nsk.kstatemachine.persistence;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.checkMovementLicense;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RestorationWarningException extends RuntimeException {
    private final checkMovementLicense warningType;

    public /* synthetic */ RestorationWarningException(checkMovementLicense checkmovementlicense, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkmovementlicense, str, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestorationWarningException(@NotNull checkMovementLicense checkmovementlicense, @NotNull String str, @Nullable Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(checkmovementlicense, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.warningType = checkmovementlicense;
    }
}
