package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$PlayableAd$$serializer implements aeu2<NativeAdsDto.Creative.PlayableAd> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final NativeAdsDto$Creative$PlayableAd$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onNavigationEvent;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - ((byte) KeyEvent.getModifierMetaStateMask())), 36 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ((byte) KeyEvent.getModifierMetaStateMask())), 64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 16718 - Drawable.resolveOpacity(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    int i10 = $11 + 119;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 70, Color.green(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i13 = $11 + 23;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        onExtraCallback();
        NativeAdsDto$Creative$PlayableAd$$serializer nativeAdsDto$Creative$PlayableAd$$serializer = new NativeAdsDto$Creative$PlayableAd$$serializer();
        INSTANCE = nativeAdsDto$Creative$PlayableAd$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("styleId", nativeAdsDto$Creative$PlayableAd$$serializer, 10);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 29, 3}, true, null, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("htmlUrl", true);
        setanimationsloop.onWarmupCompleted("testUrl", true);
        setanimationsloop.onWarmupCompleted("shareLinkBaseUrl", true);
        setanimationsloop.onWarmupCompleted("landingUrl", true);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 3, 67, 0}, false, new byte[]{0, 1, 0}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("iosAppInstall", true);
        setanimationsloop.onWarmupCompleted("endCard", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 75;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private NativeAdsDto$Creative$PlayableAd$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrAsBinder = NativeAdsDto.Creative.PlayableAd.asBinder();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, lazyArrAsBinder[4].getValue(), sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout, sp.IAuthTabCallback(AppInfo$$serializer.INSTANCE), sp.IAuthTabCallback(IosAppInstallInfo$$serializer.INSTANCE), sp.IAuthTabCallback(NativeAdsDto$Creative$EndCard$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.PlayableAd deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        AppInfo appInfo;
        IosAppInstallInfo iosAppInstallInfo;
        String str;
        NativeAdsDto.Creative.EndCard endCard;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrAsBinder = NativeAdsDto.Creative.PlayableAd.asBinder();
        int i5 = 9;
        int i6 = 7;
        int i7 = 6;
        boolean z = true;
        NativeAdsDto.Creative.EndCard endCard2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrAsBinder[4].getValue(), (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            AppInfo appInfo2 = (AppInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, AppInfo$$serializer.INSTANCE, (Object) null);
            IosAppInstallInfo iosAppInstallInfo2 = (IosAppInstallInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, IosAppInstallInfo$$serializer.INSTANCE, (Object) null);
            str2 = strAsInterface3;
            list = list2;
            str6 = strAsInterface;
            endCard = (NativeAdsDto.Creative.EndCard) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, NativeAdsDto$Creative$EndCard$$serializer.INSTANCE, (Object) null);
            appInfo = appInfo2;
            str4 = strAsInterface5;
            str = str7;
            str3 = strAsInterface4;
            iosAppInstallInfo = iosAppInstallInfo2;
            str5 = strAsInterface2;
            i = 1023;
        } else {
            int i8 = 0;
            boolean z2 = true;
            AppInfo appInfo3 = null;
            IosAppInstallInfo iosAppInstallInfo3 = null;
            String str8 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            List list3 = null;
            while (z2 == z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        i7 = 6;
                        z2 = false;
                        z = true;
                    case 0:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        int i9 = onExtraCallbackWithResult + 27;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        list3 = list3;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        z = true;
                    case 1:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i8 |= 2;
                        z = true;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                    case 2:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i8 |= 4;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        z = true;
                    case 3:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i8 |= 8;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        z = true;
                    case 4:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrAsBinder[4].getValue(), list3);
                        i8 |= 16;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        z = true;
                    case 5:
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str8);
                        i8 |= 32;
                        i5 = 9;
                        z = true;
                    case 6:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                        i8 |= 64;
                        i5 = 9;
                        z = true;
                    case 7:
                        appInfo3 = (AppInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, AppInfo$$serializer.INSTANCE, appInfo3);
                        i8 |= 128;
                        int i11 = onExtraCallbackWithResult + 117;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        i5 = 9;
                        z = true;
                    case 8:
                        iosAppInstallInfo3 = (IosAppInstallInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, IosAppInstallInfo$$serializer.INSTANCE, iosAppInstallInfo3);
                        i8 |= 256;
                        z = true;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        endCard2 = (NativeAdsDto.Creative.EndCard) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, NativeAdsDto$Creative$EndCard$$serializer.INSTANCE, endCard2);
                        i8 |= 512;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i8;
            appInfo = appInfo3;
            iosAppInstallInfo = iosAppInstallInfo3;
            str = str8;
            endCard = endCard2;
            str2 = strAsInterface6;
            str3 = strAsInterface7;
            str4 = strAsInterface8;
            str5 = strAsInterface9;
            str6 = strAsInterface10;
            list = list3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.PlayableAd(i, str6, str5, str2, str3, list, str, str4, appInfo, iosAppInstallInfo, endCard, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m26deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.PlayableAd playableAdDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return playableAdDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.PlayableAd playableAd) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(playableAd, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NativeAdsDto.Creative.PlayableAd.onWarmupCompleted(playableAd, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(playableAd, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        NativeAdsDto.Creative.PlayableAd.onWarmupCompleted(playableAd, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Creative.PlayableAd) obj);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{27359, 27336, 27359, 27340, 27335, 27164, 27365, 27389};
    }
}
