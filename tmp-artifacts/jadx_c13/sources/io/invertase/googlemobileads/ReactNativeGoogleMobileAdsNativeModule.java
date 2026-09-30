package io.invertase.googlemobileads;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeModule;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeModule$;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeModule$NativeAdHolder$;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@ReactModule(IAuthTabCallback = "RNGoogleMobileAdsNativeModule")
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactNativeGoogleMobileAdsNativeModule extends NativeGoogleMobileAdsNativeModuleSpec {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int[] IAuthTabCallback = null;
    public static final String NAME = "RNGoogleMobileAdsNativeModule";
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final HashMap<String, NativeAdHolder> adHolders;

    /* renamed from: $r8$lambda$LXn-j5qAuiuW13vHSFAJKCd8SC0, reason: not valid java name */
    public static /* synthetic */ void m30$r8$lambda$LXnj5qAuiuW13vHSFAJKCd8SC0(ReactNativeGoogleMobileAdsNativeModule reactNativeGoogleMobileAdsNativeModule, NativeAdHolder nativeAdHolder, Promise promise, NativeAd nativeAd) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        load$lambda$0(reactNativeGoogleMobileAdsNativeModule, nativeAdHolder, promise, nativeAd);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        Companion = new Companion(null);
        int i = onNavigationEvent + 13;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeGoogleMobileAdsNativeModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        this.adHolders = new HashMap<>();
    }

    public static final /* synthetic */ ReactApplicationContext access$getReactApplicationContext(ReactNativeGoogleMobileAdsNativeModule reactNativeGoogleMobileAdsNativeModule) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReactApplicationContext reactApplicationContext = reactNativeGoogleMobileAdsNativeModule.getReactApplicationContext();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return reactApplicationContext;
    }

    @Override // io.invertase.googlemobileads.NativeGoogleMobileAdsNativeModuleSpec
    public String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return "RNGoogleMobileAdsNativeModule";
    }

    @Override // io.invertase.googlemobileads.NativeGoogleMobileAdsNativeModuleSpec
    @ReactMethod
    public void load(@NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        NativeAdHolder nativeAdHolder = new NativeAdHolder(this, str, readableMap);
        nativeAdHolder.IAuthTabCallback(new ReactNativeGoogleMobileAdsNativeModule$.ExternalSyntheticLambda0(this, nativeAdHolder, promise));
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void load$lambda$0(ReactNativeGoogleMobileAdsNativeModule reactNativeGoogleMobileAdsNativeModule, NativeAdHolder nativeAdHolder, Promise promise, NativeAd nativeAd) throws Throwable {
        String responseId;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAd, "");
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null && (responseId = responseInfo.getResponseId()) != null) {
            reactNativeGoogleMobileAdsNativeModule.adHolders.put(responseId, nativeAdHolder);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("responseId", responseId);
            writableMapCreateMap.putString("advertiser", nativeAd.getAdvertiser());
            writableMapCreateMap.putString("body", nativeAd.getBody());
            writableMapCreateMap.putString("callToAction", nativeAd.getCallToAction());
            writableMapCreateMap.putString("headline", nativeAd.getHeadline());
            writableMapCreateMap.putString("price", nativeAd.getPrice());
            writableMapCreateMap.putString("store", nativeAd.getStore());
            Double starRating = nativeAd.getStarRating();
            if (starRating != null) {
                writableMapCreateMap.putDouble("starRating", starRating.doubleValue());
            } else {
                writableMapCreateMap.putNull("starRating");
            }
            NativeAd.Image icon = nativeAd.getIcon();
            if (icon != null) {
                int i2 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("scale", icon.getScale());
                Object[] objArr = new Object[1];
                a(new int[]{631881267, -1403320201}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 3, objArr);
                writableMapCreateMap2.putString(((String) objArr[0]).intern(), String.valueOf(icon.getUri()));
                writableMapCreateMap.putMap("icon", writableMapCreateMap2);
            } else {
                writableMapCreateMap.putNull("icon");
            }
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                int i4 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                writableMapCreateMap3.putDouble("aspectRatio", mediaContent.getAspectRatio());
                writableMapCreateMap3.putBoolean("hasVideoContent", mediaContent.hasVideoContent());
                writableMapCreateMap3.putDouble("duration", mediaContent.getDuration());
                writableMapCreateMap.putMap("mediaContent", writableMapCreateMap3);
            }
            promise.resolve(writableMapCreateMap);
        }
        int i6 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // io.invertase.googlemobileads.NativeGoogleMobileAdsNativeModuleSpec
    @ReactMethod
    public void destroy(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        NativeAdHolder nativeAdHolder = this.adHolders.get(str);
        if (nativeAdHolder != null) {
            nativeAdHolder.onExtraCallbackWithResult();
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 4;
            }
        }
        this.adHolders.remove(str);
    }

    public void invalidate() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
        Collection<NativeAdHolder> collectionValues = this.adHolders.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((NativeAdHolder) it.next()).onExtraCallbackWithResult();
        }
        this.adHolders.clear();
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NativeAd getNativeAd(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        NativeAdHolder nativeAdHolder = this.adHolders.get(str);
        if (nativeAdHolder != null) {
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return nativeAdHolder.IAuthTabCallback();
        }
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return null;
    }

    final class NativeAdHolder {
        final /* synthetic */ ReactNativeGoogleMobileAdsNativeModule IAuthTabCallback;
        private final VideoController.VideoLifecycleCallbacks asInterface;
        private final AdListener onExtraCallback;
        private NativeAd onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final ReadableMap onWarmupCompleted;
        private static final byte[] $$a = {1, ByteCompanionObject.MIN_VALUE, 109, ByteCompanionObject.MIN_VALUE};
        private static final int $$b = 217;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 0;
        private static int access000 = 1;
        private static long IAuthTabCallbackStub = -3297784289008240024L;
        private static int asBinder = -1776194565;
        private static char IAuthTabCallbackDefault = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2;
            byte[] bArr = $$a;
            int i3 = b * 3;
            int i4 = s + 4;
            int i5 = s2 + 109;
            byte[] bArr2 = new byte[1 - i3];
            int i6 = 0 - i3;
            if (bArr == null) {
                i2 = i4;
                int i7 = i6;
                int i8 = 0;
                i4 += -i7;
                i = i8;
                bArr2[i] = (byte) i4;
                i8 = i + 1;
                if (i == i6) {
                    return new String(bArr2, 0);
                }
                i2++;
                i7 = bArr[i2];
                i4 += -i7;
                i = i8;
                bArr2[i] = (byte) i4;
                i8 = i + 1;
                if (i == i6) {
                }
            } else {
                i = 0;
                i2 = i4;
                i4 = i5;
                bArr2[i] = (byte) i4;
                i8 = i + 1;
                if (i == i6) {
                }
            }
        }

        public static /* synthetic */ void onWarmupCompleted(NativeAdHolder nativeAdHolder, AdValue adValue) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(nativeAdHolder, adValue);
            int i4 = access000 + 1;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }

        public static /* synthetic */ void onWarmupCompleted(NativeAdHolder nativeAdHolder, NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, NativeAd nativeAd) {
            int i = 2 % 2;
            int i2 = onTransact + 123;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(nativeAdHolder, onNativeAdLoadedListener, nativeAd);
            if (i3 == 0) {
                int i4 = 71 / 0;
            }
        }

        public NativeAdHolder(@NotNull ReactNativeGoogleMobileAdsNativeModule reactNativeGoogleMobileAdsNativeModule, @NotNull String str, ReadableMap readableMap) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            this.IAuthTabCallback = reactNativeGoogleMobileAdsNativeModule;
            this.onNavigationEvent = str;
            this.onWarmupCompleted = readableMap;
            this.onExtraCallback = new AdListener() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeModule$NativeAdHolder$adListener$1
                public void onAdImpression() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onWarmupCompleted, "impression", null, 2, null);
                }

                public void onAdClicked() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onWarmupCompleted, "clicked", null, 2, null);
                }

                public void onAdOpened() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onWarmupCompleted, "opened", null, 2, null);
                }

                public void onAdClosed() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onWarmupCompleted, "closed", null, 2, null);
                }
            };
            this.asInterface = new VideoController.VideoLifecycleCallbacks() { // from class: io.invertase.googlemobileads.ReactNativeGoogleMobileAdsNativeModule$NativeAdHolder$videoLifecycleCallbacks$1
                public void onVideoPlay() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onNavigationEvent, "video_played", null, 2, null);
                }

                public void onVideoPause() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onNavigationEvent, "video_paused", null, 2, null);
                }

                public void onVideoEnd() throws Throwable {
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(this.onNavigationEvent, "video_ended", null, 2, null);
                }

                public void onVideoMute(boolean z) throws Throwable {
                    String str2;
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder nativeAdHolder = this.onNavigationEvent;
                    if (z) {
                        str2 = "video_muted";
                    } else {
                        str2 = "video_unmuted";
                    }
                    ReactNativeGoogleMobileAdsNativeModule.NativeAdHolder.onExtraCallbackWithResult(nativeAdHolder, str2, null, 2, null);
                }
            };
        }

        public final NativeAd IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = access000 + 55;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            NativeAd nativeAd = this.onExtraCallbackWithResult;
            int i5 = i3 + 37;
            access000 = i5 % 128;
            if (i5 % 2 != 0) {
                return nativeAd;
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $11 + 25;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iIndexOf = 43 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1451;
                        byte b = $$a[0];
                        byte b2 = (byte) (-b);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, iIndexOf, edgeSlop, 228868077, false, $$c(b2, (byte) (b2 + 1), b), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123);
                            int iResolveSize = 44 - View.resolveSize(0, 0);
                            int size2 = 1494 - View.MeasureSpec.getSize(0);
                            byte b3 = (byte) (-$$a[0]);
                            byte b4 = (byte) (b3 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, iResolveSize, size2, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 23973), View.getDefaultSize(0, 0) + 50, 22939 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 30, Color.green(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i6 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                                $11 = i6 % 128;
                                int i7 = i6 % 2;
                                i2 = 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        private static final void onExtraCallback(NativeAdHolder nativeAdHolder, AdValue adValue) throws Throwable {
            int i = 2 % 2;
            int i2 = access000 + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(adValue, "");
            WritableMap writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55794), 1210986641 - View.resolveSizeAndState(0, 0, 0), new char[]{55850, 48773, 39639, 40800, 47787}, new char[]{53651, 52717, 59039, 48641}, new char[]{37200, 11824, 62024, 48089}, objArr);
            writableMapCreateMap.putDouble(((String) objArr[0]).intern(), adValue.getValueMicros() * 1.0E-6d);
            writableMapCreateMap.putInt("precision", adValue.getPrecisionType());
            Object[] objArr2 = new Object[1];
            a((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, new char[]{36020, 53386, 8262, 61625, 9747, 9579, 24538, 55367}, new char[]{53651, 52717, 59039, 48641}, new char[]{8654, 21570, 31936, 39096}, objArr2);
            writableMapCreateMap.putString(((String) objArr2[0]).intern(), adValue.getCurrencyCode());
            nativeAdHolder.onNavigationEvent("paid", writableMapCreateMap);
            int i4 = access000 + 95;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
          0x002b: PHI (r1v5 com.google.android.gms.ads.MediaContent) = (r1v4 com.google.android.gms.ads.MediaContent), (r1v11 com.google.android.gms.ads.MediaContent) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void onExtraCallbackWithResult(NativeAdHolder nativeAdHolder, NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, NativeAd nativeAd) {
            MediaContent mediaContent;
            int i = 2 % 2;
            int i2 = access000 + 35;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                nativeAdHolder.onExtraCallbackWithResult = nativeAd;
                mediaContent = nativeAd.getMediaContent();
                int i3 = 55 / 0;
                if (mediaContent != null) {
                    int i4 = access000 + 93;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    VideoController videoController = mediaContent.getVideoController();
                    if (videoController != null) {
                        videoController.setVideoLifecycleCallbacks(nativeAdHolder.asInterface);
                        int i6 = onTransact + 71;
                        access000 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                nativeAdHolder.onExtraCallbackWithResult = nativeAd;
                mediaContent = nativeAd.getMediaContent();
                if (mediaContent != null) {
                }
            }
            nativeAd.setOnPaidEventListener(new ReactNativeGoogleMobileAdsNativeModule$NativeAdHolder$.ExternalSyntheticLambda1(nativeAdHolder));
            onNativeAdLoadedListener.onNativeAdLoaded(nativeAd);
            int i8 = onTransact + 11;
            access000 = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            int i;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(onNativeAdLoadedListener, "");
            if (this.onWarmupCompleted.hasKey("aspectRatio")) {
                int i5 = onTransact + 53;
                access000 = i5 % 128;
                if (i5 % 2 != 0 ? (i2 = this.onWarmupCompleted.getInt("aspectRatio")) == 1 : (i2 = this.onWarmupCompleted.getInt("aspectRatio")) == 0) {
                    i = 1;
                } else if (i2 != 2) {
                    int i6 = access000 + 19;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 3) {
                        i = 4;
                        if (i2 != 4) {
                            i = 0;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
            }
            if (this.onWarmupCompleted.hasKey("adChoicesPlacement")) {
                int i8 = onTransact + 59;
                access000 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = this.onWarmupCompleted.getInt("adChoicesPlacement");
                if (i10 == 0) {
                    i3 = 0;
                } else if (i10 == 1) {
                    i3 = 1;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        i3 = 3;
                    }
                }
            }
            VideoOptions videoOptionsBuild = new VideoOptions.Builder().setStartMuted(this.onWarmupCompleted.hasKey("startVideoMuted") ? this.onWarmupCompleted.getBoolean("startVideoMuted") : true).build();
            Intrinsics.checkNotNullExpressionValue(videoOptionsBuild, "");
            NativeAdOptions nativeAdOptionsBuild = new NativeAdOptions.Builder().setMediaAspectRatio(i).setAdChoicesPlacement(i3).setVideoOptions(videoOptionsBuild).build();
            Intrinsics.checkNotNullExpressionValue(nativeAdOptionsBuild, "");
            AdLoader adLoaderBuild = new AdLoader.Builder(ReactNativeGoogleMobileAdsNativeModule.access$getReactApplicationContext(this.IAuthTabCallback), this.onNavigationEvent).withNativeAdOptions(nativeAdOptionsBuild).withAdListener(this.onExtraCallback).forNativeAd(new ReactNativeGoogleMobileAdsNativeModule$NativeAdHolder$.ExternalSyntheticLambda0(this, onNativeAdLoadedListener)).build();
            Intrinsics.checkNotNullExpressionValue(adLoaderBuild, "");
            adLoaderBuild.loadAd(ReactNativeGoogleMobileAdsCommon.onWarmupCompleted(this.onWarmupCompleted));
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 3;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            NativeAd nativeAd = this.onExtraCallbackWithResult;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
            Object obj = null;
            this.onExtraCallbackWithResult = null;
            int i4 = access000 + 1;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ void onExtraCallbackWithResult(NativeAdHolder nativeAdHolder, String str, ReadableMap readableMap, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onTransact + 47;
            access000 = i3 % 128;
            if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
                readableMap = null;
            }
            nativeAdHolder.onNavigationEvent(str, readableMap);
            int i4 = onTransact + 107;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
        }

        private final void onNavigationEvent(String str, ReadableMap readableMap) throws Throwable {
            String responseId;
            int i = 2 % 2;
            NativeAd nativeAd = this.onExtraCallbackWithResult;
            if (nativeAd == null) {
                return;
            }
            ReadableMap readableMapCreateMap = Arguments.createMap();
            if (readableMap != null) {
                int i2 = onTransact + 27;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                readableMapCreateMap.merge(readableMap);
            }
            ResponseInfo responseInfo = nativeAd.getResponseInfo();
            if (responseInfo != null) {
                responseId = responseInfo.getResponseId();
                int i4 = access000 + 83;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                }
            } else {
                responseId = null;
            }
            readableMapCreateMap.putString("responseId", responseId);
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38365), Color.green(0), new char[]{16177, 50838, 2356, 10550}, new char[]{53651, 52717, 59039, 48641}, new char[]{48662, 20160, 56583, 41877}, objArr);
            readableMapCreateMap.putString(((String) objArr[0]).intern(), str);
            this.IAuthTabCallback.emitOnAdEvent(readableMapCreateMap);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i8 = $11 + Imgproc.COLOR_YUV2RGB_YVYU;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> i5), 72 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i2 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 72 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i2++;
                }
                i5 = 16;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i9 = $11 + 39;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i6] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), ExpandableListView.getPackedPositionGroup(0L) + 72, 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i11++;
                i4 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 85;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $10 + 21;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 22252), 39 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15 += 101;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 39 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i15++;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4033), 77 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new int[]{812247431, 1528405614, 1698630223, -985704235, -92699266, -1818678555, 1006374320, -570542443, -524925189, -423509635, -323577303, -154481994, 633403302, -1023291441, 2048622892, 1990535988, -977362104, 556023011};
    }
}
