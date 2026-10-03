package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.PreScreenResultAvailableFilterListResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PreScreenResultAvailableFilterListResponse implements Parcelable {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<LoanComparisonFilter> filters;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PreScreenResultAvailableFilterListResponse> CREATOR = new onExtraCallbackWithResult();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.PreScreenResultAvailableFilterListResponse$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                PreScreenResultAvailableFilterListResponse.onExtraCallbackWithResult();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = PreScreenResultAvailableFilterListResponse.onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    })};

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<PreScreenResultAvailableFilterListResponse> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final PreScreenResultAvailableFilterListResponse IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = IAuthTabCallback + 61;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(LoanComparisonFilter.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = onNavigationEvent + 29;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return new PreScreenResultAvailableFilterListResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreScreenResultAvailableFilterListResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ PreScreenResultAvailableFilterListResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                obj.hashCode();
                throw null;
            }
            PreScreenResultAvailableFilterListResponse[] preScreenResultAvailableFilterListResponseArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = IAuthTabCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return preScreenResultAvailableFilterListResponseArrOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        public final PreScreenResultAvailableFilterListResponse[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 67;
            onNavigationEvent = i4 % 128;
            PreScreenResultAvailableFilterListResponse[] preScreenResultAvailableFilterListResponseArr = new PreScreenResultAvailableFilterListResponse[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
            }
            return preScreenResultAvailableFilterListResponseArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PreScreenResultAvailableFilterListResponse() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonFilter$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj instanceof PreScreenResultAvailableFilterListResponse) {
            return Intrinsics.areEqual(this.filters, ((PreScreenResultAvailableFilterListResponse) obj).filters);
        }
        int i3 = onNavigationEvent + 73;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.filters.hashCode();
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreScreenResultAvailableFilterListResponse(filters=" + this.filters + ")";
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<LoanComparisonFilter> list = this.filters;
        parcel.writeInt(list.size());
        Iterator<LoanComparisonFilter> it = list.iterator();
        while (!(!it.hasNext())) {
            it.next().writeToParcel(parcel, i);
        }
        int i5 = onNavigationEvent + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreScreenResultAvailableFilterListResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PreScreenResultAvailableFilterListResponse$.serializer serializerVar = PreScreenResultAvailableFilterListResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    public /* synthetic */ PreScreenResultAvailableFilterListResponse(int i, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.filters = list;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.filters = CollectionsKt.emptyList();
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PreScreenResultAvailableFilterListResponse(@NotNull List<LoanComparisonFilter> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.filters = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(PreScreenResultAvailableFilterListResponse preScreenResultAvailableFilterListResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(preScreenResultAvailableFilterListResponse.filters, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), preScreenResultAvailableFilterListResponse.filters);
            int i2 = onNavigationEvent + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreScreenResultAvailableFilterListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(list);
    }

    public final List<LoanComparisonFilter> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<LoanComparisonFilter> list = this.filters;
        int i5 = i2 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
