package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BundleTransferInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final List<Long> amounts;
    private final String bundleKey;
    public static final Parcelable.Creator<BundleTransferInfo> CREATOR = new IAuthTabCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.BundleTransferInfo$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = BundleTransferInfo.onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }
    })};

    public static final class IAuthTabCallback implements Parcelable.Creator<BundleTransferInfo> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BundleTransferInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BundleTransferInfo bundleTransferInfoOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return bundleTransferInfoOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BundleTransferInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            BundleTransferInfo[] bundleTransferInfoArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return bundleTransferInfoArrOnExtraCallback;
            }
            throw null;
        }

        public final BundleTransferInfo[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 3;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            BundleTransferInfo[] bundleTransferInfoArr = new BundleTransferInfo[i];
            if (i3 % 2 == 0) {
                int i5 = 66 / 0;
            }
            int i6 = i4 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return bundleTransferInfoArr;
        }

        public final BundleTransferInfo onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = IAuthTabCallback + 121;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(Long.valueOf(parcel.readLong()));
                i3++;
                int i6 = onWarmupCompleted + 121;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return new BundleTransferInfo(string, arrayList);
        }
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleTransferInfo)) {
            return false;
        }
        BundleTransferInfo bundleTransferInfo = (BundleTransferInfo) obj;
        if (!Intrinsics.areEqual(this.bundleKey, bundleTransferInfo.bundleKey)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amounts, bundleTransferInfo.amounts)) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 55;
            onExtraCallback = i4 % 128;
            z = i4 % 2 != 0;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.bundleKey.hashCode();
        return i3 != 0 ? (iHashCode * 42) >> this.amounts.hashCode() : (iHashCode * 31) + this.amounts.hashCode();
    }

    public final List<Long> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<Long> list = this.amounts;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return list;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.bundleKey;
            int i4 = 75 / 0;
        } else {
            str = this.bundleKey;
        }
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundleTransferInfo(bundleKey=" + this.bundleKey + ", amounts=" + this.amounts + ")";
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.bundleKey);
            List<Long> list = this.amounts;
            parcel.writeInt(list.size());
            list.iterator();
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.bundleKey);
        List<Long> list2 = this.amounts;
        parcel.writeInt(list2.size());
        Iterator<Long> it = list2.iterator();
        while (it.hasNext()) {
            int i5 = onExtraCallback + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeLong(it.next().longValue());
                throw null;
            }
            parcel.writeLong(it.next().longValue());
        }
        int i6 = onExtraCallbackWithResult + 43;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BundleTransferInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            BundleTransferInfo$$serializer bundleTransferInfo$$serializer = BundleTransferInfo$$serializer.INSTANCE;
            if (i3 != 0) {
                return bundleTransferInfo$$serializer;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ BundleTransferInfo(int i, String str, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, BundleTransferInfo$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.bundleKey = str;
        this.amounts = list;
    }

    public BundleTransferInfo(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.bundleKey = str;
        this.amounts = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(BundleTransferInfo bundleTransferInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, bundleTransferInfo.bundleKey);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), bundleTransferInfo.amounts);
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleKey;
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }
}
