package im.toss.features.home.core.local.model.dst.widget;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getDynamicHeight;
import o.getServiceBeans;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer implements aeu2<HomeListRowAttributeLocal.Center.ContentAttribute.Text> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    public static final HomeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        HomeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer homeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer = new HomeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer();
        INSTANCE = homeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Center.ContentAttribute.Text", homeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer, 10);
        setanimationsloop.onWarmupCompleted("id", false);
        Object[] objArr = new Object[1];
        a(new int[]{-537797404, -46295207}, (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("textAlt", false);
        setanimationsloop.onWarmupCompleted("logTextAlt", false);
        setanimationsloop.onWarmupCompleted("fontSize", false);
        setanimationsloop.onWarmupCompleted("fontWeight", false);
        setanimationsloop.onWarmupCompleted("textAlign", false);
        setanimationsloop.onWarmupCompleted("baseColor", false);
        setanimationsloop.onWarmupCompleted("maxLines", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 27;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    private HomeListRowAttributeLocal$Center$ContentAttribute$Text$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Center.ContentAttribute.Text.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), getdynamicheight, lazyArrIAuthTabCallback[5].getValue(), lazyArrIAuthTabCallback[6].getValue(), getwrigglelayout, getdynamicheight, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeListRowAttributeLocal.Center.ContentAttribute.Text deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i2;
        String str;
        String str2;
        String str3;
        getServiceBeans.asBinder asbinder;
        HandlerLocal handlerLocal;
        String str4;
        int i3;
        String str5;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 51;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Center.ContentAttribute.Text.IAuthTabCallback();
        int i8 = 9;
        int i9 = 7;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i10 = onExtraCallback + 57;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
            getServiceBeans.asBinder asbinder2 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), (Object) null);
            getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (getServiceBeans.IAuthTabCallbackDefault) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
            str5 = strAsInterface3;
            iAuthTabCallbackDefault = iAuthTabCallbackDefault2;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, setAppxVersionInWorker.onExtraCallback, (Object) null);
            str = strAsInterface4;
            str3 = str6;
            i = iOnTransact2;
            i3 = iOnTransact;
            asbinder = asbinder2;
            str4 = strAsInterface2;
            str2 = strAsInterface;
            i2 = 1023;
        } else {
            boolean z = true;
            int iOnTransact3 = 0;
            int i12 = 0;
            getServiceBeans.asBinder asbinder3 = null;
            getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault3 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String str7 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            HandlerLocal handlerLocal2 = null;
            int iOnTransact4 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i4 = 2;
                        i8 = 9;
                        i9 = 7;
                    case 0:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i12 |= 1;
                        i4 = 2;
                        i8 = 9;
                        i9 = 7;
                    case 1:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i12 |= 2;
                        i8 = 9;
                        i9 = 7;
                    case 2:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i4);
                        i12 |= 4;
                        i8 = 9;
                        i9 = 7;
                    case 3:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str7);
                        i12 |= 8;
                        i8 = 9;
                        i9 = 7;
                    case 4:
                        iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                        i12 |= 16;
                        i8 = 9;
                    case 5:
                        asbinder3 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), asbinder3);
                        i12 |= 32;
                        i8 = 9;
                    case 6:
                        iAuthTabCallbackDefault3 = (getServiceBeans.IAuthTabCallbackDefault) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), iAuthTabCallbackDefault3);
                        i12 |= 64;
                        int i13 = onExtraCallback + 97;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % i4;
                        i8 = 9;
                    case 7:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i9);
                        i12 |= 128;
                        i8 = 9;
                    case 8:
                        iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 8);
                        i12 |= 256;
                        i8 = 9;
                    case 9:
                        handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                        i12 |= 512;
                        int i15 = onExtraCallbackWithResult + 65;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % i4;
                        i8 = 9;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str8 = str7;
            i = iOnTransact3;
            iAuthTabCallbackDefault = iAuthTabCallbackDefault3;
            i2 = i12;
            str = strAsInterface6;
            str2 = strAsInterface8;
            str3 = str8;
            asbinder = asbinder3;
            String str9 = strAsInterface7;
            handlerLocal = handlerLocal2;
            str4 = str9;
            String str10 = strAsInterface5;
            i3 = iOnTransact4;
            str5 = str10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Center.ContentAttribute.Text(i2, str2, str4, str5, str3, i3, asbinder, iAuthTabCallbackDefault, str, i, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m493deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Center.ContentAttribute.Text textDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return textDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Center.ContentAttribute.Text text) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(text, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Center.ContentAttribute.Text.onNavigationEvent(text, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 65;
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
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Center.ContentAttribute.Text) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i3 = -1469660336;
        char c = '0';
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", c, 0) + 73, TextUtils.indexOf("", "", 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1469660336;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 23;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i7]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 72 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', i5) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $11 + 35;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = $10 + 125;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 22204), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, (ViewConfiguration.getFadingEdgeLength() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4033), 79 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 7398 - ExpandableListView.getPackedPositionGroup(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i19 = $11 + 7;
        $10 = i19 % 128;
        if (i19 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i20 = 23 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = new int[]{1547208774, 919136487, 343047926, 677752502, 926181493, 1961631517, 1457076996, -556374531, 1283836616, -415268737, -86263127, -569509010, -44488278, 1988502282, -1865375811, -488053756, -224121382, 974135157};
    }
}
