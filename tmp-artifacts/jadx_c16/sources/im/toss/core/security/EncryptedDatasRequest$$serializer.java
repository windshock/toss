package im.toss.core.security;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
public final /* synthetic */ class EncryptedDatasRequest$$serializer implements aeu2<EncryptedDatasRequest> {
    public static final EncryptedDatasRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4 = s * 2;
        int i5 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i6 = 105 - (i2 * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i5];
            i6 += i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallback();
        EncryptedDatasRequest$$serializer encryptedDatasRequest$$serializer = new EncryptedDatasRequest$$serializer();
        INSTANCE = encryptedDatasRequest$$serializer;
        Object[] objArr = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 43, 5 - View.resolveSizeAndState(0, 0, 0), new char[]{'\f', 16, 0, 14, 15, 4, '\b', 65481, 15, '\n', 14, 14, 65481, 65534, '\n', '\r', 0, 65481, 14, 0, 65534, 16, '\r', 4, 15, 20, 65481, 65504, '\t', 65534, '\r', 20, 11, 15, 0, 65535, 65503, 65532, 15, 65532, 14, 65517, 0}, false, 244 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), encryptedDatasRequest$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 3, -TextUtils.lastIndexOf("", '0', 0), new char[]{65534, '\f', 65528}, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 252, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(1 - Process.getGidForName(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, new char[]{65530, 7}, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 254, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 4, (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, new char[]{65531, 14, 65531, 65534}, false, Color.argb(0, 0, 0, 0) + 245, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EncryptedDatasRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, ImageEncryptedData$$serializer.INSTANCE};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[2] = ImageEncryptedData$$serializer.INSTANCE;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final EncryptedDatasRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        ImageEncryptedData imageEncryptedData;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            imageEncryptedData = (ImageEncryptedData) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ImageEncryptedData$$serializer.INSTANCE, (Object) null);
            str = strAsInterface2;
            str2 = strAsInterface3;
            i = 7;
        } else {
            int i3 = 0;
            String strAsInterface4 = null;
            ImageEncryptedData imageEncryptedData2 = null;
            boolean z = true;
            while (z) {
                int i4 = onExtraCallback + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i3 |= 2;
                    int i6 = IAuthTabCallback + 27;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    imageEncryptedData2 = (ImageEncryptedData) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ImageEncryptedData$$serializer.INSTANCE, imageEncryptedData2);
                    i3 |= 4;
                }
            }
            int i8 = IAuthTabCallback + 119;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            str = strAsInterface4;
            str2 = strAsInterface;
            imageEncryptedData = imageEncryptedData2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EncryptedDatasRequest(i, str, str2, imageEncryptedData, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m55deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        EncryptedDatasRequest encryptedDatasRequestDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return encryptedDatasRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EncryptedDatasRequest encryptedDatasRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(encryptedDatasRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EncryptedDatasRequest.onExtraCallbackWithResult(encryptedDatasRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EncryptedDatasRequest) obj);
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 23 - TextUtils.getOffsetAfter("", 0), 10278 - KeyEvent.keyCodeFromString(""), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), 55 - Color.green(0), 2166 - TextUtils.indexOf((CharSequence) "", '0'), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 103;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 55;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843), 55 - View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onNavigationEvent = 478309030;
    }
}
