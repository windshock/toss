package im.toss.appsintoss.data.remote.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.encryptType4;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AppsInTossProductResponse$$serializer implements aeu2<AppsInTossProductResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int[] IAuthTabCallback = null;
    public static final AppsInTossProductResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i4 + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        AppsInTossProductResponse$$serializer appsInTossProductResponse$$serializer = new AppsInTossProductResponse$$serializer();
        INSTANCE = appsInTossProductResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.data.remote.model.AppsInTossProductResponse", appsInTossProductResponse$$serializer, 9);
        setanimationsloop.onWarmupCompleted("displayName", false);
        setanimationsloop.onWarmupCompleted("sku", false);
        Object[] objArr = new Object[1];
        a(new int[]{140800549, -797156063, -361232174, -1480167209, 1454054504, 1826773913}, ((byte) KeyEvent.getModifierMetaStateMask()) + 12, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("displayAmount", false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        setanimationsloop.onWarmupCompleted("hint", true);
        Object[] objArr2 = new Object[1];
        a(new int[]{-269096128, -1051550743}, 4 - View.getDefaultSize(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("renewalCycle", true);
        setanimationsloop.onWarmupCompleted("offers", true);
        descriptor = setanimationsloop;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private AppsInTossProductResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy[] lazyArrOnWarmupCompleted = AppsInTossProductResponse.onWarmupCompleted();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(encryptType4.IAuthTabCallback), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[8].getValue())};
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossProductResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        JsonObject jsonObject;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AppsInTossProductResponse.onWarmupCompleted();
        int i5 = 7;
        int i6 = 6;
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            JsonObject jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            str3 = strAsInterface4;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), (Object) null);
            str2 = str9;
            str = str8;
            jsonObject = jsonObject2;
            str4 = strAsInterface5;
            str5 = strAsInterface6;
            i2 = 511;
            str6 = strAsInterface3;
            str7 = strAsInterface2;
        } else {
            boolean z = true;
            int i7 = 0;
            JsonObject jsonObject3 = null;
            List list2 = null;
            String str10 = null;
            String str11 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i6 = 6;
                    case 0:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 7;
                        i6 = 6;
                    case 2:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        i3 = onWarmupCompleted + 103;
                        onExtraCallback = i3 % 128;
                        int i8 = i3 % 2;
                        i5 = 7;
                        i6 = 6;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i7 |= 8;
                        i5 = 7;
                        i6 = 6;
                    case 4:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = 7;
                        i6 = 6;
                    case 5:
                        jsonObject3 = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, jsonObject3);
                        i7 |= 32;
                        i3 = onExtraCallback + 29;
                        onWarmupCompleted = i3 % 128;
                        int i82 = i3 % 2;
                        i5 = 7;
                        i6 = 6;
                    case 6:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str10);
                        i7 |= 64;
                        int i9 = onExtraCallback + 55;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = 7;
                    case 7:
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str11);
                        i7 |= 128;
                    case 8:
                        list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, (jp) lazyArrOnWarmupCompleted[8].getValue(), list2);
                        i7 |= 256;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list2;
            str = str10;
            str2 = str11;
            str3 = strAsInterface;
            str4 = strAsInterface7;
            str5 = strAsInterface8;
            str6 = strAsInterface9;
            str7 = strAsInterface10;
            i2 = i7;
            jsonObject = jsonObject3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppsInTossProductResponse(i2, str7, str6, str3, str4, str5, jsonObject, str, str2, list, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m163deserialize(Decoder decoder) throws UnknownFieldException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossProductResponse appsInTossProductResponseDeserialize = deserialize(decoder);
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
        return appsInTossProductResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossProductResponse appsInTossProductResponse) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appsInTossProductResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppsInTossProductResponse.onNavigationEvent(appsInTossProductResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossProductResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AppsInTossProductResponse.onNavigationEvent(appsInTossProductResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        serialize(encoder, (AppsInTossProductResponse) obj);
        int i5 = onWarmupCompleted + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 3;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 72, 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, i6)), Color.alpha(i6) + 72, 8848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i12++;
                    c = '0';
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i3 = i6;
            iArr5 = iArr6;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 1;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22251), 38 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4034), TextUtils.lastIndexOf("", '0', 0, 0) + 79, 7399 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new int[]{-1575137375, -618391578, -308229877, 241979862, -1173321331, 438801303, -1660958762, 2089020491, -714081220, 1634922269, 513856291, 1233608789, -1769954710, 1605578076, -1823379949, 2039437715, 693676082, -715638673};
    }
}
