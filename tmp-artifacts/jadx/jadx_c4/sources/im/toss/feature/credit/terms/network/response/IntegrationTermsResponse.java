package im.toss.feature.credit.terms.network.response;

import com.google.android.gms.internal.ads.zzgc;
import im.toss.feature.credit.terms.network.response.IntegrationTermsResponse$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IntegrationTermsResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String agreeButtonText;
    private final String agreeMessage;
    private final String cancelButtonText;
    private final String cancelMessage;
    private final String description;
    private final List<TermsGroupInfoResponse> termsGroupInfo;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.feature.credit.terms.network.response.IntegrationTermsResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IntegrationTermsResponse.IAuthTabCallback();
            }
            IntegrationTermsResponse.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null, null, null, null, null};

    public IntegrationTermsResponse() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = i2 + i3 + i4 + ((-1255669517) * i6) + (533247121 * i5);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i3) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i6) + ((-1057882112) * i5) + (1344208896 * i14);
        int i16 = ((i2 * (-122328301)) - 2132886715) + (i3 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i6 * (-1196579527)) + (i5 * 656595923) + (i14 * 138215424);
        return i15 + ((i16 * i16) * (-833028096)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsBinder = asBinder();
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(TermsGroupInfoResponse$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrationTermsResponse)) {
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 23 / 0;
            }
            return false;
        }
        IntegrationTermsResponse integrationTermsResponse = (IntegrationTermsResponse) obj;
        if (!Intrinsics.areEqual(this.termsGroupInfo, integrationTermsResponse.termsGroupInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, integrationTermsResponse.title)) {
            int i4 = onExtraCallback + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, integrationTermsResponse.description) || !Intrinsics.areEqual(this.agreeMessage, integrationTermsResponse.agreeMessage)) {
            return false;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.cancelMessage, integrationTermsResponse.cancelMessage)) {
            int i6 = IAuthTabCallback;
            int i7 = i6 + 53;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 37;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.agreeButtonText, integrationTermsResponse.agreeButtonText)) {
            int i10 = onExtraCallback + 23;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.cancelButtonText, integrationTermsResponse.cancelButtonText)) {
            return true;
        }
        int i12 = onExtraCallback + 107;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.termsGroupInfo.hashCode();
        String str = this.title;
        if (str == null) {
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.description;
        if (str2 == null) {
            int i4 = IAuthTabCallback + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.agreeMessage;
        if (str3 == null) {
            iHashCode3 = 1;
            int i6 = onExtraCallback + 1;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.cancelMessage;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.agreeButtonText;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.cancelButtonText;
        return (((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IntegrationTermsResponse(termsGroupInfo=" + this.termsGroupInfo + ", title=" + this.title + ", description=" + this.description + ", agreeMessage=" + this.agreeMessage + ", cancelMessage=" + this.cancelMessage + ", agreeButtonText=" + this.agreeButtonText + ", cancelButtonText=" + this.cancelButtonText + ")";
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<IntegrationTermsResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IntegrationTermsResponse$.serializer serializerVar = IntegrationTermsResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IntegrationTermsResponse(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, okycx okycxVar) {
        this.termsGroupInfo = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.title = null;
            if (i3 == 0) {
                int i4 = 90 / 0;
            }
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.description = null;
            int i5 = IAuthTabCallback + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.description = str2;
        }
        if ((i & 8) == 0) {
            int i8 = IAuthTabCallback + 55;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            this.agreeMessage = null;
            if (i9 == 0) {
                int i10 = 56 / 0;
            }
            int i11 = 2 % 2;
        } else {
            this.agreeMessage = str3;
        }
        if ((i & 16) == 0) {
            this.cancelMessage = null;
            int i12 = IAuthTabCallback + 73;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            this.cancelMessage = str4;
        }
        if ((i & 32) == 0) {
            this.agreeButtonText = null;
            int i15 = onExtraCallback + 99;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 4 % 5;
            }
            if ((i & 64) != 0) {
                this.cancelButtonText = null;
                return;
            } else {
                this.cancelButtonText = str6;
                return;
            }
        }
        this.agreeButtonText = str5;
        int i17 = 2 % 2;
        if ((i & 64) != 0) {
        }
    }

    public IntegrationTermsResponse(@NotNull List<TermsGroupInfoResponse> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(list, "");
        this.termsGroupInfo = list;
        this.title = str;
        this.description = str2;
        this.agreeMessage = str3;
        this.cancelMessage = str4;
        this.agreeButtonText = str5;
        this.cancelButtonText = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        IntegrationTermsResponse integrationTermsResponse = (IntegrationTermsResponse) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallback + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
                if (!Intrinsics.areEqual(integrationTermsResponse.termsGroupInfo, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), integrationTermsResponse.termsGroupInfo);
                }
            } else if (!Intrinsics.areEqual(integrationTermsResponse.termsGroupInfo, CollectionsKt.emptyList())) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i6 = onExtraCallback + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (integrationTermsResponse.title != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, integrationTermsResponse.title);
            }
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i8 = onExtraCallback + 73;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                String str = integrationTermsResponse.description;
                obj.hashCode();
                throw null;
            }
            if (integrationTermsResponse.description != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, integrationTermsResponse.description);
                int i9 = IAuthTabCallback + 89;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || integrationTermsResponse.agreeMessage != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, integrationTermsResponse.agreeMessage);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, integrationTermsResponse.cancelMessage);
        } else {
            int i11 = IAuthTabCallback + 107;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                String str2 = integrationTermsResponse.cancelMessage;
                throw null;
            }
            if (integrationTermsResponse.cancelMessage != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || integrationTermsResponse.agreeButtonText != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, integrationTermsResponse.agreeButtonText);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i12 = IAuthTabCallback + 29;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            if (integrationTermsResponse.cancelButtonText != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, integrationTermsResponse.cancelButtonText);
            }
        }
        return null;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IntegrationTermsResponse(List list, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 32 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback;
            int i5 = i4 + 21;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            int i7 = i4 + 93;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 3;
            } else {
                int i9 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str;
        }
        String str10 = (i & 4) != 0 ? null : str2;
        String str11 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i10 = IAuthTabCallback + 67;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            int i12 = 2 % 2;
            str9 = null;
        } else {
            str9 = str5;
        }
        this(list, str7, str10, str11, str8, str9, (i & 64) == 0 ? str6 : null);
    }

    public final List<TermsGroupInfoResponse> asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<TermsGroupInfoResponse> list = this.termsGroupInfo;
        int i4 = i3 + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            str = this.description;
            int i4 = 86 / 0;
        } else {
            str = this.description;
        }
        int i5 = i3 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.agreeMessage;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        IntegrationTermsResponse integrationTermsResponse = (IntegrationTermsResponse) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = integrationTermsResponse.cancelMessage;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.agreeButtonText;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cancelButtonText;
        int i5 = i2 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        return (String) IAuthTabCallback(zzgc.onExtraCallbackWithResult(), new Object[]{this}, -2129281764, 2129281764, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }
}
