package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.SdkTemplate;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.encryptType4;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.setUserInputEnabled;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq(onNavigationEvent = setUserInputEnabled.class)
/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SdkTemplate {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String NANA_IMAGE_PAT = "nana-image-pat";
    public static final String NANA_IMAGE_SAT = "nana-image-sat";
    public static final String NANA_LIST_BAT = "nana-list-bat";
    public static final String NANA_LIST_PAT = "nana-list-pat";
    public static final String NANA_LIST_SAT = "nana-list-sat";
    public static final String NANA_SURVEY_BUTTON_SAT = "nana-survey-button-sat";
    public static final String NANA_SURVEY_CHOICE_SAT = "nana-survey-choice-sat";

    public interface onExtraCallback extends onExtraCallbackWithResult {
        String onExtraCallbackWithResult();

        String onWarmupCompleted();
    }

    SspSdkEventTracker IAuthTabCallback();

    String onExtraCallback();

    String onNavigationEvent();

    public interface onNavigationEvent extends SdkTemplate {
        SdkTemplateReviewed IAuthTabCallbackStub();

        List<SdkTemplateItem> asBinder();

        SdkTemplateHeader onExtraCallbackWithResult();

        SdkTemplateCta onWarmupCompleted();

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        default String onNavigationEvent() {
            SdkTemplateCta sdkTemplateCtaOnNavigationEvent;
            int i = 2 % 2;
            SdkTemplateItem sdkTemplateItem = (SdkTemplateItem) CollectionsKt.firstOrNull(asBinder());
            String strIAuthTabCallback = (sdkTemplateItem == null || (sdkTemplateCtaOnNavigationEvent = sdkTemplateItem.onNavigationEvent()) == null) ? null : sdkTemplateCtaOnNavigationEvent.IAuthTabCallback();
            return strIAuthTabCallback == null ? "" : strIAuthTabCallback;
        }
    }

    public interface onExtraCallbackWithResult extends SdkTemplate {
        String IAuthTabCallbackDefault();

        SdkTemplateCta asBinder();

        String asInterface();

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        default String onNavigationEvent() {
            int i = 2 % 2;
            SdkTemplateCta sdkTemplateCtaAsBinder = asBinder();
            String strIAuthTabCallback = sdkTemplateCtaAsBinder != null ? sdkTemplateCtaAsBinder.IAuthTabCallback() : null;
            return strIAuthTabCallback == null ? "" : strIAuthTabCallback;
        }
    }

    @liq
    public static final class NanaListBat implements onNavigationEvent {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final SspSdkEventTracker eventTracker;
        private final SdkTemplateCta footer;
        private final SdkTemplateHeader header;
        private final List<SdkTemplateItem> items;
        private final SdkTemplateReviewed reviewed;
        private final String sdkTemplateId;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.SdkTemplate$NanaListBat$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnTransact = SdkTemplate.NanaListBat.onTransact();
                int i4 = onWarmupCompleted + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnTransact;
            }
        }), null, null};

        public NanaListBat() {
            this((String) null, (SspSdkEventTracker) null, (SdkTemplateHeader) null, (List) null, (SdkTemplateCta) null, (SdkTemplateReviewed) null, 63, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SdkTemplateItem$$serializer.INSTANCE);
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallbackDefault();
            }
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NanaListBat)) {
                int i2 = IAuthTabCallback + 51;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            NanaListBat nanaListBat = (NanaListBat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaListBat.sdkTemplateId) || !Intrinsics.areEqual(this.eventTracker, nanaListBat.eventTracker)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.header, nanaListBat.header))) {
                return Intrinsics.areEqual(this.items, nanaListBat.items) && Intrinsics.areEqual(this.footer, nanaListBat.footer) && Intrinsics.areEqual(this.reviewed, nanaListBat.reviewed);
            }
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int iHashCode3 = 0;
            if (sspSdkEventTracker == null) {
                int i4 = IAuthTabCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sspSdkEventTracker.hashCode();
            }
            SdkTemplateHeader sdkTemplateHeader = this.header;
            int iHashCode4 = sdkTemplateHeader == null ? 0 : sdkTemplateHeader.hashCode();
            int iHashCode5 = this.items.hashCode();
            SdkTemplateCta sdkTemplateCta = this.footer;
            int iHashCode6 = sdkTemplateCta == null ? 0 : sdkTemplateCta.hashCode();
            SdkTemplateReviewed sdkTemplateReviewed = this.reviewed;
            if (sdkTemplateReviewed != null) {
                int i6 = IAuthTabCallback + 119;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int iHashCode7 = sdkTemplateReviewed.hashCode();
                    int i7 = 71 / 0;
                    iHashCode3 = iHashCode7;
                } else {
                    iHashCode3 = sdkTemplateReviewed.hashCode();
                }
            }
            return (((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaListBat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", header=" + this.header + ", items=" + this.items + ", footer=" + this.footer + ", reviewed=" + this.reviewed + ")";
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NanaListBat> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    SdkTemplate$NanaListBat$$serializer sdkTemplate$NanaListBat$$serializer = SdkTemplate$NanaListBat$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                SdkTemplate$NanaListBat$$serializer sdkTemplate$NanaListBat$$serializer2 = SdkTemplate$NanaListBat$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 43;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return sdkTemplate$NanaListBat$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 51;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ NanaListBat(int i, String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = onWarmupCompleted + 43;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 3;
                } else {
                    int i4 = 2 % 2;
                }
                str = "nana-list-bat";
            }
            this.sdkTemplateId = str;
            if ((i & 2) == 0) {
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
                int i5 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i6 = IAuthTabCallback + 51;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                this.header = null;
            } else {
                this.header = sdkTemplateHeader;
            }
            if ((i & 8) == 0) {
                int i8 = onWarmupCompleted + 41;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                this.items = CollectionsKt.emptyList();
            } else {
                this.items = list;
            }
            if ((i & 16) == 0) {
                int i10 = onWarmupCompleted + 27;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                this.footer = null;
                int i12 = 2 % 2;
            } else {
                this.footer = sdkTemplateCta;
            }
            if ((i & 32) != 0) {
                this.reviewed = sdkTemplateReviewed;
                return;
            }
            int i13 = IAuthTabCallback + 65;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            this.reviewed = null;
            if (i14 != 0) {
                throw null;
            }
        }

        public NanaListBat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable SdkTemplateHeader sdkTemplateHeader, @NotNull List<SdkTemplateItem> list, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable SdkTemplateReviewed sdkTemplateReviewed) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.header = sdkTemplateHeader;
            this.items = list;
            this.footer = sdkTemplateCta;
            this.reviewed = sdkTemplateReviewed;
        }

        public static final /* synthetic */ Lazy[] asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r1
          0x002c: PHI (r1v15 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x002a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NanaListBat nanaListBat, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (!Intrinsics.areEqual(nanaListBat.onExtraCallback(), "nana-list-bat")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, nanaListBat.onExtraCallback());
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || nanaListBat.IAuthTabCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaListBat.IAuthTabCallback());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i3 = IAuthTabCallback + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 23 / 0;
                    if (nanaListBat.onExtraCallbackWithResult() != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, SdkTemplateHeader$$serializer.INSTANCE, nanaListBat.onExtraCallbackWithResult());
                    }
                } else if (nanaListBat.onExtraCallbackWithResult() != null) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(nanaListBat.asBinder(), CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), nanaListBat.asBinder());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                int i5 = onWarmupCompleted + 23;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    nanaListBat.onWarmupCompleted();
                    throw null;
                }
                if (nanaListBat.onWarmupCompleted() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, SdkTemplateCta$$serializer.INSTANCE, nanaListBat.onWarmupCompleted());
                    int i6 = IAuthTabCallback + 31;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i8 = IAuthTabCallback + 105;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                if (nanaListBat.IAuthTabCallbackStub() == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, SdkTemplateReviewed$$serializer.INSTANCE, nanaListBat.IAuthTabCallbackStub());
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = super.onNavigationEvent();
            int i4 = onWarmupCompleted + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaListBat(String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, int i, DefaultConstructorMarker defaultConstructorMarker) {
            SdkTemplateHeader sdkTemplateHeader2;
            SdkTemplateCta sdkTemplateCta2;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = "nana-list-bat";
            }
            SspSdkEventTracker sspSdkEventTracker2 = (i & 2) != 0 ? null : sspSdkEventTracker;
            if ((i & 4) != 0) {
                int i3 = onWarmupCompleted + 9;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
                sdkTemplateHeader2 = null;
            } else {
                sdkTemplateHeader2 = sdkTemplateHeader;
            }
            if ((i & 8) != 0) {
                int i5 = IAuthTabCallback + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                list = CollectionsKt.emptyList();
                int i7 = 2 % 2;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                int i8 = IAuthTabCallback + 17;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            this(str, sspSdkEventTracker2, sdkTemplateHeader2, list2, sdkTemplateCta2, (i & 32) == 0 ? sdkTemplateReviewed : null);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.sdkTemplateId;
            int i4 = i3 + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 85;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int i4 = i2 + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return sspSdkEventTracker;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateHeader onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            SdkTemplateHeader sdkTemplateHeader = this.header;
            int i5 = i3 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return sdkTemplateHeader;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public List<SdkTemplateItem> asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<SdkTemplateItem> list = this.items;
            int i5 = i2 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateCta onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateCta sdkTemplateCta = this.footer;
            int i5 = i2 + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return sdkTemplateCta;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateReviewed IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.reviewed;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class NanaListSat implements onNavigationEvent {
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.SdkTemplate$NanaListSat$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerAsInterface = SdkTemplate.NanaListSat.asInterface();
                int i4 = onExtraCallback + 23;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerAsInterface;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null};
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final SspSdkEventTracker eventTracker;
        private final SdkTemplateCta footer;
        private final SdkTemplateHeader header;
        private final List<SdkTemplateItem> items;
        private final SdkTemplateReviewed reviewed;
        private final String sdkTemplateId;

        public NanaListSat() {
            this((String) null, (SspSdkEventTracker) null, (SdkTemplateHeader) null, (List) null, (SdkTemplateCta) null, (SdkTemplateReviewed) null, 63, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SdkTemplateItem$$serializer.INSTANCE);
            int i2 = onExtraCallbackWithResult + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return checkcanopenlandingpage;
        }

        public static /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerIAuthTabCallbackDefault;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof NanaListSat)) {
                int i4 = onExtraCallbackWithResult + 69;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            NanaListSat nanaListSat = (NanaListSat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaListSat.sdkTemplateId)) {
                int i6 = onExtraCallbackWithResult + 101;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.eventTracker, nanaListSat.eventTracker) || !Intrinsics.areEqual(this.header, nanaListSat.header) || !Intrinsics.areEqual(this.items, nanaListSat.items) || !Intrinsics.areEqual(this.footer, nanaListSat.footer) || !Intrinsics.areEqual(this.reviewed, nanaListSat.reviewed)) {
                return false;
            }
            int i8 = onExtraCallback + 51;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int iHashCode3 = 0;
            int iHashCode4 = sspSdkEventTracker == null ? 0 : sspSdkEventTracker.hashCode();
            SdkTemplateHeader sdkTemplateHeader = this.header;
            int iHashCode5 = sdkTemplateHeader == null ? 0 : sdkTemplateHeader.hashCode();
            int iHashCode6 = this.items.hashCode();
            SdkTemplateCta sdkTemplateCta = this.footer;
            if (sdkTemplateCta == null) {
                int i4 = onExtraCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sdkTemplateCta.hashCode();
                int i6 = onExtraCallbackWithResult + 63;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            SdkTemplateReviewed sdkTemplateReviewed = this.reviewed;
            if (sdkTemplateReviewed != null) {
                int i8 = onExtraCallbackWithResult + 31;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = sdkTemplateReviewed.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaListSat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", header=" + this.header + ", items=" + this.items + ", footer=" + this.footer + ", reviewed=" + this.reviewed + ")";
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
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

            public final KSerializer<NanaListSat> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaListSat$$serializer sdkTemplate$NanaListSat$$serializer = SdkTemplate$NanaListSat$$serializer.INSTANCE;
                if (i3 != 0) {
                    return sdkTemplate$NanaListSat$$serializer;
                }
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 51;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ NanaListSat(int i, String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, okycx okycxVar) {
            this.sdkTemplateId = (i & 1) == 0 ? "nana-list-sat" : str;
            if ((i & 2) == 0) {
                int i2 = onExtraCallback + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                this.eventTracker = null;
                if (i3 == 0) {
                    throw null;
                }
            } else {
                this.eventTracker = sspSdkEventTracker;
            }
            if ((i & 4) == 0) {
                int i4 = onExtraCallback + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                this.header = null;
                if (i5 == 0) {
                    throw null;
                }
                int i6 = 2 % 2;
            } else {
                this.header = sdkTemplateHeader;
            }
            if ((i & 8) == 0) {
                this.items = CollectionsKt.emptyList();
            } else {
                this.items = list;
                int i7 = onExtraCallback + 47;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
            }
            if ((i & 16) == 0) {
                this.footer = null;
            } else {
                this.footer = sdkTemplateCta;
            }
            if ((i & 32) != 0) {
                this.reviewed = sdkTemplateReviewed;
                return;
            }
            int i9 = onExtraCallbackWithResult + 9;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            this.reviewed = null;
            if (i10 != 0) {
                throw null;
            }
        }

        public NanaListSat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable SdkTemplateHeader sdkTemplateHeader, @NotNull List<SdkTemplateItem> list, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable SdkTemplateReviewed sdkTemplateReviewed) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.header = sdkTemplateHeader;
            this.items = list;
            this.footer = sdkTemplateCta;
            this.reviewed = sdkTemplateReviewed;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r1
          0x002c: PHI (r1v14 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v15 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:10:0x002a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
          0x0020: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v15 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NanaListSat nanaListSat, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                    if (!Intrinsics.areEqual(nanaListSat.onExtraCallback(), "nana-list-sat")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, nanaListSat.onExtraCallback());
                        int i3 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 3 % 2;
                        }
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || nanaListSat.IAuthTabCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaListSat.IAuthTabCallback());
                int i5 = onExtraCallback + 121;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || nanaListSat.onExtraCallbackWithResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, SdkTemplateHeader$$serializer.INSTANCE, nanaListSat.onExtraCallbackWithResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(nanaListSat.asBinder(), CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), nanaListSat.asBinder());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
                int i7 = onExtraCallbackWithResult + 15;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (nanaListSat.onWarmupCompleted() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, SdkTemplateCta$$serializer.INSTANCE, nanaListSat.onWarmupCompleted());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || nanaListSat.IAuthTabCallbackStub() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, SdkTemplateReviewed$$serializer.INSTANCE, nanaListSat.IAuthTabCallbackStub());
            }
        }

        public static final /* synthetic */ Lazy[] onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 != 0) {
                int i4 = 46 / 0;
            }
            return lazyArr;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = super.onNavigationEvent();
            int i4 = onExtraCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaListSat(String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, int i, DefaultConstructorMarker defaultConstructorMarker) {
            SspSdkEventTracker sspSdkEventTracker2;
            SdkTemplateCta sdkTemplateCta2;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = "nana-list-sat";
            }
            SdkTemplateReviewed sdkTemplateReviewed2 = null;
            if ((i & 2) != 0) {
                int i3 = onExtraCallbackWithResult + 23;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    sdkTemplateReviewed2.hashCode();
                    throw null;
                }
                sspSdkEventTracker2 = null;
            } else {
                sspSdkEventTracker2 = sspSdkEventTracker;
            }
            SdkTemplateHeader sdkTemplateHeader2 = (i & 4) != 0 ? null : sdkTemplateHeader;
            if ((i & 8) != 0) {
                list = CollectionsKt.emptyList();
                int i4 = onExtraCallbackWithResult + 71;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            List list2 = list;
            if ((i & 16) != 0) {
                int i6 = 2 % 2;
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            if ((i & 32) != 0) {
                int i7 = 2 % 2;
            } else {
                sdkTemplateReviewed2 = sdkTemplateReviewed;
            }
            this(str, sspSdkEventTracker2, sdkTemplateHeader2, list2, sdkTemplateCta2, sdkTemplateReviewed2);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.sdkTemplateId;
            int i4 = i3 + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int i5 = i3 + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return sspSdkEventTracker;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateHeader onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.header;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public List<SdkTemplateItem> asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.items;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateCta onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateCta sdkTemplateCta = this.footer;
            int i5 = i2 + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return sdkTemplateCta;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateReviewed IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateReviewed sdkTemplateReviewed = this.reviewed;
            int i5 = i2 + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return sdkTemplateReviewed;
        }
    }

    @liq
    public static final class NanaListPat implements onNavigationEvent {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final SspSdkEventTracker eventTracker;
        private final SdkTemplateCta footer;
        private final SdkTemplateHeader header;
        private final List<SdkTemplateItem> items;
        private final SdkTemplateReviewed reviewed;
        private final String sdkTemplateId;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.SdkTemplate$NanaListPat$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnTransact = SdkTemplate.NanaListPat.onTransact();
                if (i3 != 0) {
                    int i4 = 76 / 0;
                }
                return kSerializerOnTransact;
            }
        }), null, null};

        public NanaListPat() {
            this((String) null, (SspSdkEventTracker) null, (SdkTemplateHeader) null, (List) null, (SdkTemplateCta) null, (SdkTemplateReviewed) null, 63, (DefaultConstructorMarker) null);
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SdkTemplateItem$$serializer.INSTANCE);
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return checkcanopenlandingpage;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onTransact() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return asInterface();
            }
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof NanaListPat) {
                NanaListPat nanaListPat = (NanaListPat) obj;
                if (!Intrinsics.areEqual(this.sdkTemplateId, nanaListPat.sdkTemplateId)) {
                    int i4 = onExtraCallbackWithResult + 51;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.eventTracker, nanaListPat.eventTracker)) {
                    int i6 = onWarmupCompleted + 33;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.header, nanaListPat.header) || !Intrinsics.areEqual(this.items, nanaListPat.items)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.footer, nanaListPat.footer)) {
                    int i8 = onExtraCallbackWithResult + 65;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.reviewed, nanaListPat.reviewed)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            if (sspSdkEventTracker == null) {
                int i2 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sspSdkEventTracker.hashCode();
            }
            SdkTemplateHeader sdkTemplateHeader = this.header;
            int iHashCode4 = sdkTemplateHeader == null ? 0 : sdkTemplateHeader.hashCode();
            int iHashCode5 = this.items.hashCode();
            SdkTemplateCta sdkTemplateCta = this.footer;
            if (sdkTemplateCta == null) {
                int i4 = onExtraCallbackWithResult + 63;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = sdkTemplateCta.hashCode();
            }
            SdkTemplateReviewed sdkTemplateReviewed = this.reviewed;
            return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (sdkTemplateReviewed != null ? sdkTemplateReviewed.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaListPat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", header=" + this.header + ", items=" + this.items + ", footer=" + this.footer + ", reviewed=" + this.reviewed + ")";
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
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

            public final KSerializer<NanaListPat> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaListPat$$serializer sdkTemplate$NanaListPat$$serializer = SdkTemplate$NanaListPat$$serializer.INSTANCE;
                if (i3 != 0) {
                    return sdkTemplate$NanaListPat$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = IAuthTabCallback + 41;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ NanaListPat(int i, String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, okycx okycxVar) {
            this.sdkTemplateId = (i & 1) == 0 ? "nana-list-pat" : str;
            if ((i & 2) == 0) {
                int i2 = onExtraCallbackWithResult + 95;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
            }
            int i4 = 2 % 2;
            if ((i & 4) == 0) {
                int i5 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                this.header = null;
                if (i6 == 0) {
                    int i7 = 37 / 0;
                }
            } else {
                this.header = sdkTemplateHeader;
            }
            if ((i & 8) == 0) {
                this.items = CollectionsKt.emptyList();
                int i8 = 2 % 2;
            } else {
                this.items = list;
            }
            if ((i & 16) == 0) {
                this.footer = null;
            } else {
                this.footer = sdkTemplateCta;
            }
            int i9 = 2 % 2;
            if ((i & 32) != 0) {
                this.reviewed = sdkTemplateReviewed;
                return;
            }
            int i10 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.reviewed = null;
        }

        public NanaListPat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable SdkTemplateHeader sdkTemplateHeader, @NotNull List<SdkTemplateItem> list, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable SdkTemplateReviewed sdkTemplateReviewed) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.header = sdkTemplateHeader;
            this.items = list;
            this.footer = sdkTemplateCta;
            this.reviewed = sdkTemplateReviewed;
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r1
          0x002d: PHI (r1v12 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:10:0x002b, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
          0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onNavigationEvent(NanaListPat nanaListPat, vyl vylVar, SerialDescriptor serialDescriptor) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    if (!Intrinsics.areEqual(nanaListPat.onExtraCallback(), "nana-list-pat")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, nanaListPat.onExtraCallback());
                    }
                }
            } else {
                lazyArr = $childSerializers;
                if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (nanaListPat.IAuthTabCallback() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaListPat.IAuthTabCallback());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i5 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 92 / 0;
                    if (nanaListPat.onExtraCallbackWithResult() != null) {
                        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, SdkTemplateHeader$$serializer.INSTANCE, nanaListPat.onExtraCallbackWithResult());
                        int i7 = onWarmupCompleted + 57;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    }
                } else if (nanaListPat.onExtraCallbackWithResult() != null) {
                }
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 3)) || !Intrinsics.areEqual(nanaListPat.asBinder(), CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), nanaListPat.asBinder());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || nanaListPat.onWarmupCompleted() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, SdkTemplateCta$$serializer.INSTANCE, nanaListPat.onWarmupCompleted());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || nanaListPat.IAuthTabCallbackStub() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, SdkTemplateReviewed$$serializer.INSTANCE, nanaListPat.IAuthTabCallbackStub());
                int i9 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                super.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnNavigationEvent = super.onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return strOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaListPat(String str, SspSdkEventTracker sspSdkEventTracker, SdkTemplateHeader sdkTemplateHeader, List list, SdkTemplateCta sdkTemplateCta, SdkTemplateReviewed sdkTemplateReviewed, int i, DefaultConstructorMarker defaultConstructorMarker) {
            SdkTemplateHeader sdkTemplateHeader2;
            SdkTemplateCta sdkTemplateCta2;
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str = "nana-list-pat";
            }
            SdkTemplateReviewed sdkTemplateReviewed2 = null;
            SspSdkEventTracker sspSdkEventTracker2 = (i & 2) != 0 ? null : sspSdkEventTracker;
            if ((i & 4) != 0) {
                int i4 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                sdkTemplateHeader2 = null;
            } else {
                sdkTemplateHeader2 = sdkTemplateHeader;
            }
            if ((i & 8) != 0) {
                int i6 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    CollectionsKt.emptyList();
                    sdkTemplateReviewed2.hashCode();
                    throw null;
                }
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            if ((i & 16) != 0) {
                int i7 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            if ((i & 32) != 0) {
                int i10 = 2 % 2;
            } else {
                sdkTemplateReviewed2 = sdkTemplateReviewed;
            }
            this(str, sspSdkEventTracker2, sdkTemplateHeader2, list2, sdkTemplateCta2, sdkTemplateReviewed2);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.sdkTemplateId;
            int i5 = i3 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int i4 = i3 + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return sspSdkEventTracker;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateHeader onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            SdkTemplateHeader sdkTemplateHeader = this.header;
            int i4 = i2 + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return sdkTemplateHeader;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public List<SdkTemplateItem> asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            List<SdkTemplateItem> list = this.items;
            int i5 = i2 + 93;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return list;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateCta onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateCta sdkTemplateCta = this.footer;
            int i5 = i2 + 31;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return sdkTemplateCta;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onNavigationEvent
        public SdkTemplateReviewed IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.reviewed;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class NanaImagePat implements onExtraCallback {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private final SdkTemplateCta cta;
        private final JsonObject data;
        private final SspSdkEventTracker eventTracker;
        private final String imageUrl;
        private final String overline;
        private final String sdkTemplateId;
        private final String subtitle;
        private final String title;

        static {
            int i = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public NanaImagePat() {
            this((String) null, (SspSdkEventTracker) null, (String) null, (String) null, (String) null, (String) null, (SdkTemplateCta) null, (JsonObject) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NanaImagePat)) {
                return false;
            }
            NanaImagePat nanaImagePat = (NanaImagePat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaImagePat.sdkTemplateId)) {
                int i3 = onNavigationEvent + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.eventTracker, nanaImagePat.eventTracker)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.overline, nanaImagePat.overline)) {
                int i5 = onExtraCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.title, nanaImagePat.title) || !Intrinsics.areEqual(this.subtitle, nanaImagePat.subtitle)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.imageUrl, nanaImagePat.imageUrl)) {
                int i7 = onNavigationEvent + 1;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.cta, nanaImagePat.cta)) {
                return Intrinsics.areEqual(this.data, nanaImagePat.data);
            }
            int i9 = onExtraCallback + 19;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            if (sspSdkEventTracker == null) {
                int i2 = onExtraCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sspSdkEventTracker.hashCode();
            }
            String str = this.overline;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            int iHashCode5 = this.title.hashCode();
            String str2 = this.subtitle;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            int iHashCode7 = this.imageUrl.hashCode();
            SdkTemplateCta sdkTemplateCta = this.cta;
            if (sdkTemplateCta == null) {
                int i4 = onExtraCallback + 81;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = sdkTemplateCta.hashCode();
            }
            JsonObject jsonObject = this.data;
            int iHashCode8 = (((((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
            int i6 = onExtraCallback + 39;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 70 / 0;
            }
            return iHashCode8;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaImagePat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", overline=" + this.overline + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageUrl=" + this.imageUrl + ", cta=" + this.cta + ", data=" + this.data + ")";
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NanaImagePat> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaImagePat$$serializer sdkTemplate$NanaImagePat$$serializer = SdkTemplate$NanaImagePat$$serializer.INSTANCE;
                if (i3 != 0) {
                    return sdkTemplate$NanaImagePat$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ NanaImagePat(int i, String str, SspSdkEventTracker sspSdkEventTracker, String str2, String str3, String str4, String str5, SdkTemplateCta sdkTemplateCta, JsonObject jsonObject, okycx okycxVar) {
            this.sdkTemplateId = (i & 1) == 0 ? "nana-image-pat" : str;
            if ((i & 2) == 0) {
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
            }
            if ((i & 4) == 0) {
                int i2 = onNavigationEvent + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                this.overline = null;
            } else {
                this.overline = str2;
                int i4 = onNavigationEvent + 9;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                int i6 = onExtraCallback + 23;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                this.title = "";
                if (i7 == 0) {
                    throw null;
                }
            } else {
                this.title = str3;
            }
            int i8 = 2 % 2;
            if ((i & 16) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str4;
                int i9 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.imageUrl = "";
            } else {
                this.imageUrl = str5;
            }
            if ((i & 64) == 0) {
                this.cta = null;
                int i10 = 2 % 2;
            } else {
                this.cta = sdkTemplateCta;
            }
            if ((i & 128) == 0) {
                this.data = null;
            } else {
                this.data = jsonObject;
            }
        }

        public NanaImagePat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.overline = str2;
            this.title = str3;
            this.subtitle = str4;
            this.imageUrl = str5;
            this.cta = sdkTemplateCta;
            this.data = jsonObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void IAuthTabCallback(NanaImagePat nanaImagePat, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(nanaImagePat.onExtraCallback(), "nana-image-pat")) {
                vylVar.onExtraCallback(serialDescriptor, 0, nanaImagePat.onExtraCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 1) || nanaImagePat.IAuthTabCallback() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaImagePat.IAuthTabCallback());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || nanaImagePat.onExtraCallbackWithResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, nanaImagePat.onExtraCallbackWithResult());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || (!Intrinsics.areEqual(nanaImagePat.asInterface(), ""))) {
                vylVar.onExtraCallback(serialDescriptor, 3, nanaImagePat.asInterface());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || nanaImagePat.IAuthTabCallbackDefault() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, nanaImagePat.IAuthTabCallbackDefault());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i4 = onExtraCallback + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (!Intrinsics.areEqual(nanaImagePat.onWarmupCompleted(), "")) {
                    vylVar.onExtraCallback(serialDescriptor, 5, nanaImagePat.onWarmupCompleted());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i6 = onNavigationEvent + 41;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                if (nanaImagePat.asBinder() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SdkTemplateCta$$serializer.INSTANCE, nanaImagePat.asBinder());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
                int i8 = onExtraCallback + 17;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (nanaImagePat.onTransact() == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, encryptType4.IAuthTabCallback, nanaImagePat.onTransact());
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = super.onNavigationEvent();
            int i4 = onNavigationEvent + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaImagePat(String str, SspSdkEventTracker sspSdkEventTracker, String str2, String str3, String str4, String str5, SdkTemplateCta sdkTemplateCta, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            SspSdkEventTracker sspSdkEventTracker2;
            String str7;
            String str8;
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 71;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str6 = "nana-image-pat";
            } else {
                str6 = str;
            }
            if ((i & 2) != 0) {
                int i7 = onExtraCallback + 19;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                sspSdkEventTracker2 = null;
            } else {
                sspSdkEventTracker2 = sspSdkEventTracker;
            }
            if ((i & 4) != 0) {
                int i9 = onNavigationEvent + 43;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
                str7 = null;
            } else {
                str7 = str2;
            }
            String str9 = "";
            String str10 = (i & 8) != 0 ? "" : str3;
            if ((i & 16) != 0) {
                int i11 = onNavigationEvent + 107;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                str8 = null;
            } else {
                str8 = str4;
            }
            if ((i & 32) != 0) {
                int i12 = onNavigationEvent + 65;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } else {
                str9 = str5;
            }
            this(str6, sspSdkEventTracker2, str7, str10, str8, str9, (i & 64) != 0 ? null : sdkTemplateCta, (i & 128) == 0 ? jsonObject : null);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 25;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.sdkTemplateId;
            int i4 = i2 + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            SspSdkEventTracker sspSdkEventTracker;
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                sspSdkEventTracker = this.eventTracker;
                int i4 = 34 / 0;
            } else {
                sspSdkEventTracker = this.eventTracker;
            }
            int i5 = i3 + 47;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return sspSdkEventTracker;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallback
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.overline;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.title;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.subtitle;
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.imageUrl;
            int i4 = i3 + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public SdkTemplateCta asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateCta sdkTemplateCta = this.cta;
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            return sdkTemplateCta;
        }

        public JsonObject onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            JsonObject jsonObject = this.data;
            int i5 = i2 + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return jsonObject;
        }
    }

    @liq
    public static final class NanaImageSat implements onExtraCallback {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final SdkTemplateCta cta;
        private final JsonObject data;
        private final SspSdkEventTracker eventTracker;
        private final String imageUrl;
        private final String overline;
        private final String sdkTemplateId;
        private final String subtitle;
        private final String title;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 115;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public NanaImageSat() {
            this((String) null, (SspSdkEventTracker) null, (String) null, (String) null, (String) null, (String) null, (SdkTemplateCta) null, (JsonObject) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NanaImageSat)) {
                return false;
            }
            NanaImageSat nanaImageSat = (NanaImageSat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaImageSat.sdkTemplateId)) {
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.eventTracker, nanaImageSat.eventTracker)) {
                int i4 = onExtraCallbackWithResult + 107;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.overline, nanaImageSat.overline) || !Intrinsics.areEqual(this.title, nanaImageSat.title) || !Intrinsics.areEqual(this.subtitle, nanaImageSat.subtitle) || (!Intrinsics.areEqual(this.imageUrl, nanaImageSat.imageUrl)) || !Intrinsics.areEqual(this.cta, nanaImageSat.cta)) {
                return false;
            }
            if (Intrinsics.areEqual(this.data, nanaImageSat.data)) {
                return true;
            }
            int i6 = onExtraCallback + 65;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
          0x0026: PHI (r1v22 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0026: PHI (r3v3 im.toss.ads_sdk.remote.model.SspSdkEventTracker) = (r3v0 im.toss.ads_sdk.remote.model.SspSdkEventTracker), (r3v5 im.toss.ads_sdk.remote.model.SspSdkEventTracker) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
          0x0024: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            SspSdkEventTracker sspSdkEventTracker;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int iHashCode5;
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int iHashCode6 = 0;
            if (i2 % 2 != 0) {
                iHashCode = this.sdkTemplateId.hashCode();
                sspSdkEventTracker = this.eventTracker;
                iHashCode2 = sspSdkEventTracker == null ? 0 : sspSdkEventTracker.hashCode();
            } else {
                iHashCode = this.sdkTemplateId.hashCode();
                sspSdkEventTracker = this.eventTracker;
                if (sspSdkEventTracker == null) {
                }
            }
            String str = this.overline;
            if (str == null) {
                int i3 = onExtraCallback + 107;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
            }
            int iHashCode7 = this.title.hashCode();
            String str2 = this.subtitle;
            if (str2 == null) {
                int i5 = onExtraCallback + 75;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = str2.hashCode();
            }
            int iHashCode8 = this.imageUrl.hashCode();
            SdkTemplateCta sdkTemplateCta = this.cta;
            if (sdkTemplateCta == null) {
                int i7 = onExtraCallbackWithResult + 55;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = sdkTemplateCta.hashCode();
            }
            JsonObject jsonObject = this.data;
            if (jsonObject != null) {
                int i9 = onExtraCallbackWithResult + 57;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    jsonObject.hashCode();
                    throw null;
                }
                iHashCode6 = jsonObject.hashCode();
            }
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode5) * 31) + iHashCode6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaImageSat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", overline=" + this.overline + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageUrl=" + this.imageUrl + ", cta=" + this.cta + ", data=" + this.data + ")";
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NanaImageSat> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaImageSat$$serializer sdkTemplate$NanaImageSat$$serializer = SdkTemplate$NanaImageSat$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 27;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return sdkTemplate$NanaImageSat$$serializer;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NanaImageSat(int i, String str, SspSdkEventTracker sspSdkEventTracker, String str2, String str3, String str4, String str5, SdkTemplateCta sdkTemplateCta, JsonObject jsonObject, okycx okycxVar) {
            this.sdkTemplateId = (i & 1) == 0 ? "nana-image-sat" : str;
            Object obj = null;
            if ((i & 2) == 0) {
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
                int i2 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i3 = onExtraCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                this.overline = null;
            } else {
                this.overline = str2;
            }
            if ((i & 8) == 0) {
                this.title = "";
                int i5 = onExtraCallbackWithResult + 37;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                }
                if ((i & 16) != 0) {
                    this.subtitle = null;
                    int i6 = 2 % 2;
                } else {
                    this.subtitle = str4;
                }
                if ((i & 32) != 0) {
                    int i7 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    this.imageUrl = "";
                } else {
                    this.imageUrl = str5;
                    int i9 = 2 % 2;
                }
                if ((i & 64) != 0) {
                    int i10 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    this.cta = null;
                    if (i11 == 0) {
                        throw null;
                    }
                } else {
                    this.cta = sdkTemplateCta;
                }
                if ((i & 128) == 0) {
                    this.data = jsonObject;
                    return;
                }
                int i12 = onExtraCallbackWithResult + 21;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                this.data = null;
                if (i13 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.title = str3;
            int i14 = onExtraCallback + 89;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
            if ((i & 16) != 0) {
            }
            if ((i & 32) != 0) {
            }
            if ((i & 64) != 0) {
            }
            if ((i & 128) == 0) {
            }
        }

        public NanaImageSat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.overline = str2;
            this.title = str3;
            this.subtitle = str4;
            this.imageUrl = str5;
            this.cta = sdkTemplateCta;
            this.data = jsonObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(NanaImageSat nanaImageSat, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                int i4 = onExtraCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                    if (!Intrinsics.areEqual(nanaImageSat.onExtraCallback(), "nana-image-sat")) {
                        vylVar.onExtraCallback(serialDescriptor, 0, nanaImageSat.onExtraCallback());
                    }
                } else if (!Intrinsics.areEqual(nanaImageSat.onExtraCallback(), "nana-image-sat")) {
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i6 = onExtraCallbackWithResult + 49;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    nanaImageSat.IAuthTabCallback();
                    throw null;
                }
                if (nanaImageSat.IAuthTabCallback() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaImageSat.IAuthTabCallback());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || nanaImageSat.onExtraCallbackWithResult() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, nanaImageSat.onExtraCallbackWithResult());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i7 = onExtraCallbackWithResult + 49;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 58 / 0;
                    if (!Intrinsics.areEqual(nanaImageSat.asInterface(), "")) {
                        vylVar.onExtraCallback(serialDescriptor, 3, nanaImageSat.asInterface());
                    }
                } else if (!Intrinsics.areEqual(nanaImageSat.asInterface(), "")) {
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || nanaImageSat.IAuthTabCallbackDefault() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, nanaImageSat.IAuthTabCallbackDefault());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 5) || !Intrinsics.areEqual(nanaImageSat.onWarmupCompleted(), "")) {
                vylVar.onExtraCallback(serialDescriptor, 5, nanaImageSat.onWarmupCompleted());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
                int i9 = onExtraCallbackWithResult + 21;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                if (nanaImageSat.asBinder() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SdkTemplateCta$$serializer.INSTANCE, nanaImageSat.asBinder());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || nanaImageSat.IAuthTabCallbackStub() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, encryptType4.IAuthTabCallback, nanaImageSat.IAuthTabCallbackStub());
            }
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                super.onNavigationEvent();
                throw null;
            }
            String strOnNavigationEvent = super.onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return strOnNavigationEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaImageSat(String str, SspSdkEventTracker sspSdkEventTracker, String str2, String str3, String str4, String str5, SdkTemplateCta sdkTemplateCta, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            String str8;
            SdkTemplateCta sdkTemplateCta2;
            String str9 = (i & 1) != 0 ? "nana-image-sat" : str;
            JsonObject jsonObject2 = null;
            SspSdkEventTracker sspSdkEventTracker2 = (i & 2) != 0 ? null : sspSdkEventTracker;
            if ((i & 4) != 0) {
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    jsonObject2.hashCode();
                    throw null;
                }
                str6 = null;
            } else {
                str6 = str2;
            }
            String str10 = "";
            if ((i & 8) != 0) {
                int i3 = onExtraCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str7 = "";
            } else {
                str7 = str3;
            }
            if ((i & 16) != 0) {
                int i6 = onExtraCallback + 19;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                str8 = null;
            } else {
                str8 = str4;
            }
            if ((i & 32) != 0) {
                int i9 = 2 % 2;
            } else {
                str10 = str5;
            }
            if ((i & 64) != 0) {
                int i10 = onExtraCallback + 89;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            if ((i & 128) != 0) {
                int i12 = onExtraCallbackWithResult + 17;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } else {
                jsonObject2 = jsonObject;
            }
            this(str9, sspSdkEventTracker2, str6, str7, str8, str10, sdkTemplateCta2, jsonObject2);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.sdkTemplateId;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int i5 = i3 + 11;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return sspSdkEventTracker;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallback
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.overline;
            int i4 = i2 + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.subtitle;
            int i5 = i3 + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallback
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.imageUrl;
            int i5 = i2 + 7;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public SdkTemplateCta asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 5;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            SdkTemplateCta sdkTemplateCta = this.cta;
            int i4 = i2 + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return sdkTemplateCta;
        }

        public JsonObject IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            JsonObject jsonObject = this.data;
            if (i3 == 0) {
                int i4 = 50 / 0;
            }
            return jsonObject;
        }
    }

    @liq
    public static final class NanaSurveyChoiceSat implements onExtraCallbackWithResult {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final SdkTemplateAdvertiser advertiser;
        private final String creativeId;
        private final SdkTemplateCta cta;
        private final JsonObject data;
        private final SspSdkEventTracker eventTracker;
        private final SdkTemplateQuestionnaire questionnaire;
        private final String reviewed;
        private final String sdkTemplateId;
        private final String subtitle;
        private final String title;

        static {
            int i = onWarmupCompleted + 107;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public NanaSurveyChoiceSat() {
            this((String) null, (SspSdkEventTracker) null, (String) null, (SdkTemplateAdvertiser) null, (String) null, (String) null, (SdkTemplateQuestionnaire) null, (SdkTemplateCta) null, (String) null, (JsonObject) null, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof NanaSurveyChoiceSat)) {
                return false;
            }
            NanaSurveyChoiceSat nanaSurveyChoiceSat = (NanaSurveyChoiceSat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaSurveyChoiceSat.sdkTemplateId) || !Intrinsics.areEqual(this.eventTracker, nanaSurveyChoiceSat.eventTracker)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.creativeId, nanaSurveyChoiceSat.creativeId)) {
                int i7 = onNavigationEvent + 7;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.advertiser, nanaSurveyChoiceSat.advertiser) || !Intrinsics.areEqual(this.title, nanaSurveyChoiceSat.title) || !Intrinsics.areEqual(this.subtitle, nanaSurveyChoiceSat.subtitle) || !Intrinsics.areEqual(this.questionnaire, nanaSurveyChoiceSat.questionnaire) || !Intrinsics.areEqual(this.cta, nanaSurveyChoiceSat.cta)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.reviewed, nanaSurveyChoiceSat.reviewed)) {
                int i9 = onNavigationEvent + 15;
                IAuthTabCallback = i9 % 128;
                return i9 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.data, nanaSurveyChoiceSat.data)) {
                return true;
            }
            int i10 = IAuthTabCallback + 121;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            int iHashCode4 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int iHashCode5 = sspSdkEventTracker == null ? 0 : sspSdkEventTracker.hashCode();
            int iHashCode6 = this.creativeId.hashCode();
            SdkTemplateAdvertiser sdkTemplateAdvertiser = this.advertiser;
            int iHashCode7 = sdkTemplateAdvertiser == null ? 0 : sdkTemplateAdvertiser.hashCode();
            int iHashCode8 = this.title.hashCode();
            String str = this.subtitle;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = IAuthTabCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            SdkTemplateQuestionnaire sdkTemplateQuestionnaire = this.questionnaire;
            if (sdkTemplateQuestionnaire == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = sdkTemplateQuestionnaire.hashCode();
                int i4 = IAuthTabCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            SdkTemplateCta sdkTemplateCta = this.cta;
            if (sdkTemplateCta == null) {
                int i6 = IAuthTabCallback + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = sdkTemplateCta.hashCode();
            }
            String str2 = this.reviewed;
            int iHashCode9 = str2 == null ? 0 : str2.hashCode();
            JsonObject jsonObject = this.data;
            int iHashCode10 = (((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
            int i8 = onNavigationEvent + 95;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return iHashCode10;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaSurveyChoiceSat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", creativeId=" + this.creativeId + ", advertiser=" + this.advertiser + ", title=" + this.title + ", subtitle=" + this.subtitle + ", questionnaire=" + this.questionnaire + ", cta=" + this.cta + ", reviewed=" + this.reviewed + ", data=" + this.data + ")";
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NanaSurveyChoiceSat> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaSurveyChoiceSat$$serializer sdkTemplate$NanaSurveyChoiceSat$$serializer = SdkTemplate$NanaSurveyChoiceSat$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 57 / 0;
                }
                return sdkTemplate$NanaSurveyChoiceSat$$serializer;
            }
        }

        public /* synthetic */ NanaSurveyChoiceSat(int i, String str, SspSdkEventTracker sspSdkEventTracker, String str2, SdkTemplateAdvertiser sdkTemplateAdvertiser, String str3, String str4, SdkTemplateQuestionnaire sdkTemplateQuestionnaire, SdkTemplateCta sdkTemplateCta, String str5, JsonObject jsonObject, okycx okycxVar) {
            this.sdkTemplateId = (i & 1) == 0 ? "nana-survey-choice-sat" : str;
            if ((i & 2) == 0) {
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
            }
            if ((i & 4) == 0) {
                int i2 = onNavigationEvent + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                this.creativeId = "";
                if (i3 == 0) {
                    throw null;
                }
            } else {
                this.creativeId = str2;
                int i4 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.advertiser = null;
                int i5 = IAuthTabCallback + 61;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } else {
                this.advertiser = sdkTemplateAdvertiser;
            }
            if ((i & 16) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 32) == 0) {
                int i7 = onNavigationEvent + 103;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                this.subtitle = null;
                if (i8 == 0) {
                    int i9 = 39 / 0;
                }
            } else {
                this.subtitle = str4;
            }
            if ((i & 64) == 0) {
                this.questionnaire = null;
            } else {
                this.questionnaire = sdkTemplateQuestionnaire;
            }
            if ((i & 128) == 0) {
                this.cta = null;
            } else {
                this.cta = sdkTemplateCta;
            }
            if ((i & 256) == 0) {
                int i10 = IAuthTabCallback + 87;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                this.reviewed = null;
                if (i11 != 0) {
                    int i12 = 53 / 0;
                }
            } else {
                this.reviewed = str5;
            }
            if ((i & 512) != 0) {
                this.data = jsonObject;
                return;
            }
            this.data = null;
            int i13 = IAuthTabCallback + 115;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public NanaSurveyChoiceSat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @NotNull String str2, @Nullable SdkTemplateAdvertiser sdkTemplateAdvertiser, @NotNull String str3, @Nullable String str4, @Nullable SdkTemplateQuestionnaire sdkTemplateQuestionnaire, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable String str5, @Nullable JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.creativeId = str2;
            this.advertiser = sdkTemplateAdvertiser;
            this.title = str3;
            this.subtitle = str4;
            this.questionnaire = sdkTemplateQuestionnaire;
            this.cta = sdkTemplateCta;
            this.reviewed = str5;
            this.data = jsonObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallback(NanaSurveyChoiceSat nanaSurveyChoiceSat, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(nanaSurveyChoiceSat.onExtraCallback(), "nana-survey-choice-sat")) {
                vylVar.onExtraCallback(serialDescriptor, 0, nanaSurveyChoiceSat.onExtraCallback());
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i2 = onNavigationEvent + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    nanaSurveyChoiceSat.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (nanaSurveyChoiceSat.IAuthTabCallback() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaSurveyChoiceSat.IAuthTabCallback());
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
                int i3 = onNavigationEvent + 117;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(nanaSurveyChoiceSat.creativeId, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 2, nanaSurveyChoiceSat.creativeId);
                    int i5 = onNavigationEvent + 81;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || nanaSurveyChoiceSat.advertiser != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, SdkTemplateAdvertiser$$serializer.INSTANCE, nanaSurveyChoiceSat.advertiser);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(nanaSurveyChoiceSat.asInterface(), "")) {
                vylVar.onExtraCallback(serialDescriptor, 4, nanaSurveyChoiceSat.asInterface());
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 5)) || nanaSurveyChoiceSat.IAuthTabCallbackDefault() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, nanaSurveyChoiceSat.IAuthTabCallbackDefault());
            }
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 6)) || nanaSurveyChoiceSat.questionnaire != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SdkTemplateQuestionnaire$$serializer.INSTANCE, nanaSurveyChoiceSat.questionnaire);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || nanaSurveyChoiceSat.asBinder() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, SdkTemplateCta$$serializer.INSTANCE, nanaSurveyChoiceSat.asBinder());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || nanaSurveyChoiceSat.reviewed != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, nanaSurveyChoiceSat.reviewed);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 9) || nanaSurveyChoiceSat.onWarmupCompleted() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, encryptType4.IAuthTabCallback, nanaSurveyChoiceSat.onWarmupCompleted());
            }
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return super.onNavigationEvent();
            }
            super.onNavigationEvent();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaSurveyChoiceSat(String str, SspSdkEventTracker sspSdkEventTracker, String str2, SdkTemplateAdvertiser sdkTemplateAdvertiser, String str3, String str4, SdkTemplateQuestionnaire sdkTemplateQuestionnaire, SdkTemplateCta sdkTemplateCta, String str5, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            SspSdkEventTracker sspSdkEventTracker2;
            String str7;
            SdkTemplateAdvertiser sdkTemplateAdvertiser2;
            String str8;
            SdkTemplateQuestionnaire sdkTemplateQuestionnaire2;
            SdkTemplateCta sdkTemplateCta2;
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str6 = "nana-survey-choice-sat";
            } else {
                str6 = str;
            }
            JsonObject jsonObject2 = null;
            if ((i & 2) != 0) {
                int i3 = onNavigationEvent + 99;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    jsonObject2.hashCode();
                    throw null;
                }
                int i4 = 2 % 2;
                sspSdkEventTracker2 = null;
            } else {
                sspSdkEventTracker2 = sspSdkEventTracker;
            }
            if ((i & 4) != 0) {
                int i5 = 2 % 2;
                str7 = "";
            } else {
                str7 = str2;
            }
            if ((i & 8) != 0) {
                int i6 = IAuthTabCallback + 45;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 0;
                }
                sdkTemplateAdvertiser2 = null;
            } else {
                sdkTemplateAdvertiser2 = sdkTemplateAdvertiser;
            }
            String str9 = (i & 16) == 0 ? str3 : "";
            if ((i & 32) != 0) {
                int i8 = onNavigationEvent + 35;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 13 / 0;
                }
                str8 = null;
            } else {
                str8 = str4;
            }
            if ((i & 64) != 0) {
                int i10 = 2 % 2;
                sdkTemplateQuestionnaire2 = null;
            } else {
                sdkTemplateQuestionnaire2 = sdkTemplateQuestionnaire;
            }
            if ((i & 128) != 0) {
                int i11 = IAuthTabCallback + 85;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    jsonObject2.hashCode();
                    throw null;
                }
                int i12 = 2 % 2;
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            String str10 = (i & 256) != 0 ? null : str5;
            if ((i & 512) != 0) {
                int i13 = onNavigationEvent + 27;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            } else {
                jsonObject2 = jsonObject;
            }
            this(str6, sspSdkEventTracker2, str7, sdkTemplateAdvertiser2, str9, str8, sdkTemplateQuestionnaire2, sdkTemplateCta2, str10, jsonObject2);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.sdkTemplateId;
            int i4 = i2 + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.eventTracker;
            }
            throw null;
        }

        public final SdkTemplateAdvertiser onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateAdvertiser sdkTemplateAdvertiser = this.advertiser;
            int i5 = i2 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return sdkTemplateAdvertiser;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.subtitle;
            int i5 = i3 + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final SdkTemplateQuestionnaire IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateQuestionnaire sdkTemplateQuestionnaire = this.questionnaire;
            int i5 = i2 + 55;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return sdkTemplateQuestionnaire;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public SdkTemplateCta asBinder() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SdkTemplateCta sdkTemplateCta = this.cta;
            int i5 = i2 + 59;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return sdkTemplateCta;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.reviewed;
            int i4 = i2 + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public JsonObject onWarmupCompleted() {
            JsonObject jsonObject;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                jsonObject = this.data;
                int i4 = 24 / 0;
            } else {
                jsonObject = this.data;
            }
            int i5 = i2 + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return jsonObject;
        }
    }

    @liq
    public static final class NanaSurveyButtonSat implements onExtraCallbackWithResult {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final SdkTemplateAdvertiser advertiser;
        private final String creativeId;
        private final SdkTemplateCta cta;
        private final JsonObject data;
        private final SspSdkEventTracker eventTracker;
        private final String reviewed;
        private final String sdkTemplateId;
        private final String subtitle;
        private final String title;

        static {
            int i = onWarmupCompleted + 27;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public NanaSurveyButtonSat() {
            this((String) null, (SspSdkEventTracker) null, (String) null, (SdkTemplateAdvertiser) null, (String) null, (String) null, (SdkTemplateCta) null, (String) null, (JsonObject) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NanaSurveyButtonSat)) {
                int i5 = i2 + 67;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            NanaSurveyButtonSat nanaSurveyButtonSat = (NanaSurveyButtonSat) obj;
            if (!Intrinsics.areEqual(this.sdkTemplateId, nanaSurveyButtonSat.sdkTemplateId) || (!Intrinsics.areEqual(this.eventTracker, nanaSurveyButtonSat.eventTracker))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.creativeId, nanaSurveyButtonSat.creativeId)) {
                int i7 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.advertiser, nanaSurveyButtonSat.advertiser)) {
                int i9 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.title, nanaSurveyButtonSat.title)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.subtitle, nanaSurveyButtonSat.subtitle)) {
                int i11 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.cta, nanaSurveyButtonSat.cta)) {
                return false;
            }
            if (Intrinsics.areEqual(this.reviewed, nanaSurveyButtonSat.reviewed)) {
                return Intrinsics.areEqual(this.data, nanaSurveyButtonSat.data);
            }
            int i13 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i13 % 128;
            return i13 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode5 = this.sdkTemplateId.hashCode();
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int iHashCode6 = 0;
            if (sspSdkEventTracker == null) {
                int i4 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = sspSdkEventTracker.hashCode();
            }
            int iHashCode7 = this.creativeId.hashCode();
            SdkTemplateAdvertiser sdkTemplateAdvertiser = this.advertiser;
            if (sdkTemplateAdvertiser == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = sdkTemplateAdvertiser.hashCode();
                int i6 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            int iHashCode8 = this.title.hashCode();
            String str = this.subtitle;
            if (str == null) {
                int i8 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
            }
            SdkTemplateCta sdkTemplateCta = this.cta;
            if (sdkTemplateCta == null) {
                iHashCode4 = 0;
            } else {
                iHashCode4 = sdkTemplateCta.hashCode();
                int i10 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            String str2 = this.reviewed;
            int iHashCode9 = str2 == null ? 0 : str2.hashCode();
            JsonObject jsonObject = this.data;
            if (jsonObject != null) {
                int i12 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                iHashCode6 = jsonObject.hashCode();
            }
            return (((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NanaSurveyButtonSat(sdkTemplateId=" + this.sdkTemplateId + ", eventTracker=" + this.eventTracker + ", creativeId=" + this.creativeId + ", advertiser=" + this.advertiser + ", title=" + this.title + ", subtitle=" + this.subtitle + ", cta=" + this.cta + ", reviewed=" + this.reviewed + ", data=" + this.data + ")";
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NanaSurveyButtonSat> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                SdkTemplate$NanaSurveyButtonSat$$serializer sdkTemplate$NanaSurveyButtonSat$$serializer = SdkTemplate$NanaSurveyButtonSat$$serializer.INSTANCE;
                int i4 = onExtraCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return sdkTemplate$NanaSurveyButtonSat$$serializer;
            }
        }

        public /* synthetic */ NanaSurveyButtonSat(int i, String str, SspSdkEventTracker sspSdkEventTracker, String str2, SdkTemplateAdvertiser sdkTemplateAdvertiser, String str3, String str4, SdkTemplateCta sdkTemplateCta, String str5, JsonObject jsonObject, okycx okycxVar) {
            if ((i & 1) == 0) {
                int i2 = 2 % 2;
                str = "nana-survey-button-sat";
            }
            this.sdkTemplateId = str;
            if ((i & 2) == 0) {
                this.eventTracker = null;
            } else {
                this.eventTracker = sspSdkEventTracker;
                int i3 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 3;
                } else {
                    int i5 = 2 % 2;
                }
            }
            if ((i & 4) == 0) {
                this.creativeId = "";
            } else {
                this.creativeId = str2;
                int i6 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                this.advertiser = null;
            } else {
                this.advertiser = sdkTemplateAdvertiser;
                int i8 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            }
            if ((i & 16) == 0) {
                this.title = "";
            } else {
                this.title = str3;
            }
            if ((i & 32) == 0) {
                int i10 = onExtraCallbackWithResult;
                int i11 = i10 + 113;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                this.subtitle = null;
                if (i12 != 0) {
                    throw null;
                }
                int i13 = i10 + 107;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 % 2;
                } else {
                    int i15 = 2 % 2;
                }
            } else {
                this.subtitle = str4;
            }
            if ((i & 64) == 0) {
                this.cta = null;
            } else {
                this.cta = sdkTemplateCta;
            }
            if ((i & 128) == 0) {
                this.reviewed = null;
            } else {
                this.reviewed = str5;
            }
            if ((i & 256) != 0) {
                this.data = jsonObject;
                return;
            }
            int i16 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            this.data = null;
        }

        public NanaSurveyButtonSat(@NotNull String str, @Nullable SspSdkEventTracker sspSdkEventTracker, @NotNull String str2, @Nullable SdkTemplateAdvertiser sdkTemplateAdvertiser, @NotNull String str3, @Nullable String str4, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable String str5, @Nullable JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.sdkTemplateId = str;
            this.eventTracker = sspSdkEventTracker;
            this.creativeId = str2;
            this.advertiser = sdkTemplateAdvertiser;
            this.title = str3;
            this.subtitle = str4;
            this.cta = sdkTemplateCta;
            this.reviewed = str5;
            this.data = jsonObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(NanaSurveyButtonSat nanaSurveyButtonSat, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(nanaSurveyButtonSat.onExtraCallback(), "nana-survey-button-sat")) {
                vylVar.onExtraCallback(serialDescriptor, 0, nanaSurveyButtonSat.onExtraCallback());
                int i2 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (nanaSurveyButtonSat.IAuthTabCallback() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, SspSdkEventTracker$$serializer.INSTANCE, nanaSurveyButtonSat.IAuthTabCallback());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(nanaSurveyButtonSat.creativeId, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, nanaSurveyButtonSat.creativeId);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || nanaSurveyButtonSat.advertiser != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, SdkTemplateAdvertiser$$serializer.INSTANCE, nanaSurveyButtonSat.advertiser);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(nanaSurveyButtonSat.asInterface(), "")) {
                vylVar.onExtraCallback(serialDescriptor, 4, nanaSurveyButtonSat.asInterface());
            }
            Object obj = null;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i6 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    nanaSurveyButtonSat.IAuthTabCallbackDefault();
                    obj.hashCode();
                    throw null;
                }
                if (nanaSurveyButtonSat.IAuthTabCallbackDefault() != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, nanaSurveyButtonSat.IAuthTabCallbackDefault());
                }
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 6) || nanaSurveyButtonSat.asBinder() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SdkTemplateCta$$serializer.INSTANCE, nanaSurveyButtonSat.asBinder());
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 7) || nanaSurveyButtonSat.reviewed != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, nanaSurveyButtonSat.reviewed);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 8) || nanaSurveyButtonSat.onWarmupCompleted() != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, encryptType4.IAuthTabCallback, nanaSurveyButtonSat.onWarmupCompleted());
            }
            int i7 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult, im.toss.ads_sdk.remote.model.SdkTemplate
        public /* bridge */ String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = super.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnNavigationEvent;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NanaSurveyButtonSat(String str, SspSdkEventTracker sspSdkEventTracker, String str2, SdkTemplateAdvertiser sdkTemplateAdvertiser, String str3, String str4, SdkTemplateCta sdkTemplateCta, String str5, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            SspSdkEventTracker sspSdkEventTracker2;
            String str6;
            SdkTemplateCta sdkTemplateCta2;
            String str7 = (i & 1) != 0 ? "nana-survey-button-sat" : str;
            JsonObject jsonObject2 = null;
            if ((i & 2) != 0) {
                int i2 = 2 % 2;
                sspSdkEventTracker2 = null;
            } else {
                sspSdkEventTracker2 = sspSdkEventTracker;
            }
            if ((i & 4) != 0) {
                int i3 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                str6 = "";
            } else {
                str6 = str2;
            }
            SdkTemplateAdvertiser sdkTemplateAdvertiser2 = (i & 8) != 0 ? null : sdkTemplateAdvertiser;
            String str8 = (i & 16) == 0 ? str3 : "";
            String str9 = (i & 32) != 0 ? null : str4;
            if ((i & 64) != 0) {
                int i5 = onExtraCallbackWithResult;
                int i6 = i5 + 19;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 65;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
                sdkTemplateCta2 = null;
            } else {
                sdkTemplateCta2 = sdkTemplateCta;
            }
            String str10 = (i & 128) != 0 ? null : str5;
            if ((i & 256) != 0) {
                int i10 = 2 % 2;
            } else {
                jsonObject2 = jsonObject;
            }
            this(str7, sspSdkEventTracker2, str6, sdkTemplateAdvertiser2, str8, str9, sdkTemplateCta2, str10, jsonObject2);
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.sdkTemplateId;
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
            int i5 = i2 + 105;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return sspSdkEventTracker;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SdkTemplateAdvertiser onExtraCallbackWithResult() {
            SdkTemplateAdvertiser sdkTemplateAdvertiser;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                sdkTemplateAdvertiser = this.advertiser;
                int i4 = 38 / 0;
            } else {
                sdkTemplateAdvertiser = this.advertiser;
            }
            int i5 = i2 + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return sdkTemplateAdvertiser;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.subtitle;
            int i5 = i2 + 15;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate.onExtraCallbackWithResult
        public SdkTemplateCta asBinder() {
            SdkTemplateCta sdkTemplateCta;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                sdkTemplateCta = this.cta;
                int i4 = 0 / 0;
            } else {
                sdkTemplateCta = this.cta;
            }
            int i5 = i2 + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return sdkTemplateCta;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.reviewed;
            int i5 = i2 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public JsonObject onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            JsonObject jsonObject = this.data;
            int i5 = i2 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return jsonObject;
        }
    }

    public static final class IAuthTabCallback implements SdkTemplate {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final SspSdkEventTracker IAuthTabCallback;
        private final String onExtraCallback;
        private final String onNavigationEvent;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof im.toss.ads_sdk.remote.model.SdkTemplate.IAuthTabCallback) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, ((im.toss.ads_sdk.remote.model.SdkTemplate.IAuthTabCallback) r6).onExtraCallback) != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            r6 = im.toss.ads_sdk.remote.model.SdkTemplate.IAuthTabCallback.onWarmupCompleted + 65;
            im.toss.ads_sdk.remote.model.SdkTemplate.IAuthTabCallback.onExtraCallbackWithResult = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if ((r6 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 69;
            im.toss.ads_sdk.remote.model.SdkTemplate.IAuthTabCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Unknown(sdkTemplateId=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.onNavigationEvent = "";
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public SspSdkEventTracker IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            SspSdkEventTracker sspSdkEventTracker = this.IAuthTabCallback;
            int i5 = i2 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return sspSdkEventTracker;
        }

        @Override // im.toss.ads_sdk.remote.model.SdkTemplate
        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i2 + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        public static final String NANA_IMAGE_PAT = "nana-image-pat";
        public static final String NANA_IMAGE_SAT = "nana-image-sat";
        public static final String NANA_LIST_BAT = "nana-list-bat";
        public static final String NANA_LIST_PAT = "nana-list-pat";
        public static final String NANA_LIST_SAT = "nana-list-sat";
        public static final String NANA_SURVEY_BUTTON_SAT = "nana-survey-button-sat";
        public static final String NANA_SURVEY_CHOICE_SAT = "nana-survey-choice-sat";
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> SUPPORTED_IDS = CollectionsKt.listOf(new String[]{"nana-list-bat", "nana-list-sat", "nana-list-pat", "nana-image-pat", "nana-image-sat", "nana-survey-choice-sat", "nana-survey-button-sat"});

        private Companion() {
        }

        public final KSerializer<SdkTemplate> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setUserInputEnabled setuserinputenabled = setUserInputEnabled.onExtraCallbackWithResult;
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return setuserinputenabled;
        }

        public final List<String> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            List<String> list = SUPPORTED_IDS;
            int i5 = i3 + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        static {
            int i = onExtraCallbackWithResult + 79;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
