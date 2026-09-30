package im.toss.features.home.core.remote.model.asset.home;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.features.home.core.remote.model.asset.home.AssetOtherHome;
import im.toss.features.home.core.remote.model.dst.eventlog.EventLogResponse;
import im.toss.features.home.core.remote.model.dst.handler.HandlerResponse;
import im.toss.features.home.core.remote.model.dst.widget.ImageSourceResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TBPermissionHelper;
import o.aeu2;
import o.getSpecificKey;
import o.getWriggleLayout;
import o.okycx;
import o.openSetting;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherHome$BottomButton$Button$$serializer implements aeu2<AssetOtherHome.BottomButton.Button> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final AssetOtherHome$BottomButton$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        AssetOtherHome$BottomButton$Button$$serializer assetOtherHome$BottomButton$Button$$serializer = new AssetOtherHome$BottomButton$Button$$serializer();
        INSTANCE = assetOtherHome$BottomButton$Button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.asset.home.AssetOtherHome.BottomButton.Button", assetOtherHome$BottomButton$Button$$serializer, 5);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("icon", false);
        Object[] objArr = new Object[1];
        a(new char[]{23633, 60025, 12335, 32506}, Color.alpha(0) + 46649, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 49;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AssetOtherHome$BottomButton$Button$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(getSpecificKey.IAuthTabCallback), sp.IAuthTabCallback(TextContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(openSetting.IAuthTabCallback), sp.IAuthTabCallback(TBPermissionHelper.onExtraCallbackWithResult)};
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AssetOtherHome.BottomButton.Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HandlerResponse handlerResponse;
        EventLogResponse eventLogResponse;
        TextContentResponse textContentResponse;
        String str;
        ImageSourceResponse imageSourceResponse;
        int i;
        int iOnNavigationEvent;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        EventLogResponse eventLogResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onWarmupCompleted + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            ImageSourceResponse imageSourceResponse2 = (ImageSourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSpecificKey.IAuthTabCallback, (Object) null);
            textContentResponse = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, (Object) null);
            str = str2;
            eventLogResponse = (EventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, openSetting.IAuthTabCallback, (Object) null);
            handlerResponse = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, (Object) null);
            imageSourceResponse = imageSourceResponse2;
            i = 31;
        } else {
            boolean z = true;
            int i7 = 0;
            HandlerResponse handlerResponse2 = null;
            TextContentResponse textContentResponse2 = null;
            String str3 = null;
            ImageSourceResponse imageSourceResponse3 = null;
            while (z) {
                int i8 = onNavigationEvent + 105;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i9 = 60 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    }
                    i2 = onNavigationEvent + 85;
                    int i10 = i2 % 128;
                    onWarmupCompleted = i10;
                    if (i2 % 2 == 0) {
                        int i11 = 72 / 0;
                        if (iOnNavigationEvent == 0) {
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                            i7 |= 1;
                        }
                        i3 = i10 + 39;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (iOnNavigationEvent == 0) {
                                imageSourceResponse3 = (ImageSourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSpecificKey.IAuthTabCallback, imageSourceResponse3);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent != 2) {
                                textContentResponse2 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, textContentResponse2);
                                i7 |= 4;
                            } else if (iOnNavigationEvent == 3) {
                                eventLogResponse2 = (EventLogResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, openSetting.IAuthTabCallback, eventLogResponse2);
                                i7 |= 8;
                                int i12 = onNavigationEvent + 31;
                                onWarmupCompleted = i12 % 128;
                                int i13 = i12 % 2;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                handlerResponse2 = (HandlerResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, TBPermissionHelper.onExtraCallbackWithResult, handlerResponse2);
                                i7 |= 16;
                            }
                        } else {
                            if (iOnNavigationEvent == 1) {
                                imageSourceResponse3 = (ImageSourceResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getSpecificKey.IAuthTabCallback, imageSourceResponse3);
                                i7 |= 2;
                            }
                            if (iOnNavigationEvent != 2) {
                            }
                        }
                    } else {
                        if (iOnNavigationEvent == 0) {
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str3);
                            i7 |= 1;
                        }
                        i3 = i10 + 39;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                        }
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    }
                    i2 = onNavigationEvent + 85;
                    int i102 = i2 % 128;
                    onWarmupCompleted = i102;
                    if (i2 % 2 == 0) {
                    }
                }
            }
            int i14 = onNavigationEvent + 55;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            handlerResponse = handlerResponse2;
            eventLogResponse = eventLogResponse2;
            textContentResponse = textContentResponse2;
            str = str3;
            imageSourceResponse = imageSourceResponse3;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOtherHome.BottomButton.Button(i, str, imageSourceResponse, textContentResponse, eventLogResponse, handlerResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m557deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOtherHome.BottomButton.Button button) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOtherHome.BottomButton.Button.onExtraCallbackWithResult(button, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOtherHome.BottomButton.Button) obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = onWarmupCompleted + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 115;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 81;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, 19626 - TextUtils.indexOf((CharSequence) "", '0'), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 59, Drawable.resolveOpacity(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 58 - MotionEvent.axisFromString(""), 6384 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        IAuthTabCallback = -3272816425331205870L;
    }
}
