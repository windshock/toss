package im.toss.standardtermsv2.param;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable$;
import im.toss.standardtermsv2.param.StandardTermsV2LocalizedString$;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.access15300;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class StandardTermsV2CustomVariable implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final StandardTermsV2LocalizedString stringValue;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<StandardTermsV2CustomVariable> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<StandardTermsV2CustomVariable> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2CustomVariable createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ StandardTermsV2CustomVariable[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 83;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            throw null;
        }

        public final StandardTermsV2CustomVariable onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            StandardTermsV2CustomVariable standardTermsV2CustomVariable = new StandardTermsV2CustomVariable(parcel.readString(), StandardTermsV2LocalizedString.CREATOR.createFromParcel(parcel));
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return standardTermsV2CustomVariable;
        }

        public final StandardTermsV2CustomVariable[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 125;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            StandardTermsV2CustomVariable[] standardTermsV2CustomVariableArr = new StandardTermsV2CustomVariable[i];
            int i6 = i4 + 87;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return standardTermsV2CustomVariableArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 45;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardTermsV2CustomVariable)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.type, ((StandardTermsV2CustomVariable) obj).type)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.stringValue, r6.stringValue))) {
            return true;
        }
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        return i3 != 0 ? (iHashCode % 94) - this.stringValue.hashCode() : (iHashCode * 31) + this.stringValue.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2CustomVariable(type=" + this.type + ", stringValue=" + this.stringValue + ")";
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        this.stringValue.writeToParcel(parcel, i);
        int i5 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StandardTermsV2CustomVariable> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                StandardTermsV2CustomVariable$.serializer serializerVar = StandardTermsV2CustomVariable$.serializer.INSTANCE;
                throw null;
            }
            StandardTermsV2CustomVariable$.serializer serializerVar2 = StandardTermsV2CustomVariable$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    public /* synthetic */ StandardTermsV2CustomVariable(int i, String str, StandardTermsV2LocalizedString standardTermsV2LocalizedString, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, StandardTermsV2CustomVariable$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.type = str;
        this.stringValue = standardTermsV2LocalizedString;
    }

    public StandardTermsV2CustomVariable(@NotNull String str, @NotNull StandardTermsV2LocalizedString standardTermsV2LocalizedString) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(standardTermsV2LocalizedString, "");
        this.type = str;
        this.stringValue = standardTermsV2LocalizedString;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(StandardTermsV2CustomVariable standardTermsV2CustomVariable, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, standardTermsV2CustomVariable.type);
        vylVar.onNavigationEvent(serialDescriptor, 1, StandardTermsV2LocalizedString$.serializer.INSTANCE, standardTermsV2CustomVariable.stringValue);
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StandardTermsV2LocalizedString onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = this.stringValue;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return standardTermsV2LocalizedString;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final String varName;
        public static final onWarmupCompleted UNSAFE_TITLE = new onWarmupCompleted("UNSAFE_TITLE", 0, "{{unsafe_title}}");
        public static final onWarmupCompleted UNSAFE_DESCRIPTION = new onWarmupCompleted("UNSAFE_DESCRIPTION", 1, "{{unsafe_description}}");

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = UNSAFE_TITLE;
            if (i3 == 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, UNSAFE_DESCRIPTION};
            }
            onWarmupCompleted onwarmupcompleted2 = UNSAFE_DESCRIPTION;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[3];
            onwarmupcompletedArr[1] = onwarmupcompleted;
            onwarmupcompletedArr[0] = onwarmupcompleted2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 121;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompleted;
            }
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 18 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, String str2) {
            this.varName = str2;
        }

        public final String getVarName() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.varName;
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            return str;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
