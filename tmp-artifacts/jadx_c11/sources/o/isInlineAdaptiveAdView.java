package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class isInlineAdaptiveAdView extends SupportedOutputSizesSorterLegacy<getVersionString> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof isInlineAdaptiveAdView) {
            return Intrinsics.areEqual(this.onWarmupCompleted, ((isInlineAdaptiveAdView) obj).onWarmupCompleted);
        }
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PassThroughPressElement(interactionSource=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isInlineAdaptiveAdView(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        this.onWarmupCompleted = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getVersionString getversionstringOnExtraCallback = onExtraCallback();
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return getversionstringOnExtraCallback;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((getVersionString) onwarmupcompleted);
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public getVersionString onExtraCallback() {
        int i = 2 % 2;
        getVersionString getversionstring = new getVersionString(this.onWarmupCompleted);
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return getversionstring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull getVersionString getversionstring) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getversionstring, "");
            getversionstring.onNavigationEvent(this.onWarmupCompleted);
        } else {
            Intrinsics.checkNotNullParameter(getversionstring, "");
            getversionstring.onNavigationEvent(this.onWarmupCompleted);
            throw null;
        }
    }
}
