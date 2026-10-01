package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class baseline extends lt10<jni_YGNodeStyleSetMinWidthJNI> {
    private final replaceChild onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baseline(@NotNull replaceChild replacechild) {
        super(jni_YGNodeStyleSetMinWidthPercentJNI.onNavigationEvent.onNavigationEvent(), replacechild.onExtraCallback(), "dayOfWeekName");
        Intrinsics.checkNotNullParameter(replacechild, "");
        this.onNavigationEvent = replacechild;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof baseline) && Intrinsics.areEqual(this.onNavigationEvent.onExtraCallback(), ((baseline) obj).onNavigationEvent.onExtraCallback());
    }

    public int hashCode() {
        return this.onNavigationEvent.onExtraCallback().hashCode();
    }
}
