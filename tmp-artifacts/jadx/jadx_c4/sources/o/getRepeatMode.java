package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getRepeatMode;
import o.pauseAnimation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRepeatMode {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[pauseAnimation.onExtraCallbackWithResult.values().length];
            try {
                iArr[pauseAnimation.onExtraCallbackWithResult.Row1A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pauseAnimation.onExtraCallbackWithResult.Row1B.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pauseAnimation.onExtraCallbackWithResult.Row2A.ordinal()] = 3;
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pauseAnimation.onExtraCallbackWithResult.Row2B.ordinal()] = 4;
                int i5 = IAuthTabCallback + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallback = iArr;
        }
    }

    private static final Unit IAuthTabCallback(String str, pauseAnimation.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(str, onextracallbackwithresult, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ TdsListHeaderV2View onExtraCallbackWithResult(TdsListHeaderV2View.onExtraCallback onextracallback, String str, Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsListHeaderV2View tdsListHeaderV2ViewOnWarmupCompleted = onWarmupCompleted(onextracallback, str, context);
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsListHeaderV2ViewOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsListHeaderV2View.onExtraCallback onextracallback, TdsListHeaderV2View tdsListHeaderV2View) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallback, tdsListHeaderV2View);
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, pauseAnimation.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return IAuthTabCallback(str, onextracallbackwithresult, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(str, onextracallbackwithresult, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final TdsListHeaderV2View onWarmupCompleted(TdsListHeaderV2View.onExtraCallback onextracallback, String str, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsListHeaderV2View tdsListHeaderV2View = new TdsListHeaderV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsListHeaderV2View.setHeaderType(onextracallback);
        tdsListHeaderV2View.setTitle(str);
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return tdsListHeaderV2View;
    }

    private static final Unit onExtraCallback(TdsListHeaderV2View.onExtraCallback onextracallback, TdsListHeaderV2View tdsListHeaderV2View) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsListHeaderV2View, "");
            tdsListHeaderV2View.setHeaderType(onextracallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsListHeaderV2View, "");
        tdsListHeaderV2View.setHeaderType(onextracallback);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final pauseAnimation.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        boolean z;
        final TdsListHeaderV2View.onExtraCallback onextracallback;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-764235237);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onNavigationEvent + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal()) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            int i9 = onNavigationEvent + 47;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i11 = onExtraCallback + 117;
                onNavigationEvent = i11 % 128;
                i4 = i11 % 2 == 0 ? 7719 : 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            int i12 = onNavigationEvent + 65;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (i8 != 0) {
                int i14 = onNavigationEvent + 77;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                    int i15 = 29 / 0;
                } else {
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-764235237, i3, -1, "im.toss.compose.v0.TdsListHeaderV2 (ListHeader.kt:22)");
            }
            int i16 = onWarmupCompleted.onExtraCallback[onextracallbackwithresult.ordinal()];
            if (i16 != 1) {
                int i17 = onExtraCallback;
                int i18 = i17 + 123;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 != 0 ? i16 == 2 : i16 == 2) {
                    onextracallback = TdsListHeaderV2View.onExtraCallback.ROW1B;
                } else if (i16 != 3) {
                    int i19 = i17 + 19;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    if (i16 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onextracallback = TdsListHeaderV2View.onExtraCallback.ROW2B;
                } else {
                    TdsListHeaderV2View.onExtraCallback onextracallback2 = TdsListHeaderV2View.onExtraCallback.ROW2A;
                    int i21 = onNavigationEvent + 39;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 5 / 2;
                    }
                    onextracallback = onextracallback2;
                }
            } else {
                onextracallback = TdsListHeaderV2View.onExtraCallback.ROW1A;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback.ordinal());
            boolean z2 = (i3 & 14) == 4;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | z2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: im.toss.compose.v0.ListHeaderKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2) {
                            int i23 = 2 % 2;
                            int i24 = onExtraCallback + 89;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            TdsListHeaderV2View tdsListHeaderV2ViewOnExtraCallbackWithResult = getRepeatMode.onExtraCallbackWithResult(onextracallback, str, (Context) obj2);
                            int i26 = IAuthTabCallback + 19;
                            onExtraCallback = i26 % 128;
                            if (i26 % 2 != 0) {
                                return tdsListHeaderV2ViewOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                    obj = function1;
                }
                Function1 function12 = (Function1) obj;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback.ordinal());
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function13 = new Function1() { // from class: im.toss.compose.v0.ListHeaderKt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3) {
                                int i23 = 2 % 2;
                                int i24 = onNavigationEvent + 43;
                                IAuthTabCallback = i24 % 128;
                                Object obj4 = null;
                                if (i24 % 2 == 0) {
                                    getRepeatMode.onNavigationEvent(onextracallback, (TdsListHeaderV2View) obj3);
                                    obj4.hashCode();
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = getRepeatMode.onNavigationEvent(onextracallback, (TdsListHeaderV2View) obj3);
                                int i25 = IAuthTabCallback + 27;
                                onNavigationEvent = i25 % 128;
                                if (i25 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function13);
                        obj2 = function13;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function12, quirksExternalSyntheticBackport0, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 112, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.ListHeaderKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i23 = 2 % 2;
                    int i24 = onNavigationEvent + 31;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitOnNavigationEvent = getRepeatMode.onNavigationEvent(str, onextracallbackwithresult, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i26 = onNavigationEvent + 49;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }
}
