package o;

import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleEventObserver;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.components.compose.extensions.ImpressionKt$;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Futures3;
import o.ImageLoaderBuilderExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 2;
                int i = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START.ordinal()] = 3;
                int i3 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP.ordinal()] = 4;
                int i6 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.values().length];
            try {
                iArr2[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Object obj, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(obj, camera2CameraMetadataExternalSyntheticLambda1, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 13;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, z);
        int i4 = onWarmupCompleted + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (decrementVideoUsage) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{textFieldScrollKtExternalSyntheticLambda0, onextracallback, getsupportedhighspeedresolutionsfor, isinvideousage}, -1112153216, 1112153216);
        }
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onExtraCallbackWithResult(iOnExtraCallbackWithResult5, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4, new Object[]{textFieldScrollKtExternalSyntheticLambda0, onextracallback, getsupportedhighspeedresolutionsfor, isinvideousage}, -1112153216, 1112153216);
        int i3 = 1 / 0;
        return decrementvideousage;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor, isinvideousage}, 1393808742, -1393808738);
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousage;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = ~i6;
        int i10 = ~i4;
        int i11 = i8 | (~(i9 | i10 | i5));
        int i12 = (~(i4 | i9 | i5)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i6 + i5 + i + (762713021 * i3) + (1579510587 * i2);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1846875272)) - 1480523776) + ((-1846875272) * i5) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i) + ((-750387200) * i3) + ((-523632640) * i2) + ((-1971257344) * i15);
        int i17 = ((i6 * (-1364308824)) - 1074288667) + (i5 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i * (-1364308165)) + (i3 * (-893132913)) + (i2 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        if (i18 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 2) {
            Function0 function0 = (Function0) objArr[0];
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
            int i19 = 2 % 2;
            int i20 = IAuthTabCallback + 97;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(function0, getsupportedhighspeedresolutionsfor);
            int i22 = onWarmupCompleted + 29;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            return unitIAuthTabCallback;
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[0];
            int i24 = 2 % 2;
            Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[1], "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2);
            int i25 = IAuthTabCallback + 75;
            onWarmupCompleted = i25 % 128;
            int i26 = i25 % 2;
            return onextracallbackwithresult;
        }
        if (i18 != 5) {
            return IAuthTabCallback(objArr);
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i27 = 2 % 2;
        int i28 = onWarmupCompleted + 27;
        IAuthTabCallback = i28 % 128;
        int i29 = i28 % 2;
        getsupportedhighspeedresolutionsfor3.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        int i30 = IAuthTabCallback + 63;
        onWarmupCompleted = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnNavigationEvent = onNavigationEvent();
        int i4 = onWarmupCompleted + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getsupportedhighspeedresolutionsforOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, View view, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, f, view, futures3);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(onextracallback, getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, obj);
            obj2.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, obj);
        int i3 = IAuthTabCallback + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return zIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{function0, cameraPresenceProviderExternalSyntheticLambda6}, -1517763194, 1517763195);
        }
        Object[] objArr2 = {function0, cameraPresenceProviderExternalSyntheticLambda6};
        int iOnExtraCallbackWithResult4 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Object obj, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(obj, camera2CameraMetadataExternalSyntheticLambda1, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function0, z);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, z);
        int i3 = IAuthTabCallback + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r4
      0x002f: PHI (r4v4 java.util.List) = (r4v3 java.util.List), (r4v22 java.util.List) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Object obj) {
        List listOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
            int i3 = 78 / 0;
            if (listOnTransact instanceof Collection) {
                if (listOnTransact.isEmpty()) {
                    int i4 = IAuthTabCallback + 83;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        } else {
            listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
            if (listOnTransact instanceof Collection) {
            }
        }
        Iterator it = listOnTransact.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallback(), obj)) {
                int i6 = onWarmupCompleted + 35;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 12 / 0;
                }
                return true;
            }
        }
        int i8 = onWarmupCompleted + 47;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 55 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        if (!(!IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) objArr[1]))) {
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                function0.invoke();
                int i3 = 92 / 0;
            } else {
                function0.invoke();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull Object obj, @NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-421611190);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj)) {
                int i5 = IAuthTabCallback + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = onWarmupCompleted + 99;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = IAuthTabCallback + 33;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            int i11 = onWarmupCompleted + 103;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-421611190, i2, -1, "im.toss.components.compose.extensions.Impression (Impression.kt:34)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ImpressionKt$.ExternalSyntheticLambda6(camera2CameraMetadataExternalSyntheticLambda1, obj));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
            boolean z = (i2 & 896) == 256;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                int i12 = IAuthTabCallback + 27;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    onwarmupcompleted.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new ImpressionKt$.ExternalSyntheticLambda7(function0, cameraPresenceProviderExternalSyntheticLambda6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                ImageLoaderBuilderExternalSyntheticLambda3.onNavigationEvent(null, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6)) {
                    function0.invoke();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ImpressionKt$.ExternalSyntheticLambda8(obj, camera2CameraMetadataExternalSyntheticLambda1, function0, i));
        }
    }

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor onWarmupCompleted;

        public onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.IAuthTabCallback(Boolean.FALSE);
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LifecycleEventObserver onExtraCallbackWithResult;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onWarmupCompleted;

        public onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onWarmupCompleted = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallbackWithResult = lifecycleEventObserver;
        }

        public void dispose() {
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.onWarmupCompleted;
            if (textFieldScrollKtExternalSyntheticLambda0 == null || (lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle()) == null) {
                return;
            }
            int i4 = IAuthTabCallback + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            lifecycle.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            int i6 = onNavigationEvent + 111;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final getSupportedHighSpeedResolutionsFor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if ((i2 & 1) != 0) {
            f = 0.2f;
        }
        float f2 = f;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-935679570, i, -1, "im.toss.components.compose.extensions.onFirstImpression (Impression.kt:67)");
        }
        boolean z = false;
        Object[] objArr = new Object[0];
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function0() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult();
                    int i7 = onExtraCallback + 103;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        return getsupportedhighspeedresolutionsforOnExtraCallbackWithResult;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 48);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        if (((i & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0)) {
            if ((i & 384) == 256) {
                int i4 = IAuthTabCallback + 17;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z | zOnNavigationEvent)) {
            int i5 = IAuthTabCallback + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 33;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr2 = {function0, getsupportedhighspeedresolutionsfor};
                        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                        Unit unit = (Unit) ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr2, -865407912, 865407914);
                        int i10 = IAuthTabCallback + 23;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, f2, null, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, i & 126, 2);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onWarmupCompleted + 43;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (!onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor, true}, -1425608617, 1425608622);
                function0.invoke();
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable Object obj, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        float f2 = (i2 & 1) != 0 ? 0.2f : f;
        Object obj2 = (i2 & 2) != 0 ? Unit.INSTANCE : obj;
        boolean z = true;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onWarmupCompleted + 9;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851961742, i, -1, "im.toss.components.compose.extensions.onImpression (Impression.kt:89)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851961742, i, -1, "im.toss.components.compose.extensions.onImpression (Impression.kt:89)");
        }
        if ((((i & 7168) ^ 3072) <= 2048 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0)) && (i & 3072) != 2048) {
            z = false;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z) {
            int i7 = onWarmupCompleted + 23;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 53 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda5
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3) {
                            Unit unitIAuthTabCallback;
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 119;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(function0, ((Boolean) obj3).booleanValue());
                                int i11 = 70 / 0;
                            } else {
                                unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(function0, ((Boolean) obj3).booleanValue());
                            }
                            int i12 = onWarmupCompleted + 125;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, f2, obj2, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, i & 1022, 12);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = IAuthTabCallback + 99;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit onNavigationEvent(Function0 function0, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                function0.invoke();
                int i3 = IAuthTabCallback + 101;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            } else {
                function0.invoke();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable Object obj, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float f2;
        Object obj2;
        Object obj3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if ((i2 & 1) != 0) {
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            f2 = 0.2f;
        } else {
            f2 = f;
        }
        if ((i2 & 2) != 0) {
            int i6 = onWarmupCompleted + 87;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            obj2 = Unit.INSTANCE;
        } else {
            obj2 = obj;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 59;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-724846332, i, -1, "im.toss.components.compose.extensions.onImpressionWhenVisible (Impression.kt:108)");
        }
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED;
        boolean z = (((i & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0)) || (i & 3072) == 2048;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z) {
            obj3 = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Function1 function1 = new Function1() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj4) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 23;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(function0, ((Boolean) obj4).booleanValue());
                        int i13 = onExtraCallbackWithResult + 109;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                obj3 = function1;
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, f2, obj2, null, onextracallback, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 24576 | (i & 112) | (i & 896), 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i10 = onWarmupCompleted + 117;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 33;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onExtraCallback.onExtraCallback[onextracallback.ordinal()] == 1) {
            int i4 = onExtraCallback.IAuthTabCallback[onextracallbackwithresult.ordinal()];
            if (i4 == 1) {
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.TRUE);
                return;
            } else {
                if (i4 == 2) {
                    getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        int i5 = onExtraCallback.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i5 == 3) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.TRUE);
            return;
        }
        int i6 = IAuthTabCallback + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        if (i5 != 4) {
            return;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
        int i8 = IAuthTabCallback + 25;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isImpressed;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isLifecycleActive;
        final /* synthetic */ Function1<Boolean, Unit> $onImpressionChanged;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, Function1<? super Boolean, Unit> function1, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$isImpressed = getsupportedhighspeedresolutionsfor;
            this.$isLifecycleActive = getsupportedhighspeedresolutionsfor2;
            this.$onImpressionChanged = function1;
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$isImpressed, this.$isLifecycleActive, this.$onImpressionChanged, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.$isImpressed;
            final getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2 = this.$isLifecycleActive;
            ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.components.compose.extensions.ImpressionKt$onImpressionChanged$3$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2));
                    int i7 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return boolValueOf;
                }
            })), new AnonymousClass2(this.$onImpressionChanged, null)), findresandmsg);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 80 / 0;
                if (!(!bool.booleanValue())) {
                    if (((Boolean) getsupportedhighspeedresolutionsfor2.onExtraCallbackWithResult()).booleanValue()) {
                        int i5 = onWarmupCompleted + 87;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return true;
                    }
                }
            } else if (bool.booleanValue()) {
            }
            return false;
        }

        /* renamed from: o.ImageLoaderBuilderExternalSyntheticLambda1$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ Function1<Boolean, Unit> $onImpressionChanged;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super Boolean, Unit> function1, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$onImpressionChanged = function1;
            }

            public final Object IAuthTabCallback(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onImpressionChanged, access13800Var);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = IAuthTabCallback + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj3 = null;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (i3 != 0) {
                    IAuthTabCallback(zBooleanValue, (access13800) obj2);
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(zBooleanValue, (access13800) obj2);
                int i4 = IAuthTabCallback + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 49;
                onExtraCallback = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                this.$onImpressionChanged.invoke(access14000.onNavigationEvent(z));
                Unit unit = Unit.INSTANCE;
                int i3 = IAuthTabCallback + 25;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable Object obj, @Nullable TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @Nullable TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, @NotNull Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final float f2;
        final TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback2;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if ((i2 & 1) != 0) {
            int i6 = IAuthTabCallback + 115;
            onWarmupCompleted = i6 % 128;
            f2 = 0.2f;
            if (i6 % 2 == 0) {
                int i7 = 57 / 0;
            }
        } else {
            f2 = f;
        }
        Object obj2 = (i2 & 2) != 0 ? Unit.INSTANCE : obj;
        final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (i2 & 4) != 0 ? (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()) : textFieldScrollKtExternalSyntheticLambda0;
        Object obj3 = null;
        if ((i2 & 8) != 0) {
            int i8 = IAuthTabCallback + 45;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback3 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                obj3.hashCode();
                throw null;
            }
            onextracallback2 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
        } else {
            onextracallback2 = onextracallback;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2122539277, i, -1, "im.toss.components.compose.extensions.onImpressionChanged (Impression.kt:131)");
        }
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i9 = onWarmupCompleted + 11;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda02);
        int i11 = (57344 & i) ^ 24576;
        boolean z2 = (i11 > 16384 && !(cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback2.ordinal()) ^ true)) || (i & 24576) == 16384;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent2 | z2)) {
            int i12 = onWarmupCompleted + 59;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf((textFieldScrollKtExternalSyntheticLambda02 == null || (lifecycle = textFieldScrollKtExternalSyntheticLambda02.getLifecycle()) == null || (onextracallbackIAuthTabCallback = lifecycle.IAuthTabCallback()) == null) ? true : onextracallbackIAuthTabCallback.isAtLeast(onextracallback2)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
        boolean z3 = (i11 > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback2.ordinal())) || (i & 24576) == 16384;
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(textFieldScrollKtExternalSyntheticLambda02);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z3 | zOnNavigationEvent3 | zOnExtraCallback) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized3 = new Function1() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj4) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    decrementVideoUsage decrementvideousageIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda02, onextracallback2, getsupportedhighspeedresolutionsfor2, (isInVideoUsage) obj4);
                    int i17 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    return decrementvideousageIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda02, onextracallback2, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 9) & 126);
        Unit unit = Unit.INSTANCE;
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized4 = new Function1() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj4) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallback + 85;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    decrementVideoUsage decrementvideousageIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(getsupportedhighspeedresolutionsfor, (isInVideoUsage) obj4);
                    int i17 = onExtraCallback + 53;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    return decrementvideousageIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 6);
        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
        boolean z4 = (((458752 & i) ^ 196608) > 131072 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) || (i & 196608) == 131072;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent5 | zOnNavigationEvent6 | z4) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized5 = new onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, function1, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        if (((i & 112) ^ 48) > 32) {
            int i14 = onWarmupCompleted + 75;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) {
                z = (i & 48) == 32;
            }
        }
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z | zOnNavigationEvent7 | zOnExtraCallback2) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized6 = new Function1() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallback + 93;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda1.onNavigationEvent(getsupportedhighspeedresolutionsfor, f2, view, (Futures3) obj4);
                    int i18 = IAuthTabCallback + 47;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, float f, View view, Futures3 futures3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        boolean z = false;
        Rect rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null);
        if (rectOnWarmupCompleted.onMinimized()) {
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        Rect rectIAuthTabCallback = rectOnWarmupCompleted.IAuthTabCallback(RectHelper_androidKt.onExtraCallback(rect));
        long jAsBinder = futures3.asBinder();
        int i4 = ((int) (jAsBinder >> 32)) * ((int) jAsBinder);
        float fIAuthTabCallback_Parcel = (rectIAuthTabCallback.IAuthTabCallback_Parcel() - rectIAuthTabCallback.IAuthTabCallbackStubProxy()) * (rectIAuthTabCallback.IAuthTabCallbackDefault() - rectIAuthTabCallback.extraCallback());
        if (i4 <= 0 || fIAuthTabCallback_Parcel <= 0.0f) {
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        if (fIAuthTabCallback_Parcel / i4 >= f) {
            int i5 = onWarmupCompleted + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[0];
        final TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) objArr[1];
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[3], "");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.components.compose.extensions.ImpressionKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback2 = onextracallback;
                if (i4 != 0) {
                    ImageLoaderBuilderExternalSyntheticLambda1.onNavigationEvent(onextracallback2, getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                    return;
                }
                ImageLoaderBuilderExternalSyntheticLambda1.onNavigationEvent(onextracallback2, getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        if (textFieldScrollKtExternalSyntheticLambda0 != null) {
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
                throw null;
            }
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0.getLifecycle();
            if (lifecycle != null) {
                lifecycle.IAuthTabCallback(lifecycleEventObserver);
                int i3 = onWarmupCompleted + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        onNavigationEvent onnavigationevent = new onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
        int i5 = onWarmupCompleted + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return onnavigationevent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{function0, cameraPresenceProviderExternalSyntheticLambda6}, -563251459, 563251462);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{function0, getsupportedhighspeedresolutionsfor}, -865407912, 865407914);
    }

    private static final Unit onNavigationEvent(Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{function0, cameraPresenceProviderExternalSyntheticLambda6}, -1517763194, 1517763195);
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, -1425608617, 1425608622);
    }

    private static final decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (decrementVideoUsage) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{textFieldScrollKtExternalSyntheticLambda0, onextracallback, getsupportedhighspeedresolutionsfor, isinvideousage}, -1112153216, 1112153216);
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (decrementVideoUsage) onExtraCallbackWithResult(iOnExtraCallbackWithResult2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor, isinvideousage}, 1393808742, -1393808738);
    }
}
