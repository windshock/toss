package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RestrictiveDataManagerRestrictiveParamFilter extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RestrictiveDataManagerRestrictiveParamFilter> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final List<createNativeAdRatingApi> fields;
    private final CardRecommendCardImage image;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RestrictiveDataManagerRestrictiveParamFilter> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final RestrictiveDataManagerRestrictiveParamFilter[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            onExtraCallback = i3 % 128;
            RestrictiveDataManagerRestrictiveParamFilter[] restrictiveDataManagerRestrictiveParamFilterArr = new RestrictiveDataManagerRestrictiveParamFilter[i];
            if (i3 % 2 != 0) {
                return restrictiveDataManagerRestrictiveParamFilterArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RestrictiveDataManagerRestrictiveParamFilter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RestrictiveDataManagerRestrictiveParamFilter restrictiveDataManagerRestrictiveParamFilterOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onWarmupCompleted + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return restrictiveDataManagerRestrictiveParamFilterOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RestrictiveDataManagerRestrictiveParamFilter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 43;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RestrictiveDataManagerRestrictiveParamFilter[] restrictiveDataManagerRestrictiveParamFilterArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 == 0) {
                int i5 = 8 / 0;
            }
            return restrictiveDataManagerRestrictiveParamFilterArrIAuthTabCallback;
        }

        public final RestrictiveDataManagerRestrictiveParamFilter onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RestrictiveDataManagerRestrictiveParamFilter.class.getClassLoader());
            int i2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i3 = onWarmupCompleted + 73;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i5 = onExtraCallback + 95;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            CardRecommendCardImage cardRecommendCardImageCreateFromParcel = CardRecommendCardImage.CREATOR.createFromParcel(parcel);
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            while (i2 != i6) {
                int i7 = onExtraCallback + 9;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    arrayList.add(parcel.readParcelable(RestrictiveDataManagerRestrictiveParamFilter.class.getClassLoader()));
                    i2 += 7;
                } else {
                    arrayList.add(parcel.readParcelable(RestrictiveDataManagerRestrictiveParamFilter.class.getClassLoader()));
                    i2++;
                }
            }
            RestrictiveDataManagerRestrictiveParamFilter restrictiveDataManagerRestrictiveParamFilter = new RestrictiveDataManagerRestrictiveParamFilter(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, cardRecommendCardImageCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : reportDexLoadingIssue.CREATOR.createFromParcel(parcel));
            int i8 = onWarmupCompleted + 23;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return restrictiveDataManagerRestrictiveParamFilter;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 109;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof RestrictiveDataManagerRestrictiveParamFilter)) {
            return false;
        }
        RestrictiveDataManagerRestrictiveParamFilter restrictiveDataManagerRestrictiveParamFilter = (RestrictiveDataManagerRestrictiveParamFilter) obj;
        if (!Intrinsics.areEqual(this.type, restrictiveDataManagerRestrictiveParamFilter.type)) {
            int i6 = onNavigationEvent + 91;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, restrictiveDataManagerRestrictiveParamFilter.key)) {
            int i8 = onNavigationEvent;
            int i9 = i8 + 5;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 117;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.onBack, restrictiveDataManagerRestrictiveParamFilter.onBack)) {
            int i12 = onNavigationEvent + 23;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.clearPreviousLayouts, restrictiveDataManagerRestrictiveParamFilter.clearPreviousLayouts)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.navigationRightButton, restrictiveDataManagerRestrictiveParamFilter.navigationRightButton)) {
            int i14 = onWarmupCompleted + 31;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.logParam, restrictiveDataManagerRestrictiveParamFilter.logParam)) {
            int i16 = onNavigationEvent + 33;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, restrictiveDataManagerRestrictiveParamFilter.title) || !Intrinsics.areEqual(this.image, restrictiveDataManagerRestrictiveParamFilter.image)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.fields, restrictiveDataManagerRestrictiveParamFilter.fields))) {
            return !(Intrinsics.areEqual(this.cta, restrictiveDataManagerRestrictiveParamFilter.cta) ^ true);
        }
        int i18 = onWarmupCompleted + 39;
        onNavigationEvent = i18 % 128;
        return i18 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode5 = 0;
        int iHashCode6 = rCTCodelessLoggingEventListener == null ? 0 : rCTCodelessLoggingEventListener.hashCode();
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int iHashCode7 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.logParam;
        if (map == null) {
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = map.hashCode();
        }
        int iHashCode8 = this.title.hashCode();
        int iHashCode9 = this.image.hashCode();
        int iHashCode10 = this.fields.hashCode();
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        if (reportdexloadingissue != null) {
            iHashCode5 = reportdexloadingissue.hashCode();
            int i6 = onNavigationEvent + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DraftLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", title=" + this.title + ", image=" + this.image + ", fields=" + this.fields + ", cta=" + this.cta + ")";
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onNavigationEvent + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
            int i6 = onNavigationEvent + 65;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        this.image.writeToParcel(parcel, i);
        List<createNativeAdRatingApi> list = this.fields;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            int i8 = onWarmupCompleted + 25;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                parcel.writeParcelable(it.next(), i);
                int i9 = 55 / 0;
            } else {
                parcel.writeParcelable(it.next(), i);
            }
        }
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        if (reportdexloadingissue != null) {
            parcel.writeInt(1);
            reportdexloadingissue.writeToParcel(parcel, i);
        } else {
            int i10 = onNavigationEvent + 123;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            parcel.writeInt(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestrictiveDataManagerRestrictiveParamFilter(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull CardRecommendCardImage cardRecommendCardImage, @NotNull List<? extends createNativeAdRatingApi> list, @Nullable reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(cardRecommendCardImage, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.image = cardRecommendCardImage;
        this.fields = list;
        this.cta = reportdexloadingissue;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onBack;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader asInterface() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            dynamicLoader = this.navigationRightButton;
            int i4 = 57 / 0;
        } else {
            dynamicLoader = this.navigationRightButton;
        }
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String IAuthTabCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.title;
            int i4 = 75 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CardRecommendCardImage IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.image;
        }
        throw null;
    }

    public final List<createNativeAdRatingApi> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<createNativeAdRatingApi> list = this.fields;
        int i4 = i3 + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final reportDexLoadingIssue onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i4 = i2 + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return reportdexloadingissue;
        }
        throw null;
    }
}
