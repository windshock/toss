package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addData2Performance {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private static char[] onNavigationEvent = {64991, 65067, 64986, 65064, 64977, 64966, 64967, 65069, 64961, 64990, 64923, 64978, 65065, 64976, 64983, 64982, 64927, 64997, 64992, 64922, 64989, 65066, 65009, 64971, 65008, 64995, 64980, 64969, 64988, 65013, 64910, 64915, 64979, 65068, 65018, 64981};
    private static char onTransact = 51247;
    private getCausesCount<Integer> IAuthTabCallback;
    private getCausesCount<Integer> onExtraCallback;
    private final getCausesCount<StartAction> onExtraCallbackWithResult;
    private getCausesCount<Double> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 1;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof addData2Performance)) {
            return false;
        }
        addData2Performance adddata2performance = (addData2Performance) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, adddata2performance.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, adddata2performance.onWarmupCompleted)) {
            int i4 = asInterface + 97;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, adddata2performance.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, adddata2performance.IAuthTabCallback)) {
            return true;
        }
        int i6 = asInterface + 9;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asInterface = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((this.onExtraCallbackWithResult.hashCode() >> 31) >>> this.onWarmupCompleted.hashCode()) * 46) - this.onExtraCallback.hashCode()) - 38) * this.IAuthTabCallback.hashCode() : (((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i3 = IAuthTabCallbackDefault + 125;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        getCausesCount<StartAction> getcausescount = this.onExtraCallbackWithResult;
        getCausesCount<Double> getcausescount2 = this.onWarmupCompleted;
        getCausesCount<Integer> getcausescount3 = this.onExtraCallback;
        getCausesCount<Integer> getcausescount4 = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{23, 17, 1, 3, 17, '\b', '\b', 0, 26, 22, '#', 17, 14, 16, ' ', 22, '\"', 29, 11, '\"', 7, 17, 16, 21, 29, 4, 26, 20, '\b', 26, 28, 20, 29, 22, 13831}, (byte) (96 - ExpandableListView.getPackedPositionType(0L)), 35 - View.resolveSize(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(getcausescount);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\r', '\"', 5, 17, 14, 16, 26, 29, '\t', 7, 4, 26, 18, ' '}, (byte) (99 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Process.getGidForName("") + 15, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getcausescount2);
        Object[] objArr3 = new Object[1];
        a(new char[]{'\r', '\"', 5, 17, 14, 16, 20, 0, '!', 21, 13848}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 113), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(getcausescount3);
        Object[] objArr4 = new Object[1];
        a(new char[]{'\r', '\"', 5, 17, 14, 16, 25, 29, 2, 23, '\f', 0}, (byte) (66 - MotionEvent.axisFromString("")), TextUtils.getOffsetBefore("", 0) + 12, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(getcausescount4);
        Object[] objArr5 = new Object[1];
        a(new char[]{13870}, (byte) (122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1 - ExpandableListView.getPackedPositionType(0L), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public addData2Performance(@NotNull getCausesCount<StartAction> getcausescount, @NotNull getCausesCount<Double> getcausescount2, @NotNull getCausesCount<Integer> getcausescount3, @NotNull getCausesCount<Integer> getcausescount4) {
        Intrinsics.checkNotNullParameter(getcausescount, "");
        Intrinsics.checkNotNullParameter(getcausescount2, "");
        Intrinsics.checkNotNullParameter(getcausescount3, "");
        Intrinsics.checkNotNullParameter(getcausescount4, "");
        this.onExtraCallbackWithResult = getcausescount;
        this.onWarmupCompleted = getcausescount2;
        this.onExtraCallback = getcausescount3;
        this.IAuthTabCallback = getcausescount4;
    }

    public final getCausesCount<StartAction> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getCausesCount<StartAction> getcausescount = this.onExtraCallbackWithResult;
        int i5 = i3 + 17;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Double> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Double> getcausescount = this.onWarmupCompleted;
        int i5 = i2 + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Integer> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Integer> getcausescount = this.onExtraCallback;
        int i5 = i2 + 89;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return getcausescount;
        }
        throw null;
    }

    public final getCausesCount<Integer> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Integer> getcausescount = this.IAuthTabCallback;
        int i5 = i2 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        float f = 0.0f;
        char c = '0';
        Object obj2 = null;
        char c2 = 11;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 26 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), TextUtils.indexOf("", c, 0, 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 11;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    f = 0.0f;
                    c = '0';
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
            Object[] objArr3 = {Integer.valueOf(onTransact)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 25 - TextUtils.lastIndexOf("", '0'), 23139 - TextUtils.indexOf("", ""), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 11;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i10 = i8 + 123;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[c2] = Integer.valueOf(cCharValue);
                        objArr4[10] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[9] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[6] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[3] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = defaultGainProviderExternalSyntheticLambda0;
                        objArr4[0] = defaultGainProviderExternalSyntheticLambda0;
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.MeasureSpec.getSize(0) + 74, 8087 - TextUtils.indexOf((CharSequence) "", '0', 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i12 = $11 + 5;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                c2 = 11;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c2 = 11;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            c2 = 11;
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
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
}
