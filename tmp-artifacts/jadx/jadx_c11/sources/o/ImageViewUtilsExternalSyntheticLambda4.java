package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ImageViewUtilsExternalSyntheticLambda4 implements ImageViewUtilsExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageViewUtilsExternalSyntheticLambda4() {
        setImageUri setimageuri = null;
        this(setimageuri, 1, setimageuri);
    }

    public ImageViewUtilsExternalSyntheticLambda4(@NotNull setImageUri setimageuri) {
        Intrinsics.checkNotNullParameter(setimageuri, "");
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setimageuri, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageViewUtilsExternalSyntheticLambda4(setImageUri setimageuri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                setimageuri = setImageUri.SUMMARY;
                int i3 = IAuthTabCallback + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                setImageUri setimageuri2 = setImageUri.SUMMARY;
                throw null;
            }
        }
        this(setimageuri);
    }

    @Override // o.ImageViewUtilsExternalSyntheticLambda3
    public setImageUri onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setImageUri setimageuriOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return setimageuriOnExtraCallback;
        }
        throw null;
    }

    @Override // o.ImageViewUtilsExternalSyntheticLambda3
    public void onNavigationEvent(@NotNull setImageUri setimageuri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setimageuri, "");
        IAuthTabCallback(setimageuri);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final setImageUri onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setImageUri setimageuri = (setImageUri) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setimageuri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(setImageUri setimageuri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(setimageuri);
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
