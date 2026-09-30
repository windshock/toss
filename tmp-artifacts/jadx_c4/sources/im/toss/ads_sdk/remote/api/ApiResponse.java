package im.toss.ads_sdk.remote.api;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.remote.api.ApiResponse$;
import im.toss.ads_sdk.remote.api.ApiServerError$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ALCEyeBlink;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.liq;
import o.okycx;
import o.py;
import o.setAnimationsLoop;
import o.setCurrentItemInternal;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public class ApiResponse<T> extends setCurrentItemInternal {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final SerialDescriptor $cachedDescriptor;
    public static final int $stable;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static final Gson gson;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;
    private ApiServerError error;
    private String resultType;
    private T success;

    public ApiResponse() {
        this.resultType = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ApiResponse(int i, String str, Object obj, ApiServerError apiServerError, okycx okycxVar) {
        this.resultType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.success = null;
            int i2 = IAuthTabCallback + 3;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.success = obj;
            int i4 = IAuthTabCallback + 19;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
            }
        }
        if ((i & 4) != 0) {
            this.error = apiServerError;
            return;
        }
        int i5 = IAuthTabCallback + 79;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        this.error = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(ApiResponse apiResponse, vyl vylVar, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(apiResponse.resultType, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, apiResponse.resultType);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = asInterface + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
                if (apiResponse.success != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) kSerializer, apiResponse.success);
                    int i6 = IAuthTabCallback + 65;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (apiResponse.success != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || apiResponse.error != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, ApiServerError$.serializer.INSTANCE, apiResponse.error);
        }
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        T t = this.success;
        int i5 = i2 + 51;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return t;
        }
        throw null;
    }

    public final ApiServerError onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.error;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{4, 5, 13838, 13838, 3, 5, 13822}, (byte) (53 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.resolveSize(0, 0) + 7, objArr);
        boolean zAreEqual = Intrinsics.areEqual(((String) objArr[0]).intern(), this.resultType);
        int i4 = asInterface + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return zAreEqual;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String json = gson.toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "");
        int i4 = IAuthTabCallback + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return json;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> KSerializer<ApiResponse<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(kSerializer, "");
            ApiResponse$.serializer serializerVar = new ApiResponse$.serializer(kSerializer);
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return serializerVar;
        }
    }

    static {
        onExtraCallback();
        Companion = new Companion(null);
        $stable = 8;
        GsonBuilder prettyPrinting = ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult().setPrettyPrinting();
        Object[] objArr = new Object[1];
        a(new char[]{13880, 13880, 13880, 13880, '\t', '\r', '\r', '\t', 13907, 13907, '\n', 4, 4, 2, 13900, 13900, 1, 0, 13886}, (byte) (85 - KeyEvent.getDeadChar(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, objArr);
        gson = prettyPrinting.setDateFormat(((String) objArr[0]).intern()).create();
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.api.ApiResponse", (aeu2) null, 3);
        setanimationsloop.onWarmupCompleted("resultType", true);
        setanimationsloop.onWarmupCompleted("success", true);
        setanimationsloop.onWarmupCompleted("error", true);
        $cachedDescriptor = setanimationsloop;
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 119;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(j) + 27, View.MeasureSpec.makeMeasureSpec(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 23139 - View.MeasureSpec.getMode(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                j = 0;
            }
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
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
                    int i10 = $10 + 9;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 24825), 73 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getSize(0) + 30, (Process.myTid() >> 22) + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i12 = $10 + 43;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{64905, 65014, 64904, 64960, 64998, 64926, 65019, 64992, 64915, 65022, 64983, 64906, 64970, 65008, 64990, 64907};
        onWarmupCompleted = (char) 51245;
    }
}
