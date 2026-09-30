package o;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onLeftHiddenState extends isScrap<getBindingAdapter> {
    private final boolean onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onLeftHiddenState(@NotNull getBindingAdapter getbindingadapter) {
        super(getbindingadapter);
        Intrinsics.checkNotNullParameter(getbindingadapter, "");
        this.onNavigationEvent = getbindingadapter.extraCommand();
    }

    @Override // o.isScrap
    public void onNavigationEvent(@NotNull WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(writableMap, "");
        super.onNavigationEvent(writableMap);
        writableMap.putBoolean("pointerInside", this.onNavigationEvent);
    }
}
