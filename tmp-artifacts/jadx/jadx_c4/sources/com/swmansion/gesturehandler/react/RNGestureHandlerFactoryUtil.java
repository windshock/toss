package com.swmansion.gesturehandler.react;

import com.swmansion.gesturehandler.core.RotationGestureHandler;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.addFlags;
import o.flagRemovedAndOffsetPosition;
import o.getBindingAdapter;
import o.getOldPosition;
import o.getUnmodifiedPayloads;
import o.hasAnyOfTheFlags;
import o.isInvalid;
import o.isRecyclable;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerFactoryUtil {
    public static final RNGestureHandlerFactoryUtil onExtraCallback = new RNGestureHandlerFactoryUtil();
    private static final addChangePayload.IAuthTabCallback<?>[] onExtraCallbackWithResult = {new getBindingAdapter.onNavigationEvent(), new isRecyclable.onExtraCallbackWithResult(), new getOldPosition.onWarmupCompleted(), new hasAnyOfTheFlags.onExtraCallback(), new isInvalid.onExtraCallbackWithResult(), new RotationGestureHandler.Factory(), new addFlags.onNavigationEvent(), new getUnmodifiedPayloads.onExtraCallback(), new flagRemovedAndOffsetPosition.onNavigationEvent()};

    private RNGestureHandlerFactoryUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends addChangePayload> addChangePayload.IAuthTabCallback<addChangePayload> onExtraCallback(@NotNull addChangePayload addchangepayload) {
        Intrinsics.checkNotNullParameter(addchangepayload, "");
        for (isRecyclable.onExtraCallbackWithResult onextracallbackwithresult : onExtraCallbackWithResult) {
            if (Intrinsics.areEqual(onextracallbackwithresult.onWarmupCompleted(), addchangepayload.getClass())) {
                return onextracallbackwithresult;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends addChangePayload> addChangePayload.IAuthTabCallback<addChangePayload> onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (isRecyclable.onExtraCallbackWithResult onextracallbackwithresult : onExtraCallbackWithResult) {
            if (Intrinsics.areEqual(onextracallbackwithresult.IAuthTabCallback(), str)) {
                return onextracallbackwithresult;
            }
        }
        return null;
    }
}
