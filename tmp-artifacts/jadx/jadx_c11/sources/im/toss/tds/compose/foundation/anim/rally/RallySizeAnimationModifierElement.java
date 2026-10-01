package im.toss.tds.compose.foundation.anim.rally;

import kotlin.jvm.internal.Intrinsics;
import o.MaxNativeAdLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SupportedOutputSizesSorterLegacy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallySizeAnimationModifierElement extends SupportedOutputSizesSorterLegacy<RallySizeAnimationModifierNode> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final MaxNativeAdLoader onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof RallySizeAnimationModifierElement)) {
            int i3 = onNavigationEvent + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((RallySizeAnimationModifierElement) obj).onExtraCallback)) {
            return true;
        }
        int i5 = onNavigationEvent + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RallySizeAnimationModifierElement(target=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RallySizeAnimationModifierElement(@NotNull MaxNativeAdLoader maxNativeAdLoader) {
        Intrinsics.checkNotNullParameter(maxNativeAdLoader, "");
        this.onExtraCallback = maxNativeAdLoader;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            throw null;
        }
        RallySizeAnimationModifierNode rallySizeAnimationModifierNodeIAuthTabCallback = IAuthTabCallback();
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return rallySizeAnimationModifierNodeIAuthTabCallback;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((RallySizeAnimationModifierNode) onwarmupcompleted);
        int i4 = onNavigationEvent + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public RallySizeAnimationModifierNode IAuthTabCallback() {
        int i = 2 % 2;
        RallySizeAnimationModifierNode rallySizeAnimationModifierNode = new RallySizeAnimationModifierNode(this.onExtraCallback);
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return rallySizeAnimationModifierNode;
    }

    public void onExtraCallbackWithResult(@NotNull RallySizeAnimationModifierNode rallySizeAnimationModifierNode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rallySizeAnimationModifierNode, "");
            rallySizeAnimationModifierNode.IAuthTabCallback(this.onExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(rallySizeAnimationModifierNode, "");
            rallySizeAnimationModifierNode.IAuthTabCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
