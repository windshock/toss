package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.BaseListRowLocal;
import java.lang.reflect.Method;
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
import o.aeu2;
import o.getDynamicHeight;
import o.getServiceBeans;
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
public final /* synthetic */ class BaseListRowLocal$Left$Text$$serializer implements aeu2<BaseListRowLocal.Left.Text> {
    public static final BaseListRowLocal$Left$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        int i3 = 4 - (s * 3);
        int i4 = 105 - (s2 * 2);
        int i5 = (s3 * 2) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i3;
            int i8 = i7 + 1;
            int i9 = (-i3) + i6;
            i = i2;
            i4 = i9;
            i3 = i8;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = i4;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i10;
            int i82 = i7 + 1;
            int i92 = (-i3) + i6;
            i = i2;
            i4 = i92;
            i3 = i82;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return serialDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 119;
        $11 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            c = '0';
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 23, 10278 - Color.red(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2168 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i6 = $11 + 53;
                $10 = i6 % 128;
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
            int i11 = $11 + 81;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i13 = $10 + 77;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 12843), TextUtils.indexOf("", c) + 56, 2167 - (KeyEvent.getMaxKeyCode() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                c = '0';
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static {
        onExtraCallback = 1;
        onExtraCallbackWithResult();
        BaseListRowLocal$Left$Text$$serializer baseListRowLocal$Left$Text$$serializer = new BaseListRowLocal$Left$Text$$serializer();
        INSTANCE = baseListRowLocal$Left$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BaseListRowLocal.Left.Text", baseListRowLocal$Left$Text$$serializer, 6);
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, -TextUtils.lastIndexOf("", '0', 0), new char[]{3, 3, 7, 65524}, true, 309 - Drawable.resolveOpacity(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("textAlt", false);
        setanimationsloop.onWarmupCompleted("logTextAlt", false);
        setanimationsloop.onWarmupCompleted("fontSize", false);
        setanimationsloop.onWarmupCompleted("fontWeight", false);
        setanimationsloop.onWarmupCompleted("baseColor", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 101;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    private BaseListRowLocal$Left$Text$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = BaseListRowLocal.Left.Text.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), getDynamicHeight.onWarmupCompleted, lazyArrOnExtraCallback[4].getValue(), getwrigglelayout};
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BaseListRowLocal.Left.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        getServiceBeans.asBinder asbinder;
        String strAsInterface;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = BaseListRowLocal.Left.Text.onExtraCallback();
        int i4 = 5;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
            str2 = str5;
            asbinder = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), (Object) null);
            str = strAsInterface2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            i = iOnTransact;
            str3 = str4;
            i2 = 63;
        } else {
            int i5 = onWarmupCompleted + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            boolean z = true;
            int iOnTransact2 = 0;
            getServiceBeans.asBinder asbinder2 = null;
            String strAsInterface3 = null;
            String str6 = null;
            String str7 = null;
            String strAsInterface4 = null;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 5;
                    case 0:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        i4 = 5;
                    case 1:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                        i7 |= 2;
                        int i8 = IAuthTabCallback + 85;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = 5;
                    case 2:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str6);
                        i7 |= 4;
                    case 3:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                        i7 |= 8;
                    case 4:
                        asbinder2 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[4].getValue(), asbinder2);
                        i7 |= 16;
                    case 5:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i7 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            asbinder = asbinder2;
            strAsInterface = strAsInterface3;
            str = strAsInterface4;
            i = iOnTransact2;
            i2 = i7;
            String str8 = str7;
            str2 = str6;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BaseListRowLocal.Left.Text(i2, str, str3, str2, i, asbinder, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m295deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BaseListRowLocal.Left.Text text) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(text, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BaseListRowLocal.Left.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 91 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(text, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            BaseListRowLocal.Left.Text.onExtraCallbackWithResult(text, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BaseListRowLocal.Left.Text) obj);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = IAuthTabCallback + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 478309101;
    }
}
