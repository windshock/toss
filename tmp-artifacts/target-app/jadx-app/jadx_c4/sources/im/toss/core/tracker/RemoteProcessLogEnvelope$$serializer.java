package im.toss.core.tracker;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.encryptType4;
import o.getBgColor;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class RemoteProcessLogEnvelope$$serializer implements aeu2<RemoteProcessLogEnvelope> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final RemoteProcessLogEnvelope$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        RemoteProcessLogEnvelope$$serializer remoteProcessLogEnvelope$$serializer = new RemoteProcessLogEnvelope$$serializer();
        INSTANCE = remoteProcessLogEnvelope$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tracker.RemoteProcessLogEnvelope", remoteProcessLogEnvelope$$serializer, 8);
        setanimationsloop.onWarmupCompleted("schema_version", true);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("created_at", false);
        setanimationsloop.onWarmupCompleted("kind", false);
        setanimationsloop.onWarmupCompleted("immediate", true);
        Object[] objArr = new Object[1];
        a(new char[]{1, 0, 5, 3, '\b', 1, 13910}, (byte) (89 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("event_options", true);
        setanimationsloop.onWarmupCompleted("app_log", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 47;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private RemoteProcessLogEnvelope$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = RemoteProcessLogEnvelope.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallback[3].getValue(), getBgColor.IAuthTabCallback, encryptType4.IAuthTabCallback, sp.IAuthTabCallback(RemoteProcessEventLogOptions$$serializer.INSTANCE), sp.IAuthTabCallback(RemoteProcessAppLog$$serializer.INSTANCE)};
        int i4 = asInterface + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final RemoteProcessLogEnvelope deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        RemoteProcessAppLog remoteProcessAppLog;
        int i;
        RemoteProcessEventLogOptions remoteProcessEventLogOptions;
        int i2;
        RemoteProcessLogKind remoteProcessLogKind;
        boolean z;
        String str;
        JsonObject jsonObject;
        String str2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = RemoteProcessLogEnvelope.onExtraCallback();
        int i4 = 7;
        int i5 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onExtraCallbackWithResult + 37;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            RemoteProcessLogKind remoteProcessLogKind2 = (RemoteProcessLogKind) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            JsonObject jsonObject2 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, encryptType4.IAuthTabCallback, (Object) null);
            RemoteProcessEventLogOptions remoteProcessEventLogOptions2 = (RemoteProcessEventLogOptions) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, RemoteProcessEventLogOptions$$serializer.INSTANCE, (Object) null);
            i2 = 255;
            str = strAsInterface2;
            remoteProcessLogKind = remoteProcessLogKind2;
            remoteProcessAppLog = (RemoteProcessAppLog) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, RemoteProcessAppLog$$serializer.INSTANCE, (Object) null);
            remoteProcessEventLogOptions = remoteProcessEventLogOptions2;
            z = zOnExtraCallbackWithResult;
            jsonObject = jsonObject2;
            str2 = strAsInterface;
            i = iOnTransact;
        } else {
            boolean z2 = true;
            int iOnTransact2 = 0;
            int i8 = 0;
            RemoteProcessEventLogOptions remoteProcessEventLogOptions3 = null;
            RemoteProcessAppLog remoteProcessAppLog2 = null;
            RemoteProcessLogKind remoteProcessLogKind3 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            JsonObject jsonObject3 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            while (z2) {
                int i9 = onExtraCallbackWithResult + 5;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i11 = onExtraCallbackWithResult + 73;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        z2 = false;
                        i4 = 7;
                        i5 = 6;
                    case 0:
                        i8 |= 1;
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i4 = 7;
                    case 1:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                        i4 = 7;
                    case 2:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i8 |= 4;
                        i4 = 7;
                    case 3:
                        remoteProcessLogKind3 = (RemoteProcessLogKind) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), remoteProcessLogKind3);
                        i8 |= 8;
                        i4 = 7;
                    case 4:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i8 |= 16;
                        i4 = 7;
                    case 5:
                        jsonObject3 = (JsonObject) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, encryptType4.IAuthTabCallback, jsonObject3);
                        i8 |= 32;
                        int i13 = asInterface + 119;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 7;
                    case 6:
                        remoteProcessEventLogOptions3 = (RemoteProcessEventLogOptions) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, RemoteProcessEventLogOptions$$serializer.INSTANCE, remoteProcessEventLogOptions3);
                        i8 |= 64;
                        int i15 = onExtraCallbackWithResult + 87;
                        asInterface = i15 % 128;
                        int i16 = i15 % 2;
                    case 7:
                        remoteProcessAppLog2 = (RemoteProcessAppLog) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, RemoteProcessAppLog$$serializer.INSTANCE, remoteProcessAppLog2);
                        i8 |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            remoteProcessAppLog = remoteProcessAppLog2;
            i = iOnTransact2;
            String str3 = strAsInterface4;
            remoteProcessEventLogOptions = remoteProcessEventLogOptions3;
            i2 = i8;
            remoteProcessLogKind = remoteProcessLogKind3;
            z = zOnExtraCallbackWithResult2;
            str = str3;
            String str4 = strAsInterface3;
            jsonObject = jsonObject3;
            str2 = str4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RemoteProcessLogEnvelope(i2, i, str2, str, remoteProcessLogKind, z, jsonObject, remoteProcessEventLogOptions, remoteProcessAppLog, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m81deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogEnvelope remoteProcessLogEnvelopeDeserialize = deserialize(decoder);
        int i4 = asInterface + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return remoteProcessLogEnvelopeDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RemoteProcessLogEnvelope remoteProcessLogEnvelope) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(remoteProcessLogEnvelope, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RemoteProcessLogEnvelope.onExtraCallbackWithResult(remoteProcessLogEnvelope, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RemoteProcessLogEnvelope) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 26 - Color.red(0), 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 26 - View.getDefaultSize(0, 0), 23139 - ExpandableListView.getPackedPositionType(0L), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $10 + 13;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent << 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24824), 74 - Color.alpha(0), TextUtils.indexOf("", "", 0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 30, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        int i11 = $11 + 101;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{64963, 64962, 64978, 64965, 64970, 64991, 64983, 64988, 64964};
        IAuthTabCallback = (char) 51242;
    }
}
