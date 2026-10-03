package viva.republica.toss.network.model.verify.global;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GlobalResetPasswordResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static byte[] onWarmupCompleted;
    private final nativeReadByte currentPasswordFormat;
    private final String internalCert;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.$$c(int, short, short):java.lang.String");
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = asBinder + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GlobalResetPasswordResponse)) {
            int i4 = asBinder + 7;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        GlobalResetPasswordResponse globalResetPasswordResponse = (GlobalResetPasswordResponse) obj;
        if (!Intrinsics.areEqual(this.internalCert, globalResetPasswordResponse.internalCert)) {
            return false;
        }
        if (this.currentPasswordFormat == globalResetPasswordResponse.currentPasswordFormat) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 11;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.internalCert.hashCode();
        return (i3 == 0 ? iHashCode + 42 : iHashCode * 31) + this.currentPasswordFormat.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.internalCert;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-81) - TextUtils.getOffsetBefore("", 0)), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (-303191866) - TextUtils.getTrimmedLength(""), 2020988423 - (Process.myTid() >> 22), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 82, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) ((-8) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) - 303191826, 2020988396 - View.getDefaultSize(0, 0), (-99) - View.MeasureSpec.getSize(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(nativereadbyte);
        Object[] objArr3 = new Object[1];
        a((short) (ExpandableListView.getPackedPositionGroup(0L) + 98), (byte) TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0', 0, 0) - 303191802, 2020988393 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-121) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GlobalResetPasswordResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            GlobalResetPasswordResponse$.serializer serializerVar = GlobalResetPasswordResponse$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        onTransact = 1;
        onWarmupCompleted();
        Companion = new Companion(null);
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                KSerializer kSerializerIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerIAuthTabCallback = GlobalResetPasswordResponse.IAuthTabCallback();
                    int i3 = 12 / 0;
                } else {
                    kSerializerIAuthTabCallback = GlobalResetPasswordResponse.IAuthTabCallback();
                }
                int i4 = onExtraCallback + 17;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = asInterface + 69;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 72 / 0;
        }
    }

    public /* synthetic */ GlobalResetPasswordResponse(int i, String str, nativeReadByte nativereadbyte, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = IAuthTabCallbackDefault + 97;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 2, GlobalResetPasswordResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = asBinder + 63;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 1) == 0) {
            this.internalCert = "";
        } else {
            this.internalCert = str;
        }
        this.currentPasswordFormat = nativereadbyte;
        int i6 = IAuthTabCallbackDefault + 31;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r1
      0x002c: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x002a, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.IAuthTabCallbackDefault
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.asBinder = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            r4 = r4 ^ r2
            if (r4 == r2) goto L22
            goto L2c
        L1a:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L2c
        L22:
            java.lang.String r4 = r6.internalCert
            java.lang.String r5 = ""
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L3a
        L2c:
            java.lang.String r4 = r6.internalCert
            r7.onExtraCallback(r8, r3, r4)
            int r4 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.asBinder
            int r4 = r4 + 39
            int r5 = r4 % 128
            viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.IAuthTabCallbackDefault = r5
            int r4 = r4 % r0
        L3a:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            o.nativeReadByte r6 = r6.currentPasswordFormat
            r7.onNavigationEvent(r8, r2, r1, r6)
            int r6 = viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.asBinder
            int r6 = r6 + 95
            int r7 = r6 % 128
            viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.IAuthTabCallbackDefault = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L55
            r6 = 60
            int r6 = r6 / r3
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.IAuthTabCallback(viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return lazyArr;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.internalCert;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final nativeReadByte onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        int i4 = i3 + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return nativereadbyte;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6 A[PHI: r0
      0x01a6: PHI (r0v9 int) = (r0v8 int), (r0v44 int) binds: [B:45:0x01a4, B:42:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a8 A[PHI: r0
      0x01a8: PHI (r0v41 int) = (r0v8 int), (r0v44 int) binds: [B:45:0x01a4, B:42:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -1235906766;
        IAuthTabCallback = -1538795405;
        onExtraCallback = 600699464;
        onWarmupCompleted = new byte[]{18, 91, 86, 123, 32, 84, 76, 69, 86, 74, 95, 94, -102, 28, 75, 94, 88, 88, 70, 87, 108, 55, 75, 92, 65, 93, 89, 107, 106, 37, 104, 75, 87, 108, 63, 84, 88, 76, 92, 126, -38, 20, -11, 12, 4, 58, -29, -13, 4, 9, 5, 1, 19, 18, -19, 7, 26, -12, 1, 14, 19, 68, -11, 8, 8, 8};
    }
}
