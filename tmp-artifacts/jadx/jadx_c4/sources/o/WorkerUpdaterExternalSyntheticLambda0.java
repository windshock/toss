package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkerUpdaterExternalSyntheticLambda0 extends getReflectContext {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private byte[] access100;
    private BluetoothGattCharacteristic getInterfaceDescriptor;
    private final BluetoothDevice onTransact;

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        access000 = i2 % 128;
        return i2 % 2 != 0 ? 71 : 6;
    }

    public boolean onExtraCallback(@NotNull BluetoothGatt bluetoothGatt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bluetoothGatt, "");
        return i3 == 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdaterExternalSyntheticLambda0(@NotNull Context context, @NotNull String str, @NotNull setCompletableProgress setcompletableprogress, @NotNull BluetoothDevice bluetoothDevice) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setcompletableprogress, "");
        Intrinsics.checkNotNullParameter(bluetoothDevice, "");
        this.onTransact = bluetoothDevice;
        byte[] bytes = (str + "/" + setcompletableprogress.getShorten()).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        this.access100 = bytes;
    }

    public void IAuthTabCallback(@NotNull BluetoothGattServer bluetoothGattServer) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bluetoothGattServer, "");
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(UUID.fromString(OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault()));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Invalid UUID: " + OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault(), th2, (Map) null, 8, (Object) null);
            return;
        }
        UUID uuid = (UUID) obj;
        BluetoothGattService service = bluetoothGattServer.getService(uuid);
        if (service != null) {
            this.getInterfaceDescriptor = service.getCharacteristic(uuid);
            int i4 = IAuthTabCallback_Parcel + 121;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public BluetoothDevice onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        BluetoothDevice bluetoothDevice = this.onTransact;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return bluetoothDevice;
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(this.getInterfaceDescriptor, this.access100).extraCallback();
            int i3 = 11 / 0;
        } else {
            onNavigationEvent(this.getInterfaceDescriptor, this.access100).extraCallback();
        }
        int i4 = access000 + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }
}
