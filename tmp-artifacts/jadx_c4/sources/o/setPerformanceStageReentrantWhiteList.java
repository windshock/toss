package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.isTiny;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPerformanceStageReentrantWhiteList {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ICustomTabsCallback = 20560;
    private static int ICustomTabsCallbackDefault = 1;
    private static char extraCallback = 60189;
    private static char extraCallbackWithResult = 57609;
    private static int onMessageChannelReady = 0;
    private static char writeTypedObject = 43768;
    private final getCausesCount<Pair<Float, Float>> IAuthTabCallback;
    private final getCausesCount<Float> IAuthTabCallbackDefault;
    private final getCausesCount<Float> IAuthTabCallbackStub;
    private final getCausesCount<Float> IAuthTabCallbackStubProxy;
    private final getCausesCount<Float> IAuthTabCallback_Parcel;
    private final getCausesCount<Float> access000;
    private final getCausesCount<Float> access100;
    private final getCausesCount<AnimUtils> asBinder;
    private final isTiny.onWarmupCompleted asInterface;
    private final boolean getInterfaceDescriptor;
    private final getCausesCount<Float> onExtraCallback;
    private final getCausesCount<Double> onExtraCallbackWithResult;
    private final getCausesCount<Double> onNavigationEvent;
    private final getCausesCount<Float> onTransact;
    private final RVPub onWarmupCompleted;
    private final getCausesCount<Float> readTypedObject;
    private static char[] onMinimized = {32512, 32532, 32591, 32627, 32601, 32585, 32581, 32634, 32633, 32567, 32576, 32639, 32579, 32582, 32588, 32587, 32584, 32548, 32602, 32632, 32586, 32589, 32603, 32553, 32515};
    private static int onActivityResized = -1184333836;
    private static boolean onPostMessage = true;
    private static boolean onActivityLayout = true;

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = ~i5;
        int i10 = i7 | i3;
        int i11 = (~(i2 | i9 | i3)) | (~(i10 | i5));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i5 + i + (1353909401 * i6) + ((-1351514252) * i4);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i5) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i) + (337379328 * i6) + ((-1540358144) * i4) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i5 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i * 521834041) + (i6 * 1123214353) + (i4 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 == 1) {
            setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist = (setPerformanceStageReentrantWhiteList) objArr[0];
            int i18 = 2 % 2;
            int i19 = onMessageChannelReady + 121;
            int i20 = i19 % 128;
            ICustomTabsCallbackDefault = i20;
            int i21 = i19 % 2;
            getCausesCount<Double> getcausescount = setperformancestagereentrantwhitelist.onNavigationEvent;
            int i22 = i20 + 1;
            onMessageChannelReady = i22 % 128;
            int i23 = i22 % 2;
            return getcausescount;
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist2 = (setPerformanceStageReentrantWhiteList) objArr[0];
        int i24 = 2 % 2;
        int i25 = onMessageChannelReady + 93;
        int i26 = i25 % 128;
        ICustomTabsCallbackDefault = i26;
        int i27 = i25 % 2;
        getCausesCount<Float> getcausescount2 = setperformancestagereentrantwhitelist2.onExtraCallback;
        int i28 = i26 + 125;
        onMessageChannelReady = i28 % 128;
        int i29 = i28 % 2;
        return getcausescount2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPerformanceStageReentrantWhiteList)) {
            int i2 = ICustomTabsCallbackDefault + 43;
            onMessageChannelReady = i2 % 128;
            return i2 % 2 != 0;
        }
        setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist = (setPerformanceStageReentrantWhiteList) obj;
        if (this.onWarmupCompleted != setperformancestagereentrantwhitelist.onWarmupCompleted) {
            return false;
        }
        if (this.getInterfaceDescriptor != setperformancestagereentrantwhitelist.getInterfaceDescriptor) {
            int i3 = onMessageChannelReady + 113;
            int i4 = i3 % 128;
            ICustomTabsCallbackDefault = i4;
            boolean z = i3 % 2 == 0;
            int i5 = i4 + 117;
            onMessageChannelReady = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.asInterface, setperformancestagereentrantwhitelist.asInterface) || !Intrinsics.areEqual(this.IAuthTabCallback, setperformancestagereentrantwhitelist.IAuthTabCallback) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, setperformancestagereentrantwhitelist.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.asBinder, setperformancestagereentrantwhitelist.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setperformancestagereentrantwhitelist.onExtraCallbackWithResult)) {
            int i6 = ICustomTabsCallbackDefault + 27;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, setperformancestagereentrantwhitelist.onNavigationEvent) || !Intrinsics.areEqual(this.access000, setperformancestagereentrantwhitelist.access000)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, setperformancestagereentrantwhitelist.access100)) {
            int i8 = onMessageChannelReady + 63;
            ICustomTabsCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, setperformancestagereentrantwhitelist.readTypedObject) || !Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, setperformancestagereentrantwhitelist.IAuthTabCallbackStubProxy) || !Intrinsics.areEqual(this.onTransact, setperformancestagereentrantwhitelist.onTransact) || (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, setperformancestagereentrantwhitelist.IAuthTabCallbackDefault)) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, setperformancestagereentrantwhitelist.IAuthTabCallbackStub)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, setperformancestagereentrantwhitelist.onExtraCallback)) {
            return true;
        }
        int i10 = onMessageChannelReady;
        int i11 = i10 + 61;
        ICustomTabsCallbackDefault = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 25;
        ICustomTabsCallbackDefault = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        int i2 = 2 % 2;
        RVPub rVPub = this.onWarmupCompleted;
        int iHashCode4 = rVPub == null ? 0 : rVPub.hashCode();
        int iHashCode5 = Boolean.hashCode(this.getInterfaceDescriptor);
        int iHashCode6 = this.asInterface.hashCode();
        getCausesCount<Pair<Float, Float>> getcausescount = this.IAuthTabCallback;
        if (getcausescount == null) {
            int i3 = ICustomTabsCallbackDefault + 9;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getcausescount.hashCode();
        }
        getCausesCount<Float> getcausescount2 = this.IAuthTabCallback_Parcel;
        int iHashCode7 = getcausescount2 == null ? 0 : getcausescount2.hashCode();
        getCausesCount<AnimUtils> getcausescount3 = this.asBinder;
        if (getcausescount3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = getcausescount3.hashCode();
            int i5 = onMessageChannelReady + 23;
            ICustomTabsCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }
        getCausesCount<Double> getcausescount4 = this.onExtraCallbackWithResult;
        int iHashCode8 = getcausescount4 == null ? 0 : getcausescount4.hashCode();
        getCausesCount<Double> getcausescount5 = this.onNavigationEvent;
        int iHashCode9 = getcausescount5 == null ? 0 : getcausescount5.hashCode();
        getCausesCount<Float> getcausescount6 = this.access000;
        int iHashCode10 = getcausescount6 == null ? 0 : getcausescount6.hashCode();
        getCausesCount<Float> getcausescount7 = this.access100;
        int iHashCode11 = getcausescount7 == null ? 0 : getcausescount7.hashCode();
        getCausesCount<Float> getcausescount8 = this.readTypedObject;
        int iHashCode12 = getcausescount8 == null ? 0 : getcausescount8.hashCode();
        getCausesCount<Float> getcausescount9 = this.IAuthTabCallbackStubProxy;
        int iHashCode13 = getcausescount9 == null ? 0 : getcausescount9.hashCode();
        getCausesCount<Float> getcausescount10 = this.onTransact;
        int iHashCode14 = getcausescount10 == null ? 0 : getcausescount10.hashCode();
        getCausesCount<Float> getcausescount11 = this.IAuthTabCallbackDefault;
        int iHashCode15 = getcausescount11 == null ? 0 : getcausescount11.hashCode();
        getCausesCount<Float> getcausescount12 = this.IAuthTabCallbackStub;
        if (getcausescount12 == null) {
            int i7 = onMessageChannelReady + 9;
            i = iHashCode15;
            ICustomTabsCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            i = iHashCode15;
            iHashCode3 = getcausescount12.hashCode();
        }
        getCausesCount<Float> getcausescount13 = this.onExtraCallback;
        return (((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode3) * 31) + (getcausescount13 != null ? getcausescount13.hashCode() : 0);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        RVPub rVPub = this.onWarmupCompleted;
        boolean z = this.getInterfaceDescriptor;
        isTiny.onWarmupCompleted onwarmupcompleted = this.asInterface;
        getCausesCount<Pair<Float, Float>> getcausescount = this.IAuthTabCallback;
        getCausesCount<Float> getcausescount2 = this.IAuthTabCallback_Parcel;
        getCausesCount<AnimUtils> getcausescount3 = this.asBinder;
        getCausesCount<Double> getcausescount4 = this.onExtraCallbackWithResult;
        getCausesCount<Double> getcausescount5 = this.onNavigationEvent;
        getCausesCount<Float> getcausescount6 = this.access000;
        getCausesCount<Float> getcausescount7 = this.access100;
        getCausesCount<Float> getcausescount8 = this.readTypedObject;
        getCausesCount<Float> getcausescount9 = this.IAuthTabCallbackStubProxy;
        getCausesCount<Float> getcausescount10 = this.onTransact;
        getCausesCount<Float> getcausescount11 = this.IAuthTabCallbackDefault;
        getCausesCount<Float> getcausescount12 = this.IAuthTabCallbackStub;
        getCausesCount<Float> getcausescount13 = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{59511, 21410, 3049, 29488, 40293, 53667, 36446, 57566, 43193, 11799, 16238, 22152, 44104, 30099, 8568, 47706, 36477, 57669, 26834, 26660, 23253, 58571, 27923, 38747, 38283, 42065, 41519, 38418, 50094, 10224, 43783, 39683}, 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(rVPub);
        Object[] objArr2 = new Object[1];
        a(new char[]{53626, 15816, 47034, 54756, 35205, 9624, 34415, 53043, 17272, 5445, 62936, 37848, 64928, 57951, 36382, 1735, 23733, 53764, 15868, 24359}, ExpandableListView.getPackedPositionGroup(0L) + 19, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(z);
        Object[] objArr3 = new Object[1];
        a(new char[]{53626, 15816, 33365, 43234, 3049, 29488, 15868, 24359}, 7 - View.combineMeasuredStates(0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(onwarmupcompleted);
        Object[] objArr4 = new Object[1];
        b(null, new byte[]{-118, -119, -125, -120, -121, -122, -123, -125, -124, -125, -126, -127}, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(getcausescount);
        Object[] objArr5 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -114, -121, -115, -119, -116, -117, -122, -122, -121, -126, -127}, null, (-16777089) - Color.rgb(0, 0, 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(getcausescount2);
        Object[] objArr6 = new Object[1];
        b(null, new byte[]{-118, -108, -117, -116, -119, -125, -109, -125, -119, -121, -110, -111, -112, -125, -113, -126, -127}, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(getcausescount3);
        Object[] objArr7 = new Object[1];
        a(new char[]{53626, 15816, 46791, 28114, 59967, 47123, 12506, 60629, 7565, 1114, 4379, 19333, 13546, 36700, 34318, 53588, 43783, 39683}, 18 - TextUtils.getOffsetAfter("", 0), objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(getcausescount4);
        Object[] objArr8 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -120, -116, -117, -107, -126, -127}, null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(getcausescount5);
        Object[] objArr9 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -124, -108, -115, -117, -112, -116, -105, -114, -121, -115, -108, -115, -114, -106, -121, -122, -125, -120, -126, -127}, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(getcausescount6);
        Object[] objArr10 = new Object[1];
        a(new char[]{53626, 15816, 38311, 3971, 53669, 19903, 13546, 36700, 34318, 53588, 43783, 39683}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(getcausescount7);
        Object[] objArr11 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -119, -125, -119, -119, -112, -117, -106, -114, -116, -119, -126, -127}, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(getcausescount8);
        Object[] objArr12 = new Object[1];
        a(new char[]{53626, 15816, 7565, 1114, 51140, 49656, 36382, 1735, 13795, 37379, 55799, 29397, 27570, 41557, 4379, 19333, 28023, 60382, 3400, 20087, 38628, 44731, 27570, 41557, 15868, 24359}, AndroidCharacter.getMirror('0') - 23, objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(getcausescount9);
        Object[] objArr13 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -119, -119, -112, -117, -106, -125, -124, -125, -126, -127}, null, TextUtils.indexOf("", "") + 127, objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(getcausescount10);
        Object[] objArr14 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -108, -112, -113, -126, -127}, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(getcausescount11);
        Object[] objArr15 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -120, -125, -111, -114, -125, -106, -126, -127}, null, TextUtils.lastIndexOf("", '0') + 128, objArr15);
        sb.append(((String) objArr15[0]).intern());
        sb.append(getcausescount12);
        Object[] objArr16 = new Object[1];
        b(null, new byte[]{-118, -125, -120, -121, -122, -123, -119, -119, -112, -117, -104, -125, -106, -112, -126, -127}, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr16);
        sb.append(((String) objArr16[0]).intern());
        sb.append(getcausescount13);
        Object[] objArr17 = new Object[1];
        b(null, new byte[]{-103}, null, TextUtils.lastIndexOf("", '0') + 128, objArr17);
        sb.append(((String) objArr17[0]).intern());
        String string = sb.toString();
        int i2 = ICustomTabsCallbackDefault + 93;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return string;
    }

    public setPerformanceStageReentrantWhiteList(@Nullable RVPub rVPub, boolean z, @NotNull isTiny.onWarmupCompleted onwarmupcompleted, @Nullable getCausesCount<Pair<Float, Float>> getcausescount, @Nullable getCausesCount<Float> getcausescount2, @Nullable getCausesCount<AnimUtils> getcausescount3, @Nullable getCausesCount<Double> getcausescount4, @Nullable getCausesCount<Double> getcausescount5, @Nullable getCausesCount<Float> getcausescount6, @Nullable getCausesCount<Float> getcausescount7, @Nullable getCausesCount<Float> getcausescount8, @Nullable getCausesCount<Float> getcausescount9, @Nullable getCausesCount<Float> getcausescount10, @Nullable getCausesCount<Float> getcausescount11, @Nullable getCausesCount<Float> getcausescount12, @Nullable getCausesCount<Float> getcausescount13) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onWarmupCompleted = rVPub;
        this.getInterfaceDescriptor = z;
        this.asInterface = onwarmupcompleted;
        this.IAuthTabCallback = getcausescount;
        this.IAuthTabCallback_Parcel = getcausescount2;
        this.asBinder = getcausescount3;
        this.onExtraCallbackWithResult = getcausescount4;
        this.onNavigationEvent = getcausescount5;
        this.access000 = getcausescount6;
        this.access100 = getcausescount7;
        this.readTypedObject = getcausescount8;
        this.IAuthTabCallbackStubProxy = getcausescount9;
        this.onTransact = getcausescount10;
        this.IAuthTabCallbackDefault = getcausescount11;
        this.IAuthTabCallbackStub = getcausescount12;
        this.onExtraCallback = getcausescount13;
    }

    public final RVPub onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 125;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        RVPub rVPub = this.onWarmupCompleted;
        int i5 = i2 + 71;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return rVPub;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist = (setPerformanceStageReentrantWhiteList) objArr[0];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 93;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = setperformancestagereentrantwhitelist.getInterfaceDescriptor;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 83;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i6 = 10 / 0;
        return Boolean.valueOf(z);
    }

    public final getCausesCount<Pair<Float, Float>> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getCausesCount<Pair<Float, Float>> getcausescount = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return getcausescount;
    }

    public final getCausesCount<Float> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 49;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 103;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<AnimUtils> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        getCausesCount<AnimUtils> getcausescount = this.asBinder;
        int i5 = i3 + 107;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Double> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 117;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        getCausesCount<Double> getcausescount = this.onExtraCallbackWithResult;
        int i5 = i3 + 19;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return getcausescount;
        }
        throw null;
    }

    public final getCausesCount<Float> access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 13;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.access000;
        int i5 = i2 + 95;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> asBinder() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 69;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.access100;
        int i5 = i2 + 111;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 107;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.readTypedObject;
        int i5 = i2 + 47;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return getcausescount;
        }
        throw null;
    }

    public final getCausesCount<Float> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 65;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getCausesCount<Float> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        getCausesCount<Float> getcausescount = this.onTransact;
        int i5 = i3 + 57;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return getcausescount;
    }

    public final getCausesCount<Float> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 21;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final getCausesCount<Float> onTransact() {
        getCausesCount<Float> getcausescount;
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 97;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            getcausescount = this.IAuthTabCallbackStub;
            int i4 = 13 / 0;
        } else {
            getcausescount = this.IAuthTabCallbackStub;
        }
        int i5 = i2 + 103;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 73;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(extraCallback);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iBlue = Color.blue(0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, scrollDefaultDelay, iBlue, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (ICustomTabsCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(writeTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    int i11 = $11 + 117;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTouchSlop() >> 8)), 14 - ((Process.getThreadPriority(0) + 20) >> 6), 19901 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onMinimized;
        if (cArr2 != null) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 77 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20952 - (ViewConfiguration.getTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onActivityResized)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 74, 16038 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onActivityLayout) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 63, 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onPostMessage) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i6 = $11 + 11;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] / iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), 63 - Drawable.resolveOpacity(0, 0), 12214 - TextUtils.getOffsetAfter("", 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 63 - (ViewConfiguration.getPressedStateDuration() >> 16), 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                j = 0;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final getCausesCount<Float> onWarmupCompleted() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (getCausesCount) onNavigationEvent(new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 2086492308, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -2086492308, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final getCausesCount<Double> onNavigationEvent() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (getCausesCount) onNavigationEvent(new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1655117077, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1655117076, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public final boolean IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 42619498, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -42619496, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue();
    }
}
