package o;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WorkDatabase_Impl extends getDiskCacheDirPath {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final String onExtraCallbackWithResult;
    private final setCompletableProgress onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkDatabase_Impl(@NotNull Context context, @NotNull String str, @NotNull setCompletableProgress setcompletableprogress) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setcompletableprogress, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = setcompletableprogress;
    }

    public List<BluetoothGattService> IAuthTabCallback() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(UUID.fromString(OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault()));
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Invalid serviceUUID : " + OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallbackDefault(), th2, (Map) null, 8, (Object) null);
            return CollectionsKt.emptyList();
        }
        UUID uuidFromString = UUID.fromString("b16459de-8dba-43f7-bc41-5aea087785f0");
        byte[] bytes = (this.onExtraCallbackWithResult + "/" + this.onWarmupCompleted.getShorten()).getBytes(OverwritingInputMerger.onExtraCallbackWithResult.IAuthTabCallback());
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        BluetoothGattService bluetoothGattServiceOnWarmupCompleted = onWarmupCompleted((UUID) obj, new BluetoothGattCharacteristic[]{IAuthTabCallback(uuidFromString, 2, 1, new loss(bytes), new BluetoothGattDescriptor[0])});
        Intrinsics.checkNotNullExpressionValue(bluetoothGattServiceOnWarmupCompleted, "");
        return CollectionsKt.listOf(bluetoothGattServiceOnWarmupCompleted);
    }
}
