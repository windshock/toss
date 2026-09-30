package im.toss.features.credit.data.remote.model;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SubTitle$$serializer implements aeu2<SubTitle> {
    public static final SubTitle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = (b * 3) + 105;
        int i4 = i * 4;
        byte[] bArr = $$a;
        int i5 = (s * 3) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            i3 = (-i3) + i8;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            int i9 = i5;
            i8 = i3;
            i3 = b2;
            i7 = i2 + 1;
            i6 = i9;
            i3 = (-i3) + i8;
            i5 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 1;
        onNavigationEvent();
        SubTitle$$serializer subTitle$$serializer = new SubTitle$$serializer();
        INSTANCE = subTitle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.remote.model.SubTitle", subTitle$$serializer, 2);
        Object[] objArr = new Object[1];
        a(4 - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, new char[]{65524, 7, 3, 3}, false, 231 - (Process.myPid() >> 22), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("color", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private SubTitle$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SubTitle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        String strAsInterface2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            int i7 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = 3;
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i9 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i10 = onExtraCallbackWithResult + 65;
                    int i11 = i10 % 128;
                    IAuthTabCallback = i11;
                    int i12 = i10 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i13 = i11 + 37;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i15 = i11 + 79;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i9 |= 2;
                    } else {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i9 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i9;
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SubTitle(i, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m125deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SubTitle subTitleDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return subTitleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SubTitle subTitle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(subTitle, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SubTitle.IAuthTabCallback(subTitle, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subTitle, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SubTitle.IAuthTabCallback(subTitle, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 54 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SubTitle) obj);
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        float f;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 41;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 35125), 23 - (Process.myPid() >> 22), 10278 - KeyEvent.keyCodeFromString(""), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), 55 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $10 + 23;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getTrimmedLength("")), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 55, 2166 - Process.getGidForName(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                f = 0.0f;
            }
            int i11 = $10 + 113;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = 478308959;
    }
}
