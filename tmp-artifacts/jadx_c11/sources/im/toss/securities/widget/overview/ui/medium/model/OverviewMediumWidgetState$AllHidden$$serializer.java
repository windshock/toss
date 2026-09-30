package im.toss.securities.widget.overview.ui.medium.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
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
import o.HostnamesKt;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewMediumWidgetState$AllHidden$$serializer implements aeu2<OverviewMediumWidgetState.AllHidden> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final OverviewMediumWidgetState$AllHidden$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        OverviewMediumWidgetState$AllHidden$$serializer overviewMediumWidgetState$AllHidden$$serializer = new OverviewMediumWidgetState$AllHidden$$serializer();
        INSTANCE = overviewMediumWidgetState$AllHidden$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState.AllHidden", overviewMediumWidgetState$AllHidden$$serializer, 6);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new int[]{-1000353074, 707557479, 944918516, 1278277304}, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("accountKey", true);
        setanimationsloop.onWarmupCompleted("formattedTime", false);
        setanimationsloop.onWarmupCompleted("userName", false);
        setanimationsloop.onWarmupCompleted("userMode", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 21;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
        }
    }

    private OverviewMediumWidgetState$AllHidden$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Lazy[] lazyArr = (Lazy[]) OverviewMediumWidgetState.AllHidden.onWarmupCompleted(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1025124829, -1025124828, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[0]);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArr[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), lazyArr[5].getValue()};
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMediumWidgetState.AllHidden deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        DisplaySetting displaySetting;
        HostnamesKt hostnamesKt;
        float f;
        String str2;
        String str3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Lazy[] lazyArr = (Lazy[]) OverviewMediumWidgetState.AllHidden.onWarmupCompleted(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1025124829, -1025124828, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, new Object[0]);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            DisplaySetting displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), (Object) null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str = str4;
            displaySetting = displaySetting2;
            hostnamesKt = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), (Object) null);
            f = fOnWarmupCompleted;
            str2 = strAsInterface;
            str3 = str5;
            i = 63;
        } else {
            int i5 = 0;
            float fOnWarmupCompleted2 = 0.0f;
            boolean z = true;
            String str6 = null;
            DisplaySetting displaySetting3 = null;
            HostnamesKt hostnamesKt2 = null;
            String strAsInterface2 = null;
            String str7 = null;
            while (z) {
                int i6 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent2 = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent2) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), displaySetting3);
                        i5 |= 1;
                        int i7 = IAuthTabCallback + 91;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        break;
                    case 1:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 4;
                        break;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str7);
                        i5 |= 16;
                        break;
                    case 5:
                        hostnamesKt2 = (HostnamesKt) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), hostnamesKt2);
                        i5 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent2);
                }
            }
            int i9 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            str = str6;
            displaySetting = displaySetting3;
            hostnamesKt = hostnamesKt2;
            f = fOnWarmupCompleted2;
            str2 = strAsInterface2;
            str3 = str7;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMediumWidgetState.AllHidden(i, displaySetting, f, str, str2, str3, hostnamesKt, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m66deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        OverviewMediumWidgetState.AllHidden allHiddenDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return allHiddenDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMediumWidgetState.AllHidden allHidden) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(allHidden, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OverviewMediumWidgetState.AllHidden.onWarmupCompleted(allHidden, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(allHidden, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OverviewMediumWidgetState.AllHidden.onWarmupCompleted(allHidden, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMediumWidgetState.AllHidden) obj);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i5 = -1469660336;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 73 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 8848 - View.MeasureSpec.getMode(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    i5 = -1469660336;
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
            int i9 = $11 + 35;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 113;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', i7, i7)), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 8847 - TextUtils.indexOf((CharSequence) "", '0', i7), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i11++;
                    i3 = 2;
                    i6 = 1;
                    i7 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.blue(0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38, 10301 - View.combineMeasuredStates(0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
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
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - KeyEvent.normalizeMetaState(0)), Color.green(0) + 78, 7397 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallback = new int[]{-2018623966, 1591617878, -457619017, 1079553545, -1211259083, 1126263183, -1902466745, 1722565256, 442321108, -912810000, -565995528, -1635305000, 2032250096, 1070312136, 1268126603, -104494854, -1863337971, -1386244386};
    }
}
