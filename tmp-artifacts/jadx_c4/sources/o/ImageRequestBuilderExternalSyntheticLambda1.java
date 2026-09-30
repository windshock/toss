package o;

import im.toss.core.tuba.Trigger;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageRequestBuilderExternalSyntheticLambda1 implements onAssetDownloadCompleted {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Map<String, onAssetDownloadCompleted> IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequestBuilderExternalSyntheticLambda1(@NotNull Map<String, ? extends onAssetDownloadCompleted> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.IAuthTabCallback = map;
    }

    @Override // o.onAssetDownloadCompleted
    public Object onExtraCallbackWithResult(@NotNull Trigger trigger, @NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("trigger_id", trigger.onNavigationEvent()), getWrite.IAuthTabCallback("trigger_name", trigger.onWarmupCompleted()), getWrite.IAuthTabCallback("category", "tuba_trigger")});
        ConvertByteArrayToFloatArray.onWarmupCompleted("tuba_trigger", false, str, null, mapIAuthTabCallback, null, 40, null);
        ConvertByteArrayToFloatArray.onExtraCallback(1005312L, true, null, mapIAuthTabCallback, null, 20, null);
        onAssetDownloadCompleted onassetdownloadcompleted = this.IAuthTabCallback.get(trigger.getInterfaceDescriptor());
        if (onassetdownloadcompleted == null) {
            if (this.onExtraCallbackWithResult) {
                Objects.toString(trigger);
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1222601L, true, null, mapIAuthTabCallback, null, 20, null);
            return Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object objOnExtraCallbackWithResult = onassetdownloadcompleted.onExtraCallbackWithResult(trigger, str, access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i6 = onExtraCallback + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return objOnExtraCallbackWithResult;
    }
}
