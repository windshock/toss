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
public final class SendMtopResponse implements Parcelable {
    public static final Parcelable.Creator<SendMtopResponse> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final long onExtraCallback;
    private final boolean onNavigationEvent;
    private final List<enableContextFromLogger> onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<SendMtopResponse> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SendMtopResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SendMtopResponse sendMtopResponseOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return sendMtopResponseOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SendMtopResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            SendMtopResponse[] sendMtopResponseArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return sendMtopResponseArrOnExtraCallbackWithResult;
        }

        public final SendMtopResponse onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(enableContextFromLogger.CREATOR.createFromParcel(parcel));
                    i3 += 34;
                } else {
                    arrayList.add(enableContextFromLogger.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            SendMtopResponse sendMtopResponse = new SendMtopResponse(j, arrayList, parcel.readString());
            int i5 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return sendMtopResponse;
        }

        public final SendMtopResponse[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i3 % 128;
            SendMtopResponse[] sendMtopResponseArr = new SendMtopResponse[i];
            if (i3 % 2 == 0) {
                return sendMtopResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 101;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 107;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMtopResponse)) {
            int i2 = onTransact + 55;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SendMtopResponse sendMtopResponse = (SendMtopResponse) obj;
        if (this.onExtraCallback == sendMtopResponse.onExtraCallback) {
            return Intrinsics.areEqual(this.onWarmupCompleted, sendMtopResponse.onWarmupCompleted) && !(Intrinsics.areEqual(this.IAuthTabCallback, sendMtopResponse.IAuthTabCallback) ^ true);
        }
        int i4 = IAuthTabCallbackStub;
        int i5 = i4 + 115;
        onTransact = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 71;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        return i2 % 2 == 0 ? (((Long.hashCode(this.onExtraCallback) - 127) - this.onWarmupCompleted.hashCode()) * 85) << this.IAuthTabCallback.hashCode() : (((Long.hashCode(this.onExtraCallback) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AvailableCreditQuiz(rewardPoint=" + this.onExtraCallback + ", quizList=" + this.onWarmupCompleted + ", availableDate=" + this.IAuthTabCallback + ")";
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.onExtraCallback);
        List<enableContextFromLogger> list = this.onWarmupCompleted;
        parcel.writeInt(list.size());
        Iterator<enableContextFromLogger> it = list.iterator();
        int i3 = onTransact + 39;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = onTransact + 87;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.IAuthTabCallback);
    }

    public SendMtopResponse(long j, @NotNull List<enableContextFromLogger> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = j;
        this.onWarmupCompleted = list;
        this.IAuthTabCallback = str;
        this.onNavigationEvent = !list.isEmpty();
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallback;
        int i4 = i3 + 63;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return j;
    }

    public final List<enableContextFromLogger> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        List<enableContextFromLogger> list = this.onWarmupCompleted;
        int i5 = i3 + 23;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
