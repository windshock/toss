package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
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
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer implements aeu2<NativeAdsDto.Creative.TossstreamShortFormVideo> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 24 - Color.argb(0, 0, 0, 0), 19627 - Color.green(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 59 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 71;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 58 - ExpandableListView.getPackedPositionChild(0L), Drawable.resolveOpacity(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static {
        IAuthTabCallback();
        NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer nativeAdsDto$Creative$TossstreamShortFormVideo$$serializer = new NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer();
        INSTANCE = nativeAdsDto$Creative$TossstreamShortFormVideo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$TossstreamShortFormVideo$$serializer, 11);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("brandName", true);
        setanimationsloop.onWarmupCompleted("brandLogoUrl", true);
        setanimationsloop.onWarmupCompleted("thumbnailImageUrl", true);
        setanimationsloop.onWarmupCompleted("videoUrl", true);
        Object[] objArr = new Object[1];
        a(new char[]{13583, 55209, 61561, 40230, 49138}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58043, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("ctaText", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        setanimationsloop.onWarmupCompleted("adClearanceText", true);
        setanimationsloop.onWarmupCompleted("ratio", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private NativeAdsDto$Creative$TossstreamShortFormVideo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.TossstreamShortFormVideo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String strAsInterface;
        char c;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 10;
        int i6 = 9;
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, (Object) null);
            str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, (Object) null);
            str8 = str11;
            str3 = strAsInterface9;
            str4 = strAsInterface8;
            str7 = strAsInterface5;
            str = strAsInterface10;
            str5 = strAsInterface7;
            str6 = strAsInterface6;
            i = 2047;
            str9 = strAsInterface4;
            str2 = strAsInterface3;
        } else {
            int i7 = 0;
            boolean z = true;
            String str12 = null;
            String str13 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            String strAsInterface18 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        int i8 = onNavigationEvent + 55;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        i5 = 10;
                        i6 = 9;
                    case 1:
                        c = 3;
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 10;
                    case 2:
                        c = 3;
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i7 |= 4;
                        i5 = 10;
                    case 3:
                        c = 3;
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i7 |= 8;
                        i5 = 10;
                    case 4:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = 10;
                    case 5:
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i7 |= 32;
                        int i10 = IAuthTabCallback + 5;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        i5 = 10;
                    case 6:
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i7 |= 64;
                    case 7:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i7 |= 128;
                    case 8:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i7 |= 256;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, getWriggleLayout.onNavigationEvent, str13);
                        i7 |= 512;
                    case 10:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str12);
                        i7 |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            str = strAsInterface14;
            str2 = strAsInterface17;
            str3 = strAsInterface13;
            str4 = strAsInterface12;
            str5 = strAsInterface11;
            str6 = strAsInterface2;
            str7 = strAsInterface15;
            str8 = str13;
            str9 = strAsInterface16;
            str10 = str12;
            strAsInterface = strAsInterface18;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.TossstreamShortFormVideo(i, str2, strAsInterface, str9, str7, str6, str5, str4, str3, str, str8, str10, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m32deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.TossstreamShortFormVideo tossstreamShortFormVideoDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return tossstreamShortFormVideoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.TossstreamShortFormVideo tossstreamShortFormVideo) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossstreamShortFormVideo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Creative.TossstreamShortFormVideo.onExtraCallback(tossstreamShortFormVideo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.TossstreamShortFormVideo) obj);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onNavigationEvent + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 398799533663563852L;
    }
}
