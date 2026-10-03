package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class lambdadestroy2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("certificateOfFamilyRelations")
    private final loadScriptFromAssets certificateOfFamilyRelations;

    @SerializedName("householdRegister")
    private final handleMemoryPressure householdRegister;

    @SerializedName("type")
    private final onExtraCallback type;

    public lambdadestroy2() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof lambdadestroy2)) {
            return false;
        }
        lambdadestroy2 lambdadestroy2Var = (lambdadestroy2) obj;
        if (this.type != lambdadestroy2Var.type) {
            int i6 = i4 + 29;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.householdRegister, lambdadestroy2Var.householdRegister)) {
            return false;
        }
        if (Intrinsics.areEqual(this.certificateOfFamilyRelations, lambdadestroy2Var.certificateOfFamilyRelations)) {
            return true;
        }
        int i8 = onExtraCallback + 51;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = this.type;
        int iHashCode2 = 0;
        int iHashCode3 = onextracallback == null ? 0 : onextracallback.hashCode();
        handleMemoryPressure handlememorypressure = this.householdRegister;
        if (handlememorypressure == null) {
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = handlememorypressure.hashCode();
        }
        loadScriptFromAssets loadscriptfromassets = this.certificateOfFamilyRelations;
        if (loadscriptfromassets != null) {
            int i5 = onExtraCallback + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = loadscriptfromassets.hashCode();
            int i7 = onExtraCallback + 39;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LegalRepresentativeCertifyResponse(type=" + this.type + ", householdRegister=" + this.householdRegister + ", certificateOfFamilyRelations=" + this.certificateOfFamilyRelations + ")";
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public lambdadestroy2(@Nullable onExtraCallback onextracallback, @Nullable handleMemoryPressure handlememorypressure, @Nullable loadScriptFromAssets loadscriptfromassets) {
        this.type = onextracallback;
        this.householdRegister = handlememorypressure;
        this.certificateOfFamilyRelations = loadscriptfromassets;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lambdadestroy2(onExtraCallback onextracallback, handleMemoryPressure handlememorypressure, loadScriptFromAssets loadscriptfromassets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        onextracallback = (i & 1) != 0 ? null : onextracallback;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            handlememorypressure = null;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            loadscriptfromassets = null;
        }
        this(onextracallback, handlememorypressure, loadscriptfromassets);
    }

    public final onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.type;
        int i5 = i3 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return onextracallback;
    }

    public final handleMemoryPressure onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        handleMemoryPressure handlememorypressure = this.householdRegister;
        int i5 = i2 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return handlememorypressure;
    }

    public final loadScriptFromAssets onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.certificateOfFamilyRelations;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback HOUSEHOLD_REGISTER = new onExtraCallback("HOUSEHOLD_REGISTER", 0);
        public static final onExtraCallback CERTIFICATE_OF_FAMILY_RELATIONS = new onExtraCallback("CERTIFICATE_OF_FAMILY_RELATIONS", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {HOUSEHOLD_REGISTER, CERTIFICATE_OF_FAMILY_RELATIONS};
            int i5 = i3 + 51;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 13 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 65;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
