package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.ProductDetailHeader$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProductDetailHeader {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final AnimationType animationType;
    private final String description;
    private final String iconUrl;
    private final List<String> title;

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<AnimationType> kSerializerSerializer = AnimationType.Companion.serializer();
        if (i4 == 0) {
            int i5 = 7 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i5 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return kSerializerIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = ~i7;
        int i11 = (~(i8 | i9 | i10)) | (~(i4 | i2));
        int i12 = ~(i7 | i2);
        int i13 = i11 | i12;
        int i14 = ~(i8 | i2);
        int i15 = i12 | i8 | (~(i9 | i10));
        int i16 = i4 + i2 + i3 + (1349231875 * i6) + (1735201104 * i5);
        int i17 = i16 * i16;
        int i18 = ((-413510627) * i4) + 1558183936 + (237349861 * i2) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i15) + ((-88080384) * i3) + ((-1337982976) * i6) + (469762048 * i5) + (1272971264 * i17);
        int i19 = ((i4 * 236314795) - 374860141) + (i2 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i15 * 836) + (i3 * 236313959) + (i6 * (-66979019)) + (i5 * (-1872492752)) + (i17 * (-417333248));
        return i18 + ((i19 * i19) * 639631360) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        KSerializer kSerializerIAuthTabCallbackDefault;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i4 = 50 / 0;
        } else {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        }
        int i5 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.appsintoss.data.remote.model.ProductDetailHeader) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (im.toss.appsintoss.data.remote.model.ProductDetailHeader) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r5.animationType == r6.animationType) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.iconUrl, r6.iconUrl)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r6 = im.toss.appsintoss.data.remote.model.ProductDetailHeader.onNavigationEvent;
        r1 = r6 + 7;
        im.toss.appsintoss.data.remote.model.ProductDetailHeader.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 89;
        im.toss.appsintoss.data.remote.model.ProductDetailHeader.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.description, r6.description) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r6 = im.toss.appsintoss.data.remote.model.ProductDetailHeader.onNavigationEvent + 43;
        im.toss.appsintoss.data.remote.model.ProductDetailHeader.onExtraCallbackWithResult = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if ((r6 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.animationType.hashCode();
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.description;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "ProductDetailHeader(animationType=" + this.animationType + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ")";
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
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

        public final KSerializer<ProductDetailHeader> serializer() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ProductDetailHeader$.serializer serializerVar = ProductDetailHeader$.serializer.INSTANCE;
            int i5 = IAuthTabCallback + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.appsintoss.data.remote.model.ProductDetailHeader$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 45;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    ProductDetailHeader.onExtraCallbackWithResult();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallbackWithResult = ProductDetailHeader.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 17;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.appsintoss.data.remote.model.ProductDetailHeader$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                KSerializer kSerializerOnWarmupCompleted = ProductDetailHeader.onWarmupCompleted();
                int i5 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return kSerializerOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null};
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ProductDetailHeader(int i2, AnimationType animationType, String str, List list, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 6;
        if (6 != (i2 & 6)) {
            int i4 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                descriptor = ProductDetailHeader$.serializer.INSTANCE.getDescriptor();
                i3 = 20;
            } else {
                descriptor = ProductDetailHeader$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i2, i3, descriptor);
        }
        if ((i2 & 1) == 0) {
            animationType = AnimationType.NONE;
            int i5 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.animationType = animationType;
        this.iconUrl = str;
        this.title = list;
        if ((i2 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
    }

    public ProductDetailHeader(@NotNull AnimationType animationType, @NotNull String str, @NotNull List<String> list, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(animationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.animationType = animationType;
        this.iconUrl = str;
        this.title = list;
        this.description = str2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 25;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i6 = i4 + 91;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return lazyArr;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ProductDetailHeader productDetailHeader = (ProductDetailHeader) objArr[0];
        vyl vylVar = (vyl) objArr[1];
        SerialDescriptor serialDescriptor = (SerialDescriptor) objArr[2];
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || productDetailHeader.animationType != AnimationType.NONE) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), productDetailHeader.animationType);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, productDetailHeader.iconUrl);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), productDetailHeader.title);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i5 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
                if (productDetailHeader.description == null) {
                    return null;
                }
            } else if (productDetailHeader.description == null) {
                return null;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, productDetailHeader.description);
        return null;
    }

    public final AnimationType onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        AnimationType animationType = this.animationType;
        int i6 = i4 + 37;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return animationType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        String str = this.iconUrl;
        int i6 = i4 + 83;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ProductDetailHeader productDetailHeader = (ProductDetailHeader) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        List<String> list = productDetailHeader.title;
        if (i5 == 0) {
            int i6 = 14 / 0;
        }
        int i7 = i4 + 35;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.description;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ProductDetailHeader productDetailHeader, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onWarmupCompleted(1576662429, new Object[]{productDetailHeader, vylVar, serialDescriptor}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1576662429, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent);
    }

    public final List<String> onTransact() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (List) onWarmupCompleted(920411578, new Object[]{this}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -920411577, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent);
    }
}
