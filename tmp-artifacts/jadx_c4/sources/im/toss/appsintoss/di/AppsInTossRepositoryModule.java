package im.toss.appsintoss.di;

import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.lang.reflect.Constructor;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityWindowInfoCallbackControllerExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EmbeddingAdapterExternalSyntheticLambda0;
import o.OverlayControlleroverlayInfo1ExternalSyntheticLambda0;
import o.OverlayControlleroverlayInfo1ExternalSyntheticLambda1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda0;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda2;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda3;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda5;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda6;
import o.SplitAttributesSplitTypeCompanionExternalSyntheticLambda0;
import o.WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossRepositoryModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final AppsInTossRepositoryModule onNavigationEvent = new AppsInTossRepositoryModule();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AppsInTossRepositoryModule() {
    }

    @Singleton
    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 IAuthTabCallback(@NotNull ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityWindowInfoCallbackControllerExternalSyntheticLambda0, "");
        EmbeddingAdapterExternalSyntheticLambda0 embeddingAdapterExternalSyntheticLambda0 = new EmbeddingAdapterExternalSyntheticLambda0(activityWindowInfoCallbackControllerExternalSyntheticLambda0);
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return embeddingAdapterExternalSyntheticLambda0;
    }

    @Singleton
    public final SafeWindowLayoutComponentProviderExternalSyntheticLambda4 onNavigationEvent(@NotNull WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1, @NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda6 safeWindowLayoutComponentProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda6, "");
        SafeWindowLayoutComponentProviderExternalSyntheticLambda3 safeWindowLayoutComponentProviderExternalSyntheticLambda3 = new SafeWindowLayoutComponentProviderExternalSyntheticLambda3(safeWindowLayoutComponentProviderExternalSyntheticLambda6, windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1);
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return safeWindowLayoutComponentProviderExternalSyntheticLambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final SafeWindowLayoutComponentProviderExternalSyntheticLambda2 IAuthTabCallback(@NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda5 safeWindowLayoutComponentProviderExternalSyntheticLambda5, @NotNull OverlayControlleroverlayInfo1ExternalSyntheticLambda1 overlayControlleroverlayInfo1ExternalSyntheticLambda1, @NotNull OverlayControlleroverlayInfo1ExternalSyntheticLambda0 overlayControlleroverlayInfo1ExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda5, "");
        Intrinsics.checkNotNullParameter(overlayControlleroverlayInfo1ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(overlayControlleroverlayInfo1ExternalSyntheticLambda0, "");
        try {
            Object[] objArr = {safeWindowLayoutComponentProviderExternalSyntheticLambda5, overlayControlleroverlayInfo1ExternalSyntheticLambda1, overlayControlleroverlayInfo1ExternalSyntheticLambda0};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(435938643);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 'k' - AndroidCharacter.getMirror('0'), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6383, 683350979, false, (String) null, new Class[]{SafeWindowLayoutComponentProviderExternalSyntheticLambda5.class, OverlayControlleroverlayInfo1ExternalSyntheticLambda1.class, OverlayControlleroverlayInfo1ExternalSyntheticLambda0.class});
            }
            SafeWindowLayoutComponentProviderExternalSyntheticLambda2 safeWindowLayoutComponentProviderExternalSyntheticLambda2 = (SafeWindowLayoutComponentProviderExternalSyntheticLambda2) ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return safeWindowLayoutComponentProviderExternalSyntheticLambda2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Singleton
    public final SafeWindowLayoutComponentProviderExternalSyntheticLambda0 onNavigationEvent(@NotNull SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 splitAttributesSplitTypeCompanionExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(splitAttributesSplitTypeCompanionExternalSyntheticLambda0, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9 safeActivityEmbeddingComponentProviderExternalSyntheticLambda9 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda9(splitAttributesSplitTypeCompanionExternalSyntheticLambda0);
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda9;
    }
}
