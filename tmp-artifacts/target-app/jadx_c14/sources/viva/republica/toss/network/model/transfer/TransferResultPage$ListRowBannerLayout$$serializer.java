package viva.republica.toss.network.model.transfer;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.EncryptedContentInfoParser;
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
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$ListRowBannerLayout$$serializer implements aeu2<TransferResultPage.ListRowBannerLayout> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final TransferResultPage$ListRowBannerLayout$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int i6 = $11 + 5;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 35283), TextUtils.getCapsMode("", 0, 0) + 35, 14239 - (ViewConfiguration.getScrollBarSize() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i10 = $11 + 75;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 65, 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, 17656 - TextUtils.indexOf((CharSequence) "", '0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49467), 70 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i14 = $10 + 47;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
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
            int i17 = $11 + 69;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        onExtraCallbackWithResult();
        TransferResultPage$ListRowBannerLayout$$serializer transferResultPage$ListRowBannerLayout$$serializer = new TransferResultPage$ListRowBannerLayout$$serializer();
        INSTANCE = transferResultPage$ListRowBannerLayout$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout", transferResultPage$ListRowBannerLayout$$serializer, 6);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 89, 3}, true, null, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 11, 0, 0}, false, new byte[]{0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{16, 6, 106, 4}, true, null, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("icon", true);
        setanimationsloop.onWarmupCompleted("effect", true);
        Object[] objArr4 = new Object[1];
        a(new int[]{22, 7, 107, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TransferResultPage$ListRowBannerLayout$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = TransferResultPage.ListRowBannerLayout.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(TransferResultPage$Icon$$serializer.INSTANCE), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[4].getValue()), sp.IAuthTabCallback(TransferResultPage$LogInfo$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.ListRowBannerLayout listRowBannerLayoutM111deserialize = m111deserialize(decoder);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = onExtraCallback + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return listRowBannerLayoutM111deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.ListRowBannerLayout m111deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        TransferResultPage.Effect effect;
        String str;
        TransferResultPage.LogInfo logInfo;
        String str2;
        TransferResultPage.Icon icon;
        String str3;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = TransferResultPage.ListRowBannerLayout.onExtraCallbackWithResult();
        boolean z = true;
        TransferResultPage.Effect effect2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            TransferResultPage.Icon icon2 = (TransferResultPage.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TransferResultPage$Icon$$serializer.INSTANCE, (Object) null);
            str3 = str6;
            effect = (TransferResultPage.Effect) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), (Object) null);
            icon = icon2;
            logInfo = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$LogInfo$$serializer.INSTANCE, (Object) null);
            str = str4;
            str2 = str5;
            i = 63;
        } else {
            int i6 = 0;
            boolean z2 = true;
            TransferResultPage.LogInfo logInfo2 = null;
            TransferResultPage.Icon icon3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while ((!z2) != z) {
                int i7 = onExtraCallback + 39;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % i2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = true;
                        z2 = false;
                        i2 = 2;
                    case 0:
                        z = true;
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str9);
                        i6 |= 1;
                        i2 = 2;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        z = true;
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                        i6 |= 2;
                    case 2:
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, getWriggleLayout.onNavigationEvent, str7);
                        i6 |= 4;
                        z = true;
                    case 3:
                        icon3 = (TransferResultPage.Icon) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TransferResultPage$Icon$$serializer.INSTANCE, icon3);
                        i6 |= 8;
                        z = true;
                    case 4:
                        effect2 = (TransferResultPage.Effect) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), effect2);
                        i6 |= 16;
                        z = true;
                    case 5:
                        logInfo2 = (TransferResultPage.LogInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, TransferResultPage$LogInfo$$serializer.INSTANCE, logInfo2);
                        i6 |= 32;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i6;
            String str10 = str8;
            effect = effect2;
            str = str9;
            logInfo = logInfo2;
            str2 = str10;
            String str11 = str7;
            icon = icon3;
            str3 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.ListRowBannerLayout(i, str, str2, str3, icon, effect, logInfo, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.ListRowBannerLayout) obj);
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.ListRowBannerLayout listRowBannerLayout) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(listRowBannerLayout, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.ListRowBannerLayout.onWarmupCompleted(listRowBannerLayout, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(listRowBannerLayout, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferResultPage.ListRowBannerLayout.onWarmupCompleted(listRowBannerLayout, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{27267, 27276, 27267, 27376, 27275, 27260, 27178, 27170, 27173, 27172, 27171, 27170, 27196, 27168, 27170, 27168, 27265, 27292, 27267, 27283, 27265, 27289, 27171, 27291, 27291, 27272, 27277, 27288, 27286};
    }
}
