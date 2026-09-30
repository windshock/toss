package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
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
public final /* synthetic */ class CreditQuizCptBannerResponse$$serializer implements aeu2<CreditQuizCptBannerResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final CreditQuizCptBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        CreditQuizCptBannerResponse$$serializer creditQuizCptBannerResponse$$serializer = new CreditQuizCptBannerResponse$$serializer();
        INSTANCE = creditQuizCptBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditQuizCptBannerResponse", creditQuizCptBannerResponse$$serializer, 6);
        setanimationsloop.onWarmupCompleted("bannerId", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 1}, true, new byte[]{0, 1, 1, 0, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 8, 76, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("logoUrl", true);
        setanimationsloop.onWarmupCompleted("linkUrl", true);
        setanimationsloop.onWarmupCompleted("deliberationText", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 11;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditQuizCptBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditQuizCptBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 5;
        String str7 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str = str10;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            i = 63;
            str6 = str11;
            str4 = str12;
            str3 = str8;
            str5 = str9;
        } else {
            int i8 = 0;
            boolean z = true;
            String str13 = null;
            String str14 = null;
            str = null;
            String str15 = null;
            String str16 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i9 = onExtraCallbackWithResult + 29;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        z = false;
                        i5 = 5;
                    case 0:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str16);
                        i8 |= 1;
                        i5 = 5;
                    case 1:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str15);
                        i8 |= 2;
                        i5 = 5;
                    case 2:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str);
                        i8 |= 4;
                        i5 = 5;
                    case 3:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str7);
                        i8 |= 8;
                        i5 = 5;
                    case 4:
                        str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str14);
                        i8 |= 16;
                        int i11 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        i5 = 5;
                    case 5:
                        str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str13);
                        i8 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str2 = str13;
            str3 = str16;
            str4 = str14;
            str5 = str15;
            str6 = str7;
            i = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditQuizCptBannerResponse(i, str3, str5, str, str6, str4, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m169deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizCptBannerResponse creditQuizCptBannerResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return creditQuizCptBannerResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditQuizCptBannerResponse creditQuizCptBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditQuizCptBannerResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditQuizCptBannerResponse.onWarmupCompleted(creditQuizCptBannerResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditQuizCptBannerResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditQuizCptBannerResponse.onWarmupCompleted(creditQuizCptBannerResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditQuizCptBannerResponse) obj);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        char c = '0';
        if (cArr != null) {
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 35283), 'S' - AndroidCharacter.getMirror(c), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10935), View.combineMeasuredStates(0, 0) + 65, TextUtils.lastIndexOf("", '0', 0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 49467), Color.rgb(0, 0, 0) + 16777286, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i13 = $10 + 51;
            $11 = i13 % 128;
            i = 2;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i15 = $10 + 115;
            $11 = i15 % 128;
            if (i15 % i == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 + i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 >>> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 41;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i19 = $10 + 123;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 4 / 3;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i21 = $10 + 15;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i23 = $10 + 53;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[5]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent /= 0;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{27252, 27170, 27174, 27198, 27168, 27153, 27278, 27385, 27385, 27380, 27380, 27378, 27386};
    }
}
