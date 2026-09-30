package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFg1kSDKAFa1ySDK extends SupportedOutputSizesSorterLegacy<AFg1lSDK> {
    private static int asBinder = 1;
    private static int asInterface;
    private final Function1<Object, Unit> IAuthTabCallback;
    private final AFg1qSDK IAuthTabCallbackStub;
    private final float onExtraCallback;
    private final Function1<Object, Unit> onExtraCallbackWithResult;
    private final Function2<Object, setUseCaseAttached, Unit> onNavigationEvent;
    private final Function0<Boolean> onWarmupCompleted;

    public /* synthetic */ AFg1kSDKAFa1ySDK(AFg1qSDK aFg1qSDK, float f, Function0 function0, Function2 function2, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFg1qSDK, f, function0, function2, function1, function12);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1kSDKAFa1ySDK)) {
            int i5 = i2 + 29;
            asInterface = i5 % 128;
            return i5 % 2 != 0;
        }
        AFg1kSDKAFa1ySDK aFg1kSDKAFa1ySDK = (AFg1kSDKAFa1ySDK) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, aFg1kSDKAFa1ySDK.IAuthTabCallbackStub)) {
            return false;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, aFg1kSDKAFa1ySDK.onExtraCallback)) {
            int i6 = asBinder + 111;
            int i7 = i6 % 128;
            asInterface = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 65;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, aFg1kSDKAFa1ySDK.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, aFg1kSDKAFa1ySDK.onNavigationEvent)) {
            int i11 = asBinder + 95;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, aFg1kSDKAFa1ySDK.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, aFg1kSDKAFa1ySDK.onExtraCallbackWithResult)) {
            return true;
        }
        int i13 = asInterface + 63;
        asBinder = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.IAuthTabCallbackStub.hashCode() * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = asInterface + 89;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DragAndDropContainerElement(state=" + this.IAuthTabCallbackStub + ", dragSlop=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ", canStartDrag=" + this.onWarmupCompleted + ", onLongPress=" + this.onNavigationEvent + ", onLongPressRelease=" + this.IAuthTabCallback + ", onDragStart=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private AFg1kSDKAFa1ySDK(AFg1qSDK aFg1qSDK, float f, Function0<Boolean> function0, Function2<Object, ? super setUseCaseAttached, Unit> function2, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.IAuthTabCallbackStub = aFg1qSDK;
        this.onExtraCallback = f;
        this.onWarmupCompleted = function0;
        this.onNavigationEvent = function2;
        this.IAuthTabCallback = function1;
        this.onExtraCallbackWithResult = function12;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AFg1lSDK aFg1lSDKOnExtraCallback = onExtraCallback();
        int i4 = asInterface + 17;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return aFg1lSDKOnExtraCallback;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((AFg1lSDK) onwarmupcompleted);
        int i4 = asInterface + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public AFg1lSDK onExtraCallback() {
        int i = 2 % 2;
        AFg1lSDK aFg1lSDK = new AFg1lSDK(this.IAuthTabCallbackStub, this.onExtraCallback, this.onWarmupCompleted, this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult, null);
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return aFg1lSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull AFg1lSDK aFg1lSDK) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFg1lSDK, "");
        aFg1lSDK.onNavigationEvent(this.IAuthTabCallbackStub, this.onExtraCallback, this.onWarmupCompleted, this.onNavigationEvent, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        int i4 = asInterface + 89;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
