package o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.notifyAnrDetected;
import o.performOneTimeSetup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class notifyAnrDetected implements disableAnrReporting<performOneTimeSetup> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Function1<performOneTimeSetup, Unit> onExtraCallbackWithResult;
    private final List<performOneTimeSetup> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(performonetimesetup);
        }
        onExtraCallback(performonetimesetup);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifyAnrDetected)) {
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        notifyAnrDetected notifyanrdetected = (notifyAnrDetected) obj;
        if (Intrinsics.areEqual(this.onWarmupCompleted, notifyanrdetected.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, notifyanrdetected.onExtraCallbackWithResult);
        }
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsMenuV1MenuGroup(items=" + this.onWarmupCompleted + ", onClicked=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public notifyAnrDetected(@NotNull List<performOneTimeSetup> list, @NotNull Function1<? super performOneTimeSetup, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = list;
        this.onExtraCallbackWithResult = function1;
    }

    @Override // o.disableAnrReporting
    public List<performOneTimeSetup> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<performOneTimeSetup> list = this.onWarmupCompleted;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public /* synthetic */ notifyAnrDetected(List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: im.toss.uikit.widget.menu.TdsMenuV1MenuGroup$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 43;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitIAuthTabCallback = notifyAnrDetected.IAuthTabCallback((performOneTimeSetup) obj);
                    int i5 = onExtraCallback + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            };
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list, function1);
    }

    private static final Unit onExtraCallback(performOneTimeSetup performonetimesetup) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(performonetimesetup, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function1<performOneTimeSetup, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Function1<performOneTimeSetup, Unit> function1 = this.onExtraCallbackWithResult;
        int i5 = i2 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }
}
