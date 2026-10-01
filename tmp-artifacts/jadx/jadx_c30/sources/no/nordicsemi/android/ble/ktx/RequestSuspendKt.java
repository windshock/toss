package no.nordicsemi.android.ble.ktx;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import net.sf.scuba.smartcards.BuildConfig;
import no.nordicsemi.android.ble.ReadRequest;
import no.nordicsemi.android.ble.ReadRssiRequest;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.callback.RssiCallback;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import o.IABLandingPageActivity1;
import o.InitConfig;
import o.TTAdConstant;
import o.TTAdConstantNATIVE_AD_TYPE;
import o.TTAdConstantNETWORK_STATE;
import o.TTAdConstantORIENTATION_STATE;
import o.TTC;
import o.TTImage;
import o.TTM;
import o.TombstoneProtosThread;
import o.access13800;
import o.access14300;
import o.access14600;
import o.getWrite;
import o.isSupportMultiProcess;
import o.isUseTextureView;
import o.loss;
import o.onInterstitialClicked;
import o.onInterstitialDismissed;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RequestSuspendKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull InitConfig initConfig, @NotNull access13800<? super loss> access13800Var) throws TTImage, IABLandingPageActivity1, RequestFailedException, TTM {
        RequestSuspendKt$suspend$3 requestSuspendKt$suspend$3;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof RequestSuspendKt$suspend$3) {
            requestSuspendKt$suspend$3 = (RequestSuspendKt$suspend$3) access13800Var;
            int i = requestSuspendKt$suspend$3.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                requestSuspendKt$suspend$3.label = i + PKIFailureInfo.systemUnavail;
            } else {
                requestSuspendKt$suspend$3 = new RequestSuspendKt$suspend$3(access13800Var);
            }
        }
        Object obj = requestSuspendKt$suspend$3.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = requestSuspendKt$suspend$3.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InitConfig initConfigOnExtraCallbackWithResult = initConfig.onExtraCallbackWithResult(new isSupportMultiProcess() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$$ExternalSyntheticLambda1
                public final void onDataSent(BluetoothDevice bluetoothDevice, loss lossVar) {
                    RequestSuspendKt.onExtraCallbackWithResult(objectRef2, bluetoothDevice, lossVar);
                }
            });
            Intrinsics.checkNotNullExpressionValue(initConfigOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            requestSuspendKt$suspend$3.L$0 = objectRef2;
            requestSuspendKt$suspend$3.label = 1;
            if (onNavigationEvent((Request) initConfigOnExtraCallbackWithResult, (access13800<? super Unit>) requestSuspendKt$suspend$3) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) requestSuspendKt$suspend$3.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Object obj2 = objectRef.element;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, loss lossVar) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(lossVar, BuildConfig.FLAVOR);
        objectRef.element = lossVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull ReadRequest readRequest, @NotNull access13800<? super loss> access13800Var) throws TTImage, IABLandingPageActivity1, RequestFailedException, TTM {
        RequestSuspendKt$suspend$5 requestSuspendKt$suspend$5;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof RequestSuspendKt$suspend$5) {
            requestSuspendKt$suspend$5 = (RequestSuspendKt$suspend$5) access13800Var;
            int i = requestSuspendKt$suspend$5.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                requestSuspendKt$suspend$5.label = i + PKIFailureInfo.systemUnavail;
            } else {
                requestSuspendKt$suspend$5 = new RequestSuspendKt$suspend$5(access13800Var);
            }
        }
        Object obj = requestSuspendKt$suspend$5.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = requestSuspendKt$suspend$5.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ReadRequest readRequestIAuthTabCallback = readRequest.IAuthTabCallback(new TTAdConstantNETWORK_STATE() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$$ExternalSyntheticLambda3
                public final void onDataReceived(BluetoothDevice bluetoothDevice, loss lossVar) {
                    RequestSuspendKt.IAuthTabCallback(objectRef2, bluetoothDevice, lossVar);
                }
            });
            Intrinsics.checkNotNullExpressionValue(readRequestIAuthTabCallback, BuildConfig.FLAVOR);
            requestSuspendKt$suspend$5.L$0 = objectRef2;
            requestSuspendKt$suspend$5.label = 1;
            if (onNavigationEvent((Request) readRequestIAuthTabCallback, (access13800<? super Unit>) requestSuspendKt$suspend$5) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) requestSuspendKt$suspend$5.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Object obj2 = objectRef.element;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, loss lossVar) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(lossVar, BuildConfig.FLAVOR);
        objectRef.element = lossVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull ReadRssiRequest readRssiRequest, @NotNull access13800<? super Integer> access13800Var) throws TTImage, IABLandingPageActivity1, RequestFailedException, TTM {
        RequestSuspendKt$suspend$7 requestSuspendKt$suspend$7;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof RequestSuspendKt$suspend$7) {
            requestSuspendKt$suspend$7 = (RequestSuspendKt$suspend$7) access13800Var;
            int i = requestSuspendKt$suspend$7.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                requestSuspendKt$suspend$7.label = i + PKIFailureInfo.systemUnavail;
            } else {
                requestSuspendKt$suspend$7 = new RequestSuspendKt$suspend$7(access13800Var);
            }
        }
        Object obj = requestSuspendKt$suspend$7.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = requestSuspendKt$suspend$7.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ReadRssiRequest readRssiRequestOnNavigationEvent = readRssiRequest.onNavigationEvent(new RssiCallback() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$$ExternalSyntheticLambda4
                public final void onRssiRead(BluetoothDevice bluetoothDevice, int i3) {
                    RequestSuspendKt.onNavigationEvent(objectRef2, bluetoothDevice, i3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(readRssiRequestOnNavigationEvent, BuildConfig.FLAVOR);
            requestSuspendKt$suspend$7.L$0 = objectRef2;
            requestSuspendKt$suspend$7.label = 1;
            if (onNavigationEvent((Request) readRssiRequestOnNavigationEvent, (access13800<? super Unit>) requestSuspendKt$suspend$7) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) requestSuspendKt$suspend$7.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Object obj2 = objectRef.element;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        objectRef.element = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull onInterstitialClicked oninterstitialclicked, @NotNull access13800<? super Integer> access13800Var) throws TTImage, IABLandingPageActivity1, RequestFailedException, TTM {
        RequestSuspendKt$suspend$9 requestSuspendKt$suspend$9;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof RequestSuspendKt$suspend$9) {
            requestSuspendKt$suspend$9 = (RequestSuspendKt$suspend$9) access13800Var;
            int i = requestSuspendKt$suspend$9.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                requestSuspendKt$suspend$9.label = i + PKIFailureInfo.systemUnavail;
            } else {
                requestSuspendKt$suspend$9 = new RequestSuspendKt$suspend$9(access13800Var);
            }
        }
        Object obj = requestSuspendKt$suspend$9.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = requestSuspendKt$suspend$9.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            onInterstitialClicked oninterstitialclickedOnNavigationEvent = oninterstitialclicked.onNavigationEvent(new TTAdConstantNATIVE_AD_TYPE() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$$ExternalSyntheticLambda0
                public final void onMtuChanged(BluetoothDevice bluetoothDevice, int i3) {
                    RequestSuspendKt.onWarmupCompleted(objectRef2, bluetoothDevice, i3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(oninterstitialclickedOnNavigationEvent, BuildConfig.FLAVOR);
            requestSuspendKt$suspend$9.L$0 = objectRef2;
            requestSuspendKt$suspend$9.label = 1;
            if (onNavigationEvent((Request) oninterstitialclickedOnNavigationEvent, (access13800<? super Unit>) requestSuspendKt$suspend$9) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) requestSuspendKt$suspend$9.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Object obj2 = objectRef.element;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, int i) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        objectRef.element = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull onInterstitialDismissed oninterstitialdismissed, @NotNull access13800<? super Pair<Integer, Integer>> access13800Var) throws TTImage, IABLandingPageActivity1, RequestFailedException, TTM {
        RequestSuspendKt$suspend$11 requestSuspendKt$suspend$11;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof RequestSuspendKt$suspend$11) {
            requestSuspendKt$suspend$11 = (RequestSuspendKt$suspend$11) access13800Var;
            int i = requestSuspendKt$suspend$11.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                requestSuspendKt$suspend$11.label = i + PKIFailureInfo.systemUnavail;
            } else {
                requestSuspendKt$suspend$11 = new RequestSuspendKt$suspend$11(access13800Var);
            }
        }
        Object obj = requestSuspendKt$suspend$11.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = requestSuspendKt$suspend$11.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            onInterstitialDismissed oninterstitialdismissedIAuthTabCallback = oninterstitialdismissed.IAuthTabCallback(new TTAdConstantORIENTATION_STATE() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$$ExternalSyntheticLambda2
                public final void onPhyChanged(BluetoothDevice bluetoothDevice, int i3, int i4) {
                    RequestSuspendKt.onWarmupCompleted(objectRef2, bluetoothDevice, i3, i4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(oninterstitialdismissedIAuthTabCallback, BuildConfig.FLAVOR);
            requestSuspendKt$suspend$11.L$0 = objectRef2;
            requestSuspendKt$suspend$11.label = 1;
            if (onNavigationEvent((Request) oninterstitialdismissedIAuthTabCallback, (access13800<? super Unit>) requestSuspendKt$suspend$11) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) requestSuspendKt$suspend$11.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Object obj2 = objectRef.element;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Ref.ObjectRef objectRef, BluetoothDevice bluetoothDevice, int i, int i2) {
        Intrinsics.checkNotNullParameter(objectRef, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
        objectRef.element = getWrite.IAuthTabCallback(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static final Object onNavigationEvent(final Request request, access13800<? super Unit> access13800Var) {
        final TombstoneProtosThread tombstoneProtosThread = new TombstoneProtosThread(access14300.onWarmupCompleted(access13800Var));
        request.onExtraCallbackWithResult((Handler) null).onExtraCallbackWithResult(new isUseTextureView() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$suspendNonCancellable$2$1
            public final void onInvalidRequest() {
                access13800<Unit> access13800Var2 = tombstoneProtosThread;
                Result.Companion companion = Result.Companion;
                access13800Var2.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IABLandingPageActivity1(request))));
            }
        }).onNavigationEvent(new TTAdConstant() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$suspendNonCancellable$2$2
            public final void onRequestFailed(@NotNull BluetoothDevice bluetoothDevice, int i) {
                Throwable ttm;
                Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
                if (i == -100) {
                    ttm = new TTM();
                } else if (i == -1) {
                    ttm = new TTImage();
                } else {
                    ttm = new RequestFailedException(request, i);
                }
                access13800<Unit> access13800Var2 = tombstoneProtosThread;
                Result.Companion companion = Result.Companion;
                access13800Var2.resumeWith(Result.constructor-impl(ResultKt.createFailure(ttm)));
            }
        }).onExtraCallbackWithResult(new TTC() { // from class: no.nordicsemi.android.ble.ktx.RequestSuspendKt$suspendNonCancellable$2$3
            public final void onRequestCompleted(@NotNull BluetoothDevice bluetoothDevice) {
                Intrinsics.checkNotNullParameter(bluetoothDevice, BuildConfig.FLAVOR);
                access13800<Unit> access13800Var2 = tombstoneProtosThread;
                Result.Companion companion = Result.Companion;
                access13800Var2.resumeWith(Result.constructor-impl(Unit.INSTANCE));
            }
        }).extraCallback();
        Object objOnNavigationEvent = tombstoneProtosThread.onNavigationEvent();
        if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Unit.INSTANCE;
    }
}
