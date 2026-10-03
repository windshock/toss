package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class userDrivenScrollEndedlambda2lambda1 {
    public static final int $stable = 0;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final String ERROR_CODE_NEED_INPUT_ACCOUNT_HOLDER = "TE_NEED_INPUT_ACCOUNT_HOLDER";
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("name")
    private final String name;

    @SerializedName("periodicTransferType")
    private final makeNativeObject periodicTransferType;

    static {
        int i = onNavigationEvent + 5;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public userDrivenScrollEndedlambda2lambda1() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 33;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof userDrivenScrollEndedlambda2lambda1) {
            userDrivenScrollEndedlambda2lambda1 userdrivenscrollendedlambda2lambda1 = (userDrivenScrollEndedlambda2lambda1) obj;
            return Intrinsics.areEqual(this.name, userdrivenscrollendedlambda2lambda1.name) && this.periodicTransferType == userdrivenscrollendedlambda2lambda1.periodicTransferType;
        }
        int i7 = i4 + 7;
        IAuthTabCallback = i7 % 128;
        boolean z = i7 % 2 == 0;
        int i8 = i4 + 33;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.name.hashCode();
        makeNativeObject makenativeobject = this.periodicTransferType;
        if (makenativeobject == null) {
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = makenativeobject.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetPeriodicTransferAccountHolderResp(name=" + this.name + ", periodicTransferType=" + this.periodicTransferType + ")";
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public userDrivenScrollEndedlambda2lambda1(@NotNull String str, @Nullable makeNativeObject makenativeobject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.periodicTransferType = makenativeobject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ userDrivenScrollEndedlambda2lambda1(String str, makeNativeObject makenativeobject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            makenativeobject = null;
        }
        this(str, makenativeobject);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
