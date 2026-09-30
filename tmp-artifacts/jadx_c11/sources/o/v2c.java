package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.handleNativeAdClick;
import o.v2;
import o.v2c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v2c {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final v2c onExtraCallbackWithResult = new v2c();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[v2.onWarmupCompleted.values().length];
            try {
                iArr[v2.onWarmupCompleted.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.onWarmupCompleted.Medium.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[v2.onExtraCallback.values().length];
            try {
                iArr2[v2.onExtraCallback.Pill.ordinal()] = 1;
                int i2 = onExtraCallback + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v2.onExtraCallback.Square.ordinal()] = 2;
                int i5 = onExtraCallback + 89;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    static {
        int i = onExtraCallback + 73;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(deprecated_followRedirects deprecated_followredirects, long j, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(deprecated_followredirects, j, str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        int i6 = onWarmupCompleted + 21;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        v2cVar.IAuthTabCallback(deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 77;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit asInterface(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            v2cVar.onNavigationEvent(deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            v2cVar.onNavigationEvent(deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsInterface = asInterface(v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 97;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        v2c v2cVar = (v2c) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str = (String) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(jLongValue), str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue)), Integer.valueOf(iIntValue2)};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            onWarmupCompleted(-380698864, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 380698866, objArr2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        } else {
            Object[] objArr3 = {v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(jLongValue), str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue)), Integer.valueOf(iIntValue2)};
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            onWarmupCompleted(-380698864, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, 380698866, objArr3, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(-1502557285, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1502557285, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i7 = onWarmupCompleted + 43;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, j, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 47;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i4);
        int i11 = (~i4) | i7;
        int i12 = i10 | (~(i11 | i));
        int i13 = (~(i4 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i + i2 + (783392123 * i6) + ((-786872706) * i3);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i5) + 1729888256 + (218870266 * i) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i2) + ((-1731985408) * i6) + ((-471334912) * i3) + ((-600899584) * i16);
        int i18 = (i5 * 375823119) + 1642083618 + (i * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i2 * 375824245) + (i6 * (-117547465)) + (i3 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        return i19 != 1 ? i19 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, long j, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(deprecated_followredirects, j, str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private v2c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        long jOnTransact;
        int i5;
        String str2;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j2;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 91;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(835217617);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                int i11 = onWarmupCompleted + 99;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    jOnTransact = j;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        int i13 = onWarmupCompleted + 5;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        str2 = str;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                            int i15 = onWarmupCompleted + 115;
                            onNavigationEvent = i15 % 128;
                            i6 = i15 % 2 == 0 ? 7826 : 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    if ((i3 & 9363) == 9362) {
                        int i16 = onWarmupCompleted + 89;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        j2 = jOnTransact;
                        str3 = str2;
                    } else {
                        quirksExternalSyntheticBackport03 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        Object obj = null;
                        if (i4 != 0) {
                            int i18 = onWarmupCompleted + 99;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 == 0) {
                                setByteOrder.Companion.onTransact();
                                obj.hashCode();
                                throw null;
                            }
                            jOnTransact = setByteOrder.Companion.onTransact();
                        }
                        j2 = jOnTransact;
                        String str4 = i5 != 0 ? null : str2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(835217617, i3, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Icon (LeftAccessoryPreset.kt:25)");
                        }
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        v2 v2Var = v2.onExtraCallback;
                        AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, onWarmupCompleted(onextracallback, (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface()), (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy())).onExtraCallback(quirksExternalSyntheticBackport03), j2, null, null, null, null, null, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 910) | ((i3 << 15) & 234881024), 248);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i19 = onNavigationEvent + 113;
                            onWarmupCompleted = i19 % 128;
                            if (i19 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        str3 = str4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        final long j3 = j2;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i20 = 2 % 2;
                                int i21 = IAuthTabCallback + 87;
                                onNavigationEvent = i21 % 128;
                                int i22 = i21 % 2;
                                Unit unitOnNavigationEvent = v2c.onNavigationEvent(this.f$0, deprecated_followredirects, quirksExternalSyntheticBackport04, j3, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i23 = IAuthTabCallback + 27;
                                onNavigationEvent = i23 % 128;
                                if (i23 % 2 != 0) {
                                    int i24 = 27 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                str2 = str;
                if ((i & 24576) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            jOnTransact = j;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        jOnTransact = j;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        v2c v2cVar = (v2c) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str = (String) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue3 & 2) != 0) {
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue3 & 4) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
            int i4 = onWarmupCompleted + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        Object obj = null;
        if ((iIntValue3 & 8) != 0) {
            int i6 = onNavigationEvent + 57;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 37;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(637386328, iIntValue2, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Icon (LeftAccessoryPreset.kt:46)");
                int i8 = 57 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(637386328, iIntValue2, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Icon (LeftAccessoryPreset.kt:46)");
            }
        }
        v2cVar.IAuthTabCallback(deprecated_followSslRedirects.onWarmupCompleted(iIntValue), onextracallback, jLongValue, str, cameraCaptureResultEmptyCameraCaptureResult, 65520 & iIntValue2, 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jAccess100;
        String str3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            jAccess100 = ((setByteOrder) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(v2.onExtraCallback.IAuthTabCallback_Parcel())).access100();
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            jAccess100 = j;
        }
        if ((i2 & 8) != 0) {
            int i6 = onWarmupCompleted + 121;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 89;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1143560868, i, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Icon (LeftAccessoryPreset.kt:62)");
        }
        IAuthTabCallback(deprecated_followSslRedirects.onExtraCallback(str), quirksExternalSyntheticBackport02, jAccess100, str3, cameraCaptureResultEmptyCameraCaptureResult, i & 65520, 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(deprecated_followRedirects deprecated_followredirects, long j, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i7 = onWarmupCompleted + 107;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 55 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                    int i9 = onNavigationEvent + 57;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i11 = onNavigationEvent + 45;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-988172124, i2, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Image.<anonymous> (LeftAccessoryPreset.kt:88)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallback(deprecated_followredirects, deprecated_eventListenerFactory.Image, null, j, 0, 0.0f, null, str, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 48, 116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onWarmupCompleted + 65;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i14 = 1 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[PHI: r0
      0x004a: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r0
      0x0032: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        long j2;
        int i6;
        String str2;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j3;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback;
        int i7;
        int i8 = 2 % 2;
        int i9 = onNavigationEvent + 73;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1644065461);
            if ((i & 122) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects)) {
                    int i10 = onNavigationEvent + 61;
                    onWarmupCompleted = i10 % 128;
                    i3 = i10 % 2 != 0 ? 5 : 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1644065461);
            if ((i & 6) == 0) {
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                int i12 = onNavigationEvent + 33;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    j2 = j;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        str2 = str;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        int i14 = onNavigationEvent + 83;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 57 / 0;
                            i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 16384 : 8192;
                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                        }
                        i4 |= i7;
                    }
                    if ((i4 & 9363) == 9362) {
                        int i16 = onNavigationEvent + 59;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        j3 = j2;
                        str3 = str2;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        final long jOnTransact = i5 != 0 ? setByteOrder.Companion.onTransact() : j2;
                        final String str4 = i6 != 0 ? null : str2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i18 = onNavigationEvent + 31;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1644065461, i4, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Image (LeftAccessoryPreset.kt:77)");
                                int i19 = 30 / 0;
                            } else {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1644065461, i4, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Image (LeftAccessoryPreset.kt:77)");
                            }
                        }
                        v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2.onExtraCallback.IAuthTabCallbackStubProxy());
                        int i20 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
                        if (i20 != 1) {
                            int i21 = onWarmupCompleted + 35;
                            onNavigationEvent = i21 % 128;
                            if (i21 % 2 != 0 ? i20 != 2 : i20 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            onextracallbackwithresultOnExtraCallback = handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion.onNavigationEvent();
                        } else {
                            onextracallbackwithresultOnExtraCallback = handleNativeAdClick.onExtraCallback.onExtraCallbackWithResult.Companion.onExtraCallback();
                        }
                        setMainImageUri.onExtraCallbackWithResult(onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, onwarmupcompleted).onExtraCallback(quirksExternalSyntheticBackport04), onextracallbackwithresultOnExtraCallback, 0L, null, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(-988172124, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset$$ExternalSyntheticLambda0
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 109;
                                onNavigationEvent = i23 % 128;
                                int i24 = i23 % 2;
                                Unit unitIAuthTabCallback = v2c.IAuthTabCallback(deprecated_followredirects, jOnTransact, str4, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i25 = onWarmupCompleted + 65;
                                onNavigationEvent = i25 % 128;
                                if (i25 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 124);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i22 = onWarmupCompleted + 95;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        j3 = jOnTransact;
                        str3 = str4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                int i24 = 2 % 2;
                                int i25 = onNavigationEvent + 49;
                                onExtraCallback = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnExtraCallback = v2c.onExtraCallback(this.f$0, deprecated_followredirects, quirksExternalSyntheticBackport03, j3, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i27 = onExtraCallback + 43;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 3072;
                str2 = str;
                if ((i & 24576) == 0) {
                }
                if ((i4 & 9363) == 9362) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            j2 = j;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if ((i4 & 9363) == 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        j2 = j;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if ((i4 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        String str3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 57;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i2 & 8) != 0) {
            int i8 = onWarmupCompleted + 85;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-350078378, i, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Image (LeftAccessoryPreset.kt:104)");
        }
        onNavigationEvent(deprecated_followSslRedirects.onExtraCallback(str), quirksExternalSyntheticBackport02, jOnTransact, str3, cameraCaptureResultEmptyCameraCaptureResult, i & 65520, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onNavigationEvent + 79;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i11 != 0) {
                int i12 = 38 / 0;
            }
        }
    }

    private static final Unit onNavigationEvent(deprecated_followRedirects deprecated_followredirects, long j, String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 99;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1397556191, i2, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Card.<anonymous> (LeftAccessoryPreset.kt:151)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1397556191, i2, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Card.<anonymous> (LeftAccessoryPreset.kt:151)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallback(deprecated_followredirects, deprecated_eventListenerFactory.Image, null, j, 0, 0.0f, null, str, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 48, 116);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 101;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        handleNativeAdClick.onExtraCallback.IAuthTabCallback iAuthTabCallbackOnTransact;
        v2c v2cVar = (v2c) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str = (String) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1352232602);
        if ((iIntValue & 6) == 0) {
            int i6 = onNavigationEvent + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        int i8 = iIntValue2 & 2;
        Object obj = null;
        if (i8 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            int i9 = onNavigationEvent + 81;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback);
                throw null;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback))) {
                int i10 = onNavigationEvent + 9;
                onWarmupCompleted = i10 % 128;
                i2 = i10 % 2 != 0 ? 56 : 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        int i11 = iIntValue2 & 4;
        if (i11 != 0) {
            i |= 384;
            int i12 = onWarmupCompleted + 23;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 2;
            }
        } else if ((iIntValue & 384) == 0) {
            int i14 = onNavigationEvent + 33;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                i3 = 256;
            } else {
                int i15 = onNavigationEvent + 7;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i3 = 128;
            }
            i |= i3;
        }
        int i17 = iIntValue2 & 8;
        if (i17 != 0) {
            int i18 = onNavigationEvent + 3;
            onWarmupCompleted = i18 % 128;
            i = i18 % 2 != 0 ? i | 27238 : i | 3072;
        } else if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i19 = onWarmupCompleted + 97;
                onNavigationEvent = i19 % 128;
                i4 = i19 % 2 == 0 ? 20660 : 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((iIntValue & 24576) == 0) {
            int i20 = onNavigationEvent + 13;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v2cVar) ? 16384 : 8192;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 9363) != 9362, i & 1)) {
            if (i8 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (i11 != 0) {
                jLongValue = setByteOrder.Companion.onTransact();
            }
            if (i17 != 0) {
                str = null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i22 = onNavigationEvent + 19;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1352232602, i, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Card (LeftAccessoryPreset.kt:136)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1352232602, i, -1, "im.toss.tds.compose.component.compound.chip.v1.LeftAccessoryPreset.Card (LeftAccessoryPreset.kt:136)");
            }
            v2 v2Var = v2.onExtraCallback;
            v2.onExtraCallback onextracallback2 = (v2.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.asInterface());
            v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(v2Var.IAuthTabCallbackStubProxy());
            int i23 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i23 == 1) {
                iAuthTabCallbackOnTransact = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion.onTransact();
            } else {
                if (i23 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iAuthTabCallbackOnTransact = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion.asInterface();
            }
            setMainImageUri.onExtraCallbackWithResult(v2cVar.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, onextracallback2, onwarmupcompleted).onExtraCallback(onextracallback), iAuthTabCallbackOnTransact, 0L, null, 0.0f, null, null, ForwardingCameraControl.onExtraCallback(-1397556191, true, new LeftAccessoryPreset$.ExternalSyntheticLambda3(deprecated_followredirects, jLongValue, str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 124);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        long j = jLongValue;
        String str2 = str;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeftAccessoryPreset$.ExternalSyntheticLambda4(v2cVar, deprecated_followredirects, onextracallback, j, str2, iIntValue, iIntValue2));
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onExtraCallback onextracallback, @NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        float fIAuthTabCallback3;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        int i4 = onWarmupCompleted.onWarmupCompleted[onextracallback.ordinal()];
        if (i4 == 1) {
            int i5 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i5 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = onWarmupCompleted + 57;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                    int i7 = 32 / 0;
                } else {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                }
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f);
            }
        }
        float f = fIAuthTabCallback;
        int[] iArr = onWarmupCompleted.onNavigationEvent;
        int i9 = iArr[onwarmupcompleted.ordinal()];
        if (i9 == 1) {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
            int i10 = onWarmupCompleted + 79;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = onNavigationEvent + 115;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, f, 0.0f, fIAuthTabCallback2, 0.0f, 10, (Object) null);
        int i14 = iArr[onwarmupcompleted.ordinal()];
        if (i14 == 1) {
            fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback3));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[PHI: r1 r3
      0x005e: PHI (r1v8 o.QuirksExternalSyntheticBackport0$onExtraCallback) = (r1v4 o.QuirksExternalSyntheticBackport0$onExtraCallback), (r1v9 o.QuirksExternalSyntheticBackport0$onExtraCallback) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r3v4 float) = (r3v1 float), (r3v5 float) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r1 r3 r13
      0x0040: PHI (r1v5 o.QuirksExternalSyntheticBackport0$onExtraCallback) = (r1v4 o.QuirksExternalSyntheticBackport0$onExtraCallback), (r1v9 o.QuirksExternalSyntheticBackport0$onExtraCallback) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r3v2 float) = (r3v1 float), (r3v5 float) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r13v3 int) = (r13v2 int), (r13v14 int) binds: [B:8:0x003e, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        float fIAuthTabCallback;
        int i;
        float fIAuthTabCallback2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            i = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i != 1) {
                int i4 = onWarmupCompleted + 3;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i != 2 : i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
            } else {
                fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
            i = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i != 1) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, fIAuthTabCallback, 0.0f, fIAuthTabCallback2, 0.0f, 10, (Object) null));
        int i5 = onNavigationEvent + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v2.onExtraCallback onextracallback, @NotNull v2.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        int i2 = onWarmupCompleted.onWarmupCompleted[onextracallback.ordinal()];
        if (i2 == 1) {
            int i3 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i3 != 1) {
                int i4 = onWarmupCompleted + 55;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 2 : i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
            if (i5 == 1) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f);
                int i6 = onNavigationEvent + 17;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
            }
        }
        float f = fIAuthTabCallback;
        int i8 = onWarmupCompleted.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i8 != 1) {
            int i9 = onWarmupCompleted + 71;
            int i10 = i9 % 128;
            onNavigationEvent = i10;
            int i11 = i9 % 2;
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = i10 + 87;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
            int i14 = onWarmupCompleted + 41;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
        } else {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, f, 0.0f, fIAuthTabCallback2, 0.0f, 10, (Object) null));
    }

    private static final Unit onWarmupCompleted(v2c v2cVar, deprecated_followRedirects deprecated_followredirects, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {v2cVar, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(j), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-1502557285, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1502557285, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(j), str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(-380698864, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 380698866, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final void onExtraCallback(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {this, Integer.valueOf(i), quirksExternalSyntheticBackport0, Long.valueOf(j), str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onWarmupCompleted(1686301379, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1686301378, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }
}
