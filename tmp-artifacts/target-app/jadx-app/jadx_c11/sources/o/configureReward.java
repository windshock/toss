package o;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.configureReward;
import o.flipHorizontally;
import o.noStore;
import o.onItemClicked;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class configureReward {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 1;
    private static final getCachingExecutorService asBinder = new getCachingExecutorService() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda7
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // o.getCachingExecutorService
        public final onItemClicked produce(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onItemClicked onitemclickedOnExtraCallbackWithResult = configureReward.onExtraCallbackWithResult(z);
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onitemclickedOnExtraCallbackWithResult;
            }
            throw null;
        }
    };
    private static final toMetersPerSecond onExtraCallback = new onExtraCallbackWithResult();
    private static final getConfiguration<Float> onWarmupCompleted = onExtraCallback(0.96f, 1.0f);
    private static final getConfiguration<Float> onExtraCallbackWithResult = onExtraCallback(1.0f, 1.0f);
    private static final getCachingExecutorService IAuthTabCallback = new getCachingExecutorService() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda8
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // o.getCachingExecutorService
        public final onItemClicked produce(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onItemClicked onitemclickedOnWarmupCompleted = configureReward.onWarmupCompleted(z);
            int i4 = IAuthTabCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onitemclickedOnWarmupCompleted;
        }
    };
    private static final getCachingExecutorService onNavigationEvent = new getCachingExecutorService() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda9
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // o.getCachingExecutorService
        public final onItemClicked produce(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {Boolean.valueOf(z)};
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            onItemClicked onitemclicked = (onItemClicked) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -845141538, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 845141541, iOnExtraCallbackWithResult);
            int i4 = onExtraCallback + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onitemclicked;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static final WeakHashMap<Object, Long> IAuthTabCallbackDefault = new WeakHashMap<>();

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[deprecated_url.values().length];
            try {
                iArr[deprecated_url.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deprecated_url.Small.ordinal()] = 2;
                int i = onExtraCallback + 91;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deprecated_url.Bounce.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int i3 = onExtraCallback + 105;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(zBooleanValue);
            obj.hashCode();
            throw null;
        }
        onItemClicked onitemclickedIAuthTabCallback = IAuthTabCallback(zBooleanValue);
        int i3 = IAuthTabCallbackStub + 45;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onitemclickedIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Rally rally, Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(zzgc.onExtraCallbackWithResult(), -325256003, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[]{rally, context}, 325256011, iOnExtraCallbackWithResult);
        int i4 = onTransact + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getReward getreward, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getreward, fliphorizontally);
        }
        onExtraCallback(getreward, fliphorizontally);
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(boolean z, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z2, boolean z3, boolean z4, String str, Role role, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(z, getconfiguration, getcachingexecutorservice, z2, z3, z4, str, role, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 13;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function2 function2 = (Function2) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        IAuthTabCallback(jLongValue, zBooleanValue, function2, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 23;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = ~i2;
        int i12 = i11 | i5;
        int i13 = ~(i6 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i5 + i2 + i3 + ((-573665793) * i) + ((-1595597844) * i4);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i5) + 959184896 + (1033409659 * i2) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i3) + (1316749312 * i) + (833617920 * i4) + (497221632 * i18);
        int i20 = ((i5 * 2143800573) - 1595758) + (i2 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i3 * 2143800411) + (i * 1405922725) + (i4 * (-1943733020)) + (i18 * 1827733504);
        switch (i19 + (i20 * i20 * (-911933440))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function03) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 != 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), -1162085188, iOnExtraCallbackWithResult4, zzgc.onExtraCallbackWithResult(), new Object[]{camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, boolValueOf, str, role, str2, function0, function02, quirksExternalSyntheticBackport0, function03}, 1162085194, iOnExtraCallbackWithResult3);
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return quirksExternalSyntheticBackport02;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 77;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(zzgc.onExtraCallbackWithResult(), 1855643096, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1855643091, iOnExtraCallbackWithResult);
        int i7 = onTransact + 101;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, long j, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, j, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 31;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(boolean z, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z2, boolean z3, boolean z4, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(z, getconfiguration, getcachingexecutorservice, z2, z3, z4, str, role, str2, function0, function02, function03, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 123;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ onItemClicked onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onItemClicked onitemclickedIAuthTabCallbackStub = IAuthTabCallbackStub(z);
        int i4 = IAuthTabCallbackStub + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onitemclickedIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, Role role, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, quirksExternalSyntheticBackport0, function0);
        int i4 = IAuthTabCallbackStub + 119;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, Role role, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        WeakHashMap<Object, Long> weakHashMap = IAuthTabCallbackDefault;
        int i5 = i3 + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return weakHashMap;
    }

    public static /* synthetic */ List onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = onExtraCallback(rally);
        int i4 = onTransact + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallback;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, deprecated_url deprecated_urlVar, float f, List list, boolean z, noStore nostore, boolean z2, long j, String str, Function1 function1, boolean z3, float f2, setByteOrder setbyteorder, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 17;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, deprecated_urlVar, f, list, z, nostore, z2, j, str, function1, z3, f2, setbyteorder, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = 22 / 0;
        } else {
            quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, deprecated_urlVar, f, list, z, nostore, z2, j, str, function1, z3, f2, setbyteorder, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        int i5 = onTransact + 57;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(noStore nostore, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(nostore, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static /* synthetic */ onItemClicked onWarmupCompleted(boolean z) {
        onItemClicked onitemclicked;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        if (i3 == 0) {
            onitemclicked = (onItemClicked) onExtraCallback(zzgc.onExtraCallbackWithResult(), 325482748, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), objArr, -325482739, iOnExtraCallbackWithResult);
            int i4 = 42 / 0;
        } else {
            onitemclicked = (onItemClicked) onExtraCallback(zzgc.onExtraCallbackWithResult(), 325482748, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), objArr, -325482739, iOnExtraCallbackWithResult);
        }
        int i5 = IAuthTabCallbackStub + 37;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return onitemclicked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final getConfiguration<Float> onExtraCallback(float f, float f2) {
        int i = 2 % 2;
        AppLovinSdk appLovinSdk = new AppLovinSdk(f2, f);
        int i2 = onTransact + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return appLovinSdk;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final noStore nostore = (noStore) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0OnNavigationEvent, "");
            Intrinsics.checkNotNullParameter(nostore, "");
            int i3 = 79 / 0;
            if (zBooleanValue) {
                quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 13;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        noStore nostore2 = nostore;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) obj;
                        if (i6 != 0) {
                            return configureReward.onWarmupCompleted(nostore2, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        configureReward.onWarmupCompleted(nostore2, quirksExternalSyntheticBackport0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                }, 1, (Object) null);
                int i4 = IAuthTabCallbackStub + 45;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0OnNavigationEvent, "");
            Intrinsics.checkNotNullParameter(nostore, "");
            if (zBooleanValue) {
            }
        }
        int i6 = onTransact + 9;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    static final class onWarmupCompleted implements PointerInputEventHandler {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ noStore onWarmupCompleted;

        onWarmupCompleted(Context context, noStore nostore) {
            this.IAuthTabCallback = context;
            this.onWarmupCompleted = nostore;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, new AnonymousClass2(this.IAuthTabCallback, this.onWarmupCompleted, null), access13800Var);
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return objOnWarmupCompleted;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* renamed from: o.configureReward$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ Context $context;
            final /* synthetic */ noStore $haptic;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, noStore nostore, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
                this.$haptic = nostore;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$haptic, access13800Var);
                anonymousClass2.L$0 = obj;
                int i2 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((AudioExecutor1) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2Create = create(audioExecutor1, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return anonymousClass2Create.invokeSuspend(unit);
                }
                anonymousClass2Create.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    createPostFailedException createpostfailedexception = createPostFailedException.Initial;
                    this.L$0 = access15400.onNavigationEvent(audioExecutor1);
                    this.label = 1;
                    obj = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor1, false, createpostfailedexception, this, 1, (Object) null);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onExtraCallbackWithResult + 31;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
                if (!(!((HandlerScheduledExecutorService2) obj).IAuthTabCallbackStub())) {
                    minFresh.onNavigationEvent(this.$context, this.$haptic);
                }
                Unit unit = Unit.INSTANCE;
                int i7 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallback(noStore nostore, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(833814172);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(833814172, i, -1, "im.toss.tds.compose.foundation.hapticOnPress.<anonymous> (Clickable.kt:80)");
        }
        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nostore);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnNavigationEvent)) {
            int i3 = onTransact + 11;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onWarmupCompleted(context, nostore);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i5 = IAuthTabCallbackStub + 99;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0, context, (PointerInputEventHandler) objOnMinimized);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 17;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            getconfiguration = onWarmupCompleted;
        }
        if ((i & 8) != 0) {
            getcachingexecutorservice = asBinder;
        }
        return IAuthTabCallback(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, (getConfiguration<Float>) getconfiguration, getcachingexecutorservice);
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, @NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        if (!z) {
            return quirksExternalSyntheticBackport0;
        }
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(getconfiguration, onExtraCallbackWithResult) || camera2CapturePipelineTorchTaskExternalSyntheticLambda2 == null) {
            return quirksExternalSyntheticBackport0;
        }
        int i4 = IAuthTabCallbackStub + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0.onExtraCallback(addAdapter.onExtraCallback(getAdaptiveAdViewWidth.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, false, 2, null), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getconfiguration, getcachingexecutorservice));
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable final getSubtitle getsubtitle, @Nullable final String str, @Nullable final Role role) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 121;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return configureReward.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                configureReward.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final List onExtraCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            return deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent();
        }
        Intrinsics.checkNotNullParameter(rally, "");
        deprecated_proxy.onNavigationEvent.onExtraCallbackWithResult(deprecated_proxySelector.SMALL, EnumC0079certificatePinner.X).onNavigationEvent();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!rally.postMessage()) {
            int i4 = IAuthTabCallbackStub + 79;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            rally.receiveFile();
            minFresh.onNavigationEvent(context, noStore.Companion.access100());
            int i6 = onTransact + 61;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 3;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 27;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 26 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, Role role, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1216872724);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onTransact + 67;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1216872724, i, -1, "im.toss.tds.compose.foundation.wiggle.<anonymous> (Clickable.kt:116)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 107;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    List listOnWarmupCompleted = configureReward.onWarmupCompleted((Rally) obj2);
                    int i8 = IAuthTabCallback + 63;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return listOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final Rally rally = (Rally) RallyKt.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 515399683, -515399667, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{0, null, 0, null, null, 0, null, null, null, null, null, null, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 24576, 16383}, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted());
        final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, rally, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rally);
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | zOnExtraCallback)) {
            int i5 = IAuthTabCallbackStub + 73;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            obj = objOnMinimized2;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Function0 function0 = new Function0() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 97;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitIAuthTabCallback = configureReward.IAuthTabCallback(rally, context);
                        int i10 = onNavigationEvent + 9;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                obj = function0;
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, true, str, role, (Function0) obj);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onTransact + 3;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0IAuthTabCallback2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(boolean z, long j, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        Object objOnMinimized;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 7;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            int i5 = IAuthTabCallbackStub + 25;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i7 = IAuthTabCallbackStub + 123;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 60 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(251625228, i, -1, "im.toss.tds.compose.foundation.ProvideMinTouchSize.<anonymous> (Clickable.kt:152)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = getPhysicalCameraCharacteristics.onExtraCallbackWithResult(function2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Function2 function22 = (Function2) objOnMinimized;
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1449551534);
                    function22.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1449345105);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraInfo.onExtraCallbackWithResult(j), VirtualCameraInfo.onWarmupCompleted(j));
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    function22.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onTransact + 3;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                Function2 function222 = (Function2) objOnMinimized;
                if (z) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onTransact + 51;
        IAuthTabCallbackStub = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final long j, boolean z, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final boolean z2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1732668364);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i6 = IAuthTabCallbackStub + 113;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
            int i8 = onTransact + 87;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                int i11 = IAuthTabCallbackStub + 15;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 256 : 128;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i13 = IAuthTabCallbackStub;
                int i14 = i13 + 33;
                onTransact = i14 % 128;
                Object obj = null;
                if (i14 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i10 != 0) {
                    int i15 = i13 + 77;
                    onTransact = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 5 / 2;
                    }
                    z2 = false;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = IAuthTabCallbackStub + 11;
                    onTransact = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732668364, i3, -1, "im.toss.tds.compose.foundation.ProvideMinTouchSize (Clickable.kt:148)");
                }
                accessisMonitoringp accessismonitoringpWriteTypedObject = needCorrectJpegMetadata.writeTypedObject();
                ViewConfiguration viewConfiguration = ViewConfiguration.get((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                Intrinsics.checkNotNullExpressionValue(viewConfiguration, "");
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringpWriteTypedObject.onExtraCallback(new isAdLoaded(viewConfiguration, j, null)), ForwardingCameraControl.onExtraCallback(251625228, true, new Function2() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda13
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i20 % 128;
                        if (i20 % 2 == 0) {
                            return configureReward.onExtraCallbackWithResult(z2, j, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        configureReward.onExtraCallbackWithResult(z2, j, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onTransact + 11;
                    IAuthTabCallbackStub = i19 % 128;
                    if (i19 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i20 = 22 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            final boolean z3 = z2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda14
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i21 = 2 % 2;
                        int i22 = onWarmupCompleted + 23;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        Unit unitOnExtraCallbackWithResult = configureReward.onExtraCallbackWithResult(j, z3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i24 = onExtraCallbackWithResult + 93;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                });
                int i21 = onTransact + 119;
                IAuthTabCallbackStub = i21 % 128;
                int i22 = i21 % 2;
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        final boolean z32 = z2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final <T> getThumbPosition<T> onExtraCallback(boolean z) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 105;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.asBinder();
        } else {
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
        }
        return getSplitTrack.onExtraCallback(getstarratingcontentviewgroupOnExtraCallbackWithResult, 0, 2, (Object) null);
    }

    public static final class onExtraCallbackWithResult implements toMetersPerSecond {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        onExtraCallbackWithResult() {
        }

        public rotate IAuthTabCallback(long j, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            rotate rotateVarIAuthTabCallback = new AppLovinAdClickListener(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(Float.intBitsToFloat((int) (4294967295L & j)) / 5.0f), null).IAuthTabCallback(j, extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            int i2 = onNavigationEvent + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return rotateVarIAuthTabCallback;
            }
            throw null;
        }
    }

    static {
        int i = asInterface + 51;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static final onItemClicked IAuthTabCallbackStub(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getThumbPosition getthumbpositionOnExtraCallback = onExtraCallback(z);
        int i4 = onTransact + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return getthumbpositionOnExtraCallback;
    }

    public static final getCachingExecutorService onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getCachingExecutorService getcachingexecutorservice = asBinder;
        int i5 = i2 + 29;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return getcachingexecutorservice;
    }

    public static final toMetersPerSecond IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        toMetersPerSecond tometerspersecond = onExtraCallback;
        int i5 = i3 + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return tometerspersecond;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        getConfiguration<Float> getconfiguration = onWarmupCompleted;
        int i5 = i3 + 105;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return getconfiguration;
    }

    public static final getConfiguration<Float> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getConfiguration<Float> getconfiguration = onExtraCallbackWithResult;
        int i5 = i2 + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return getconfiguration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
        int i = 2 % 2;
        Object obj = null;
        if (((Boolean) objArr[0]).booleanValue()) {
            int i2 = onTransact + 59;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                getIconContentView.onWarmupCompleted.asBinder();
                throw null;
            }
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.asBinder();
        } else {
            getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
        }
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getstarratingcontentviewgroupOnExtraCallbackWithResult, 0, 2, (Object) null);
        int i3 = onTransact + 17;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return getthumbpositionOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final onItemClicked IAuthTabCallback(boolean z) {
        getStarRatingContentViewGroup getstarratingcontentviewgroupAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
            if (z) {
                getstarratingcontentviewgroupAsBinder = getIconContentView.onWarmupCompleted.asBinder();
            } else {
                getstarratingcontentviewgroupAsBinder = getIconContentView.onWarmupCompleted.onExtraCallback();
                int i4 = IAuthTabCallbackStub + 41;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (z) {
        }
        return getSplitTrack.onExtraCallback(getstarratingcontentviewgroupAsBinder, 0, 2, (Object) null);
    }

    public static /* synthetic */ getConfiguration onExtraCallbackWithResult(deprecated_url deprecated_urlVar, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 99;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            f = onWarmupCompleted.onExtraCallback().floatValue();
        }
        return onExtraCallback(deprecated_urlVar, f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getConfiguration<Float> onExtraCallback(@NotNull deprecated_url deprecated_urlVar, float f) throws NoWhenBranchMatchedException {
        float f2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_urlVar, "");
        int i2 = onExtraCallback.onWarmupCompleted[deprecated_urlVar.ordinal()];
        if (i2 == 1) {
            int i3 = IAuthTabCallbackStub + 35;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 2;
            }
            f2 = 0.96f;
        } else if (i2 == 2) {
            f2 = 0.9f;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0.92f;
        }
        getConfiguration<Float> getconfigurationOnExtraCallback = onExtraCallback(f2, f);
        int i5 = IAuthTabCallbackStub + 79;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return getconfigurationOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getCachingExecutorService IAuthTabCallback(@NotNull deprecated_url deprecated_urlVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_urlVar, "");
        int i2 = onExtraCallback.onWarmupCompleted[deprecated_urlVar.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 47;
            int i4 = i3 % 128;
            onTransact = i4;
            if (i3 % 2 != 0 ? i2 != 2 : i2 != 5) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                getCachingExecutorService getcachingexecutorservice = onNavigationEvent;
                int i5 = i4 + 1;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    return getcachingexecutorservice;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return IAuthTabCallback;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, boolean z2, boolean z3, boolean z4, String str, Role role, Function0 function0, int i, Object obj) {
        getConfiguration getconfiguration2;
        boolean z5;
        Role role2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onTransact + 39;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            getconfiguration2 = onWarmupCompleted;
        } else {
            getconfiguration2 = getconfiguration;
        }
        getCachingExecutorService getcachingexecutorservice2 = (i & 2) != 0 ? asBinder : getcachingexecutorservice;
        if ((i & 4) != 0) {
            int i5 = onTransact + 75;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z5 = false;
        } else {
            z5 = z;
        }
        boolean z6 = (i & 8) != 0 ? true : z2;
        boolean z7 = (i & 16) != 0 ? false : z3;
        boolean z8 = (i & 32) != 0 ? false : z4;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            int i7 = IAuthTabCallbackStub + 123;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            role2 = null;
        } else {
            role2 = role;
        }
        return onWarmupCompleted(quirksExternalSyntheticBackport0, getconfiguration2, getcachingexecutorservice2, z5, z6, z7, z8, str2, role2, function0);
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final getConfiguration<Float> getconfiguration, @NotNull final getCachingExecutorService getcachingexecutorservice, final boolean z, final boolean z2, final boolean z3, final boolean z4, @Nullable final String str, @Nullable final Role role, @Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = configureReward.IAuthTabCallback(z, getconfiguration, getcachingexecutorservice, z2, z3, z4, str, role, function0, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallback + 109;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return quirksExternalSyntheticBackport0IAuthTabCallback;
                }
                throw null;
            }
        }, 1, (Object) null);
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(boolean z, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z2, boolean z3, boolean z4, String str, Role role, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getSubtitle getsubtitleOnWarmupCompleted;
        noStore nostoreOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-401105338);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-401105338, i, -1, "im.toss.tds.compose.foundation.tdsClickable.<anonymous> (Clickable.kt:240)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        if (z) {
            int i3 = onTransact + 29;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            getsubtitleOnWarmupCompleted = addRewardedAdapter.onWarmupCompleted(0L, null, null, null, 15, null);
        } else {
            getsubtitleOnWarmupCompleted = null;
        }
        noStore.onExtraCallback onextracallback2 = noStore.Companion;
        if (!(!z3)) {
            nostoreOnExtraCallbackWithResult = (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{onextracallback2}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        } else {
            nostoreOnExtraCallbackWithResult = onextracallback2.onExtraCallbackWithResult();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitleOnWarmupCompleted, getconfiguration, getcachingexecutorservice, z2, nostoreOnExtraCallbackWithResult, z4, str, role, function0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 91;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(boolean z, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z2, boolean z3, boolean z4, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        noStore nostoreOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 7;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-891101952);
            int i4 = 42 / 0;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-891101952, i, -1, "im.toss.tds.compose.foundation.tdsCombinedClickable.<anonymous> (Clickable.kt:269)");
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-891101952);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            int i5 = IAuthTabCallbackStub + 49;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        Object obj = null;
        getTitleMarginEnd gettitlemarginendOnWarmupCompleted = z ? addRewardedAdapter.onWarmupCompleted(0L, null, null, null, 15, null) : null;
        noStore.onExtraCallback onextracallback2 = noStore.Companion;
        if (z3) {
            nostoreOnExtraCallbackWithResult = (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{onextracallback2}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
        } else {
            nostoreOnExtraCallbackWithResult = onextracallback2.onExtraCallbackWithResult();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), -917613367, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, gettitlemarginendOnWarmupCompleted, getconfiguration, getcachingexecutorservice, Boolean.valueOf(z2), nostoreOnExtraCallbackWithResult, Boolean.valueOf(z4), str, role, str2, function0, function02, function03}, 917613371, zzgc.onExtraCallbackWithResult());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onTransact + 77;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = IAuthTabCallbackStub + 31;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport02;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, noStore nostore, boolean z2, String str, Role role, Function0 function0, int i, Object obj) {
        String str2;
        Role role2;
        int i2 = 2 % 2;
        int i3 = onTransact + 93;
        IAuthTabCallbackStub = i3 % 128;
        getConfiguration getconfiguration2 = (i3 % 2 == 0 ? (i & 4) == 0 : (i & 3) == 0) ? getconfiguration : onWarmupCompleted;
        getCachingExecutorService getcachingexecutorservice2 = (i & 8) != 0 ? asBinder : getcachingexecutorservice;
        boolean z3 = (i & 16) != 0 ? true : z;
        noStore nostoreOnExtraCallbackWithResult = (i & 32) != 0 ? noStore.Companion.onExtraCallbackWithResult() : nostore;
        boolean z4 = (i & 64) != 0 ? false : z2;
        Object obj2 = null;
        if ((i & 128) != 0) {
            int i4 = IAuthTabCallbackStub + 5;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 256) != 0) {
            int i6 = IAuthTabCallbackStub + 13;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            role2 = null;
        } else {
            role2 = role;
        }
        return onExtraCallback(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getconfiguration2, getcachingexecutorservice2, z3, nostoreOnExtraCallbackWithResult, z4, str2, role2, function0);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable final getSubtitle getsubtitle, @NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice, boolean z, @NotNull noStore nostore, boolean z2, @Nullable final String str, @Nullable final Role role, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getconfiguration, getcachingexecutorservice, z, nostore, z2, str, role, function0, (Function2<? super QuirksExternalSyntheticBackport0, ? super Function0<Unit>, ? extends QuirksExternalSyntheticBackport0>) new Function2() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return configureReward.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, (QuirksExternalSyntheticBackport0) obj, (Function0) obj2);
                }
                configureReward.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role, (QuirksExternalSyntheticBackport0) obj, (Function0) obj2);
                throw null;
            }
        }));
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, Role role, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, false, str, role, function0, 4, (Object) null);
        int i4 = IAuthTabCallbackStub + 119;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[1];
        final getSubtitle getsubtitle = (getSubtitle) objArr[2];
        getConfiguration getconfiguration = (getConfiguration) objArr[3];
        getCachingExecutorService getcachingexecutorservice = (getCachingExecutorService) objArr[4];
        final boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        noStore nostore = (noStore) objArr[6];
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        final String str = (String) objArr[8];
        final Role role = (Role) objArr[9];
        final String str2 = (String) objArr[10];
        final Function0 function0 = (Function0) objArr[11];
        final Function0 function02 = (Function0) objArr[12];
        Function0 function03 = (Function0) objArr[13];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, (getConfiguration<Float>) getconfiguration, getcachingexecutorservice, zBooleanValue, nostore, zBooleanValue2, str, role, (Function0<Unit>) function03, (Function2<? super QuirksExternalSyntheticBackport0, ? super Function0<Unit>, ? extends QuirksExternalSyntheticBackport0>) new Function2() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    quirksExternalSyntheticBackport0OnExtraCallback2 = configureReward.onExtraCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, zBooleanValue, str, role, str2, function0, function02, (QuirksExternalSyntheticBackport0) obj, (Function0) obj2);
                    int i4 = 36 / 0;
                } else {
                    quirksExternalSyntheticBackport0OnExtraCallback2 = configureReward.onExtraCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, zBooleanValue, str, role, str2, function0, function02, (QuirksExternalSyntheticBackport0) obj, (Function0) obj2);
                }
                int i5 = onExtraCallback + 87;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 32 / 0;
                }
                return quirksExternalSyntheticBackport0OnExtraCallback2;
            }
        }));
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[0];
        getSubtitle getsubtitle = (getSubtitle) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        Role role = (Role) objArr[4];
        String str2 = (String) objArr[5];
        Function0 function0 = (Function0) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[8];
        Function0 function03 = (Function0) objArr[9];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function03, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, zBooleanValue, str, role, str2, function0, function02, false, function03, 256, (Object) null);
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, getConfiguration<Float> getconfiguration, getCachingExecutorService getcachingexecutorservice, boolean z, noStore nostore, boolean z2, String str, Role role, Function0<Unit> function0, Function2<? super QuirksExternalSyntheticBackport0, ? super Function0<Unit>, ? extends QuirksExternalSyntheticBackport0> function2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2;
        MediationAdapterRouter mediationAdapterRouterOnWarmupCompleted;
        addAdViewAdapter addadviewadapter;
        toMetersPerSecond tometerspersecondOnNavigationEvent;
        int i = 2 % 2;
        Object obj = null;
        if (function0 == null) {
            quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
        } else if (z) {
            int i2 = onTransact + 43;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Intrinsics.areEqual(nostore, noStore.Companion.onExtraCallbackWithResult());
                obj.hashCode();
                throw null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            if (Intrinsics.areEqual(nostore, noStore.Companion.onExtraCallbackWithResult())) {
                quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport02;
            } else {
                quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport02.onExtraCallback((QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), 987907176, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport02, true, nostore}, -987907176, zzgc.onExtraCallbackWithResult()));
            }
            if (Intrinsics.areEqual(getconfiguration, onWarmupCompleted) && Intrinsics.areEqual(getcachingexecutorservice, asBinder)) {
                int i3 = onTransact + 57;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                mediationAdapterRouterOnWarmupCompleted = (MediationAdapterRouter) addAdapter.onWarmupCompleted(1972255785, -1972255784, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{null, null, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
            } else {
                mediationAdapterRouterOnWarmupCompleted = addAdapter.onWarmupCompleted(getconfiguration, getcachingexecutorservice);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getPopupTheme.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, mediationAdapterRouterOnWarmupCompleted);
            if (getsubtitle instanceof addAdViewAdapter) {
                int i5 = IAuthTabCallbackStub + 39;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                addadviewadapter = (addAdViewAdapter) getsubtitle;
            } else {
                addadviewadapter = null;
            }
            if (addadviewadapter != null) {
                int i6 = IAuthTabCallbackStub + 29;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                tometerspersecondOnNavigationEvent = addadviewadapter.onNavigationEvent();
            } else {
                int i8 = IAuthTabCallbackStub + 51;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                tometerspersecondOnNavigationEvent = null;
            }
            if (tometerspersecondOnNavigationEvent != null) {
                quirksExternalSyntheticBackport0IAuthTabCallback = quirksExternalSyntheticBackport0IAuthTabCallback.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, tometerspersecondOnNavigationEvent));
            }
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0IAuthTabCallback.onExtraCallback((QuirksExternalSyntheticBackport0) function2.invoke(quirksExternalSyntheticBackport0, function0));
        } else if (z2) {
            quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, role);
        }
        if (!z) {
            int i10 = IAuthTabCallbackStub + 45;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, false, onNavigationEvent.IAuthTabCallback, 1, (Object) null));
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
    }

    static final class onNavigationEvent implements Function1<useAndConfigureProgramWithTexture, Unit> {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 111;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onNavigationEvent() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 43 / 0;
            }
            return unit;
        }

        public final void onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, setByteOrder setbyteorder, float f, float f2, deprecated_url deprecated_urlVar, List list, boolean z2, noStore nostore, boolean z3, long j, String str, Function0 function0, Function1 function1, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i, Object obj) {
        deprecated_url deprecated_urlVar2;
        noStore nostoreOnExtraCallbackWithResult;
        long j2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i2 = 2 % 2;
        int i3 = onTransact + 13;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        boolean z4 = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? z : true;
        setByteOrder setbyteorder2 = (i & 2) != 0 ? null : setbyteorder;
        float f3 = (i & 4) != 0 ? 1.0f : f;
        float f4 = (i & 8) != 0 ? 0.96f : f2;
        if ((i & 16) != 0) {
            int i5 = i4 + 81;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            deprecated_urlVar2 = null;
        } else {
            deprecated_urlVar2 = deprecated_urlVar;
        }
        List listEmptyList = (i & 32) != 0 ? CollectionsKt.emptyList() : list;
        boolean z5 = (i & 64) == 0 ? z2 : true;
        if ((i & 128) != 0) {
            int i6 = IAuthTabCallbackStub + 75;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            nostoreOnExtraCallbackWithResult = noStore.Companion.onExtraCallbackWithResult();
        } else {
            nostoreOnExtraCallbackWithResult = nostore;
        }
        boolean z6 = (i & 256) != 0 ? false : z3;
        if ((i & 512) != 0) {
            int i8 = onTransact + 71;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            j2 = 300;
        } else {
            j2 = j;
        }
        String str2 = (i & 1024) != 0 ? null : str;
        Function1 function12 = (i & 4096) != 0 ? null : function1;
        if ((i & 8192) != 0) {
            int i10 = onTransact + 49;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 50 / 0;
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = null;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        return (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), 1830533827, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, Boolean.valueOf(z4), setbyteorder2, Float.valueOf(f3), Float.valueOf(f4), deprecated_urlVar2, listEmptyList, Boolean.valueOf(z5), nostoreOnExtraCallbackWithResult, Boolean.valueOf(z6), Long.valueOf(j2), str2, function0, function12, camera2CapturePipelineTorchTaskExternalSyntheticLambda22}, -1830533825, zzgc.onExtraCallbackWithResult());
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final setByteOrder setbyteorder = (setByteOrder) objArr[2];
        final float fFloatValue = ((Number) objArr[3]).floatValue();
        final float fFloatValue2 = ((Number) objArr[4]).floatValue();
        final deprecated_url deprecated_urlVar = (deprecated_url) objArr[5];
        final List list = (List) objArr[6];
        final boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        final noStore nostore = (noStore) objArr[8];
        final boolean zBooleanValue3 = ((Boolean) objArr[9]).booleanValue();
        final long jLongValue = ((Number) objArr[10]).longValue();
        final String str = (String) objArr[11];
        final Function0 function0 = (Function0) objArr[12];
        final Function1 function1 = (Function1) objArr[13];
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[14];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        Object obj = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = configureReward.onWarmupCompleted(function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, deprecated_urlVar, fFloatValue2, list, zBooleanValue2, nostore, zBooleanValue3, jLongValue, str, function1, zBooleanValue, fFloatValue, setbyteorder, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i5 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return quirksExternalSyntheticBackport0OnWarmupCompleted;
            }
        }, 1, (Object) null);
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(getReward getreward, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        float fOnNavigationEvent = getreward.onNavigationEvent().onNavigationEvent();
        fliphorizontally.IAuthTabCallbackStubProxy(fOnNavigationEvent);
        fliphorizontally.getInterfaceDescriptor(fOnNavigationEvent);
        fliphorizontally.asInterface(createUShort.Companion.onExtraCallbackWithResult());
        fliphorizontally.onWarmupCompleted(false);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class IAuthTabCallback implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 75 / 0;
            }
        }

        IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            onNavigationEvent((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        public final void onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, deprecated_url deprecated_urlVar, float f, List list, boolean z, noStore nostore, boolean z2, long j, String str, Function1 function1, boolean z3, float f2, setByteOrder setbyteorder, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        deprecated_url deprecated_urlVar2;
        long jOnTransact;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-382648358);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-382648358, i, -1, "im.toss.tds.compose.foundation.clickWithAnim.<anonymous> (Clickable.kt:454)");
        }
        if (function0 == null) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return quirksExternalSyntheticBackport0;
        }
        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new getReward(f2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getReward getreward = (getReward) objOnMinimized;
        if (camera2CapturePipelineTorchTaskExternalSyntheticLambda2 == null) {
            int i3 = onTransact + 81;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-633820063);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1642121526);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = IAuthTabCallbackStub + 57;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 5;
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        if (deprecated_urlVar == null) {
            deprecated_urlVar2 = deprecated_url.Default;
            int i7 = IAuthTabCallbackStub + 103;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        } else {
            deprecated_urlVar2 = deprecated_urlVar;
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(deprecated_urlVar2.ordinal());
        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | zIAuthTabCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized3 = deprecated_urlVar == null ? onExtraCallback(f, f2) : onExtraCallback(deprecated_urlVar2, f2);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        getConfiguration getconfiguration = (getConfiguration) objOnMinimized3;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(deprecated_urlVar2.ordinal());
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            int i9 = onTransact + 47;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = IAuthTabCallback(deprecated_urlVar2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getAdaptiveAdViewWidth.IAuthTabCallback(onextracallback.onExtraCallback(new MediationAdapterBase1(context, getreward, getconfiguration, (getCachingExecutorService) objOnMinimized4, list, z, nostore, z2, j, str, function0, function1)), camera2CapturePipelineTorchTaskExternalSyntheticLambda23, z);
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.foundation.ClickableKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj) {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 41;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitIAuthTabCallback = configureReward.IAuthTabCallback(getreward, (flipHorizontally) obj);
                    int i14 = onExtraCallback + 35;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized5).onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
        if (z3) {
            if (setbyteorder != null) {
                int i11 = IAuthTabCallbackStub + 63;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                jOnTransact = setbyteorder.access100();
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getPopupTheme.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, getSharedInstance.onExtraCallback(true, false, jOnTransact, null, null, null, null, null, 248, null)));
        }
        if (!z) {
            int i13 = onTransact + 113;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, IAuthTabCallback.onNavigationEvent, 1, (Object) null));
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static /* synthetic */ onItemClicked onNavigationEvent(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (onItemClicked) onExtraCallback(zzgc.onExtraCallbackWithResult(), -845141538, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 845141541, iOnExtraCallbackWithResult);
    }

    private static final onItemClicked asBinder(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (onItemClicked) onExtraCallback(zzgc.onExtraCallbackWithResult(), 325482748, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -325482739, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(long j, boolean z, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(zzgc.onExtraCallbackWithResult(), 1855643096, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1855643091, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ WeakHashMap onWarmupCompleted() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        return (WeakHashMap) onExtraCallback(zzgc.onExtraCallbackWithResult(), -893754090, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[0], 893754091, iOnExtraCallbackWithResult);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable setByteOrder setbyteorder, float f, float f2, @Nullable deprecated_url deprecated_urlVar, @NotNull List<isQueryRefinementEnabled<Float, onSuggestionsKey>> list, boolean z2, @NotNull noStore nostore, boolean z3, long j, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable Function1<? super isAdaptiveAdViewFormat, Unit> function1, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), setbyteorder, Float.valueOf(f), Float.valueOf(f2), deprecated_urlVar, list, Boolean.valueOf(z2), nostore, Boolean.valueOf(z3), Long.valueOf(j), str, function0, function1, camera2CapturePipelineTorchTaskExternalSyntheticLambda2};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), 1830533827, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1830533825, iOnExtraCallbackWithResult);
    }

    public static final getConfiguration<Float> onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        return (getConfiguration) onExtraCallback(zzgc.onExtraCallbackWithResult(), -1629622331, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[0], 1629622338, iOnExtraCallbackWithResult);
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @NotNull noStore nostore) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), nostore};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), 987907176, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -987907176, iOnExtraCallbackWithResult);
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice, boolean z, @NotNull noStore nostore, boolean z2, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03) {
        Object[] objArr = {quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getconfiguration, getcachingexecutorservice, Boolean.valueOf(z), nostore, Boolean.valueOf(z2), str, role, str2, function0, function02, function03};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), -917613367, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 917613371, iOnExtraCallbackWithResult);
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, boolean z, String str, Role role, String str2, Function0 function0, Function0 function02, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function03) {
        Object[] objArr = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Boolean.valueOf(z), str, role, str2, function0, function02, quirksExternalSyntheticBackport0, function03};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onExtraCallback(zzgc.onExtraCallbackWithResult(), -1162085188, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 1162085194, iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(Rally rally, Context context) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(zzgc.onExtraCallbackWithResult(), -325256003, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[]{rally, context}, 325256011, iOnExtraCallbackWithResult);
    }
}
