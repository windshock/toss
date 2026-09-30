package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setViewableMRC100Requests {
    private static int asBinder = 1;
    private static int asInterface;
    private final long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onTransact;
    private final long onWarmupCompleted;

    public /* synthetic */ setViewableMRC100Requests(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    private setViewableMRC100Requests(long j, long j2, long j3, long j4, long j5, long j6) {
        this.onTransact = j;
        this.onWarmupCompleted = j2;
        this.IAuthTabCallback = j3;
        this.onExtraCallbackWithResult = j4;
        this.onExtraCallback = j5;
        this.onNavigationEvent = j6;
    }

    public static /* synthetic */ setViewableMRC100Requests onExtraCallback(setViewableMRC100Requests setviewablemrc100requests, long j, long j2, long j3, long j4, long j5, long j6, int i, Object obj) {
        long j7;
        long j8;
        long j9;
        long j10;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asInterface + 79;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            j7 = setviewablemrc100requests.onTransact;
        } else {
            j7 = j;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = asBinder + 107;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                long j11 = setviewablemrc100requests.onWarmupCompleted;
                obj2.hashCode();
                throw null;
            }
            j8 = setviewablemrc100requests.onWarmupCompleted;
        } else {
            j8 = j2;
        }
        if ((i & 4) != 0) {
            int i6 = asBinder + 125;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                long j12 = setviewablemrc100requests.IAuthTabCallback;
                obj2.hashCode();
                throw null;
            }
            j9 = setviewablemrc100requests.IAuthTabCallback;
        } else {
            j9 = j3;
        }
        if ((i & 8) != 0) {
            int i7 = asInterface + 91;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            j10 = setviewablemrc100requests.onExtraCallbackWithResult;
        } else {
            j10 = j4;
        }
        return setviewablemrc100requests.IAuthTabCallback(j7, j8, j9, j10, (i & 16) != 0 ? setviewablemrc100requests.onExtraCallback : j5, (i & 32) != 0 ? setviewablemrc100requests.onNavigationEvent : j6);
    }

    public final setViewableMRC100Requests IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7;
        long j8;
        long j9;
        int i = 2 % 2;
        if (j == 16) {
            int i2 = asBinder + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            j7 = this.onTransact;
        } else {
            j7 = j;
        }
        long j10 = j2 == 16 ? this.onWarmupCompleted : j2;
        if (j3 == 16) {
            int i4 = asInterface + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            j8 = this.IAuthTabCallback;
        } else {
            j8 = j3;
        }
        long j11 = j4 == 16 ? this.onExtraCallbackWithResult : j4;
        long j12 = j5 == 16 ? this.onExtraCallback : j5;
        if (j6 == 16) {
            int i6 = asBinder + 125;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            j9 = this.onNavigationEvent;
        } else {
            j9 = j6;
        }
        setViewableMRC100Requests setviewablemrc100requests = new setViewableMRC100Requests(j7, j10, j8, j11, j12, j9, null);
        int i8 = asBinder + 103;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return setviewablemrc100requests;
        }
        throw null;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallbackWithResult(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = asInterface + 61;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1976456962, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Colors.tintColor (TdsIconButtonV1.kt:293)");
                int i5 = 43 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1976456962, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Colors.tintColor (TdsIconButtonV1.kt:293)");
            }
        }
        if (!(!z)) {
            int i6 = asInterface + 97;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            j = this.onWarmupCompleted;
        } else {
            j = this.onTransact;
            int i8 = asInterface + 103;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, IAuthTabCallback(z), "tintColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 8);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = asBinder + 71;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i11 != 0) {
                int i12 = 51 / 0;
            }
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallback(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = asBinder + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(706161835, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Colors.backgroundColor (TdsIconButtonV1.kt:302)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(z ? this.onExtraCallbackWithResult : this.IAuthTabCallback, IAuthTabCallback(z), "backgroundColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 8);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = asBinder + 99;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long j;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = asBinder + 61;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1193531501, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Colors.borderColor (TdsIconButtonV1.kt:311)");
            int i8 = asInterface + 39;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = asInterface;
            int i11 = i10 + 7;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            j = this.onNavigationEvent;
            i2 = i10 + 39;
        } else {
            j = this.onExtraCallback;
            i2 = asInterface + 73;
        }
        asBinder = i2 % 128;
        int i13 = i2 % 2;
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = updateSubmitButton.onExtraCallback(j, IAuthTabCallback(z), "borderColor", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 8);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    private final onItemClicked<setByteOrder> IAuthTabCallback(boolean z) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 17;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.asBinder();
            i = asInterface + 81;
        } else {
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
            i = asInterface + 125;
        }
        asBinder = i % 128;
        int i4 = i % 2;
        return getSplitTrack.onExtraCallback(getstarratingcontentviewgroupOnExtraCallbackWithResult, 0, 2, (Object) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(setViewableMRC100Requests.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        setViewableMRC100Requests setviewablemrc100requests = (setViewableMRC100Requests) obj;
        if (!setByteOrder.onExtraCallbackWithResult(this.onTransact, setviewablemrc100requests.onTransact)) {
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, setviewablemrc100requests.onWarmupCompleted)) {
            int i2 = asBinder + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, setviewablemrc100requests.IAuthTabCallback)) {
            int i4 = asInterface + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, setviewablemrc100requests.onExtraCallbackWithResult) || !setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, setviewablemrc100requests.onExtraCallback)) {
            return false;
        }
        if (setByteOrder.onExtraCallbackWithResult(this.onNavigationEvent, setviewablemrc100requests.onNavigationEvent)) {
            return true;
        }
        int i6 = asInterface;
        int i7 = i6 + 97;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 73;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = setByteOrder.onTransact(this.onTransact);
        int iOnTransact2 = setByteOrder.onTransact(this.onWarmupCompleted);
        int iOnTransact3 = setByteOrder.onTransact(this.IAuthTabCallback);
        int iOnTransact4 = (((((((((iOnTransact * 31) + iOnTransact2) * 31) + iOnTransact3) * 31) + setByteOrder.onTransact(this.onExtraCallbackWithResult)) * 31) + setByteOrder.onTransact(this.onExtraCallback)) * 31) + setByteOrder.onTransact(this.onNavigationEvent);
        int i4 = asBinder + 33;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnTransact4;
        }
        throw null;
    }
}
