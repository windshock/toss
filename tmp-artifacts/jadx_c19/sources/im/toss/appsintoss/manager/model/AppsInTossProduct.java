package im.toss.appsintoss.manager.model;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.appsintoss.manager.model.AppsInTossProduct$;
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
public final class AppsInTossProduct implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long amount;
    private final String currency;
    private final String displayName;
    private final String displayPrice;
    private final int fraction;
    private final String productId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppsInTossProduct> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<AppsInTossProduct> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppsInTossProduct createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 39;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            AppsInTossProduct appsInTossProductOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallbackWithResult + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return appsInTossProductOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppsInTossProduct[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                onExtraCallback(i2);
                obj.hashCode();
                throw null;
            }
            AppsInTossProduct[] appsInTossProductArrOnExtraCallback = onExtraCallback(i2);
            int i5 = onExtraCallbackWithResult + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return appsInTossProductArrOnExtraCallback;
            }
            throw null;
        }

        public final AppsInTossProduct[] onExtraCallback(int i2) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback;
            int i5 = i4 + 11;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            AppsInTossProduct[] appsInTossProductArr = new AppsInTossProduct[i2];
            int i7 = i4 + 105;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return appsInTossProductArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AppsInTossProduct onNavigationEvent(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AppsInTossProduct appsInTossProduct = new AppsInTossProduct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
            int i3 = onExtraCallbackWithResult + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return appsInTossProduct;
        }
    }

    static {
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof AppsInTossProduct)) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AppsInTossProduct appsInTossProduct = (AppsInTossProduct) obj;
        if (!Intrinsics.areEqual(this.productId, appsInTossProduct.productId)) {
            int i6 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.displayName, appsInTossProduct.displayName)) {
            int i8 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.displayPrice, appsInTossProduct.displayPrice)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.currency, appsInTossProduct.currency)) {
            int i10 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.amount != appsInTossProduct.amount) {
            return false;
        }
        if (this.fraction == appsInTossProduct.fraction) {
            return true;
        }
        int i12 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((this.productId.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.displayPrice.hashCode()) * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + Integer.hashCode(this.fraction);
        int i5 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppsInTossProduct(productId=" + this.productId + ", displayName=" + this.displayName + ", displayPrice=" + this.displayPrice + ", currency=" + this.currency + ", amount=" + this.amount + ", fraction=" + this.fraction + ")";
        int i3 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.productId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayPrice);
        parcel.writeString(this.currency);
        parcel.writeLong(this.amount);
        parcel.writeInt(this.fraction);
        int i6 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossProduct> serializer() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 83;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                AppsInTossProduct$.serializer serializerVar = AppsInTossProduct$.serializer.INSTANCE;
                throw null;
            }
            AppsInTossProduct$.serializer serializerVar2 = AppsInTossProduct$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ AppsInTossProduct(int i2, String str, String str2, String str3, String str4, long j, int i3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i4 = 63;
        if (63 != (i2 & 63)) {
            int i5 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                descriptor = AppsInTossProduct$.serializer.INSTANCE.getDescriptor();
                i4 = 88;
            } else {
                descriptor = AppsInTossProduct$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i2, i4, descriptor);
            int i6 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        this.productId = str;
        this.displayName = str2;
        this.displayPrice = str3;
        this.currency = str4;
        this.amount = j;
        this.fraction = i3;
    }

    public AppsInTossProduct(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.productId = str;
        this.displayName = str2;
        this.displayPrice = str3;
        this.currency = str4;
        this.amount = j;
        this.fraction = i2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AppsInTossProduct appsInTossProduct, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossProduct.productId);
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProduct.displayName);
        vylVar.onExtraCallback(serialDescriptor, 2, appsInTossProduct.displayPrice);
        vylVar.onExtraCallback(serialDescriptor, 3, appsInTossProduct.currency);
        vylVar.onExtraCallback(serialDescriptor, 4, appsInTossProduct.amount);
        vylVar.onExtraCallback(serialDescriptor, 5, appsInTossProduct.fraction);
        int i5 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        String str = this.displayName;
        int i6 = i4 + 61;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.displayPrice;
        int i6 = i3 + 65;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return this.currency;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        long j = this.amount;
        int i6 = i4 + 69;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return j;
    }

    public final int onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.fraction;
        int i7 = i3 + 63;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }
}
