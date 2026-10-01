package o;

import android.app.Activity;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.home.feature.consumption_category_custom_list.ConsumptionCategoryCustomListViewModel;
import im.toss.features.home.feature.consumption_category_custom_list.screen.ConsumptionCategoryCustomListScreenKt$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.util.List;
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
import o.IPCContextManager;
import o.MaxRewardedInterstitialAdapter;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class IPCRetryHandler {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(IPCContextManager iPCContextManager, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iPCContextManager, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 46 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        IPCContextManager iPCContextManager = (IPCContextManager) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {iPCContextManager, function1, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1301468047, objArr2, iOnNavigationEvent, iOnNavigationEvent3, 1301468047);
        }
        int i4 = 8 / 0;
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1301468047, objArr2, iOnNavigationEvent, iOnNavigationEvent3, 1301468047);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(IPCParameter1 iPCParameter1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iPCParameter1, setDetectableSize);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i4)) | i8 | (~(i3 | i4));
        int i10 = (~((~i3) | i6)) | (~(i6 | i4));
        int i11 = (~((~i4) | i7)) | i8;
        int i12 = i6 + i3 + i2 + (1821889583 * i5) + ((-349070011) * i);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i3) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i2) + (473956352 * i5) + (1723858944 * i) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i3 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i2 * 921699455) + (i5 * 347275089) + (i * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        return i16 != 1 ? i16 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static final Unit onNavigationEvent(Function0 function0, Function1 function1, ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(function0, function1, consumptionCategoryCustomListViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 45;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, IPCParameter1 iPCParameter1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, iPCParameter1);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(activity);
        }
        onExtraCallback(activity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Activity activity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(activity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Function1 function1, ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, function1, consumptionCategoryCustomListViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 67;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 61 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onWarmupCompleted(IPCContextManager iPCContextManager, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(iPCContextManager, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 103;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0<Unit> $onTrackView;
        final /* synthetic */ ConsumptionCategoryCustomListViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel, Function0<Unit> function0, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$viewModel = consumptionCategoryCustomListViewModel;
            this.$onTrackView = function0;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$viewModel, this.$onTrackView, access13800Var);
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(this.$viewModel.onWarmupCompleted());
                this.label = 1;
                obj = ycxycx.IAuthTabCallback(iAnimationOnExtraCallbackWithResult, this);
                if (obj == objOnWarmupCompleted) {
                    int i5 = onNavigationEvent + 87;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    if (i5 % 2 != 0) {
                        int i7 = 99 / 0;
                    }
                    int i8 = i6 + 43;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((List) obj) != null) {
                int i10 = onNavigationEvent + 125;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    this.$onTrackView.invoke();
                    int i11 = 87 / 0;
                } else {
                    this.$onTrackView.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(IPCParameter1 iPCParameter1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", iPCParameter1.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", iPCParameter1.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, IPCParameter1 iPCParameter1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iPCParameter1, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1313775L, false, (String) null, (Map) null, new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda6(iPCParameter1), 14, (Object) null);
        function1.invoke(iPCParameter1);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull Function0<Unit> function0, @NotNull Function1<? super IPCParameter1, Unit> function1, @Nullable ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean zOnExtraCallback;
        boolean z;
        int i6;
        ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel2 = consumptionCategoryCustomListViewModel;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback + 101;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-938747063);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = IAuthTabCallback + 73;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i12 = onWarmupCompleted + 33;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        boolean z2 = true;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                int i14 = onWarmupCompleted + 1;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryCustomListViewModel2);
                    throw null;
                }
                int i15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryCustomListViewModel2) ^ true ? 128 : 256;
                i3 |= i15;
            }
        }
        int i16 = i3;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i16 & 147) != 146, i16 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i17 = IAuthTabCallback + 81;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if ((i2 & 4) != 0) {
                            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel3 = (ConsumptionCategoryCustomListViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(ConsumptionCategoryCustomListViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                            i5 = i16 & (-897);
                            int i18 = IAuthTabCallback + 57;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            consumptionCategoryCustomListViewModel2 = consumptionCategoryCustomListViewModel3;
                        }
                        i4 = i5;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(consumptionCategoryCustomListViewModel2.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        Unit unit = Unit.INSTANCE;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryCustomListViewModel2);
                        if ((i4 & 14) == 4) {
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | z)) {
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 4) != 0) {
                            i4 = i16 & (-897);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-938747063, i4, -1, "im.toss.features.home.feature.consumption_category_custom_list.screen.ConsumptionCategoryCustomListScreen (ConsumptionCategoryCustomListScreen.kt:28)");
                            }
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(consumptionCategoryCustomListViewModel2.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                            Unit unit2 = Unit.INSTANCE;
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryCustomListViewModel2);
                            z = (i4 & 14) == 4;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback | z)) {
                                int i20 = onWarmupCompleted + 115;
                                IAuthTabCallback = i20 % 128;
                                int i21 = i20 % 2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new onNavigationEvent(consumptionCategoryCustomListViewModel2, function0, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit2, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                IPCContextManager iPCContextManagerOnWarmupCompleted = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends IPCContextManager>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                if ((i4 & 112) == 32) {
                                    int i22 = onWarmupCompleted + 55;
                                    IAuthTabCallback = i22 % 128;
                                    int i23 = i22 % 2;
                                } else {
                                    z2 = false;
                                }
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized3 = new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda4(function1);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                }
                                IAuthTabCallback(iPCContextManagerOnWarmupCompleted, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                            }
                        }
                    }
                    i5 = i16;
                    i4 = i5;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback22 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(consumptionCategoryCustomListViewModel2.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                    Unit unit22 = Unit.INSTANCE;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(consumptionCategoryCustomListViewModel2);
                    if ((i4 & 14) == 4) {
                    }
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | z)) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                }
            }
        }
        ConsumptionCategoryCustomListViewModel consumptionCategoryCustomListViewModel4 = consumptionCategoryCustomListViewModel2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda5(function0, function1, consumptionCategoryCustomListViewModel4, i, i2));
        }
    }

    private static final Unit onExtraCallback(Activity activity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (activity != null) {
            int i4 = i2 + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            activity.finish();
            int i6 = onWarmupCompleted + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 77;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Activity activity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 3) {
            z = false;
        } else {
            int i5 = i3 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 1;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1172122442, i, -1, "im.toss.features.home.feature.consumption_category_custom_list.screen.ConsumptionCategoryCustomListScreen.<anonymous> (ConsumptionCategoryCustomListScreen.kt:58)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(activity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda3(activity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                    obj = externalSyntheticLambda3;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, quirksExternalSyntheticBackport0OnWarmupCompleted, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, IPCResultDesc.onNavigationEvent.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 124);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        IPCContextManager.IAuthTabCallback iAuthTabCallback = (IPCContextManager) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[2];
        int i = 3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i3 = onWarmupCompleted + 3;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    i = 4;
                }
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1465734173, iIntValue, -1, "im.toss.features.home.feature.consumption_category_custom_list.screen.ConsumptionCategoryCustomListScreen.<anonymous> (ConsumptionCategoryCustomListScreen.kt:69)");
            }
            if (Intrinsics.areEqual(iAuthTabCallback, IPCContextManager.onExtraCallbackWithResult.IAuthTabCallback)) {
                int i6 = onWarmupCompleted + 5;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1245852023);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i7 = 47 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1245852023);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                if (!(iAuthTabCallback instanceof IPCContextManager.IAuthTabCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(178734120);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                int i8 = onWarmupCompleted + 85;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1245962135);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1245962135);
                }
                IPCResult1.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void IAuthTabCallback(@NotNull IPCContextManager iPCContextManager, @NotNull Function1<? super IPCParameter1, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iPCContextManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1925441654);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iPCContextManager) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iPCContextManager)) {
                i3 = 4;
            } else {
                int i5 = onWarmupCompleted + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = IAuthTabCallback + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1925441654, i2, -1, "im.toss.features.home.feature.consumption_category_custom_list.screen.ConsumptionCategoryCustomListScreen (ConsumptionCategoryCustomListScreen.kt:54)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(-1172122442, true, new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda0((Activity) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(prefetchWithMultipleUrls.IAuthTabCallback())), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-1465734173, true, new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda1(iPCContextManager, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 47;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ConsumptionCategoryCustomListScreenKt$.ExternalSyntheticLambda2(iPCContextManager, function1, i));
            int i11 = onWarmupCompleted + 43;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private static final IPCContextManager onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends IPCContextManager> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IPCContextManager iPCContextManager = (IPCContextManager) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iPCContextManager;
    }

    public static /* synthetic */ Unit IAuthTabCallback(IPCContextManager iPCContextManager, Function1 function1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iPCContextManager, function1, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1497074479, objArr, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1497074478);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Activity activity) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1766100782, new Object[]{activity}, iOnNavigationEvent, iOnNavigationEvent3, 1766100784);
    }

    private static final Unit onWarmupCompleted(IPCContextManager iPCContextManager, Function1 function1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iPCContextManager, function1, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1301468047, objArr, iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1301468047);
    }
}
