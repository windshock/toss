package o;

import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MiscObjectIdentifiers {
    public static final hasProvider onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onNavigationEvent(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(str, false, 1, (Object) null));
    }

    public static final hasProvider onNavigationEvent(@NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(spanned, "");
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        iAuthTabCallback.IAuthTabCallback(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, GraphicDeviceInfo.Companion.IAuthTabCallback(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, use.IAuthTabCallback(use.Companion.onExtraCallbackWithResult()), (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, GraphicDeviceInfo.Companion.IAuthTabCallback(), use.IAuthTabCallback(use.Companion.onExtraCallbackWithResult()), (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.IAuthTabCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (obj instanceof StrikethroughSpan) {
                iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.onExtraCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61439, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(ByteOrderedDataOutputStream.onExtraCallback(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null), spanStart, spanEnd);
            }
        }
        return iAuthTabCallback.onExtraCallbackWithResult();
    }
}
