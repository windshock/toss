package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getAdvertisingId {
    String getKey();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult implements getAdvertisingId {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult ParentModeAllTabShowAlarm = new onExtraCallbackWithResult("ParentModeAllTabShowAlarm", 0, "parentMode.allTab.showAlarm");
        public static final onExtraCallbackWithResult StreamTradingActivated = new onExtraCallbackWithResult("StreamTradingActivated", 1, "trading.streamTrading.activated");
        public static final onExtraCallbackWithResult TradingEdgeTradingHaltBitcoin = new onExtraCallbackWithResult("TradingEdgeTradingHaltBitcoin", 2, "trading.edgeTrading.halt.bitcoin");
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String key;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {ParentModeAllTabShowAlarm, StreamTradingActivated, TradingEdgeTradingHaltBitcoin};
            int i5 = i3 + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            int i5 = onExtraCallbackWithResult + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.key = str2;
        }

        @Override // o.getAdvertisingId
        public String getKey() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.key;
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return str;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 53;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public interface IAuthTabCallback extends getAdvertisingId {
        onExtraCallback getTargetKey();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
            public static final onExtraCallbackWithResult AppBridgeDedupWhitelist;
            public static final onExtraCallbackWithResult BaseComponentEmployee;
            public static final onExtraCallbackWithResult BaseComponentPercent;
            public static final onExtraCallbackWithResult EarningCallChatEnabled;
            public static final onExtraCallbackWithResult EarningCallMediaServiceLogEnabled;
            public static final onExtraCallbackWithResult EarningCallPipEnabled;
            public static final onExtraCallbackWithResult EarningCallPipHideAppBridgeEnabled;
            public static final onExtraCallbackWithResult EarningCallSessionMaxCount;
            public static final onExtraCallbackWithResult EarningCallUpcomingDescriptionLink;
            public static final onExtraCallbackWithResult EnableNativeMtsNotificationSse;
            public static final onExtraCallbackWithResult EnableNativePushMessageSse;
            public static final onExtraCallbackWithResult FeatureControlEmployeeOnlyReleasedKeys;
            public static final onExtraCallbackWithResult FeatureControlEnabled;
            public static final onExtraCallbackWithResult FeatureControlFallbackKeys;
            public static final onExtraCallbackWithResult FeatureControlLogLevel;
            public static final onExtraCallbackWithResult FeatureControlMaxCachingSize;
            public static final onExtraCallbackWithResult HighTextContrastGuideMaxClickCount;
            public static final onExtraCallbackWithResult HighTextContrastGuideMaxExposureCount;
            public static final onExtraCallbackWithResult HomeCircuitBreakerBadgeEnabled;
            public static final onExtraCallbackWithResult HomeMarketFoldable;
            public static final onExtraCallbackWithResult HomeNativeAiEntryEnabled;
            public static final onExtraCallbackWithResult HomeNativeAiEntryInteractionEnabled;
            public static final onExtraCallbackWithResult HomeNativeAiEntryPath;
            private static char[] IAuthTabCallback = null;
            public static final onExtraCallbackWithResult KrxExtendedHoursEnabled;
            public static final onExtraCallbackWithResult NativeAuthEnabled;
            public static final onExtraCallbackWithResult NativeEnabled;
            public static final onExtraCallbackWithResult NewPriceEnabled;
            public static final onExtraCallbackWithResult NoneBreakPolicyEnabled;
            public static final onExtraCallbackWithResult OnboardingHidePercentage;
            public static final onExtraCallbackWithResult OnboardingShowPercentage;
            public static final onExtraCallbackWithResult RequiredVersion;
            public static final onExtraCallbackWithResult SocketConnectSeparatelyEmployee;
            public static final onExtraCallbackWithResult SocketConnectSeparatelyPercent;
            public static final onExtraCallbackWithResult TubaV1Shared;
            public static final onExtraCallbackWithResult TubaV2Shared;
            public static final onExtraCallbackWithResult WatchListCheetahEntryEnabled;
            private static int asInterface = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static char onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            private final String key;
            private final onExtraCallback targetKey;

            private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                onExtraCallbackWithResult[] onextracallbackwithresultArr = {NativeAuthEnabled, NativeEnabled, RequiredVersion, NoneBreakPolicyEnabled, OnboardingHidePercentage, OnboardingShowPercentage, EarningCallPipEnabled, EarningCallPipHideAppBridgeEnabled, HighTextContrastGuideMaxExposureCount, HighTextContrastGuideMaxClickCount, EarningCallUpcomingDescriptionLink, WatchListCheetahEntryEnabled, NewPriceEnabled, KrxExtendedHoursEnabled, FeatureControlEnabled, FeatureControlFallbackKeys, FeatureControlMaxCachingSize, FeatureControlLogLevel, FeatureControlEmployeeOnlyReleasedKeys, TubaV1Shared, EarningCallSessionMaxCount, TubaV2Shared, SocketConnectSeparatelyEmployee, SocketConnectSeparatelyPercent, BaseComponentEmployee, BaseComponentPercent, HomeNativeAiEntryPath, HomeNativeAiEntryInteractionEnabled, HomeNativeAiEntryEnabled, AppBridgeDedupWhitelist, EarningCallMediaServiceLogEnabled, EnableNativePushMessageSse, EnableNativeMtsNotificationSse, EarningCallChatEnabled, HomeMarketFoldable, HomeCircuitBreakerBadgeEnabled};
                int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackwithresultArr;
            }

            public static EnumEntries<onExtraCallbackWithResult> getEntries() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return $ENTRIES;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static onExtraCallbackWithResult valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
                int i4 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return onextracallbackwithresult;
            }

            public static onExtraCallbackWithResult[] values() {
                onExtraCallbackWithResult[] onextracallbackwithresultArr;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                    int i3 = 37 / 0;
                } else {
                    onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                }
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 15 / 0;
                }
                return onextracallbackwithresultArr;
            }

            private onExtraCallbackWithResult(String str, int i, String str2, onExtraCallback onextracallback) {
                this.key = str2;
                this.targetKey = onextracallback;
            }

            @Override // o.getAdvertisingId
            public String getKey() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str = this.key;
                int i5 = i2 + 49;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.getAdvertisingId.IAuthTabCallback
            public onExtraCallback getTargetKey() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                onExtraCallback onextracallback = this.targetKey;
                int i5 = i3 + 93;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return onextracallback;
                }
                throw null;
            }

            static {
                onWarmupCompleted();
                onExtraCallback onextracallback = onExtraCallback.CDN;
                NativeAuthEnabled = new onExtraCallbackWithResult("NativeAuthEnabled", 0, "android.auth.shared", onextracallback);
                NativeEnabled = new onExtraCallbackWithResult("NativeEnabled", 1, "android.native.enabled", onextracallback);
                RequiredVersion = new onExtraCallbackWithResult("RequiredVersion", 2, "android.securities.required.version", onextracallback);
                NoneBreakPolicyEnabled = new onExtraCallbackWithResult("NoneBreakPolicyEnabled", 3, "none.break.policy.enabled", onextracallback);
                OnboardingHidePercentage = new onExtraCallbackWithResult("OnboardingHidePercentage", 4, "android.native.onboarding.hide.percentage", onextracallback);
                OnboardingShowPercentage = new onExtraCallbackWithResult("OnboardingShowPercentage", 5, "android.native.onboarding.show.percentage", onextracallback);
                EarningCallPipEnabled = new onExtraCallbackWithResult("EarningCallPipEnabled", 6, "android.earningCall.pip.enabled", onextracallback);
                Object[] objArr = new Object[1];
                a(new char[]{29, 15, '\b', 21, ' ', 23, 26, 24, '\f', 5, 1, 5, ' ', 5, 29, 30, '\r', 1, 14, 1, 0, 14, 11, '!', '\r', 31, '!', 25, 23, 14, 24, 2, 1, '\r'}, (byte) (72 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), 34 - Color.alpha(0), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new char[]{14, 23, '\b', '\n', 17, 5, '\t', 19, '#', '\r', '\b', 21, ' ', 23, 26, 24, '\f', 5, 3, 18, 5, ' ', 3, 20, 5, '!', '\r', 1, 14, 1, 0, 14, 11, '!', '\r', 31, '!', 19, ' ', 19, 14, 29, 1, 30, 13885}, (byte) ((Process.myTid() >> 22) + 63), 45 - Color.alpha(0), objArr2);
                EarningCallPipHideAppBridgeEnabled = new onExtraCallbackWithResult(strIntern, 7, ((String) objArr2[0]).intern(), onextracallback);
                HighTextContrastGuideMaxExposureCount = new onExtraCallbackWithResult("HighTextContrastGuideMaxExposureCount", 8, "android.home.high_text_contrast_guide.max_exposure_count", onextracallback);
                HighTextContrastGuideMaxClickCount = new onExtraCallbackWithResult("HighTextContrastGuideMaxClickCount", 9, "android.home.high_text_contrast_guide.max_click_count", onextracallback);
                EarningCallUpcomingDescriptionLink = new onExtraCallbackWithResult("EarningCallUpcomingDescriptionLink", 10, "dsvc.earning_call.description.link", onextracallback);
                WatchListCheetahEntryEnabled = new onExtraCallbackWithResult("WatchListCheetahEntryEnabled", 11, "watchlist.cheetah.entry_v2.enabled", onextracallback);
                NewPriceEnabled = new onExtraCallbackWithResult("NewPriceEnabled", 12, "android.new_price.enabled", onextracallback);
                onExtraCallback onextracallback2 = onExtraCallback.DEVICE_ID_AND_GA;
                KrxExtendedHoursEnabled = new onExtraCallbackWithResult("KrxExtendedHoursEnabled", 13, "market.krx.extendedHours.enabled", onextracallback2);
                FeatureControlEnabled = new onExtraCallbackWithResult("FeatureControlEnabled", 14, "android.native.featureControl.enabled", onextracallback);
                FeatureControlFallbackKeys = new onExtraCallbackWithResult("FeatureControlFallbackKeys", 15, "android.native.featureControl.fallbackKeys", onextracallback);
                FeatureControlMaxCachingSize = new onExtraCallbackWithResult("FeatureControlMaxCachingSize", 16, "android.native.featureControl.maxCachingSize", onextracallback);
                FeatureControlLogLevel = new onExtraCallbackWithResult("FeatureControlLogLevel", 17, "android.native.featureControl.logLevel", onextracallback);
                FeatureControlEmployeeOnlyReleasedKeys = new onExtraCallbackWithResult("FeatureControlEmployeeOnlyReleasedKeys", 18, "android.native.featureControl.employeeOnlyReleasedKeys", onextracallback);
                TubaV1Shared = new onExtraCallbackWithResult("TubaV1Shared", 19, "android.tubaV1.shared", onextracallback);
                EarningCallSessionMaxCount = new onExtraCallbackWithResult("EarningCallSessionMaxCount", 20, "android.earningCall.maxSession", onextracallback);
                TubaV2Shared = new onExtraCallbackWithResult("TubaV2Shared", 21, "android.tubaV2.shared", onextracallback);
                SocketConnectSeparatelyEmployee = new onExtraCallbackWithResult("SocketConnectSeparatelyEmployee", 22, "android.socket.connectSeparately.employee", onextracallback);
                SocketConnectSeparatelyPercent = new onExtraCallbackWithResult("SocketConnectSeparatelyPercent", 23, "android.socket.connectSeparately.percent", onextracallback);
                BaseComponentEmployee = new onExtraCallbackWithResult("BaseComponentEmployee", 24, "android.refactor.baseComponent.employee", onextracallback);
                BaseComponentPercent = new onExtraCallbackWithResult("BaseComponentPercent", 25, "android.refactor.baseComponent.percent", onextracallback);
                HomeNativeAiEntryPath = new onExtraCallbackWithResult("HomeNativeAiEntryPath", 26, "home.native.aiEntry.path", onextracallback);
                HomeNativeAiEntryInteractionEnabled = new onExtraCallbackWithResult("HomeNativeAiEntryInteractionEnabled", 27, "home.native.aiEntry.interaction.enabled", onextracallback);
                HomeNativeAiEntryEnabled = new onExtraCallbackWithResult("HomeNativeAiEntryEnabled", 28, "home.native.aiEntry.enabled", onextracallback);
                Object[] objArr3 = new Object[1];
                a(new char[]{14, 1, 0, 14, 11, '!', '\r', 31, '\"', 25, 1, '\r', 14, 4, '!', 4, 30, 31, 30, 1, 31, 23, 13878}, (byte) (72 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a(new char[]{23, 14, 31, 30, 7, 30, 23, 15, 13894, 13894, 27, '\b', 31, 11, 31, 1, 20, '\t', '\f', 5, 3, 18, '\r', 1, '\n', '\r', 3, 20, 21, 4, 30, 31, 30, 1, 31, 23, 13898}, (byte) (92 - View.MeasureSpec.makeMeasureSpec(0, 0)), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
                AppBridgeDedupWhitelist = new onExtraCallbackWithResult(strIntern2, 29, ((String) objArr4[0]).intern(), onextracallback);
                EarningCallMediaServiceLogEnabled = new onExtraCallbackWithResult("EarningCallMediaServiceLogEnabled", 30, "android.earningCall.mediaServiceLog.enabled", onextracallback);
                EnableNativePushMessageSse = new onExtraCallbackWithResult("EnableNativePushMessageSse", 31, "sse.pushMessage.native.enabled", onextracallback2);
                EnableNativeMtsNotificationSse = new onExtraCallbackWithResult("EnableNativeMtsNotificationSse", 32, "sse.mtsNotification.native.enabled", onextracallback2);
                EarningCallChatEnabled = new onExtraCallbackWithResult("EarningCallChatEnabled", 33, "earningCall.native.chat.open", onextracallback2);
                HomeMarketFoldable = new onExtraCallbackWithResult("HomeMarketFoldable", 34, "home.market.foldable_enabled", onextracallback2);
                HomeCircuitBreakerBadgeEnabled = new onExtraCallbackWithResult("HomeCircuitBreakerBadgeEnabled", 35, "home.circuit_breaker.badge_enabled", onextracallback2);
                onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
                $VALUES = onextracallbackwithresultArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
                int i = onExtraCallback + 59;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
                char[] cArr2 = IAuthTabCallback;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i4 = $10 + 53;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-16777190) - Color.rgb(0, 0, 0), 23139 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                            defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                                int i7 = $11 + 93;
                                $10 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback << b);
                                } else {
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                                }
                                obj = obj2;
                            } else {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 74, 8088 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) + 30, 19489 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        int i9 = $11 + 113;
                                        $10 = i9 % 128;
                                        int i10 = i9 % 2;
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                    } else {
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                    }
                                }
                            }
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i15 = 0; i15 < i; i15++) {
                        cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            static void onWarmupCompleted() {
                IAuthTabCallback = new char[]{64991, 65066, 64963, 64987, 64995, 65067, 64965, 64983, 64976, 64961, 65065, 64988, 65009, 65010, 64990, 65064, 64966, 64978, 64979, 64960, 64989, 64925, 64964, 65068, 65019, 64980, 64977, 65014, 65015, 65008, 64967, 64982, 65069, 64981, 64996, 64986};
                onNavigationEvent = (char) 51247;
            }
        }

        /* renamed from: o.getAdvertisingId$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0029IAuthTabCallback implements IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final onExtraCallback IAuthTabCallback;
            private final String onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0029IAuthTabCallback)) {
                    int i5 = i3 + 69;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                C0029IAuthTabCallback c0029IAuthTabCallback = (C0029IAuthTabCallback) obj;
                if (!Intrinsics.areEqual(this.onExtraCallback, c0029IAuthTabCallback.onExtraCallback)) {
                    return false;
                }
                if (this.IAuthTabCallback == c0029IAuthTabCallback.IAuthTabCallback) {
                    return true;
                }
                int i7 = onWarmupCompleted + 17;
                int i8 = i7 % 128;
                onExtraCallbackWithResult = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 123;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
                int i4 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Dynamic(key=" + this.onExtraCallback + ", targetKey=" + this.IAuthTabCallback + ")";
                int i2 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public C0029IAuthTabCallback(@NotNull String str, @NotNull onExtraCallback onextracallback) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(onextracallback, "");
                this.onExtraCallback = str;
                this.IAuthTabCallback = onextracallback;
            }

            @Override // o.getAdvertisingId
            public String getKey() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onExtraCallback;
                if (i3 == 0) {
                    int i4 = 99 / 0;
                }
                return str;
            }

            @Override // o.getAdvertisingId.IAuthTabCallback
            public onExtraCallback getTargetKey() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.IAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onWarmupCompleted Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onExtraCallback DEVICE_ID_ONLY = new onExtraCallback("DEVICE_ID_ONLY", 0);
        public static final onExtraCallback DEVICE_ID_AND_GA = new onExtraCallback("DEVICE_ID_AND_GA", 1);
        public static final onExtraCallback CDN = new onExtraCallback("CDN", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return new onExtraCallback[]{DEVICE_ID_ONLY, DEVICE_ID_AND_GA, CDN};
            }
            onExtraCallback onextracallback = DEVICE_ID_ONLY;
            onExtraCallback onextracallback2 = DEVICE_ID_AND_GA;
            onExtraCallback onextracallback3 = CDN;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[4];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[0] = onextracallback2;
            onextracallbackArr[2] = onextracallback3;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            Companion = new onWarmupCompleted(null);
            int i = onNavigationEvent + 19;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            public final onExtraCallback IAuthTabCallback(@Nullable String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 29;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String upperCase = null;
                if (str != null) {
                    int i5 = i2 + 73;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.checkNotNullExpressionValue(str.toUpperCase(Locale.ROOT), "");
                        upperCase.hashCode();
                        throw null;
                    }
                    upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                } else {
                    int i6 = i2 + 27;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
                if (!(!Intrinsics.areEqual(upperCase, "MEMBER"))) {
                    return onExtraCallback.DEVICE_ID_AND_GA;
                }
                if (Intrinsics.areEqual(upperCase, "CDN")) {
                    return onExtraCallback.CDN;
                }
                onExtraCallback onextracallback = onExtraCallback.DEVICE_ID_ONLY;
                int i8 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return onextracallback;
            }
        }
    }
}
