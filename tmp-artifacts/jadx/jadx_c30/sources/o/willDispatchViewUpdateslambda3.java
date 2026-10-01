package o;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class willDispatchViewUpdateslambda3 extends BaseApiResponse<onNavigationEvent> implements getNodesManager {
    public static final int $stable = 8;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final class IAuthTabCallback {

        @SerializedName("delayTransfer")
        private final boolean delayTransfer;

        @SerializedName("delayTransferInfo")
        private final onExtraCallbackWithResult delayTransferInfo;
        final /* synthetic */ willDispatchViewUpdateslambda3 this$0;
    }

    public final class onExtraCallback {

        @SerializedName("amount")
        private final long amount;

        @SerializedName("completeTs")
        private final String completeTs;
        final /* synthetic */ willDispatchViewUpdateslambda3 this$0;

        @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_TRANSFER_NO)
        private final String transferNo;
    }

    public final class onExtraCallbackWithResult {

        @SerializedName("hours")
        private final int hours;

        @SerializedName("limitAmount")
        private final long limitAmount;

        @SerializedName("scheme")
        private final String scheme;
        final /* synthetic */ willDispatchViewUpdateslambda3 this$0;
    }

    public static final class onNavigationEvent {
        public static final int $stable = 0;

        @SerializedName("settings")
        private final IAuthTabCallback settings;

        @SerializedName("transfer")
        private final onExtraCallback transfer;
    }

    public /* bridge */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return zIAuthTabCallback;
    }

    public /* bridge */ void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(context);
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onExtraCallback();
        }
        int i3 = 2 / 0;
        return super.onExtraCallback();
    }

    public /* bridge */ boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted();
            throw null;
        }
        boolean zOnWarmupCompleted = super.onWarmupCompleted();
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    public /* bridge */ boolean readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.readTypedObject();
            throw null;
        }
        boolean typedObject = super.readTypedObject();
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return typedObject;
        }
        throw null;
    }

    public /* bridge */ boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.writeTypedObject();
            throw null;
        }
        boolean zWriteTypedObject = super.writeTypedObject();
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zWriteTypedObject;
        }
        throw null;
    }
}
