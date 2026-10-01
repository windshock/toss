package o;

import android.graphics.Path;
import im.toss.compose.utils.ComposeBorderKt$;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SessionProcessorCaptureCallback;
import o.getComposition;
import o.removeObserverLocked;
import o.removeTimestamp;
import o.setIso;
import o.setOrientationDegrees;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getComposition {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        removeTimestamp removetimestamp = (removeTimestamp) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        float fFloatValue5 = ((Number) objArr[5]).floatValue();
        long jLongValue = ((Number) objArr[6]).longValue();
        float fFloatValue6 = ((Number) objArr[7]).floatValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[8];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(removetimestamp, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, jLongValue, fFloatValue6, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return removeobserverlockedOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(removeTimestamp removetimestamp, long j, float f, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(removetimestamp, j, f, setiso);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(removetimestamp, j, f, setiso);
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(setiso);
        }
        onWarmupCompleted(setiso);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        removeTimestamp removetimestamp = (removeTimestamp) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(removetimestamp, jLongValue, fFloatValue, setorientationdegrees);
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeTimestamp removetimestamp, long j, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(removetimestamp, j, f, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = onWarmupCompleted + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i6);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i5 | i6)) | i10;
        int i13 = (~(i6 | i5 | i3)) | (~(i8 | (~i3)));
        int i14 = i5 + i3 + i + ((-2005657349) * i2) + (1476006321 * i4);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i5) - 1319501824) + (407026429 * i3) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i) + ((-798228480) * i2) + ((-1404829696) * i4) + ((-1043726336) * i15);
        int i17 = (i5 * 961754349) + 784684277 + (i3 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i * 961754313) + (i2 * (-1264871149)) + (i4 * 72538105) + (i15 * 798621696);
        int i18 = i16 + (i17 * i17 * (-1437204480));
        return i18 != 1 ? i18 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setiso);
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(removeTimestamp removetimestamp, float f, float f2, float f3, float f4, float f5, long j, float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(removetimestamp, f, f2, f3, f4, f5, j, f6, sessionProcessorCaptureCallback);
            throw null;
        }
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(removetimestamp, f, f2, f3, f4, f5, j, f6, sessionProcessorCaptureCallback);
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(boolean z, float f, float f2, float f3, float f4, float f5, long j, float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(z, f, f2, f3, f4, f5, j, f6, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(removeTimestamp removetimestamp, float f, float f2, float f3, float f4, float f5, long j, float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        removeTimestamp removetimestampOnWarmupCompleted;
        float f7;
        float f8;
        float f9;
        float f10;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        if (removetimestamp == null) {
            deprecated_noStore deprecated_nostore = deprecated_noStore.onExtraCallback;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
            if (Float.isNaN(f)) {
                int i2 = onWarmupCompleted + 13;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                f7 = f5;
            } else {
                f7 = f;
            }
            float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(f7);
            Object obj = null;
            if (Float.isNaN(f2)) {
                int i7 = onWarmupCompleted + 105;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                f8 = f5;
            } else {
                f8 = f2;
            }
            float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(f8);
            if (!Float.isNaN(f3)) {
                f9 = f3;
            } else {
                int i8 = onWarmupCompleted + 111;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                f9 = f5;
            }
            float fOnExtraCallback3 = sessionProcessorCaptureCallback.onExtraCallback(f9);
            if (Float.isNaN(f4)) {
                int i9 = onNavigationEvent + 77;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                f10 = f5;
            } else {
                f10 = f4;
            }
            Object[] objArr = {deprecated_nostore, Float.valueOf(fIntBitsToFloat), Float.valueOf(fIntBitsToFloat2), Float.valueOf(fOnExtraCallback), Float.valueOf(fOnExtraCallback2), Float.valueOf(fOnExtraCallback3), Float.valueOf(sessionProcessorCaptureCallback.onExtraCallback(f10)), 0, 64, null};
            removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted((Path) deprecated_noStore.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -740661148, objArr, 740661151, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback()));
        } else {
            removetimestampOnWarmupCompleted = removetimestamp;
        }
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new ComposeBorderKt$.ExternalSyntheticLambda0(removetimestampOnWarmupCompleted, j, f6));
        int i10 = onWarmupCompleted + 37;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        int i3 = 75 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final removeObserverLocked onExtraCallback(removeTimestamp removetimestamp, float f, float f2, float f3, float f4, float f5, final long j, final float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        float f7;
        float f8;
        final removeTimestamp removetimestampOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            int i3 = 88 / 0;
            if (removetimestamp == null) {
                deprecated_noStore deprecated_nostore = deprecated_noStore.onExtraCallback;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
                float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f) ? f5 : f);
                float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f2) ? f5 : f2);
                if (Float.isNaN(f3)) {
                    int i4 = onNavigationEvent + 41;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    f7 = f5;
                } else {
                    f7 = f3;
                }
                float fOnExtraCallback3 = sessionProcessorCaptureCallback.onExtraCallback(f7);
                if (Float.isNaN(f4)) {
                    int i6 = onWarmupCompleted + 89;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 != 0) {
                        int i8 = 48 / 0;
                    }
                    int i9 = i7 + 27;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    f8 = f5;
                } else {
                    f8 = f4;
                }
                removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted((Path) deprecated_noStore.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -740661148, new Object[]{deprecated_nostore, Float.valueOf(fIntBitsToFloat), Float.valueOf(fIntBitsToFloat2), Float.valueOf(fOnExtraCallback), Float.valueOf(fOnExtraCallback2), Float.valueOf(fOnExtraCallback3), Float.valueOf(sessionProcessorCaptureCallback.onExtraCallback(f8)), 0, 64, null}, 740661151, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback()));
            } else {
                removetimestampOnWarmupCompleted = removetimestamp;
            }
        } else {
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            if (removetimestamp == null) {
            }
        }
        sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.compose.utils.ComposeBorderKt$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 45;
                onNavigationEvent = i12 % 128;
                setIso setiso = (setIso) obj;
                if (i12 % 2 == 0) {
                    getComposition.onNavigationEvent(setiso);
                    throw null;
                }
                Unit unitOnNavigationEvent = getComposition.onNavigationEvent(setiso);
                int i13 = onExtraCallback + 27;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                return unitOnNavigationEvent;
            }
        });
        return sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.compose.utils.ComposeBorderKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 9;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                removeTimestamp removetimestamp2 = removetimestampOnWarmupCompleted;
                long j2 = j;
                float f9 = f6;
                Long lValueOf = Long.valueOf(j2);
                Float fValueOf = Float.valueOf(f9);
                Unit unit = (Unit) getComposition.onNavigationEvent(new Object[]{removetimestamp2, lValueOf, fValueOf, (setOrientationDegrees) obj}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1688941896, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1688941895, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
                int i14 = onExtraCallback + 15;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                return unit;
            }
        });
    }

    private static final Unit onNavigationEvent(removeTimestamp removetimestamp, long j, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(f);
        float f2 = fOnExtraCallback * 2.0f;
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, removetimestamp, j, 0.0f, new ExifOutputStream(f2, 0.0f, createByte.Companion.onExtraCallbackWithResult(), createDouble.Companion.onWarmupCompleted(), (fromKilometersPerHour) null, 18, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z, int i, Object obj) {
        float fOnExtraCallback;
        float fOnExtraCallback2;
        float fOnExtraCallback3;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                int i4 = 60 / 0;
            } else {
                fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            }
        } else {
            fOnExtraCallback = f2;
        }
        if ((i & 8) != 0) {
            fOnExtraCallback2 = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            int i5 = onNavigationEvent + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            fOnExtraCallback2 = f3;
        }
        float fOnExtraCallback4 = (i & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f4;
        if ((i & 32) != 0) {
            int i7 = onWarmupCompleted + 121;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            fOnExtraCallback3 = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            fOnExtraCallback3 = f5;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) onNavigationEvent(new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), Float.valueOf(fOnExtraCallback), Float.valueOf(fOnExtraCallback2), Float.valueOf(fOnExtraCallback4), Float.valueOf(fOnExtraCallback3), Float.valueOf((i & 64) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f6), Boolean.valueOf(z)}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -316406246, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 316406248, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        int i9 = onWarmupCompleted + 63;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return quirksExternalSyntheticBackport02;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        final float fFloatValue2 = ((Number) objArr[3]).floatValue();
        final float fFloatValue3 = ((Number) objArr[4]).floatValue();
        final float fFloatValue4 = ((Number) objArr[5]).floatValue();
        final float fFloatValue5 = ((Number) objArr[6]).floatValue();
        final float fFloatValue6 = ((Number) objArr[7]).floatValue();
        final boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.compose.utils.ComposeBorderKt$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                removeObserverLocked removeobserverlockedOnWarmupCompleted = getComposition.onWarmupCompleted(zBooleanValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, jLongValue, fFloatValue, (SessionProcessorCaptureCallback) obj);
                int i5 = onNavigationEvent + 101;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return removeobserverlockedOnWarmupCompleted;
                }
                throw null;
            }
        }));
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit onWarmupCompleted(setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(boolean z, float f, float f2, float f3, float f4, float f5, final long j, final float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        float f7;
        float f8;
        Path pathOnExtraCallback;
        float f9;
        float f10;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        if (z) {
            deprecated_noStore deprecated_nostore = deprecated_noStore.onExtraCallback;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & sessionProcessorCaptureCallback.onWarmupCompleted()));
            if (Float.isNaN(f)) {
                int i2 = onWarmupCompleted + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                f9 = f5;
            } else {
                f9 = f;
            }
            float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(f9);
            float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f2) ? f5 : f2);
            if (Float.isNaN(f3)) {
                int i4 = onWarmupCompleted + 117;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
                f10 = f5;
            } else {
                f10 = f3;
            }
            pathOnExtraCallback = deprecated_noStore.onWarmupCompleted(deprecated_nostore, fIntBitsToFloat, fIntBitsToFloat2, fOnExtraCallback, fOnExtraCallback2, sessionProcessorCaptureCallback.onExtraCallback(f10), sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f4) ^ true ? f4 : f5), 15, false, 128, (Object) null);
        } else {
            deprecated_noStore deprecated_nostore2 = deprecated_noStore.onExtraCallback;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
            float fOnExtraCallback3 = sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f) ? f5 : f);
            float fOnExtraCallback4 = sessionProcessorCaptureCallback.onExtraCallback(Float.isNaN(f2) ? f5 : f2);
            if (Float.isNaN(f3)) {
                int i6 = onWarmupCompleted + 77;
                int i7 = i6 % 128;
                onNavigationEvent = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 47;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 5;
                }
                f7 = f5;
            } else {
                f7 = f3;
            }
            float fOnExtraCallback5 = sessionProcessorCaptureCallback.onExtraCallback(f7);
            if (Float.isNaN(f4)) {
                int i11 = onWarmupCompleted + 1;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                f8 = f5;
            } else {
                f8 = f4;
            }
            pathOnExtraCallback = deprecated_nostore2.onExtraCallback(fIntBitsToFloat3, fIntBitsToFloat4, fOnExtraCallback3, fOnExtraCallback4, fOnExtraCallback5, sessionProcessorCaptureCallback.onExtraCallback(f8), 15);
        }
        final removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted(pathOnExtraCallback);
        sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.compose.utils.ComposeBorderKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i13 = 2 % 2;
                int i14 = onNavigationEvent + 97;
                onExtraCallback = i14 % 128;
                setIso setiso = (setIso) obj;
                if (i14 % 2 == 0) {
                    getComposition.onExtraCallback(setiso);
                    throw null;
                }
                Unit unitOnExtraCallback = getComposition.onExtraCallback(setiso);
                int i15 = onNavigationEvent + 85;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                return unitOnExtraCallback;
            }
        });
        return sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.compose.utils.ComposeBorderKt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i13 = 2 % 2;
                int i14 = onWarmupCompleted + 95;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                Unit unitOnExtraCallbackWithResult = getComposition.onExtraCallbackWithResult(removetimestampOnWarmupCompleted, j, f6, (setOrientationDegrees) obj);
                int i16 = onWarmupCompleted + 107;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
    }

    private static final Unit IAuthTabCallback(removeTimestamp removetimestamp, long j, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(f);
        float f2 = fOnExtraCallback * 2.0f;
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, removetimestamp, j, 0.0f, new ExifOutputStream(f2, 0.0f, createByte.Companion.onExtraCallbackWithResult(), createDouble.Companion.onWarmupCompleted(), (fromKilometersPerHour) null, 18, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(removeTimestamp removetimestamp, long j, float f, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        int iOnExtraCallbackWithResult = readUnsignedShort.Companion.onExtraCallbackWithResult();
        setFlashState setflashstateOnExtraCallback = setiso.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        try {
            setflashstateOnExtraCallback.onTransact().onNavigationEvent(removetimestamp, iOnExtraCallbackWithResult);
            setOrientationDegrees.onWarmupCompleted(setiso, removetimestamp, j, 0.0f, new ExifOutputStream(setiso.onExtraCallback(f) * 2.0f, 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        } catch (Throwable th) {
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            throw th;
        }
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(removeTimestamp removetimestamp, float f, float f2, float f3, float f4, float f5, long j, float f6, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        return (removeObserverLocked) onNavigationEvent(new Object[]{removetimestamp, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Long.valueOf(j), Float.valueOf(f6), sessionProcessorCaptureCallback}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1320171534, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1320171534, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(removeTimestamp removetimestamp, long j, float f, setOrientationDegrees setorientationdegrees) {
        return (Unit) onNavigationEvent(new Object[]{removetimestamp, Long.valueOf(j), Float.valueOf(f), setorientationdegrees}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1688941896, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1688941895, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        return (QuirksExternalSyntheticBackport0) onNavigationEvent(new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Boolean.valueOf(z)}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -316406246, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 316406248, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }
}
