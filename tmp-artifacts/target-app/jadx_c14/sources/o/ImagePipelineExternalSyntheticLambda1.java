package o;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImagePipelineExternalSyntheticLambda1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallbackWithResult = 162456180622952923L;
    private static int onWarmupCompleted;

    @SerializedName("niceDnrAutomobileInfo")
    private final JsonObject niceDnrAutomobileInfo;

    @SerializedName("progressType")
    private final String progressType;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImagePipelineExternalSyntheticLambda1() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImagePipelineExternalSyntheticLambda1)) {
            return false;
        }
        ImagePipelineExternalSyntheticLambda1 imagePipelineExternalSyntheticLambda1 = (ImagePipelineExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.progressType, imagePipelineExternalSyntheticLambda1.progressType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.niceDnrAutomobileInfo, imagePipelineExternalSyntheticLambda1.niceDnrAutomobileInfo)) {
            return true;
        }
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.progressType.hashCode() >> 25) / this.niceDnrAutomobileInfo.hashCode() : (this.progressType.hashCode() * 31) + this.niceDnrAutomobileInfo.hashCode();
        int i3 = onWarmupCompleted + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanAutomobileScrapeDto(progressType=" + this.progressType + ", niceDnrAutomobileInfo=" + this.niceDnrAutomobileInfo + ")";
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ImagePipelineExternalSyntheticLambda1(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.progressType = str;
        this.niceDnrAutomobileInfo = jsonObject;
    }

    public /* synthetic */ ImagePipelineExternalSyntheticLambda1(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            jsonObject = new JsonObject();
            int i5 = onWarmupCompleted + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(str, jsonObject);
    }

    public final JsonObject onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObject = this.niceDnrAutomobileInfo;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return jsonObject;
    }

    public final BufferedDiskCacheExternalSyntheticLambda6 onExtraCallback() throws Throwable {
        int i = 2 % 2;
        String str = this.progressType;
        Object[] objArr = new Object[1];
        a(new char[]{50943, 35365, 32862, 50860, 24776, 63655, 26035, 14350, 3558, 46149, 12551}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            if (!Intrinsics.areEqual(str, "FAILED")) {
                return BufferedDiskCacheExternalSyntheticLambda6.PENDING;
            }
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return BufferedDiskCacheExternalSyntheticLambda6.FAILED;
        }
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        BufferedDiskCacheExternalSyntheticLambda6 bufferedDiskCacheExternalSyntheticLambda6 = BufferedDiskCacheExternalSyntheticLambda6.SUCCESS;
        int i6 = IAuthTabCallback + 89;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return bufferedDiskCacheExternalSyntheticLambda6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getPressedStateDuration() >> 16)), 84 - (ViewConfiguration.getFadingEdgeLength() >> 16), 21232 - ImageFormat.getBitsPerPixel(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 19 - TextUtils.getCapsMode("", 0, 0), 8808 - ExpandableListView.getPackedPositionGroup(0L), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }
}
