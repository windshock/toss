package im.toss.appsintoss.manager.model;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.appsintoss.manager.model.AppsInTossProduct$;
import im.toss.appsintoss.manager.model.AppsInTossProductReceipt$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossProductReceipt implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String miniAppIconUrl;
    private final String orderId;
    private final AppsInTossProduct product;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppsInTossProductReceipt> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<AppsInTossProductReceipt> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final AppsInTossProductReceipt[] IAuthTabCallback(int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            AppsInTossProductReceipt[] appsInTossProductReceiptArr = new AppsInTossProductReceipt[i2];
            if (i4 % 2 != 0) {
                int i5 = 4 / 0;
            }
            return appsInTossProductReceiptArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppsInTossProductReceipt createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AppsInTossProductReceipt appsInTossProductReceiptOnNavigationEvent = onNavigationEvent(parcel);
            int i5 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return appsInTossProductReceiptOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppsInTossProductReceipt[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            AppsInTossProductReceipt[] appsInTossProductReceiptArrIAuthTabCallback = IAuthTabCallback(i2);
            if (i5 != 0) {
                int i6 = 33 / 0;
            }
            return appsInTossProductReceiptArrIAuthTabCallback;
        }

        public final AppsInTossProductReceipt onNavigationEvent(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AppsInTossProductReceipt appsInTossProductReceipt = new AppsInTossProductReceipt(parcel.readString(), AppsInTossProduct.CREATOR.createFromParcel(parcel), parcel.readString());
            int i3 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return appsInTossProductReceipt;
        }
    }

    static {
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        return 1 ^ (i3 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossProductReceipt)) {
            return false;
        }
        AppsInTossProductReceipt appsInTossProductReceipt = (AppsInTossProductReceipt) obj;
        if ((!Intrinsics.areEqual(this.orderId, appsInTossProductReceipt.orderId)) || !Intrinsics.areEqual(this.product, appsInTossProductReceipt.product) || !Intrinsics.areEqual(this.miniAppIconUrl, appsInTossProductReceipt.miniAppIconUrl)) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.orderId.hashCode() * 31) + this.product.hashCode()) * 31) + this.miniAppIconUrl.hashCode();
        int i5 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppsInTossProductReceipt(orderId=" + this.orderId + ", product=" + this.product + ", miniAppIconUrl=" + this.miniAppIconUrl + ")";
        int i3 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        this.product.writeToParcel(parcel, i2);
        parcel.writeString(this.miniAppIconUrl);
        if (i5 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossProductReceipt> serializer() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            AppsInTossProductReceipt$.serializer serializerVar = AppsInTossProductReceipt$.serializer.INSTANCE;
            if (i4 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ AppsInTossProductReceipt(int i2, String str, AppsInTossProduct appsInTossProduct, String str2, okycx okycxVar) {
        if (7 != (i2 & 7)) {
            int i3 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i2, 7, AppsInTossProductReceipt$.serializer.INSTANCE.getDescriptor());
            int i5 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this.orderId = str;
        this.product = appsInTossProduct;
        this.miniAppIconUrl = str2;
    }

    public AppsInTossProductReceipt(@NotNull String str, @NotNull AppsInTossProduct appsInTossProduct, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appsInTossProduct, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.product = appsInTossProduct;
        this.miniAppIconUrl = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AppsInTossProductReceipt appsInTossProductReceipt, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossProductReceipt.orderId);
        vylVar.onNavigationEvent(serialDescriptor, 1, AppsInTossProduct$.serializer.INSTANCE, appsInTossProductReceipt.product);
        vylVar.onExtraCallback(serialDescriptor, 2, appsInTossProductReceipt.miniAppIconUrl);
        int i5 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onWarmupCompleted() {
        String str;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.orderId;
            int i5 = 99 / 0;
        } else {
            str = this.orderId;
        }
        int i6 = i3 + 87;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 33 / 0;
        }
        return str;
    }

    public final AppsInTossProduct IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.product;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 93;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.miniAppIconUrl;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
