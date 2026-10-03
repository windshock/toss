package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletPollCheckMeta;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onFastRefresh implements Parcelable {
    public static final Parcelable.Creator<onFastRefresh> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("docIdList")
    private final List<Long> docIdList;

    @SerializedName("needTrack")
    private final boolean needTrack;

    @SerializedName("pollCheckMeta")
    private final DocumentWalletPollCheckMeta pollCheckMeta;

    public static final class onWarmupCompleted implements Parcelable.Creator<onFastRefresh> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onFastRefresh createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(parcel);
                throw null;
            }
            onFastRefresh onfastrefreshOnExtraCallback = onExtraCallback(parcel);
            int i3 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onfastrefreshOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onFastRefresh[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onFastRefresh[] onfastrefreshArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onfastrefreshArrOnExtraCallback;
        }

        public final onFastRefresh onExtraCallback(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DocumentWalletPollCheckMeta documentWalletPollCheckMetaCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                int i4 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (i6 != i3) {
                    int i7 = onNavigationEvent + 83;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    arrayList.add(Long.valueOf(parcel.readLong()));
                    i6++;
                    int i9 = onNavigationEvent + 95;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            if (parcel.readInt() != 0) {
                int i11 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                documentWalletPollCheckMetaCreateFromParcel = DocumentWalletPollCheckMeta.CREATOR.createFromParcel(parcel);
            }
            return new onFastRefresh(arrayList, documentWalletPollCheckMetaCreateFromParcel, parcel.readInt() != 0);
        }

        public final onFastRefresh[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i3 % 128;
            onFastRefresh[] onfastrefreshArr = new onFastRefresh[i];
            if (i3 % 2 != 0) {
                return onfastrefreshArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 35;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public onFastRefresh() {
        this(null, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onFastRefresh)) {
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        onFastRefresh onfastrefresh = (onFastRefresh) obj;
        if (!Intrinsics.areEqual(this.docIdList, onfastrefresh.docIdList)) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 105;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pollCheckMeta, onfastrefresh.pollCheckMeta)) {
            int i9 = IAuthTabCallback + 17;
            onNavigationEvent = i9 % 128;
            return i9 % 2 == 0;
        }
        if (this.needTrack == onfastrefresh.needTrack) {
            return true;
        }
        int i10 = IAuthTabCallback + 65;
        onNavigationEvent = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        List<Long> list;
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0 ? (list = this.docIdList) != null : (list = this.docIdList) != null) {
            iHashCode = list.hashCode();
        } else {
            int i4 = i3 + 101;
            IAuthTabCallback = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        return (((iHashCode * 31) + (documentWalletPollCheckMeta != null ? documentWalletPollCheckMeta.hashCode() : 0)) * 31) + Boolean.hashCode(this.needTrack);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletIssueResp(docIdList=" + this.docIdList + ", pollCheckMeta=" + this.pollCheckMeta + ", needTrack=" + this.needTrack + ")";
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.docIdList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                int i3 = IAuthTabCallback + 25;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                parcel.writeLong(it.next().longValue());
            }
        }
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        if (documentWalletPollCheckMeta == null) {
            parcel.writeInt(0);
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            documentWalletPollCheckMeta.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.needTrack ? 1 : 0);
    }

    public onFastRefresh(@Nullable List<Long> list, @Nullable DocumentWalletPollCheckMeta documentWalletPollCheckMeta, boolean z) {
        this.docIdList = list;
        this.pollCheckMeta = documentWalletPollCheckMeta;
        this.needTrack = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onFastRefresh(List list, DocumentWalletPollCheckMeta documentWalletPollCheckMeta, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i8 = IAuthTabCallback + 31;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            documentWalletPollCheckMeta = null;
        }
        this(list, documentWalletPollCheckMeta, (i & 4) != 0 ? false : z);
    }

    public final List<Long> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<Long> list = this.docIdList;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final DocumentWalletPollCheckMeta onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        DocumentWalletPollCheckMeta documentWalletPollCheckMeta = this.pollCheckMeta;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return documentWalletPollCheckMeta;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.needTrack;
        int i4 = i2 + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return z;
    }
}
