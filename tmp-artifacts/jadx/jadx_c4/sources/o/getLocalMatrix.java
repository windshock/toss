package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getLocalMatrix {
    private static int IAuthTabCallback = 0;
    public static final getLocalMatrix onExtraCallback = new getLocalMatrix();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 73;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getLocalMatrix() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult DISABLED_BY_PRIVACY_RIGHTS;
        public static final onExtraCallbackWithResult FILTERED;
        private static long IAuthTabCallback = 0;
        public static final onExtraCallbackWithResult NO_FILL;
        public static final onExtraCallbackWithResult OTHER;
        public static final onExtraCallbackWithResult PRIVACY_CONSENT_NOT_READY;
        public static final onExtraCallbackWithResult TIMEOUT;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String value;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {DISABLED_BY_PRIVACY_RIGHTS, NO_FILL, TIMEOUT, FILTERED, PRIVACY_CONSENT_NOT_READY, OTHER};
            int i5 = i2 + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            EnumEntries<onExtraCallbackWithResult> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 61 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i2 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onExtraCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            onExtraCallbackWithResult();
            DISABLED_BY_PRIVACY_RIGHTS = new onExtraCallbackWithResult("DISABLED_BY_PRIVACY_RIGHTS", 0, "disabled_by_privacy_rights");
            NO_FILL = new onExtraCallbackWithResult("NO_FILL", 1, "no_fill");
            Object[] objArr = new Object[1];
            a(new char[]{18091, 27209, 8012, 49223, 62796, 42577, 19281}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11518, objArr);
            TIMEOUT = new onExtraCallbackWithResult("TIMEOUT", 2, ((String) objArr[0]).intern());
            FILTERED = new onExtraCallbackWithResult("FILTERED", 3, "filtered");
            PRIVACY_CONSENT_NOT_READY = new onExtraCallbackWithResult("PRIVACY_CONSENT_NOT_READY", 4, "privacy_consent_not_ready");
            OTHER = new onExtraCallbackWithResult("OTHER", 5, "other");
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 91;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 24 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + (IAuthTabCallback & 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58, 6383 - View.combineMeasuredStates(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), Color.blue(0) + 24, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 59, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 97;
            $11 = i6 % 128;
            while (true) {
                int i7 = i6 % 2;
                if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 59 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 6383 - View.resolveSizeAndState(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i6 = $11 + 49;
                $10 = i6 % 128;
            }
        }

        static void onExtraCallbackWithResult() {
            IAuthTabCallback = -4945002297715735576L;
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull onExtraCallbackWithResult onextracallbackwithresult, long j, @Nullable LoadAdError loadAdError, @Nullable Throwable th) throws Throwable {
        String responseId;
        String domain;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("ad_unit_id", str);
        mapOnExtraCallback.put("failure_reason", onextracallbackwithresult.getValue());
        mapOnExtraCallback.put("timeout_seconds", Long.valueOf(j / 1000));
        if (loadAdError != null && (domain = loadAdError.getDomain()) != null) {
            if (StringsKt.isBlank(domain)) {
                int i2 = IAuthTabCallback + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                domain = null;
            }
            if (domain != null) {
                mapOnExtraCallback.put("error_domain", domain);
            }
        }
        if (loadAdError != null) {
            mapOnExtraCallback.put("error_code", Integer.valueOf(loadAdError.getCode()));
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 3;
            }
        }
        if (loadAdError != null) {
            int i5 = IAuthTabCallback + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            String message = loadAdError.getMessage();
            if (message != null) {
                if (StringsKt.isBlank(message)) {
                    message = null;
                }
                if (message != null) {
                    int i7 = onWarmupCompleted + 89;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        mapOnExtraCallback.put("error_message", message);
                        int i8 = 23 / 0;
                    } else {
                        mapOnExtraCallback.put("error_message", message);
                    }
                }
            }
        }
        if (loadAdError != null) {
            int i9 = IAuthTabCallback + 7;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            ResponseInfo responseInfo = loadAdError.getResponseInfo();
            if (responseInfo != null && (responseId = responseInfo.getResponseId()) != null) {
                int i11 = onWarmupCompleted + 103;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                if (StringsKt.isBlank(responseId)) {
                    responseId = null;
                }
                if (responseId != null) {
                    int i13 = onWarmupCompleted + 19;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    mapOnExtraCallback.put("response_id", responseId);
                }
            }
        }
        if (th != null) {
            int i15 = onWarmupCompleted + 27;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            String message2 = th.getMessage();
            if (message2 != null) {
                int i17 = IAuthTabCallback + 103;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                String str2 = !StringsKt.isBlank(message2) ? message2 : null;
                if (str2 != null) {
                    mapOnExtraCallback.put("error_message", str2);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "global_admob_load_failure", (String) null, access8100.onExtraCallbackWithResult(mapOnExtraCallback), "global_admob", false, (String) null, 50, (Object) null);
    }

    public final onExtraCallbackWithResult onWarmupCompleted(@NotNull LoadAdError loadAdError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(loadAdError, "");
        if (loadAdError.getCode() == 3) {
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onExtraCallbackWithResult.NO_FILL;
        }
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.OTHER;
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return onextracallbackwithresult;
    }
}
