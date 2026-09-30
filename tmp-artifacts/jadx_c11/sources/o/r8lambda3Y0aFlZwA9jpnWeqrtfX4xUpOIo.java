package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 1;
    private final hbExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final n1 onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo onExtraCallback = new r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo(hbExternalSyntheticLambda1.Fallback, null);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 19;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo)) {
            int i4 = IAuthTabCallbackDefault + 113;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo r8lambda3y0aflzwa9jpnweqrtfx4xupoio = (r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo) obj;
        if (this.onExtraCallbackWithResult != r8lambda3y0aflzwa9jpnweqrtfx4xupoio.onExtraCallbackWithResult) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, r8lambda3y0aflzwa9jpnweqrtfx4xupoio.onWarmupCompleted)) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 101;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        n1 n1Var = this.onWarmupCompleted;
        if (n1Var == null) {
            i = 0;
        } else {
            int iHashCode2 = n1Var.hashCode();
            int i5 = asInterface + 97;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnSearchEntryWarmupState(entryRequestState=" + this.onExtraCallbackWithResult + ", warmupFailureState=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo(@NotNull hbExternalSyntheticLambda1 hbexternalsyntheticlambda1, @Nullable n1 n1Var) {
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda1, "");
        this.onExtraCallbackWithResult = hbexternalsyntheticlambda1;
        this.onWarmupCompleted = n1Var;
    }

    public static final /* synthetic */ r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo r8lambda3y0aflzwa9jpnweqrtfx4xupoio = onExtraCallback;
        int i4 = i2 + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return r8lambda3y0aflzwa9jpnweqrtfx4xupoio;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
            if (this.onWarmupCompleted != null) {
                return true;
            }
        } else if (this.onWarmupCompleted != null) {
            return true;
        }
        int i5 = i2 + 35;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return false;
    }

    public final hbExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (onWarmupCompleted()) {
            hbExternalSyntheticLambda1 hbexternalsyntheticlambda1 = hbExternalSyntheticLambda1.Fallback;
            int i2 = asInterface + 5;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
            }
            return hbexternalsyntheticlambda1;
        }
        hbExternalSyntheticLambda1 hbexternalsyntheticlambda12 = this.onExtraCallbackWithResult;
        int i4 = asInterface + 91;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return hbexternalsyntheticlambda12;
        }
        throw null;
    }

    public final hbExternalSyntheticLambda9 onWarmupCompleted(@NotNull n3 n3Var, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        Intrinsics.checkNotNullParameter(str, "");
        n1 n1Var = this.onWarmupCompleted;
        if (n1Var == null) {
            int i2 = IAuthTabCallbackDefault + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        hbExternalSyntheticLambda9 hbexternalsyntheticlambda9IAuthTabCallback = n3Var.IAuthTabCallbackStub().IAuthTabCallback(str, n1Var);
        int i4 = asInterface + 117;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return hbexternalsyntheticlambda9IAuthTabCallback;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo r8lambda3y0aflzwa9jpnweqrtfx4xupoioOnNavigationEvent = r8lambda3Y0aFlZwA9jpnWeqrtfX4xUpOIo.onNavigationEvent();
            int i4 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return r8lambda3y0aflzwa9jpnweqrtfx4xupoioOnNavigationEvent;
        }
    }

    static {
        int i = onNavigationEvent + 89;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
