package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isPoolNetwork {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final boolean IAuthTabCallback;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final Boolean onWarmupCompleted;

    public isPoolNetwork() {
        this(false, false, false, null, null, 31, null);
    }

    public static /* synthetic */ isPoolNetwork onWarmupCompleted(isPoolNetwork ispoolnetwork, boolean z, boolean z2, boolean z3, Boolean bool, Boolean bool2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackStub + 11;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = ispoolnetwork.onExtraCallbackWithResult;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = ispoolnetwork.onExtraCallback;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = ispoolnetwork.IAuthTabCallback;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            int i5 = asInterface + 63;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            bool = ispoolnetwork.onWarmupCompleted;
            int i8 = i6 + 57;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = ispoolnetwork.onNavigationEvent;
        }
        return ispoolnetwork.IAuthTabCallback(z4, z5, z6, bool3, bool2);
    }

    public final isPoolNetwork IAuthTabCallback(boolean z, boolean z2, boolean z3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        int i = 2 % 2;
        isPoolNetwork ispoolnetwork = new isPoolNetwork(z, z2, z3, bool, bool2);
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return ispoolnetwork;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPoolNetwork)) {
            int i2 = asInterface + 37;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return false;
        }
        isPoolNetwork ispoolnetwork = (isPoolNetwork) obj;
        if (this.onExtraCallbackWithResult != ispoolnetwork.onExtraCallbackWithResult || this.onExtraCallback != ispoolnetwork.onExtraCallback) {
            return false;
        }
        if (this.IAuthTabCallback == ispoolnetwork.IAuthTabCallback) {
            return !(Intrinsics.areEqual(this.onWarmupCompleted, ispoolnetwork.onWarmupCompleted) ^ true) && Intrinsics.areEqual(this.onNavigationEvent, ispoolnetwork.onNavigationEvent);
        }
        int i4 = asInterface + 13;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 97;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 83 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.onExtraCallbackWithResult);
        int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
        int iHashCode4 = Boolean.hashCode(this.IAuthTabCallback);
        Boolean bool = this.onWarmupCompleted;
        int iHashCode5 = 0;
        if (bool == null) {
            int i2 = asInterface + 17;
            IAuthTabCallbackStub = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.onNavigationEvent;
        if (bool2 != null) {
            int i3 = IAuthTabCallbackStub + 35;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            iHashCode5 = bool2.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHomeMissionState(scoreReportChecked=" + this.onExtraCallbackWithResult + ", quizChecked=" + this.onExtraCallback + ", missionChecked=" + this.IAuthTabCallback + ", scoreReasonChecked=" + this.onWarmupCompleted + ", creditRecoveryChecked=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isPoolNetwork(boolean z, boolean z2, boolean z3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = z2;
        this.IAuthTabCallback = z3;
        this.onWarmupCompleted = bool;
        this.onNavigationEvent = bool2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isPoolNetwork(boolean z, boolean z2, boolean z3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool3;
        Boolean bool4;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 97;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 4;
            } else {
                int i4 = 2 % 2;
            }
            z = false;
        }
        boolean z4 = (i & 2) != 0 ? false : z2;
        boolean z5 = (i & 4) == 0 ? z3 : false;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackStub + 107;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i & 16) != 0) {
            int i8 = IAuthTabCallbackStub + 25;
            int i9 = i8 % 128;
            asInterface = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 33;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        this(z, z4, z5, bool3, bool4);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Boolean bool = this.onWarmupCompleted;
        int i5 = i3 + 57;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return bool;
    }

    public final Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Boolean bool = this.onNavigationEvent;
        int i5 = i3 + 11;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult && this.onExtraCallback && this.IAuthTabCallback) {
            int i2 = IAuthTabCallbackStub + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = this.onWarmupCompleted;
            if (bool == null || Intrinsics.areEqual(bool, Boolean.TRUE)) {
                Boolean bool2 = this.onNavigationEvent;
                if (bool2 == null) {
                    return true;
                }
                int i4 = IAuthTabCallbackStub + 9;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 47 / 0;
                    if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                        return true;
                    }
                } else if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                    return true;
                }
            }
        }
        int i6 = IAuthTabCallbackStub + 29;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.onWarmupCompleted;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2)) {
            int i4 = asInterface + 79;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(this.onNavigationEvent, bool2)) {
                int i6 = IAuthTabCallbackStub;
                int i7 = i6 + 69;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 98 / 0;
                    if (!this.onExtraCallbackWithResult) {
                        if (!this.onExtraCallback && (!this.IAuthTabCallback)) {
                            int i9 = i6 + 115;
                            asInterface = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 25 / 0;
                            }
                            return false;
                        }
                    }
                } else if (!this.onExtraCallbackWithResult) {
                }
            }
        }
        return true;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        Boolean bool = this.onWarmupCompleted;
        Boolean bool2 = Boolean.TRUE;
        List listListOf = CollectionsKt.listOf(new Boolean[]{Boolean.valueOf(Intrinsics.areEqual(bool, bool2)), Boolean.valueOf(Intrinsics.areEqual(this.onNavigationEvent, bool2)), Boolean.valueOf(this.onExtraCallbackWithResult), Boolean.valueOf(this.onExtraCallback), Boolean.valueOf(this.IAuthTabCallback)});
        int i2 = 0;
        if ((listListOf instanceof Collection) && listListOf.isEmpty()) {
            int i3 = asInterface + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
        Iterator it = listListOf.iterator();
        int i5 = asInterface + 91;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                int i7 = asInterface + 65;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CollectionsKt.throwCountOverflow();
                if (i8 == 0) {
                    throw null;
                }
            }
        }
        return i2;
    }
}
