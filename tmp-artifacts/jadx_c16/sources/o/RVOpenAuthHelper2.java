package o;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.base.BaseActivity;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.home.core.model.CardBillAccount;
import im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet$;
import im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet$onCreate$1$1$1$1$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getViewTypeCount;
import o.setCallToAction;
import o.setClickTrackingUrls;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVOpenAuthHelper2 extends BrickModuleImplExternalSyntheticLambda2 {
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackDefault = 0;
    private static int access000 = 1;
    private static int asInterface = 1;
    private static int getInterfaceDescriptor;
    private final String asBinder;
    private final Function1<CardBillAccount, Unit> onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;
    private final Map<String, String> onTransact;
    private final List<CardBillAccount> onWarmupCompleted;

    static {
        Object obj = null;
        int i = getInterfaceDescriptor + 3;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rVOpenAuthHelper2, camera2CameraMetadataExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 97;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = asInterface + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 73;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i5 | i3 | i;
        int i8 = (~((~i) | i3)) | i5;
        int i9 = ~((~i5) | i3);
        int i10 = i5 + i3 + i2 + (1132004924 * i4) + ((-2047965933) * i6);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i5) - 289800192) + ((-1513965855) * i3) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i2) + (1823473664 * i4) + (830210048 * i6) + ((-1143341056) * i11);
        int i13 = ((i5 * (-767560105)) - 1188649921) + (i3 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i2 * (-767559561)) + (i4 * 1544553956) + (i6 * (-1468578859)) + (i11 * (-2108293120));
        int i14 = i12 + (i13 * i13 * (-2075787264));
        if (i14 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i14 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i14 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i14 != 5) {
            RVOpenAuthHelper2 rVOpenAuthHelper2 = (RVOpenAuthHelper2) objArr[0];
            int i15 = 2 % 2;
            int i16 = asInterface + 93;
            IAuthTabCallbackDefault = i16 % 128;
            int i17 = i16 % 2;
            Unit unitAsInterface = asInterface(rVOpenAuthHelper2);
            int i18 = asInterface + 23;
            IAuthTabCallbackDefault = i18 % 128;
            int i19 = i18 % 2;
            return unitAsInterface;
        }
        RVOpenAuthHelper2 rVOpenAuthHelper22 = (RVOpenAuthHelper2) objArr[0];
        int i20 = 2 % 2;
        int i21 = asInterface + 71;
        int i22 = i21 % 128;
        IAuthTabCallbackDefault = i22;
        int i23 = i21 % 2;
        List<CardBillAccount> list = rVOpenAuthHelper22.onWarmupCompleted;
        int i24 = i22 + 39;
        asInterface = i24 % 128;
        int i25 = i24 % 2;
        return list;
    }

    public static /* synthetic */ Unit onExtraCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 53;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(rVOpenAuthHelper2, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(rVOpenAuthHelper2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -408075335, new Object[]{rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor, setDetectableSize}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 408075336, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i4 = asInterface + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(CardBillAccount cardBillAccount) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(cardBillAccount);
        int i4 = IAuthTabCallbackDefault + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return charSequenceIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RVOpenAuthHelper2 rVOpenAuthHelper2 = (RVOpenAuthHelper2) objArr[0];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        rVOpenAuthHelper2.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
        int i4 = IAuthTabCallbackDefault + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ BottomSheetHeader onNavigationEvent(RVOpenAuthHelper2 rVOpenAuthHelper2, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeaderOnExtraCallbackWithResult = onExtraCallbackWithResult(rVOpenAuthHelper2, context);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = asInterface + 41;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return bottomSheetHeaderOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RVOpenAuthHelper2 rVOpenAuthHelper2 = (RVOpenAuthHelper2) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rVOpenAuthHelper2, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackDefault + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RVOpenAuthHelper2 rVOpenAuthHelper2 = (RVOpenAuthHelper2) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rVOpenAuthHelper2);
        int i4 = asInterface + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {rVOpenAuthHelper2, camera2CameraMetadataExternalSyntheticLambda1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i5 == 0) {
            return (Unit) onExtraCallback(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2077104063, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 2077104066, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        int i6 = 56 / 0;
        return (Unit) onExtraCallback(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2077104063, objArr, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 2077104066, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rVOpenAuthHelper2, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 23;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rVOpenAuthHelper2, setDetectableSize);
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RVOpenAuthHelper2(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull List<CardBillAccount> list, @NotNull Map<String, String> map, @NotNull Function1<? super CardBillAccount, Unit> function1, @NotNull Function0<Unit> function0) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.asBinder = str;
        this.onWarmupCompleted = list;
        this.onTransact = map;
        this.onExtraCallbackWithResult = function1;
        this.onNavigationEvent = function0;
    }

    public static final /* synthetic */ Map onNavigationEvent(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = rVOpenAuthHelper2.onTransact;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return map;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        onNavigationEvent(ForwardingCameraControl.onExtraCallbackWithResult(-1075440390, true, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda11(this)));
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(RVOpenAuthHelper2 rVOpenAuthHelper2, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(rVOpenAuthHelper2, setDetectableSize);
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ CharSequence onNavigationEvent(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(cardBillAccount);
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return charSequenceOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = RVOpenAuthHelper2.this.new onWarmupCompleted(access13800Var);
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertByteArrayToFloatArray.onNavigationEvent(1395431L, false, (String) null, (Map) null, new HomeSelectablePaymentAccountsBottomSheet$onCreate$1$1$1$1$.ExternalSyntheticLambda0(RVOpenAuthHelper2.this), 14, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final CharSequence onExtraCallbackWithResult(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strValueOf = String.valueOf(cardBillAccount.onExtraCallback());
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return strValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, SetDetectableSize setDetectableSize) {
            String str;
            int i = 2 % 2;
            setDetectableSize.onExtraCallback(RVOpenAuthHelper2.onNavigationEvent(rVOpenAuthHelper2));
            List list = (List) RVOpenAuthHelper2.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 851732282, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -851732277, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
                    int i3 = 6 / 0;
                } else {
                    arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            setDetectableSize.onExtraCallback("connected_org_codes", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            setDetectableSize.onExtraCallback("connected_accnt_cnt", Integer.valueOf(((List) RVOpenAuthHelper2.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 851732282, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -851732277, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())).size()));
            List list2 = (List) RVOpenAuthHelper2.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 851732282, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -851732277, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
            if (list2 instanceof Collection) {
                int i4 = onWarmupCompleted + 117;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    list2.isEmpty();
                    throw null;
                }
                if (list2.isEmpty()) {
                    str = "N";
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((CardBillAccount) it2.next()).IAuthTabCallbackDefault()) {
                            int i5 = onExtraCallback + 75;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            str = "Y";
                            break;
                        }
                    }
                    str = "N";
                }
            }
            setDetectableSize.onExtraCallback("tossbank_accnt_yn", str);
            setDetectableSize.onExtraCallback("current_screen", RVOpenAuthHelper2.onNavigationEvent(rVOpenAuthHelper2).get("currentScreen"));
            setDetectableSize.onExtraCallback("bank_code_list", CollectionsKt.joinToString$default((List) RVOpenAuthHelper2.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 851732282, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -851732277, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new HomeSelectablePaymentAccountsBottomSheet$onCreate$1$1$1$1$.ExternalSyntheticLambda1(), 30, (Object) null));
            return Unit.INSTANCE;
        }
    }

    private static final BottomSheetHeader onExtraCallbackWithResult(RVOpenAuthHelper2 rVOpenAuthHelper2, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(rVOpenAuthHelper2.asBinder);
        int i2 = IAuthTabCallbackDefault + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return bottomSheetHeader;
    }

    static final class IAuthTabCallback implements getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ CardBillAccount onWarmupCompleted;

        IAuthTabCallback(CardBillAccount cardBillAccount) {
            this.onWarmupCompleted = cardBillAccount;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
                int i5 = onNavigationEvent + 101;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                    throw null;
                }
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i6 = onExtraCallback + 71;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 82 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1867433184, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:98)");
                    int i8 = onNavigationEvent + 117;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            w3bVar.onWarmupCompleted(this.onWarmupCompleted.onExtraCallbackWithResult(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(setExtensionStrength.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)), 0L, (QuirkSettingsLoader) null, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 15) & 458752, 28);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class onExtraCallbackWithResult implements getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CardBillAccount onWarmupCompleted;

        onExtraCallbackWithResult(CardBillAccount cardBillAccount) {
            this.onWarmupCompleted = cardBillAccount;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            boolean z;
            long jLongValue;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i5 % 128;
                    i3 = i5 % 2 != 0 ? 5 : 4;
                } else {
                    i3 = 2;
                }
                i2 = i | i3;
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i6 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(142432084, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:106)");
                int i8 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            String strIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-561712133);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-561711173);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            w5aVar.IAuthTabCallbackStub(strIAuthTabCallback, disableTextLayoutManagerCacheAndroid.onExtraCallbackWithResult(Long.valueOf(this.onWarmupCompleted.onNavigationEvent()), (cxxNativeAnimatedEnabled) null, 1, (Object) null), new getHumanReadableName(jLongValue, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i10 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    static final class IAuthTabCallbackStub implements getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<CardBillAccount> onExtraCallbackWithResult;
        final /* synthetic */ CardBillAccount onWarmupCompleted;

        IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<CardBillAccount> getsupportedhighspeedresolutionsfor, CardBillAccount cardBillAccount) {
            this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = cardBillAccount;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 17) != 16) {
                int i5 = IAuthTabCallback + 53;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i7 = onExtraCallback + 119;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            int i9 = IAuthTabCallback + 21;
            onExtraCallback = i9 % 128;
            Object obj = null;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 101;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2050526948, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:120)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2050526948, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:120)");
            }
            setStarRating.onExtraCallbackWithResult(new Object[]{Boolean.valueOf(Intrinsics.areEqual(this.onExtraCallbackWithResult.onExtraCallbackWithResult(), this.onWarmupCompleted)), null, false, setClickTrackingUrls.IAuthTabCallback.Line, setClickTrackingUrls.onNavigationEvent.Large, null, cameraCaptureResultEmptyCameraCaptureResult, 27648, 38}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    private static final CharSequence IAuthTabCallback(CardBillAccount cardBillAccount) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cardBillAccount, "");
        String strValueOf = String.valueOf(cardBillAccount.onExtraCallback());
        int i4 = IAuthTabCallbackDefault + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strValueOf;
    }

    private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(rVOpenAuthHelper2.onTransact);
        List<CardBillAccount> list = rVOpenAuthHelper2.onWarmupCompleted;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
            int i2 = IAuthTabCallbackDefault + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i4 = asInterface + 27;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        setDetectableSize.onExtraCallback("connected_org_codes", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        setDetectableSize.onExtraCallback("connected_accnt_cnt", Integer.valueOf(rVOpenAuthHelper2.onWarmupCompleted.size()));
        setDetectableSize.onExtraCallback("current_screen", rVOpenAuthHelper2.onTransact.get("currentScreen"));
        setDetectableSize.onExtraCallback("bank_code_list", CollectionsKt.joinToString$default(rVOpenAuthHelper2.onWarmupCompleted, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda10(), 30, (Object) null));
        return Unit.INSTANCE;
    }

    public static final class asInterface implements Function1 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final asInterface onExtraCallbackWithResult = new asInterface();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 117;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final Void onNavigationEvent(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            Void voidOnNavigationEvent = onNavigationEvent(obj);
            int i3 = IAuthTabCallback + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return voidOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1395435L, false, (String) null, (Map) null, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda9(rVOpenAuthHelper2), 14, (Object) null);
        rVOpenAuthHelper2.onNavigationEvent.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackDefault implements Function1<Integer, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ List onWarmupCompleted;

        public IAuthTabCallbackDefault(Function1 function1, List list) {
            this.onExtraCallback = function1;
            this.onWarmupCompleted = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(((Number) obj).intValue());
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(int i) {
            Object objInvoke;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                objInvoke = this.onExtraCallback.invoke(this.onWarmupCompleted.get(i));
                int i4 = 94 / 0;
            } else {
                objInvoke = this.onExtraCallback.invoke(this.onWarmupCompleted.get(i));
            }
            int i5 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 25;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asInterface + 35;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(966218727, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:141)");
            }
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
            getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
            enableCallbackErrorAtDuplicate enablecallbackerroratduplicate = enableCallbackErrorAtDuplicate.IAuthTabCallback;
            getBacktraceNote getbacktracenoteOnNavigationEvent = enablecallbackerroratduplicate.onNavigationEvent();
            getBacktraceNote getbacktracenoteOnExtraCallbackWithResult = enablecallbackerroratduplicate.onExtraCallbackWithResult();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i7 = asInterface + 17;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda14(rVOpenAuthHelper2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                        obj = externalSyntheticLambda14;
                    }
                    w4.onExtraCallbackWithResult(getbacktracenoteOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnExtraCallbackWithResult, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 3462, 384, 110578);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = asInterface + 111;
                        IAuthTabCallbackDefault = i9 % 128;
                        int i10 = i9 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    w4.onExtraCallbackWithResult(getbacktracenoteOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, getbacktracenoteOnExtraCallbackWithResult, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 3462, 384, 110578);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onTransact implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ RVOpenAuthHelper2 onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent;

        public onTransact(List list, RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
            this.IAuthTabCallback = list;
            this.onExtraCallback = rVOpenAuthHelper2;
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            Object obj;
            int i4;
            int i5;
            int i6 = 2 % 2;
            if ((i2 & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                    int i7 = onExtraCallbackWithResult + 73;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i3 = i2 | i5;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i9 = onWarmupCompleted + 53;
                    onExtraCallbackWithResult = i9 % 128;
                    i4 = i9 % 2 != 0 ? 88 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i10 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 19;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            CardBillAccount cardBillAccount = (CardBillAccount) this.IAuthTabCallback.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1783835950);
            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = onnavigationevent.onNavigationEvent();
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = onnavigationevent.onNavigationEvent();
            getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(142432084, true, new onExtraCallbackWithResult(cardBillAccount), cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1867433184, true, new IAuthTabCallback(cardBillAccount), cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(2050526948, true, new IAuthTabCallbackStub(this.onNavigationEvent, cardBillAccount), cameraCaptureResultEmptyCameraCaptureResult, 54);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.onExtraCallback);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardBillAccount);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2)) {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    asBinder asbinder = new asBinder(this.onNavigationEvent, cardBillAccount, this.onExtraCallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(asbinder);
                    obj = asbinder;
                }
            }
            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback3, onextracallbackOnNavigationEvent2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 1772934, 384, 110482);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            Number number = (Number) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            IAuthTabCallback(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }
    }

    private static final Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List<CardBillAccount> list = rVOpenAuthHelper2.onWarmupCompleted;
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), (Function1) null, new IAuthTabCallbackDefault(asInterface.onExtraCallbackWithResult, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onTransact(list, rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "add", (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(966218727, true, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda13(rVOpenAuthHelper2)), 2, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, enableCallbackErrorAtDuplicate.IAuthTabCallback.onExtraCallback(), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RVOpenAuthHelper2 rVOpenAuthHelper2 = (RVOpenAuthHelper2) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(rVOpenAuthHelper2.onTransact);
        List<CardBillAccount> list = rVOpenAuthHelper2.onWarmupCompleted;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallbackDefault + 23;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
                int i3 = 41 / 0;
            } else {
                arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!StringsKt.isBlank((String) obj)) {
                int i4 = IAuthTabCallbackDefault + 67;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList2.add(obj);
                    int i5 = 21 / 0;
                } else {
                    arrayList2.add(obj);
                }
            }
        }
        setDetectableSize.onExtraCallback("connected_org_codes", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        setDetectableSize.onExtraCallback("connected_accnt_cnt", Integer.valueOf(rVOpenAuthHelper2.onWarmupCompleted.size()));
        setDetectableSize.onExtraCallback("reference_id", ((CardBillAccount) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).asInterface());
        String strIAuthTabCallbackStub = ((CardBillAccount) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub.length() == 0) {
            int i6 = IAuthTabCallbackDefault + 29;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            strIAuthTabCallbackStub = null;
        }
        setDetectableSize.onExtraCallback("selected_org_code", strIAuthTabCallbackStub);
        setDetectableSize.onExtraCallback("confirm_yn", "Y");
        setDetectableSize.onExtraCallback("current_screen", rVOpenAuthHelper2.onTransact.get("currentScreen"));
        Integer numValueOf = Integer.valueOf(((CardBillAccount) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallback());
        setDetectableSize.onExtraCallback("selected_bank_code", numValueOf.intValue() > 0 ? numValueOf : null);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1395437L, false, (String) null, (Map) null, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda1(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor), 14, (Object) null);
        rVOpenAuthHelper2.onExtraCallbackWithResult.invoke(getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i5 = asInterface + 57;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var))) {
                i3 = 4;
            } else {
                int i6 = IAuthTabCallbackDefault + 57;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1165236364, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:183)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_confirm, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i8 = asInterface + 1;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda8(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                    obj2 = externalSyntheticLambda8;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("confirm_yn", "N");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1395437L, false, (String) null, (Map) null, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda2(), 14, (Object) null);
        rVOpenAuthHelper2.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i7 = IAuthTabCallbackDefault + 23;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 95 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    i3 = 4;
                } else {
                    int i9 = asInterface + 101;
                    IAuthTabCallbackDefault = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 5;
                    }
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = asInterface + 11;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-701899342, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:205)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(viva.republica.toss.R.string.close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = null;
            if (!zOnExtraCallback) {
                int i13 = IAuthTabCallbackDefault + 9;
                asInterface = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda12(rVOpenAuthHelper2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                    obj2 = externalSyntheticLambda12;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = asInterface + 27;
                    IAuthTabCallbackDefault = i14 % 128;
                    if (i14 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallbackDefault + 75;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1938001490, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous>.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:68)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = null;
            if (!zOnExtraCallback) {
                int i5 = IAuthTabCallbackDefault + 67;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = rVOpenAuthHelper2.new onWarmupCompleted(null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i6 = IAuthTabCallbackDefault + 73;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    int i7 = asInterface + 61;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda4(rVOpenAuthHelper2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                        obj2 = externalSyntheticLambda4;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.onTransact() * 0.6f), 1, (Object) null);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(rVOpenAuthHelper2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback3) {
                        Object obj3 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda5(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                            obj3 = externalSyntheticLambda5;
                        }
                        ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                        if (rVOpenAuthHelper2.onWarmupCompleted.isEmpty()) {
                            z = true;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1388031066);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1390556574);
                            z = true;
                            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-1165236364, true, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda6(rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-701899342, true, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda7(rVOpenAuthHelper2), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 24960, 0, 4075);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (!(z ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit2 = Unit.INSTANCE;
        int i9 = asInterface + 85;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RVOpenAuthHelper2 rVOpenAuthHelper2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 65;
            asInterface = i6 % 128;
            z = i6 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1075440390, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.onCreate.<anonymous> (HomeSelectablePaymentAccountsBottomSheet.kt:63)");
                int i7 = IAuthTabCallbackDefault + 51;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CardBillAccount cardBillAccount = (CardBillAccount) CollectionsKt.firstOrNull(rVOpenAuthHelper2.onWarmupCompleted);
                if (cardBillAccount == null) {
                    cardBillAccount = new CardBillAccount((String) null, 0L, (String) null, (String) null, (String) null, (String) null, false, 0, 255, (DefaultConstructorMarker) null);
                }
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(cardBillAccount, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
            rVOpenAuthHelper2.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0);
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1938001490, true, new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda3(rVOpenAuthHelper2, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (getSupportedHighSpeedResolutionsFor) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean zOnExtraCallback;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1316959003);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) {
                int i5 = asInterface + 57;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i7 = IAuthTabCallbackDefault + 33;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            }
            i2 |= zOnExtraCallback ? 32 : 16;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1316959003, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeSelectablePaymentAccountsBottomSheet.ImpressionAddView (HomeSelectablePaymentAccountsBottomSheet.kt:227)");
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i9 = IAuthTabCallbackDefault + 35;
                asInterface = i9 % 128;
                if (i9 % 2 == 0) {
                    objOnMinimized = Boolean.FALSE;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    int i10 = 32 / 0;
                } else {
                    objOnMinimized = Boolean.FALSE;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
            }
            booleanRef.element = ((Boolean) objOnMinimized).booleanValue();
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Unit.INSTANCE, new onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, booleanRef, this, (access13800) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallbackDefault + 25;
                asInterface = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 32 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new HomeSelectablePaymentAccountsBottomSheet$.ExternalSyntheticLambda0(this, camera2CameraMetadataExternalSyntheticLambda1, i));
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1948715345, new Object[]{rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1948715349, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1162397119, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1162397119, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 252444160, new Object[]{rVOpenAuthHelper2, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -252444158, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2077104063, new Object[]{rVOpenAuthHelper2, camera2CameraMetadataExternalSyntheticLambda1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 2077104066, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static final /* synthetic */ List onExtraCallbackWithResult(RVOpenAuthHelper2 rVOpenAuthHelper2) {
        return (List) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 851732282, new Object[]{rVOpenAuthHelper2}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -851732277, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(RVOpenAuthHelper2 rVOpenAuthHelper2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -408075335, new Object[]{rVOpenAuthHelper2, getsupportedhighspeedresolutionsfor, setDetectableSize}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 408075336, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }
}
