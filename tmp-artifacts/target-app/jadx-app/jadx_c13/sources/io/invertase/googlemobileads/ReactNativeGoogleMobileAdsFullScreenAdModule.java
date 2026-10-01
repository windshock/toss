package io.invertase.googlemobileads;

import android.app.Activity;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsFullScreenAdModule$;
import io.invertase.googlemobileads.common.ReactNativeModule;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ReactNativeGoogleMobileAdsFullScreenAdModule<T> extends ReactNativeModule {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -4305093480350103746L;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final SparseArray<T> adArray;

    public static /* synthetic */ void $r8$lambda$4V6dPDxizaghYFyuU2paCNjxCmw(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, int i, ReadableMap readableMap, Activity activity, Promise promise, String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        show$lambda$0(reactNativeGoogleMobileAdsFullScreenAdModule, i, readableMap, activity, promise, str);
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
    }

    /* renamed from: $r8$lambda$8jJOFcj44PXEn-4idiPzdE7DFUU, reason: not valid java name */
    public static /* synthetic */ void m28$r8$lambda$8jJOFcj44PXEn4idiPzdE7DFUU(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, Activity activity, String str, AdManagerAdRequest adManagerAdRequest, ReactNativeGoogleMobileAdsAdLoadCallback reactNativeGoogleMobileAdsAdLoadCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        load$lambda$0(reactNativeGoogleMobileAdsFullScreenAdModule, activity, str, adManagerAdRequest, reactNativeGoogleMobileAdsAdLoadCallback);
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$K3V8nCH2R8yzHaHwZqur1nk_kjQ(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, int i, String str, RewardItem rewardItem) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        show$lambda$0$0(reactNativeGoogleMobileAdsFullScreenAdModule, i, str, rewardItem);
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        int i6 = onExtraCallback + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract String getAdEventName();

    public abstract void loadAd(@NotNull Activity activity, @NotNull String str, @NotNull AdManagerAdRequest adManagerAdRequest, @NotNull AdLoadCallback<T> adLoadCallback);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeGoogleMobileAdsFullScreenAdModule(@Nullable ReactApplicationContext reactApplicationContext, @NotNull String str) {
        super(reactApplicationContext, str);
        Intrinsics.checkNotNullParameter(str, "");
        this.adArray = new SparseArray<>();
    }

    public static final /* synthetic */ SparseArray access$getAdArray$p(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SparseArray<T> sparseArray = reactNativeGoogleMobileAdsFullScreenAdModule.adArray;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return sparseArray;
    }

    public static final /* synthetic */ void access$sendAdEvent(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, String str, int i, String str2, WritableMap writableMap, WritableMap writableMap2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        reactNativeGoogleMobileAdsFullScreenAdModule.sendAdEvent(str, i, str2, writableMap, writableMap2);
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
    }

    private final void sendAdEvent(String str, int i, String str2, WritableMap writableMap, WritableMap writableMap2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ReactNativeGoogleMobileAdsCommon.onExtraCallbackWithResult(getAdEventName(), i, str, str2, writableMap, writableMap2);
        int i5 = onExtraCallback + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        long j;
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getTouchSlop() >> 8) + 24, (-16757589) - Color.rgb(0, 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), 59 - Color.argb(0, 0, 0, 0), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 47;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 58 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 6382 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            j = 0;
        }
        String str = new String(cArr2);
        int i6 = $10 + 101;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public final void load(int i, @NotNull String str, @NotNull ReadableMap readableMap) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsFullScreenAdModule$.ExternalSyntheticLambda2(this, currentActivity, str, ReactNativeGoogleMobileAdsCommon.onWarmupCompleted(readableMap), new ReactNativeGoogleMobileAdsAdLoadCallback(this, i, str, readableMap)));
            int i5 = onWarmupCompleted + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = onExtraCallback + 73;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", "null-activity");
        Object[] objArr = new Object[1];
        a(new char[]{16996, 34025, 53104, 4597, 22652, 41719, 58738}, TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 50821, objArr);
        writableMapCreateMap.putString(((String) objArr[0]).intern(), "Ad attempted to load but the current Activity was null.");
        sendAdEvent("error", i, str, writableMapCreateMap, null);
    }

    private static final void load$lambda$0(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, Activity activity, String str, AdManagerAdRequest adManagerAdRequest, ReactNativeGoogleMobileAdsAdLoadCallback reactNativeGoogleMobileAdsAdLoadCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(adManagerAdRequest);
        reactNativeGoogleMobileAdsFullScreenAdModule.loadAd(activity, str, adManagerAdRequest, reactNativeGoogleMobileAdsAdLoadCallback);
        int i4 = onWarmupCompleted + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void show(int i, @NotNull String str, @NotNull ReadableMap readableMap, @NotNull Promise promise) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(readableMap, "");
            Intrinsics.checkNotNullParameter(promise, "");
            getCurrentActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        Intrinsics.checkNotNullParameter(promise, "");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            ReactNativeModule.rejectPromiseWithCodeAndMessage(promise, "null-activity", "Ad attempted to show but the current Activity was null.");
            return;
        }
        currentActivity.runOnUiThread(new ReactNativeGoogleMobileAdsFullScreenAdModule$.ExternalSyntheticLambda1(this, i, readableMap, currentActivity, promise, str));
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void show$lambda$0$0(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, int i, String str, RewardItem rewardItem) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rewardItem, "");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Object[] objArr = new Object[1];
        a(new char[]{17021, 50763, 18959, 52957}, 33851 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        writableMapCreateMap.putString(((String) objArr[0]).intern(), rewardItem.getType());
        writableMapCreateMap.putInt("amount", rewardItem.getAmount());
        reactNativeGoogleMobileAdsFullScreenAdModule.sendAdEvent("rewarded_earned_reward", i, str, null, writableMapCreateMap);
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    private static final void show$lambda$0(ReactNativeGoogleMobileAdsFullScreenAdModule reactNativeGoogleMobileAdsFullScreenAdModule, int i, ReadableMap readableMap, Activity activity, Promise promise, String str) {
        boolean z;
        int i2 = 2 % 2;
        ReactNativeGoogleMobileAdsAdHelper reactNativeGoogleMobileAdsAdHelper = new ReactNativeGoogleMobileAdsAdHelper(reactNativeGoogleMobileAdsFullScreenAdModule.adArray.get(i));
        if (readableMap.hasKey("immersiveModeEnabled")) {
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                readableMap.getBoolean("immersiveModeEnabled");
                throw null;
            }
            z = readableMap.getBoolean("immersiveModeEnabled");
        } else {
            z = false;
        }
        reactNativeGoogleMobileAdsAdHelper.onNavigationEvent(z);
        reactNativeGoogleMobileAdsAdHelper.onExtraCallbackWithResult(activity, new ReactNativeGoogleMobileAdsFullScreenAdModule$.ExternalSyntheticLambda0(reactNativeGoogleMobileAdsFullScreenAdModule, i, str));
        promise.resolve((Object) null);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
