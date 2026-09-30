package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidCursorHandle_androidKtExternalSyntheticLambda5 {
    public static final onNavigationEvent Companion;
    private static final AndroidCursorHandle_androidKtExternalSyntheticLambda5 IAuthTabCallback;
    public static final int onExtraCallbackWithResult = 8;
    private final float onExtraCallback;
    private final List<Integer> onNavigationEvent;

    public /* synthetic */ AndroidCursorHandle_androidKtExternalSyntheticLambda5(float f, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidCursorHandle_androidKtExternalSyntheticLambda5)) {
            return false;
        }
        AndroidCursorHandle_androidKtExternalSyntheticLambda5 androidCursorHandle_androidKtExternalSyntheticLambda5 = (AndroidCursorHandle_androidKtExternalSyntheticLambda5) obj;
        return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, androidCursorHandle_androidKtExternalSyntheticLambda5.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, androidCursorHandle_androidKtExternalSyntheticLambda5.onNavigationEvent);
    }

    public int hashCode() {
        return (VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        return "PaddingDimension(dp=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback)) + ", resourceIds=" + this.onNavigationEvent + ')';
    }

    private AndroidCursorHandle_androidKtExternalSyntheticLambda5(float f, List<Integer> list) {
        this.onExtraCallback = f;
        this.onNavigationEvent = list;
    }

    public final float onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final List<Integer> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final AndroidCursorHandle_androidKtExternalSyntheticLambda5 onExtraCallback(@NotNull AndroidCursorHandle_androidKtExternalSyntheticLambda5 androidCursorHandle_androidKtExternalSyntheticLambda5) {
        return new AndroidCursorHandle_androidKtExternalSyntheticLambda5(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.onExtraCallback + androidCursorHandle_androidKtExternalSyntheticLambda5.onExtraCallback), CollectionsKt.plus(this.onNavigationEvent, androidCursorHandle_androidKtExternalSyntheticLambda5.onNavigationEvent), null);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        IAuthTabCallback = new AndroidCursorHandle_androidKtExternalSyntheticLambda5(0.0f, defaultConstructorMarker, 3, defaultConstructorMarker);
    }

    public /* synthetic */ AndroidCursorHandle_androidKtExternalSyntheticLambda5(float f, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, null);
    }
}
