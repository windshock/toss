package im.toss.tds.compose.component.compound;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoveCompoundPaddings {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final boolean IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final boolean asInterface;
    private final boolean onNavigationEvent;
    public static final Companion Companion = new Companion(null);
    private static final RemoveCompoundPaddings onExtraCallback = new RemoveCompoundPaddings(false, false);
    private static final RemoveCompoundPaddings onExtraCallbackWithResult = new RemoveCompoundPaddings(true, false);
    private static final RemoveCompoundPaddings onWarmupCompleted = new RemoveCompoundPaddings(false, true);
    private static final RemoveCompoundPaddings IAuthTabCallback = new RemoveCompoundPaddings(true, true);

    public static /* synthetic */ RemoveCompoundPaddings onExtraCallback(RemoveCompoundPaddings removeCompoundPaddings, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            z = removeCompoundPaddings.IAuthTabCallbackDefault;
        }
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z2 = removeCompoundPaddings.IAuthTabCallbackStub;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 119;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z5 = removeCompoundPaddings.asInterface;
                throw null;
            }
            z3 = removeCompoundPaddings.asInterface;
        }
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallbackStubProxy;
            int i7 = i6 + 51;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            boolean z6 = removeCompoundPaddings.onNavigationEvent;
            int i9 = i6 + 43;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            z4 = z6;
        }
        return removeCompoundPaddings.onWarmupCompleted(z, z2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveCompoundPaddings)) {
            return false;
        }
        RemoveCompoundPaddings removeCompoundPaddings = (RemoveCompoundPaddings) obj;
        if (this.IAuthTabCallbackDefault != removeCompoundPaddings.IAuthTabCallbackDefault) {
            int i2 = IAuthTabCallbackStubProxy + 17;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStub != removeCompoundPaddings.IAuthTabCallbackStub) {
            int i4 = IAuthTabCallbackStubProxy + 43;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.asInterface != removeCompoundPaddings.asInterface) {
            int i6 = IAuthTabCallbackStubProxy + 57;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onNavigationEvent == removeCompoundPaddings.onNavigationEvent) {
            return true;
        }
        int i8 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Boolean.hashCode(this.IAuthTabCallbackDefault) * 31) + Boolean.hashCode(this.IAuthTabCallbackStub)) * 31) + Boolean.hashCode(this.asInterface)) * 31) + Boolean.hashCode(this.onNavigationEvent);
        int i4 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final RemoveCompoundPaddings onWarmupCompleted(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = 2 % 2;
        RemoveCompoundPaddings removeCompoundPaddings = new RemoveCompoundPaddings(z, z2, z3, z4);
        int i2 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return removeCompoundPaddings;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoveCompoundPaddings(start=" + this.IAuthTabCallbackDefault + ", top=" + this.IAuthTabCallbackStub + ", end=" + this.asInterface + ", bottom=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemoveCompoundPaddings(boolean z, boolean z2, boolean z3, boolean z4) {
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallbackStub = z2;
        this.asInterface = z3;
        this.onNavigationEvent = z4;
    }

    public static final /* synthetic */ RemoveCompoundPaddings IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        RemoveCompoundPaddings removeCompoundPaddings = IAuthTabCallback;
        int i5 = i3 + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return removeCompoundPaddings;
    }

    public static final /* synthetic */ RemoveCompoundPaddings onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        RemoveCompoundPaddings removeCompoundPaddings = onExtraCallbackWithResult;
        int i5 = i2 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return removeCompoundPaddings;
    }

    public static final /* synthetic */ RemoveCompoundPaddings onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 17;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        RemoveCompoundPaddings removeCompoundPaddings = onExtraCallback;
        int i5 = i2 + 107;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return removeCompoundPaddings;
    }

    public static final /* synthetic */ RemoveCompoundPaddings onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 51;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        RemoveCompoundPaddings removeCompoundPaddings = onWarmupCompleted;
        int i5 = i2 + 77;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return removeCompoundPaddings;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        int i5 = i2 + 95;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 107;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asInterface;
        int i5 = i2 + 41;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public RemoveCompoundPaddings(boolean z, boolean z2) {
        this(z, z2, z, z2);
    }

    public RemoveCompoundPaddings(boolean z) {
        this(z, z, z, z);
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        if (!(!this.IAuthTabCallbackDefault)) {
            int i3 = IAuthTabCallback_Parcel + 71;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if (this.IAuthTabCallbackStub) {
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if (this.asInterface) {
            int i5 = IAuthTabCallback_Parcel + 79;
            IAuthTabCallbackStubProxy = i5 % 128;
            f3 = i5 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if (this.onNavigationEvent) {
            f4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback2, f, f2, f3, f4));
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RemoveCompoundPaddings IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RemoveCompoundPaddings removeCompoundPaddingsOnNavigationEvent = RemoveCompoundPaddings.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return removeCompoundPaddingsOnNavigationEvent;
            }
            throw null;
        }

        public final RemoveCompoundPaddings onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RemoveCompoundPaddings removeCompoundPaddingsOnExtraCallbackWithResult = RemoveCompoundPaddings.onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 21 / 0;
            }
            return removeCompoundPaddingsOnExtraCallbackWithResult;
        }

        public final RemoveCompoundPaddings onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return RemoveCompoundPaddings.onWarmupCompleted();
            }
            RemoveCompoundPaddings.onWarmupCompleted();
            throw null;
        }

        public final RemoveCompoundPaddings onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                RemoveCompoundPaddings.IAuthTabCallback();
                throw null;
            }
            RemoveCompoundPaddings removeCompoundPaddingsIAuthTabCallback = RemoveCompoundPaddings.IAuthTabCallback();
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return removeCompoundPaddingsIAuthTabCallback;
        }
    }

    static {
        int i = onTransact + 99;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }
}
