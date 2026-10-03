package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdImageApi implements Parcelable {
    public static final Parcelable.Creator<NativeAdImageApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final List<String> providerValidationTargets;
    private final Map<String, List<NativeAdScrollViewApi>> regexValidationsMap;

    public static final class onWarmupCompleted implements Parcelable.Creator<NativeAdImageApi> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final NativeAdImageApi[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 101;
            onWarmupCompleted = i4 % 128;
            NativeAdImageApi[] nativeAdImageApiArr = new NativeAdImageApi[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return nativeAdImageApiArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdImageApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAdImageApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            NativeAdImageApi[] nativeAdImageApiArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return nativeAdImageApiArrIAuthTabCallback;
        }

        public final NativeAdImageApi onWarmupCompleted(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() != 0) {
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
                int i5 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 != i4; i7++) {
                    int i8 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        parcel.readString();
                        parcel.readInt();
                        linkedHashMap.hashCode();
                        throw null;
                    }
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i9 = parcel.readInt();
                        arrayList = new ArrayList(i9);
                        int i10 = 0;
                        while (i10 != i9) {
                            int i11 = onExtraCallbackWithResult + 107;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                arrayList.add(NativeAdScrollViewApi.CREATOR.createFromParcel(parcel));
                                i10 += 13;
                            } else {
                                arrayList.add(NativeAdScrollViewApi.CREATOR.createFromParcel(parcel));
                                i10++;
                            }
                        }
                    }
                    linkedHashMap2.put(string, arrayList);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new NativeAdImageApi(arrayListCreateStringArrayList, linkedHashMap);
        }
    }

    static {
        int i = onExtraCallback + 67;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof NativeAdImageApi)) {
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        NativeAdImageApi nativeAdImageApi = (NativeAdImageApi) obj;
        if (!Intrinsics.areEqual(this.providerValidationTargets, nativeAdImageApi.providerValidationTargets)) {
            return false;
        }
        if (Intrinsics.areEqual(this.regexValidationsMap, nativeAdImageApi.regexValidationsMap)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        List<String> list;
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (list = this.providerValidationTargets) != null : (list = this.providerValidationTargets) != null) {
            iHashCode = list.hashCode();
        } else {
            int i4 = i2 + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
            iHashCode = 0;
        }
        Map<String, List<NativeAdScrollViewApi>> map = this.regexValidationsMap;
        int iHashCode2 = (iHashCode * 31) + (map != null ? map.hashCode() : 0);
        int i6 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueAddressValidationResponse(providerValidationTargets=" + this.providerValidationTargets + ", regexValidationsMap=" + this.regexValidationsMap + ")";
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.providerValidationTargets);
        Map<String, List<NativeAdScrollViewApi>> map = this.regexValidationsMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        Iterator<Map.Entry<String, List<NativeAdScrollViewApi>>> it = map.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry<String, List<NativeAdScrollViewApi>> next = it.next();
            parcel.writeString(next.getKey());
            List<NativeAdScrollViewApi> value = next.getValue();
            if (value == null) {
                int i5 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(value.size());
                Iterator<NativeAdScrollViewApi> it2 = value.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
        }
        int i7 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdImageApi(@Nullable List<String> list, @Nullable Map<String, ? extends List<NativeAdScrollViewApi>> map) {
        this.providerValidationTargets = list;
        this.regexValidationsMap = map;
    }

    public final List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.providerValidationTargets;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, List<NativeAdScrollViewApi>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Map<String, List<NativeAdScrollViewApi>> map = this.regexValidationsMap;
        int i4 = i2 + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }
}
