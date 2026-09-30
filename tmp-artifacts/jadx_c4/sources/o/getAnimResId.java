package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAnimResId {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 40881;
    private static char IAuthTabCallbackDefault = 12172;
    private static int asBinder = 0;
    private static char onNavigationEvent = 19089;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 11327;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 55;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getAnimResId)) {
            int i4 = asBinder + 109;
            onTransact = i4 % 128;
            return i4 % 2 == 0;
        }
        getAnimResId getanimresid = (getAnimResId) obj;
        if (this.onExtraCallbackWithResult != getanimresid.onExtraCallbackWithResult) {
            return false;
        }
        if (this.onExtraCallback == getanimresid.onExtraCallback) {
            return true;
        }
        int i5 = asBinder + 21;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.onExtraCallbackWithResult) * 31) + Integer.hashCode(this.onExtraCallback);
        int i4 = asBinder + 7;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.onExtraCallbackWithResult;
        int i3 = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{25578, 9708, 51855, 6843, 21169, 16171, 61230, 60373, 13350, 37412}, 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(new char[]{27337, 59268, 49458, 11482}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a(new char[]{55402, 41234}, (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i4 = onTransact + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public getAnimResId(int i, int i2) {
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = i2;
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 == 0) {
            i = this.onExtraCallbackWithResult;
            int i5 = 5 / 0;
        } else {
            i = this.onExtraCallbackWithResult;
        }
        int i6 = i4 + 81;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 81;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 125;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                        int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                        int iIndexOf = 12434 - TextUtils.indexOf("", "", 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, i12, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10 - View.MeasureSpec.makeMeasureSpec(0, 0), 12434 - Color.red(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ExpandableListView.getPackedPositionGroup(0L)), ExpandableListView.getPackedPositionGroup(0L) + 14, 19901 - View.combineMeasuredStates(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $11 + 63;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }
}
