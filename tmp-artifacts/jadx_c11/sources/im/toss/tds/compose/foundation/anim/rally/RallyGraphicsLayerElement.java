package im.toss.tds.compose.foundation.anim.rally;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.SupportedOutputSizesSorterLegacy;
import o.flipHorizontally;
import o.setAdFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallyGraphicsLayerElement extends SupportedOutputSizesSorterLegacy<RallyGraphicsLayerModifier> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final Function1<flipHorizontally, Unit> IAuthTabCallback;
    private final setAdFormat onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof RallyGraphicsLayerElement)) {
            return false;
        }
        RallyGraphicsLayerElement rallyGraphicsLayerElement = (RallyGraphicsLayerElement) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, rallyGraphicsLayerElement.onNavigationEvent)) {
            int i3 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, rallyGraphicsLayerElement.IAuthTabCallback)) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        Function1<flipHorizontally, Unit> function1 = this.IAuthTabCallback;
        if (function1 == null) {
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = function1.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RallyGraphicsLayerElement(target=" + this.onNavigationEvent + ", preGraphicsLayer=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RallyGraphicsLayerElement(@NotNull setAdFormat setadformat, @Nullable Function1<? super flipHorizontally, Unit> function1) {
        Intrinsics.checkNotNullParameter(setadformat, "");
        this.onNavigationEvent = setadformat;
        this.IAuthTabCallback = function1;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((RallyGraphicsLayerModifier) onwarmupcompleted);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public RallyGraphicsLayerModifier onExtraCallbackWithResult() {
        int i = 2 % 2;
        RallyGraphicsLayerModifier rallyGraphicsLayerModifier = new RallyGraphicsLayerModifier(this.onNavigationEvent, this.IAuthTabCallback);
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return rallyGraphicsLayerModifier;
    }

    public void IAuthTabCallback(@NotNull RallyGraphicsLayerModifier rallyGraphicsLayerModifier) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rallyGraphicsLayerModifier, "");
        rallyGraphicsLayerModifier.onWarmupCompleted(this.onNavigationEvent);
        rallyGraphicsLayerModifier.IAuthTabCallbackDefault();
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
    }
}
