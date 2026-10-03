package o;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SignatureRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPixelSizeForBitmapConfig extends SignatureRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted;

    @SerializedName("name")
    private String name;

    @SerializedName("savingBox")
    private BitmapUtilWhenMappings savingBox;

    @SerializedName("seedMoney")
    private Long seedMoney;
    private static char[] IAuthTabCallback = {32418, 32439, 32419, 32427};
    private static int onNavigationEvent = -1184334000;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = true;

    public getPixelSizeForBitmapConfig() {
        this(null, null, null, 7, null);
    }

    public getPixelSizeForBitmapConfig(@Nullable BitmapUtilWhenMappings bitmapUtilWhenMappings, @Nullable Long l, @Nullable String str) {
        this.savingBox = bitmapUtilWhenMappings;
        this.seedMoney = l;
        this.name = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getPixelSizeForBitmapConfig(BitmapUtilWhenMappings bitmapUtilWhenMappings, Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackDefault + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            bitmapUtilWhenMappings = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallbackDefault + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            l = null;
        }
        this(bitmapUtilWhenMappings, l, (i & 4) != 0 ? null : str);
    }

    @Override // viva.republica.toss.network.model.SignatureRequest
    public String onNavigationEvent(@NotNull String str) throws Throwable {
        String strOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Gson gson = new Gson();
        BitmapUtilWhenMappings bitmapUtilWhenMappings = this.savingBox;
        if (bitmapUtilWhenMappings != null) {
            int i2 = IAuthTabCallbackDefault + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                getEmbedViewManager.onNavigationEvent(bitmapUtilWhenMappings);
                throw null;
            }
            strOnNavigationEvent = getEmbedViewManager.onNavigationEvent(bitmapUtilWhenMappings);
        } else {
            int i3 = IAuthTabCallbackDefault + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            strOnNavigationEvent = null;
        }
        JsonObject jsonObject = (JsonObject) gson.fromJson(strOnNavigationEvent, JsonObject.class);
        jsonObject.addProperty("seedMoney", this.seedMoney);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), this.name);
        jsonObject.addProperty("organization", ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallbackWithResult());
        jsonObject.addProperty("userName", PlayerErrorCode.onPostMessage());
        jsonObject.addProperty("userBirthday", PlayerErrorCode.extraCallback());
        jsonObject.addProperty("date", str);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 76, 20951 - Process.getGidForName(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 75, 16037 - (KeyEvent.getMaxKeyCode() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallbackWithResult) {
                int i4 = $10 + 1;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 15;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 64, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (onExtraCallback) {
                int i8 = $10 + 65;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getTouchSlop() >> 8) + 63, 12214 - TextUtils.getOffsetAfter("", 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 35;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i11 = $10 + 71;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            String str = new String(cArr6);
            int i13 = $11 + 105;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
