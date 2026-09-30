package o;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class BaseActivityEventListener implements fromJavaArgs, Parcelable {
    public static final Parcelable.Creator<BaseActivityEventListener> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final List<onExtraCallbackWithResult> answers;
    private final String id;
    private final String question;
    private final makeNativeArray type;

    public static final class onWarmupCompleted implements Parcelable.Creator<BaseActivityEventListener> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BaseActivityEventListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BaseActivityEventListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 43;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            BaseActivityEventListener[] baseActivityEventListenerArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 20 / 0;
            }
            return baseActivityEventListenerArrOnExtraCallbackWithResult;
        }

        public final BaseActivityEventListener onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            makeNativeArray makenativearrayValueOf = makeNativeArray.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onExtraCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(onExtraCallbackWithResult.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = onExtraCallbackWithResult + 43;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return new BaseActivityEventListener(makenativearrayValueOf, string, string2, arrayList);
        }

        public final BaseActivityEventListener[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 79;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            BaseActivityEventListener[] baseActivityEventListenerArr = new BaseActivityEventListener[i];
            int i6 = i4 + 41;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 65 / 0;
            }
            return baseActivityEventListenerArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 89;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }

    public BaseActivityEventListener() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseActivityEventListener)) {
            int i6 = i2 + 11;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 84 / 0;
            }
            return false;
        }
        BaseActivityEventListener baseActivityEventListener = (BaseActivityEventListener) obj;
        if (this.type != baseActivityEventListener.type) {
            int i8 = i4 + 103;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, baseActivityEventListener.id)) {
            int i10 = onWarmupCompleted + 109;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.question, baseActivityEventListener.question)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.answers, baseActivityEventListener.answers))) {
            return true;
        }
        int i12 = onWarmupCompleted + 81;
        IAuthTabCallback = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.question.hashCode()) * 31) + this.answers.hashCode();
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowChoiceAction(type=" + this.type + ", id=" + this.id + ", question=" + this.question + ", answers=" + this.answers + ")";
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.type.name());
        parcel.writeString(this.id);
        parcel.writeString(this.question);
        List<onExtraCallbackWithResult> list = this.answers;
        parcel.writeInt(list.size());
        Iterator<onExtraCallbackWithResult> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        int i5 = onWarmupCompleted + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public BaseActivityEventListener(@NotNull makeNativeArray makenativearray, @NotNull String str, @NotNull String str2, @NotNull List<onExtraCallbackWithResult> list) {
        Intrinsics.checkNotNullParameter(makenativearray, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.type = makenativearray;
        this.id = str;
        this.question = str2;
        this.answers = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseActivityEventListener(makeNativeArray makenativearray, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            makenativearray = makeNativeArray.SHOW_CHOICE;
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        str = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
            int i7 = 2 % 2;
        }
        this(makenativearray, str, str2, list);
    }

    public static final class onExtraCallbackWithResult implements Parcelable {
        public static final Parcelable.Creator<onExtraCallbackWithResult> CREATOR = new onExtraCallback();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final fromJavaArgs action;
        private final String description;

        public static final class onExtraCallback implements Parcelable.Creator<onExtraCallbackWithResult> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final onExtraCallbackWithResult[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 105;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[i];
                int i6 = i3 + 71;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return onextracallbackwithresultArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(parcel);
                if (i3 != 0) {
                    int i4 = 81 / 0;
                }
                return onextracallbackwithresultOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallbackWithResult[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = IAuthTabCallback + 61;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 10 / 0;
                }
                return onextracallbackwithresultArrIAuthTabCallback;
            }

            public final onExtraCallbackWithResult onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(parcel.readString(), (fromJavaArgs) parcel.readParcelable(onExtraCallbackWithResult.class.getClassLoader()));
                int i2 = IAuthTabCallback + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }
        }

        static {
            int i = IAuthTabCallback + 7;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 45;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                return Intrinsics.areEqual(this.description, onextracallbackwithresult.description) && Intrinsics.areEqual(this.action, onextracallbackwithresult.action);
            }
            int i4 = i2 + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i2 + 107;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.description.hashCode() + 66) >>> this.action.hashCode() : (this.description.hashCode() * 31) + this.action.hashCode();
            int i3 = onNavigationEvent + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Answer(description=" + this.description + ", action=" + this.action + ")";
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 8 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            parcel.writeString(this.description);
            parcel.writeParcelable(this.action, i);
            int i5 = onNavigationEvent + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull fromJavaArgs fromjavaargs) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(fromjavaargs, BuildConfig.FLAVOR);
            this.description = str;
            this.action = fromjavaargs;
        }
    }
}
