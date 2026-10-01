package com.swmansion.rnscreens;

import com.facebook.react.module.annotations.ReactModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(IAuthTabCallback = ModalScreenViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ModalScreenViewManager extends ScreenViewManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSModalScreen";

    @Override // com.swmansion.rnscreens.ScreenViewManager
    public String getName() {
        return REACT_CLASS;
    }
}
