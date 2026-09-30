package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.security.EncryptedDatasRequest;
import im.toss.core.security.EncryptedDatasRequest$$serializer;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FaceSelfieVerifyRequest$$serializer implements aeu2<FaceSelfieVerifyRequest> {
    private static char[] IAuthTabCallback;
    public static final FaceSelfieVerifyRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 46;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 105 - (b * 4);
        int i6 = i + 4;
        int i7 = 1 - (i2 * 2);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i6;
            int i10 = (-i6) + i8;
            i3 = i4;
            int i11 = i9;
            i5 = i10;
            i6 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i12 = i6 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i9 = i12;
            i6 = bArr[i12];
            i8 = i13;
            int i102 = (-i6) + i8;
            i3 = i4;
            int i112 = i9;
            i5 = i102;
            i6 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i122 = i6 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            int i1222 = i6 + 1;
            if (i4 == i7) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onWarmupCompleted();
        FaceSelfieVerifyRequest$$serializer faceSelfieVerifyRequest$$serializer = new FaceSelfieVerifyRequest$$serializer();
        INSTANCE = faceSelfieVerifyRequest$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{0, 56, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), faceSelfieVerifyRequest$$serializer, 8);
        Object[] objArr2 = new Object[1];
        a(new int[]{56, 4, 0, 0}, false, new byte[]{0, 0, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new int[]{60, 9, 26, 0}, true, new byte[]{0, 1, 0, 0, 1, 0, 0, 1, 0}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new int[]{69, 14, 198, 0}, false, new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        b(TextUtils.indexOf((CharSequence) "", '0', 0) + 14, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{65529, '\f', 65529, 65500, 65532, 65533, '\f', '\b', 17, '\n', 65531, 6, 65533}, 248 - Process.getGidForName(""), true, objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), false);
        Object[] objArr6 = new Object[1];
        b(11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65535, 14, '\r', 3, 1, 65535, 65516, 65535, 65533, 65531, 0, '\b', 65535, 5, '\t', 65518, '\n', 7, 65535, 65518, '\f'}, TextUtils.indexOf("", "", 0) + 247, true, objArr6);
        setanimationsloop.onWarmupCompleted(((String) objArr6[0]).intern(), false);
        Object[] objArr7 = new Object[1];
        b(1 - ExpandableListView.getPackedPositionChild(0L), 10 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65534, 17, 0, 65535, '\n', 65502, 0, 11, 20, 65519}, 246 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true, objArr7);
        setanimationsloop.onWarmupCompleted(((String) objArr7[0]).intern(), true);
        Object[] objArr8 = new Object[1];
        a(new int[]{83, 7, 0, 6}, true, new byte[]{1, 0, 1, 0, 1, 1, 1}, objArr8);
        setanimationsloop.onWarmupCompleted(((String) objArr8[0]).intern(), false);
        Object[] objArr9 = new Object[1];
        a(new int[]{90, 8, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, objArr9);
        setanimationsloop.onWarmupCompleted(((String) objArr9[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 73;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private FaceSelfieVerifyRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = FaceSelfieVerifyRequest.onNavigationEvent();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[7].getValue());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, EncryptedDatasRequest$$serializer.INSTANCE, getwrigglelayout, kSerializerIAuthTabCallback, getwrigglelayout, kSerializerIAuthTabCallback2};
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FaceSelfieVerifyRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        List list;
        int i;
        String str;
        String str2;
        String str3;
        Integer num;
        EncryptedDatasRequest encryptedDatasRequest;
        String str4;
        char c;
        int i2;
        char c2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 3;
        IAuthTabCallbackStub = i5 % 128;
        String strAsInterface2 = null;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            FaceSelfieVerifyRequest.onNavigationEvent();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = FaceSelfieVerifyRequest.onNavigationEvent();
        int i6 = 6;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            int i7 = IAuthTabCallbackStub + 93;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 1);
            String strAsInterface5 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
            EncryptedDatasRequest encryptedDatasRequest2 = (EncryptedDatasRequest) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, EncryptedDatasRequest$$serializer.INSTANCE, (Object) null);
            String strAsInterface6 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 4);
            Integer num2 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, (Object) null);
            String strAsInterface7 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 6);
            str2 = strAsInterface5;
            encryptedDatasRequest = encryptedDatasRequest2;
            list = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), (Object) null);
            i = 255;
            strAsInterface = strAsInterface7;
            num = num2;
            str3 = strAsInterface6;
            str = strAsInterface4;
            str4 = strAsInterface3;
        } else {
            List list2 = null;
            Integer num3 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            strAsInterface = null;
            boolean z = true;
            int i9 = 0;
            EncryptedDatasRequest encryptedDatasRequest3 = null;
            while (z) {
                int i10 = onWarmupCompleted + 81;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (i11 == 0) {
                    int i12 = 68 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i6 = 6;
                            break;
                        case 0:
                            c2 = 5;
                            strAsInterface8 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                            i9 |= 1;
                            i6 = 6;
                            break;
                        case 1:
                            i3 = 1;
                            c2 = 5;
                            strAsInterface9 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i3);
                            i9 |= 2;
                            i6 = 6;
                            break;
                        case 2:
                            c2 = 5;
                            strAsInterface10 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                            i9 |= 4;
                            i6 = 6;
                            break;
                        case 3:
                            c2 = 5;
                            encryptedDatasRequest3 = (EncryptedDatasRequest) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, EncryptedDatasRequest$$serializer.INSTANCE, encryptedDatasRequest3);
                            i9 |= 8;
                            i6 = 6;
                            break;
                        case 4:
                            i2 = 4;
                            c = 5;
                            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i2);
                            i9 |= 16;
                            i6 = 6;
                            break;
                        case 5:
                            c2 = 5;
                            num3 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, num3);
                            i9 |= 32;
                            int i13 = onWarmupCompleted + 107;
                            IAuthTabCallbackStub = i13 % 128;
                            int i14 = i13 % 2;
                            i6 = 6;
                            break;
                        case 6:
                            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i6);
                            i9 |= 64;
                            break;
                        case 7:
                            list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), list2);
                            i9 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i6 = 6;
                            break;
                        case 0:
                            c2 = 5;
                            strAsInterface8 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                            i9 |= 1;
                            i6 = 6;
                            break;
                        case 1:
                            c2 = 5;
                            i3 = 1;
                            strAsInterface9 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i3);
                            i9 |= 2;
                            i6 = 6;
                            break;
                        case 2:
                            c2 = 5;
                            strAsInterface10 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 2);
                            i9 |= 4;
                            i6 = 6;
                            break;
                        case 3:
                            c2 = 5;
                            encryptedDatasRequest3 = (EncryptedDatasRequest) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 3, EncryptedDatasRequest$$serializer.INSTANCE, encryptedDatasRequest3);
                            i9 |= 8;
                            i6 = 6;
                            break;
                        case 4:
                            c = 5;
                            i2 = 4;
                            strAsInterface2 = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i2);
                            i9 |= 16;
                            i6 = 6;
                            break;
                        case 5:
                            c2 = 5;
                            num3 = (Integer) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, num3);
                            i9 |= 32;
                            int i132 = onWarmupCompleted + 107;
                            IAuthTabCallbackStub = i132 % 128;
                            int i142 = i132 % 2;
                            i6 = 6;
                            break;
                        case 6:
                            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, i6);
                            i9 |= 64;
                            break;
                        case 7:
                            list2 = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnNavigationEvent[7].getValue(), list2);
                            i9 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            list = list2;
            i = i9;
            str = strAsInterface9;
            str2 = strAsInterface10;
            str3 = strAsInterface2;
            num = num3;
            String str5 = strAsInterface8;
            encryptedDatasRequest = encryptedDatasRequest3;
            str4 = str5;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new FaceSelfieVerifyRequest(i, str4, str, str2, encryptedDatasRequest, str3, num, strAsInterface, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m660deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        FaceSelfieVerifyRequest faceSelfieVerifyRequestDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return faceSelfieVerifyRequestDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FaceSelfieVerifyRequest faceSelfieVerifyRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(faceSelfieVerifyRequest, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FaceSelfieVerifyRequest.onWarmupCompleted(faceSelfieVerifyRequest, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(faceSelfieVerifyRequest, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FaceSelfieVerifyRequest.onWarmupCompleted(faceSelfieVerifyRequest, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FaceSelfieVerifyRequest) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i7 = $11 + 79;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i9 = $10 + 11;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i11 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i11]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getTouchSlop() >> 8)), KeyEvent.keyCodeFromString("") + 23, 10277 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i11] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 12843), View.MeasureSpec.getMode(0) + 55, (ViewConfiguration.getTouchSlop() >> 8) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i12 = $11 + 37;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 55, 2167 - TextUtils.getOffsetBefore("", 0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        long j = 0;
        if (cArr != null) {
            int i6 = $10 + 15;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 125;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 36 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 14239 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 35283), ((Process.getThreadPriority(0) + 20) >> 6) + 35, Gravity.getAbsoluteGravity(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                j = 0;
            }
            int i10 = $11 + 39;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i12 = $10 + 123;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 % 2;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 10935), (ViewConfiguration.getTapTimeout() >> 16) + 65, 16718 - ((Process.getThreadPriority(0) + 20) >> 6), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 29, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49467), TextUtils.indexOf((CharSequence) "", '0', 0) + 71, 12487 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{27258, 27173, 27139, 27167, 27199, 27199, 27197, 27166, 27140, 27179, 27181, 27172, 27194, 27197, 27173, 27170, 27166, 27139, 27168, 27174, 27179, 27172, 27174, 27143, 27141, 27176, 27143, 27139, 27168, 27175, 27178, 27174, 27139, 27252, 27165, 27180, 27178, 27154, 27154, 27174, 27175, 27177, 27177, 27155, 27155, 27173, 27171, 27177, 27169, 27179, 27157, 27173, 27197, 27171, 27170, 27197, 27252, 27192, 27182, 27160, 27146, 27341, 27340, 27337, 27189, 27190, 27334, 27328, 27339, 27352, 27495, 27494, 27492, 27500, 27500, 27488, 27489, 27491, 27491, 27474, 27476, 27518, 27517, 27255, 27199, 27169, 27199, 27197, 27196, 27172, 27253, 27170, 27159, 27158, 27175, 27175, 27177, 27198};
        onExtraCallback = 478309048;
    }
}
