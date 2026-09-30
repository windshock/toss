package im.toss.features.home.core.remote.model.account;

import im.toss.features.home.core.model.account.AccountSource;
import im.toss.features.home.core.remote.model.account.UpdateNicknameResponse$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class UpdateNicknameResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final boolean isSuccess;
    private final AccountSource updateSource;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new UpdateNicknameResponse$.ExternalSyntheticLambda0())};

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateNicknameResponse() {
        AccountSource accountSource = null;
        this(false, accountSource, 3, (DefaultConstructorMarker) accountSource);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerSerializer = AccountSource.Companion.serializer();
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerSerializer;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UpdateNicknameResponse)) {
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UpdateNicknameResponse updateNicknameResponse = (UpdateNicknameResponse) obj;
        if (this.isSuccess == updateNicknameResponse.isSuccess) {
            return this.updateSource == updateNicknameResponse.updateSource;
        }
        int i6 = onWarmupCompleted + 119;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.isSuccess) * 31) + this.updateSource.hashCode();
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateNicknameResponse(isSuccess=" + this.isSuccess + ", updateSource=" + this.updateSource + ")";
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 65;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    public /* synthetic */ UpdateNicknameResponse(int i, boolean z, AccountSource accountSource, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this.isSuccess = z;
        if ((i & 2) != 0) {
            this.updateSource = accountSource;
            return;
        }
        int i5 = onWarmupCompleted + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            this.updateSource = AccountSource.NONE;
            return;
        }
        this.updateSource = AccountSource.NONE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UpdateNicknameResponse(boolean z, @NotNull AccountSource accountSource) {
        Intrinsics.checkNotNullParameter(accountSource, "");
        this.isSuccess = z;
        this.updateSource = accountSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(UpdateNicknameResponse updateNicknameResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = updateNicknameResponse.isSuccess;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (updateNicknameResponse.isSuccess) {
                vylVar.onNavigationEvent(serialDescriptor, 0, updateNicknameResponse.isSuccess);
                int i5 = onWarmupCompleted + 17;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 4;
                }
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1) && updateNicknameResponse.updateSource == AccountSource.NONE) {
            return;
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), updateNicknameResponse.updateSource);
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateNicknameResponse(boolean z, AccountSource accountSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            z = i2 % 2 != 0;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 13;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                accountSource = AccountSource.NONE;
                int i4 = 67 / 0;
            } else {
                accountSource = AccountSource.NONE;
            }
            int i5 = onWarmupCompleted + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this(z, accountSource);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isSuccess;
        int i5 = i2 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final AccountSource onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        AccountSource accountSource = this.updateSource;
        int i5 = i3 + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return accountSource;
        }
        throw null;
    }
}
