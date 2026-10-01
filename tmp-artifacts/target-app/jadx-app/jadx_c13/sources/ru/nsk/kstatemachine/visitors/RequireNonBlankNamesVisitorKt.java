package ru.nsk.kstatemachine.visitors;

import kotlin.jvm.internal.Intrinsics;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequireNonBlankNamesVisitorKt {
    public static final void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        RequireNonBlankNamesVisitor requireNonBlankNamesVisitor = new RequireNonBlankNamesVisitor();
        logicdisusecertrr.onExtraCallback(requireNonBlankNamesVisitor);
        requireNonBlankNamesVisitor.onExtraCallbackWithResult();
    }
}
