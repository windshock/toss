package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import im.toss.features.home.feature.consumption_card_recommendation.R;
import im.toss.features.home_v2.feature.consumption_card_recommendation.ConsumptionCardRecommendationViewModel;
import im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreenKt$;
import im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreenKt$ConsumptionCardRecommendationScreen$4$1$1$1$;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.WebSocketFactory;
import o.hasSignature;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.wa;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PackageQueryPoint {
    private static int IAuthTabCallback = 1;
    private static final List<String> onExtraCallback = new ArrayList();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Uri uri, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return (Unit) onExtraCallbackWithResult(new Object[]{consumptionCardRecommendationViewModel, uri, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1158047840, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1158047843, WebSocketFactory.onExtraCallback.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Map map, boolean z, int i, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(map, z, i, setDetectableSize);
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            return (Unit) onExtraCallbackWithResult(objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 378050812, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -378050811, WebSocketFactory.onExtraCallback.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(consumptionCardRecommendationViewModel, camera2CameraMetadataExternalSyntheticLambda1, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int iOnExtraCallbackWithResult;
        hasSignature hassignatureOnActivityResized;
        List<hasSignature.onNavigationEvent> listAsInterface;
        int i7 = ~i5;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i);
        int i10 = (~i) | (~((~i3) | i5));
        int i11 = (~(i | i3)) | (~(i7 | i)) | (~i8);
        int i12 = i5 + i3 + i2 + ((-953487067) * i6) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i5) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i2) + ((-1703411712) * i6) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i5 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i2 * 272662391) + (i6 * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel = (ConsumptionCardRecommendationViewModel) objArr[0];
            r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto = (r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i17 = 2 % 2;
            int i18 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(consumptionCardRecommendationViewModel, r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i20 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            return unitOnNavigationEvent;
        }
        if (i16 == 3) {
            return onWarmupCompleted(objArr);
        }
        ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel2 = (ConsumptionCardRecommendationViewModel) objArr[0];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[1];
        int i22 = 2 % 2;
        onExtraCallback.clear();
        if (consumptionCardRecommendationViewModel2.onActivityResized() != null) {
            Iterator it = getMaintainOriginalImageBounds.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, 1.0f, 0, 2, (Object) null).iterator();
            while (it.hasNext()) {
                int i23 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i23 % 128;
                if (i23 % 2 == 0) {
                    iOnExtraCallbackWithResult = ((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallbackWithResult() + 3;
                    hassignatureOnActivityResized = consumptionCardRecommendationViewModel2.onActivityResized();
                    if (hassignatureOnActivityResized != null) {
                        listAsInterface = hassignatureOnActivityResized.asInterface();
                        if (listAsInterface == null) {
                            int i24 = onWarmupCompleted + 41;
                            onExtraCallbackWithResult = i24 % 128;
                            int i25 = i24 % 2;
                            hasSignature.onNavigationEvent onnavigationevent = (hasSignature.onNavigationEvent) CollectionsKt.getOrNull(listAsInterface, iOnExtraCallbackWithResult);
                            if (onnavigationevent != null) {
                                onExtraCallback(iOnExtraCallbackWithResult, onnavigationevent, ((Boolean) ConsumptionCardRecommendationViewModel.IAuthTabCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1694140742, new Object[]{consumptionCardRecommendationViewModel2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1694140742, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue(), consumptionCardRecommendationViewModel2.onRelationshipValidationResult());
                            }
                        }
                    }
                } else {
                    iOnExtraCallbackWithResult = ((Camera2CameraControlExternalSyntheticLambda7) it.next()).onExtraCallbackWithResult() - 3;
                    hassignatureOnActivityResized = consumptionCardRecommendationViewModel2.onActivityResized();
                    if (hassignatureOnActivityResized != null) {
                        listAsInterface = hassignatureOnActivityResized.asInterface();
                        if (listAsInterface == null) {
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, findResAndMsg findresandmsg, Resources resources, v1 v1Var, Context context, SessionTrackerb sessionTrackerb, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(consumptionCardRecommendationViewModel, findresandmsg, resources, v1Var, context, sessionTrackerb, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var, Context context, String str, SessionTrackerb sessionTrackerb, ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Resources resources) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(findresandmsg, v1Var, context, str, sessionTrackerb, consumptionCardRecommendationViewModel, resources);
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(int i, hasSignature.onNavigationEvent onnavigationevent, boolean z, Map map) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(i, onnavigationevent, z, map);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel = (ConsumptionCardRecommendationViewModel) objArr[0];
        Uri uri = (Uri) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(consumptionCardRecommendationViewModel, uri, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{consumptionCardRecommendationViewModel, camera2CameraMetadataExternalSyntheticLambda1}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1717584490, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1717584490, WebSocketFactory.onExtraCallback.IAuthTabCallback());
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ v1 $bottomSheetState;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$bottomSheetState = v1Var;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$bottomSheetState, this.$context, access13800Var);
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            int i5 = onWarmupCompleted + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$bottomSheetState.onNavigationEvent() == u5b.Hidden) {
                int i2 = onNavigationEvent + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.$context);
                if (activityIAuthTabCallback != null) {
                    int i4 = onWarmupCompleted + 55;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        activityIAuthTabCallback.finish();
                        throw null;
                    }
                    activityIAuthTabCallback.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        String strOnExtraCallbackWithResult;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda_moq0nysrol1o0qmavnpwgoovto, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda_moq0nysrol1o0qmavnpwgoovto)) {
                int i5 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i5 % 128;
                i3 = i5 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2049921167, i2, -1, "im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreen.<anonymous> (ConsumptionCardRecommendationScreen.kt:83)");
            }
            if (consumptionCardRecommendationViewModel.ICustomTabsCallbackDefault()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-938452883);
                r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_consumption_card_recommendation_loading_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-938315212);
                hasSignature hassignatureOnActivityResized = consumptionCardRecommendationViewModel.onActivityResized();
                if (hassignatureOnActivityResized == null || (strOnExtraCallbackWithResult = hassignatureOnActivityResized.onExtraCallbackWithResult()) == null) {
                    strOnExtraCallbackWithResult = "";
                }
                r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(strOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ v1 $bottomSheetState;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $nextUrl;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ SessionTrackerb $tossRouter;
        final /* synthetic */ ConsumptionCardRecommendationViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(v1 v1Var, Context context, String str, SessionTrackerb sessionTrackerb, ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Resources resources, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$bottomSheetState = v1Var;
            this.$context = context;
            this.$nextUrl = str;
            this.$tossRouter = sessionTrackerb;
            this.$viewModel = consumptionCardRecommendationViewModel;
            this.$resources = resources;
        }

        public static /* synthetic */ Unit onWarmupCompleted(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, String str, Resources resources, SetDetectableSize setDetectableSize) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(consumptionCardRecommendationViewModel, str, resources, setDetectableSize);
            int i4 = onExtraCallback + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$bottomSheetState, this.$context, this.$nextUrl, this.$tossRouter, this.$viewModel, this.$resources, access13800Var);
            int i2 = onExtraCallback + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, String str, Resources resources, SetDetectableSize setDetectableSize) throws Resources.NotFoundException {
            String string;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback(consumptionCardRecommendationViewModel.onRelationshipValidationResult());
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            setDetectableSize.onExtraCallback("card_yn", zzaz.onExtraCallbackWithResult(((Boolean) ConsumptionCardRecommendationViewModel.IAuthTabCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1694140742, new Object[]{consumptionCardRecommendationViewModel}, iOnExtraCallback, 1694140742, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue()));
            if (str == null || str.length() == 0) {
                string = resources.getString(R.string.home_v2_feature_consumption_card_recommendation_button_close);
            } else {
                int i4 = onExtraCallback + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                string = resources.getString(R.string.home_v2_feature_consumption_card_recommendation_button_next);
            }
            setDetectableSize.onExtraCallback("item_title", string);
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 57;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1558121L, false, (String) null, (Map) null, new ConsumptionCardRecommendationScreenKt$ConsumptionCardRecommendationScreen$4$1$1$1$.ExternalSyntheticLambda0(this.$viewModel, this.$nextUrl, this.$resources), 14, (Object) null);
                v1 v1Var = this.$bottomSheetState;
                this.label = 1;
                if (v1.onExtraCallback(v1Var, (x1) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.$context);
            if (activityIAuthTabCallback != null) {
                int i4 = IAuthTabCallback + 97;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    activityIAuthTabCallback.finish();
                    obj2.hashCode();
                    throw null;
                }
                activityIAuthTabCallback.finish();
            }
            String str = this.$nextUrl;
            if (str != null) {
                int i5 = onExtraCallback + 55;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    str.length();
                    throw null;
                }
                if (str.length() != 0) {
                    int i6 = IAuthTabCallback + 49;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        SessionTrackerb.onExtraCallbackWithResult(this.$tossRouter, this.$context, this.$nextUrl, false, (Function1) null, (Bundle) null, true, 45, (Object) null);
                    } else {
                        SessionTrackerb.onExtraCallbackWithResult(this.$tossRouter, this.$context, this.$nextUrl, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var, Context context, String str, SessionTrackerb sessionTrackerb, ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Resources resources) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(v1Var, context, str, sessionTrackerb, consumptionCardRecommendationViewModel, resources, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, findResAndMsg findresandmsg, Resources resources, v1 v1Var, Context context, SessionTrackerb sessionTrackerb, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        String strOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(103658179, i2, -1, "im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreen.<anonymous> (ConsumptionCardRecommendationScreen.kt:91)");
            }
            hasSignature hassignatureOnActivityResized = consumptionCardRecommendationViewModel.onActivityResized();
            String strOnWarmupCompleted = hassignatureOnActivityResized != null ? hassignatureOnActivityResized.onWarmupCompleted() : null;
            if (strOnWarmupCompleted == null || strOnWarmupCompleted.length() == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-514374);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_consumption_card_recommendation_button_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                int i6 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-376517);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_consumption_card_recommendation_button_next, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCardRecommendationViewModel);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnWarmupCompleted);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent | zOnExtraCallback3 | zOnNavigationEvent2 | zOnExtraCallback4 | zOnExtraCallback5)) {
                int i8 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda6(findresandmsg, v1Var, context, strOnWarmupCompleted, sessionTrackerb, consumptionCardRecommendationViewModel, resources);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj = externalSyntheticLambda6;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(85070046, i, -1, "im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreen.<anonymous> (ConsumptionCardRecommendationScreen.kt:120)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setHoverListener.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (updateFocusedState) null, (Function2) null, 3, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i9 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (consumptionCardRecommendationViewModel.ICustomTabsCallbackDefault()) {
                int i11 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1219793890);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1219793890);
                }
                IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1219735703);
                ReceivedHeaderPoint.onExtraCallback(consumptionCardRecommendationViewModel.onActivityResized(), camera2CameraMetadataExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, hasSignature.onExtraCallback);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6 A[PHI: r4
      0x01d6: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:76:0x01ca, B:73:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, @Nullable Uri uri, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        boolean z;
        int i4;
        ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel2;
        Context context;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        v1 v1VarOnExtraCallback;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback3;
        Object objOnMinimized2;
        Context context2;
        ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel3;
        boolean zOnNavigationEvent2;
        boolean zOnExtraCallback4;
        int i5;
        Throwable th;
        boolean z2;
        Throwable th2;
        boolean zOnExtraCallback5;
        boolean zOnNavigationEvent3;
        ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel4 = consumptionCardRecommendationViewModel;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-95716376);
        Object obj = null;
        if ((i & 6) != 0) {
            i3 = i;
        } else if ((i2 & 1) == 0) {
            int i7 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCardRecommendationViewModel4);
                obj.hashCode();
                throw null;
            }
            int i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCardRecommendationViewModel4) ? 4 : 2;
            i3 = i8 | i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(uri) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((i2 & 1) != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1890788296);
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i9 = onExtraCallbackWithResult + 63;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1729797275);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                        int i11 = onWarmupCompleted + 111;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    }
                    z = true;
                    ViewModel viewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(ConsumptionCardRecommendationViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 36936, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    i4 = i3 & (-15);
                    consumptionCardRecommendationViewModel2 = (ConsumptionCardRecommendationViewModel) viewModelIAuthTabCallback;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-95716376, i4, -1, "im.toss.features.home_v2.feature.consumption_card_recommendation.compose.ConsumptionCardRecommendationScreen (ConsumptionCardRecommendationScreen.kt:47)");
                }
                context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                SessionTrackerb sessionTrackerb = (SessionTrackerb) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AppLovinBroadcastManager.onExtraCallbackWithResult());
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 895);
                Unit unit = Unit.INSTANCE;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCardRecommendationViewModel2);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(uri);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent) && !zOnExtraCallback3) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    context2 = context;
                    consumptionCardRecommendationViewModel3 = consumptionCardRecommendationViewModel2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    objOnMinimized2 = new onExtraCallback(consumptionCardRecommendationViewModel2, uri, v1VarOnExtraCallback, context2, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                } else {
                    context2 = context;
                    consumptionCardRecommendationViewModel3 = consumptionCardRecommendationViewModel2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                u5b u5bVarOnNavigationEvent = v1VarOnExtraCallback.onNavigationEvent();
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(v1VarOnExtraCallback);
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnNavigationEvent2 | zOnExtraCallback4)) {
                    i5 = 0;
                } else {
                    int i13 = onExtraCallbackWithResult + 35;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 == 0) {
                        i5 = 0;
                        int i14 = 19 / 0;
                        if (objOnMinimized3 != onwarmupcompleted.onExtraCallback()) {
                            th = null;
                        }
                    } else {
                        i5 = 0;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        }
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(u5bVarOnNavigationEvent, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(i5, i5, cameraCaptureResultEmptyCameraCaptureResult2, i5, 3);
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(2049921167, true, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda0(consumptionCardRecommendationViewModel3), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                    if (consumptionCardRecommendationViewModel3.ICustomTabsCallbackDefault()) {
                        int i15 = onWarmupCompleted + 41;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(373215253);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            throw th;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(373215253);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        th2 = th;
                        z2 = true;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(373271674);
                        z2 = true;
                        Throwable thOnExtraCallback = ForwardingCameraControl.onExtraCallback(103658179, true, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda1(consumptionCardRecommendationViewModel3, findresandmsg, resources, v1VarOnExtraCallback, context2, sessionTrackerb), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        th2 = thOnExtraCallback;
                    }
                    ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel5 = consumptionCardRecommendationViewModel3;
                    u6a.IAuthTabCallback(v1VarOnExtraCallback, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, th2, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(85070046, z2, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda2(consumptionCardRecommendationViewModel3, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 221184, 3072, 8078);
                    TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                    zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(consumptionCardRecommendationViewModel5);
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(zOnExtraCallback5 | zOnNavigationEvent3)) {
                        Object obj2 = objOnMinimized4;
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda3(consumptionCardRecommendationViewModel5, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda3);
                            obj2 = externalSyntheticLambda3;
                        }
                        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult2, 6, 2);
                        hasSignature hassignatureOnActivityResized = consumptionCardRecommendationViewModel5.onActivityResized();
                        boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(consumptionCardRecommendationViewModel5);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((zOnExtraCallback6 | zOnNavigationEvent4) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new onNavigationEvent(consumptionCardRecommendationViewModel5, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, th);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(hassignatureOnActivityResized, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, hasSignature.onExtraCallback);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        consumptionCardRecommendationViewModel4 = consumptionCardRecommendationViewModel5;
                    }
                }
                th = null;
                objOnMinimized3 = new IAuthTabCallback(v1VarOnExtraCallback, context2, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(u5bVarOnNavigationEvent, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult2 = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(i5, i5, cameraCaptureResultEmptyCameraCaptureResult2, i5, 3);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(2049921167, true, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda0(consumptionCardRecommendationViewModel3), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                if (consumptionCardRecommendationViewModel3.ICustomTabsCallbackDefault()) {
                }
                ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel52 = consumptionCardRecommendationViewModel3;
                u6a.IAuthTabCallback(v1VarOnExtraCallback, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, th2, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(85070046, z2, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda2(consumptionCardRecommendationViewModel3, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult2), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 221184, 3072, 8078);
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult2 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(consumptionCardRecommendationViewModel52);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult2);
                Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnExtraCallback5 | zOnNavigationEvent3)) {
                }
            } else {
                int i16 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                    }
                }
            }
            z = true;
            int i17 = i3;
            consumptionCardRecommendationViewModel2 = consumptionCardRecommendationViewModel4;
            i4 = i17;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            SessionTrackerb sessionTrackerb2 = (SessionTrackerb) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AppLovinBroadcastManager.onExtraCallbackWithResult());
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            }
            findResAndMsg findresandmsg2 = (findResAndMsg) objOnMinimized;
            v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 895);
            Unit unit2 = Unit.INSTANCE;
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCardRecommendationViewModel2);
            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(uri);
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1VarOnExtraCallback);
            zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent | zOnExtraCallback3)) {
                context2 = context;
                consumptionCardRecommendationViewModel3 = consumptionCardRecommendationViewModel2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                objOnMinimized2 = new onExtraCallback(consumptionCardRecommendationViewModel2, uri, v1VarOnExtraCallback, context2, (access13800) null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                u5b u5bVarOnNavigationEvent2 = v1VarOnExtraCallback.onNavigationEvent();
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(v1VarOnExtraCallback);
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context2);
                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnNavigationEvent2 | zOnExtraCallback4)) {
                }
                th = null;
                objOnMinimized32 = new IAuthTabCallback(v1VarOnExtraCallback, context2, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized32);
                isZslDisabledByByUserCaseConfig.onNavigationEvent(u5bVarOnNavigationEvent2, (Function2) objOnMinimized32, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult22 = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(i5, i5, cameraCaptureResultEmptyCameraCaptureResult2, i5, 3);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback22 = ForwardingCameraControl.onExtraCallback(2049921167, true, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda0(consumptionCardRecommendationViewModel3), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                if (consumptionCardRecommendationViewModel3.ICustomTabsCallbackDefault()) {
                }
                ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel522 = consumptionCardRecommendationViewModel3;
                u6a.IAuthTabCallback(v1VarOnExtraCallback, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback22, th2, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(85070046, z2, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda2(consumptionCardRecommendationViewModel3, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult22), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 221184, 3072, 8078);
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult22 = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(consumptionCardRecommendationViewModel522);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult22);
                Object objOnMinimized422 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnExtraCallback5 | zOnNavigationEvent3)) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda4(consumptionCardRecommendationViewModel4, uri, i, i2));
        }
    }

    static {
        int i = IAuthTabCallback + 107;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static final void onExtraCallback(int i, hasSignature.onNavigationEvent onnavigationevent, boolean z, Map<String, ? extends Object> map) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback.add(onnavigationevent.onExtraCallback().onNavigationEvent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onExtraCallback.add(onnavigationevent.onExtraCallback().onNavigationEvent())) {
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1558119L, false, (String) null, (Map) null, new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda7(map, z, i), 14, (Object) null);
        }
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Map map, boolean z, int i, SetDetectableSize setDetectableSize) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(map);
            setDetectableSize.onExtraCallback("card_yn", zzaz.onExtraCallbackWithResult(z));
            i2 = i / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(map);
            setDetectableSize.onExtraCallback("card_yn", zzaz.onExtraCallbackWithResult(z));
            i2 = i + 1;
        }
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1504090433);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1504090433);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1504090433, i, -1, "im.toss.features.home_v2.feature.consumption_card_recommendation.compose.LoadingContent (ConsumptionCardRecommendationScreen.kt:198)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(240.0f)), RectangleShapeKt.onExtraCallback());
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            removeAllUpdateListeners.IAuthTabCallback(CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-18.0f), 1, (Object) null), false, false, (TdsSkeletonV1View.onWarmupCompleted) null, new TdsSkeletonV1View.IAuthTabCallback.onExtraCallback(CollectionsKt.listOf(new TdsSkeletonV1View.onExtraCallbackWithResult.onWarmupCompleted[]{new TdsSkeletonV1View.onExtraCallbackWithResult.onWarmupCompleted(), new TdsSkeletonV1View.onExtraCallbackWithResult.onWarmupCompleted(), new TdsSkeletonV1View.onExtraCallbackWithResult.onWarmupCompleted()})), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (TdsSkeletonV1View.IAuthTabCallback.onExtraCallback.onNavigationEvent << 12) | 6, 14);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ConsumptionCardRecommendationScreenKt$.ExternalSyntheticLambda5(i));
            int i5 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{consumptionCardRecommendationViewModel, r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -11826662, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 11826664, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        return (Unit) onExtraCallbackWithResult(new Object[]{consumptionCardRecommendationViewModel, camera2CameraMetadataExternalSyntheticLambda1}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1717584490, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1717584490, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(ConsumptionCardRecommendationViewModel consumptionCardRecommendationViewModel, Uri uri, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{consumptionCardRecommendationViewModel, uri, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1158047840, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1158047843, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallbackWithResult(new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 378050812, WebSocketFactory.onExtraCallback.IAuthTabCallback(), -378050811, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }
}
