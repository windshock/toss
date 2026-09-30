package im.toss.appsintoss.di;

import im.toss.appsintoss.iap.usecase.RequestRefundIAPPurchasedItemUseCase;
import kotlin.jvm.internal.Intrinsics;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda6;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda0;
import o.SplitControllersplitInfoList1ExternalSyntheticLambda1;
import o.WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossUseCaseModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final AppsInTossUseCaseModule onWarmupCompleted = new AppsInTossUseCaseModule();

    static {
        int i = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AppsInTossUseCaseModule() {
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 onExtraCallback(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
    }

    public final SplitControllersplitInfoList1ExternalSyntheticLambda1 IAuthTabCallbackDefault(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SplitControllersplitInfoList1ExternalSyntheticLambda1 splitControllersplitInfoList1ExternalSyntheticLambda1 = new SplitControllersplitInfoList1ExternalSyntheticLambda1(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return splitControllersplitInfoList1ExternalSyntheticLambda1;
    }

    public final SafeWindowLayoutComponentProviderExternalSyntheticLambda6 onExtraCallbackWithResult(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SafeWindowLayoutComponentProviderExternalSyntheticLambda6 safeWindowLayoutComponentProviderExternalSyntheticLambda6 = new SafeWindowLayoutComponentProviderExternalSyntheticLambda6(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda6;
    }

    public final WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 onWarmupCompleted(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 = new WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 asBinder(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 safeActivityEmbeddingComponentProviderExternalSyntheticLambda8 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda8;
        }
        throw null;
    }

    public final SplitControllersplitInfoList1ExternalSyntheticLambda0 IAuthTabCallbackStub(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SplitControllersplitInfoList1ExternalSyntheticLambda0 splitControllersplitInfoList1ExternalSyntheticLambda0 = new SplitControllersplitInfoList1ExternalSyntheticLambda0(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return splitControllersplitInfoList1ExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 onNavigationEvent(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RequestRefundIAPPurchasedItemUseCase onTransact(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCase = new RequestRefundIAPPurchasedItemUseCase(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return requestRefundIAPPurchasedItemUseCase;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 IAuthTabCallback(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7 safeActivityEmbeddingComponentProviderExternalSyntheticLambda7 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda7(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43);
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
