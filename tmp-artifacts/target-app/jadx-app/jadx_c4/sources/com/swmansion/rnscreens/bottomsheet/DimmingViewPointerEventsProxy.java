package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.ReactPointerEventsView;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DimmingViewPointerEventsProxy implements ReactPointerEventsView {
    private DimmingViewPointerEventsImpl pointerEventsImpl;

    public DimmingViewPointerEventsProxy(@Nullable DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }

    public final DimmingViewPointerEventsImpl getPointerEventsImpl() {
        return this.pointerEventsImpl;
    }

    public final void setPointerEventsImpl(@Nullable DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }

    public CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 getPointerEvents() {
        CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 pointerEvents;
        DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl = this.pointerEventsImpl;
        return (dimmingViewPointerEventsImpl == null || (pointerEvents = dimmingViewPointerEventsImpl.getPointerEvents()) == null) ? CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.NONE : pointerEvents;
    }
}
