package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Disclaimer implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("contents")
    private final String contents;

    @SerializedName("displayName")
    private final String displayName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Disclaimer> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<Disclaimer> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Disclaimer[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            Disclaimer[] disclaimerArr = new Disclaimer[i];
            int i6 = i3 + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return disclaimerArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Disclaimer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Disclaimer disclaimerOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return disclaimerOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Disclaimer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Disclaimer[] disclaimerArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 93;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return disclaimerArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Disclaimer onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Disclaimer disclaimer = new Disclaimer(parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 87 / 0;
            }
            return disclaimer;
        }
    }

    static {
        int i = IAuthTabCallback + 7;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Disclaimer() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof Disclaimer)) {
            return false;
        }
        Disclaimer disclaimer = (Disclaimer) obj;
        return Intrinsics.areEqual(this.contents, disclaimer.contents) && Intrinsics.areEqual(this.displayName, disclaimer.displayName);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.contents.hashCode();
        return i3 != 0 ? (iHashCode * 6) << this.displayName.hashCode() : (iHashCode * 31) + this.displayName.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Disclaimer(contents=" + this.contents + ", displayName=" + this.displayName + ")";
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contents);
        parcel.writeString(this.displayName);
        int i5 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Disclaimer> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Disclaimer$$serializer disclaimer$$serializer = Disclaimer$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return disclaimer$$serializer;
        }
    }

    public /* synthetic */ Disclaimer(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.contents = "";
            int i2 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.contents = str;
        }
        if ((i & 2) != 0) {
            this.displayName = str2;
            return;
        }
        this.displayName = "";
        int i5 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public Disclaimer(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.contents = str;
        this.displayName = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.Disclaimer r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.Disclaimer.onExtraCallbackWithResult
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.Disclaimer.onWarmupCompleted = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == r4) goto L27
            int r2 = viva.republica.toss.network.model.loan.Disclaimer.onExtraCallbackWithResult
            int r2 = r2 + 29
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.Disclaimer.onWarmupCompleted = r5
            int r2 = r2 % r0
            java.lang.String r2 = r6.contents
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L2c
        L27:
            java.lang.String r2 = r6.contents
            r7.onExtraCallback(r8, r1, r2)
        L2c:
            boolean r1 = r7.onWarmupCompleted(r8, r4)
            if (r1 != 0) goto L3a
            java.lang.String r1 = r6.displayName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L48
        L3a:
            java.lang.String r6 = r6.displayName
            r7.onExtraCallback(r8, r4, r6)
            int r6 = viva.republica.toss.network.model.loan.Disclaimer.onExtraCallbackWithResult
            int r6 = r6 + 41
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.Disclaimer.onWarmupCompleted = r7
            int r6 = r6 % r0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.Disclaimer.onNavigationEvent(viva.republica.toss.network.model.loan.Disclaimer, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Disclaimer(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contents;
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayName;
        }
        throw null;
    }
}
