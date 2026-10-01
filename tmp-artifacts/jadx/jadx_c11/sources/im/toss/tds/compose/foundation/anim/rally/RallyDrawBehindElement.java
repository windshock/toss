package im.toss.tds.compose.foundation.anim.rally;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.SupportedOutputSizesSorterLegacy;
import o.setNativeAdView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallyDrawBehindElement extends SupportedOutputSizesSorterLegacy<RallyDrawBackgroundModifier> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final setNativeAdView onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof RallyDrawBehindElement))) {
            return Intrinsics.areEqual(this.onNavigationEvent, ((RallyDrawBehindElement) obj).onNavigationEvent);
        }
        int i5 = i3 + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RallyDrawBehindElement(target=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RallyDrawBehindElement(@NotNull setNativeAdView setnativeadview) {
        Intrinsics.checkNotNullParameter(setnativeadview, "");
        this.onNavigationEvent = setnativeadview;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RallyDrawBackgroundModifier rallyDrawBackgroundModifierIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return rallyDrawBackgroundModifierIAuthTabCallback;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((RallyDrawBackgroundModifier) onwarmupcompleted);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    public RallyDrawBackgroundModifier IAuthTabCallback() {
        int i = 2 % 2;
        RallyDrawBackgroundModifier rallyDrawBackgroundModifier = new RallyDrawBackgroundModifier(this.onNavigationEvent);
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return rallyDrawBackgroundModifier;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull RallyDrawBackgroundModifier rallyDrawBackgroundModifier) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rallyDrawBackgroundModifier, "");
        rallyDrawBackgroundModifier.onNavigationEvent(this.onNavigationEvent);
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
