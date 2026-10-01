package com.swmansion.rnscreens;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.FabricUIManager;
import com.swmansion.rnscreens.NativeProxy$;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeProxy {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<Integer, WeakReference<Screen>> viewsMap = new ConcurrentHashMap<>();
    private final HybridData mHybridData = initHybrid();

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    public final native void cleanupExpiredMountingCoordinators();

    public final native void invalidateNative();

    public final native void nativeAddMutationsListener(@NotNull FabricUIManager fabricUIManager);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void addScreenToMap(int i, @NotNull Screen screen) {
            Intrinsics.checkNotNullParameter(screen, "");
            NativeProxy.viewsMap.put(Integer.valueOf(i), new WeakReference(screen));
        }

        public final void removeScreenFromMap(int i) {
            NativeProxy.viewsMap.remove(Integer.valueOf(i));
        }

        public final void clearMapOnInvalidate() {
            NativeProxy.viewsMap.clear();
        }
    }

    public final void notifyScreenRemoved(int i) {
        Screen screen;
        WeakReference<Screen> weakReference = viewsMap.get(Integer.valueOf(i));
        if (weakReference == null || (screen = weakReference.get()) == null) {
            return;
        }
        screen.post(new NativeProxy$.ExternalSyntheticLambda0(screen));
    }
}
