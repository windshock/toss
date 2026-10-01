package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.common.collect.Synchronized;
import im.toss.features.home.feature.consumption_category_edit.ConsumptionCategoryEditViewModel;
import im.toss.features.home.feature.consumption_category_edit.screen.ConsumptionCategoryEditScreenKt$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.EmbedWebViewJsApiPermissionProxy;
import o.GeckoHubImp;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.UniformIpcUtils;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getPermissionAppId {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = {1671224620, 474595515, 581487070, -1572561155, -270225677, 632667459, -1497052773, 671387681, -133772985, 277374687, -1345812606, 862148935, -1715982997, 379357366, 1655391228, -1971275201, 2059587988, 523374226};
    private static int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i | i3);
        int i12 = (~(i3 | i)) | (~(i7 | i9)) | i8;
        int i13 = i + i4 + i2 + ((-1422066268) * i5) + ((-2108786386) * i6);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i) + 967573504 + (322476998 * i4) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i5) + (1722810368 * i6) + (518782976 * i14);
        int i16 = (i * 793895740) + 1353643607 + (i4 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i2 * 793896001) + (i5 * 692483748) + (i6 * (-1016611666)) + (i14 * 166461440);
        int i17 = i15 + (i16 * i16 * 1997799424);
        if (i17 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 3) {
            return onExtraCallback(objArr);
        }
        if (i17 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 5) {
            return IAuthTabCallback(objArr);
        }
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel = (ConsumptionCategoryEditViewModel) objArr[0];
        int i18 = 2 % 2;
        int i19 = onExtraCallback + 89;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        Unit unitOnExtraCallback = onExtraCallback(consumptionCategoryEditViewModel);
        int i21 = onExtraCallback + 79;
        onWarmupCompleted = i21 % 128;
        int i22 = i21 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(sessionTrackerb, activity);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(sessionTrackerb, activity);
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sessionTrackerb, activity);
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, SessionTrackerb sessionTrackerb, Activity activity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(consumptionCategoryEditViewModel, sessionTrackerb, activity, cameraPresenceProviderExternalSyntheticLambda6, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getIpcManager getipcmanager, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(getipcmanager, setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getipcmanager, setDetectableSize);
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(preparefailoninner, prepareCallbackImpl1, setDetectableSize);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel = (ConsumptionCategoryEditViewModel) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(consumptionCategoryEditViewModel, activity);
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(consumptionCategoryEditViewModel);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = onExtraCallback + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, getIpcManager getipcmanager) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(consumptionCategoryEditViewModel, getipcmanager);
        }
        onExtraCallback(consumptionCategoryEditViewModel, getipcmanager);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(preparefailoninner, prepareCallbackImpl1, setDetectableSize);
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel = (ConsumptionCategoryEditViewModel) objArr[1];
        SessionTrackerb sessionTrackerb = (SessionTrackerb) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        onWarmupCompleted(function0, consumptionCategoryEditViewModel, sessionTrackerb, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, SessionTrackerb sessionTrackerb, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) IAuthTabCallback(627329565, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{function0, consumptionCategoryEditViewModel, sessionTrackerb, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -627329564, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i7 = onExtraCallback + 59;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, UniformIpcUtils uniformIpcUtils) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(consumptionCategoryEditViewModel, uniformIpcUtils);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UniformIpcUtils uniformIpcUtils, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(uniformIpcUtils, setDetectableSize);
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(preparefailoninner, prepareCallbackImpl1, setDetectableSize);
        }
        IAuthTabCallback(preparefailoninner, prepareCallbackImpl1, setDetectableSize);
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $onTrackView;
        final /* synthetic */ ConsumptionCategoryEditViewModel $vm;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$vm = consumptionCategoryEditViewModel;
            this.$onTrackView = function0;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$vm, this.$onTrackView, access13800Var);
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(this.$vm.onNavigationEvent());
                this.label = 1;
                obj = ycxycx.IAuthTabCallback(iAnimationOnExtraCallbackWithResult, this);
                if (obj == objOnWarmupCompleted) {
                    int i8 = onExtraCallback + 67;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 67 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            }
            if (((PrepareCallbackImpl1) obj) != null) {
                int i10 = onExtraCallback + 121;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                this.$onTrackView.invoke();
                int i12 = onNavigationEvent + 115;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(getIpcManager getipcmanager, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", getipcmanager.IAuthTabCallback());
            setDetectableSize.onExtraCallback("custom_yn", zzaz.onExtraCallbackWithResult(getipcmanager.onExtraCallback()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", getipcmanager.IAuthTabCallback());
        setDetectableSize.onExtraCallback("custom_yn", zzaz.onExtraCallbackWithResult(getipcmanager.onExtraCallback()));
        int i3 = 51 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, getIpcManager getipcmanager) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getipcmanager, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313563L, false, (String) null, (Map) null, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda11(getipcmanager), 14, (Object) null);
        consumptionCategoryEditViewModel.onExtraCallback(getipcmanager.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(SessionTrackerb sessionTrackerb, Activity activity) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313569L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Object[] objArr = new Object[1];
        a(new int[]{-687819532, -667319630, 1305007463, 1901128454, 31834438, 922363671, 1994006466, -1932478230, 1672923266, -707429669, -518638644, -1233016431, 1116305655, 838352158, -1077733059, 55847700, 740503503, -190972094, 1116305655, 838352158, -774822925, -1339376200, 145967251, -688609379, 2091111017, -1796434214, 1607507053, 924418045, 246566033, -10387939, -254833830, -442625167, -1253608048, 1536125822, 587404121, -907607031, 708443546, -1178793934, 749194880, -1453420221}, 79 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(SessionTrackerb sessionTrackerb, Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313571L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        String string = EmbedWebViewJsApiPermissionProxy.IAuthTabCallback.IAuthTabCallback(EmbedWebViewJsApiPermissionProxy.IAuthTabCallback.IAuthTabCallback, "timeline_detail", "timeline__detail_category_edit", null, 4, null).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", preparefailoninner.onExtraCallback());
        setDetectableSize.onExtraCallback("transaction_id", prepareCallbackImpl1.asInterface());
        setDetectableSize.onExtraCallback("custom_yn", zzaz.onExtraCallbackWithResult(preparefailoninner.IAuthTabCallbackStub()));
        setDetectableSize.onExtraCallback("brand", (String) PrepareCallbackImpl1.IAuthTabCallback(1396601358, new Object[]{prepareCallbackImpl1}, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1396601357, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult()));
        setDetectableSize.onExtraCallback("initial_category", prepareCallbackImpl1.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        prepareFailOnInner preparefailoninner = (prepareFailOnInner) ConsumptionCategoryEditViewModel.IAuthTabCallback(1779480737, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, -1779480736, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
        PrepareCallbackImpl1 prepareCallbackImpl1 = (PrepareCallbackImpl1) consumptionCategoryEditViewModel.onNavigationEvent().IAuthTabCallback();
        if (preparefailoninner != null) {
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (prepareCallbackImpl1 != null) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313565L, false, (String) null, (Map) null, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda10(preparefailoninner, prepareCallbackImpl1), 14, (Object) null);
                consumptionCategoryEditViewModel.onExtraCallback();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(UniformIpcUtils uniformIpcUtils, SetDetectableSize setDetectableSize) {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            UniformIpcUtils.onExtraCallback onextracallback = (UniformIpcUtils.onExtraCallback) uniformIpcUtils;
            setDetectableSize.onExtraCallback("category", onextracallback.onExtraCallbackWithResult().onNavigationEvent());
            zOnExtraCallback = onextracallback.onExtraCallbackWithResult().onExtraCallback();
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            UniformIpcUtils.onExtraCallback onextracallback2 = (UniformIpcUtils.onExtraCallback) uniformIpcUtils;
            setDetectableSize.onExtraCallback("category", onextracallback2.onExtraCallbackWithResult().onNavigationEvent());
            zOnExtraCallback = !onextracallback2.onExtraCallbackWithResult().onExtraCallback();
        }
        setDetectableSize.onExtraCallback("enabled_yn", zzaz.onExtraCallbackWithResult(zOnExtraCallback));
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, UniformIpcUtils uniformIpcUtils) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313567L, false, (String) null, (Map) null, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda2(uniformIpcUtils), 14, (Object) null);
        consumptionCategoryEditViewModel.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", preparefailoninner.onExtraCallback());
        setDetectableSize.onExtraCallback("transaction_id", prepareCallbackImpl1.asInterface());
        setDetectableSize.onExtraCallback("custom_yn", zzaz.onExtraCallbackWithResult(preparefailoninner.IAuthTabCallbackStub()));
        setDetectableSize.onExtraCallback("save_yn", "Y");
        setDetectableSize.onExtraCallback("brand", (String) PrepareCallbackImpl1.IAuthTabCallback(1396601358, new Object[]{prepareCallbackImpl1}, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1396601357, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult()));
        setDetectableSize.onExtraCallback("initial_category", prepareCallbackImpl1.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            prepareFailOnInner preparefailoninner = (prepareFailOnInner) ConsumptionCategoryEditViewModel.IAuthTabCallback(1779480737, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, -1779480736, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            PrepareCallbackImpl1 prepareCallbackImpl1 = (PrepareCallbackImpl1) consumptionCategoryEditViewModel.onNavigationEvent().IAuthTabCallback();
            if (preparefailoninner != null && prepareCallbackImpl1 != null) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313791L, false, (String) null, (Map) null, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda12(preparefailoninner, prepareCallbackImpl1), 14, (Object) null);
                consumptionCategoryEditViewModel.onExtraCallback();
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(prepareFailOnInner preparefailoninner, PrepareCallbackImpl1 prepareCallbackImpl1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", preparefailoninner.onExtraCallback());
        setDetectableSize.onExtraCallback("transaction_id", prepareCallbackImpl1.asInterface());
        setDetectableSize.onExtraCallback("custom_yn", zzaz.onExtraCallbackWithResult(preparefailoninner.IAuthTabCallbackStub()));
        setDetectableSize.onExtraCallback("save_yn", "N");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b A[PHI: r1 r12
      0x006b: PHI (r1v6 o.prepareFailOnInner) = (r1v5 o.prepareFailOnInner), (r1v10 o.prepareFailOnInner) binds: [B:8:0x0069, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r12v4 o.PrepareCallbackImpl1) = (r12v3 o.PrepareCallbackImpl1), (r12v15 o.PrepareCallbackImpl1) binds: [B:8:0x0069, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, Activity activity) {
        prepareFailOnInner preparefailoninner;
        PrepareCallbackImpl1 prepareCallbackImpl1;
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            preparefailoninner = (prepareFailOnInner) ConsumptionCategoryEditViewModel.IAuthTabCallback(1779480737, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, -1779480736, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            prepareCallbackImpl1 = (PrepareCallbackImpl1) consumptionCategoryEditViewModel.onNavigationEvent().IAuthTabCallback();
            int i3 = 19 / 0;
            if (preparefailoninner != null) {
                if (prepareCallbackImpl1 != null) {
                    ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313791L, false, (String) null, (Map) null, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda13(preparefailoninner, prepareCallbackImpl1), 14, (Object) null);
                    if (activity != null) {
                        int i4 = onExtraCallback + 9;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            activity.finish();
                            int i5 = 0 / 0;
                        } else {
                            activity.finish();
                        }
                        int i6 = onWarmupCompleted + 101;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            }
        } else {
            int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
            preparefailoninner = (prepareFailOnInner) ConsumptionCategoryEditViewModel.IAuthTabCallback(1779480737, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback2, -1779480736, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            prepareCallbackImpl1 = (PrepareCallbackImpl1) consumptionCategoryEditViewModel.onNavigationEvent().IAuthTabCallback();
            if (preparefailoninner != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 123;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, SessionTrackerb sessionTrackerb, Activity activity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 96) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                    int i6 = onWarmupCompleted + 117;
                    int i7 = i6 % 128;
                    onExtraCallback = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 49;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i11 = onExtraCallback + 25;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 83;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(461764756, i3, -1, "im.toss.features.home.feature.consumption_category_edit.screen.ConsumptionCategoryEditScreen.<anonymous>.<anonymous> (ConsumptionCategoryEditScreen.kt:51)");
            }
            UniformIpcUtils.onExtraCallback onextracallback = (UniformIpcUtils) IAuthTabCallback(730449285, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -730449281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (Intrinsics.areEqual(onextracallback, UniformIpcUtils.onNavigationEvent.onNavigationEvent)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-346285538);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (!(onextracallback instanceof UniformIpcUtils.onExtraCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1374305278);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-345999873);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
                UniformIpcUtils.onExtraCallback onextracallback2 = onextracallback;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCategoryEditViewModel);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda3(consumptionCategoryEditViewModel);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                        obj2 = externalSyntheticLambda3;
                    }
                    Function1 function1 = (Function1) obj2;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activity);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnExtraCallback2 | zOnExtraCallback3)) {
                        int i14 = onWarmupCompleted + 71;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Object obj3 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda4(sessionTrackerb, activity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                            obj3 = externalSyntheticLambda4;
                        }
                        Function0 function0 = (Function0) obj3;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(sessionTrackerb);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activity);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnExtraCallback4 | zOnExtraCallback5)) {
                            Object obj4 = objOnMinimized3;
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda5(sessionTrackerb, activity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                                obj4 = externalSyntheticLambda5;
                            }
                            Function0 function02 = (Function0) obj4;
                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCategoryEditViewModel);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnExtraCallback6) {
                                int i16 = onWarmupCompleted + 5;
                                onExtraCallback = i16 % 128;
                                int i17 = i16 % 2;
                                Object obj5 = objOnMinimized4;
                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda6(consumptionCategoryEditViewModel);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                                    obj5 = externalSyntheticLambda6;
                                }
                                Function0 function03 = (Function0) obj5;
                                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback);
                                boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCategoryEditViewModel);
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnExtraCallback7 | zOnExtraCallback8)) {
                                    Object obj6 = objOnMinimized5;
                                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda7(consumptionCategoryEditViewModel, onextracallback);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                                        obj6 = externalSyntheticLambda7;
                                    }
                                    Function0 function04 = (Function0) obj6;
                                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCategoryEditViewModel);
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback9 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized6 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda8(consumptionCategoryEditViewModel);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                                    }
                                    Function0 function05 = (Function0) objOnMinimized6;
                                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(consumptionCategoryEditViewModel);
                                    boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activity);
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!(zOnExtraCallback10 | zOnExtraCallback11)) {
                                        Object obj7 = objOnMinimized7;
                                        if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda9(consumptionCategoryEditViewModel, activity);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                                            obj7 = externalSyntheticLambda9;
                                        }
                                        isAppPermission.onNavigationEvent(function1, function0, function02, function03, function04, function05, (Function0) obj7, onextracallback2, quirksExternalSyntheticBackport0OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull Function0<Unit> function0, @Nullable ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, @NotNull SessionTrackerb sessionTrackerb, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel3;
        boolean z;
        int i4;
        ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 77;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(411660179);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = onWarmupCompleted + 93;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                consumptionCategoryEditViewModel2 = consumptionCategoryEditViewModel;
                int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryEditViewModel2) ? 32 : 16;
                i3 |= i12;
            } else {
                consumptionCategoryEditViewModel2 = consumptionCategoryEditViewModel;
            }
            i3 |= i12;
        } else {
            consumptionCategoryEditViewModel2 = consumptionCategoryEditViewModel;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i13 = onWarmupCompleted + 31;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(sessionTrackerb) ? 256 : 128;
        }
        int i14 = i3;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 147) != 146, i14 & 1))) {
            int i15 = onWarmupCompleted + 51;
            onExtraCallback = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if ((i2 & 2) != 0) {
                            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            z = true;
                            i4 = i14 & (-113);
                            consumptionCategoryEditViewModel4 = (ConsumptionCategoryEditViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(ConsumptionCategoryEditViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (!(CameraConfigExternalSyntheticLambda0.asBinder() ^ z)) {
                        }
                        i5 = i4;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) ConsumptionCategoryEditViewModel.IAuthTabCallback(1457809539, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1457809539, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel4}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                        Unit unit = Unit.INSTANCE;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryEditViewModel4);
                        if ((i5 & 14) != 4) {
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 2) != 0) {
                            z = true;
                            i4 = i14 & (-113);
                            consumptionCategoryEditViewModel4 = consumptionCategoryEditViewModel2;
                        } else {
                            z = true;
                            consumptionCategoryEditViewModel4 = consumptionCategoryEditViewModel2;
                            i4 = i14;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (!(CameraConfigExternalSyntheticLambda0.asBinder() ^ z)) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(411660179, i4, -1, "im.toss.features.home.feature.consumption_category_edit.screen.ConsumptionCategoryEditScreen (ConsumptionCategoryEditScreen.kt:33)");
                        }
                        i5 = i4;
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) ConsumptionCategoryEditViewModel.IAuthTabCallback(1457809539, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1457809539, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{consumptionCategoryEditViewModel4}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        Activity activityIAuthTabCallback2 = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                        Unit unit2 = Unit.INSTANCE;
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryEditViewModel4);
                        if ((i5 & 14) != 4) {
                            int i16 = onWarmupCompleted + 47;
                            onExtraCallback = i16 % 128;
                            boolean z2 = i16 % 2 == 0 ? false : z;
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback2 | z2)) {
                                int i17 = onWarmupCompleted + 119;
                                onExtraCallback = i17 % 128;
                                if (i17 % 2 == 0) {
                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new onWarmupCompleted(consumptionCategoryEditViewModel4, function0, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = UseTorchAsFlashQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, StillCaptureFlashStopRepeatingQuirk.onExtraCallback(ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), TorchIsClosedAfterImageCapturingQuirk.Companion.IAuthTabCallbackStubProxy()));
                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    int i18 = onExtraCallback + 21;
                                    onWarmupCompleted = i18 % 128;
                                    int i19 = i18 % 2;
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel5 = consumptionCategoryEditViewModel4;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                ImageLoaderBuilderExternalSyntheticLambda7.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1843163246, 1843163248, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{null, null, null, null, null, null, 0, false, null, false, null, Float.valueOf(0.0f), 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(461764756, true, new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda0(consumptionCategoryEditViewModel4, sessionTrackerb, activityIAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 131071}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                consumptionCategoryEditViewModel3 = consumptionCategoryEditViewModel5;
                            }
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            consumptionCategoryEditViewModel3 = consumptionCategoryEditViewModel2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ConsumptionCategoryEditScreenKt$.ExternalSyntheticLambda1(function0, consumptionCategoryEditViewModel3, sessionTrackerb, i, i2));
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0) + 72, 8848 - (KeyEvent.getMaxKeyCode() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $11 + 31;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        float f = 0.0f;
        if (iArr6 != null) {
            int i11 = $11 + 55;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                int i13 = $10 + 5;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr6[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 72 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), ImageFormat.getBitsPerPixel(i5) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i12])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 72 - (ViewConfiguration.getLongPressTimeout() >> 16), 8896 - AndroidCharacter.getMirror('0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                f = 0.0f;
                i5 = 0;
            }
            i2 = i5;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i14 = $10 + 57;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.red(0) + 39, 10301 - Color.red(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4032), 77 - TextUtils.indexOf((CharSequence) "", '0', 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UniformIpcUtils uniformIpcUtils = (UniformIpcUtils) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return uniformIpcUtils;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, Activity activity) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(-2034307374, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{consumptionCategoryEditViewModel, activity}, iOnNavigationEvent, 2034307376, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(SessionTrackerb sessionTrackerb, Activity activity) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(-307021336, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{sessionTrackerb, activity}, iOnNavigationEvent, 307021339, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SessionTrackerb sessionTrackerb, Activity activity) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(34720631, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{sessionTrackerb, activity}, iOnNavigationEvent, -34720626, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) IAuthTabCallback(1202533547, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{consumptionCategoryEditViewModel}, iOnNavigationEvent, -1202533547, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final UniformIpcUtils onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends UniformIpcUtils> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (UniformIpcUtils) IAuthTabCallback(730449285, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent, -730449281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, ConsumptionCategoryEditViewModel consumptionCategoryEditViewModel, SessionTrackerb sessionTrackerb, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) IAuthTabCallback(627329565, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{function0, consumptionCategoryEditViewModel, sessionTrackerb, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -627329564, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }
}
