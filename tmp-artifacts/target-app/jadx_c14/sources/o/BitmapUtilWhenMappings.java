package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BitmapUtilWhenMappings {
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("accountAutoSaving")
    private boolean accountAutoSaving;

    @SerializedName("customSavingAmount")
    private Long customSavingAmount;

    @SerializedName("fromAccountId")
    private String fromAccountId;

    @SerializedName("fromAccountType")
    private onCollectWhenDestroy fromAccountType;

    @SerializedName("savingLevel")
    private setUseDecodeBufferHelper savingLevel;

    public BitmapUtilWhenMappings() {
        this(null, null, null, false, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BitmapUtilWhenMappings)) {
            return false;
        }
        BitmapUtilWhenMappings bitmapUtilWhenMappings = (BitmapUtilWhenMappings) obj;
        if (!Intrinsics.areEqual(this.fromAccountId, bitmapUtilWhenMappings.fromAccountId) || this.fromAccountType != bitmapUtilWhenMappings.fromAccountType) {
            return false;
        }
        if (this.savingLevel != bitmapUtilWhenMappings.savingLevel) {
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.accountAutoSaving == bitmapUtilWhenMappings.accountAutoSaving) {
            return Intrinsics.areEqual(this.customSavingAmount, bitmapUtilWhenMappings.customSavingAmount);
        }
        int i6 = onExtraCallback + 29;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.fromAccountId;
        int iHashCode3 = 0;
        if (str == null) {
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        onCollectWhenDestroy oncollectwhendestroy = this.fromAccountType;
        int iHashCode4 = oncollectwhendestroy == null ? 0 : oncollectwhendestroy.hashCode();
        setUseDecodeBufferHelper setusedecodebufferhelper = this.savingLevel;
        if (setusedecodebufferhelper == null) {
            int i7 = onNavigationEvent + 21;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = setusedecodebufferhelper.hashCode();
            int i9 = onNavigationEvent + 11;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        int iHashCode5 = Boolean.hashCode(this.accountAutoSaving);
        Long l = this.customSavingAmount;
        if (l != null) {
            int i11 = onNavigationEvent + 3;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                l.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = l.hashCode();
            int i12 = onNavigationEvent + 89;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavingBoxModel(fromAccountId=" + this.fromAccountId + ", fromAccountType=" + this.fromAccountType + ", savingLevel=" + this.savingLevel + ", accountAutoSaving=" + this.accountAutoSaving + ", customSavingAmount=" + this.customSavingAmount + ")";
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public BitmapUtilWhenMappings(@Nullable String str, @Nullable onCollectWhenDestroy oncollectwhendestroy, @Nullable setUseDecodeBufferHelper setusedecodebufferhelper, boolean z, @Nullable Long l) {
        this.fromAccountId = str;
        this.fromAccountType = oncollectwhendestroy;
        this.savingLevel = setusedecodebufferhelper;
        this.accountAutoSaving = z;
        this.customSavingAmount = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BitmapUtilWhenMappings(String str, onCollectWhenDestroy oncollectwhendestroy, setUseDecodeBufferHelper setusedecodebufferhelper, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        onCollectWhenDestroy oncollectwhendestroy2;
        boolean z2;
        Long l2 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            oncollectwhendestroy2 = null;
        } else {
            oncollectwhendestroy2 = oncollectwhendestroy;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 31;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                setUseDecodeBufferHelper setusedecodebufferhelper2 = setUseDecodeBufferHelper.NORMAL;
                l2.hashCode();
                throw null;
            }
            setusedecodebufferhelper = setUseDecodeBufferHelper.NORMAL;
        }
        setUseDecodeBufferHelper setusedecodebufferhelper3 = setusedecodebufferhelper;
        if ((i & 8) != 0) {
            int i7 = onNavigationEvent + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            int i10 = onExtraCallback + 45;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 71 / 0;
            }
            int i12 = 2 % 2;
        } else {
            l2 = l;
        }
        this(str, oncollectwhendestroy2, setusedecodebufferhelper3, z2, l2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.fromAccountId;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    public final onCollectWhenDestroy onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        onCollectWhenDestroy oncollectwhendestroy = this.fromAccountType;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return oncollectwhendestroy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setUseDecodeBufferHelper onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setUseDecodeBufferHelper setusedecodebufferhelper = this.savingLevel;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return setusedecodebufferhelper;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.accountAutoSaving;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Long l = this.customSavingAmount;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final KeyBoardVisiblePoint onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.fromAccountId;
        if (str == null) {
            str = "";
            int i4 = i2 + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return DERConstructedSet.onWarmupCompleted(str, this.fromAccountType);
    }
}
