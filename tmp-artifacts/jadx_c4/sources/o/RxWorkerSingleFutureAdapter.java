package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.ParcelUuid;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.RxWorkerSingleFutureAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RxWorkerSingleFutureAdapter {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final Worker IAuthTabCallback;
    private AdvertiseCallback onExtraCallback;
    private AtomicBoolean onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final BluetoothAdapter onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[Worker.values().length];
            try {
                iArr[Worker.BACKGROUND.ordinal()] = 1;
                int i = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Worker.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = asInterface + 105;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ BluetoothLeAdvertiser onWarmupCompleted(RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BluetoothLeAdvertiser bluetoothLeAdvertiserOnExtraCallbackWithResult = onExtraCallbackWithResult(rxWorkerSingleFutureAdapter);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = IAuthTabCallbackStub + 15;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return bluetoothLeAdvertiserOnExtraCallbackWithResult;
        }
        throw null;
    }

    public RxWorkerSingleFutureAdapter(@Nullable BluetoothAdapter bluetoothAdapter, @NotNull Worker worker) {
        Intrinsics.checkNotNullParameter(worker, "");
        this.onWarmupCompleted = bluetoothAdapter;
        this.IAuthTabCallback = worker;
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.advertiser.TossBleAdvertiser$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                BluetoothLeAdvertiser bluetoothLeAdvertiserOnWarmupCompleted = RxWorkerSingleFutureAdapter.onWarmupCompleted(this.f$0);
                int i4 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return bluetoothLeAdvertiserOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallbackWithResult = new AtomicBoolean(false);
    }

    public static final /* synthetic */ AtomicBoolean onExtraCallback(RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = rxWorkerSingleFutureAdapter.onExtraCallbackWithResult;
        if (i3 != 0) {
            return atomicBoolean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final BluetoothLeAdvertiser onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BluetoothLeAdvertiser bluetoothLeAdvertiser = (BluetoothLeAdvertiser) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackStub + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return bluetoothLeAdvertiser;
    }

    private static final BluetoothLeAdvertiser onExtraCallbackWithResult(RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        BluetoothAdapter bluetoothAdapter = rxWorkerSingleFutureAdapter.onWarmupCompleted;
        if (bluetoothAdapter == null) {
            return null;
        }
        int i5 = i2 + 97;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return bluetoothAdapter.getBluetoothLeAdvertiser();
    }

    public static /* synthetic */ void onExtraCallback(RxWorkerSingleFutureAdapter rxWorkerSingleFutureAdapter, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 17;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        rxWorkerSingleFutureAdapter.onExtraCallbackWithResult(z);
        int i8 = IAuthTabCallbackStub + 99;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 2 / 0;
        }
    }

    public static final class onWarmupCompleted extends AdvertiseCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        onWarmupCompleted() {
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartSuccess(AdvertiseSettings advertiseSettings) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(advertiseSettings, "");
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleAdvertiser", "advertising onStartSuccess settingsInEffect : " + advertiseSettings, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            int i2 = onWarmupCompleted + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartFailure(int i) throws Throwable {
            int i2 = 2 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleAdvertiser", "advertising onStartFailure errorCode : " + i, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            RxWorkerSingleFutureAdapter.onExtraCallback(RxWorkerSingleFutureAdapter.this).set(false);
            int i3 = onExtraCallback + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onExtraCallbackWithResult(boolean z) throws Throwable {
        boolean z2;
        Object obj;
        AdvertiseData advertiseDataBuild;
        String strIAuthTabCallbackStub;
        Object obj2;
        int i = 2 % 2;
        if (!this.onExtraCallbackWithResult.get()) {
            int i2 = onTransact + 51;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            OverwritingInputMerger overwritingInputMerger = OverwritingInputMerger.onExtraCallbackWithResult;
            if (overwritingInputMerger.access000().length() == 0) {
                return;
            }
            this.onExtraCallbackWithResult.set(true);
            this.onExtraCallback = new onWarmupCompleted();
            AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
            builder.setAdvertiseMode(overwritingInputMerger.onExtraCallback().getAdvertisingMode());
            builder.setTxPowerLevel(overwritingInputMerger.onExtraCallback().getTxPowerLevel());
            if (this.IAuthTabCallback == Worker.BACKGROUND) {
                int i4 = IAuthTabCallbackStub + 5;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            AdvertiseSettings advertiseSettingsBuild = builder.setConnectable(z2).build();
            int i6 = IAuthTabCallback.onWarmupCompleted[this.IAuthTabCallback.ordinal()];
            if (i6 != 1) {
                int i7 = IAuthTabCallbackStub + 39;
                onTransact = i7 % 128;
                if (i7 % 2 != 0 ? i6 != 2 : i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                ParcelUuid parcelUuid = new ParcelUuid(UUID.fromString("00000000-0000-1000-8000-00805F9B34FB"));
                byte[] bytes = overwritingInputMerger.asInterface().getBytes(overwritingInputMerger.IAuthTabCallback());
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                advertiseDataBuild = includeTxPowerLevel.addServiceData(parcelUuid, bytes).addServiceUuid(new ParcelUuid(UUID.fromString(overwritingInputMerger.access000()))).build();
            } else {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ParcelUuid.fromString(overwritingInputMerger.IAuthTabCallbackDefault()));
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    this.onExtraCallbackWithResult.set(false);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Invalid serviceUUID : " + OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault(), th2, (Map) null, 8, (Object) null);
                    return;
                }
                advertiseDataBuild = new AdvertiseData.Builder().setIncludeDeviceName(false).addServiceUuid((ParcelUuid) obj).build();
            }
            AdvertiseData advertiseData = advertiseDataBuild;
            AdvertiseData.Builder includeDeviceName = new AdvertiseData.Builder().setIncludeDeviceName(false);
            if (this.IAuthTabCallback == Worker.BACKGROUND) {
                int i8 = IAuthTabCallbackStub + 85;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (z) {
                    strIAuthTabCallbackStub = OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackStub();
                } else {
                    strIAuthTabCallbackStub = (String) OverwritingInputMerger.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1316568974, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), new Object[]{OverwritingInputMerger.onExtraCallbackWithResult}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1316568973);
                }
                byte[] bytes2 = strIAuthTabCallbackStub.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                try {
                    Result.Companion companion3 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(UUID.fromString(OverwritingInputMerger.onExtraCallbackWithResult.access000()));
                } catch (Throwable th3) {
                    Result.Companion companion4 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
                }
                Throwable th4 = kotlin.Result.exceptionOrNull-impl(obj2);
                if (th4 != null) {
                    this.onExtraCallbackWithResult.set(false);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Invalid userSpecifyUUID : " + OverwritingInputMerger.onExtraCallbackWithResult.access000(), th4, (Map) null, 8, (Object) null);
                    return;
                }
                includeDeviceName.addServiceData(new ParcelUuid((UUID) obj2), bytes2);
            }
            AdvertiseData advertiseDataBuild2 = includeDeviceName.build();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            AdvertiseCallback advertiseCallback = this.onExtraCallback;
            Integer numValueOf = advertiseCallback != null ? Integer.valueOf(advertiseCallback.hashCode()) : null;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleAdvertiser", "startAdvertising callbackHash : " + numValueOf + " mode : " + this.IAuthTabCallback, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            BluetoothLeAdvertiser bluetoothLeAdvertiserOnExtraCallback = onExtraCallback();
            if (bluetoothLeAdvertiserOnExtraCallback != null) {
                bluetoothLeAdvertiserOnExtraCallback.startAdvertising(advertiseSettingsBuild, advertiseData, advertiseDataBuild2, this.onExtraCallback);
            }
        }
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        AdvertiseCallback advertiseCallback = this.onExtraCallback;
        Integer numValueOf = advertiseCallback != null ? Integer.valueOf(advertiseCallback.hashCode()) : null;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleAdvertiser", "stopAdvertising callbackHash : " + numValueOf + " mode : " + this.IAuthTabCallback, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        AdvertiseCallback advertiseCallback2 = this.onExtraCallback;
        if (advertiseCallback2 != null) {
            this.onExtraCallbackWithResult.set(false);
            BluetoothLeAdvertiser bluetoothLeAdvertiserOnExtraCallback = onExtraCallback();
            if (bluetoothLeAdvertiserOnExtraCallback != null) {
                int i4 = IAuthTabCallbackStub + 119;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                bluetoothLeAdvertiserOnExtraCallback.stopAdvertising(advertiseCallback2);
                int i6 = onTransact + 117;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
