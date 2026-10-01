package im.toss.standardtermsv2.param;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.request.DynamicTermsStateInfoRequest;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam$;
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
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class StandardTermsV2DynamicTermsParam implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<String> handlingItems;
    private final List<StandardTermsV2BizReceiver> receivers;
    private final String termsKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StandardTermsV2DynamicTermsParam> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<StandardTermsV2DynamicTermsParam> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final StandardTermsV2DynamicTermsParam[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 87;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr = new StandardTermsV2DynamicTermsParam[i];
            int i6 = i4 + 53;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return standardTermsV2DynamicTermsParamArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2DynamicTermsParam createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2DynamicTermsParam standardTermsV2DynamicTermsParamOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onExtraCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return standardTermsV2DynamicTermsParamOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2DynamicTermsParam[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallback + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return standardTermsV2DynamicTermsParamArrIAuthTabCallback;
        }

        public final StandardTermsV2DynamicTermsParam onNavigationEvent(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback;
                int i5 = i4 + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 73;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList2.add(StandardTermsV2BizReceiver.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new StandardTermsV2DynamicTermsParam(string, arrayListCreateStringArrayList, arrayList);
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = IAuthTabCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(StandardTermsV2BizReceiver$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardTermsV2DynamicTermsParam)) {
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 71;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        StandardTermsV2DynamicTermsParam standardTermsV2DynamicTermsParam = (StandardTermsV2DynamicTermsParam) obj;
        if (!Intrinsics.areEqual(this.termsKey, standardTermsV2DynamicTermsParam.termsKey)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.handlingItems, standardTermsV2DynamicTermsParam.handlingItems))) {
            return Intrinsics.areEqual(this.receivers, standardTermsV2DynamicTermsParam.receivers);
        }
        int i8 = IAuthTabCallback + 69;
        int i9 = i8 % 128;
        onWarmupCompleted = i9;
        boolean z = !(i8 % 2 == 0);
        int i10 = i9 + 107;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.termsKey.hashCode();
        List<String> list = this.handlingItems;
        int iHashCode3 = 0;
        if (list == null) {
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<StandardTermsV2BizReceiver> list2 = this.receivers;
        if (list2 != null) {
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                list2.hashCode();
                throw null;
            }
            iHashCode3 = list2.hashCode();
            int i5 = onWarmupCompleted + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2DynamicTermsParam(termsKey=" + this.termsKey + ", handlingItems=" + this.handlingItems + ", receivers=" + this.receivers + ")";
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.termsKey);
        parcel.writeStringList(this.handlingItems);
        List<StandardTermsV2BizReceiver> list = this.receivers;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<StandardTermsV2BizReceiver> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            return;
        }
        int i5 = onWarmupCompleted + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardTermsV2DynamicTermsParam> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2DynamicTermsParam$.serializer serializerVar = StandardTermsV2DynamicTermsParam$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    StandardTermsV2DynamicTermsParam.onWarmupCompleted();
                    throw null;
                }
                KSerializer kSerializerOnWarmupCompleted = StandardTermsV2DynamicTermsParam.onWarmupCompleted();
                int i3 = IAuthTabCallback + 61;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    StandardTermsV2DynamicTermsParam.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = StandardTermsV2DynamicTermsParam.IAuthTabCallback();
                int i3 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        })};
        int i = onNavigationEvent + 77;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ StandardTermsV2DynamicTermsParam(int i, String str, List list, List list2, okycx okycxVar) {
        int i2;
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, StandardTermsV2DynamicTermsParam$.serializer.INSTANCE.getDescriptor());
        }
        this.termsKey = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.handlingItems = null;
            i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
        } else {
            this.handlingItems = list;
            i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
        }
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        if ((i & 4) != 0) {
            this.receivers = list2;
            return;
        }
        int i5 = IAuthTabCallback + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.receivers = null;
        if (i6 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public StandardTermsV2DynamicTermsParam(@NotNull String str, @Nullable List<String> list, @Nullable List<StandardTermsV2BizReceiver> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.termsKey = str;
        this.handlingItems = list;
        this.receivers = list2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(StandardTermsV2DynamicTermsParam standardTermsV2DynamicTermsParam, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, standardTermsV2DynamicTermsParam.termsKey);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (standardTermsV2DynamicTermsParam.handlingItems != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), standardTermsV2DynamicTermsParam.handlingItems);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = IAuthTabCallback + 77;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                List<StandardTermsV2BizReceiver> list = standardTermsV2DynamicTermsParam.receivers;
                throw null;
            }
            if (standardTermsV2DynamicTermsParam.receivers == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, (py) lazyArr[2].getValue(), standardTermsV2DynamicTermsParam.receivers);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StandardTermsV2DynamicTermsParam(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            list2 = null;
        }
        this(str, list, list2);
    }

    public final DynamicTermsStateInfoRequest onExtraCallbackWithResult() {
        ArrayList arrayList;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.termsKey;
        List<String> list = this.handlingItems;
        List<StandardTermsV2BizReceiver> list2 = this.receivers;
        if (list2 != null) {
            List<StandardTermsV2BizReceiver> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (!(!it.hasNext())) {
                arrayList.add(((StandardTermsV2BizReceiver) it.next()).onExtraCallback());
            }
        } else {
            arrayList = null;
        }
        DynamicTermsStateInfoRequest dynamicTermsStateInfoRequest = new DynamicTermsStateInfoRequest(str, list, arrayList);
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return dynamicTermsStateInfoRequest;
    }
}
