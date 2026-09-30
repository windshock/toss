package o;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.common.collect.Synchronized;
import com.horcrux.svg.SvgPackage;
import im.toss.base.BaseActivity;
import im.toss.features.home.core.model.CardBillAccount;
import im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet$;
import im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet$onCreate$1$1$1$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
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
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class sendResult extends BrickModuleImplExternalSyntheticLambda2 {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private final List<CardBillAccount> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final Map<String, String> asBinder;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final Function1<CardBillAccount, Unit> onNavigationEvent;
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int onWarmupCompleted = 8;

    static {
        Object obj = null;
        int i = access000 + 71;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        sendResult sendresult = (sendResult) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(sendresult);
        int i4 = onTransact + 63;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(sendResult sendresult, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 103;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(sendresult, camera2CameraMetadataExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(sendResult sendresult, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sendresult, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 41;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(sendResult sendresult, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(sendresult, setDetectableSize);
        int i4 = asInterface + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2);
        int i9 = ~(i3 | i2);
        int i10 = i7 | (~i2);
        int i11 = i9 | (~(i10 | i));
        int i12 = (~i) | i10;
        int i13 = i3 + i2 + i6 + (770105990 * i4) + ((-157043368) * i5);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i3) - 1432092672) + ((-1000312294) * i2) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i6) + ((-2121269248) * i4) + (1950351360 * i5) + ((-66846720) * i14);
        int i16 = (i3 * 105828664) + 1394048361 + (i2 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i6 * 105828275) + (i4 * (-227623502)) + (i5 * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 3) {
            return IAuthTabCallback(objArr);
        }
        sendResult sendresult = (sendResult) objArr[0];
        int i18 = 2 % 2;
        int i19 = asInterface;
        int i20 = i19 + 7;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        Function1<CardBillAccount, Unit> function1 = sendresult.onNavigationEvent;
        int i22 = i19 + 111;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        return function1;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(sendResult sendresult, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(sendresult, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onWarmupCompleted(sendresult, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(sendResult sendresult, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(sendresult, camera2CameraMetadataExternalSyntheticLambda1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 71;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(sendResult sendresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(sendresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(sendresult, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BottomSheetHeader onNavigationEvent(sendResult sendresult, Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeaderOnExtraCallback = onExtraCallback(sendresult, context);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return bottomSheetHeaderOnExtraCallback;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(CardBillAccount cardBillAccount) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(cardBillAccount);
        }
        onNavigationEvent(cardBillAccount);
        throw null;
    }

    private static final Unit onWarmupCompleted(sendResult sendresult, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        sendresult.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sendResult(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull List<CardBillAccount> list, @NotNull Map<String, String> map, @NotNull Function1<? super CardBillAccount, Unit> function1, @NotNull Function0<Unit> function0) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackDefault = str;
        this.IAuthTabCallback = list;
        this.asBinder = map;
        this.onNavigationEvent = function1;
        this.onExtraCallbackWithResult = function0;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        sendResult sendresult = (sendResult) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = sendresult.asBinder;
        int i5 = i2 + 105;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        sendResult sendresult = (sendResult) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        List<CardBillAccount> list = sendresult.IAuthTabCallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 13;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        onNavigationEvent(ForwardingCameraControl.onExtraCallbackWithResult(-1782926566, true, new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda3(this)));
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ CharSequence onNavigationEvent(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(cardBillAccount);
            int i4 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return charSequenceOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onWarmupCompleted(sendResult sendresult, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(sendresult, setDetectableSize);
            int i4 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = sendResult.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
                int i3 = 83 / 0;
            } else {
                objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertByteArrayToFloatArray.onExtraCallback(1395439L, false, (String) null, (Map) null, new HomeCanTransferAccountsBottomSheet$onCreate$1$1$1$.ExternalSyntheticLambda0(sendResult.this), 14, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final CharSequence onWarmupCompleted(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = cardBillAccount.onExtraCallback();
            if (i3 != 0) {
                return String.valueOf(iOnExtraCallback);
            }
            String.valueOf(iOnExtraCallback);
            throw null;
        }

        private static final Unit onNavigationEvent(sendResult sendresult, SetDetectableSize setDetectableSize) {
            String str;
            int i = 2 % 2;
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            setDetectableSize.onExtraCallback((Map) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult, 46874725, -46874725, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{sendresult}));
            int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
            List list = (List) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult3, 632668122, -632668120, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{sendresult});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 2;
            }
            while (it.hasNext()) {
                arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            for (Object obj : arrayList) {
                if (!StringsKt.isBlank((String) obj)) {
                    int i6 = onExtraCallbackWithResult + 117;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(obj);
                }
            }
            setDetectableSize.onExtraCallback("org_codes", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            int iOnExtraCallbackWithResult5 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = SvgPackage.21.onExtraCallbackWithResult();
            setDetectableSize.onExtraCallback("accnt_cnt", Integer.valueOf(((List) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult5, 632668122, -632668120, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{sendresult})).size()));
            int iOnExtraCallbackWithResult7 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = SvgPackage.21.onExtraCallbackWithResult();
            List list2 = (List) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult7, 632668122, -632668120, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult8, new Object[]{sendresult});
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                str = "N";
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    int i8 = onExtraCallbackWithResult + 75;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    if (((CardBillAccount) it2.next()).IAuthTabCallbackDefault()) {
                        int i10 = onWarmupCompleted + 35;
                        onExtraCallbackWithResult = i10 % 128;
                        str = "Y";
                        if (i10 % 2 != 0) {
                            int i11 = 11 / 0;
                        }
                    }
                }
                str = "N";
            }
            setDetectableSize.onExtraCallback("tossbank_accnt_yn", str);
            int iOnExtraCallbackWithResult9 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult10 = SvgPackage.21.onExtraCallbackWithResult();
            setDetectableSize.onExtraCallback("current_screen", ((Map) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult9, 46874725, -46874725, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult10, new Object[]{sendresult})).get("currentScreen"));
            int iOnExtraCallbackWithResult11 = SvgPackage.21.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult12 = SvgPackage.21.onExtraCallbackWithResult();
            setDetectableSize.onExtraCallback("bank_code_list", CollectionsKt.joinToString$default((List) sendResult.onExtraCallbackWithResult(iOnExtraCallbackWithResult11, 632668122, -632668120, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult12, new Object[]{sendresult}), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new HomeCanTransferAccountsBottomSheet$onCreate$1$1$1$.ExternalSyntheticLambda1(), 30, (Object) null));
            return Unit.INSTANCE;
        }
    }

    private static final BottomSheetHeader onExtraCallback(sendResult sendresult, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setShowCloseIcon(false);
        bottomSheetHeader.setTitle(sendresult.IAuthTabCallbackDefault);
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return bottomSheetHeader;
    }

    static final class onNavigationEvent implements getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ CardBillAccount IAuthTabCallback;

        onNavigationEvent(CardBillAccount cardBillAccount) {
            this.IAuthTabCallback = cardBillAccount;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
                int i4 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                    int i5 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    int i7 = onNavigationEvent + 15;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 2 / 2;
                    }
                }
                i |= i2;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(40605215, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:88)");
            }
            w3bVar.onWarmupCompleted(this.IAuthTabCallback.onExtraCallbackWithResult(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(setExtensionStrength.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)), 0L, (QuirkSettingsLoader) null, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 15) & 458752, 28);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class onExtraCallback implements getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ CardBillAccount onExtraCallback;

        onExtraCallback(CardBillAccount cardBillAccount) {
            this.onExtraCallback = cardBillAccount;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            long jLongValue;
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
                int i6 = onWarmupCompleted + 89;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i8 = onWarmupCompleted + 53;
                int i9 = i8 % 128;
                IAuthTabCallback = i9;
                z = i8 % 2 == 0;
                int i10 = i9 + 101;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(607071348, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:96)");
            }
            String strIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-719978213);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-719977253);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            w5aVar.IAuthTabCallbackStub(strIAuthTabCallback, disableTextLayoutManagerCacheAndroid.onExtraCallbackWithResult(Long.valueOf(this.onExtraCallback.onNavigationEvent()), (cxxNativeAnimatedEnabled) null, 1, (Object) null), new getHumanReadableName(jLongValue, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onWarmupCompleted + 5;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        }
    }

    private static final CharSequence onNavigationEvent(CardBillAccount cardBillAccount) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cardBillAccount, "");
            return String.valueOf(cardBillAccount.onExtraCallback());
        }
        Intrinsics.checkNotNullParameter(cardBillAccount, "");
        String.valueOf(cardBillAccount.onExtraCallback());
        throw null;
    }

    private static final Unit IAuthTabCallback(sendResult sendresult, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(sendresult.asBinder);
        List<CardBillAccount> list = sendresult.IAuthTabCallback;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardBillAccount) it.next()).IAuthTabCallbackStub());
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 % 5;
        }
        for (Object obj : arrayList) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
                int i4 = onTransact + 119;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 3;
                }
            }
        }
        setDetectableSize.onExtraCallback("connected_org_codes", CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        setDetectableSize.onExtraCallback("connected_accnt_cnt", Integer.valueOf(sendresult.IAuthTabCallback.size()));
        setDetectableSize.onExtraCallback("current_screen", sendresult.asBinder.get("currentScreen"));
        setDetectableSize.onExtraCallback("bank_code_list", CollectionsKt.joinToString$default(sendresult.IAuthTabCallback, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda7(), 30, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 45;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(sendResult sendresult) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1510591L, false, (String) null, (Map) null, new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda5(sendresult), 14, (Object) null);
        sendresult.onExtraCallbackWithResult.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(sendResult sendresult, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 36) != 21) {
                z = true;
            } else {
                int i4 = onTransact + 113;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1435053447, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:124)");
            }
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
            getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
            interceptGetAuthCode interceptgetauthcode = interceptGetAuthCode.IAuthTabCallback;
            getBacktraceNote getbacktracenoteOnExtraCallback = interceptgetauthcode.onExtraCallback();
            getBacktraceNote getbacktracenoteIAuthTabCallback = interceptgetauthcode.IAuthTabCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sendresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i6 = asInterface + 41;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda6(sendresult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj = externalSyntheticLambda6;
                }
                w4.onExtraCallbackWithResult(getbacktracenoteOnExtraCallback, (QuirksExternalSyntheticBackport0) null, getbacktracenoteIAuthTabCallback, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 3462, 384, 110578);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(sendResult sendresult, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        List<CardBillAccount> list = sendresult.IAuthTabCallback;
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), (Function1) null, new onTransact(IAuthTabCallbackStub.onExtraCallbackWithResult, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new IAuthTabCallbackDefault(list, sendresult)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "add", (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(1435053447, true, new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda2(sendresult)), 2, (Object) null);
        Object[] objArr = {interceptGetAuthCode.IAuthTabCallback};
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, (getBacktraceNote) interceptGetAuthCode.onWarmupCompleted(-2073469436, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 2073469436, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent()), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(sendResult sendresult, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 41;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = asInterface + 51;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(159477874, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous>.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:68)");
                        int i5 = 17 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(159477874, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous>.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:68)");
                    }
                }
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
                    int i6 = onTransact + 51;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
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
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sendresult);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda0(sendresult);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                        int i8 = asInterface + 85;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        obj = externalSyntheticLambda0;
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) obj, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.onTransact() * 0.6f), 1, (Object) null);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sendresult);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback2) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda1(sendresult);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda1);
                            obj2 = externalSyntheticLambda1;
                        }
                        ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i10 = onTransact + 47;
                            asInterface = i10 % 128;
                            int i11 = i10 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        int i12 = asInterface + 41;
        onTransact = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 4 % 3;
        }
        z = false;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(sendResult sendresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = onTransact + 25;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1782926566, i, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.onCreate.<anonymous> (HomeCanTransferAccountsBottomSheet.kt:54)");
            }
            Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
            sendresult.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Unit unit = Unit.INSTANCE;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sendresult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = sendresult.new onExtraCallbackWithResult(null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i5 = onTransact + 45;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(159477874, true, new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda8(sendresult, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 85;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 10 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackStub implements Function1 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final IAuthTabCallbackStub onExtraCallbackWithResult = new IAuthTabCallbackStub();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 125;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public final Void onNavigationEvent(CardBillAccount cardBillAccount) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(obj);
                throw null;
            }
            Void voidOnNavigationEvent = onNavigationEvent(obj);
            int i3 = onNavigationEvent + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return voidOnNavigationEvent;
        }
    }

    public static final class onTransact implements Function1<Integer, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;

        public onTransact(Function1 function1, List list) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(((Number) obj).intValue());
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            int i5 = onWarmupCompleted + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 93;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                this.onNavigationEvent.invoke(this.onExtraCallbackWithResult.get(i));
                throw null;
            }
            Object objInvoke = this.onNavigationEvent.invoke(this.onExtraCallbackWithResult.get(i));
            int i4 = IAuthTabCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvoke;
        }
    }

    public static final class IAuthTabCallbackDefault implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List onNavigationEvent;
        final /* synthetic */ sendResult onWarmupCompleted;

        public IAuthTabCallbackDefault(List list, sendResult sendresult) {
            this.onNavigationEvent = list;
            this.onWarmupCompleted = sendresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            Object obj;
            int i4 = 2 % 2;
            if ((i2 & 6) == 0) {
                int i5 = onExtraCallback + 115;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 101;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    int i8 = 39 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
            }
            CardBillAccount cardBillAccount = (CardBillAccount) this.onNavigationEvent.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(22401606);
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
            getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(607071348, true, new onExtraCallback(cardBillAccount), cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(40605215, true, new onNavigationEvent(cardBillAccount), cameraCaptureResultEmptyCameraCaptureResult, 54);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(this.onWarmupCompleted);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(cardBillAccount);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2)) {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    asInterface asinterface = new asInterface(this.onWarmupCompleted, cardBillAccount);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(asinterface);
                    int i9 = onExtraCallbackWithResult + 103;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    obj = asinterface;
                }
            }
            w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{encoderProfilesProxyVideoProfileProxyOnExtraCallback, true, null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, onextracallbackOnNavigationEvent, null, null, null, null, Float.valueOf(0.0f), null, null, null, ontransactOnNavigationEvent, null, (Function0) obj, null, null, cameraCaptureResultEmptyCameraCaptureResult, 27702, 3072, 221156}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 31;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i12 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
    }

    private final void onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1853932869);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) {
                int i6 = onTransact + 55;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onTransact + 79;
            asInterface = i8 % 128;
            if ((i8 % 2 != 0 ? (i & 64) != 0 : (i & 117) != 0) ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i9 = asInterface;
                int i10 = i9 + 37;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 97;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i14 = onTransact + 5;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1853932869, i2, -1, "im.toss.features.home.presentation.bottomsheet.HomeCanTransferAccountsBottomSheet.ImpressionAddView (HomeCanTransferAccountsBottomSheet.kt:168)");
                int i16 = onTransact + 51;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Boolean.FALSE;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            booleanRef.element = ((Boolean) objOnMinimized).booleanValue();
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Unit.INSTANCE, new IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, booleanRef, this, (access13800) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = onTransact + 85;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i20 = asInterface + 13;
            onTransact = i20 % 128;
            int i21 = i20 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new HomeCanTransferAccountsBottomSheet$.ExternalSyntheticLambda4(this, camera2CameraMetadataExternalSyntheticLambda1, i));
        }
    }

    public static /* synthetic */ Unit onExtraCallback(sendResult sendresult) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 189243163, -189243162, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{sendresult});
    }

    public static final /* synthetic */ List onNavigationEvent(sendResult sendresult) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (List) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 632668122, -632668120, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{sendresult});
    }

    public static final /* synthetic */ Function1 IAuthTabCallback(sendResult sendresult) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Function1) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 2121833038, -2121833035, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{sendresult});
    }

    public static final /* synthetic */ Map onWarmupCompleted(sendResult sendresult) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        return (Map) onExtraCallbackWithResult(iOnExtraCallbackWithResult, 46874725, -46874725, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{sendresult});
    }
}
