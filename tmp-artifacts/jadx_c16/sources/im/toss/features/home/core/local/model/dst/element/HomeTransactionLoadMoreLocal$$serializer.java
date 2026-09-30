package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal;
import im.toss.features.home.core.local.model.dst.widget.ButtonLocal$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTransactionLoadMoreLocal$$serializer implements aeu2<HomeTransactionLoadMoreLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final HomeTransactionLoadMoreLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        HomeTransactionLoadMoreLocal$$serializer homeTransactionLoadMoreLocal$$serializer = new HomeTransactionLoadMoreLocal$$serializer();
        INSTANCE = homeTransactionLoadMoreLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeTransactionLoadMoreLocal", homeTransactionLoadMoreLocal$$serializer, 7);
        Object[] objArr = new Object[1];
        a(new int[]{240535468, 1157823965, 57876961, 1606098054}, View.MeasureSpec.getMode(0) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("titleAlt", false);
        setanimationsloop.onWarmupCompleted("logTitleAlt", false);
        setanimationsloop.onWarmupCompleted("loadingTitle", false);
        setanimationsloop.onWarmupCompleted("loadingTitleAlt", false);
        setanimationsloop.onWarmupCompleted("logLoadingTitleAlt", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{1617826676, 1914066487, 1424236276, 1312876129}, 5 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    private HomeTransactionLoadMoreLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(ButtonLocal$.serializer.INSTANCE)};
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeTransactionLoadMoreLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        ButtonLocal buttonLocal;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        String str7 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str = strAsInterface;
            buttonLocal = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, ButtonLocal$.serializer.INSTANCE, (Object) null);
            str3 = str9;
            str4 = strAsInterface4;
            str5 = strAsInterface3;
            str6 = strAsInterface2;
            i = 127;
            str2 = str8;
        } else {
            String strAsInterface5 = null;
            ButtonLocal buttonLocal2 = null;
            String str10 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                    case 1:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 |= 2;
                    case 2:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str7);
                        i4 |= 4;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str10);
                        i4 |= 32;
                    case 6:
                        buttonLocal2 = (ButtonLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, ButtonLocal$.serializer.INSTANCE, buttonLocal2);
                        i4 |= 64;
                        int i7 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 3 / 2;
                        }
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface5;
            str2 = str7;
            buttonLocal = buttonLocal2;
            str3 = str10;
            str4 = strAsInterface6;
            str5 = strAsInterface7;
            str6 = strAsInterface8;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeTransactionLoadMoreLocal homeTransactionLoadMoreLocal = new HomeTransactionLoadMoreLocal(i, str, str6, str2, str5, str4, str3, buttonLocal, (okycx) null);
        int i9 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return homeTransactionLoadMoreLocal;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m392deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeTransactionLoadMoreLocal homeTransactionLoadMoreLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return homeTransactionLoadMoreLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeTransactionLoadMoreLocal homeTransactionLoadMoreLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeTransactionLoadMoreLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeTransactionLoadMoreLocal.onWarmupCompleted(homeTransactionLoadMoreLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeTransactionLoadMoreLocal) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 72, 8848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
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
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $10 + 55;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 72 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6 %= 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i6])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getTrimmedLength("") + 72, Color.green(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i6] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i6++;
                }
                i2 = 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $10 + 83;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (Process.myPid() >> 22)), 39 - ExpandableListView.getPackedPositionType(0L), 10301 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i10 += 39;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i10];
                    try {
                        Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22252), 39 - Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i10++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4033), 78 - ExpandableListView.getPackedPositionType(0L), 7398 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new int[]{-34529652, -1984253713, -1200731098, 2013352468, 1750809882, 1507373493, 1701267425, 1848199006, -141670458, 1228050854, -258913712, -1018533176, 373630559, 2065217642, 1321193696, 228085221, 251467516, 902474668};
    }
}
