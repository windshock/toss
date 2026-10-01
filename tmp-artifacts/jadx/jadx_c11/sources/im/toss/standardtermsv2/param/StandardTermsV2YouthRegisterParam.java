package im.toss.standardtermsv2.param;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.request.StandardTermsV2YouthRegisterRequest;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class StandardTermsV2YouthRegisterParam implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long installId;
    private final r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StandardTermsV2YouthRegisterParam> CREATOR = new onWarmupCompleted();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return StandardTermsV2YouthRegisterParam.onWarmupCompleted();
            }
            StandardTermsV2YouthRegisterParam.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static final class onWarmupCompleted implements Parcelable.Creator<StandardTermsV2YouthRegisterParam> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final StandardTermsV2YouthRegisterParam[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 7;
            onNavigationEvent = i4 % 128;
            StandardTermsV2YouthRegisterParam[] standardTermsV2YouthRegisterParamArr = new StandardTermsV2YouthRegisterParam[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 7;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return standardTermsV2YouthRegisterParamArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2YouthRegisterParam createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParamOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return standardTermsV2YouthRegisterParamOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2YouthRegisterParam[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            StandardTermsV2YouthRegisterParam[] standardTermsV2YouthRegisterParamArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return standardTermsV2YouthRegisterParamArrIAuthTabCallback;
        }

        public final StandardTermsV2YouthRegisterParam onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam = new StandardTermsV2YouthRegisterParam(parcel.readLong(), r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk.valueOf(parcel.readString()));
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return standardTermsV2YouthRegisterParam;
        }
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterType", r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk.values());
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof StandardTermsV2YouthRegisterParam)) {
            return false;
        }
        StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam = (StandardTermsV2YouthRegisterParam) obj;
        if (this.installId != standardTermsV2YouthRegisterParam.installId) {
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.type != standardTermsV2YouthRegisterParam.type) {
            return false;
        }
        int i6 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.installId) * 31) + this.type.hashCode();
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2YouthRegisterParam(installId=" + this.installId + ", type=" + this.type + ")";
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.installId);
        parcel.writeString(this.type.name());
        int i5 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardTermsV2YouthRegisterParam> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2YouthRegisterParam$.serializer serializerVar = StandardTermsV2YouthRegisterParam$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 45;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ StandardTermsV2YouthRegisterParam(int i, long j, r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk r8lambdaro5w_gxeeegq0_dthjryu474osk, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, StandardTermsV2YouthRegisterParam$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, StandardTermsV2YouthRegisterParam$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            } else {
                int i5 = 2 % 2;
            }
        }
        this.installId = j;
        this.type = r8lambdaro5w_gxeeegq0_dthjryu474osk;
    }

    public StandardTermsV2YouthRegisterParam(long j, @NotNull r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk r8lambdaro5w_gxeeegq0_dthjryu474osk) {
        Intrinsics.checkNotNullParameter(r8lambdaro5w_gxeeegq0_dthjryu474osk, "");
        this.installId = j;
        this.type = r8lambdaro5w_gxeeegq0_dthjryu474osk;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(StandardTermsV2YouthRegisterParam standardTermsV2YouthRegisterParam, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 1, standardTermsV2YouthRegisterParam.installId);
            lazy = lazyArr[0];
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, standardTermsV2YouthRegisterParam.installId);
            lazy = lazyArr2[1];
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazy.getValue(), standardTermsV2YouthRegisterParam.type);
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final StandardTermsV2YouthRegisterRequest onExtraCallback() {
        int i = 2 % 2;
        StandardTermsV2YouthRegisterRequest standardTermsV2YouthRegisterRequest = new StandardTermsV2YouthRegisterRequest(this.installId, this.type.name());
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return standardTermsV2YouthRegisterRequest;
    }
}
