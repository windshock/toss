package viva.republica.toss.network.model.transfer;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.accesssetValueMapcp;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.onCollectWhenDestroy;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.MyAccountInfoRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MyAccountInfoRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String accountId;
    private final String accountNo;
    private final onCollectWhenDestroy accountType;
    private final int bankCode;
    private final accesssetValueMapcp context;
    private final boolean forceRefresh;
    private final String sessionKey;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.account.api.model.AccountType", onCollectWhenDestroy.values());
            int i3 = 90 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.account.api.model.AccountType", onCollectWhenDestroy.values());
        }
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnNavigationEvent = onNavigationEvent();
            int i3 = 91 / 0;
        } else {
            kSerializerOnNavigationEvent = onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.WithdrawContextType", accesssetValueMapcp.values());
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onWarmupCompleted = i3 % 128;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        if (!(obj instanceof MyAccountInfoRequest)) {
            return false;
        }
        MyAccountInfoRequest myAccountInfoRequest = (MyAccountInfoRequest) obj;
        if (!Intrinsics.areEqual(this.accountNo, myAccountInfoRequest.accountNo)) {
            int i6 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.bankCode != myAccountInfoRequest.bankCode) {
            int i8 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountId, myAccountInfoRequest.accountId)) {
            return false;
        }
        if (this.accountType != myAccountInfoRequest.accountType) {
            int i10 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.forceRefresh != myAccountInfoRequest.forceRefresh) {
            return false;
        }
        if (this.context == myAccountInfoRequest.context) {
            return Intrinsics.areEqual(this.sessionKey, myAccountInfoRequest.sessionKey);
        }
        int i12 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.accountNo.hashCode();
        int iHashCode3 = Integer.hashCode(this.bankCode);
        int iHashCode4 = this.accountId.hashCode();
        onCollectWhenDestroy oncollectwhendestroy = this.accountType;
        int iHashCode5 = 0;
        if (oncollectwhendestroy == null) {
            iHashCode = 0;
        } else {
            iHashCode = oncollectwhendestroy.hashCode();
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode6 = Boolean.hashCode(this.forceRefresh);
        accesssetValueMapcp accesssetvaluemapcp = this.context;
        int iHashCode7 = accesssetvaluemapcp == null ? 0 : accesssetvaluemapcp.hashCode();
        String str = this.sessionKey;
        if (str != null) {
            int i6 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                str.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode5 = str.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyAccountInfoRequest(accountNo=" + this.accountNo + ", bankCode=" + this.bankCode + ", accountId=" + this.accountId + ", accountType=" + this.accountType + ", forceRefresh=" + this.forceRefresh + ", context=" + this.context + ", sessionKey=" + this.sessionKey + ")";
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MyAccountInfoRequest> serializer() {
            MyAccountInfoRequest$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = MyAccountInfoRequest$.serializer.INSTANCE;
                int i3 = 99 / 0;
            } else {
                serializerVar = MyAccountInfoRequest$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.MyAccountInfoRequest$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    MyAccountInfoRequest.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = MyAccountInfoRequest.onExtraCallback();
                int i3 = onExtraCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.MyAccountInfoRequest$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return MyAccountInfoRequest.onExtraCallbackWithResult();
                }
                MyAccountInfoRequest.onExtraCallbackWithResult();
                throw null;
            }
        }), null};
        int i = onExtraCallback + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ MyAccountInfoRequest(int i, String str, int i2, String str2, onCollectWhenDestroy oncollectwhendestroy, boolean z, accesssetValueMapcp accesssetvaluemapcp, String str3, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i3 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 7, MyAccountInfoRequest$.serializer.INSTANCE.getDescriptor());
        }
        this.accountNo = str;
        this.bankCode = i2;
        this.accountId = str2;
        if ((i & 8) == 0) {
            this.accountType = null;
            int i5 = 2 % 2;
        } else {
            this.accountType = oncollectwhendestroy;
        }
        if ((i & 16) == 0) {
            this.forceRefresh = false;
            int i6 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.forceRefresh = z;
        }
        if ((i & 32) == 0) {
            this.context = null;
        } else {
            this.context = accesssetvaluemapcp;
        }
        if ((i & 64) == 0) {
            this.sessionKey = null;
        } else {
            this.sessionKey = str3;
        }
    }

    public MyAccountInfoRequest(@NotNull String str, int i, @NotNull String str2, @Nullable onCollectWhenDestroy oncollectwhendestroy, boolean z, @Nullable accesssetValueMapcp accesssetvaluemapcp, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountNo = str;
        this.bankCode = i;
        this.accountId = str2;
        this.accountType = oncollectwhendestroy;
        this.forceRefresh = z;
        this.context = accesssetvaluemapcp;
        this.sessionKey = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(MyAccountInfoRequest myAccountInfoRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, myAccountInfoRequest.accountNo);
        vylVar.onExtraCallback(serialDescriptor, 1, myAccountInfoRequest.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 2, myAccountInfoRequest.accountId);
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || myAccountInfoRequest.accountType != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, (py) lazyArr[3].getValue(), myAccountInfoRequest.accountType);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || myAccountInfoRequest.forceRefresh) {
            vylVar.onNavigationEvent(serialDescriptor, 4, myAccountInfoRequest.forceRefresh);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || myAccountInfoRequest.context != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, (py) lazyArr[5].getValue(), myAccountInfoRequest.context);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || myAccountInfoRequest.sessionKey != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, myAccountInfoRequest.sessionKey);
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MyAccountInfoRequest(String str, int i, String str2, onCollectWhenDestroy oncollectwhendestroy, boolean z, accesssetValueMapcp accesssetvaluemapcp, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        accesssetValueMapcp accesssetvaluemapcp2;
        String str4;
        Object obj = null;
        onCollectWhenDestroy oncollectwhendestroy2 = (i2 & 8) != 0 ? null : oncollectwhendestroy;
        if ((i2 & 16) != 0) {
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            int i5 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            accesssetvaluemapcp2 = null;
        } else {
            accesssetvaluemapcp2 = accesssetvaluemapcp;
        }
        if ((i2 & 64) != 0) {
            int i7 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        this(str, i, str2, oncollectwhendestroy2, z2, accesssetvaluemapcp2, str4);
    }
}
