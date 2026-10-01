package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PluginParamModel {
    private final AppTypeEnum<Float> IAuthTabCallback;
    private final AppTypeEnum<Float> IAuthTabCallbackDefault;
    private final AppTypeEnum<Float> IAuthTabCallbackStub;
    private final AppTypeEnum<Float> asBinder;
    private final AppTypeEnum<AnimUtils> asInterface;
    private final AppTypeEnum<Float> getInterfaceDescriptor;
    private final AppTypeEnum<Float> onExtraCallback;
    private final AppTypeEnum<Float> onExtraCallbackWithResult;
    private final AppTypeEnum<Float> onNavigationEvent;
    private final AppTypeEnum<Float> onTransact;
    private final AppTypeEnum<Float> onWarmupCompleted;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int readTypedObject = 1;
    private static long access100 = 7798559133331975163L;
    private static int IAuthTabCallbackStubProxy = -1776194565;
    private static char access000 = 44967;
    private static int IAuthTabCallback_Parcel = 478308937;

    private static String $$c(short s, short s2, byte b) {
        int i = b + 105;
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = s2 * 2;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = (-i) + i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i = (-bArr[i2]) + i;
            i4 = i5;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i6)) | i9 | (~(i8 | i6));
        int i11 = ~i6;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i5;
        int i14 = i + i5 + i4 + ((-700610695) * i2) + ((-1151578525) * i3);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i) + 1030029312 + ((-1366800679) * i5) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i2) + (367394816 * i3) + (374145024 * i15);
        int i17 = ((i * 323709325) - 650539883) + (i5 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i2 * (-499299047)) + (i3 * 1568885315) + (i15 * (-395509760));
        if (i16 + (i17 * i17 * (-772603904)) != 1) {
            return onNavigationEvent(objArr);
        }
        PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
        int i18 = 2 % 2;
        int i19 = readTypedObject;
        int i20 = i19 + 51;
        ICustomTabsCallback = i20 % 128;
        int i21 = i20 % 2;
        AppTypeEnum<Float> appTypeEnum = pluginParamModel.asBinder;
        int i22 = i19 + 27;
        ICustomTabsCallback = i22 % 128;
        int i23 = i22 % 2;
        return appTypeEnum;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginParamModel)) {
            return false;
        }
        PluginParamModel pluginParamModel = (PluginParamModel) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, pluginParamModel.onWarmupCompleted) || !Intrinsics.areEqual(this.onNavigationEvent, pluginParamModel.onNavigationEvent) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, pluginParamModel.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onTransact, pluginParamModel.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, pluginParamModel.getInterfaceDescriptor)) {
            int i2 = readTypedObject + 87;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, pluginParamModel.onExtraCallback)) {
            int i4 = readTypedObject + 79;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, pluginParamModel.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, pluginParamModel.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, pluginParamModel.IAuthTabCallback)) {
            int i6 = ICustomTabsCallback + 51;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, pluginParamModel.asInterface)) {
            int i8 = ICustomTabsCallback + 39;
            readTypedObject = i8 % 128;
            return i8 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.asBinder, pluginParamModel.asBinder)) {
            return true;
        }
        int i9 = readTypedObject + 63;
        ICustomTabsCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.getInterfaceDescriptor.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.asBinder.hashCode();
        int i4 = readTypedObject + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        AppTypeEnum<Float> appTypeEnum = this.onWarmupCompleted;
        AppTypeEnum<Float> appTypeEnum2 = this.onNavigationEvent;
        AppTypeEnum<Float> appTypeEnum3 = this.onExtraCallbackWithResult;
        AppTypeEnum<Float> appTypeEnum4 = this.onTransact;
        AppTypeEnum<Float> appTypeEnum5 = this.getInterfaceDescriptor;
        AppTypeEnum<Float> appTypeEnum6 = this.onExtraCallback;
        AppTypeEnum<Float> appTypeEnum7 = this.IAuthTabCallbackDefault;
        AppTypeEnum<Float> appTypeEnum8 = this.IAuthTabCallbackStub;
        AppTypeEnum<Float> appTypeEnum9 = this.IAuthTabCallback;
        AppTypeEnum<AnimUtils> appTypeEnum10 = this.asInterface;
        AppTypeEnum<Float> appTypeEnum11 = this.asBinder;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{25275, 29645, 45031, 54198, 6111, 12539, 31652, 34282, 28981, 42030, 1552, 40619, 19370, 2012, 26735, 22672, 3683, 15670, 21280, 28934, 23360, 29968}, new char[]{0, 0, 0, 0}, new char[]{17011, 43156, 51909, 41377}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(appTypeEnum);
        Object[] objArr2 = new Object[1];
        a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-926521621) - ExpandableListView.getPackedPositionChild(0L), new char[]{28819, 1222, 16012, 11552, 14740, 42021, 5539, 13368, 6746, 48319, 33463}, new char[]{0, 0, 0, 0}, new char[]{60498, 50790, 33736, 15179}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(appTypeEnum2);
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, 6 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{22, ')', 65522, 65505, 65493, 29}, Process.getGidForName("") + 172, false, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(appTypeEnum3);
        Object[] objArr4 = new Object[1];
        a((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1361883016, new char[]{48004, 47138, 27732, 28549, 40389, 62478, 52611}, new char[]{0, 0, 0, 0}, new char[]{30867, 54096, 52398, 45379}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(appTypeEnum4);
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getTapTimeout() >> 16) + 3, '=' - AndroidCharacter.getMirror('0'), new char[]{21, 65474, 65486, 65503, 21, 7, 21, 21, 3, 14, '\t', 16, 23}, 190 - Color.blue(0), true, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(appTypeEnum5);
        Object[] objArr6 = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), Process.getGidForName("") + 1141280236, new char[]{24560, 27904, 24863, 13791, 40776, 39732, 19020, 26215, 54145}, new char[]{0, 0, 0, 0}, new char[]{60169, 1677, 16964, 56278}, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(appTypeEnum6);
        Object[] objArr7 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0), new char[]{25899, 43280, 11990, 28306, 14539, 41257, 29221, 20425, 36089, 36583, 57687, 33539}, new char[]{0, 0, 0, 0}, new char[]{54109, 48147, 19190, 38582}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(appTypeEnum7);
        Object[] objArr8 = new Object[1];
        a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (-1) - Process.getGidForName(""), new char[]{178, 45989, 34706, 14518, 41570, 35478, 8659, 7699, 32890, 65123, 13083, 64090, 55909, 5888, 52603, 56262, 949, 34156, 31213, 46368}, new char[]{0, 0, 0, 0}, new char[]{8250, 4217, 9663, 20131}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(appTypeEnum8);
        Object[] objArr9 = new Object[1];
        b(Color.alpha(0) + 2, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, new char[]{65483, 65495, 65512, 30, 30, '\f', 23, 65518, 16, 18, '\f'}, MotionEvent.axisFromString("") + 182, true, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(appTypeEnum9);
        Object[] objArr10 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 5, 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{29, '!', 19, 65515, 65498, 65486, 30}, 179 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(appTypeEnum10);
        Object[] objArr11 = new Object[1];
        b(Gravity.getAbsoluteGravity(0, 0) + 11, ExpandableListView.getPackedPositionType(0L) + 15, new char[]{5, 65525, 27, 22, 11, 14, 3, 23, 19, 65474, 65486, 65503, 7, 20, 17}, TextUtils.indexOf((CharSequence) "", '0') + 191, true, objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(appTypeEnum11);
        Object[] objArr12 = new Object[1];
        b(AndroidCharacter.getMirror('0') - '/', ExpandableListView.getPackedPositionType(0L) + 1, new char[]{0}, TextUtils.indexOf((CharSequence) "", '0') + 138, false, objArr12);
        sb.append(((String) objArr12[0]).intern());
        String string = sb.toString();
        int i2 = readTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return string;
    }

    public PluginParamModel(@NotNull AppTypeEnum<Float> appTypeEnum, @NotNull AppTypeEnum<Float> appTypeEnum2, @NotNull AppTypeEnum<Float> appTypeEnum3, @NotNull AppTypeEnum<Float> appTypeEnum4, @NotNull AppTypeEnum<Float> appTypeEnum5, @NotNull AppTypeEnum<Float> appTypeEnum6, @NotNull AppTypeEnum<Float> appTypeEnum7, @NotNull AppTypeEnum<Float> appTypeEnum8, @NotNull AppTypeEnum<Float> appTypeEnum9, @NotNull AppTypeEnum<AnimUtils> appTypeEnum10, @NotNull AppTypeEnum<Float> appTypeEnum11) {
        Intrinsics.checkNotNullParameter(appTypeEnum, "");
        Intrinsics.checkNotNullParameter(appTypeEnum2, "");
        Intrinsics.checkNotNullParameter(appTypeEnum3, "");
        Intrinsics.checkNotNullParameter(appTypeEnum4, "");
        Intrinsics.checkNotNullParameter(appTypeEnum5, "");
        Intrinsics.checkNotNullParameter(appTypeEnum6, "");
        Intrinsics.checkNotNullParameter(appTypeEnum7, "");
        Intrinsics.checkNotNullParameter(appTypeEnum8, "");
        Intrinsics.checkNotNullParameter(appTypeEnum9, "");
        Intrinsics.checkNotNullParameter(appTypeEnum10, "");
        Intrinsics.checkNotNullParameter(appTypeEnum11, "");
        this.onWarmupCompleted = appTypeEnum;
        this.onNavigationEvent = appTypeEnum2;
        this.onExtraCallbackWithResult = appTypeEnum3;
        this.onTransact = appTypeEnum4;
        this.getInterfaceDescriptor = appTypeEnum5;
        this.onExtraCallback = appTypeEnum6;
        this.IAuthTabCallbackDefault = appTypeEnum7;
        this.IAuthTabCallbackStub = appTypeEnum8;
        this.IAuthTabCallback = appTypeEnum9;
        this.asInterface = appTypeEnum10;
        this.asBinder = appTypeEnum11;
    }

    public final AppTypeEnum<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppTypeEnum<Float> onNavigationEvent() {
        AppTypeEnum<Float> appTypeEnum;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 119;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            appTypeEnum = this.onNavigationEvent;
            int i4 = 37 / 0;
        } else {
            appTypeEnum = this.onNavigationEvent;
        }
        int i5 = i2 + 105;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 89;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        AppTypeEnum<Float> appTypeEnum = this.onExtraCallbackWithResult;
        int i5 = i2 + 75;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        AppTypeEnum<Float> appTypeEnum = pluginParamModel.onTransact;
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        int i6 = i2 + 5;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> access000() {
        AppTypeEnum<Float> appTypeEnum;
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            appTypeEnum = this.getInterfaceDescriptor;
            int i4 = 96 / 0;
        } else {
            appTypeEnum = this.getInterfaceDescriptor;
        }
        int i5 = i3 + 125;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        AppTypeEnum<Float> appTypeEnum = this.onExtraCallback;
        int i5 = i3 + 25;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> asBinder() {
        AppTypeEnum<Float> appTypeEnum;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 101;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            appTypeEnum = this.IAuthTabCallbackDefault;
            int i4 = 75 / 0;
        } else {
            appTypeEnum = this.IAuthTabCallbackDefault;
        }
        int i5 = i2 + 65;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        AppTypeEnum<Float> appTypeEnum = this.IAuthTabCallbackStub;
        int i5 = i3 + 99;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<Float> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        AppTypeEnum<Float> appTypeEnum = this.IAuthTabCallback;
        int i5 = i3 + 55;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return appTypeEnum;
    }

    public final AppTypeEnum<AnimUtils> onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppTypeEnum<AnimUtils> appTypeEnum = this.asInterface;
        int i4 = i3 + 63;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return appTypeEnum;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 43 - ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 + 5)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) (-1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1494 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1533236389, false, $$c(b3, (byte) (b3 + 1), (byte) $$a.length), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 23972), TextUtils.lastIndexOf("", '0', 0) + 51, 22939 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 45848), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (ViewConfiguration.getEdgeSlop() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (access100 ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStubProxy ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 47;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 35124), Color.green(0) + 23, 10278 - View.resolveSize(0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 55 - Color.green(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i9 = $11 + 79;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i11 = $10 + 83;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (Process.myPid() >> 22)), 55 - Color.blue(0), 2167 - TextUtils.getTrimmedLength(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 56, 2167 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final AppTypeEnum<Float> asInterface() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (AppTypeEnum) onNavigationEvent(1339321398, forceDomainCheck.IAuthTabCallback(), new Object[]{this}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, -1339321398, iIAuthTabCallback);
    }

    public final AppTypeEnum<Float> IAuthTabCallbackStub() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (AppTypeEnum) onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), new Object[]{this}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, -1191925291, iIAuthTabCallback);
    }
}
