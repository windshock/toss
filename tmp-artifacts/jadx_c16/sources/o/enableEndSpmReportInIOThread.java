package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableEndSpmReportInIOThread implements Parcelable {
    public static final Parcelable.Creator<enableEndSpmReportInIOThread> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private final ANROptimizeSwitch IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final enableContextFromLogger IAuthTabCallbackStub;
    private final boolean asBinder;
    private final boolean onExtraCallback;
    private final enableEventTrackerAdd onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final long onWarmupCompleted;

    static {
        int i = onTransact + 75;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~i6) | i8;
        int i10 = i7 | (~i9);
        int i11 = i6 | i8;
        int i12 = ~(i9 | i5);
        int i13 = i + i5 + i4 + (1075552530 * i2) + ((-1519595880) * i3);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i) - 1639710720) + ((-2116975300) * i5) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i2) + (1111490560 * i3) + (1415839744 * i14);
        int i16 = (i * 251836610) + 257048825 + (i5 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i2 * 1710852742) + (i3 * (-1855850104)) + (i14 * (-1244921856));
        return i15 + ((i16 * i16) * (-1300496384)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 115;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access000 + 111;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof enableEndSpmReportInIOThread)) {
            return false;
        }
        enableEndSpmReportInIOThread enableendspmreportiniothread = (enableEndSpmReportInIOThread) obj;
        if (this.onExtraCallback != enableendspmreportiniothread.onExtraCallback || this.onWarmupCompleted != enableendspmreportiniothread.onWarmupCompleted || this.IAuthTabCallbackDefault != enableendspmreportiniothread.IAuthTabCallbackDefault || this.asBinder != enableendspmreportiniothread.asBinder) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, enableendspmreportiniothread.IAuthTabCallbackStub)) {
            int i4 = IAuthTabCallback_Parcel + 67;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, enableendspmreportiniothread.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallback, enableendspmreportiniothread.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, enableendspmreportiniothread.onExtraCallbackWithResult)) {
            return true;
        }
        int i6 = IAuthTabCallback_Parcel + 119;
        access000 = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
        int iHashCode4 = Long.hashCode(this.onWarmupCompleted);
        int iHashCode5 = Long.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode6 = Boolean.hashCode(this.asBinder);
        enableContextFromLogger enablecontextfromlogger = this.IAuthTabCallbackStub;
        int iHashCode7 = 0;
        if (enablecontextfromlogger == null) {
            int i2 = access000 + 13;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = enablecontextfromlogger.hashCode();
            int i4 = access000 + 55;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = this.onNavigationEvent;
        if (str == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i6 = IAuthTabCallback_Parcel + 103;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        ANROptimizeSwitch aNROptimizeSwitch = this.IAuthTabCallback;
        int iHashCode8 = aNROptimizeSwitch == null ? 0 : aNROptimizeSwitch.hashCode();
        enableEventTrackerAdd enableeventtrackeradd = this.onExtraCallbackWithResult;
        if (enableeventtrackeradd != null) {
            int i8 = IAuthTabCallback_Parcel + 113;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode7 = enableeventtrackeradd.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizAnswerSubmitResult(isCorrect=" + this.onExtraCallback + ", balance=" + this.onWarmupCompleted + ", rewardPoint=" + this.IAuthTabCallbackDefault + ", successReward=" + this.asBinder + ", quiz=" + this.IAuthTabCallbackStub + ", fullScreenBannerScheme=" + this.onNavigationEvent + ", nextTimeQuiz=" + this.IAuthTabCallback + ", banner=" + this.onExtraCallbackWithResult + ")";
        int i2 = access000 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.onExtraCallback ? 1 : 0);
        parcel.writeLong(this.onWarmupCompleted);
        parcel.writeLong(this.IAuthTabCallbackDefault);
        parcel.writeInt(this.asBinder ? 1 : 0);
        enableContextFromLogger enablecontextfromlogger = this.IAuthTabCallbackStub;
        if (enablecontextfromlogger == null) {
            int i3 = IAuthTabCallback_Parcel + 5;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enablecontextfromlogger.writeToParcel(parcel, i);
        }
        parcel.writeString(this.onNavigationEvent);
        ANROptimizeSwitch aNROptimizeSwitch = this.IAuthTabCallback;
        if (aNROptimizeSwitch == null) {
            int i5 = IAuthTabCallback_Parcel + 121;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            aNROptimizeSwitch.writeToParcel(parcel, i);
        }
        enableEventTrackerAdd enableeventtrackeradd = this.onExtraCallbackWithResult;
        if (enableeventtrackeradd != null) {
            parcel.writeInt(1);
            enableeventtrackeradd.writeToParcel(parcel, i);
        } else {
            int i6 = IAuthTabCallback_Parcel + 17;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        }
    }

    public enableEndSpmReportInIOThread(boolean z, long j, long j2, boolean z2, @Nullable enableContextFromLogger enablecontextfromlogger, @Nullable String str, @Nullable ANROptimizeSwitch aNROptimizeSwitch, @Nullable enableEventTrackerAdd enableeventtrackeradd) {
        this.onExtraCallback = z;
        this.onWarmupCompleted = j;
        this.IAuthTabCallbackDefault = j2;
        this.asBinder = z2;
        this.IAuthTabCallbackStub = enablecontextfromlogger;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = aNROptimizeSwitch;
        this.onExtraCallbackWithResult = enableeventtrackeradd;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 47;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallbackDefault;
        int i5 = i2 + 105;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 79;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        boolean z = this.asBinder;
        int i5 = i3 + 101;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final enableContextFromLogger onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 43;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        enableContextFromLogger enablecontextfromlogger = this.IAuthTabCallbackStub;
        int i4 = i2 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return enablecontextfromlogger;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        enableEndSpmReportInIOThread enableendspmreportiniothread = (enableEndSpmReportInIOThread) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = enableendspmreportiniothread.onNavigationEvent;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        enableEndSpmReportInIOThread enableendspmreportiniothread = (enableEndSpmReportInIOThread) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 15;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        ANROptimizeSwitch aNROptimizeSwitch = enableendspmreportiniothread.IAuthTabCallback;
        if (i4 == 0) {
            int i5 = 47 / 0;
        }
        int i6 = i2 + 35;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return aNROptimizeSwitch;
    }

    public final enableEventTrackerAdd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 53;
        IAuthTabCallback_Parcel = i3 % 128;
        long j = i3 % 2 != 0 ? this.onWarmupCompleted * this.IAuthTabCallbackDefault : this.onWarmupCompleted - this.IAuthTabCallbackDefault;
        int i4 = i2 + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return j;
    }

    public final String onExtraCallbackWithResult() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (String) IAuthTabCallback(1543781057, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, -1543781057, new Object[]{this}, iOnWarmupCompleted);
    }

    public final ANROptimizeSwitch onWarmupCompleted() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (ANROptimizeSwitch) IAuthTabCallback(1139514439, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, -1139514438, new Object[]{this}, iOnWarmupCompleted);
    }
}
