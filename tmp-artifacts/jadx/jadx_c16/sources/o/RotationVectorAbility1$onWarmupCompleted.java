package o;

import im.toss.features.benefit.dto.Cards;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.registerDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RotationVectorAbility1$onWarmupCompleted extends RotationVectorAbility1 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final boolean IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final registerDefault.onNavigationEvent asBinder;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Cards.Card onNavigationEvent;
    private final boolean onTransact;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotationVectorAbility1$onWarmupCompleted)) {
            return false;
        }
        RotationVectorAbility1$onWarmupCompleted rotationVectorAbility1$onWarmupCompleted = (RotationVectorAbility1$onWarmupCompleted) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, rotationVectorAbility1$onWarmupCompleted.onNavigationEvent)) {
            int i2 = IAuthTabCallbackDefault + 103;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        if (this.IAuthTabCallbackStub != rotationVectorAbility1$onWarmupCompleted.IAuthTabCallbackStub || this.asBinder != rotationVectorAbility1$onWarmupCompleted.asBinder || this.onTransact != rotationVectorAbility1$onWarmupCompleted.onTransact) {
            return false;
        }
        if (this.IAuthTabCallback != rotationVectorAbility1$onWarmupCompleted.IAuthTabCallback) {
            int i3 = IAuthTabCallbackDefault + 111;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onWarmupCompleted != rotationVectorAbility1$onWarmupCompleted.onWarmupCompleted) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, rotationVectorAbility1$onWarmupCompleted.onExtraCallbackWithResult)) {
            int i5 = asInterface + 21;
            IAuthTabCallbackDefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.onExtraCallback == rotationVectorAbility1$onWarmupCompleted.onExtraCallback) {
            return true;
        }
        int i6 = asInterface + 59;
        IAuthTabCallbackDefault = i6 % 128;
        return !(i6 % 2 == 0);
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = Integer.hashCode(this.IAuthTabCallbackStub);
        int iHashCode4 = this.asBinder.hashCode();
        int iHashCode5 = Boolean.hashCode(this.onTransact);
        int iHashCode6 = Boolean.hashCode(this.IAuthTabCallback);
        int iHashCode7 = Integer.hashCode(this.onWarmupCompleted);
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i4 = asInterface + 3;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + Integer.hashCode(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Original(card=" + this.onNavigationEvent + ", order=" + this.IAuthTabCallbackStub + ", serviceType=" + this.asBinder + ", isLastItem=" + this.onTransact + ", isFirstItem=" + this.IAuthTabCallback + ", horizontalMarginDp=" + this.onWarmupCompleted + ", cluster=" + this.onExtraCallbackWithResult + ", highlightFlag=" + this.onExtraCallback + ")";
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotationVectorAbility1$onWarmupCompleted(@NotNull Cards.Card card, int i, @NotNull registerDefault.onNavigationEvent onnavigationevent, boolean z, boolean z2, int i2, @Nullable String str, int i3) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(card, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onNavigationEvent = card;
        this.IAuthTabCallbackStub = i;
        this.asBinder = onnavigationevent;
        this.onTransact = z;
        this.IAuthTabCallback = z2;
        this.onWarmupCompleted = i2;
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = i3;
    }

    public Cards.Card onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Cards.Card card = this.onNavigationEvent;
        int i5 = i2 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return card;
        }
        throw null;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.IAuthTabCallbackStub;
        int i5 = i2 + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RotationVectorAbility1$onWarmupCompleted(Cards.Card card, int i, registerDefault.onNavigationEvent onnavigationevent, boolean z, boolean z2, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        String str2;
        registerDefault.onNavigationEvent onnavigationevent2 = (i4 & 4) != 0 ? registerDefault.onNavigationEvent.FIXED : onnavigationevent;
        boolean z4 = (i4 & 8) != 0 ? false : z;
        if ((i4 & 16) != 0) {
            int i5 = 2 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i4 & 64) != 0) {
            int i6 = IAuthTabCallbackDefault;
            int i7 = i6 + 105;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 101;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        this(card, i, onnavigationevent2, z4, z3, i2, str2, (i4 & 128) != 0 ? 0 : i3);
    }

    public registerDefault.onNavigationEvent asInterface() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        registerDefault.onNavigationEvent onnavigationevent = this.asBinder;
        int i5 = i2 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        throw null;
    }

    public boolean asBinder() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            z = this.IAuthTabCallback;
            int i4 = 29 / 0;
        } else {
            z = this.IAuthTabCallback;
        }
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 5;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return i5;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 39;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }
}
