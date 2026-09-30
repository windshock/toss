package o;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ALCCameraOnOutOfMemeoryErrorCallback;
import o.addMetadata;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addMetadata {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Provider<SessionTrackerb> onExtraCallbackWithResult;
    private final Provider<setAttachUserData> onNavigationEvent;
    private final Provider<ALCCameraOnOutOfMemeoryErrorCallback> onWarmupCompleted;

    public static /* synthetic */ ALCCameraOnOutOfMemeoryErrorCallback IAuthTabCallback(addMetadata addmetadata) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(addmetadata);
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return aLCCameraOnOutOfMemeoryErrorCallbackOnExtraCallbackWithResult;
    }

    public static /* synthetic */ IconRoundCornerProgressBar1 onExtraCallback(addMetadata addmetadata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(addmetadata);
        }
        onNavigationEvent(addmetadata);
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(addMetadata addmetadata) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(addmetadata);
        }
        IAuthTabCallbackStub(addmetadata);
        throw null;
    }

    @Inject
    public addMetadata(@NotNull Provider<SessionTrackerb> provider, @NotNull Provider<ALCCameraOnOutOfMemeoryErrorCallback> provider2, @NotNull Provider<setAttachUserData> provider3) {
        Intrinsics.checkNotNullParameter(provider, "");
        Intrinsics.checkNotNullParameter(provider2, "");
        Intrinsics.checkNotNullParameter(provider3, "");
        this.onExtraCallbackWithResult = provider;
        this.onWarmupCompleted = provider2;
        this.onNavigationEvent = provider3;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        drawTopText.Companion.onNavigationEvent(new Function0() { // from class: im.toss.webkit.TossWebKitInitializer$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                addMetadata addmetadata = this.f$0;
                if (i4 != 0) {
                    return addMetadata.onExtraCallback(addmetadata);
                }
                addMetadata.onExtraCallback(addmetadata);
                throw null;
            }
        }, new Function0() { // from class: im.toss.webkit.TossWebKitInitializer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallbackIAuthTabCallback = addMetadata.IAuthTabCallback(this.f$0);
                int i5 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return aLCCameraOnOutOfMemeoryErrorCallbackIAuthTabCallback;
                }
                throw null;
            }
        }, new Function0() { // from class: im.toss.webkit.TossWebKitInitializer$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                addMetadata addmetadata = this.f$0;
                if (i4 == 0) {
                    return addMetadata.onWarmupCompleted(addmetadata);
                }
                addMetadata.onWarmupCompleted(addmetadata);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final IconRoundCornerProgressBar1 onNavigationEvent(addMetadata addmetadata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IconRoundCornerProgressBar1 iconRoundCornerProgressBar1 = addmetadata.onExtraCallbackWithResult.get();
        Intrinsics.checkNotNullExpressionValue(iconRoundCornerProgressBar1, "");
        IconRoundCornerProgressBar1 iconRoundCornerProgressBar12 = iconRoundCornerProgressBar1;
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iconRoundCornerProgressBar12;
        }
        throw null;
    }

    private static final ALCCameraOnOutOfMemeoryErrorCallback onExtraCallbackWithResult(addMetadata addmetadata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallback = addmetadata.onWarmupCompleted.get();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(aLCCameraOnOutOfMemeoryErrorCallback, "");
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(aLCCameraOnOutOfMemeoryErrorCallback, "");
        ALCCameraOnOutOfMemeoryErrorCallback aLCCameraOnOutOfMemeoryErrorCallback2 = aLCCameraOnOutOfMemeoryErrorCallback;
        int i4 = IAuthTabCallback + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return aLCCameraOnOutOfMemeoryErrorCallback2;
    }

    private static final List IAuthTabCallbackStub(addMetadata addmetadata) {
        int i = 2 % 2;
        setAttachUserData setattachuserdata = addmetadata.onNavigationEvent.get();
        Intrinsics.checkNotNullExpressionValue(setattachuserdata, "");
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new addOnBreadcrumb(setattachuserdata));
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return listListOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
