package o;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdService {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[accessgetINSTANCEScp.values().length];
            try {
                iArr[accessgetINSTANCEScp.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetINSTANCEScp.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetINSTANCEScp.MediumDown.ordinal()] = 3;
                int i = onExtraCallback + 107;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 4 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[accessgetINSTANCEScp.MediumUp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[accessgetINSTANCEScp.Small.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[accessgetINSTANCEScp.TinyDown.ordinal()] = 6;
                int i4 = IAuthTabCallback + 103;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[accessgetINSTANCEScp.TinyUp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[accessgetINSTANCEScp.WeakDown.ordinal()] = 8;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[accessgetINSTANCEScp.WeakUp.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[accessgetINSTANCEScp.XSmall.ordinal()] = 10;
                int i8 = onExtraCallback + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final MappingRedirectableLiveDataExternalSyntheticLambda1 IAuthTabCallback(@NotNull MaxRecyclerAdaptera maxRecyclerAdaptera, @NotNull accessgetINSTANCEScp accessgetinstancescp, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRecyclerAdaptera, "");
        Intrinsics.checkNotNullParameter(accessgetinstancescp, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(724021668, i, -1, "im.toss.tds.compose.foundation.token.fromToken (TdsShadowExtensions.kt:18)");
        }
        switch (onWarmupCompleted.onWarmupCompleted[accessgetinstancescp.ordinal()]) {
            case 1:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.onExtraCallback();
                break;
            case 2:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.onWarmupCompleted();
                int i5 = onNavigationEvent + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                break;
            case 3:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.IAuthTabCallback();
                break;
            case 4:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.onExtraCallbackWithResult();
                break;
            case 5:
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = (MappingRedirectableLiveDataExternalSyntheticLambda1) MaxRecyclerAdaptera.onNavigationEvent(new Object[]{maxRecyclerAdaptera}, 2123375867, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2123375866, zzgc.onExtraCallbackWithResult());
                break;
            case 6:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.IAuthTabCallbackStub();
                break;
            case 7:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.IAuthTabCallbackDefault();
                break;
            case 8:
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = (MappingRedirectableLiveDataExternalSyntheticLambda1) MaxRecyclerAdaptera.onNavigationEvent(new Object[]{maxRecyclerAdaptera}, 125729606, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -125729606, zzgc.onExtraCallbackWithResult());
                break;
            case 9:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.asBinder();
                break;
            case 10:
                mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback = maxRecyclerAdaptera.onTransact();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallback;
    }

    public static final MappingRedirectableLiveDataExternalSyntheticLambda1 onWarmupCompleted(@NotNull accessgetINSTANCEScp accessgetinstancescp, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgetinstancescp, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(272725822, i, -1, "im.toss.tds.compose.foundation.token.<get-value> (TdsShadowExtensions.kt:38)");
            if (i4 == 0) {
                int i5 = 67 / 0;
            }
        }
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(y3ExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6), accessgetinstancescp, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onExtraCallback + 77;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return mappingRedirectableLiveDataExternalSyntheticLambda1IAuthTabCallback;
    }
}
