package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.ReactPointerEventsView;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DimmingViewPointerEventsImpl implements ReactPointerEventsView {
    private final DimmingView dimmingView;

    public DimmingViewPointerEventsImpl(@NotNull DimmingView dimmingView) {
        Intrinsics.checkNotNullParameter(dimmingView, "");
        this.dimmingView = dimmingView;
    }

    public final DimmingView getDimmingView() {
        return this.dimmingView;
    }

    public CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 getPointerEvents() {
        return this.dimmingView.getBlockGestures$react_native_screens_release() ? CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.AUTO : CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.NONE;
    }
}
