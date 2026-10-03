package viva.republica.toss.network.model.transfer.periodic;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.EncryptedContentInfoParser;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.appInfo;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Monthly$$serializer;

@appInfo(IAuthTabCallback = "frequencyType")
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class PeriodicTransferFrequency {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = PeriodicTransferFrequency.onNavigationEvent();
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            return kSerializerOnNavigationEvent;
        }
    });

    public /* synthetic */ PeriodicTransferFrequency(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return kSerializerIAuthTabCallback;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) PeriodicTransferFrequency.onExtraCallbackWithResult().getValue();
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return kSerializer;
        }

        public final KSerializer<PeriodicTransferFrequency> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<PeriodicTransferFrequency> kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    static {
        int i = IAuthTabCallback + 65;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private PeriodicTransferFrequency() {
    }

    public /* synthetic */ PeriodicTransferFrequency(int i, okycx okycxVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        kt ktVar = new kt("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency", Reflection.getOrCreateKotlinClass(PeriodicTransferFrequency.class), new KClass[]{Reflection.getOrCreateKotlinClass(Daily.class), Reflection.getOrCreateKotlinClass(Monthly.class), Reflection.getOrCreateKotlinClass(OneTime.class), Reflection.getOrCreateKotlinClass(Weekly.class)}, new KSerializer[]{PeriodicTransferFrequency$Daily$$serializer.INSTANCE, PeriodicTransferFrequency$Monthly$$serializer.INSTANCE, PeriodicTransferFrequency$OneTime$$serializer.INSTANCE, PeriodicTransferFrequency$Weekly$$serializer.INSTANCE}, new Annotation[]{new PeriodicTransferFrequency$Monthly$$serializer.onExtraCallback("frequencyType")});
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return ktVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return lazy;
    }

    @nc(IAuthTabCallback = "MONTHLY")
    @liq
    public static final class Monthly extends PeriodicTransferFrequency {
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final int dayOfMonth;
        private final String endDate;
        private final String startDate;

        static {
            int i = onExtraCallback + 63;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof Monthly) {
                    Monthly monthly = (Monthly) obj;
                    if (Intrinsics.areEqual(this.startDate, monthly.startDate)) {
                        return Intrinsics.areEqual(this.endDate, monthly.endDate) && this.dayOfMonth == monthly.dayOfMonth;
                    }
                    int i2 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                }
                return false;
            }
            int i4 = onExtraCallbackWithResult + 5;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 93;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 83 / 0;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.startDate;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.endDate;
            if (str2 != null) {
                int i4 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = str2.hashCode();
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + Integer.hashCode(this.dayOfMonth);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Monthly(startDate=" + this.startDate + ", endDate=" + this.endDate + ", dayOfMonth=" + this.dayOfMonth + ")";
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Monthly> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    PeriodicTransferFrequency$Monthly$$serializer periodicTransferFrequency$Monthly$$serializer = PeriodicTransferFrequency$Monthly$$serializer.INSTANCE;
                    throw null;
                }
                PeriodicTransferFrequency$Monthly$$serializer periodicTransferFrequency$Monthly$$serializer2 = PeriodicTransferFrequency$Monthly$$serializer.INSTANCE;
                int i3 = onExtraCallback + 45;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return periodicTransferFrequency$Monthly$$serializer2;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Monthly(int i, String str, String str2, int i2, okycx okycxVar) {
            super(i, okycxVar);
            if (7 != (i & 7)) {
                int i3 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                htf31.onExtraCallbackWithResult(i, 7, PeriodicTransferFrequency$Monthly$$serializer.INSTANCE.getDescriptor());
                int i5 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            }
            this.startDate = str;
            this.endDate = str2;
            this.dayOfMonth = i2;
        }

        public Monthly(@Nullable String str, @Nullable String str2, int i) {
            super(null);
            this.startDate = str;
            this.endDate = str2;
            this.dayOfMonth = i;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Monthly monthly, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, monthly.startDate);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, monthly.endDate);
            vylVar.onExtraCallback(serialDescriptor, 2, monthly.dayOfMonth);
            int i4 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @nc(IAuthTabCallback = "WEEKLY")
    @liq
    public static final class Weekly extends PeriodicTransferFrequency {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final onExtraCallback dayOfWeek;
        private final String endDate;
        private final String startDate;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = PeriodicTransferFrequency.Weekly.onWarmupCompleted();
                int i4 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        })};

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.DayOfWeek", onExtraCallback.values());
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.DayOfWeek", onExtraCallback.values());
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Weekly)) {
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 23 / 0;
                }
                return false;
            }
            Weekly weekly = (Weekly) obj;
            if (Intrinsics.areEqual(this.startDate, weekly.startDate)) {
                return Intrinsics.areEqual(this.endDate, weekly.endDate) && this.dayOfWeek == weekly.dayOfWeek;
            }
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int iHashCode2 = 0;
            if (i2 % 2 != 0) {
                str = this.startDate;
                iHashCode = 1;
                if (str != null) {
                    iHashCode2 = 1;
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                }
            } else {
                str = this.startDate;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                }
            }
            String str2 = this.endDate;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + this.dayOfWeek.hashCode();
            int i3 = IAuthTabCallback + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Weekly(startDate=" + this.startDate + ", endDate=" + this.endDate + ", dayOfWeek=" + this.dayOfWeek + ")";
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
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

            public final KSerializer<Weekly> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    PeriodicTransferFrequency$Weekly$$serializer periodicTransferFrequency$Weekly$$serializer = PeriodicTransferFrequency$Weekly$$serializer.INSTANCE;
                    throw null;
                }
                PeriodicTransferFrequency$Weekly$$serializer periodicTransferFrequency$Weekly$$serializer2 = PeriodicTransferFrequency$Weekly$$serializer.INSTANCE;
                int i3 = onExtraCallback + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return periodicTransferFrequency$Weekly$$serializer2;
            }
        }

        static {
            int i = onNavigationEvent + 75;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Weekly(int i, String str, String str2, onExtraCallback onextracallback, okycx okycxVar) {
            SerialDescriptor descriptor;
            super(i, okycxVar);
            int i2 = 7;
            if (7 != (i & 7)) {
                int i3 = IAuthTabCallback + 31;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = PeriodicTransferFrequency$Weekly$$serializer.INSTANCE.getDescriptor();
                    i2 = 40;
                } else {
                    descriptor = PeriodicTransferFrequency$Weekly$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = onExtraCallback + 73;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.startDate = str;
            this.endDate = str2;
            this.dayOfWeek = onextracallback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Weekly(@Nullable String str, @Nullable String str2, @NotNull onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.startDate = str;
            this.endDate = str2;
            this.dayOfWeek = onextracallback;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            return lazyArr;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(Weekly weekly, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, weekly.startDate);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, weekly.endDate);
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), weekly.dayOfWeek);
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    @nc(IAuthTabCallback = "DAILY")
    @liq
    public static final class Daily extends PeriodicTransferFrequency {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String endDate;
        private final String startDate;

        static {
            int i = onWarmupCompleted + 15;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Daily)) {
                return false;
            }
            Daily daily = (Daily) obj;
            if (!Intrinsics.areEqual(this.startDate, daily.startDate) || !Intrinsics.areEqual(this.endDate, daily.endDate)) {
                return false;
            }
            int i4 = onExtraCallbackWithResult + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.startDate;
            if (str == null) {
                int i5 = i3 + 123;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 15;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i10 = onExtraCallbackWithResult + 79;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            String str2 = this.endDate;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Daily(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Daily> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferFrequency$Daily$$serializer periodicTransferFrequency$Daily$$serializer = PeriodicTransferFrequency$Daily$$serializer.INSTANCE;
                if (i3 != 0) {
                    return periodicTransferFrequency$Daily$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Daily(int i, String str, String str2, okycx okycxVar) {
            super(i, okycxVar);
            if (3 != (i & 3)) {
                int i2 = onExtraCallbackWithResult + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 3, PeriodicTransferFrequency$Daily$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            this.startDate = str;
            this.endDate = str2;
        }

        public Daily(@Nullable String str, @Nullable String str2) {
            super(null);
            this.startDate = str;
            this.endDate = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void onWarmupCompleted(Daily daily, vyl vylVar, SerialDescriptor serialDescriptor) {
            getWriggleLayout getwrigglelayout;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getwrigglelayout = getWriggleLayout.onNavigationEvent;
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, daily.startDate);
            } else {
                getwrigglelayout = getWriggleLayout.onNavigationEvent;
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, daily.startDate);
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, daily.endDate);
            int i3 = onExtraCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @nc(IAuthTabCallback = "ONE_TIME")
    @liq
    public static final class OneTime extends PeriodicTransferFrequency {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String dueDate;

        static {
            int i = onExtraCallbackWithResult + 45;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneTime)) {
                int i5 = i3 + 63;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.dueDate, ((OneTime) obj).dueDate)) {
                return true;
            }
            int i7 = onNavigationEvent + 107;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.dueDate.hashCode();
            int i4 = onNavigationEvent + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OneTime(dueDate=" + this.dueDate + ")";
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OneTime> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                PeriodicTransferFrequency$OneTime$$serializer periodicTransferFrequency$OneTime$$serializer = PeriodicTransferFrequency$OneTime$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return periodicTransferFrequency$OneTime$$serializer;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OneTime(int i, String str, okycx okycxVar) {
            super(i, okycxVar);
            if (1 != (i & 1)) {
                int i2 = onWarmupCompleted + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, PeriodicTransferFrequency$OneTime$$serializer.INSTANCE.getDescriptor());
                int i4 = onNavigationEvent + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.dueDate = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneTime(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.dueDate = str;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(OneTime oneTime, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, oneTime.dueDate);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallbackWithResult Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback SUNDAY = new onExtraCallback("SUNDAY", 0);
        public static final onExtraCallback MONDAY = new onExtraCallback("MONDAY", 1);
        public static final onExtraCallback TUESDAY = new onExtraCallback("TUESDAY", 2);
        public static final onExtraCallback WEDNESDAY = new onExtraCallback("WEDNESDAY", 3);
        public static final onExtraCallback THURSDAY = new onExtraCallback("THURSDAY", 4);
        public static final onExtraCallback FRIDAY = new onExtraCallback("FRIDAY", 5);
        public static final onExtraCallback SATURDAY = new onExtraCallback("SATURDAY", 6);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            Companion = new onExtraCallbackWithResult(null);
            int i = onNavigationEvent + 87;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public static final class onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final onExtraCallback IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                switch (i) {
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        return onExtraCallback.SUNDAY;
                    case 2:
                        return onExtraCallback.MONDAY;
                    case 3:
                        onExtraCallback onextracallback = onExtraCallback.TUESDAY;
                        int i4 = IAuthTabCallback + 31;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return onextracallback;
                    case 4:
                        return onExtraCallback.WEDNESDAY;
                    case 5:
                        return onExtraCallback.THURSDAY;
                    case 6:
                        onExtraCallback onextracallback2 = onExtraCallback.FRIDAY;
                        int i6 = IAuthTabCallback + 83;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 9 / 0;
                        }
                        return onextracallback2;
                    case 7:
                        return onExtraCallback.SATURDAY;
                    default:
                        return null;
                }
            }
        }
    }
}
