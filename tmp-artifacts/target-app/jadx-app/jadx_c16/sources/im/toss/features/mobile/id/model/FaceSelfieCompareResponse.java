package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.FaceSelfieCompareResponse$;
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
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FaceSelfieCompareResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String casDID;
    private final String encFaceAccessToken;
    private final boolean result;

    static {
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onNavigationEvent + 109;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceSelfieCompareResponse)) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FaceSelfieCompareResponse faceSelfieCompareResponse = (FaceSelfieCompareResponse) obj;
        if (this.result != faceSelfieCompareResponse.result) {
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.encFaceAccessToken, faceSelfieCompareResponse.encFaceAccessToken)) {
            int i6 = onExtraCallback + 3;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.casDID, faceSelfieCompareResponse.casDID)) {
            return true;
        }
        int i8 = onWarmupCompleted + 5;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 51 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Boolean.hashCode(this.result) / 70) >> this.encFaceAccessToken.hashCode()) - 103) - this.casDID.hashCode() : (((Boolean.hashCode(this.result) * 31) + this.encFaceAccessToken.hashCode()) * 31) + this.casDID.hashCode();
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.result;
        String str = this.encFaceAccessToken;
        String str2 = this.casDID;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{63359, 63289, 40818, 6890, 58571, 11066, 61274, 47796, 57544, 34642, 51057, 33427, 55518, 44878, 57138, 60134, 45246, 55103, 46900, 62175, 43146, 65329, 36652, 55858, 32891, 59368, 26563, 8726, 30786, 3987, 32755, 2588, 20528, 14250, 22409, 4713, 18530}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(new char[]{57097, 57125, 17506, 49595, 13896, 45520, 15839, 8277, 51342, 23584, 5631, 6268, 61604, 29755, 3473, 28672, 39104, 3181, 26021, 26643, 33014, 9305, 23983, 16581, 43072}, -Process.getGidForName(""), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new char[]{59704, 59668, 42632, 9041, 23129, 55869, 20936, 19383, 65199, 48840, 31174, 29622, 50893}, KeyEvent.keyCodeFromString("") + 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        a(new char[]{33655, 33630, 5888, 16627, 24413}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ FaceSelfieCompareResponse(int i, boolean z, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onWarmupCompleted + 85;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = FaceSelfieCompareResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 93;
            } else {
                descriptor = FaceSelfieCompareResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.result = z;
        this.encFaceAccessToken = str;
        this.casDID = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(FaceSelfieCompareResponse faceSelfieCompareResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, faceSelfieCompareResponse.result);
        vylVar.onExtraCallback(serialDescriptor, 1, faceSelfieCompareResponse.encFaceAccessToken);
        vylVar.onExtraCallback(serialDescriptor, 2, faceSelfieCompareResponse.casDID);
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.encFaceAccessToken;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 27;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 83;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 45812), TextUtils.getTrimmedLength("") + 84, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.alpha(0)), TextUtils.getOffsetAfter("", 0) + 19, View.resolveSizeAndState(0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onExtraCallback() {
        IAuthTabCallback = 5614110899121880821L;
    }
}
