package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.MobileIdTagLocationRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdTagLocationRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String authToken;
    private final String modelName;
    private final String osType;
    private final String txId;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 3;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof MobileIdTagLocationRequest) {
            MobileIdTagLocationRequest mobileIdTagLocationRequest = (MobileIdTagLocationRequest) obj;
            return Intrinsics.areEqual(this.txId, mobileIdTagLocationRequest.txId) && Intrinsics.areEqual(this.authToken, mobileIdTagLocationRequest.authToken) && Intrinsics.areEqual(this.modelName, mobileIdTagLocationRequest.modelName) && Intrinsics.areEqual(this.osType, mobileIdTagLocationRequest.osType);
        }
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.txId.hashCode() * 31) + this.authToken.hashCode()) * 31) + this.modelName.hashCode()) * 31) + this.osType.hashCode();
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.txId;
        String str2 = this.authToken;
        String str3 = this.modelName;
        String str4 = this.osType;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{2199, 65249, 38418, 2266, 12969, 55645, 3646, 48449, 14439, 583, 24241, 19496, 27131, 54239, 28659, 7356, 39212, 41849, 48209, 12128, 51854, 28697, 52418, 65514, 64510, 16803, 7485, 36537, 11084, 4442, 11724, 20788, 23723, 57027, 31460, 25049}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{37636, 48916, 52725, 37672, 29459, 41058, 21978, 50274, 41964, 17343, 1355, 13596, 62039, 37422, 13341, 26098}, -TextUtils.lastIndexOf("", '0', 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{50772, 24418, 24152, 50808, 37733, 46549, 50811, 53711, 63148, 41924, 38622, 8330, 42765, 29264, 42939, 28741}, Color.argb(0, 0, 0, 0) + 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str3);
        Object[] objArr4 = new Object[1];
        a(new char[]{35060, 61846, 51105, 35032, 15761, 8269, 24448, 17483, 47164, 3372, 3899, 46393, 59889}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str4);
        Object[] objArr5 = new Object[1];
        a(new char[]{2361, 23729, 6926, 2320, 55577}, Gravity.getAbsoluteGravity(0, 0) + 1, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public /* synthetic */ MobileIdTagLocationRequest(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, MobileIdTagLocationRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.txId = str;
        this.authToken = str2;
        this.modelName = str3;
        this.osType = str4;
    }

    public MobileIdTagLocationRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.txId = str;
        this.authToken = str2;
        this.modelName = str3;
        this.osType = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(MobileIdTagLocationRequest mobileIdTagLocationRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, mobileIdTagLocationRequest.txId);
            vylVar.onExtraCallback(serialDescriptor, 1, mobileIdTagLocationRequest.authToken);
            vylVar.onExtraCallback(serialDescriptor, 2, mobileIdTagLocationRequest.modelName);
            i = 5;
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, mobileIdTagLocationRequest.txId);
            vylVar.onExtraCallback(serialDescriptor, 1, mobileIdTagLocationRequest.authToken);
            vylVar.onExtraCallback(serialDescriptor, 2, mobileIdTagLocationRequest.modelName);
            i = 3;
        }
        vylVar.onExtraCallback(serialDescriptor, i, mobileIdTagLocationRequest.osType);
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 11;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 39;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0')), View.getDefaultSize(0, 0) + 84, 21233 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 14185), TextUtils.indexOf("", "") + 19, 8807 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i8 = $10 + 97;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 4;
                }
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

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -5598479240606206165L;
    }
}
