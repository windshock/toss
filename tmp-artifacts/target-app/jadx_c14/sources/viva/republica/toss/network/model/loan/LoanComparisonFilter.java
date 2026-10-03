package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonFilter implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String helpText;
    private final String highlightText;
    private final String key;
    private final String subTitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanComparisonFilter> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<LoanComparisonFilter> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonFilter createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFilter loanComparisonFilterOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return loanComparisonFilterOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonFilter[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            LoanComparisonFilter[] loanComparisonFilterArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return loanComparisonFilterArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanComparisonFilter onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanComparisonFilter loanComparisonFilter = new LoanComparisonFilter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return loanComparisonFilter;
            }
            throw null;
        }

        public final LoanComparisonFilter[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            LoanComparisonFilter[] loanComparisonFilterArr = new LoanComparisonFilter[i];
            int i6 = i3 + 115;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 76 / 0;
            }
            return loanComparisonFilterArr;
        }
    }

    static {
        int i = onNavigationEvent + 37;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof LoanComparisonFilter))) {
            LoanComparisonFilter loanComparisonFilter = (LoanComparisonFilter) obj;
            if (!Intrinsics.areEqual(this.key, loanComparisonFilter.key) || !Intrinsics.areEqual(this.title, loanComparisonFilter.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.subTitle, loanComparisonFilter.subTitle)) {
                if (!Intrinsics.areEqual(this.helpText, loanComparisonFilter.helpText)) {
                    int i4 = onExtraCallbackWithResult + 39;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.highlightText, loanComparisonFilter.highlightText)) {
                    return true;
                }
                int i6 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonFilter.onWarmupCompleted
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.String r1 = r7.key
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.title
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.subTitle
            if (r4 != 0) goto L32
            goto L30
        L20:
            java.lang.String r1 = r7.key
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.title
            int r3 = r3.hashCode()
            java.lang.String r4 = r7.subTitle
            if (r4 != 0) goto L32
        L30:
            r4 = r2
            goto L36
        L32:
            int r4 = r4.hashCode()
        L36:
            java.lang.String r5 = r7.helpText
            if (r5 != 0) goto L4a
            int r5 = viva.republica.toss.network.model.loan.LoanComparisonFilter.onWarmupCompleted
            int r5 = r5 + 105
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L48
            r0 = 4
            int r0 = r0 % 3
        L48:
            r0 = r2
            goto L4e
        L4a:
            int r0 = r5.hashCode()
        L4e:
            java.lang.String r5 = r7.highlightText
            if (r5 == 0) goto L56
            int r2 = r5.hashCode()
        L56:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonFilter.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonFilter(key=" + this.key + ", title=" + this.title + ", subTitle=" + this.subTitle + ", helpText=" + this.helpText + ", highlightText=" + this.highlightText + ")";
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.helpText);
        parcel.writeString(this.highlightText);
        int i5 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonFilter> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFilter$$serializer loanComparisonFilter$$serializer = LoanComparisonFilter$$serializer.INSTANCE;
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return loanComparisonFilter$$serializer;
        }
    }

    public /* synthetic */ LoanComparisonFilter(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, LoanComparisonFilter$$serializer.INSTANCE.getDescriptor());
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.key = str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.subTitle = null;
            int i4 = 2 % 2;
        } else {
            this.subTitle = str3;
        }
        if ((i & 8) == 0) {
            this.helpText = null;
            int i5 = 2 % 2;
        } else {
            this.helpText = str4;
        }
        if ((i & 16) != 0) {
            this.highlightText = str5;
            return;
        }
        int i6 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        this.highlightText = null;
        if (i7 == 0) {
            throw null;
        }
    }

    public LoanComparisonFilter(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.title = str2;
        this.subTitle = str3;
        this.helpText = str4;
        this.highlightText = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonFilter r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            java.lang.String r2 = r5.key
            r6.onExtraCallback(r7, r1, r2)
            r1 = 1
            java.lang.String r2 = r5.title
            r6.onExtraCallback(r7, r1, r2)
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            r2 = 0
            if (r1 != 0) goto L2c
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallbackWithResult
            int r1 = r1 + 103
            int r3 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFilter.onWarmupCompleted = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            java.lang.String r1 = r5.subTitle
            if (r1 == 0) goto L33
            goto L2c
        L26:
            java.lang.String r5 = r5.subTitle
            r2.hashCode()
            throw r2
        L2c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.subTitle
            r6.onExtraCallbackWithResult(r7, r0, r1, r3)
        L33:
            r1 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L3e
            java.lang.String r3 = r5.helpText
            if (r3 == 0) goto L45
        L3e:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.helpText
            r6.onExtraCallbackWithResult(r7, r1, r3, r4)
        L45:
            r1 = 4
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            if (r3 != 0) goto L62
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallbackWithResult
            int r3 = r3 + 71
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFilter.onWarmupCompleted = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L5c
            java.lang.String r3 = r5.highlightText
            if (r3 == 0) goto L69
            goto L62
        L5c:
            java.lang.String r5 = r5.highlightText
            r2.hashCode()
            throw r2
        L62:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.highlightText
            r6.onExtraCallbackWithResult(r7, r1, r3, r5)
        L69:
            int r5 = viva.republica.toss.network.model.loan.LoanComparisonFilter.onWarmupCompleted
            int r5 = r5 + 5
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L75
            return
        L75:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonFilter.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonFilter, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.subTitle;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.helpText;
        int i5 = i2 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.highlightText;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return str;
    }
}
