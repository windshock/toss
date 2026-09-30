package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda5 implements Parcelable {
    public static final Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda5> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("description")
    private final String description;
    private Throwable error;

    @SerializedName("serviceId")
    private final long serviceId;

    @SerializedName("termsGroups")
    private final List<IAuthTabCallback> termsGroups;

    @SerializedName("title")
    private final String title;

    public static final class onNavigationEvent implements Parcelable.Creator<ImagePipelineExperimentsBuilderExternalSyntheticLambda5> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda5 IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = onNavigationEvent + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(IAuthTabCallback.CREATOR.createFromParcel(parcel));
            }
            ImagePipelineExperimentsBuilderExternalSyntheticLambda5 imagePipelineExperimentsBuilderExternalSyntheticLambda5 = new ImagePipelineExperimentsBuilderExternalSyntheticLambda5(string, string2, j, arrayList);
            int i6 = onWarmupCompleted + 59;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda5;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda5 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(parcel);
            }
            IAuthTabCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda5[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda5[] imagePipelineExperimentsBuilderExternalSyntheticLambda5ArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda5ArrOnExtraCallback;
        }

        public final ImagePipelineExperimentsBuilderExternalSyntheticLambda5[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ImagePipelineExperimentsBuilderExternalSyntheticLambda5[] imagePipelineExperimentsBuilderExternalSyntheticLambda5Arr = new ImagePipelineExperimentsBuilderExternalSyntheticLambda5[i];
            int i6 = i3 + 55;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return imagePipelineExperimentsBuilderExternalSyntheticLambda5Arr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda5() {
        this(null, null, 0L, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExperimentsBuilderExternalSyntheticLambda5)) {
            return false;
        }
        ImagePipelineExperimentsBuilderExternalSyntheticLambda5 imagePipelineExperimentsBuilderExternalSyntheticLambda5 = (ImagePipelineExperimentsBuilderExternalSyntheticLambda5) obj;
        if (!Intrinsics.areEqual(this.title, imagePipelineExperimentsBuilderExternalSyntheticLambda5.title) || !Intrinsics.areEqual(this.description, imagePipelineExperimentsBuilderExternalSyntheticLambda5.description) || this.serviceId != imagePipelineExperimentsBuilderExternalSyntheticLambda5.serviceId) {
            return false;
        }
        if (Intrinsics.areEqual(this.termsGroups, imagePipelineExperimentsBuilderExternalSyntheticLambda5.termsGroups)) {
            return true;
        }
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        return (i3 != 0 ? ((((iHashCode / 50) >> this.description.hashCode()) * 100) + Long.hashCode(this.serviceId)) % 22 : ((((iHashCode * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.serviceId)) * 31) + this.termsGroups.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingTerms(title=" + this.title + ", description=" + this.description + ", serviceId=" + this.serviceId + ", termsGroups=" + this.termsGroups + ")";
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeLong(this.serviceId);
        List<IAuthTabCallback> list = this.termsGroups;
        parcel.writeInt(list.size());
        Iterator<IAuthTabCallback> it = list.iterator();
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 5;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda5(@NotNull String str, @NotNull String str2, long j, @NotNull List<IAuthTabCallback> list) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.title = str;
        this.description = str2;
        this.serviceId = j;
        this.termsGroups = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda5(String str, String str2, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        String str3 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = onExtraCallback;
            int i4 = i3 + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i9 = onNavigationEvent + 7;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i10 = 2 % 2;
        } else {
            str3 = str2;
        }
        if ((i & 4) != 0) {
            int i11 = onExtraCallback + 15;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            j = 0;
        }
        this(str, str3, j, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public static final class IAuthTabCallback implements Parcelable {
        public static final Parcelable.Creator<IAuthTabCallback> CREATOR = new C0001IAuthTabCallback();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @SerializedName("necessary")
        private final boolean necessary;

        @SerializedName(PKCS12.KEY_TERMS)
        private final List<onExtraCallbackWithResult> terms;

        @SerializedName("title")
        private final String title;

        /* renamed from: o.ImagePipelineExperimentsBuilderExternalSyntheticLambda5$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0001IAuthTabCallback implements Parcelable.Creator<IAuthTabCallback> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onNavigationEvent = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(parcel);
                    throw null;
                }
                IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
                int i3 = IAuthTabCallback + 5;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return iAuthTabCallbackOnExtraCallbackWithResult;
                }
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ IAuthTabCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallback[] iAuthTabCallbackArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return iAuthTabCallbackArrOnExtraCallbackWithResult;
            }

            public final IAuthTabCallback onExtraCallbackWithResult(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
                String string = parcel.readString();
                int i2 = 0;
                if (parcel.readInt() != 0) {
                    int i3 = IAuthTabCallback + 73;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (i2 != i5) {
                    int i6 = onNavigationEvent + 9;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        arrayList.add(onExtraCallbackWithResult.CREATOR.createFromParcel(parcel));
                        i2 += 122;
                    } else {
                        arrayList.add(onExtraCallbackWithResult.CREATOR.createFromParcel(parcel));
                        i2++;
                    }
                }
                return new IAuthTabCallback(string, z, arrayList);
            }

            public final IAuthTabCallback[] onExtraCallbackWithResult(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 7;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[i];
                int i6 = i4 + 77;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return iAuthTabCallbackArr;
                }
                throw null;
            }
        }

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public IAuthTabCallback() {
            this(null, false, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 99;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            Object obj2 = null;
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.title, iAuthTabCallback.title)) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 105;
                onExtraCallbackWithResult = i4 % 128;
                boolean z = i4 % 2 != 0;
                int i5 = i3 + 17;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 38 / 0;
                }
                return z;
            }
            if (this.necessary != iAuthTabCallback.necessary) {
                int i7 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.terms, iAuthTabCallback.terms))) {
                return true;
            }
            int i9 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.title.hashCode() * 31) + Boolean.hashCode(this.necessary)) * 31) + this.terms.hashCode();
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TermsGroup(title=" + this.title + ", necessary=" + this.necessary + ", terms=" + this.terms + ")";
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            parcel.writeString(this.title);
            parcel.writeInt(this.necessary ? 1 : 0);
            List<onExtraCallbackWithResult> list = this.terms;
            parcel.writeInt(list.size());
            Iterator<onExtraCallbackWithResult> it = list.iterator();
            while (it.hasNext()) {
                int i5 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    it.next().writeToParcel(parcel, i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                it.next().writeToParcel(parcel, i);
            }
        }

        public IAuthTabCallback(@NotNull String str, boolean z, @NotNull List<onExtraCallbackWithResult> list) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
            this.title = str;
            this.necessary = z;
            this.terms = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                str = BuildConfig.FLAVOR;
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
                int i6 = 2 % 2;
            }
            this(str, z, list);
        }
    }

    public static final class onExtraCallbackWithResult implements Parcelable {
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR = new onExtraCallback();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @SerializedName("contentUrl")
        private final String contentUrl;

        @SerializedName("termsId")
        private final long termsId;

        @SerializedName("title")
        private final String title;

        public static final class onExtraCallback implements Parcelable.Creator<onExtraCallbackWithResult> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onExtraCallbackWithResult(parcel);
                }
                onExtraCallbackWithResult(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArrOnWarmupCompleted = onWarmupCompleted(i);
                int i5 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresultArrOnWarmupCompleted;
            }

            public final onExtraCallbackWithResult onExtraCallbackWithResult(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(parcel.readLong(), parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 24 / 0;
                }
                return onextracallbackwithresult;
            }

            public final onExtraCallbackWithResult[] onWarmupCompleted(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i3 % 128;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
                if (i3 % 2 != 0) {
                    return onextracallbackwithresultArr;
                }
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 55;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public onExtraCallbackWithResult() {
            this(0L, null, null, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 123;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.termsId != onextracallbackwithresult.termsId) {
                int i4 = onNavigationEvent + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.title, onextracallbackwithresult.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.contentUrl, onextracallbackwithresult.contentUrl)) {
                return true;
            }
            int i6 = onNavigationEvent + 115;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = Long.hashCode(this.termsId);
            int iHashCode2 = this.title.hashCode();
            String str = this.contentUrl;
            if (str == null) {
                int i3 = IAuthTabCallback + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode3 = str.hashCode();
                int i5 = IAuthTabCallback + 105;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode3;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoanRefinancingTerm(termsId=" + this.termsId + ", title=" + this.title + ", contentUrl=" + this.contentUrl + ")";
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            parcel.writeLong(this.termsId);
            parcel.writeString(this.title);
            parcel.writeString(this.contentUrl);
            int i5 = IAuthTabCallback + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(long j, @NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.termsId = j;
            this.title = str;
            this.contentUrl = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                j = 0;
            }
            if ((i & 2) != 0) {
                str = BuildConfig.FLAVOR;
                int i5 = IAuthTabCallback + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            if ((i & 4) != 0) {
                int i8 = onNavigationEvent + 85;
                IAuthTabCallback = i8 % 128;
                Object obj = null;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str2 = null;
            }
            this(j, str, str2);
        }
    }
}
