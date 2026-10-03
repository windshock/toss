package viva.republica.toss.network.model.transfer;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.kt;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class BridgeModel {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.BridgeModel$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = BridgeModel.onExtraCallback();
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    public /* synthetic */ BridgeModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnTransact = onTransact();
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnTransact;
    }

    public abstract String IAuthTabCallback();

    public abstract TransferResultPage.Icon onNavigationEvent();

    public abstract String onWarmupCompleted();

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) BridgeModel.onExtraCallbackWithResult().getValue();
            int i4 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer;
        }

        public final KSerializer<BridgeModel> serializer() {
            KSerializer<BridgeModel> kSerializerOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                kSerializerOnNavigationEvent = onNavigationEvent();
                int i3 = 79 / 0;
            } else {
                kSerializerOnNavigationEvent = onNavigationEvent();
            }
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }

    static {
        int i = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private BridgeModel() {
    }

    public /* synthetic */ BridgeModel(int i, okycx okycxVar) {
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    private static final /* synthetic */ KSerializer onTransact() {
        int i = 2 % 2;
        kt ktVar = new kt("viva.republica.toss.network.model.transfer.BridgeModel", Reflection.getOrCreateKotlinClass(BridgeModel.class), new KClass[]{Reflection.getOrCreateKotlinClass(Page.class), Reflection.getOrCreateKotlinClass(StandardTerms.class)}, new KSerializer[]{BridgeModel$Page$$serializer.INSTANCE, BridgeModel$StandardTerms$$serializer.INSTANCE}, new Annotation[0]);
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return ktVar;
    }

    @liq
    public static final class Page extends BridgeModel {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final TransferResultPage.BottomCTALayout bottomCTALayout;
        private final TransferResultPage.Icon icon;
        private final String title;
        private final String titlePrefix;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        static {
            int i = onExtraCallback + 53;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 35 / 0;
            }
        }

        public Page() {
            this((String) null, (String) null, (TransferResultPage.Icon) null, (TransferResultPage.BottomCTALayout) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 43;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof Page)) {
                return false;
            }
            Page page = (Page) obj;
            if (!Intrinsics.areEqual(this.titlePrefix, page.titlePrefix)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.title, page.title)) {
                int i3 = IAuthTabCallback + 1;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.icon, page.icon)) {
                if (Intrinsics.areEqual(this.bottomCTALayout, page.bottomCTALayout)) {
                    return true;
                }
                int i5 = IAuthTabCallback + 121;
                onWarmupCompleted = i5 % 128;
                return i5 % 2 != 0;
            }
            int i6 = onWarmupCompleted;
            int i7 = i6 + 81;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 71;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            String str = this.titlePrefix;
            int iHashCode4 = 0;
            if (str == null) {
                int i2 = onWarmupCompleted + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.title;
            if (str2 == null) {
                int i4 = onWarmupCompleted + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            TransferResultPage.Icon icon = this.icon;
            if (icon == null) {
                int i6 = onWarmupCompleted + 33;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = icon.hashCode();
            }
            TransferResultPage.BottomCTALayout bottomCTALayout = this.bottomCTALayout;
            if (bottomCTALayout != null) {
                int i8 = onWarmupCompleted + 23;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int iHashCode5 = bottomCTALayout.hashCode();
                    int i9 = 6 / 0;
                    iHashCode4 = iHashCode5;
                } else {
                    iHashCode4 = bottomCTALayout.hashCode();
                }
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Page(titlePrefix=" + this.titlePrefix + ", title=" + this.title + ", icon=" + this.icon + ", bottomCTALayout=" + this.bottomCTALayout + ")";
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
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

            public final KSerializer<Page> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 47;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                BridgeModel$Page$$serializer bridgeModel$Page$$serializer = BridgeModel$Page$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return bridgeModel$Page$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Page(int r3, java.lang.String r4, java.lang.String r5, viva.republica.toss.network.model.transfer.TransferResultPage.Icon r6, viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout r7, o.okycx r8) {
            /*
                r2 = this;
                r2.<init>(r3, r8)
                r8 = r3 & 1
                r0 = 0
                r1 = 2
                if (r8 != 0) goto Le
                r2.titlePrefix = r0
                int r4 = r1 % r1
                goto L10
            Le:
                r2.titlePrefix = r4
            L10:
                r4 = r3 & 2
                if (r4 != 0) goto L17
                r2.title = r0
                goto L19
            L17:
                r2.title = r5
            L19:
                r4 = r3 & 4
                if (r4 != 0) goto L35
                int r4 = viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted
                int r5 = r4 + 113
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback = r6
                int r5 = r5 % r1
                r2.icon = r0
                int r4 = r4 + 121
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback = r5
                int r4 = r4 % r1
                if (r4 != 0) goto L32
                goto L41
            L32:
                int r4 = r1 % r1
                goto L41
            L35:
                r2.icon = r6
                int r4 = viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback
                int r4 = r4 + 77
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted = r5
                int r4 = r4 % r1
                goto L32
            L41:
                r3 = r3 & 8
                if (r3 != 0) goto L48
                r2.bottomCTALayout = r0
                return
            L48:
                r2.bottomCTALayout = r7
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted
                int r3 = r3 + 45
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback = r4
                int r3 = r3 % r1
                if (r3 != 0) goto L59
                r3 = 95
                int r3 = r3 / 0
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.BridgeModel.Page.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.transfer.TransferResultPage$Icon, viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout, o.okycx):void");
        }

        public Page(@Nullable String str, @Nullable String str2, @Nullable TransferResultPage.Icon icon, @Nullable TransferResultPage.BottomCTALayout bottomCTALayout) {
            super(null);
            this.titlePrefix = str;
            this.title = str2;
            this.icon = icon;
            this.bottomCTALayout = bottomCTALayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.BridgeModel.Page r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 == 0) goto Lb
                goto L1a
            Lb:
                int r2 = viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted
                int r2 = r2 + 83
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback = r3
                int r2 = r2 % r0
                java.lang.String r2 = r5.onWarmupCompleted()
                if (r2 == 0) goto L23
            L1a:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.onWarmupCompleted()
                r6.onExtraCallbackWithResult(r7, r1, r2, r3)
            L23:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L41
                int r2 = viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback
                int r2 = r2 + 103
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L3c
                java.lang.String r2 = r5.IAuthTabCallback()
                if (r2 == 0) goto L4a
                goto L41
            L3c:
                r5.IAuthTabCallback()
                r5 = 0
                throw r5
            L41:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.IAuthTabCallback()
                r6.onExtraCallbackWithResult(r7, r1, r2, r3)
            L4a:
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                r3 = 3
                if (r2 != 0) goto L5f
                int r2 = viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback
                int r2 = r2 + r3
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted = r4
                int r2 = r2 % r0
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r2 = r5.onNavigationEvent()
                if (r2 == 0) goto L68
            L5f:
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r4 = r5.onNavigationEvent()
                r6.onExtraCallbackWithResult(r7, r0, r2, r4)
            L68:
                boolean r2 = r6.onWarmupCompleted(r7, r3)
                if (r2 != 0) goto L72
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout r2 = r5.bottomCTALayout
                if (r2 == 0) goto L81
            L72:
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout r5 = r5.bottomCTALayout
                r6.onExtraCallbackWithResult(r7, r3, r2, r5)
                int r5 = viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted
                int r5 = r5 + r1
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback = r6
                int r5 = r5 % r0
            L81:
                int r5 = viva.republica.toss.network.model.transfer.BridgeModel.Page.IAuthTabCallback
                int r5 = r5 + 107
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted = r6
                int r5 = r5 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.BridgeModel.Page.onWarmupCompleted(viva.republica.toss.network.model.transfer.BridgeModel$Page, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Page(String str, String str2, TransferResultPage.Icon icon, TransferResultPage.BottomCTALayout bottomCTALayout, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 45 / 0;
                }
                int i4 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i5 = onWarmupCompleted + 47;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i7 = IAuthTabCallback + 5;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                icon = null;
            }
            if ((i & 8) != 0) {
                int i8 = 2 % 2;
                bottomCTALayout = null;
            }
            this(str, str2, icon, bottomCTALayout);
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.titlePrefix;
            int i5 = i2 + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.title;
            int i5 = i2 + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public TransferResultPage.Icon onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 85;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            TransferResultPage.Icon icon = this.icon;
            int i5 = i2 + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
            return icon;
        }

        public final TransferResultPage.BottomCTALayout asInterface() {
            TransferResultPage.BottomCTALayout bottomCTALayout;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                bottomCTALayout = this.bottomCTALayout;
                int i4 = 73 / 0;
            } else {
                bottomCTALayout = this.bottomCTALayout;
            }
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return bottomCTALayout;
        }
    }

    @liq
    public static final class StandardTerms extends BridgeModel {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final TransferResultPage.Icon icon;
        private final String standardTermsId;
        private final String title;
        private final String titlePrefix;

        static {
            int i = onWarmupCompleted + 87;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 70 / 0;
            }
        }

        public StandardTerms() {
            this((String) null, (String) null, (TransferResultPage.Icon) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardTerms)) {
                int i2 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            StandardTerms standardTerms = (StandardTerms) obj;
            if (!Intrinsics.areEqual(this.titlePrefix, standardTerms.titlePrefix)) {
                int i3 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.title, standardTerms.title)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.icon, standardTerms.icon)) {
                int i5 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.standardTermsId, standardTerms.standardTermsId)) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.titlePrefix;
            if (str == null) {
                int i5 = i3 + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i3 + 81;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.title;
            if (str2 == null) {
                int i9 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            TransferResultPage.Icon icon = this.icon;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (icon != null ? icon.hashCode() : 0)) * 31) + this.standardTermsId.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "StandardTerms(titlePrefix=" + this.titlePrefix + ", title=" + this.title + ", icon=" + this.icon + ", standardTermsId=" + this.standardTermsId + ")";
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 52 / 0;
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

            public final KSerializer<StandardTerms> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                BridgeModel$StandardTerms$$serializer bridgeModel$StandardTerms$$serializer = BridgeModel$StandardTerms$$serializer.INSTANCE;
                if (i3 == 0) {
                    return bridgeModel$StandardTerms$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ StandardTerms(int r2, java.lang.String r3, java.lang.String r4, viva.republica.toss.network.model.transfer.TransferResultPage.Icon r5, java.lang.String r6, o.okycx r7) {
            /*
                r1 = this;
                r1.<init>(r2, r7)
                r7 = r2 & 1
                r0 = 0
                if (r7 != 0) goto Lb
                r1.titlePrefix = r0
                goto Ld
            Lb:
                r1.titlePrefix = r3
            Ld:
                r3 = r2 & 2
                r7 = 2
                if (r3 != 0) goto L27
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult
                int r3 = r3 + 65
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback = r4
                int r3 = r3 % r7
                r1.title = r0
                int r4 = r4 + 81
                int r3 = r4 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r3
                int r4 = r4 % r7
                if (r4 != 0) goto L35
                goto L37
            L27:
                r1.title = r4
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult
                int r3 = r3 + 53
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback = r4
                int r3 = r3 % r7
                if (r3 == 0) goto L35
                goto L37
            L35:
                int r3 = r7 % r7
            L37:
                r3 = r2 & 4
                if (r3 != 0) goto L49
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult
                int r3 = r3 + 21
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback = r4
                int r3 = r3 % r7
                r1.icon = r0
                int r3 = r7 % r7
                goto L4b
            L49:
                r1.icon = r5
            L4b:
                r2 = r2 & 8
                if (r2 != 0) goto L54
                java.lang.String r2 = ""
                r1.standardTermsId = r2
                return
            L54:
                r1.standardTermsId = r6
                int r2 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback
                int r2 = r2 + 97
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r3
                int r2 = r2 % r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.transfer.TransferResultPage$Icon, java.lang.String, o.okycx):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardTerms(@Nullable String str, @Nullable String str2, @Nullable TransferResultPage.Icon icon, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str3, "");
            this.titlePrefix = str;
            this.title = str2;
            this.icon = icon;
            this.standardTermsId = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r8.onWarmupCompleted(r9, r1)
                if (r2 != 0) goto L10
                java.lang.String r2 = r7.onWarmupCompleted()
                if (r2 == 0) goto L19
            L10:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r7.onWarmupCompleted()
                r8.onExtraCallbackWithResult(r9, r1, r2, r3)
            L19:
                r2 = 1
                boolean r3 = r8.onWarmupCompleted(r9, r2)
                if (r3 != 0) goto L2f
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback
                int r3 = r3 + 117
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r4
                int r3 = r3 % r0
                java.lang.String r3 = r7.IAuthTabCallback()
                if (r3 == 0) goto L38
            L2f:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r7.IAuthTabCallback()
                r8.onExtraCallbackWithResult(r9, r2, r3, r4)
            L38:
                boolean r3 = r8.onWarmupCompleted(r9, r0)
                r4 = 0
                if (r3 != 0) goto L58
                int r3 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback
                int r3 = r3 + 107
                int r5 = r3 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r5
                int r3 = r3 % r0
                if (r3 == 0) goto L51
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r3 = r7.onNavigationEvent()
                if (r3 == 0) goto L61
                goto L58
            L51:
                r7.onNavigationEvent()
                r4.hashCode()
                throw r4
            L58:
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer r3 = viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r5 = r7.onNavigationEvent()
                r8.onExtraCallbackWithResult(r9, r0, r3, r5)
            L61:
                r3 = 3
                boolean r5 = r8.onWarmupCompleted(r9, r3)
                if (r5 != 0) goto L8a
                int r5 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback
                int r5 = r5 + 27
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r6
                int r5 = r5 % r0
                java.lang.String r6 = ""
                if (r5 != 0) goto L81
                java.lang.String r2 = r7.standardTermsId
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
                r5 = 18
                int r5 = r5 / r1
                if (r2 != 0) goto L8f
                goto L8a
            L81:
                java.lang.String r1 = r7.standardTermsId
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                r1 = r1 ^ r2
                if (r1 == 0) goto L8f
            L8a:
                java.lang.String r7 = r7.standardTermsId
                r8.onExtraCallback(r9, r3, r7)
            L8f:
                int r7 = viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.IAuthTabCallback
                int r7 = r7 + 67
                int r8 = r7 % 128
                viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallbackWithResult = r8
                int r7 = r7 % r0
                if (r7 == 0) goto L9b
                return
            L9b:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.BridgeModel.StandardTerms.onExtraCallback(viva.republica.toss.network.model.transfer.BridgeModel$StandardTerms, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ StandardTerms(String str, String str2, TransferResultPage.Icon icon, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                str2 = null;
            }
            icon = (i & 4) != 0 ? null : icon;
            if ((i & 8) != 0) {
                int i5 = 2 % 2;
                str3 = "";
            }
            this(str, str2, icon, str3);
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                str = this.titlePrefix;
                int i4 = 42 / 0;
            } else {
                str = this.titlePrefix;
            }
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.title;
            }
            throw null;
        }

        @Override // viva.republica.toss.network.model.transfer.BridgeModel
        public TransferResultPage.Icon onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            TransferResultPage.Icon icon = this.icon;
            int i5 = i2 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return icon;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.standardTermsId;
            }
            throw null;
        }
    }
}
