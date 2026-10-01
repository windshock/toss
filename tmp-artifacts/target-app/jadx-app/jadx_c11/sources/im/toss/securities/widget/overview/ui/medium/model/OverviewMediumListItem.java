package im.toss.securities.widget.overview.ui.medium.model;

import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.r8;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface OverviewMediumListItem {
    public static final Companion Companion = Companion.onNavigationEvent;

    long onNavigationEvent();

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ Companion onNavigationEvent = new Companion();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<OverviewMediumListItem> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem", Reflection.getOrCreateKotlinClass(OverviewMediumListItem.class), new KClass[]{Reflection.getOrCreateKotlinClass(FolderHeader.class), Reflection.getOrCreateKotlinClass(Stock.class)}, new KSerializer[]{OverviewMediumListItem$FolderHeader$$serializer.INSTANCE, OverviewMediumListItem$Stock$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return ktVar;
        }
    }

    @nc(IAuthTabCallback = "folderHeader")
    @liq
    public static final class FolderHeader implements OverviewMediumListItem {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String folderKey;
        private final String folderName;
        private final Double profitLossRate;
        private final long stableId;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 125;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FolderHeader)) {
                int i5 = i3 + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            FolderHeader folderHeader = (FolderHeader) obj;
            if (!Intrinsics.areEqual(this.folderKey, folderHeader.folderKey)) {
                int i7 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.folderName, folderHeader.folderName)) {
                return Intrinsics.areEqual(this.profitLossRate, folderHeader.profitLossRate);
            }
            int i9 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.folderKey.hashCode();
            int iHashCode2 = this.folderName.hashCode();
            Double d = this.profitLossRate;
            if (d == null) {
                i = 0;
            } else {
                int iHashCode3 = d.hashCode();
                int i5 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode3;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FolderHeader(folderKey=" + this.folderKey + ", folderName=" + this.folderName + ", profitLossRate=" + this.profitLossRate + ")";
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
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

            public final KSerializer<FolderHeader> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 47;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                OverviewMediumListItem$FolderHeader$$serializer overviewMediumListItem$FolderHeader$$serializer = OverviewMediumListItem$FolderHeader$$serializer.INSTANCE;
                if (i3 == 0) {
                    return overviewMediumListItem$FolderHeader$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ FolderHeader(int i, String str, String str2, Double d, okycx okycxVar) {
            if (3 != (i & 3)) {
                int i2 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 3, OverviewMediumListItem$FolderHeader$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            this.folderKey = str;
            this.folderName = str2;
            if ((i & 4) == 0) {
                this.profitLossRate = null;
                int i6 = 2 % 2;
            } else {
                this.profitLossRate = d;
            }
            this.stableId = r8.onExtraCallbackWithResult(1L, str);
        }

        public FolderHeader(@NotNull String str, @NotNull String str2, @Nullable Double d) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.folderKey = str;
            this.folderName = str2;
            this.profitLossRate = d;
            this.stableId = r8.onExtraCallbackWithResult(1L, str);
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(FolderHeader folderHeader, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, folderHeader.folderKey);
            vylVar.onExtraCallback(serialDescriptor, 1, folderHeader.folderName);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (folderHeader.profitLossRate == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, setVideoListener.onWarmupCompleted, folderHeader.profitLossRate);
            int i6 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.folderName;
            int i4 = i2 + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
            return str;
        }

        public final Double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Double d = this.profitLossRate;
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            return d;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem
        public long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = this.stableId;
            int i4 = i3 + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }
    }

    @nc(IAuthTabCallback = "stock")
    @liq
    public static final class Stock implements OverviewMediumListItem {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final OverviewItemInfo item;
        private final long stableId;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem$Stock$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = OverviewMediumListItem.Stock.onWarmupCompleted();
                int i4 = onExtraCallback + 87;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                OverviewItemInfo.Companion.serializer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer<OverviewItemInfo> kSerializerSerializer = OverviewItemInfo.Companion.serializer();
            int i3 = onExtraCallback + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i3 = onExtraCallback + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 27 / 0;
            }
            return kSerializerOnExtraCallback;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stock)) {
                int i5 = i3 + 59;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.item, ((Stock) obj).item)) {
                return true;
            }
            int i7 = IAuthTabCallback + 29;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.item.hashCode();
                int i3 = 32 / 0;
            } else {
                iHashCode = this.item.hashCode();
            }
            int i4 = onExtraCallback + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Stock(item=" + this.item + ")";
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Stock> serializer() {
                OverviewMediumListItem$Stock$$serializer overviewMediumListItem$Stock$$serializer;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    overviewMediumListItem$Stock$$serializer = OverviewMediumListItem$Stock$$serializer.INSTANCE;
                    int i3 = 14 / 0;
                } else {
                    overviewMediumListItem$Stock$$serializer = OverviewMediumListItem$Stock$$serializer.INSTANCE;
                }
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return overviewMediumListItem$Stock$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Stock(int i, OverviewItemInfo overviewItemInfo, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onExtraCallback + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, OverviewMediumListItem$Stock$$serializer.INSTANCE.getDescriptor());
                int i4 = IAuthTabCallback + 17;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this.item = overviewItemInfo;
            this.stableId = r8.onExtraCallbackWithResult(2L, overviewItemInfo.onTransact());
        }

        public Stock(@NotNull OverviewItemInfo overviewItemInfo) {
            Intrinsics.checkNotNullParameter(overviewItemInfo, "");
            this.item = overviewItemInfo;
            this.stableId = r8.onExtraCallbackWithResult(2L, overviewItemInfo.onTransact());
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return lazyArr;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(Stock stock, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), stock.item);
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 25 / 0;
            }
        }

        public final OverviewItemInfo IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            OverviewItemInfo overviewItemInfo = this.item;
            int i4 = i3 + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return overviewItemInfo;
            }
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.securities.widget.overview.ui.medium.model.OverviewMediumListItem
        public long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = this.stableId;
            int i4 = i3 + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }
    }
}
