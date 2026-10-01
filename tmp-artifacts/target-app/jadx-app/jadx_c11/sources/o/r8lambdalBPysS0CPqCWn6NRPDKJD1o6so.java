package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdalBPysS0CPqCWn6NRPDKJD1o6so {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private final int IAuthTabCallback;
    private final boolean onExtraCallback;
    private final QuirkSettingsLoader.onNavigationEvent onNavigationEvent;
    private final float onWarmupCompleted;

    public /* synthetic */ r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(QuirkSettingsLoader.onNavigationEvent onnavigationevent, boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onnavigationevent, z, f, i);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdalBPysS0CPqCWn6NRPDKJD1o6so)) {
            return false;
        }
        r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6so = (r8lambdalBPysS0CPqCWn6NRPDKJD1o6so) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onNavigationEvent)) {
            int i4 = IAuthTabCallbackDefault + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallback == r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onExtraCallback) {
            return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onWarmupCompleted) && this.IAuthTabCallback == r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.IAuthTabCallback;
        }
        int i6 = IAuthTabCallbackDefault + 7;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? ((((this.onNavigationEvent.hashCode() >> 77) + Boolean.hashCode(this.onExtraCallback)) - 101) / VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) / 33 : ((((this.onNavigationEvent.hashCode() * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.IAuthTabCallback);
        int i3 = IAuthTabCallbackDefault + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProgressStepperStepLayout(horizontalAlignment=" + this.onNavigationEvent + ", fillLabelWidth=" + this.onExtraCallback + ", labelHorizontalPadding=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted) + ", totalSteps=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(QuirkSettingsLoader.onNavigationEvent onnavigationevent, boolean z, float f, int i) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onNavigationEvent = onnavigationevent;
        this.onExtraCallback = z;
        this.onWarmupCompleted = f;
        this.IAuthTabCallback = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(QuirkSettingsLoader.onNavigationEvent onnavigationevent, boolean z, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = (i2 & 1) != 0 ? QuirkSettingsLoader.Companion.onTransact() : onnavigationevent;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i6 = onExtraCallbackWithResult + 33;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            int i9 = IAuthTabCallbackDefault + 65;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        this(onnavigationeventOnTransact, z2, f2, i3, null);
    }

    public final QuirkSettingsLoader.onNavigationEvent onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        QuirkSettingsLoader.onNavigationEvent onnavigationevent = this.onNavigationEvent;
        int i4 = i2 + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return onnavigationevent;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        float f = this.onWarmupCompleted;
        int i5 = i3 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 101;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
