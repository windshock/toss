package viva.republica.toss.network.model.login;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalCoreResetPasswordRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Map<String, String> crossRegionPasswords;
    private final String currentPassword;
    private final nativeReadByte currentPasswordFormat;
    private final String password;
    private final nativeReadByte passwordFormat;
    private final String type;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onExtraCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmutilbackgrounddrawable;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return kSerializerAsInterface;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 57;
        viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.type, r6.type) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.password, r6.password) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5.passwordFormat == r6.passwordFormat) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r6 = viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onExtraCallback + 99;
        viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.currentPassword, r6.currentPassword) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r5.currentPasswordFormat == r6.currentPasswordFormat) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.crossRegionPasswords, r6.crossRegionPasswords) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        r6 = viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent + 109;
        viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        return false;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onExtraCallback
            int r2 = r1 + 29
            int r3 = r2 % 128
            viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 92
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest
            if (r2 != 0) goto L25
            int r1 = r1 + 57
            int r6 = r1 % 128
            viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent = r6
            int r1 = r1 % r0
            return r4
        L25:
            viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest r6 = (viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest) r6
            java.lang.String r1 = r5.type
            java.lang.String r2 = r6.type
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            return r4
        L32:
            java.lang.String r1 = r5.password
            java.lang.String r2 = r6.password
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L77
            o.nativeReadByte r1 = r5.passwordFormat
            o.nativeReadByte r2 = r6.passwordFormat
            if (r1 == r2) goto L50
            int r6 = viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onExtraCallback
            int r6 = r6 + 99
            int r1 = r6 % 128
            viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4e
            return r4
        L4e:
            r6 = 0
            throw r6
        L50:
            java.lang.String r1 = r5.currentPassword
            java.lang.String r2 = r6.currentPassword
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r3) goto L5b
            return r4
        L5b:
            o.nativeReadByte r1 = r5.currentPasswordFormat
            o.nativeReadByte r2 = r6.currentPasswordFormat
            if (r1 == r2) goto L62
            return r4
        L62:
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.crossRegionPasswords
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.crossRegionPasswords
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L76
            int r6 = viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onNavigationEvent
            int r6 = r6 + 109
            int r1 = r6 % 128
            viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.onExtraCallback = r1
            int r6 = r6 % r0
            return r4
        L76:
            return r3
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.password.hashCode();
        int iHashCode4 = this.passwordFormat.hashCode();
        String str = this.currentPassword;
        if (str == null) {
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode5 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + this.currentPasswordFormat.hashCode()) * 31) + this.crossRegionPasswords.hashCode();
        int i6 = onNavigationEvent + 75;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalCoreResetPasswordRequest(type=" + this.type + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ", currentPassword=" + this.currentPassword + ", currentPasswordFormat=" + this.currentPasswordFormat + ", crossRegionPasswords=" + this.crossRegionPasswords + ")";
        int i2 = onExtraCallback + 85;
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

        public final KSerializer<GlobalCoreResetPasswordRequest> serializer() {
            GlobalCoreResetPasswordRequest$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = GlobalCoreResetPasswordRequest$.serializer.INSTANCE;
                int i3 = 50 / 0;
            } else {
                serializerVar = GlobalCoreResetPasswordRequest$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return GlobalCoreResetPasswordRequest.IAuthTabCallback();
                }
                GlobalCoreResetPasswordRequest.IAuthTabCallback();
                throw null;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = GlobalCoreResetPasswordRequest.onExtraCallbackWithResult();
                if (i3 != 0) {
                    int i4 = 53 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.login.GlobalCoreResetPasswordRequest$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallback = GlobalCoreResetPasswordRequest.onExtraCallback();
                    int i3 = 51 / 0;
                } else {
                    kSerializerOnExtraCallback = GlobalCoreResetPasswordRequest.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ GlobalCoreResetPasswordRequest(int i, String str, String str2, nativeReadByte nativereadbyte, String str3, nativeReadByte nativereadbyte2, Map map, okycx okycxVar) {
        if (31 != (i & 31)) {
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 31, GlobalCoreResetPasswordRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.type = str;
        this.password = str2;
        this.passwordFormat = nativereadbyte;
        this.currentPassword = str3;
        this.currentPasswordFormat = nativereadbyte2;
        if ((i & 32) == 0) {
            this.crossRegionPasswords = access8100.onNavigationEvent();
            return;
        }
        this.crossRegionPasswords = map;
        int i6 = onNavigationEvent + 29;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public GlobalCoreResetPasswordRequest(@NotNull String str, @NotNull String str2, @NotNull nativeReadByte nativereadbyte, @Nullable String str3, @NotNull nativeReadByte nativereadbyte2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        Intrinsics.checkNotNullParameter(nativereadbyte2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.type = str;
        this.password = str2;
        this.passwordFormat = nativereadbyte;
        this.currentPassword = str3;
        this.currentPasswordFormat = nativereadbyte2;
        this.crossRegionPasswords = map;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GlobalCoreResetPasswordRequest globalCoreResetPasswordRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, globalCoreResetPasswordRequest.type);
        vylVar.onExtraCallback(serialDescriptor, 1, globalCoreResetPasswordRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalCoreResetPasswordRequest.passwordFormat);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, globalCoreResetPasswordRequest.currentPassword);
        vylVar.onNavigationEvent(serialDescriptor, 4, (py) lazyArr[4].getValue(), globalCoreResetPasswordRequest.currentPasswordFormat);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(!Intrinsics.areEqual(globalCoreResetPasswordRequest.crossRegionPasswords, access8100.onNavigationEvent()))) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), globalCoreResetPasswordRequest.crossRegionPasswords);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
