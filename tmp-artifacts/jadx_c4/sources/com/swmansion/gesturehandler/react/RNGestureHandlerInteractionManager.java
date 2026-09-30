package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.getAdapterPosition;
import o.getBindingAdapter;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerInteractionManager implements getAdapterPosition {
    public static final Companion Companion = new Companion(null);
    private final SparseArray<int[]> IAuthTabCallback = new SparseArray<>();
    private final SparseArray<int[]> onExtraCallbackWithResult = new SparseArray<>();
    private final SparseArray<int[]> onWarmupCompleted = new SparseArray<>();

    public final void IAuthTabCallback(int i) {
        this.IAuthTabCallback.remove(i);
        this.onExtraCallbackWithResult.remove(i);
    }

    private final int[] IAuthTabCallback(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        Intrinsics.checkNotNull(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public final void onNavigationEvent(@NotNull addChangePayload addchangepayload, @NotNull ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        addchangepayload.onExtraCallback(this);
        if (readableMap.hasKey("waitFor")) {
            this.IAuthTabCallback.put(addchangepayload.onUnminimized(), IAuthTabCallback(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.onExtraCallbackWithResult.put(addchangepayload.onUnminimized(), IAuthTabCallback(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.onWarmupCompleted.put(addchangepayload.onUnminimized(), IAuthTabCallback(readableMap, "blocksHandlers"));
        }
    }

    @Override // o.getAdapterPosition
    public boolean onExtraCallback(@NotNull addChangePayload addchangepayload, @NotNull addChangePayload addchangepayload2) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Intrinsics.checkNotNullParameter(addchangepayload2, "");
        int[] iArr = this.IAuthTabCallback.get(addchangepayload.onUnminimized());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == addchangepayload2.onUnminimized()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.getAdapterPosition
    public boolean onWarmupCompleted(@NotNull addChangePayload addchangepayload, @NotNull addChangePayload addchangepayload2) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Intrinsics.checkNotNullParameter(addchangepayload2, "");
        int[] iArr = this.onWarmupCompleted.get(addchangepayload.onUnminimized());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == addchangepayload2.onUnminimized()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.getAdapterPosition
    public boolean onExtraCallbackWithResult(@NotNull addChangePayload addchangepayload, @NotNull addChangePayload addchangepayload2) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Intrinsics.checkNotNullParameter(addchangepayload2, "");
        if (addchangepayload2 instanceof getBindingAdapter) {
            return ((getBindingAdapter) addchangepayload2).postMessage();
        }
        return addchangepayload2 instanceof RNGestureHandlerRootHelper.RootViewGestureHandler;
    }

    @Override // o.getAdapterPosition
    public boolean onNavigationEvent(@NotNull addChangePayload addchangepayload, @NotNull addChangePayload addchangepayload2) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        Intrinsics.checkNotNullParameter(addchangepayload2, "");
        int[] iArr = this.onExtraCallbackWithResult.get(addchangepayload.onUnminimized());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == addchangepayload2.onUnminimized()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onWarmupCompleted() {
        this.IAuthTabCallback.clear();
        this.onExtraCallbackWithResult.clear();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
