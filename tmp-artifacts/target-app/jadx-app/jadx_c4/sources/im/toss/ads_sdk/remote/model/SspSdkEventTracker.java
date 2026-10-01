package im.toss.ads_sdk.remote.model;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.clearRevision;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkEventTracker {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<String> click;
    private final List<String> imp1px;
    private final List<String> vimp;

    public SspSdkEventTracker() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = IAuthTabCallback + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsBinder;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess000 = access000();
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAccess000;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return (KSerializer) onNavigationEvent(-1398633557, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[0], 1398633558, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~i2;
        int i11 = (~(i7 | i10)) | (~(i8 | i3 | i2));
        int i12 = (~(i2 | i7)) | (~(i8 | i10));
        int i13 = i3 + i + i4 + ((-1255669517) * i6) + (533247121 * i5);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i6) + ((-1057882112) * i5) + (1344208896 * i14);
        int i16 = ((i3 * (-122328301)) - 2132886715) + (i * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i6 * (-1196579527)) + (i5 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SspSdkEventTracker)) {
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        SspSdkEventTracker sspSdkEventTracker = (SspSdkEventTracker) obj;
        if (!Intrinsics.areEqual(this.imp1px, sspSdkEventTracker.imp1px)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.vimp, sspSdkEventTracker.vimp)) {
            int i3 = IAuthTabCallback + 121;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.click, sspSdkEventTracker.click)) {
            return true;
        }
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.imp1px.hashCode() << 48) >>> this.vimp.hashCode()) >>> 84) / this.click.hashCode() : (((this.imp1px.hashCode() * 31) + this.vimp.hashCode()) * 31) + this.click.hashCode();
        int i3 = IAuthTabCallback + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkEventTracker(imp1px=" + this.imp1px + ", vimp=" + this.vimp + ", click=" + this.click + ")";
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
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

        public final KSerializer<SspSdkEventTracker> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SspSdkEventTracker$$serializer sspSdkEventTracker$$serializer = SspSdkEventTracker$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return sspSdkEventTracker$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkEventTracker$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                KSerializer kSerializerIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerIAuthTabCallback = SspSdkEventTracker.IAuthTabCallback();
                    int i3 = 42 / 0;
                } else {
                    kSerializerIAuthTabCallback = SspSdkEventTracker.IAuthTabCallback();
                }
                int i4 = onExtraCallbackWithResult + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkEventTracker$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = SspSdkEventTracker.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 37;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkEventTracker$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = SspSdkEventTracker.onExtraCallback();
                int i4 = onExtraCallbackWithResult + 7;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        int i = onNavigationEvent + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SspSdkEventTracker(int i, List list, List list2, List list3, okycx okycxVar) {
        this.imp1px = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.vimp = CollectionsKt.emptyList();
        } else {
            this.vimp = list2;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.click = list3;
            return;
        }
        int i5 = IAuthTabCallback + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        this.click = CollectionsKt.emptyList();
        int i7 = onExtraCallback + 19;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 18 / 0;
        }
    }

    public SspSdkEventTracker(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.imp1px = list;
        this.vimp = list2;
        this.click = list3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(SspSdkEventTracker sspSdkEventTracker, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(sspSdkEventTracker.imp1px, CollectionsKt.emptyList()))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), sspSdkEventTracker.imp1px);
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.areEqual(sspSdkEventTracker.vimp, CollectionsKt.emptyList());
                throw null;
            }
            if (!Intrinsics.areEqual(sspSdkEventTracker.vimp, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), sspSdkEventTracker.vimp);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = IAuthTabCallback + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(sspSdkEventTracker.click, CollectionsKt.emptyList())) {
                vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), sspSdkEventTracker.click);
            }
        }
        int i7 = onExtraCallback + 115;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkEventTracker(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 89 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            list3 = CollectionsKt.emptyList();
            int i7 = onExtraCallback + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        this(list, list2, list3);
    }

    public final List<String> onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.imp1px;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SspSdkEventTracker sspSdkEventTracker = (SspSdkEventTracker) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = sspSdkEventTracker.vimp;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<String> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.click;
        int i4 = i2 + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String onNavigationEvent() {
        Iterator itIAuthTabCallback;
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            itIAuthTabCallback = clearRevision.onNavigationEvent(clearRevision.onNavigationEvent(CollectionsKt.asSequence(this.imp1px), CollectionsKt.asSequence(this.vimp)), CollectionsKt.asSequence(this.click)).IAuthTabCallback();
            int i3 = 47 / 0;
        } else {
            itIAuthTabCallback = clearRevision.onNavigationEvent(clearRevision.onNavigationEvent(CollectionsKt.asSequence(this.imp1px), CollectionsKt.asSequence(this.vimp)), CollectionsKt.asSequence(this.click)).IAuthTabCallback();
        }
        while (true) {
            if (!itIAuthTabCallback.hasNext()) {
                int i4 = IAuthTabCallback + 117;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                next = null;
                break;
            }
            next = itIAuthTabCallback.next();
            if (!StringsKt.isBlank((String) next)) {
                int i6 = onExtraCallback + 105;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        return (String) next;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        return (KSerializer) onNavigationEvent(-1398633557, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[0], 1398633558, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public final List<String> IAuthTabCallbackStub() {
        return (List) onNavigationEvent(185011600, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{this}, -185011600, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }
}
