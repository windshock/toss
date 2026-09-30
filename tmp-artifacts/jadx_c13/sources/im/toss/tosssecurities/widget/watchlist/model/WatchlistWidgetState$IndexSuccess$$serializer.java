package im.toss.tosssecurities.widget.watchlist.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$IndexSuccess$$serializer implements aeu2<WatchlistWidgetState.IndexSuccess> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final WatchlistWidgetState$IndexSuccess$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = (s * 4) + 115;
        byte[] bArr = $$a;
        int i4 = 4 - (s2 * 2);
        int i5 = i * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            i2 = 0;
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i2++;
            i4++;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        asInterface = 0;
        IAuthTabCallback();
        WatchlistWidgetState$IndexSuccess$$serializer watchlistWidgetState$IndexSuccess$$serializer = new WatchlistWidgetState$IndexSuccess$$serializer();
        INSTANCE = watchlistWidgetState$IndexSuccess$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.IndexSuccess", watchlistWidgetState$IndexSuccess$$serializer, 6);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a((short) Color.argb(0, 0, 0, 0), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 809138797 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-1290732593) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (-71) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("indexPair", true);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 809138802 - Color.green(0), (-1290732573) - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 71, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("indexList", true);
        setanimationsloop.onWarmupCompleted("formattedTime", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 49;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private WatchlistWidgetState$IndexSuccess$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) WatchlistWidgetState.IndexSuccess.onWarmupCompleted(new Object[0], UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1401193496, -1401193496, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArr[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback((KSerializer) lazyArr[2].getValue()), getwrigglelayout, lazyArr[4].getValue(), getwrigglelayout};
        int i4 = onTransact + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5 A[PHI: r0 r2 r5
      0x00c5: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r5v3 kotlin.Lazy[]) = (r5v2 kotlin.Lazy[]), (r5v14 kotlin.Lazy[]) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078 A[PHI: r0 r2 r5
      0x0078: PHI (r0v7 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r5v6 kotlin.Lazy[]) = (r5v2 kotlin.Lazy[]), (r5v14 kotlin.Lazy[]) binds: [B:8:0x0076, B:5:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WatchlistWidgetState.IndexSuccess deserialize(@NotNull Decoder decoder) {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArr;
        int i;
        DisplaySetting displaySetting;
        Pair pair;
        String strAsInterface;
        String strAsInterface2;
        List list;
        float f;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 93;
        onTransact = i4 % 128;
        DisplaySetting displaySetting2 = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArr = (Lazy[]) WatchlistWidgetState.IndexSuccess.onWarmupCompleted(new Object[0], UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1401193496, -1401193496, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            int i5 = 35 / 0;
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                boolean z = true;
                i = 0;
                String strAsInterface3 = null;
                String strAsInterface4 = null;
                List list2 = null;
                float fOnWarmupCompleted = 0.0f;
                Pair pair2 = null;
                while (z) {
                    int i6 = onTransact + 77;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                        case 0:
                            displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), displaySetting2);
                            i |= 1;
                            i2 = 2;
                        case 1:
                            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                            i |= 2;
                        case 2:
                            pair2 = (Pair) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, (jp) lazyArr[i2].getValue(), pair2);
                            i |= 4;
                        case 3:
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i |= 8;
                        case 4:
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), list2);
                            i |= 16;
                        case 5:
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                            i |= 32;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                displaySetting = displaySetting2;
                pair = pair2;
                strAsInterface = strAsInterface3;
                strAsInterface2 = strAsInterface4;
                list = list2;
                f = fOnWarmupCompleted;
            } else {
                int i7 = IAuthTabCallbackDefault + 87;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                DisplaySetting displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArr[0].getValue(), null);
                float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                Pair pair3 = (Pair) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArr[2].getValue(), null);
                i = 63;
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                f = fOnWarmupCompleted2;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), null);
                pair = pair3;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                displaySetting = displaySetting3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArr = (Lazy[]) WatchlistWidgetState.IndexSuccess.onWarmupCompleted(new Object[0], UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1401193496, -1401193496, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted());
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.IndexSuccess(i, displaySetting, f, pair, strAsInterface2, list, strAsInterface, (okycx) null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.IndexSuccess indexSuccessDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return indexSuccessDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.IndexSuccess indexSuccess) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(indexSuccess, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WatchlistWidgetState.IndexSuccess.onWarmupCompleted(indexSuccess, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.IndexSuccess) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 42 - View.MeasureSpec.getMode(0), 22439 - View.resolveSizeAndState(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = (iIntValue == -1 ? 0 : 1) ^ 1;
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), Color.alpha(0) + 55, 2166 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 43424), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 43, 22439 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 86 - Drawable.resolveOpacity(0, 0), Color.blue(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int i9 = $10 + 19;
                    int i10 = i9 % 128;
                    $11 = i10;
                    int i11 = i9 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = i10 + 71;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $11 + 99;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    if (z) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i17 = $11 + 73;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = 1803705755;
        onNavigationEvent = -1538795442;
        IAuthTabCallback = -391586663;
        onExtraCallbackWithResult = new byte[]{-73, -15, -16, 12, 3, -73, -15, -16, 3, -3};
    }
}
