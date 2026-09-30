package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class createErrorInitResult implements Parcelable {
    public static final Parcelable.Creator<createErrorInitResult> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String categoryTitle;
    private long id;
    private final boolean optional;
    private final Long ref;
    private final boolean shouldCheckAllTerm;
    private final List<createInMemoryClassLoader> termsList;

    public static final class onWarmupCompleted implements Parcelable.Creator<createErrorInitResult> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createErrorInitResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createErrorInitResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createErrorInitResult[] createerrorinitresultArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
            int i6 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return createerrorinitresultArrOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final createErrorInitResult onExtraCallback(Parcel parcel) {
            Long lValueOf;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            long j = parcel.readLong();
            String string = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(createInMemoryClassLoader.CREATOR.createFromParcel(parcel));
                    i3 += 99;
                } else {
                    arrayList.add(createInMemoryClassLoader.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                int i5 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 4;
                }
            }
            Long l = lValueOf;
            if (parcel.readInt() != 0) {
                int i7 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    z = true;
                }
                return new createErrorInitResult(j, string, z2, arrayList, l, z);
            }
            int i8 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = false;
            return new createErrorInitResult(j, string, z2, arrayList, l, z);
        }

        public final createErrorInitResult[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            createErrorInitResult[] createerrorinitresultArr = new createErrorInitResult[i];
            if (i3 % 2 != 0) {
                return createerrorinitresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 51;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.id);
        parcel.writeString(this.categoryTitle);
        parcel.writeInt(this.optional ? 1 : 0);
        List<createInMemoryClassLoader> list = this.termsList;
        parcel.writeInt(list.size());
        Iterator<createInMemoryClassLoader> it = list.iterator();
        while (it.hasNext()) {
            int i5 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
            int i7 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        Long l = this.ref;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.shouldCheckAllTerm ? 1 : 0);
    }

    public createErrorInitResult(long j, @NotNull String str, boolean z, @NotNull List<createInMemoryClassLoader> list, @Nullable Long l, boolean z2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.id = j;
        this.categoryTitle = str;
        this.optional = z;
        this.termsList = list;
        this.ref = l;
        this.shouldCheckAllTerm = z2;
    }
}
