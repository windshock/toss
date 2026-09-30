package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.TdsSkeletonV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.removeAllUpdateListeners;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeAllUpdateListeners {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted, TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, z, z2, onwarmupcompleted, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 9;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ TdsSkeletonV1View onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsSkeletonV1View tdsSkeletonV1ViewOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallback + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return tdsSkeletonV1ViewOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted, TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, z, z2, onwarmupcompleted, iAuthTabCallback, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 65;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, boolean z2, TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted, TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, TdsSkeletonV1View tdsSkeletonV1View) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, z2, onwarmupcompleted, iAuthTabCallback, tdsSkeletonV1View);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(boolean z, boolean z2, TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted, TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, TdsSkeletonV1View tdsSkeletonV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsSkeletonV1View, "");
            tdsSkeletonV1View.setOverflow(z);
            tdsSkeletonV1View.setSkipIntro(z2);
            tdsSkeletonV1View.setSkeletonColor(onwarmupcompleted);
            tdsSkeletonV1View.setSkeletonType(iAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsSkeletonV1View, "");
        tdsSkeletonV1View.setOverflow(z);
        tdsSkeletonV1View.setSkipIntro(z2);
        tdsSkeletonV1View.setSkeletonColor(onwarmupcompleted);
        tdsSkeletonV1View.setSkeletonType(iAuthTabCallback);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, @Nullable TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted, @Nullable TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        final boolean z3;
        int i4;
        final boolean z4;
        int i5;
        int i6;
        int iOrdinal;
        final TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final TdsSkeletonV1View.IAuthTabCallback iAuthTabCallback3;
        final boolean z5;
        final TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final TdsSkeletonV1View.onWarmupCompleted onwarmupcompleted3;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(81342067);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            int i10 = onWarmupCompleted + 105;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4)) {
                        int i12 = IAuthTabCallback + 17;
                        onWarmupCompleted = i12 % 128;
                        i5 = i12 % 2 != 0 ? 15430 : 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (onwarmupcompleted == null) {
                        int i13 = IAuthTabCallback + 17;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        iOrdinal = -1;
                    } else {
                        iOrdinal = onwarmupcompleted.ordinal();
                    }
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iAuthTabCallback2 = iAuthTabCallback;
                        int i15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        iAuthTabCallback2 = iAuthTabCallback;
                    }
                    i3 |= i15;
                } else {
                    iAuthTabCallback2 = iAuthTabCallback;
                }
                boolean z6 = false;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    Object obj = null;
                    if ((i & 1) != 0) {
                        int i16 = onWarmupCompleted + 73;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                            throw null;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            quirksExternalSyntheticBackport03 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if (i9 != 0) {
                                z3 = true;
                            }
                            if (i4 != 0) {
                                z4 = false;
                            }
                            onwarmupcompleted3 = i6 != 0 ? TdsSkeletonV1View.onWarmupCompleted.Grey : onwarmupcompleted;
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                iAuthTabCallback2 = TdsSkeletonV1View.IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
                            }
                        } else {
                            int i17 = onWarmupCompleted + 75;
                            IAuthTabCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 69) != 0) {
                                    i3 &= -57345;
                                }
                                onwarmupcompleted3 = onwarmupcompleted;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 16) != 0) {
                                }
                                onwarmupcompleted3 = onwarmupcompleted;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i18 = IAuthTabCallback + 15;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(81342067, i3, -1, "im.toss.compose.v1.TdsSkeletonV1 (TdsSkeletonV1.kt:17)");
                                obj.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(81342067, i3, -1, "im.toss.compose.v1.TdsSkeletonV1 (TdsSkeletonV1.kt:17)");
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted4 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted4.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.compose.v1.TdsSkeletonV1Kt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj2) {
                                    int i19 = 2 % 2;
                                    int i20 = onExtraCallback + 45;
                                    IAuthTabCallback = i20 % 128;
                                    int i21 = i20 % 2;
                                    TdsSkeletonV1View tdsSkeletonV1ViewOnWarmupCompleted = removeAllUpdateListeners.onWarmupCompleted((Context) obj2);
                                    int i22 = IAuthTabCallback + 11;
                                    onExtraCallback = i22 % 128;
                                    int i23 = i22 % 2;
                                    return tdsSkeletonV1ViewOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        Function1 function1 = (Function1) objOnMinimized;
                        boolean z7 = (i3 & 112) == 32;
                        boolean z8 = (i3 & 896) == 256;
                        if ((i3 & 7168) == 2048) {
                            int i19 = IAuthTabCallback + 9;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            z6 = true;
                        }
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback2);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(z7 | z8 | z6 | zOnExtraCallback)) {
                            int i21 = onWarmupCompleted + 115;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == onwarmupcompleted4.onExtraCallback()) {
                                Function1 function12 = new Function1() { // from class: im.toss.compose.v1.TdsSkeletonV1Kt$$ExternalSyntheticLambda1
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj3) {
                                        int i23 = 2 % 2;
                                        int i24 = onExtraCallback + 47;
                                        onNavigationEvent = i24 % 128;
                                        if (i24 % 2 == 0) {
                                            removeAllUpdateListeners.onWarmupCompleted(z3, z4, onwarmupcompleted3, iAuthTabCallback2, (TdsSkeletonV1View) obj3);
                                            throw null;
                                        }
                                        Unit unitOnWarmupCompleted = removeAllUpdateListeners.onWarmupCompleted(z3, z4, onwarmupcompleted3, iAuthTabCallback2, (TdsSkeletonV1View) obj3);
                                        int i25 = onExtraCallback + 123;
                                        onNavigationEvent = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                obj2 = function12;
                            }
                            CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function1, quirksExternalSyntheticBackport03, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 112) | 6, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            onwarmupcompleted2 = onwarmupcompleted3;
                            iAuthTabCallback3 = iAuthTabCallback2;
                            z5 = z4;
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    iAuthTabCallback3 = iAuthTabCallback2;
                    z5 = z4;
                    onwarmupcompleted2 = onwarmupcompleted;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final boolean z9 = z3;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v1.TdsSkeletonV1Kt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i23 = 2 % 2;
                            int i24 = onWarmupCompleted + 87;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitOnWarmupCompleted = removeAllUpdateListeners.onWarmupCompleted(quirksExternalSyntheticBackport03, z9, z5, onwarmupcompleted2, iAuthTabCallback3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i26 = onWarmupCompleted + 11;
                            IAuthTabCallback = i26 % 128;
                            if (i26 % 2 != 0) {
                                int i27 = 85 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z4 = z2;
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            boolean z62 = false;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z4 = z2;
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        boolean z622 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final TdsSkeletonV1View onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsSkeletonV1View tdsSkeletonV1View = new TdsSkeletonV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -1;
        layoutParams.height = -1;
        tdsSkeletonV1View.setLayoutParams(layoutParams);
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return tdsSkeletonV1View;
    }
}
