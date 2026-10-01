package im.toss.tosssecurities.widget.watchlist.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$ProductSuccess$$serializer implements aeu2<WatchlistWidgetState.ProductSuccess> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final WatchlistWidgetState$ProductSuccess$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        WatchlistWidgetState$ProductSuccess$$serializer watchlistWidgetState$ProductSuccess$$serializer = new WatchlistWidgetState$ProductSuccess$$serializer();
        INSTANCE = watchlistWidgetState$ProductSuccess$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.ProductSuccess", watchlistWidgetState$ProductSuccess$$serializer, 8);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 0, 0}, false, new byte[]{1, 1, 0, 0, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("productPair", true);
        setanimationsloop.onWarmupCompleted("productList", true);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 5, 0, 3}, false, new byte[]{0, 0, 1, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("watchlistType", false);
        setanimationsloop.onWarmupCompleted("formattedTime", false);
        setanimationsloop.onWarmupCompleted("watchlistId", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private WatchlistWidgetState$ProductSuccess$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallbackDefault = WatchlistWidgetState.ProductSuccess.IAuthTabCallbackDefault();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArrIAuthTabCallbackDefault[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallbackDefault[2].getValue()), lazyArrIAuthTabCallbackDefault[3].getValue(), getwrigglelayout, lazyArrIAuthTabCallbackDefault[5].getValue(), getwrigglelayout, sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    @Override // o.jp
    public final WatchlistWidgetState.ProductSuccess deserialize(@NotNull Decoder decoder) {
        List list;
        String strAsInterface;
        String strAsInterface2;
        int i;
        Long l;
        r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg;
        float f;
        Pair pair;
        DisplaySetting displaySetting;
        int i2;
        char c;
        char c2;
        int i3 = 2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallbackDefault = WatchlistWidgetState.ProductSuccess.IAuthTabCallbackDefault();
        int i5 = 7;
        int i6 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            DisplaySetting displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallbackDefault[0].getValue(), null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            Pair pair2 = (Pair) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallbackDefault[2].getValue(), null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallbackDefault[3].getValue(), null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg2 = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrIAuthTabCallbackDefault[5].getValue(), null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            pair = pair2;
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabrizzqzhaizmdvstl2yymmz7zsg2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, null);
            strAsInterface2 = strAsInterface4;
            strAsInterface = strAsInterface3;
            list = list2;
            f = fOnWarmupCompleted;
            displaySetting = displaySetting2;
            i = 255;
        } else {
            boolean z = true;
            Pair pair3 = null;
            list = null;
            strAsInterface = null;
            Long l2 = null;
            strAsInterface2 = null;
            DisplaySetting displaySetting3 = null;
            float fOnWarmupCompleted2 = 0.0f;
            int i7 = 0;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg3 = null;
            while (z) {
                int i8 = onWarmupCompleted + 125;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % i3;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 3;
                        c2 = 4;
                        z = false;
                        i3 = 2;
                        i6 = 6;
                    case 0:
                        c = 3;
                        c2 = 4;
                        displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallbackDefault[0].getValue(), displaySetting3);
                        i7 |= 1;
                        i3 = 2;
                        i5 = 7;
                        i6 = 6;
                    case 1:
                        c = 3;
                        c2 = 4;
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 7;
                    case 2:
                        c = 3;
                        c2 = 4;
                        pair3 = (Pair) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallbackDefault[i3].getValue(), pair3);
                        i7 |= 4;
                        i5 = 7;
                    case 3:
                        c = 3;
                        c2 = 4;
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallbackDefault[3].getValue(), list);
                        i7 |= 8;
                        i5 = 7;
                    case 4:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i7 |= 16;
                    case 5:
                        r8lambdabrizzqzhaizmdvstl2yymmz7zsg3 = (r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrIAuthTabCallbackDefault[5].getValue(), r8lambdabrizzqzhaizmdvstl2yymmz7zsg3);
                        i7 |= 32;
                    case 6:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i6);
                        i7 |= 64;
                        i2 = onWarmupCompleted + 27;
                        IAuthTabCallback = i2 % 128;
                        int i10 = i2 % i3;
                    case 7:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, oty1.onExtraCallback, l2);
                        i7 |= 128;
                        i2 = IAuthTabCallback + 93;
                        onWarmupCompleted = i2 % 128;
                        int i102 = i2 % i3;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i7;
            l = l2;
            r8lambdabrizzqzhaizmdvstl2yymmz7zsg = r8lambdabrizzqzhaizmdvstl2yymmz7zsg3;
            f = fOnWarmupCompleted2;
            pair = pair3;
            displaySetting = displaySetting3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.ProductSuccess(i, displaySetting, f, pair, list, strAsInterface, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, strAsInterface2, l, (okycx) null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.ProductSuccess productSuccessDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return productSuccessDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.ProductSuccess productSuccess) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(productSuccess, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WatchlistWidgetState.ProductSuccess.IAuthTabCallback(productSuccess, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(productSuccess, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WatchlistWidgetState.ProductSuccess.IAuthTabCallback(productSuccess, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 54 / 0;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.ProductSuccess) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onNavigationEvent;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.alpha(0) + 35, 14239 - (Process.myTid() >> 22), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (KeyEvent.getMaxKeyCode() >> 16)), Drawable.resolveOpacity(0, 0) + 35, 14238 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 99;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Process.myTid() >> 22) + 65, 16718 - KeyEvent.normalizeMetaState(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 10935), 65 - View.MeasureSpec.getSize(0), 16717 - ExpandableListView.getPackedPositionChild(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1), 29 - (Process.myPid() >> 22), 17658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                    int i13 = $11 + 13;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), 70 - Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i16 = $10 + 57;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i18 = $10 + 39;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{27262, 27176, 27168, 27170, 27178, 27252, 27198, 27174, 27170, 27168};
    }
}
