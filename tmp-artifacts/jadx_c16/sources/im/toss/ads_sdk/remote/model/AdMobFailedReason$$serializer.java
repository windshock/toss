package im.toss.ads_sdk.remote.model;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import im.toss.ads_sdk.remote.model.AdmobError$;
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
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.aeu2;
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
public final /* synthetic */ class AdMobFailedReason$$serializer implements aeu2<AdMobFailedReason> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static long IAuthTabCallback = 0;
    public static final AdMobFailedReason$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 24, 16796843 + Color.rgb(0, 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), Color.argb(0, 0, 0, 0) + 59, 6383 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $11 + 29;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 5;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (KeyEvent.getMaxKeyCode() >> 16) + 59, View.MeasureSpec.makeMeasureSpec(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        onNavigationEvent();
        AdMobFailedReason$$serializer adMobFailedReason$$serializer = new AdMobFailedReason$$serializer();
        INSTANCE = adMobFailedReason$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.AdMobFailedReason", adMobFailedReason$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{57735, 35557, 14206, 41945, 19534, 63698}, 27509 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("filterReasons", true);
        setanimationsloop.onWarmupCompleted("loadedContent", true);
        setanimationsloop.onWarmupCompleted(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AdMobFailedReason$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = AdMobFailedReason.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[1].getValue()), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(AdmobError$.serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobFailedReason deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        AdmobError admobError;
        String str2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = AdMobFailedReason.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            i = 15;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            list = list2;
            str2 = str3;
            admobError = (AdmobError) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AdmobError$.serializer.INSTANCE, (Object) null);
        } else {
            i = 0;
            boolean z = true;
            String str4 = null;
            List list3 = null;
            AdmobError admobError2 = null;
            String str5 = null;
            while (z) {
                int i5 = onExtraCallback + 61;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallback + 109;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent == 1) {
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list3);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i9 = i7 + 39;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            admobError2 = (AdmobError) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AdmobError$.serializer.INSTANCE, admobError2);
                            i |= 8;
                            int i10 = onExtraCallback + 65;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            admobError2 = (AdmobError) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, AdmobError$.serializer.INSTANCE, admobError2);
                            i |= 8;
                            int i102 = onExtraCallback + 65;
                            onWarmupCompleted = i102 % 128;
                            int i112 = i102 % 2;
                        }
                    } else {
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                        i |= 4;
                    }
                } else {
                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                    i |= 1;
                }
            }
            str = str4;
            list = list3;
            admobError = admobError2;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobFailedReason(i, str2, list, str, admobError, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m37deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AdMobFailedReason adMobFailedReasonDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return adMobFailedReasonDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobFailedReason adMobFailedReason) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobFailedReason, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AdMobFailedReason.onExtraCallbackWithResult(adMobFailedReason, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 49;
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
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobFailedReason) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 1383181288495342786L;
    }
}
