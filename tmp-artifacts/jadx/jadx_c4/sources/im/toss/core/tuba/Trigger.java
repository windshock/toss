package im.toss.core.tuba;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.GetMotionInteractionState;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.checkCanOpenLandingPage;
import o.downloadZip;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Trigger {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final List<Condition> conditions;
    private final String id;
    private final String name;
    private final Map<String, Object> parameters;
    private final TriggerFrequencyByPeriod triggerFrequencyByPeriod;
    private final String triggerFrequencyCapGroupId;
    private final TriggerInactiveHour triggerInactiveHour;
    private final TriggerLimit triggerLimit;
    private final String triggerType;
    private final TriggerWhen triggerWhen;

    public Trigger() {
        this((String) null, (String) null, (String) null, (Map) null, (List) null, (TriggerLimit) null, (TriggerWhen) null, (TriggerFrequencyByPeriod) null, (TriggerInactiveHour) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess000 = access000();
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerAccess000;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(GetMotionInteractionState.onExtraCallback));
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(Condition$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | i3;
        int i9 = (~(i7 | (~i4))) | (~((~i3) | i7)) | (~(i3 | i5 | i4));
        int i10 = ~(i4 | i3);
        int i11 = i3 + i5 + i + ((-813770285) * i2) + (135932771 * i6);
        int i12 = i11 * i11;
        int i13 = (526900465 * i3) + 74317824 + ((-1745228167) * i5) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i) + (1331953664 * i2) + ((-366739456) * i6) + ((-1308753920) * i12);
        int i14 = (i3 * 1149714451) + 247108311 + (i5 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i * 1149713731) + (i2 * 1918847289) + (i6 * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        return i15 != 1 ? i15 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) obj;
        if (!Intrinsics.areEqual(this.id, trigger.id)) {
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, trigger.name)) {
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.triggerType, trigger.triggerType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.parameters, trigger.parameters)) {
            int i5 = onExtraCallbackWithResult + 49;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.conditions, trigger.conditions) || !Intrinsics.areEqual(this.triggerLimit, trigger.triggerLimit) || !Intrinsics.areEqual(this.triggerWhen, trigger.triggerWhen) || !Intrinsics.areEqual(this.triggerFrequencyByPeriod, trigger.triggerFrequencyByPeriod)) {
            return false;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.triggerInactiveHour, trigger.triggerInactiveHour)) {
            int i6 = onExtraCallback + 35;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.triggerFrequencyCapGroupId, trigger.triggerFrequencyCapGroupId)) {
            return false;
        }
        int i7 = onExtraCallback + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.id.hashCode();
        int iHashCode5 = this.name.hashCode();
        int iHashCode6 = this.triggerType.hashCode();
        int iHashCode7 = this.parameters.hashCode();
        int iHashCode8 = this.conditions.hashCode();
        TriggerLimit triggerLimit = this.triggerLimit;
        int iHashCode9 = triggerLimit == null ? 0 : triggerLimit.hashCode();
        TriggerWhen triggerWhen = this.triggerWhen;
        if (triggerWhen == null) {
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = triggerWhen.hashCode();
        }
        TriggerFrequencyByPeriod triggerFrequencyByPeriod = this.triggerFrequencyByPeriod;
        if (triggerFrequencyByPeriod == null) {
            int i4 = onExtraCallbackWithResult + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = triggerFrequencyByPeriod.hashCode();
        }
        TriggerInactiveHour triggerInactiveHour = this.triggerInactiveHour;
        if (triggerInactiveHour == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = triggerInactiveHour.hashCode();
            int i6 = onExtraCallbackWithResult + 25;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = this.triggerFrequencyCapGroupId;
        return (((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Trigger(id=" + this.id + ", name=" + this.name + ", triggerType=" + this.triggerType + ", parameters=" + this.parameters + ", conditions=" + this.conditions + ", triggerLimit=" + this.triggerLimit + ", triggerWhen=" + this.triggerWhen + ", triggerFrequencyByPeriod=" + this.triggerFrequencyByPeriod + ", triggerInactiveHour=" + this.triggerInactiveHour + ", triggerFrequencyCapGroupId=" + this.triggerFrequencyCapGroupId + ")";
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Trigger> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Trigger$$serializer trigger$$serializer = Trigger$$serializer.INSTANCE;
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return trigger$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tuba.Trigger$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return Trigger.onExtraCallback();
                }
                Trigger.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.core.tuba.Trigger$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return Trigger.IAuthTabCallback();
                }
                Trigger.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null, null, null};
        int i = IAuthTabCallback + 11;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Trigger(int i, String str, String str2, String str3, Map map, List list, TriggerLimit triggerLimit, TriggerWhen triggerWhen, TriggerFrequencyByPeriod triggerFrequencyByPeriod, TriggerInactiveHour triggerInactiveHour, String str4, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.id = str;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
            }
            if ((i & 2) != 0) {
                this.name = "";
            } else {
                this.name = str2;
                int i3 = 2 % 2;
            }
            if ((i & 4) != 0) {
                int i4 = onExtraCallbackWithResult + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                this.triggerType = "";
            } else {
                this.triggerType = str3;
            }
            if ((i & 8) != 0) {
                int i6 = onExtraCallbackWithResult + 93;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    this.parameters = access8100.onNavigationEvent();
                    throw null;
                }
                this.parameters = access8100.onNavigationEvent();
                int i7 = 2 % 2;
            } else {
                this.parameters = map;
            }
            if ((i & 16) != 0) {
                this.conditions = CollectionsKt.emptyList();
            } else {
                this.conditions = list;
            }
            if ((i & 32) != 0) {
                this.triggerLimit = null;
            } else {
                this.triggerLimit = triggerLimit;
            }
            if ((i & 64) != 0) {
                this.triggerWhen = null;
            } else {
                this.triggerWhen = triggerWhen;
            }
            if ((i & 128) != 0) {
                this.triggerFrequencyByPeriod = null;
            } else {
                this.triggerFrequencyByPeriod = triggerFrequencyByPeriod;
            }
            if ((i & 256) != 0) {
                this.triggerInactiveHour = null;
            } else {
                this.triggerInactiveHour = triggerInactiveHour;
            }
            if ((i & 512) == 0) {
                this.triggerFrequencyCapGroupId = str4;
                return;
            }
            this.triggerFrequencyCapGroupId = null;
            int i8 = onExtraCallback + 63;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 83 / 0;
                return;
            }
            return;
        }
        this.id = "";
        int i10 = 2 % 2;
        if ((i & 2) != 0) {
        }
        if ((i & 4) != 0) {
        }
        if ((i & 8) != 0) {
        }
        if ((i & 16) != 0) {
        }
        if ((i & 32) != 0) {
        }
        if ((i & 64) != 0) {
        }
        if ((i & 128) != 0) {
        }
        if ((i & 256) != 0) {
        }
        if ((i & 512) == 0) {
        }
    }

    public Trigger(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map, @NotNull List<Condition> list, @Nullable TriggerLimit triggerLimit, @Nullable TriggerWhen triggerWhen, @Nullable TriggerFrequencyByPeriod triggerFrequencyByPeriod, @Nullable TriggerInactiveHour triggerInactiveHour, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.name = str2;
        this.triggerType = str3;
        this.parameters = map;
        this.conditions = list;
        this.triggerLimit = triggerLimit;
        this.triggerWhen = triggerWhen;
        this.triggerFrequencyByPeriod = triggerFrequencyByPeriod;
        this.triggerInactiveHour = triggerInactiveHour;
        this.triggerFrequencyCapGroupId = str4;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(Trigger trigger, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(trigger.id, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, trigger.id);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(trigger.name, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, trigger.name);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(trigger.triggerType, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, trigger.triggerType);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3))) {
            vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), trigger.parameters);
        } else {
            int i2 = onExtraCallbackWithResult + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(trigger.parameters, access8100.onNavigationEvent());
                throw null;
            }
            if (!Intrinsics.areEqual(trigger.parameters, access8100.onNavigationEvent())) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i3 = onExtraCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(trigger.conditions, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), trigger.conditions);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || trigger.triggerLimit != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, TriggerLimit$$serializer.INSTANCE, trigger.triggerLimit);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i5 = onExtraCallbackWithResult + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (trigger.triggerWhen != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, TriggerWhen$$serializer.INSTANCE, trigger.triggerWhen);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i7 = onExtraCallbackWithResult + 109;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (trigger.triggerFrequencyByPeriod != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, TriggerFrequencyByPeriod$$serializer.INSTANCE, trigger.triggerFrequencyByPeriod);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || trigger.triggerInactiveHour != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, TriggerInactiveHour$$serializer.INSTANCE, trigger.triggerInactiveHour);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i9 = onExtraCallbackWithResult + 31;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                String str = trigger.triggerFrequencyCapGroupId;
                throw null;
            }
            if (trigger.triggerFrequencyCapGroupId == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, trigger.triggerFrequencyCapGroupId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Trigger(String str, String str2, String str3, Map map, List list, TriggerLimit triggerLimit, TriggerWhen triggerWhen, TriggerFrequencyByPeriod triggerFrequencyByPeriod, TriggerInactiveHour triggerInactiveHour, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7 = "";
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
            }
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str7 = str3;
        }
        this(str5, str6, str7, (i & 8) != 0 ? access8100.onNavigationEvent() : map, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : triggerLimit, (i & 64) != 0 ? null : triggerWhen, (i & 128) != 0 ? null : triggerFrequencyByPeriod, (i & 256) != 0 ? null : triggerInactiveHour, (i & 512) == 0 ? str4 : null);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.triggerType;
        int i5 = i2 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, Object> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.parameters;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return map;
    }

    public final TriggerLimit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TriggerLimit triggerLimit = this.triggerLimit;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return triggerLimit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Trigger trigger = (Trigger) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        TriggerWhen triggerWhen = trigger.triggerWhen;
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        int i6 = i3 + 9;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return triggerWhen;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Trigger trigger = (Trigger) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        TriggerFrequencyByPeriod triggerFrequencyByPeriod = trigger.triggerFrequencyByPeriod;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return triggerFrequencyByPeriod;
    }

    public final TriggerInactiveHour IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TriggerInactiveHour triggerInactiveHour = this.triggerInactiveHour;
        int i5 = i2 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return triggerInactiveHour;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Trigger trigger = (Trigger) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = trigger.triggerFrequencyCapGroupId;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v9 java.util.List<im.toss.core.tuba.Condition>) = (r1v5 java.util.List<im.toss.core.tuba.Condition>), (r1v11 java.util.List<im.toss.core.tuba.Condition>) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull downloadZip downloadzip) {
        List<Condition> list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(downloadzip, "");
            list = this.conditions;
            int i3 = 18 / 0;
            if (!(!(list instanceof Collection))) {
                if (list.isEmpty()) {
                    return false;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(downloadzip, "");
            list = this.conditions;
            if (list instanceof Collection) {
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Condition) it.next()).onExtraCallback(downloadzip)) {
                int i4 = onExtraCallbackWithResult + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    public final TriggerFrequencyByPeriod asBinder() {
        return (TriggerFrequencyByPeriod) onWarmupCompleted(new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -219465618, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 219465620, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public final String onTransact() {
        return (String) onWarmupCompleted(new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1524330962, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public final TriggerWhen IAuthTabCallbackStubProxy() {
        return (TriggerWhen) onWarmupCompleted(new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -940316692, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 940316693, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }
}
