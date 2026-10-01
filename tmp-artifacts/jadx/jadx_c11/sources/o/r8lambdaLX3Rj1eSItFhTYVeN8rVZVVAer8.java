package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 {
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog IAuthTabCallback;
    private final char onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public static /* synthetic */ r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 IAuthTabCallback(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog, char c, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = onWarmupCompleted + 93;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            r8lambdasffek4_3mtpbpfpmfomvpbvbnog = r8lambdalx3rj1esitfhtyven8rvzvvaer8.IAuthTabCallback;
        }
        if ((i3 & 2) != 0) {
            int i7 = onWarmupCompleted + 79;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            c = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback;
        }
        if ((i3 & 4) != 0) {
            int i9 = onWarmupCompleted;
            int i10 = i9 + 7;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult;
                throw null;
            }
            int i12 = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult;
            int i13 = i9 + 23;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            i = i12;
        }
        if ((i3 & 8) != 0) {
            i2 = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent;
        }
        return r8lambdalx3rj1esitfhtyven8rvzvvaer8.IAuthTabCallback(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, c, i, i2);
    }

    public final r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 IAuthTabCallback(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog, char c, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8 = new r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, c, i, i2);
        int i4 = onWarmupCompleted + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdalx3rj1esitfhtyven8rvzvvaer8;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8)) {
            int i2 = asInterface + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8 = (r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8) obj;
        if (this.IAuthTabCallback != r8lambdalx3rj1esitfhtyven8rvzvvaer8.IAuthTabCallback) {
            int i4 = onWarmupCompleted + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onExtraCallback != r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback) {
            int i6 = asInterface + 57;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult == r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult) {
            return this.onNavigationEvent == r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent;
        }
        int i8 = onWarmupCompleted + 97;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.IAuthTabCallback.hashCode() * 31) + Character.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onNavigationEvent);
        int i4 = asInterface + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsRollingNumberV2Char(type=" + this.IAuthTabCallback + ", char=" + this.onExtraCallback + ", globalIndex=" + this.onExtraCallbackWithResult + ", typeIndex=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        this.IAuthTabCallback = r8lambdasffek4_3mtpbpfpmfomvpbvbnog;
        this.onExtraCallback = c;
        this.onExtraCallbackWithResult = i;
        this.onNavigationEvent = i2;
    }

    public final r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog = this.IAuthTabCallback;
        int i4 = i2 + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdasffek4_3mtpbpfpmfomvpbvbnog;
        }
        obj.hashCode();
        throw null;
    }

    public final char onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char c = this.onExtraCallback;
        int i4 = i3 + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return c;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
