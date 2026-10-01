package im.toss.tosssecurities.widget.watchlist.model;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.tosssecurities.core.base.model.SessionType;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.okycx;
import o.oty1;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.setAlphaColor;
import o.sp;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface WatchlistWidgetState {
    public static final Companion Companion = Companion.onExtraCallbackWithResult;

    float onExtraCallbackWithResult();

    DisplaySetting onNavigationEvent();

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        static final /* synthetic */ Companion onExtraCallbackWithResult = new Companion();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 111;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private Companion() {
        }

        public final KSerializer<WatchlistWidgetState> serializer() {
            int i = 2 % 2;
            kt ktVar = new kt("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState", Reflection.getOrCreateKotlinClass(WatchlistWidgetState.class), new KClass[]{Reflection.getOrCreateKotlinClass(Error.class), Reflection.getOrCreateKotlinClass(IndexSuccess.class), Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Maintenance.class), Reflection.getOrCreateKotlinClass(NetworkError.class), Reflection.getOrCreateKotlinClass(NotLoggedInError.class), Reflection.getOrCreateKotlinClass(ProductSuccess.class), Reflection.getOrCreateKotlinClass(SettingInProgress.class)}, new KSerializer[]{WatchlistWidgetState$Error$$serializer.INSTANCE, WatchlistWidgetState$IndexSuccess$$serializer.INSTANCE, WatchlistWidgetState$Loading$$serializer.INSTANCE, WatchlistWidgetState$Maintenance$$serializer.INSTANCE, WatchlistWidgetState$NetworkError$$serializer.INSTANCE, WatchlistWidgetState$NotLoggedInError$$serializer.INSTANCE, WatchlistWidgetState$ProductSuccess$$serializer.INSTANCE, WatchlistWidgetState$SettingInProgress$$serializer.INSTANCE}, new Annotation[0]);
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return ktVar;
        }
    }

    @liq
    public static final class IndexSuccess implements WatchlistWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final List<RowItem> indexList;
        private final Pair<RowItem, RowItem> legacyPair;
        private final String title;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
            int i4 = onNavigationEvent + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return kSerializerIAuthTabCallbackStub;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 81 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WatchlistWidgetState$RowItem$$serializer.INSTANCE);
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return checkcanopenlandingpage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int i = 2 % 2;
            WatchlistWidgetState$RowItem$$serializer watchlistWidgetState$RowItem$$serializer = WatchlistWidgetState$RowItem$$serializer.INSTANCE;
            setAlphaColor setalphacolor = new setAlphaColor(sp.IAuthTabCallback(watchlistWidgetState$RowItem$$serializer), sp.IAuthTabCallback(watchlistWidgetState$RowItem$$serializer));
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return setalphacolor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer interfaceDescriptor = getInterfaceDescriptor();
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return interfaceDescriptor;
            }
            throw null;
        }

        public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = ~i4;
            int i11 = i9 | (~(i10 | i3));
            int i12 = (~(i3 | i7)) | (~(i8 | i10));
            int i13 = ~(i5 | i4);
            int i14 = i12 | i13;
            int i15 = i13 | i11;
            int i16 = i5 + i4 + i2 + ((-1585779005) * i6) + (640148872 * i);
            int i17 = i16 * i16;
            int i18 = (i5 * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i2) + (1159200768 * i6) + ((-734003200) * i) + (2089549824 * i17);
            int i19 = (i5 * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i2 * (-1291221671)) + (i6 * (-1079815989)) + (i * 669414472) + (i17 * 145489920);
            return i18 + ((i19 * i19) * (-1699479552)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess100 = access100();
            int i4 = onNavigationEvent + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAccess100;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndexSuccess)) {
                return false;
            }
            IndexSuccess indexSuccess = (IndexSuccess) obj;
            if (this.displaySetting != indexSuccess.displaySetting || Float.compare(this.alpha, indexSuccess.alpha) != 0 || !Intrinsics.areEqual(this.legacyPair, indexSuccess.legacyPair) || !Intrinsics.areEqual(this.title, indexSuccess.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.indexList, indexSuccess.indexList)) {
                if (!Intrinsics.areEqual(this.formattedTime, indexSuccess.formattedTime)) {
                    int i2 = onWarmupCompleted;
                    int i3 = i2 + 75;
                    onNavigationEvent = i3 % 128;
                    z = i3 % 2 != 0;
                    int i4 = i2 + 69;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                }
                return z;
            }
            int i6 = onNavigationEvent + 65;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 5;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 97 / 0;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.displaySetting.hashCode();
            int iHashCode3 = Float.hashCode(this.alpha);
            Pair<RowItem, RowItem> pair = this.legacyPair;
            if (pair == null) {
                int i2 = onNavigationEvent + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = pair.hashCode();
            }
            int iHashCode4 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.title.hashCode()) * 31) + this.indexList.hashCode()) * 31) + this.formattedTime.hashCode();
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IndexSuccess(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", legacyPair=" + this.legacyPair + ", title=" + this.title + ", indexList=" + this.indexList + ", formattedTime=" + this.formattedTime + ")";
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IndexSuccess> serializer() {
                WatchlistWidgetState$IndexSuccess$$serializer watchlistWidgetState$IndexSuccess$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    watchlistWidgetState$IndexSuccess$$serializer = WatchlistWidgetState$IndexSuccess$$serializer.INSTANCE;
                    int i3 = 53 / 0;
                } else {
                    watchlistWidgetState$IndexSuccess$$serializer = WatchlistWidgetState$IndexSuccess$$serializer.INSTANCE;
                }
                int i4 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return watchlistWidgetState$IndexSuccess$$serializer;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$IndexSuccess$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 113;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = WatchlistWidgetState.IndexSuccess.IAuthTabCallback();
                    int i4 = onExtraCallback + 111;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerIAuthTabCallback;
                }
            }), null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$IndexSuccess$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnExtraCallback = WatchlistWidgetState.IndexSuccess.onExtraCallback();
                    if (i3 != 0) {
                        int i4 = 5 / 0;
                    }
                    return kSerializerOnExtraCallback;
                }
            }), null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$IndexSuccess$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 99;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnWarmupCompleted = WatchlistWidgetState.IndexSuccess.onWarmupCompleted();
                    int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializerOnWarmupCompleted;
                    }
                    throw null;
                }
            }), null};
            int i = onExtraCallback + 95;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ IndexSuccess(int i, DisplaySetting displaySetting, float f, Pair pair, String str, List list, String str2, okycx okycxVar) {
            List<RowItem> listListOfNotNull;
            if (32 != (i & 32)) {
                htf31.onExtraCallbackWithResult(i, 32, WatchlistWidgetState$IndexSuccess$$serializer.INSTANCE.getDescriptor());
                int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i5 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                this.alpha = 1.0f;
            } else {
                this.alpha = f;
            }
            Object obj = null;
            if ((i & 4) == 0) {
                this.legacyPair = null;
            } else {
                this.legacyPair = pair;
            }
            if ((i & 8) == 0) {
                int i6 = onNavigationEvent + 101;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                this.title = "관심종목";
                if (i7 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.title = str;
                int i8 = 2 % 2;
            }
            if ((i & 16) == 0) {
                int i9 = onNavigationEvent + 31;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                Pair<RowItem, RowItem> pair2 = this.legacyPair;
                this.indexList = (pair2 == null || (listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair2.getFirst(), pair2.getSecond()})) == null) ? CollectionsKt__CollectionsKt.emptyList() : listListOfNotNull;
            } else {
                this.indexList = list;
            }
            this.formattedTime = str2;
        }

        public IndexSuccess(@NotNull DisplaySetting displaySetting, float f, @Nullable Pair<RowItem, RowItem> pair, @NotNull String str, @NotNull List<RowItem> list, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.legacyPair = pair;
            this.title = str;
            this.indexList = list;
            this.formattedTime = str2;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return $childSerializers;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(IndexSuccess indexSuccess, vyl vylVar, SerialDescriptor serialDescriptor) {
            List listEmptyList;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || indexSuccess.onNavigationEvent() != DisplaySetting.SYSTEM) {
                vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), indexSuccess.onNavigationEvent());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(indexSuccess.onExtraCallbackWithResult(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, indexSuccess.onExtraCallbackWithResult());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 87 / 0;
                    if (indexSuccess.legacyPair != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, lazyArr[2].getValue(), indexSuccess.legacyPair);
                    }
                } else if (indexSuccess.legacyPair != null) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(indexSuccess.title, "관심종목")) {
                vylVar.onExtraCallback(serialDescriptor, 3, indexSuccess.title);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                List<RowItem> list = indexSuccess.indexList;
                Pair<RowItem, RowItem> pair = indexSuccess.legacyPair;
                if (pair == null || (listEmptyList = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair.getFirst(), pair.getSecond()})) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                if (!Intrinsics.areEqual(list, listEmptyList)) {
                    vylVar.onNavigationEvent(serialDescriptor, 4, lazyArr[4].getValue(), indexSuccess.indexList);
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 5, indexSuccess.formattedTime);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ IndexSuccess(DisplaySetting displaySetting, float f, Pair pair, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            DisplaySetting displaySetting2 = (i & 1) != 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted + 27;
                onNavigationEvent = i2 % 128;
                f = i2 % 2 != 0 ? 0.0f : 1.0f;
            }
            float f2 = f;
            Pair pair2 = (i & 4) != 0 ? null : pair;
            if ((i & 8) != 0) {
                int i3 = 2 % 2;
                str = "관심종목";
            }
            String str3 = str;
            if ((i & 16) != 0 && (pair2 == null || (list = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair2.getFirst(), pair2.getSecond()})) == null)) {
                list = CollectionsKt__CollectionsKt.emptyList();
                int i4 = onNavigationEvent + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(displaySetting2, f2, pair2, str3, list, str2);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.title;
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            return str;
        }

        public final List<RowItem> asInterface() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            List<RowItem> list = this.indexList;
            int i5 = i3 + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            IndexSuccess indexSuccess = (IndexSuccess) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = indexSuccess.formattedTime;
            int i5 = i3 + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static final /* synthetic */ Lazy[] asBinder() {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (Lazy[]) onWarmupCompleted(new Object[0], UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, 1401193496, -1401193496, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }

        public final String onTransact() {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            return (String) onWarmupCompleted(new Object[]{this}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, -802450113, 802450114, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        }
    }

    @liq
    public static final class ProductSuccess implements WatchlistWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String formattedTime;
        private final Pair<RowItem, RowItem> legacyPair;
        private final List<RowItem> productList;
        private final String title;
        private final Long watchlistId;
        private final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg watchlistType;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAccess100 = access100();
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAccess100;
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 1 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer access100() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WatchlistWidgetState$RowItem$$serializer.INSTANCE);
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return checkcanopenlandingpage;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                extraCallback();
                throw null;
            }
            KSerializer kSerializerExtraCallback = extraCallback();
            int i3 = onExtraCallback + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerExtraCallback;
        }

        private static final /* synthetic */ KSerializer extraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.common.log.Type", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.values());
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.securities.widget.common.log.Type", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.values());
            int i3 = onExtraCallback + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            KSerializer kSerializer = (KSerializer) onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1461640061, iOnExtraCallback3, new Object[0], iOnExtraCallback2, iOnExtraCallback, 1461640061);
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return kSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return kSerializerIAuthTabCallback_Parcel;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof ProductSuccess)) {
                int i6 = i3 + 29;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 == 0;
            }
            ProductSuccess productSuccess = (ProductSuccess) obj;
            if (this.displaySetting != productSuccess.displaySetting || Float.compare(this.alpha, productSuccess.alpha) != 0 || (!Intrinsics.areEqual(this.legacyPair, productSuccess.legacyPair)) || !Intrinsics.areEqual(this.productList, productSuccess.productList)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.title, productSuccess.title)) {
                int i7 = onExtraCallbackWithResult + 87;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.watchlistType == productSuccess.watchlistType) {
                return !(Intrinsics.areEqual(this.formattedTime, productSuccess.formattedTime) ^ true) && Intrinsics.areEqual(this.watchlistId, productSuccess.watchlistId);
            }
            int i9 = onExtraCallbackWithResult + 29;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[PHI: r1 r3 r4 r5
          0x0046: PHI (r1v7 int) = (r1v6 int), (r1v23 int) binds: [B:14:0x0041, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r3v2 int) = (r3v1 int), (r3v0 int) binds: [B:14:0x0041, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:14:0x0041, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r5v4 int) = (r5v3 int), (r5v11 int) binds: [B:14:0x0041, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            Pair<RowItem, RowItem> pair;
            int iHashCode3;
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode4 = 1;
            if (i2 % 2 == 0) {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                pair = this.legacyPair;
                if (pair == null) {
                    iHashCode3 = 1;
                    int i3 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i3 % 128;
                    i = i3 % 2 == 0 ? iHashCode4 : 0;
                } else {
                    i = 1;
                    iHashCode4 = pair.hashCode();
                    iHashCode3 = i;
                }
            } else {
                iHashCode = this.displaySetting.hashCode();
                iHashCode2 = Float.hashCode(this.alpha);
                pair = this.legacyPair;
                if (pair == null) {
                    iHashCode3 = 0;
                    int i32 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i32 % 128;
                    if (i32 % 2 == 0) {
                    }
                }
                iHashCode4 = pair.hashCode();
                iHashCode3 = i;
            }
            int iHashCode5 = this.productList.hashCode();
            int iHashCode6 = this.title.hashCode();
            int iHashCode7 = this.watchlistType.hashCode();
            int iHashCode8 = this.formattedTime.hashCode();
            Long l = this.watchlistId;
            if (l != null) {
                int i4 = onExtraCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = l.hashCode();
            }
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductSuccess(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", legacyPair=" + this.legacyPair + ", productList=" + this.productList + ", title=" + this.title + ", watchlistType=" + this.watchlistType + ", formattedTime=" + this.formattedTime + ", watchlistId=" + this.watchlistId + ")";
            int i2 = onExtraCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
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

            public final KSerializer<ProductSuccess> serializer() {
                WatchlistWidgetState$ProductSuccess$$serializer watchlistWidgetState$ProductSuccess$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    watchlistWidgetState$ProductSuccess$$serializer = WatchlistWidgetState$ProductSuccess$$serializer.INSTANCE;
                    int i3 = 31 / 0;
                } else {
                    watchlistWidgetState$ProductSuccess$$serializer = WatchlistWidgetState$ProductSuccess$$serializer.INSTANCE;
                }
                int i4 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return watchlistWidgetState$ProductSuccess$$serializer;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$ProductSuccess$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnWarmupCompleted = WatchlistWidgetState.ProductSuccess.onWarmupCompleted();
                    int i4 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return kSerializerOnWarmupCompleted;
                    }
                    throw null;
                }
            }), null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$ProductSuccess$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        return WatchlistWidgetState.ProductSuccess.onExtraCallback();
                    }
                    WatchlistWidgetState.ProductSuccess.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }), LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$ProductSuccess$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 55;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerIAuthTabCallback = WatchlistWidgetState.ProductSuccess.IAuthTabCallback();
                    int i4 = onWarmupCompleted + 11;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 32 / 0;
                    }
                    return kSerializerIAuthTabCallback;
                }
            }), null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$ProductSuccess$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 15;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        WatchlistWidgetState.ProductSuccess.asBinder();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializerAsBinder = WatchlistWidgetState.ProductSuccess.asBinder();
                    int i3 = onExtraCallback + 75;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerAsBinder;
                }
            }), null, null};
            int i = onNavigationEvent + 29;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[PHI: r6
          0x0070: PHI (r6v5 kotlin.Pair<im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem, im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem>) = 
          (r6v4 kotlin.Pair<im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem, im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem>)
          (r6v8 kotlin.Pair<im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem, im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem>)
         binds: [B:27:0x006e, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProductSuccess(int i, DisplaySetting displaySetting, float f, Pair pair, List list, String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, String str2, Long l, okycx okycxVar) {
            Pair<RowItem, RowItem> pair2;
            List<RowItem> listListOfNotNull;
            if (96 != (i & 96)) {
                htf31.onExtraCallbackWithResult(i, 96, WatchlistWidgetState$ProductSuccess$$serializer.INSTANCE.getDescriptor());
                int i2 = onExtraCallback + 55;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                int i5 = onExtraCallbackWithResult + 47;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    this.alpha = 1.0f;
                } else {
                    this.alpha = 1.0f;
                }
            } else {
                this.alpha = f;
                int i6 = onExtraCallbackWithResult + 17;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.legacyPair = null;
            } else {
                this.legacyPair = pair;
            }
            if ((i & 8) == 0) {
                int i9 = onExtraCallbackWithResult;
                int i10 = i9 + 23;
                onExtraCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    pair2 = this.legacyPair;
                    int i11 = 89 / 0;
                    if (pair2 != null) {
                        int i12 = i9 + 77;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            RowItem[] rowItemArr = new RowItem[4];
                            rowItemArr[1] = pair2.getFirst();
                            rowItemArr[1] = pair2.getSecond();
                            listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) rowItemArr);
                            if (listListOfNotNull == null) {
                                listListOfNotNull = CollectionsKt__CollectionsKt.emptyList();
                            }
                            this.productList = listListOfNotNull;
                        } else {
                            listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair2.getFirst(), pair2.getSecond()});
                            if (listListOfNotNull == null) {
                            }
                            this.productList = listListOfNotNull;
                        }
                    }
                } else {
                    pair2 = this.legacyPair;
                    if (pair2 != null) {
                    }
                }
            } else {
                this.productList = list;
            }
            if ((i & 16) == 0) {
                this.title = "관심종목";
                int i13 = onExtraCallbackWithResult + 109;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 2 % 2;
                }
            } else {
                this.title = str;
            }
            this.watchlistType = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
            this.formattedTime = str2;
            if ((i & 128) == 0) {
                int i15 = onExtraCallback + 45;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                this.watchlistId = null;
                return;
            }
            this.watchlistId = l;
            int i17 = onExtraCallback + 109;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
        }

        public ProductSuccess(@NotNull DisplaySetting displaySetting, float f, @Nullable Pair<RowItem, RowItem> pair, @NotNull List<RowItem> list, @NotNull String str, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @NotNull String str2, @Nullable Long l) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.legacyPair = pair;
            this.productList = list;
            this.title = str;
            this.watchlistType = r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
            this.formattedTime = str2;
            this.watchlistId = l;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(ProductSuccess productSuccess, vyl vylVar, SerialDescriptor serialDescriptor) {
            List listEmptyList;
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), productSuccess.onNavigationEvent());
            } else {
                int i2 = onExtraCallbackWithResult + 115;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 81 / 0;
                    if (productSuccess.onNavigationEvent() != DisplaySetting.SYSTEM) {
                    }
                } else if (productSuccess.onNavigationEvent() != DisplaySetting.SYSTEM) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Float.compare(productSuccess.onExtraCallbackWithResult(), 1.0f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, productSuccess.onExtraCallbackWithResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || productSuccess.legacyPair != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, lazyArr[2].getValue(), productSuccess.legacyPair);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                List<RowItem> list = productSuccess.productList;
                Pair<RowItem, RowItem> pair = productSuccess.legacyPair;
                if (pair == null || (listEmptyList = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair.getFirst(), pair.getSecond()})) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                if (!Intrinsics.areEqual(list, listEmptyList)) {
                    vylVar.onNavigationEvent(serialDescriptor, 3, lazyArr[3].getValue(), productSuccess.productList);
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(productSuccess.title, "관심종목")) {
                vylVar.onExtraCallback(serialDescriptor, 4, productSuccess.title);
            }
            vylVar.onNavigationEvent(serialDescriptor, 5, lazyArr[5].getValue(), productSuccess.watchlistType);
            vylVar.onExtraCallback(serialDescriptor, 6, productSuccess.formattedTime);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 7) && productSuccess.watchlistId == null) {
                return;
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, productSuccess.watchlistId);
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ProductSuccess(DisplaySetting displaySetting, float f, Pair pair, List list, String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f2;
            Pair pair2;
            List listEmptyList;
            String str3;
            Long l2;
            DisplaySetting displaySetting2 = (i & 1) != 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) != 0) {
                int i2 = onExtraCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i & 4) != 0) {
                int i5 = onExtraCallbackWithResult + 69;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                pair2 = null;
            } else {
                pair2 = pair;
            }
            if ((i & 8) == 0) {
                listEmptyList = list;
            } else if (pair2 != null) {
                int i7 = onExtraCallback + 33;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                listEmptyList = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new RowItem[]{pair2.getFirst(), pair2.getSecond()});
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    int i9 = 2 % 2;
                }
            }
            if ((i & 16) != 0) {
                int i10 = 2 % 2;
                str3 = "관심종목";
            } else {
                str3 = str;
            }
            if ((i & 128) != 0) {
                int i11 = 2 % 2;
                l2 = null;
            } else {
                l2 = l;
            }
            this(displaySetting2, f2, pair2, listEmptyList, str3, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, str2, l2);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i3 + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
            return displaySetting;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            ProductSuccess productSuccess = (ProductSuccess) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            List<RowItem> list = productSuccess.productList;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 1;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.title;
            int i4 = i2 + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg access000() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.watchlistType;
            }
            throw null;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.formattedTime;
            int i4 = i3 + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            ProductSuccess productSuccess = (ProductSuccess) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Long l = productSuccess.watchlistId;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return l;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i2;
            int i9 = ~i5;
            int i10 = (~(i7 | i9)) | i8;
            int i11 = ~(i9 | i8 | i7);
            int i12 = i2 + i6 + i4 + ((-112346298) * i3) + (505796074 * i);
            int i13 = i12 * i12;
            int i14 = ((1543607772 * i2) - 1525940224) + (1734765094 * i6) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i4) + (859308032 * i3) + (310902784 * i) + (417529856 * i13);
            int i15 = (i2 * (-1233303660)) + 1670658458 + (i6 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i4 * (-1233302909)) + (i3 * 1075253458) + (i * 745806526) + (i13 * 1512636416);
            int i16 = i14 + (i15 * i15 * (-1737162752));
            if (i16 == 1) {
                return onExtraCallbackWithResult(objArr);
            }
            if (i16 == 2) {
                return onNavigationEvent(objArr);
            }
            int i17 = 2 % 2;
            WatchlistWidgetState$RowItem$$serializer watchlistWidgetState$RowItem$$serializer = WatchlistWidgetState$RowItem$$serializer.INSTANCE;
            setAlphaColor setalphacolor = new setAlphaColor(sp.IAuthTabCallback(watchlistWidgetState$RowItem$$serializer), sp.IAuthTabCallback(watchlistWidgetState$RowItem$$serializer));
            int i18 = onExtraCallbackWithResult + 49;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            return setalphacolor;
        }

        private static final /* synthetic */ KSerializer getInterfaceDescriptor() {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (KSerializer) onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1461640061, iOnExtraCallback3, new Object[0], iOnExtraCallback2, iOnExtraCallback, 1461640061);
        }

        public final List<RowItem> onTransact() {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (List) onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, -1766261296);
        }

        public final Long IAuthTabCallbackStubProxy() {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (Long) onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1744908740, iOnExtraCallback3, new Object[]{this}, iOnExtraCallback2, iOnExtraCallback, -1744908739);
        }
    }

    @liq
    public static final class RowItem {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final double baseWithoutAfterForGraph;
        private final List<SimpleCandle> candles;
        private final String close;
        private final double closeWithoutAfterForGraph;
        private final ItemType itemType;
        private final String name;
        private final String productCode;
        private final String profitRatio;
        private final double ratio;
        private final String tradingEnd;
        private final String tradingStart;

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                return (KSerializer) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1928810533, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[0], iOnExtraCallback, 1928810533);
            }
            int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ItemType.Companion companion = ItemType.Companion;
            if (i3 != 0) {
                return companion.serializer();
            }
            companion.serializer();
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WatchlistWidgetState$SimpleCandle$$serializer.INSTANCE);
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return checkcanopenlandingpage;
            }
            throw null;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = ~i5;
            int i11 = i9 | (~(i8 | i10));
            int i12 = ~(i5 | i6 | i3);
            int i13 = i11 | i12;
            int i14 = i10 | i6;
            int i15 = i6 + i3 + i2 + (112060874 * i) + ((-1891258303) * i4);
            int i16 = i15 * i15;
            int i17 = (i6 * 1286644997) + 1783103488 + (1286644997 * i3) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i2) + ((-1427111936) * i) + (1712848896 * i4) + (159514624 * i16);
            int i18 = ((i6 * (-1669307009)) - 1771304782) + (i3 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i2 * (-1669306445)) + (i * (-1582645698)) + (i4 * (-198941581)) + (i16 * (-203030528));
            int i19 = i17 + (i18 * i18 * (-2008154112));
            if (i19 != 1) {
                return i19 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
            }
            RowItem rowItem = (RowItem) objArr[0];
            int i20 = 2 % 2;
            int i21 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i22 = i21 % 128;
            onExtraCallbackWithResult = i22;
            int i23 = i21 % 2;
            String str = rowItem.close;
            int i24 = i22 + 99;
            onWarmupCompleted = i24 % 128;
            int i25 = i24 % 2;
            return str;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerExtraCallbackWithResult = extraCallbackWithResult();
            int i4 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(!(obj instanceof RowItem))) {
                RowItem rowItem = (RowItem) obj;
                if (!Intrinsics.areEqual(this.name, rowItem.name) || !Intrinsics.areEqual(this.productCode, rowItem.productCode)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.close, rowItem.close)) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 69;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 31;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 18 / 0;
                    }
                    return false;
                }
                if (Double.compare(this.baseWithoutAfterForGraph, rowItem.baseWithoutAfterForGraph) != 0) {
                    int i8 = onWarmupCompleted + 111;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                if (Double.compare(this.closeWithoutAfterForGraph, rowItem.closeWithoutAfterForGraph) != 0 || !Intrinsics.areEqual(this.candles, rowItem.candles) || !Intrinsics.areEqual(this.profitRatio, rowItem.profitRatio) || Double.compare(this.ratio, rowItem.ratio) != 0) {
                    return false;
                }
                if (Intrinsics.areEqual(this.tradingStart, rowItem.tradingStart)) {
                    return Intrinsics.areEqual(this.tradingEnd, rowItem.tradingEnd) && this.itemType == rowItem.itemType;
                }
                int i9 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.name.hashCode();
            int iHashCode3 = this.productCode.hashCode();
            int iHashCode4 = this.close.hashCode();
            int iHashCode5 = Double.hashCode(this.baseWithoutAfterForGraph);
            int iHashCode6 = Double.hashCode(this.closeWithoutAfterForGraph);
            int iHashCode7 = this.candles.hashCode();
            int iHashCode8 = this.profitRatio.hashCode();
            int iHashCode9 = Double.hashCode(this.ratio);
            String str = this.tradingStart;
            int iHashCode10 = str == null ? 0 : str.hashCode();
            String str2 = this.tradingEnd;
            if (str2 == null) {
                int i2 = onExtraCallbackWithResult + 5;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                iHashCode = i2 % 2 != 0 ? 1 : 0;
                int i4 = i3 + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode = str2.hashCode();
            }
            ItemType itemType = this.itemType;
            int iHashCode11 = (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + (itemType != null ? itemType.hashCode() : 0);
            int i6 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return iHashCode11;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RowItem(name=" + this.name + ", productCode=" + this.productCode + ", close=" + this.close + ", baseWithoutAfterForGraph=" + this.baseWithoutAfterForGraph + ", closeWithoutAfterForGraph=" + this.closeWithoutAfterForGraph + ", candles=" + this.candles + ", profitRatio=" + this.profitRatio + ", ratio=" + this.ratio + ", tradingStart=" + this.tradingStart + ", tradingEnd=" + this.tradingEnd + ", itemType=" + this.itemType + ")";
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RowItem> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$RowItem$$serializer watchlistWidgetState$RowItem$$serializer = WatchlistWidgetState$RowItem$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 14 / 0;
                }
                return watchlistWidgetState$RowItem$$serializer;
            }
        }

        static {
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 11;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        WatchlistWidgetState.RowItem.IAuthTabCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializerIAuthTabCallback = WatchlistWidgetState.RowItem.IAuthTabCallback();
                    int i3 = onWarmupCompleted + 91;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerIAuthTabCallback;
                }
            }), null, null, null, null, LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$RowItem$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 81;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                    int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
                    KSerializer kSerializer = (KSerializer) WatchlistWidgetState.RowItem.onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1695070554, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[0], iOnExtraCallback, 1695070556);
                    int i4 = onWarmupCompleted + 67;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer;
                }
            })};
            int i = IAuthTabCallback + 87;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 65 / 0;
            }
        }

        public /* synthetic */ RowItem(int i, String str, String str2, String str3, double d, double d2, List list, String str4, double d3, String str5, String str6, ItemType itemType, okycx okycxVar) {
            ItemType itemType2;
            SerialDescriptor descriptor;
            int i2 = 871;
            if (871 != (i & 871)) {
                int i3 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = WatchlistWidgetState$RowItem$$serializer.INSTANCE.getDescriptor();
                    i2 = 17511;
                } else {
                    descriptor = WatchlistWidgetState$RowItem$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.name = str;
            this.productCode = str2;
            this.close = str3;
            if ((i & 8) == 0) {
                this.baseWithoutAfterForGraph = 0.0d;
            } else {
                this.baseWithoutAfterForGraph = d;
                int i5 = 2 % 2;
            }
            if ((i & 16) == 0) {
                int i6 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                this.closeWithoutAfterForGraph = 0.0d;
            } else {
                this.closeWithoutAfterForGraph = d2;
            }
            this.candles = list;
            this.profitRatio = str4;
            if ((i & 128) == 0) {
                this.ratio = 0.0d;
            } else {
                this.ratio = d3;
            }
            this.tradingStart = str5;
            this.tradingEnd = str6;
            if ((i & 1024) == 0) {
                int i8 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                itemType2 = null;
            } else {
                int i10 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 2;
                }
                itemType2 = itemType;
            }
            this.itemType = itemType2;
        }

        public RowItem(@NotNull String str, @NotNull String str2, @NotNull String str3, double d, double d2, @NotNull List<SimpleCandle> list, @NotNull String str4, double d3, @Nullable String str5, @Nullable String str6, @Nullable ItemType itemType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.name = str;
            this.productCode = str2;
            this.close = str3;
            this.baseWithoutAfterForGraph = d;
            this.closeWithoutAfterForGraph = d2;
            this.candles = list;
            this.profitRatio = str4;
            this.ratio = d3;
            this.tradingStart = str5;
            this.tradingEnd = str6;
            this.itemType = itemType;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[PHI: r1
          0x004b: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0041, B:10:0x0049, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r1
          0x0043: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v8 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x0041, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(RowItem rowItem, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                vylVar.onExtraCallback(serialDescriptor, 0, rowItem.name);
                vylVar.onExtraCallback(serialDescriptor, 1, rowItem.productCode);
                vylVar.onExtraCallback(serialDescriptor, 2, rowItem.close);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                    if (Double.compare(rowItem.baseWithoutAfterForGraph, 0.0d) != 0) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, rowItem.baseWithoutAfterForGraph);
                    }
                }
            } else {
                lazyArr = $childSerializers;
                vylVar.onExtraCallback(serialDescriptor, 0, rowItem.name);
                vylVar.onExtraCallback(serialDescriptor, 1, rowItem.productCode);
                vylVar.onExtraCallback(serialDescriptor, 2, rowItem.close);
                if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || Double.compare(rowItem.closeWithoutAfterForGraph, 0.0d) != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, rowItem.closeWithoutAfterForGraph);
            }
            vylVar.onNavigationEvent(serialDescriptor, 5, lazyArr[5].getValue(), rowItem.candles);
            vylVar.onExtraCallback(serialDescriptor, 6, rowItem.profitRatio);
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || Double.compare(rowItem.ratio, 0.0d) != 0) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, rowItem.ratio);
            }
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, rowItem.tradingStart);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, rowItem.tradingEnd);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 10)) {
                int i3 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ItemType itemType = rowItem.itemType;
                if (i4 != 0) {
                    int i5 = 98 / 0;
                    if (itemType == null) {
                        return;
                    }
                } else if (itemType == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, lazyArr[10].getValue(), rowItem.itemType);
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $childSerializers;
            }
            throw null;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.name;
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return str;
        }

        public final String IAuthTabCallbackStub() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.productCode;
                int i4 = 62 / 0;
            } else {
                str = this.productCode;
            }
            int i5 = i2 + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final double onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            double d = this.baseWithoutAfterForGraph;
            int i4 = i2 + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return d;
        }

        public final double asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.closeWithoutAfterForGraph;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<SimpleCandle> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.candles;
            }
            throw null;
        }

        public final String access100() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.profitRatio;
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final double getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            double d = this.ratio;
            int i4 = i2 + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return d;
            }
            throw null;
        }

        public final String access000() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.tradingStart;
            int i5 = i2 + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.tradingEnd;
            int i5 = i3 + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ItemType asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ItemType itemType = this.itemType;
            int i5 = i2 + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return itemType;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            return (KSerializer) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1695070554, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[0], iOnExtraCallback, 1695070556);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            return (KSerializer) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, -1928810533, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[0], iOnExtraCallback, 1928810533);
        }

        public final String IAuthTabCallbackDefault() {
            int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
            return (String) onNavigationEvent(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback2, 1235089590, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, iOnExtraCallback, -1235089589);
        }
    }

    @liq
    public static final class SimpleCandle {
        public static final int $stable = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String endDate;
        private final double price;
        private final SessionType sessionType;
        private final String startDate;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$SimpleCandle$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    WatchlistWidgetState.SimpleCandle.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = WatchlistWidgetState.SimpleCandle.onExtraCallback();
                int i3 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        })};

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = SessionType.Companion.serializer();
            int i4 = onWarmupCompleted + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallbackDefault;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 81;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof SimpleCandle)) {
                return false;
            }
            SimpleCandle simpleCandle = (SimpleCandle) obj;
            if (!Intrinsics.areEqual(this.startDate, simpleCandle.startDate)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.endDate, simpleCandle.endDate)) {
                int i3 = onExtraCallback + 31;
                onWarmupCompleted = i3 % 128;
                return i3 % 2 != 0;
            }
            if (Double.compare(this.price, simpleCandle.price) != 0) {
                return false;
            }
            if (this.sessionType != simpleCandle.sessionType) {
                int i4 = onWarmupCompleted + 57;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onExtraCallback + 59;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.startDate.hashCode();
            int iHashCode3 = this.endDate.hashCode();
            int iHashCode4 = Double.hashCode(this.price);
            SessionType sessionType = this.sessionType;
            if (sessionType == null) {
                int i4 = onWarmupCompleted + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sessionType.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SimpleCandle(startDate=" + this.startDate + ", endDate=" + this.endDate + ", price=" + this.price + ", sessionType=" + this.sessionType + ")";
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
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

            public final KSerializer<SimpleCandle> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    WatchlistWidgetState$SimpleCandle$$serializer watchlistWidgetState$SimpleCandle$$serializer = WatchlistWidgetState$SimpleCandle$$serializer.INSTANCE;
                    throw null;
                }
                WatchlistWidgetState$SimpleCandle$$serializer watchlistWidgetState$SimpleCandle$$serializer2 = WatchlistWidgetState$SimpleCandle$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return watchlistWidgetState$SimpleCandle$$serializer2;
            }
        }

        static {
            int i = onNavigationEvent + 89;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ SimpleCandle(int i, String str, String str2, double d, SessionType sessionType, okycx okycxVar) {
            if (7 != (i & 7)) {
                int i2 = onExtraCallback + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 7, WatchlistWidgetState$SimpleCandle$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            this.startDate = str;
            this.endDate = str2;
            this.price = d;
            if ((i & 8) == 0) {
                this.sessionType = null;
                return;
            }
            this.sessionType = sessionType;
            int i5 = onWarmupCompleted + 9;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public SimpleCandle(@NotNull String str, @NotNull String str2, double d, @Nullable SessionType sessionType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.startDate = str;
            this.endDate = str2;
            this.price = d;
            this.sessionType = sessionType;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 123;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(SimpleCandle simpleCandle, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, simpleCandle.startDate);
            vylVar.onExtraCallback(serialDescriptor, 1, simpleCandle.endDate);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, simpleCandle.price);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i4 = onWarmupCompleted + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (simpleCandle.sessionType != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, lazyArr[3].getValue(), simpleCandle.sessionType);
                }
            }
            int i6 = onWarmupCompleted + 9;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SimpleCandle(String str, String str2, double d, SessionType sessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 8) != 0) {
                int i2 = onExtraCallback;
                int i3 = i2 + 45;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 80 / 0;
                }
                int i5 = i2 + 89;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                sessionType = null;
            }
            this(str, str2, d, sessionType);
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.endDate;
            int i5 = i3 + 5;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            double d = this.price;
            int i5 = i3 + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SessionType onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            SessionType sessionType = this.sessionType;
            int i5 = i3 + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return sessionType;
            }
            throw null;
        }
    }

    @liq
    public static final class NotLoggedInError extends Exception implements WatchlistWidgetState {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$NotLoggedInError$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = WatchlistWidgetState.NotLoggedInError.onWarmupCompleted();
                if (i3 == 0) {
                    int i4 = 44 / 0;
                }
                return kSerializerOnWarmupCompleted;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NotLoggedInError() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallback() {
            KSerializer kSerializerSerializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
                int i3 = 28 / 0;
            } else {
                kSerializerSerializer = DisplaySetting.Companion.serializer();
            }
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return kSerializerIAuthTabCallback;
        }

        private final Object readResolve() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 87;
                onNavigationEvent = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof NotLoggedInError)) {
                int i6 = i2 + 97;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            NotLoggedInError notLoggedInError = (NotLoggedInError) obj;
            if (this.displaySetting != notLoggedInError.displaySetting) {
                return false;
            }
            if (Float.compare(this.alpha, notLoggedInError.alpha) == 0) {
                return true;
            }
            int i8 = onNavigationEvent + 69;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int iHashCode = (i2 % 2 == 0 ? this.displaySetting.hashCode() / 39 : this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = onWarmupCompleted + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NotLoggedInError(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NotLoggedInError> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$NotLoggedInError$$serializer watchlistWidgetState$NotLoggedInError$$serializer = WatchlistWidgetState$NotLoggedInError$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return watchlistWidgetState$NotLoggedInError$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 23;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ NotLoggedInError(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onNavigationEvent + 69;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                return;
            }
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            this.alpha = i4 % 2 != 0 ? 0.0f : 1.0f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotLoggedInError(@NotNull DisplaySetting displaySetting, float f) {
            super("토스앱에 로그인 된 유저가 아닙니다.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 101;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                lazyArr = $childSerializers;
                int i4 = 46 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i2 + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NotLoggedInError notLoggedInError, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onNavigationEvent + 87;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    notLoggedInError.onNavigationEvent();
                    DisplaySetting displaySetting = DisplaySetting.SYSTEM;
                    throw null;
                }
                if (notLoggedInError.onNavigationEvent() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), notLoggedInError.onNavigationEvent());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onNavigationEvent + 103;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    if (Float.compare(notLoggedInError.onExtraCallbackWithResult(), 0.0f) == 0) {
                        return;
                    }
                } else if (Float.compare(notLoggedInError.onExtraCallbackWithResult(), 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, notLoggedInError.onExtraCallbackWithResult());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NotLoggedInError(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 3;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    displaySetting = DisplaySetting.SYSTEM;
                    int i3 = 2 % 2;
                } else {
                    DisplaySetting displaySetting2 = DisplaySetting.SYSTEM;
                    throw null;
                }
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 4;
                } else {
                    int i6 = 2 % 2;
                }
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            if (i3 != 0) {
                int i4 = 29 / 0;
            }
            return displaySetting;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.alpha;
            }
            throw null;
        }
    }

    @liq
    public static final class NetworkError extends Exception implements WatchlistWidgetState {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$NetworkError$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = WatchlistWidgetState.NetworkError.onExtraCallback();
                if (i3 == 0) {
                    int i4 = 71 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public NetworkError() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        private final Object readResolve() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
            return this;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 83;
                onExtraCallback = i5 % 128;
                boolean z = i5 % 2 == 0;
                int i6 = i3 + 15;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            if (!(obj instanceof NetworkError)) {
                return false;
            }
            NetworkError networkError = (NetworkError) obj;
            if (this.displaySetting != networkError.displaySetting) {
                return false;
            }
            if (Float.compare(this.alpha, networkError.alpha) == 0) {
                return true;
            }
            int i7 = onExtraCallback + 47;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 83 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displaySetting.hashCode();
            return i3 != 0 ? (iHashCode % 42) - Float.hashCode(this.alpha) : (iHashCode * 31) + Float.hashCode(this.alpha);
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "NetworkError(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkError> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$NetworkError$$serializer watchlistWidgetState$NetworkError$$serializer = WatchlistWidgetState$NetworkError$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 101;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return watchlistWidgetState$NetworkError$$serializer;
            }
        }

        static {
            int i = onWarmupCompleted + 53;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 49 / 0;
            }
        }

        public /* synthetic */ NetworkError(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onExtraCallback + 77;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                int i5 = onExtraCallback + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = onNavigationEvent;
            int i8 = i7 + 13;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            this.alpha = 1.0f;
            int i10 = i7 + 33;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(@NotNull DisplaySetting displaySetting, float f) {
            super("네트워크 오류가 발생했습니다.");
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[PHI: r1
          0x0028: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x0026, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NetworkError networkError, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (networkError.onNavigationEvent() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), networkError.onNavigationEvent());
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if ((!vylVar.onWarmupCompleted(serialDescriptor, 1)) && Float.compare(networkError.onExtraCallbackWithResult(), 1.0f) == 0) {
                return;
            }
            vylVar.onExtraCallback(serialDescriptor, 1, networkError.onExtraCallbackWithResult());
            int i3 = onExtraCallback + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NetworkError(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onNavigationEvent + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onExtraCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.displaySetting;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            float f = this.alpha;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class Error extends Exception implements WatchlistWidgetState {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        private final String message;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$Error$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = WatchlistWidgetState.Error.IAuthTabCallback();
                if (i3 != 0) {
                    int i4 = 68 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), null, null};

        public Error() {
            this((DisplaySetting) null, 0.0f, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (this.displaySetting != error.displaySetting) {
                int i2 = onExtraCallback + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Float.compare(this.alpha, error.alpha) == 0) {
                return Intrinsics.areEqual(this.message, error.message);
            }
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.displaySetting.hashCode();
                Float.hashCode(this.alpha);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = this.displaySetting.hashCode();
            int iHashCode3 = Float.hashCode(this.alpha);
            String str = this.message;
            if (str == null) {
                int i3 = onWarmupCompleted + 19;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i = 2 % 2;
            String str = "Error(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ", message=" + this.message + ")";
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Error> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$Error$$serializer watchlistWidgetState$Error$$serializer = WatchlistWidgetState$Error$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 59 / 0;
                }
                return watchlistWidgetState$Error$$serializer;
            }
        }

        static {
            int i = IAuthTabCallback + 55;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Error(int i, DisplaySetting displaySetting, float f, String str, okycx okycxVar) {
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) == 0) {
                int i2 = onExtraCallback + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.alpha = 1.0f;
            } else {
                this.alpha = f;
                int i4 = onWarmupCompleted + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 4) != 0) {
                this.message = str;
                return;
            }
            int i7 = onWarmupCompleted + 13;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            this.message = null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull DisplaySetting displaySetting, float f, @Nullable String str) {
            super(str);
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
            this.message = str;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(Error error, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
                vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), error.onNavigationEvent());
            } else {
                int i2 = onWarmupCompleted + 23;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                if (error.onNavigationEvent() != DisplaySetting.SYSTEM) {
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
                vylVar.onExtraCallback(serialDescriptor, 1, error.onExtraCallbackWithResult());
            } else {
                int i4 = onWarmupCompleted + 51;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0 ? Float.compare(error.onExtraCallbackWithResult(), 1.0f) != 0 : Float.compare(error.onExtraCallbackWithResult(), 2.0f) != 0) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i5 = onWarmupCompleted + 101;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (error.getMessage() == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, error.getMessage());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(DisplaySetting displaySetting, float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                f = 1.0f;
            }
            if ((i & 4) != 0) {
                int i7 = 2 % 2;
                str = null;
            }
            this(displaySetting, f, str);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            DisplaySetting displaySetting = this.displaySetting;
            int i4 = i2 + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return displaySetting;
            }
            throw null;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.alpha;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                str = this.message;
                int i4 = 17 / 0;
            } else {
                str = this.message;
            }
            int i5 = i3 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @liq
    public static final class Loading implements WatchlistWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$Loading$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return WatchlistWidgetState.Loading.IAuthTabCallback();
                }
                WatchlistWidgetState.Loading.IAuthTabCallback();
                throw null;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }

        private static final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            if (i3 == 0) {
                int i4 = 41 / 0;
            }
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 53;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            if (this.displaySetting == loading.displaySetting) {
                return Float.compare(this.alpha, loading.alpha) == 0;
            }
            int i3 = onExtraCallback + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loading(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Loading> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$Loading$$serializer watchlistWidgetState$Loading$$serializer = WatchlistWidgetState$Loading$$serializer.INSTANCE;
                if (i3 == 0) {
                    return watchlistWidgetState$Loading$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onNavigationEvent + 39;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Loading(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.displaySetting = displaySetting;
            if ((i & 2) == 0) {
                int i5 = onWarmupCompleted + 47;
                onExtraCallback = i5 % 128;
                this.alpha = i5 % 2 == 0 ? 0.0f : 1.0f;
            } else {
                this.alpha = f;
                int i6 = onExtraCallback + 113;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        public Loading(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onWarmupCompleted(Loading loading, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i2 = onExtraCallback + 123;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    loading.onNavigationEvent();
                    DisplaySetting displaySetting = DisplaySetting.SYSTEM;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (loading.onNavigationEvent() != DisplaySetting.SYSTEM) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), loading.onNavigationEvent());
                    int i3 = onWarmupCompleted + 111;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i5 = onExtraCallback + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (Float.compare(loading.onExtraCallbackWithResult(), 1.0f) != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 1, loading.onExtraCallbackWithResult());
                }
            }
            int i7 = onExtraCallback + 53;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }

        public static final /* synthetic */ Lazy[] onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return lazyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loading(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 85;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = onWarmupCompleted + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            DisplaySetting displaySetting;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                displaySetting = this.displaySetting;
                int i4 = 29 / 0;
            } else {
                displaySetting = this.displaySetting;
            }
            int i5 = i2 + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return displaySetting;
            }
            throw null;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }
    }

    @liq
    public static final class SettingInProgress implements WatchlistWidgetState {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float alpha;
        private final DisplaySetting displaySetting;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$SettingInProgress$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    WatchlistWidgetState.SettingInProgress.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = WatchlistWidgetState.SettingInProgress.IAuthTabCallback();
                int i3 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }
        }), null};

        /* JADX WARN: Illegal instructions before constructor call */
        public SettingInProgress() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i3 = IAuthTabCallback + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnWarmupCompleted;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(!(obj instanceof SettingInProgress))) {
                SettingInProgress settingInProgress = (SettingInProgress) obj;
                return this.displaySetting == settingInProgress.displaySetting && Float.compare(this.alpha, settingInProgress.alpha) == 0;
            }
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int iHashCode = (i2 % 2 != 0 ? this.displaySetting.hashCode() / 21 : this.displaySetting.hashCode() * 31) + Float.hashCode(this.alpha);
            int i3 = IAuthTabCallback + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SettingInProgress(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SettingInProgress> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$SettingInProgress$$serializer watchlistWidgetState$SettingInProgress$$serializer = WatchlistWidgetState$SettingInProgress$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return watchlistWidgetState$SettingInProgress$$serializer;
            }
        }

        static {
            int i = onExtraCallback + 97;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ SettingInProgress(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            if ((i & 1) == 0) {
                displaySetting = DisplaySetting.SYSTEM;
                int i2 = IAuthTabCallback + 41;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            }
            this.displaySetting = displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                return;
            }
            this.alpha = 1.0f;
            int i4 = IAuthTabCallback + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public SettingInProgress(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r1
          0x0031: PHI (r1v7 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x002f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(SettingInProgress settingInProgress, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    int i3 = IAuthTabCallback + 101;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    if (settingInProgress.onNavigationEvent() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), settingInProgress.onNavigationEvent());
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i5 = IAuthTabCallback + 25;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (Float.compare(settingInProgress.onExtraCallbackWithResult(), 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, settingInProgress.onExtraCallbackWithResult());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SettingInProgress(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    DisplaySetting displaySetting2 = DisplaySetting.SYSTEM;
                    throw null;
                }
                displaySetting = DisplaySetting.SYSTEM;
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 83;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return displaySetting;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.alpha;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class Maintenance implements WatchlistWidgetState {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState$Maintenance$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    WatchlistWidgetState.Maintenance.onExtraCallback();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallback = WatchlistWidgetState.Maintenance.onExtraCallback();
                int i3 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 32 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), null};
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final float alpha;
        private final DisplaySetting displaySetting;

        /* JADX WARN: Illegal instructions before constructor call */
        public Maintenance() {
            DisplaySetting displaySetting = null;
            this(displaySetting, 0.0f, 3, (DefaultConstructorMarker) displaySetting);
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
            int i3 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnWarmupCompleted;
        }

        private static final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Maintenance)) {
                return false;
            }
            Maintenance maintenance = (Maintenance) obj;
            if (this.displaySetting != maintenance.displaySetting) {
                int i5 = i3 + 81;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Float.compare(this.alpha, maintenance.alpha) == 0) {
                return true;
            }
            int i7 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.displaySetting.hashCode();
            return i3 != 0 ? (iHashCode * 34) >>> Float.hashCode(this.alpha) : (iHashCode * 31) + Float.hashCode(this.alpha);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Maintenance(displaySetting=" + this.displaySetting + ", alpha=" + this.alpha + ")";
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Maintenance> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                WatchlistWidgetState$Maintenance$$serializer watchlistWidgetState$Maintenance$$serializer = WatchlistWidgetState$Maintenance$$serializer.INSTANCE;
                if (i3 == 0) {
                    return watchlistWidgetState$Maintenance$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 33;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Maintenance(int i, DisplaySetting displaySetting, float f, okycx okycxVar) {
            this.displaySetting = (i & 1) == 0 ? DisplaySetting.SYSTEM : displaySetting;
            if ((i & 2) != 0) {
                this.alpha = f;
                int i2 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 93;
            onExtraCallbackWithResult = i5 % 128;
            this.alpha = i5 % 2 != 0 ? 2.0f : 1.0f;
            int i6 = i4 + 125;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Maintenance(@NotNull DisplaySetting displaySetting, float f) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            this.displaySetting = displaySetting;
            this.alpha = f;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return $childSerializers;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[PHI: r1
          0x0028: PHI (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x0026, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(Maintenance maintenance, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    if (maintenance.onNavigationEvent() != DisplaySetting.SYSTEM) {
                        vylVar.onNavigationEvent(serialDescriptor, 0, lazyArr[0].getValue(), maintenance.onNavigationEvent());
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                float fOnExtraCallbackWithResult = maintenance.onExtraCallbackWithResult();
                if (i4 != 0) {
                    if (Float.compare(fOnExtraCallbackWithResult, 2.0f) == 0) {
                        return;
                    }
                } else if (Float.compare(fOnExtraCallbackWithResult, 1.0f) == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, maintenance.onExtraCallbackWithResult());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Maintenance(DisplaySetting displaySetting, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                displaySetting = DisplaySetting.SYSTEM;
                int i4 = 2 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                f = 1.0f;
            }
            this(displaySetting, f);
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public DisplaySetting onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting = this.displaySetting;
            int i5 = i2 + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return displaySetting;
        }

        @Override // im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState
        public float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            float f = this.alpha;
            int i5 = i2 + 39;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
