package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableAudioDjangoExecutorOpt implements Parcelable {
    public static final Parcelable.Creator<enableAudioDjangoExecutorOpt> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    private final int IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final boolean onExtraCallback;
    private final List<enableContextFromLogger> onExtraCallbackWithResult;
    private final enableActivityMonitorInitFloatOpt onNavigationEvent;
    private final List<enableCheckXriverHasInited> onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<enableAudioDjangoExecutorOpt> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableAudioDjangoExecutorOpt createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            enableAudioDjangoExecutorOpt enableaudiodjangoexecutoroptOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return enableaudiodjangoexecutoroptOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableAudioDjangoExecutorOpt[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            enableAudioDjangoExecutorOpt[] enableaudiodjangoexecutoroptArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            return enableaudiodjangoexecutoroptArrOnExtraCallbackWithResult;
        }

        public final enableAudioDjangoExecutorOpt[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            Object obj = null;
            enableAudioDjangoExecutorOpt[] enableaudiodjangoexecutoroptArr = new enableAudioDjangoExecutorOpt[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enableaudiodjangoexecutoroptArr;
            }
            throw null;
        }

        public final enableAudioDjangoExecutorOpt onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                enableactivitymonitorinitfloatopt.hashCode();
                throw null;
            }
            boolean z = parcel.readInt() != 0;
            long j = parcel.readLong();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 != i4) {
                int i8 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList.add(enableContextFromLogger.CREATOR.createFromParcel(parcel));
                    i7 += 98;
                } else {
                    arrayList.add(enableContextFromLogger.CREATOR.createFromParcel(parcel));
                    i7++;
                }
            }
            int i9 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList2.add(enableCheckXriverHasInited.CREATOR.createFromParcel(parcel));
            }
            return new enableAudioDjangoExecutorOpt(z, j, arrayList, arrayList2, parcel.readInt() != 0 ? enableActivityMonitorInitFloatOpt.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }
    }

    static {
        int i = asInterface + 99;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 57;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof enableAudioDjangoExecutorOpt)) {
            return false;
        }
        enableAudioDjangoExecutorOpt enableaudiodjangoexecutoropt = (enableAudioDjangoExecutorOpt) obj;
        if (this.onExtraCallback != enableaudiodjangoexecutoropt.onExtraCallback) {
            return false;
        }
        if (this.IAuthTabCallbackDefault != enableaudiodjangoexecutoropt.IAuthTabCallbackDefault) {
            int i4 = onTransact + 79;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enableaudiodjangoexecutoropt.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, enableaudiodjangoexecutoropt.onWarmupCompleted) || (!Intrinsics.areEqual(this.onNavigationEvent, enableaudiodjangoexecutoropt.onNavigationEvent))) {
            return false;
        }
        if (this.IAuthTabCallback == enableaudiodjangoexecutoropt.IAuthTabCallback) {
            return true;
        }
        int i6 = asBinder + 1;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.onExtraCallback);
        int iHashCode3 = Long.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode4 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode5 = this.onWarmupCompleted.hashCode();
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = this.onNavigationEvent;
        if (enableactivitymonitorinitfloatopt == null) {
            int i4 = asBinder + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = enableactivitymonitorinitfloatopt.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditQuizInvitation(isOpen=" + this.onExtraCallback + ", rewardPoint=" + this.IAuthTabCallbackDefault + ", quizList=" + this.onExtraCallbackWithResult + ", quizHistoryList=" + this.onWarmupCompleted + ", cptBanner=" + this.onNavigationEvent + ", leftDays=" + this.IAuthTabCallback + ")";
        int i2 = asBinder + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.onExtraCallback ? 1 : 0);
        parcel.writeLong(this.IAuthTabCallbackDefault);
        List<enableContextFromLogger> list = this.onExtraCallbackWithResult;
        parcel.writeInt(list.size());
        Iterator<enableContextFromLogger> it = list.iterator();
        while (it.hasNext()) {
            int i3 = onTransact + 37;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            it.next().writeToParcel(parcel, i);
        }
        List<enableCheckXriverHasInited> list2 = this.onWarmupCompleted;
        parcel.writeInt(list2.size());
        Iterator<enableCheckXriverHasInited> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i5 = onTransact + 5;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                it2.next().writeToParcel(parcel, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it2.next().writeToParcel(parcel, i);
        }
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = this.onNavigationEvent;
        if (enableactivitymonitorinitfloatopt == null) {
            parcel.writeInt(0);
            int i6 = asBinder + 73;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 4;
            }
        } else {
            parcel.writeInt(1);
            enableactivitymonitorinitfloatopt.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.IAuthTabCallback);
    }

    public enableAudioDjangoExecutorOpt(boolean z, long j, @NotNull List<enableContextFromLogger> list, @NotNull List<enableCheckXriverHasInited> list2, @Nullable enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.onExtraCallback = z;
        this.IAuthTabCallbackDefault = j;
        this.onExtraCallbackWithResult = list;
        this.onWarmupCompleted = list2;
        this.onNavigationEvent = enableactivitymonitorinitfloatopt;
        this.IAuthTabCallback = i;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 9;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return z;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackDefault;
        int i5 = i3 + 73;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return j;
    }

    public final List<enableContextFromLogger> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 115;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        List<enableContextFromLogger> list = this.onExtraCallbackWithResult;
        int i5 = i2 + 103;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final enableActivityMonitorInitFloatOpt onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = this.onNavigationEvent;
        int i5 = i2 + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return enableactivitymonitorinitfloatopt;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 11;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
