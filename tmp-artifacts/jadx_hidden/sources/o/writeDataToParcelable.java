package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.domain.ads.applanding.RouteStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;
import o.bindContext;
import o.makePFX_WINS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class writeDataToParcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long extraCallback = 545622020643925900L;
    private static char extraCallbackWithResult = 27643;
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 1;
    private static int onPostMessage = 478309013;
    private static int writeTypedObject = -1776194565;
    private final Long IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final exit IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String ICustomTabsCallback;
    private final getActivePage access000;
    private final String access100;
    private final getAlivePageCount asBinder;
    private final long asInterface;
    private final Long getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final RouteStatus onTransact;
    private final Boolean onWarmupCompleted;
    private final Boolean readTypedObject;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onMessageChannelReady + 79;
            onMinimized = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof writeDataToParcelable)) {
            int i3 = onMessageChannelReady + 17;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        writeDataToParcelable writedatatoparcelable = (writeDataToParcelable) obj;
        if ((!Intrinsics.areEqual(this.onExtraCallbackWithResult, writedatatoparcelable.onExtraCallbackWithResult)) || this.access000 != writedatatoparcelable.access000 || this.onTransact != writedatatoparcelable.onTransact) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, writedatatoparcelable.IAuthTabCallback)) {
            int i5 = onMinimized + 105;
            onMessageChannelReady = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.asInterface != writedatatoparcelable.asInterface || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, writedatatoparcelable.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, writedatatoparcelable.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, writedatatoparcelable.access100)) {
            int i6 = onMinimized + 53;
            onMessageChannelReady = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, writedatatoparcelable.ICustomTabsCallback)) {
            int i8 = onMinimized + 123;
            onMessageChannelReady = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, writedatatoparcelable.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, writedatatoparcelable.onWarmupCompleted)) {
            int i10 = onMinimized + 61;
            onMessageChannelReady = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.asBinder != writedatatoparcelable.asBinder || this.IAuthTabCallbackStubProxy != writedatatoparcelable.IAuthTabCallbackStubProxy) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, writedatatoparcelable.IAuthTabCallbackDefault)) {
            int i12 = onMinimized + 5;
            onMessageChannelReady = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.readTypedObject, writedatatoparcelable.readTypedObject) || !Intrinsics.areEqual(this.getInterfaceDescriptor, writedatatoparcelable.getInterfaceDescriptor)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallback, writedatatoparcelable.onExtraCallback))) {
            return true;
        }
        int i14 = onMinimized + 113;
        onMessageChannelReady = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        int i2;
        int iHashCode4;
        int i3;
        int iHashCode5;
        int i4 = 2 % 2;
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode7 = this.access000.hashCode();
        int iHashCode8 = this.onTransact.hashCode();
        Long l = this.IAuthTabCallback;
        if (l == null) {
            int i5 = onMessageChannelReady + 9;
            onMinimized = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = l.hashCode();
        }
        int iHashCode9 = Long.hashCode(this.asInterface);
        String str = this.IAuthTabCallback_Parcel;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallbackStub;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.access100;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ICustomTabsCallback;
        if (str4 == null) {
            int i6 = onMessageChannelReady + 61;
            onMinimized = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.onNavigationEvent;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.onWarmupCompleted;
        int iHashCode14 = bool == null ? 0 : bool.hashCode();
        getAlivePageCount getalivepagecount = this.asBinder;
        int iHashCode15 = getalivepagecount == null ? 0 : getalivepagecount.hashCode();
        exit exitVar = this.IAuthTabCallbackStubProxy;
        int iHashCode16 = exitVar == null ? 0 : exitVar.hashCode();
        String str6 = this.IAuthTabCallbackDefault;
        if (str6 == null) {
            int i8 = onMessageChannelReady + 49;
            i = iHashCode16;
            onMinimized = i8 % 128;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode16;
            iHashCode3 = str6.hashCode();
        }
        Boolean bool2 = this.readTypedObject;
        if (bool2 == null) {
            int i9 = onMinimized + 37;
            i2 = iHashCode3;
            onMessageChannelReady = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            i2 = iHashCode3;
            iHashCode4 = bool2.hashCode();
        }
        Long l2 = this.getInterfaceDescriptor;
        int iHashCode17 = l2 == null ? 0 : l2.hashCode();
        String str7 = this.onExtraCallback;
        if (str7 != null) {
            int i11 = onMinimized + 13;
            i3 = iHashCode17;
            onMessageChannelReady = i11 % 128;
            if (i11 % 2 != 0) {
                str7.hashCode();
                throw null;
            }
            iHashCode5 = str7.hashCode();
        } else {
            i3 = iHashCode17;
            iHashCode5 = 0;
        }
        return (((((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + i2) * 31) + iHashCode4) * 31) + i3) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.onExtraCallbackWithResult;
        getActivePage getactivepage = this.access000;
        RouteStatus routeStatus = this.onTransact;
        Long l = this.IAuthTabCallback;
        long j = this.asInterface;
        String str2 = this.IAuthTabCallback_Parcel;
        String str3 = this.IAuthTabCallbackStub;
        String str4 = this.access100;
        String str5 = this.ICustomTabsCallback;
        String str6 = this.onNavigationEvent;
        Boolean bool = this.onWarmupCompleted;
        getAlivePageCount getalivepagecount = this.asBinder;
        exit exitVar = this.IAuthTabCallbackStubProxy;
        String str7 = this.IAuthTabCallbackDefault;
        Boolean bool2 = this.readTypedObject;
        Long l2 = this.getInterfaceDescriptor;
        String str8 = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25183), (-1875299803) - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{5965, 53354, 46044, 31783, 30987, 30909, 46263, 61064, 9750, 21134, 58903, 50744, 12674, 4828, 9218, 53275, 45308, 58084, 49485, 38111, 17703, 63166, 46298, 15832, 39114, 10893, 36166, 32899, 7778, 16425, 64538}, new char[]{50295, 54333, 31840, 27560}, new char[]{9672, 14642, 24720, 18274}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-874667044) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{54014, 57114, 45290, 18872, 23877, 43829, 57751}, new char[]{50295, 54333, 31840, 27560}, new char[]{56317, 56739, 49611, 60756}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getactivepage);
        Object[] objArr3 = new Object[1];
        a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1982161756 - TextUtils.getOffsetBefore("", 0), new char[]{20491, 39412, 38556, 41223, 45721, 5479, 59143, 32202, 61709}, new char[]{50295, 54333, 31840, 27560}, new char[]{23559, 9571, 9078, 12464}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(routeStatus);
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getFadingEdgeLength() >> 16) + 5, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, new char[]{19, 18, 65521, 23, 65505, 65488, 65476, '\b', 25, 22, 5, 24, '\r'}, 280 - KeyEvent.keyCodeFromString(""), false, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(l);
        Object[] objArr5 = new Object[1];
        b(Color.argb(0, 0, 0, 0) + 6, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12, new char[]{24, '\t', 20, '\r', 65480, 65492, 65509, 27, 65525, '\f', '\r', 27}, 276 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(j);
        Object[] objArr6 = new Object[1];
        b((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (ViewConfiguration.getPressedStateDuration() >> 16) + 12, new char[]{65530, 23, 14, 65506, 65489, 65477, 24, 20, 26, 23, '\b', '\n'}, 279 - KeyEvent.normalizeMetaState(0), false, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str2);
        Object[] objArr7 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, ImageFormat.getBitsPerPixel(0) + 12, new char[]{24, 15, 65507, 65490, 65478, 24, 21, 27, 26, 11, 65531}, Process.getGidForName("") + 279, false, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str3);
        Object[] objArr8 = new Object[1];
        a((char) Color.red(0), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{55847, 57397, 53423, 44284, 38700, 52194, 3268, 45527, 56112, 38905, 64383, 42505}, new char[]{50295, 54333, 31840, 27560}, new char[]{34908, 39952, 47245, 41840}, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(str4);
        Object[] objArr9 = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{23417, 11078, 35003, 20268, 16433, 15772, 51346, 54043, 17783, 4909, 49238, 47699, 10601, 12194, 15907, 21329, 60998, 22328, 26736, 5261, 4639, 63734}, new char[]{50295, 54333, 31840, 27560}, new char[]{48806, 41228, 31870, 9749}, objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(str5);
        Object[] objArr10 = new Object[1];
        a((char) ((ViewConfiguration.getTapTimeout() >> 16) + 10394), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{64738, 59538, 53008, 19279, 57643, 16001, 42437, 4457, 37986, 27784, 62138, 26426, 5686, 21175, 3512, 12770, 30004, 9064}, new char[]{50295, 54333, 31840, 27560}, new char[]{57247, 3639, 39637, 55592}, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(str6);
        Object[] objArr11 = new Object[1];
        b(12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, new char[]{7, 25, 24, '\t', 65514, 5, 16, 16, 6, 5, 7, 15, 65505, 65488, 65476, '\b', '\r', '\b', 65513, 28, '\t'}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 281, false, objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(bool);
        Object[] objArr12 = new Object[1];
        b(Color.argb(0, 0, 0, 0) + 10, 15 - Color.red(0), new char[]{18, '\n', '\b', '\t', 19, 19, '\b', '\r', 65479, 65491, 65508, 11, 21, 16, 65522}, 276 - ImageFormat.getBitsPerPixel(0), true, objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(getalivepagecount);
        Object[] objArr13 = new Object[1];
        a((char) (286 - KeyEvent.keyCodeFromString("")), (-780365681) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{9395, 51797, 5967, 1342, 40441, 20733, 27022, 50993, 53315, 24382, 26676, 9226, 50816}, new char[]{50295, 54333, 31840, 27560}, new char[]{37036, 31888, 7889, 18433}, objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(exitVar);
        Object[] objArr14 = new Object[1];
        a((char) (15941 - Color.argb(0, 0, 0, 0)), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{50584, 8337, 38183, 19368, 8726, 38054, 25528, 28632, 28390, 19620, 43423, 33140, 41562, 55852, 7638, 43662, 34887, 56323}, new char[]{50295, 54333, 31840, 27560}, new char[]{23650, 52783, 17707, 34366}, objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(str7);
        Object[] objArr15 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) + 20, 21 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{14, 6, 4, 5, 15, 15, 4, 65513, '\b', 15, 5, '\f', 22, '\f', 65529, '\b', 22, 24, 65475, 65487, 65504}, ExpandableListView.getPackedPositionChild(0L) + 282, true, objArr15);
        sb.append(((String) objArr15[0]).intern());
        sb.append(bool2);
        Object[] objArr16 = new Object[1];
        b(7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{19, '\t', 17, '\r', 24, 65476, 65488, 65505, 23, 65521, 24, 25}, 280 - KeyEvent.keyCodeFromString(""), true, objArr16);
        sb.append(((String) objArr16[0]).intern());
        sb.append(l2);
        Object[] objArr17 = new Object[1];
        b(3 - TextUtils.indexOf("", "", 0, 0), 9 - Gravity.getAbsoluteGravity(0, 0), new char[]{21, 24, 65513, 65496, 65484, 16, 17, ' ', '\r'}, TextUtils.lastIndexOf("", '0') + 273, false, objArr17);
        sb.append(((String) objArr17[0]).intern());
        sb.append(str8);
        Object[] objArr18 = new Object[1];
        a((char) (TextUtils.getTrimmedLength("") + 13475), 2074069470 - MotionEvent.axisFromString(""), new char[]{28966}, new char[]{50295, 54333, 31840, 27560}, new char[]{57093, 40905, 41851, 41524}, objArr18);
        sb.append(((String) objArr18[0]).intern());
        String string = sb.toString();
        int i2 = onMinimized + 93;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public writeDataToParcelable(@NotNull String str, @NotNull getActivePage getactivepage, @NotNull RouteStatus routeStatus, @Nullable Long l, long j, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable getAlivePageCount getalivepagecount, @Nullable exit exitVar, @Nullable String str7, @Nullable Boolean bool2, @Nullable Long l2, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getactivepage, "");
        Intrinsics.checkNotNullParameter(routeStatus, "");
        this.onExtraCallbackWithResult = str;
        this.access000 = getactivepage;
        this.onTransact = routeStatus;
        this.IAuthTabCallback = l;
        this.asInterface = j;
        this.IAuthTabCallback_Parcel = str2;
        this.IAuthTabCallbackStub = str3;
        this.access100 = str4;
        this.ICustomTabsCallback = str5;
        this.onNavigationEvent = str6;
        this.onWarmupCompleted = bool;
        this.asBinder = getalivepagecount;
        this.IAuthTabCallbackStubProxy = exitVar;
        this.IAuthTabCallbackDefault = str7;
        this.readTypedObject = bool2;
        this.getInterfaceDescriptor = l2;
        this.onExtraCallback = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ writeDataToParcelable(String str, getActivePage getactivepage, RouteStatus routeStatus, Long l, long j, String str2, String str3, String str4, String str5, String str6, Boolean bool, getAlivePageCount getalivepagecount, exit exitVar, String str7, Boolean bool2, Long l2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        String str11;
        String str12;
        Boolean bool3;
        getAlivePageCount getalivepagecount2;
        exit exitVar2;
        String str13;
        Boolean bool4;
        Object obj = null;
        Long l3 = (i & 8) != 0 ? null : l;
        if ((i & 32) != 0) {
            int i2 = 2 % 2;
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 64) != 0) {
            int i3 = onMessageChannelReady + 37;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i & 128) != 0) {
            int i5 = onMessageChannelReady + 95;
            onMinimized = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 47 / 0;
            }
            str11 = null;
        } else {
            str11 = str4;
        }
        String str14 = (i & 256) != 0 ? null : str5;
        if ((i & 512) != 0) {
            int i7 = 2 % 2;
            str12 = null;
        } else {
            str12 = str6;
        }
        if ((i & 1024) != 0) {
            int i8 = onMinimized + 123;
            onMessageChannelReady = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 23 / 0;
            }
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i & 2048) != 0) {
            int i10 = onMinimized + 21;
            onMessageChannelReady = i10 % 128;
            int i11 = i10 % 2;
            getalivepagecount2 = null;
        } else {
            getalivepagecount2 = getalivepagecount;
        }
        if ((i & 4096) != 0) {
            int i12 = onMessageChannelReady + 17;
            onMinimized = i12 % 128;
            int i13 = i12 % 2;
            exitVar2 = null;
        } else {
            exitVar2 = exitVar;
        }
        if ((i & 8192) != 0) {
            int i14 = onMinimized + 11;
            onMessageChannelReady = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 82 / 0;
            }
            str13 = null;
        } else {
            str13 = str7;
        }
        if ((i & 16384) != 0) {
            int i16 = onMessageChannelReady + 103;
            onMinimized = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 3 / 0;
            }
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        this(str, getactivepage, routeStatus, l3, j, str9, str10, str11, str14, str12, bool3, getalivepagecount2, exitVar2, str13, bool4, (32768 & i) != 0 ? null : l2, (i & 65536) != 0 ? null : str8);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
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
        int i3 = $11 + 93;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 3;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (extraCallback ^ 7798559133331975163L)) ^ ((int) (writeTypedObject ^ 7798559133331975163L))) ^ ((char) (extraCallbackWithResult ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
            int i5 = $11 + 85;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i7] = bindContext.access000.g(cArr2[i7], onPostMessage);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i > 0) {
            int i8 = $10 + 47;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
