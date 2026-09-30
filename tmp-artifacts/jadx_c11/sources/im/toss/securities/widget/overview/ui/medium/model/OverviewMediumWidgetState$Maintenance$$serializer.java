package im.toss.securities.widget.overview.ui.medium.model;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewMediumWidgetState$Maintenance$$serializer implements aeu2<OverviewMediumWidgetState.Maintenance> {
    public static final int $stable;
    public static final OverviewMediumWidgetState$Maintenance$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 142;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, int i3) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i * 4;
        int i6 = i2 + 109;
        int i7 = (i3 * 4) + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            i6 = i5;
            i7++;
            i6 += i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i7];
            i7++;
            i6 += i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        onExtraCallback();
        OverviewMediumWidgetState$Maintenance$$serializer overviewMediumWidgetState$Maintenance$$serializer = new OverviewMediumWidgetState$Maintenance$$serializer();
        INSTANCE = overviewMediumWidgetState$Maintenance$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState.Maintenance", overviewMediumWidgetState$Maintenance$$serializer, 2);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a((char) (View.getDefaultSize(0, 0) + 52447), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54891429, new char[]{42456, 32774, 13482, 6206, 23318}, new char[]{0, 0, 0, 0}, new char[]{42637, 17811, 57091, 10956}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 107;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OverviewMediumWidgetState$Maintenance$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {OverviewMediumWidgetState.Maintenance.IAuthTabCallback()[0].getValue(), dj3.onWarmupCompleted};
        int i4 = IAuthTabCallbackDefault + 19;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMediumWidgetState.Maintenance deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        DisplaySetting displaySetting;
        float fOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = OverviewMediumWidgetState.Maintenance.IAuthTabCallback();
        okycx okycxVar = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 79;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            i = 3;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), displaySetting2);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = IAuthTabCallbackDefault + 51;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                    i5 |= 2;
                }
            }
            displaySetting = displaySetting2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMediumWidgetState.Maintenance(i, displaySetting, fOnWarmupCompleted, okycxVar);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m69deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        OverviewMediumWidgetState.Maintenance maintenanceDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return maintenanceDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMediumWidgetState.Maintenance maintenance) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(maintenance, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewMediumWidgetState.Maintenance.onNavigationEvent(maintenance, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMediumWidgetState.Maintenance) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i5));
                    int i8 = 44 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1451;
                    byte b = (byte) i5;
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i8, packedPositionGroup, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49122), 44 - KeyEvent.normalizeMetaState(i5), 1494 - TextUtils.indexOf("", "", i5), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 23972), 49 - ImageFormat.getBitsPerPixel(0), 22939 - ExpandableListView.getPackedPositionGroup(0L), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf("", "") + 29, 12577 - Gravity.getAbsoluteGravity(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i9 = $11 + 117;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            i3 = i2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallback() {
        onExtraCallback = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onWarmupCompleted = (char) 51957;
    }
}
