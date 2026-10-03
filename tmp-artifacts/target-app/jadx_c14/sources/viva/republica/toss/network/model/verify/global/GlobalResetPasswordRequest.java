package viva.republica.toss.network.model.verify.global;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getMutilBackgroundDrawable;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.global.GlobalResetPasswordRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalResetPasswordRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;
    private final Map<String, String> crossRegionPasswords;
    private final String password;
    private final nativeReadByte passwordFormat;
    private final Map<String, Long> unifiedSessions;

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getwrigglelayout, getwrigglelayout);
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return getmutilbackgrounddrawable;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        getMutilBackgroundDrawable getmutilbackgrounddrawable = new getMutilBackgroundDrawable(getWriggleLayout.onNavigationEvent, oty1.onExtraCallback);
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getmutilbackgrounddrawable;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
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
            return true;
        }
        if (!(obj instanceof GlobalResetPasswordRequest)) {
            return false;
        }
        GlobalResetPasswordRequest globalResetPasswordRequest = (GlobalResetPasswordRequest) obj;
        if (!Intrinsics.areEqual(this.unifiedSessions, globalResetPasswordRequest.unifiedSessions)) {
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.password, globalResetPasswordRequest.password)) {
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.passwordFormat != globalResetPasswordRequest.passwordFormat) {
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.crossRegionPasswords, globalResetPasswordRequest.crossRegionPasswords)) {
            return true;
        }
        int i8 = onNavigationEvent + 61;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.unifiedSessions.hashCode() * 24) % this.password.hashCode()) - 90) % this.passwordFormat.hashCode()) >>> 120) / this.crossRegionPasswords.hashCode() : (((((this.unifiedSessions.hashCode() * 31) + this.password.hashCode()) * 31) + this.passwordFormat.hashCode()) * 31) + this.crossRegionPasswords.hashCode();
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        Map<String, Long> map = this.unifiedSessions;
        String str = this.password;
        nativeReadByte nativereadbyte = this.passwordFormat;
        Map<String, String> map2 = this.crossRegionPasswords;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 43, 50, 24}, true, null, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(map);
        Object[] objArr2 = new Object[1];
        a(new int[]{43, 11, 0, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new int[]{54, 17, 0, 8}, true, new byte[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(nativereadbyte);
        Object[] objArr4 = new Object[1];
        a(new int[]{71, 23, 170, 0}, false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(map2);
        Object[] objArr5 = new Object[1];
        a(new int[]{94, 1, 121, 0}, false, new byte[]{0}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalResetPasswordRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            GlobalResetPasswordRequest$.serializer serializerVar = GlobalResetPasswordRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        onNavigationEvent();
        Companion = new Companion(null);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.global.GlobalResetPasswordRequest$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    GlobalResetPasswordRequest.onWarmupCompleted();
                    throw null;
                }
                KSerializer kSerializerOnWarmupCompleted = GlobalResetPasswordRequest.onWarmupCompleted();
                int i3 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.global.GlobalResetPasswordRequest$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = GlobalResetPasswordRequest.onExtraCallbackWithResult();
                if (i3 == 0) {
                    int i4 = 24 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.verify.global.GlobalResetPasswordRequest$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 31;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = GlobalResetPasswordRequest.onExtraCallback();
                int i4 = IAuthTabCallback + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        int i = onExtraCallbackWithResult + 65;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GlobalResetPasswordRequest(int i, Map map, String str, nativeReadByte nativereadbyte, Map map2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = IAuthTabCallback + 35;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = GlobalResetPasswordRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 92;
            } else {
                descriptor = GlobalResetPasswordRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
        }
        this.unifiedSessions = map;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        if ((i & 8) != 0) {
            this.crossRegionPasswords = map2;
            return;
        }
        this.crossRegionPasswords = access8100.onNavigationEvent();
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public GlobalResetPasswordRequest(@NotNull Map<String, Long> map, @NotNull String str, @NotNull nativeReadByte nativereadbyte, @NotNull Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.unifiedSessions = map;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        this.crossRegionPasswords = map2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GlobalResetPasswordRequest globalResetPasswordRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), globalResetPasswordRequest.unifiedSessions);
        vylVar.onExtraCallback(serialDescriptor, 1, globalResetPasswordRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), globalResetPasswordRequest.passwordFormat);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
                if (Intrinsics.areEqual(globalResetPasswordRequest.crossRegionPasswords, access8100.onNavigationEvent())) {
                    return;
                }
            } else if (Intrinsics.areEqual(globalResetPasswordRequest.crossRegionPasswords, access8100.onNavigationEvent())) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), globalResetPasswordRequest.crossRegionPasswords);
        int i6 = onNavigationEvent + 3;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i7 = $10 + 45;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35283), TextUtils.getCapsMode("", 0, 0) + 35, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    int i8 = $10 + 65;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 65, 16718 - KeyEvent.getDeadChar(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - Process.getGidForName("")), 69 - TextUtils.indexOf((CharSequence) "", '0', 0), 12486 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $11 + 29;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 5 % 3;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{27353, 27369, 27373, 27353, 27338, 27352, 27370, 27375, 27367, 27371, 27371, 27357, 27340, 27368, 27353, 27371, 27353, 27338, 27344, 27357, 27354, 27375, 27344, 27191, 27169, 27371, 27374, 27375, 27349, 27371, 27371, 27353, 27339, 27352, 27353, 27349, 27350, 27349, 27374, 27369, 27156, 27368, 27371, 27216, 27166, 27173, 27198, 27197, 27195, 27197, 27172, 27174, 27142, 27240, 27257, 27197, 27195, 27197, 27172, 27174, 27142, 27240, 27258, 27158, 27172, 27177, 27169, 27198, 27156, 27163, 27173, 27173, 27294, 27301, 27482, 27476, 27477, 27475, 27458, 27467, 27486, 27484, 27480, 27478, 27463, 27468, 27482, 27475, 27473, 27475, 27476, 27483, 27483, 27468, 27167};
    }
}
