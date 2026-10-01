package com.tnkfactory.ad;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdAnalytics {
    public static final TnkAdAnalytics INSTANCE = new TnkAdAnalytics();
    private static TnkAdEVentListener tnkAdEVentListener = new TnkAdEVentListener() { // from class: com.tnkfactory.ad.TnkAdAnalytics$tnkAdEVentListener$1
        @Override // com.tnkfactory.ad.TnkAdAnalytics.TnkAdEVentListener
        public void onEvent(String str, HashMap<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
        }
    };

    public interface TnkAdEVentListener {
        void onEvent(@NotNull String str, @NotNull HashMap<String, String> map);
    }

    private TnkAdAnalytics() {
    }

    public final TnkAdEVentListener getTnkAdEVentListener() {
        return tnkAdEVentListener;
    }

    public final void logEvent(@NotNull String str, @NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        tnkAdEVentListener.onEvent(str, map);
    }

    public final void setEventListener(@NotNull TnkAdEVentListener tnkAdEVentListener2) {
        Intrinsics.checkNotNullParameter(tnkAdEVentListener2, "");
        tnkAdEVentListener = tnkAdEVentListener2;
    }

    public final void setTnkAdEVentListener(@NotNull TnkAdEVentListener tnkAdEVentListener2) {
        Intrinsics.checkNotNullParameter(tnkAdEVentListener2, "");
        tnkAdEVentListener = tnkAdEVentListener2;
    }
}
