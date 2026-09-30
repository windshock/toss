package viva.republica.toss.network.model.loan;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access15300;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RightComponent {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("componentType")
    private final ComponentType componentType;

    @SerializedName("size")
    private final String size;

    @SerializedName("style")
    private final String style;

    @SerializedName(TextBundle.TEXT_ENTRY)
    private final String text;

    @SerializedName("type")
    private final String type;

    public RightComponent() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 83;
            onNavigationEvent = i6 % 128;
            return !(i6 % 2 == 0);
        }
        if (!(obj instanceof RightComponent)) {
            int i7 = i4 + 105;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 != 0;
        }
        RightComponent rightComponent = (RightComponent) obj;
        if (!Intrinsics.areEqual(this.text, rightComponent.text) || !Intrinsics.areEqual(this.style, rightComponent.style)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.type, rightComponent.type))) {
            return Intrinsics.areEqual(this.size, rightComponent.size) && this.componentType == rightComponent.componentType;
        }
        int i8 = onNavigationEvent + 47;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.type.hashCode()) * 31) + this.size.hashCode()) * 31) + this.componentType.hashCode();
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RightComponent(text=" + this.text + ", style=" + this.style + ", type=" + this.type + ", size=" + this.size + ", componentType=" + this.componentType + ")";
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RightComponent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ComponentType componentType) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(componentType, BuildConfig.FLAVOR);
        this.text = str;
        this.style = str2;
        this.type = str3;
        this.size = str4;
        this.componentType = componentType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RightComponent(String str, String str2, String str3, String str4, ComponentType componentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        int i2 = i & 1;
        String str7 = BuildConfig.FLAVOR;
        String str8 = i2 != 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 47;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str5 = BuildConfig.FLAVOR;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i9 = onWarmupCompleted + 15;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str6 = BuildConfig.FLAVOR;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i12 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i13 = onWarmupCompleted + 41;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                ComponentType componentType2 = ComponentType.NONE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            componentType = ComponentType.NONE;
        }
        this(str8, str5, str6, str7, componentType);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ComponentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ComponentType[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final ComponentType BADGE = new ComponentType("BADGE", 0);
        public static final ComponentType BUTTON = new ComponentType("BUTTON", 1);
        public static final ComponentType ARROW = new ComponentType("ARROW", 2);
        public static final ComponentType NONE = new ComponentType("NONE", 3);

        private static final /* synthetic */ ComponentType[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ComponentType[] componentTypeArr = {BADGE, BUTTON, ARROW, NONE};
            int i5 = i2 + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return componentTypeArr;
        }

        public static EnumEntries<ComponentType> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<ComponentType> enumEntries = $ENTRIES;
            int i5 = i3 + 43;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static ComponentType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ComponentType componentType = (ComponentType) Enum.valueOf(ComponentType.class, str);
            if (i3 == 0) {
                return componentType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static ComponentType[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ComponentType[] componentTypeArr = (ComponentType[]) $VALUES.clone();
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
            }
            return componentTypeArr;
        }

        private ComponentType(String str, int i) {
        }

        static {
            ComponentType[] componentTypeArr$values = $values();
            $VALUES = componentTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(componentTypeArr$values);
            int i = onExtraCallback + 63;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
