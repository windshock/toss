package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class r8lambdaDml5dirzRCENiZicd2_b5Xg5o implements Parcelable {
    public static final Parcelable.Creator<r8lambdaDml5dirzRCENiZicd2_b5Xg5o> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<r8lambdaDml5dirzRCENiZicd2_b5Xg5o> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambdaDml5dirzRCENiZicd2_b5Xg5o createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5oOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return r8lambdadml5dirzrcenizicd2_b5xg5oOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ r8lambdaDml5dirzRCENiZicd2_b5Xg5o[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            r8lambdaDml5dirzRCENiZicd2_b5Xg5o[] r8lambdadml5dirzrcenizicd2_b5xg5oArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return r8lambdadml5dirzrcenizicd2_b5xg5oArrOnWarmupCompleted;
        }

        public final r8lambdaDml5dirzRCENiZicd2_b5Xg5o onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5o = new r8lambdaDml5dirzRCENiZicd2_b5Xg5o();
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 62 / 0;
            }
            return r8lambdadml5dirzrcenizicd2_b5xg5o;
        }

        public final r8lambdaDml5dirzRCENiZicd2_b5Xg5o[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 39;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            r8lambdaDml5dirzRCENiZicd2_b5Xg5o[] r8lambdadml5dirzrcenizicd2_b5xg5oArr = new r8lambdaDml5dirzRCENiZicd2_b5Xg5o[i];
            int i6 = i4 + 105;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return r8lambdadml5dirzrcenizicd2_b5xg5oArr;
        }
    }

    static {
        int i = onWarmupCompleted + 81;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ Object onWarmupCompleted(r8lambdaDml5dirzRCENiZicd2_b5Xg5o r8lambdadml5dirzrcenizicd2_b5xg5o, List<r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM> list, access13800<? super List<G0>> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public Object onWarmupCompleted(@NotNull List<r8lambdaTpXekVsJ6kwcTeOAmcRXkuw0LM> list, @NotNull access13800<? super List<G0>> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(this, list, access13800Var);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }
}
