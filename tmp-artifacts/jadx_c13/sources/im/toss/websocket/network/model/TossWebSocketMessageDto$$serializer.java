package im.toss.websocket.network.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GetMotionInteractionState;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class TossWebSocketMessageDto$$serializer implements aeu2<TossWebSocketMessageDto> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final TossWebSocketMessageDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        TossWebSocketMessageDto$$serializer tossWebSocketMessageDto$$serializer = new TossWebSocketMessageDto$$serializer();
        INSTANCE = tossWebSocketMessageDto$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.websocket.network.model.TossWebSocketMessageDto", tossWebSocketMessageDto$$serializer, 4);
        setanimationsloop.onWarmupCompleted("metadata", false);
        setanimationsloop.onWarmupCompleted("service", false);
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 0, 1}, true, new byte[]{1, 1, 1, 0, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new int[]{6, 7, 170, 4}, true, null, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 15;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossWebSocketMessageDto$$serializer() {
    }

    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = sp.IAuthTabCallback(TossWebSocketMessageMetaDto$$serializer.INSTANCE);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) GetMotionInteractionState.onExtraCallback)};
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    @Override // o.jp
    public final TossWebSocketMessageDto deserialize(@NotNull Decoder decoder) {
        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto;
        Object objOnExtraCallbackWithResult;
        int i;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
            boolean z = true;
            String str4 = null;
            tossWebSocketMessageMetaDto = null;
            objOnExtraCallbackWithResult = null;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    tossWebSocketMessageMetaDto = (TossWebSocketMessageMetaDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TossWebSocketMessageMetaDto$$serializer.INSTANCE, tossWebSocketMessageMetaDto);
                    i |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 111;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent == 2) {
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str3);
                        i |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i5 + 95;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, GetMotionInteractionState.onExtraCallback, objOnExtraCallbackWithResult);
                        i |= 8;
                    }
                } else {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                    i |= 2;
                }
            }
            str2 = str4;
            str = str3;
        } else {
            tossWebSocketMessageMetaDto = (TossWebSocketMessageMetaDto) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TossWebSocketMessageMetaDto$$serializer.INSTANCE, null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, null);
            objOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, GetMotionInteractionState.onExtraCallback, null);
            i = 15;
            str = str6;
            str2 = str5;
        }
        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto2 = tossWebSocketMessageMetaDto;
        Object obj = objOnExtraCallbackWithResult;
        int i10 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossWebSocketMessageDto(i10, tossWebSocketMessageMetaDto2, str2, str, obj, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        TossWebSocketMessageDto tossWebSocketMessageDtoDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return tossWebSocketMessageDtoDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossWebSocketMessageDto tossWebSocketMessageDto) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(tossWebSocketMessageDto, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TossWebSocketMessageDto.onExtraCallback(tossWebSocketMessageDto, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossWebSocketMessageDto, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TossWebSocketMessageDto.onExtraCallback(tossWebSocketMessageDto, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (TossWebSocketMessageDto) obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 93 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 35, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 10935), 65 - Color.green(0), 16718 - View.combineMeasuredStates(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i9 = $10 + 13;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 30, (KeyEvent.getMaxKeyCode() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (Process.myPid() >> 22)), 70 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i12, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 85;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i15 = $11 + 65;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{27262, 27177, 27168, 27170, 27168, 27173, 27480, 27501, 27461, 27476, 27456, 27461, 27479};
    }
}
