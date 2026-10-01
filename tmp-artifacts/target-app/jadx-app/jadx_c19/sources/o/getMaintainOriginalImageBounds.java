package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getMaintainOriginalImageBounds {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ List IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, float f, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback;
        int i6 = i5 + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0 ? (i3 & 2) != 0 : (i3 & 2) != 0) {
            int i7 = i5 + 25;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 4;
            }
            i2 = 0;
        }
        return onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, f, i2);
    }

    public static /* synthetic */ float onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 109;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        if (i5 % 2 == 0 ? (i3 & 2) != 0 : (i3 & 3) != 0) {
            int i7 = i6 + 99;
            int i8 = i7 % 128;
            onExtraCallback = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 83;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i2 = 0;
        }
        return IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, camera2CameraControlExternalSyntheticLambda7, i2);
    }

    public static final float IAuthTabCallback(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7, int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda7, "");
        int iMax = Math.max(0, camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().IAuthTabCallbackDefault() - camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted());
        int iMax2 = Math.max(0, ((camera2CameraControlExternalSyntheticLambda7.onWarmupCompleted() + camera2CameraControlExternalSyntheticLambda7.onNavigationEvent()) - camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().asInterface()) + i2);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Float.valueOf(Math.max(0.0f, 100.0f - (((iMax + iMax2) * 100.0f) / camera2CameraControlExternalSyntheticLambda7.onNavigationEvent())) / 100.0f));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Float f = (Float) obj;
        if (f == null) {
            return 0.0f;
        }
        float fFloatValue = f.floatValue();
        int i6 = onExtraCallbackWithResult + 85;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return fFloatValue;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Camera2CameraControlExternalSyntheticLambda7 camera2CameraControlExternalSyntheticLambda7 = (Camera2CameraControlExternalSyntheticLambda7) CollectionsKt.lastOrNull(camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact());
        if (camera2CameraControlExternalSyntheticLambda7 != null) {
            int i3 = onExtraCallbackWithResult + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0 ? camera2CameraControlExternalSyntheticLambda7.onExtraCallbackWithResult() == camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().IAuthTabCallback() - 1 : camera2CameraControlExternalSyntheticLambda7.onExtraCallbackWithResult() == camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().IAuthTabCallback()) {
                if (IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, camera2CameraControlExternalSyntheticLambda7, 0) == 1.0f) {
                    int i4 = onExtraCallbackWithResult + 49;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        return false;
    }

    public static final boolean onNavigationEvent(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            boolean z = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact() instanceof Collection;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
        if ((listOnTransact instanceof Collection) && listOnTransact.isEmpty()) {
            return false;
        }
        Iterator it = listOnTransact.iterator();
        while (it.hasNext()) {
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallback(), obj);
                obj2.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallback(), obj)) {
                return true;
            }
        }
        int i5 = onExtraCallback + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static final List<Camera2CameraControlExternalSyntheticLambda7> onWarmupCompleted(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, float f, int i2) {
        Object next;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnTransact.iterator();
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            int i6 = onExtraCallback + 3;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                next = it.next();
                int i7 = 76 / 0;
                if (IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (Camera2CameraControlExternalSyntheticLambda7) next, i2) >= f) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (Camera2CameraControlExternalSyntheticLambda7) next, i2) >= f) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
