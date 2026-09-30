package im.toss.tosssecurities.widget.watchlist.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$Maintenance$$serializer implements aeu2<WatchlistWidgetState.Maintenance> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char[] IAuthTabCallback = null;
    public static final WatchlistWidgetState$Maintenance$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 27;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        WatchlistWidgetState$Maintenance$$serializer watchlistWidgetState$Maintenance$$serializer = new WatchlistWidgetState$Maintenance$$serializer();
        INSTANCE = watchlistWidgetState$Maintenance$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.Maintenance", watchlistWidgetState$Maintenance$$serializer, 2);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new char[]{3, 1, 2, 0, 13880}, (byte) ((Process.myPid() >> 22) + 61), 4 - ExpandableListView.getPackedPositionChild(0L), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 9;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private WatchlistWidgetState$Maintenance$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{WatchlistWidgetState.Maintenance.IAuthTabCallback()[0].getValue(), dj3.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[1] = WatchlistWidgetState.Maintenance.IAuthTabCallback()[1].getValue();
        kSerializerArr[1] = dj3.onWarmupCompleted;
        return kSerializerArr;
    }

    @Override // o.jp
    public final WatchlistWidgetState.Maintenance deserialize(@NotNull Decoder decoder) {
        int i;
        DisplaySetting displaySetting;
        float fOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = WatchlistWidgetState.Maintenance.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            int i3 = asBinder + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            int i5 = onExtraCallback + 93;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting2 = null;
            boolean z = true;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = asBinder + 109;
                    int i9 = i8 % 128;
                    onExtraCallback = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i11 = i9 + 13;
                    asBinder = i11 % 128;
                    int i12 = i11 % 2;
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                    i7 |= 2;
                    int i13 = onExtraCallback + 113;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), displaySetting2);
                    i7 |= 1;
                }
            }
            i = i7;
            displaySetting = displaySetting2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.Maintenance(i, displaySetting, fOnWarmupCompleted, (okycx) null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.Maintenance maintenanceDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return maintenanceDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.Maintenance maintenance) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(maintenance, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WatchlistWidgetState.Maintenance.onNavigationEvent(maintenance, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(maintenance, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WatchlistWidgetState.Maintenance.onNavigationEvent(maintenance, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 41;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.Maintenance) obj);
        int i4 = onExtraCallback + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, Color.blue(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 26 - (ViewConfiguration.getTapTimeout() >> 16), 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i9 = $10 + 61;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i11 = $11 + 45;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent >> 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i12 = $11 + 77;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (KeyEvent.getMaxKeyCode() >> 16)), 74 - Color.red(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i14 = $10 + 19;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 31, KeyEvent.getDeadChar(0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                                } else {
                                    int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i21 = 0;
        while (i21 < i) {
            int i22 = $10 + 9;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr4[i21] = (char) (cArr4[i21] ^ 5548);
                i21 += 50;
            } else {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                i21++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{64963, 64978, 64987, 64991};
        onExtraCallbackWithResult = (char) 51243;
    }
}
