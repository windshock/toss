package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRoundCornerProgressBar;
import o.UtilsKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseRoundCornerProgressBar implements SharedPreferences {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static final boolean IAuthTabCallback = false;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static int access000 = 1;
    private static long access100 = 0;
    private static int extraCallbackWithResult = 1;
    private static char getInterfaceDescriptor;
    private static final boolean onExtraCallback;
    private static final boolean onExtraCallbackWithResult;
    private static char onTransact;
    private getMax IAuthTabCallbackStub;
    private final String asBinder;
    private final SharedPreferences asInterface;
    private getProgressColor onNavigationEvent;
    private final HashMap<SharedPreferences.OnSharedPreferenceChangeListener, SharedPreferences.OnSharedPreferenceChangeListener> onWarmupCompleted;

    static final class onExtraCallbackWithResult implements getProgressColor {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // o.getProgressColor
        public String onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = onExtraCallback + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.getProgressColor
        public String onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    static final class onNavigationEvent implements getMax {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // o.getMax
        public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override // o.getMax
        public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i4 = onWarmupCompleted + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(BaseRoundCornerProgressBar baseRoundCornerProgressBar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, SharedPreferences sharedPreferences, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(baseRoundCornerProgressBar, onSharedPreferenceChangeListener, sharedPreferences, str);
        int i4 = access000 + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    public BaseRoundCornerProgressBar(@NotNull Context context, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.asBinder = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.asInterface = sharedPreferences;
        this.onNavigationEvent = new onExtraCallbackWithResult();
        this.IAuthTabCallbackStub = new onNavigationEvent();
        this.onWarmupCompleted = new HashMap<>();
    }

    public static final /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = onExtraCallbackWithResult;
        int i5 = i2 + 45;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final SharedPreferences onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 51;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        SharedPreferences sharedPreferences = this.asInterface;
        int i5 = i3 + 37;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BaseRoundCornerProgressBar baseRoundCornerProgressBar, getProgressColor getprogresscolor, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = access000 + 11;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 27;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            textRoundCornerProgressBarSavedState = null;
        }
        baseRoundCornerProgressBar.onWarmupCompleted(getprogresscolor, textRoundCornerProgressBarSavedState);
    }

    public final void onWarmupCompleted(@Nullable getProgressColor getprogresscolor, @Nullable TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (getprogresscolor != null) {
            this.onNavigationEvent = new createGradientDrawable(getprogresscolor, textRoundCornerProgressBarSavedState);
            return;
        }
        this.onNavigationEvent = new onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 83;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(BaseRoundCornerProgressBar baseRoundCornerProgressBar, getMax getmax, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 123;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            textRoundCornerProgressBarSavedState = null;
        }
        baseRoundCornerProgressBar.onExtraCallback(getmax, textRoundCornerProgressBarSavedState);
        int i5 = IAuthTabCallback_Parcel + 77;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable getMax getmax, @Nullable TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (getmax != null) {
            this.IAuthTabCallbackStub = new dp2px(getmax, textRoundCornerProgressBarSavedState);
            return;
        }
        this.IAuthTabCallbackStub = new onNavigationEvent();
        int i4 = access000 + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public Map<String, Object> getAll() {
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(this.asInterface.getAll(), "");
            obj.hashCode();
            throw null;
        }
        Map<String, ?> all = this.asInterface.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        int i3 = IAuthTabCallback_Parcel + 27;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return all;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access100 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 69;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 84 - View.combineMeasuredStates(0, 0), 21233 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 14185), (-16777197) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r1
      0x0037: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v19 java.lang.String) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getString(@NotNull String str, @Nullable String str2) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
            int i3 = 5 / 0;
            if (string != null) {
                if (string.length() == 0) {
                    int i4 = access000 + 19;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    str2 = IAuthTabCallback.onNavigationEvent(Companion, string, this.IAuthTabCallbackStub, str);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
            if (string != null) {
            }
        }
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new char[]{12275, 22069, 12206, 58233, 52826, 42213, 44074, 35851, 64055, 56698, 36518, 31117, 34042, 13975, 55301, 18319, 44696, 24610, 9687, 11558, 30990}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr3);
            ((String) objArr3[0]).intern();
            toString();
            Object[] objArr4 = new Object[1];
            a(new char[]{51904, '`'}, -TextUtils.lastIndexOf("", '0', 0), objArr4);
            ((String) objArr4[0]).intern();
            int i6 = IAuthTabCallback_Parcel + 67;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(@NotNull String str, @Nullable Set<String> set) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Set<String> stringSet = this.asInterface.getStringSet(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
        if (stringSet != null) {
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 91;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 49;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            set = stringSet;
        }
        Object[] objArr = {Companion, set, this.IAuthTabCallbackStub, str};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        Set<String> set2 = (Set) IAuthTabCallback.IAuthTabCallback(1668919361, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -1668919360);
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr2 = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{64612, 52874, 26986, 15331, 30813, 60724, 64030, 44806, 50770, 41304, 3483, 48864, 56409, 12836, 38782, 37616, 64279, 49445, 11804, 42573}, 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            ((String) objArr4[0]).intern();
            toString();
            Object[] objArr5 = new Object[1];
            a(new char[]{51904, '`'}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr5);
            ((String) objArr5[0]).intern();
        }
        return set2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(@NotNull String str, int i) throws Throwable {
        int i2 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        String string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
        if (string == null) {
            int i3 = IAuthTabCallback_Parcel + 55;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str2 = string;
        }
        if (!TextUtils.isEmpty(str2)) {
            int i4 = access000 + 93;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            i = IAuthTabCallback.IAuthTabCallback(Companion, str2, this.IAuthTabCallbackStub, str, i);
        }
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{64612, 52874, 26986, 15331, 23399, 29054, 60639, 15924, 38782, 37616, 64279, 49445, 11804, 42573}, (KeyEvent.getMaxKeyCode() >> 16) + 14, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, View.resolveSize(0, 0), objArr3);
            ((String) objArr3[0]).intern();
            toString();
            Object[] objArr4 = new Object[1];
            a(new char[]{51904, '`'}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr4);
            ((String) objArr4[0]).intern();
        }
        int i6 = IAuthTabCallback_Parcel + 29;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(@NotNull String str, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
        if (string == null) {
            string = "";
        }
        if (!TextUtils.isEmpty(string)) {
            int i3 = IAuthTabCallback_Parcel + 27;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {Companion, string, this.IAuthTabCallbackStub, str, Long.valueOf(j)};
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            j = ((Long) IAuthTabCallback.IAuthTabCallback(-394090147, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, 394090149)).longValue();
        }
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr2 = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, ViewConfiguration.getTouchSlop() >> 8, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{7815, 55996, 7898, 28656, 37677, 63890, 13777, 5616, 52035, 20972, 54218, 57450, 46464, 47696, 34158, 56895, 40946, 60601, 30968}, '0' - AndroidCharacter.getMirror('0'), objArr3);
            ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, TextUtils.indexOf((CharSequence) "", '0') + 1, objArr4);
            ((String) objArr4[0]).intern();
            toString();
            Object[] objArr5 = new Object[1];
            a(new char[]{51904, '`'}, -TextUtils.lastIndexOf("", '0'), objArr5);
            ((String) objArr5[0]).intern();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@NotNull String str, float f) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
        if (string == null) {
            int i4 = IAuthTabCallback_Parcel + 119;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            string = "";
        }
        if (!TextUtils.isEmpty(string)) {
            f = IAuthTabCallback.IAuthTabCallback(Companion, string, this.IAuthTabCallbackStub, str, f);
        }
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, Color.argb(0, 0, 0, 0), objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(new char[]{51019, 9311, 50966, 37139, 38399, 65344, 40102, 48263, 4751, 44805, 54555, 18716, 27722, 17639, 33767, 30552, 17968, 4678, 32366, 7662}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, TextUtils.indexOf("", ""), objArr3);
            ((String) objArr3[0]).intern();
            toString();
            Object[] objArr4 = new Object[1];
            a(new char[]{51904, '`'}, View.MeasureSpec.getMode(0) + 1, objArr4);
            ((String) objArr4[0]).intern();
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean getBoolean(@NotNull String str, boolean z) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = access000 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
            int i3 = 93 / 0;
            if (string == null) {
                int i4 = IAuthTabCallback_Parcel + 59;
                access000 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 27 / 0;
                }
                string = "";
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            string = this.asInterface.getString(this.onNavigationEvent.onExtraCallbackWithResult(str), null);
            if (string == null) {
            }
        }
        if (!TextUtils.isEmpty(string)) {
            z = IAuthTabCallback.onNavigationEvent(Companion, string, this.IAuthTabCallbackStub, str, z);
        }
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{64612, 52874, 26986, 15331, 49498, 19791, 4945, 60920, 41192, 49200, 55644, 2279, 38782, 37616, 64279, 49445, 11804, 42573}, (ViewConfiguration.getTouchSlop() >> 8) + 18, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr3);
            ((String) objArr3[0]).intern();
            toString();
            Object[] objArr4 = new Object[1];
            a(new char[]{51904, '`'}, 1 - View.getDefaultSize(0, 0), objArr4);
            ((String) objArr4[0]).intern();
        }
        int i6 = access000 + 111;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asInterface.contains(this.onNavigationEvent.onExtraCallbackWithResult(str));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        boolean zContains = this.asInterface.contains(this.onNavigationEvent.onExtraCallbackWithResult(str));
        if (onExtraCallback) {
            drawPrimaryProgress.onExtraCallback();
            Object[] objArr = new Object[1];
            b(new char[]{8911, 7488, 8852, 51621, 7346}, ExpandableListView.getPackedPositionType(0L), objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{64612, 52874, 26050, 54824, 60639, 15924, 39431, 4375, 55000, 13952, 38782, 37616, 64279, 49445, 11804, 42573}, TextUtils.getOffsetAfter("", 0) + 16, objArr2);
            ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b(new char[]{6541, 22761, 6561, 60837, 45329, 56251, 11932, 3773, 52302, 54144, 61941, 64317, 45776}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{51904, '`'}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
            ((String) objArr4[0]).intern();
            int i3 = access000 + 75;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        return zContains;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int iIndexOf = 10 - TextUtils.indexOf("", "", i3);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, iIndexOf, keyRepeatTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 11, 12434 - KeyEvent.normalizeMetaState(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    int i11 = $10 + 73;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
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
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (Process.myPid() >> 22)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, Color.alpha(0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $11 + 81;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        int i = 2 % 2;
        String str = this.asBinder;
        SharedPreferences.Editor editorEdit = this.asInterface.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(str, editorEdit, this.onNavigationEvent, this.IAuthTabCallbackStub);
        int i2 = access000 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static final void onNavigationEvent(BaseRoundCornerProgressBar baseRoundCornerProgressBar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, SharedPreferences sharedPreferences, String str) throws Throwable {
        int i = 2 % 2;
        if (str != null) {
            int i2 = IAuthTabCallback_Parcel + 63;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            try {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, baseRoundCornerProgressBar.onNavigationEvent.onWarmupCompleted(str));
                return;
            } catch (Throwable th) {
                drawPrimaryProgress.onExtraCallback();
                Object[] objArr = new Object[1];
                a(new char[]{34627, 62618, 26050, 54824, 34627, 62618, 2003, 47332, 39431, 4375, 41192, 49200, 41159, 16397, 61349, 5914, 64279, 49445, 40396, 49873, 2109, 2434}, 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                b(new char[]{31142, 4493, 31227, 42189, 47877, 53757, 15938, 7779, 44076}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr2);
                ((String) objArr2[0]).intern();
                th.toString();
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            }
        }
        int i4 = IAuthTabCallback_Parcel + 43;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NotNull final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onSharedPreferenceChangeListener, "");
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: im.toss.core.prefser.SecurePreferences$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 5;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    BaseRoundCornerProgressBar.IAuthTabCallback(this.f$0, onSharedPreferenceChangeListener, sharedPreferences, str);
                    int i4 = 57 / 0;
                } else {
                    BaseRoundCornerProgressBar.IAuthTabCallback(this.f$0, onSharedPreferenceChangeListener, sharedPreferences, str);
                }
                int i5 = IAuthTabCallback + 93;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        if (this.onWarmupCompleted.put(onSharedPreferenceChangeListener, onSharedPreferenceChangeListener2) == null) {
            int i2 = IAuthTabCallback_Parcel + 27;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            int i4 = IAuthTabCallback_Parcel + 125;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r4
      0x002f: PHI (r4v3 android.content.SharedPreferences$OnSharedPreferenceChangeListener) = 
      (r4v2 android.content.SharedPreferences$OnSharedPreferenceChangeListener)
      (r4v10 android.content.SharedPreferences$OnSharedPreferenceChangeListener)
     binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void unregisterOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListenerRemove;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onSharedPreferenceChangeListener, "");
            onSharedPreferenceChangeListenerRemove = this.onWarmupCompleted.remove(onSharedPreferenceChangeListener);
            int i3 = 45 / 0;
            if (onSharedPreferenceChangeListenerRemove != null) {
                this.asInterface.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListenerRemove);
            }
        } else {
            Intrinsics.checkNotNullParameter(onSharedPreferenceChangeListener, "");
            onSharedPreferenceChangeListenerRemove = this.onWarmupCompleted.remove(onSharedPreferenceChangeListener);
            if (onSharedPreferenceChangeListenerRemove != null) {
            }
        }
        int i4 = IAuthTabCallback_Parcel + 43;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.asBinder;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{26998, 42598, 44892, 37683, 47746, 8420, 46293, 35332, 24824, 50204, 8952, 7198, 58188, 64499, 5850, 15303, 44815, 61396, 17308, 52733, 37402, 15367, 56038, 35322}, View.MeasureSpec.getSize(0) + 24, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{4394, 18824}, 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback_Parcel + 29;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static final class onWarmupCompleted implements SharedPreferences.Editor {
        private static int asBinder = 1;
        private static int onExtraCallback;
        private final SharedPreferences.Editor IAuthTabCallback;
        private final getProgressColor onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final getMax onWarmupCompleted;

        public onWarmupCompleted(@NotNull String str, @NotNull SharedPreferences.Editor editor, @NotNull getProgressColor getprogresscolor, @NotNull getMax getmax) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(editor, "");
            Intrinsics.checkNotNullParameter(getprogresscolor, "");
            Intrinsics.checkNotNullParameter(getmax, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = editor;
            this.onExtraCallbackWithResult = getprogresscolor;
            this.onWarmupCompleted = getmax;
        }

        public final void onWarmupCompleted(@Nullable Object obj, @Nullable Object obj2, @NotNull String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(obj, obj2);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.areEqual(obj, obj2)) {
                int i3 = asBinder + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            throw new IllegalStateException("Assertion failed {label=" + str + ", a=" + obj + ", b=" + obj2);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(@NotNull String str, @Nullable String str2) {
            int i = 2 % 2;
            int i2 = asBinder + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (str2 != null && str2.length() > 204800) {
                drawPrimaryProgress.onExtraCallback();
            } else {
                drawPrimaryProgress.onExtraCallback();
            }
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            editor.putString(strOnExtraCallbackWithResult, IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, str2, this.onWarmupCompleted, str));
            if (BaseRoundCornerProgressBar.onExtraCallback()) {
                int i4 = onExtraCallback + 21;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                getMax getmax = this.onWarmupCompleted;
                onWarmupCompleted(str2, getmax.IAuthTabCallback(IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, str2, getmax, str), str), String.valueOf(this.onWarmupCompleted));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(@NotNull String str, @Nullable Set<String> set) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            Objects.toString(set);
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            editor.putStringSet(strOnExtraCallbackWithResult, IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, set, this.onWarmupCompleted, str));
            if (BaseRoundCornerProgressBar.onExtraCallback()) {
                int i2 = asBinder + 5;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                Object[] objArr = {iAuthTabCallback, IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, set, this.onWarmupCompleted, str), this.onWarmupCompleted, str};
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                onWarmupCompleted(set, (Set) IAuthTabCallback.IAuthTabCallback(1668919361, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -1668919360), String.valueOf(this.onWarmupCompleted));
            }
            int i4 = onExtraCallback + 39;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(@NotNull String str, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            editor.putString(strOnExtraCallbackWithResult, IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, i, this.onWarmupCompleted, str));
            if (BaseRoundCornerProgressBar.onExtraCallback()) {
                int i3 = onExtraCallback + 25;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                onWarmupCompleted(Integer.valueOf(i), Integer.valueOf(IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback, i, this.onWarmupCompleted, str), this.onWarmupCompleted, str, Integer.MIN_VALUE)), String.valueOf(this.onWarmupCompleted));
                int i5 = asBinder + 47;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(@NotNull String str, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            editor.putString(strOnExtraCallbackWithResult, IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, j, this.onWarmupCompleted, str));
            if (!(!BaseRoundCornerProgressBar.onExtraCallback())) {
                int i2 = onExtraCallback + 111;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                Long lValueOf = Long.valueOf(j);
                Object[] objArr = {iAuthTabCallback, IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, j, this.onWarmupCompleted, str), this.onWarmupCompleted, str, Long.MIN_VALUE};
                onWarmupCompleted(lValueOf, Long.valueOf(((Long) IAuthTabCallback.IAuthTabCallback(-394090147, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 394090149)).longValue()), String.valueOf(this.onWarmupCompleted));
            }
            int i4 = asBinder + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(@NotNull String str, float f) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            editor.putString(strOnExtraCallbackWithResult, IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, f, this.onWarmupCompleted, str));
            if (BaseRoundCornerProgressBar.onExtraCallback()) {
                int i2 = onExtraCallback + 75;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                onWarmupCompleted(Float.valueOf(f), Float.valueOf(IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, f, this.onWarmupCompleted, str), this.onWarmupCompleted, str, Float.MIN_VALUE)), String.valueOf(this.onWarmupCompleted));
                int i4 = asBinder + 25;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 5;
                }
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(@NotNull String str, boolean z) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            SharedPreferences.Editor editor = this.IAuthTabCallback;
            String strOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
            IAuthTabCallback iAuthTabCallback = BaseRoundCornerProgressBar.Companion;
            Object[] objArr = {iAuthTabCallback, Boolean.valueOf(z), this.onWarmupCompleted, str};
            editor.putString(strOnExtraCallbackWithResult, (String) IAuthTabCallback.IAuthTabCallback(841288949, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -841288946));
            if (!(!BaseRoundCornerProgressBar.onExtraCallback())) {
                int i2 = onExtraCallback + 9;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                getProgressColor getprogresscolor = this.onExtraCallbackWithResult;
                onWarmupCompleted(str, getprogresscolor.onWarmupCompleted(getprogresscolor.onExtraCallbackWithResult(str)), String.valueOf(this.onExtraCallbackWithResult));
                Boolean boolValueOf = Boolean.valueOf(z);
                Object[] objArr2 = {iAuthTabCallback, Boolean.valueOf(z), this.onWarmupCompleted, str};
                onWarmupCompleted(boolValueOf, Boolean.valueOf(IAuthTabCallback.onNavigationEvent(iAuthTabCallback, (String) IAuthTabCallback.IAuthTabCallback(841288949, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr2, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -841288946), this.onWarmupCompleted, str, !z)), String.valueOf(this.onWarmupCompleted));
                int i4 = onExtraCallback + 5;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(@NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            drawPrimaryProgress.onExtraCallback();
            this.IAuthTabCallback.remove(this.onExtraCallbackWithResult.onExtraCallbackWithResult(str));
            int i2 = asBinder + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            int i = 2 % 2;
            drawPrimaryProgress.onExtraCallback();
            this.IAuthTabCallback.clear();
            int i2 = onExtraCallback + 95;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            int i = 2 % 2;
            drawPrimaryProgress.onExtraCallback();
            boolean zCommit = this.IAuthTabCallback.commit();
            int i2 = onExtraCallback + 47;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
            return zCommit;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            int i = 2 % 2;
            int i2 = asBinder + 45;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.apply();
            int i4 = asBinder + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
            int i10 = ~i;
            int i11 = (~(i10 | i6)) | (~(i8 | i6));
            int i12 = ~(i8 | i7 | i10);
            int i13 = i + i6 + i5 + ((-2109949842) * i4) + (2078889904 * i2);
            int i14 = i13 * i13;
            int i15 = ((-1963971821) * i) + 932184064 + (61854959 * i6) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i5) + (610271232 * i4) + (922746880 * i2) + (671350784 * i14);
            int i16 = (i * (-573803825)) + 196542130 + (i6 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i5 * (-573803307)) + (i4 * (-843101306)) + (i2 * (-1524517520)) + (i14 * 458489856);
            int i17 = i15 + (i16 * i16 * 64749568);
            return i17 != 1 ? i17 != 2 ? i17 != 3 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }

        private IAuthTabCallback() {
        }

        public static final /* synthetic */ float IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2, float f) throws NumberFormatException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(str, getmax, str2, f);
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return fOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ int IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2, int i) throws NumberFormatException {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                iAuthTabCallback.onExtraCallback(str, getmax, str2, i);
                throw null;
            }
            int iOnExtraCallback = iAuthTabCallback.onExtraCallback(str, getmax, str2, i);
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String IAuthTabCallback(IAuthTabCallback iAuthTabCallback, long j, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = iAuthTabCallback.onNavigationEvent(j, getmax, str);
            int i4 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnNavigationEvent;
        }

        public static final /* synthetic */ String IAuthTabCallback(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                iAuthTabCallback.onExtraCallbackWithResult(str, getmax, str2);
                obj.hashCode();
                throw null;
            }
            String strOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(str, getmax, str2);
            int i3 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return strOnExtraCallbackWithResult;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            Set<String> set = (Set) objArr[1];
            getMax getmax = (getMax) objArr[2];
            String str = (String) objArr[3];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Set<String> setIAuthTabCallback = iAuthTabCallback.IAuthTabCallback(set, getmax, str);
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
            return setIAuthTabCallback;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NumberFormatException {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            String str = (String) objArr[1];
            getMax getmax = (getMax) objArr[2];
            String str2 = (String) objArr[3];
            long jLongValue = ((Number) objArr[4]).longValue();
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(str, getmax, str2, jLongValue);
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return Long.valueOf(jOnExtraCallbackWithResult);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, int i, getMax getmax, String str) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String strOnExtraCallback = iAuthTabCallback.onExtraCallback(i, getmax, str);
            int i5 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return strOnExtraCallback;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            getMax getmax = (getMax) objArr[2];
            String str = (String) objArr[3];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback.onExtraCallbackWithResult(zBooleanValue, getmax, str);
            }
            iAuthTabCallback.onExtraCallbackWithResult(zBooleanValue, getmax, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String onNavigationEvent(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted(str, getmax, str2);
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }

        public static final /* synthetic */ boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2, boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(str, getmax, str2, z);
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return zOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ String onWarmupCompleted(IAuthTabCallback iAuthTabCallback, float f, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallback = iAuthTabCallback.onExtraCallback(f, getmax, str);
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ Set onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Set set, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            Set set2 = (Set) IAuthTabCallback(441627798, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback, set, getmax, str}, iOnExtraCallbackWithResult2, -441627798);
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return set2;
        }

        private final String onExtraCallback(int i, getMax getmax, String str) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String strValueOf = String.valueOf(i);
            if (i4 == 0) {
                return onExtraCallbackWithResult(strValueOf, getmax, str);
            }
            onExtraCallbackWithResult(strValueOf, getmax, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String onNavigationEvent(long j, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(String.valueOf(j), getmax, str);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            int i5 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return strOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String onExtraCallback(float f, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(String.valueOf(f), getmax, str);
            int i4 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String onExtraCallbackWithResult(String str, getMax getmax, String str2) {
            int i = 2 % 2;
            if (!TextUtils.isEmpty(str)) {
                Intrinsics.checkNotNull(str);
                String strOnNavigationEvent = getmax.onNavigationEvent(str, str2);
                int i2 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 53 / 0;
                }
                return strOnNavigationEvent;
            }
            int i4 = onExtraCallbackWithResult + 113;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 35;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return "";
            }
            throw null;
        }

        private final String onExtraCallbackWithResult(boolean z, getMax getmax, String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(String.valueOf(z), getmax, str);
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Set set = (Set) objArr[1];
            getMax getmax = (getMax) objArr[2];
            String str = (String) objArr[3];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (set == null) {
                int i5 = i3 + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i3 + 47;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return null;
            }
            HashSet hashSet = new HashSet(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(getmax.onNavigationEvent(String.valueOf(it.next()), str));
                int i9 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
            return hashSet;
        }

        private final int onExtraCallback(String str, getMax getmax, String str2, int i) throws NumberFormatException {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String strIAuthTabCallback = getmax.IAuthTabCallback(str, str2);
            if (TextUtils.isEmpty(strIAuthTabCallback)) {
                return i;
            }
            Integer numValueOf = Integer.valueOf(strIAuthTabCallback);
            Intrinsics.checkNotNullExpressionValue(numValueOf, "");
            int iIntValue = numValueOf.intValue();
            int i5 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iIntValue;
        }

        private final long onExtraCallbackWithResult(String str, getMax getmax, String str2, long j) throws NumberFormatException {
            int i = 2 % 2;
            String strIAuthTabCallback = getmax.IAuthTabCallback(str, str2);
            if (!TextUtils.isEmpty(strIAuthTabCallback)) {
                Long lValueOf = Long.valueOf(strIAuthTabCallback);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "");
                return lValueOf.longValue();
            }
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        private final float onExtraCallbackWithResult(String str, getMax getmax, String str2, float f) throws NumberFormatException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                String strIAuthTabCallback = getmax.IAuthTabCallback(str, str2);
                if (TextUtils.isEmpty(strIAuthTabCallback)) {
                    int i3 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return f;
                }
                Float fValueOf = Float.valueOf(strIAuthTabCallback);
                Intrinsics.checkNotNullExpressionValue(fValueOf, "");
                float fFloatValue = fValueOf.floatValue();
                int i5 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return fFloatValue;
            }
            TextUtils.isEmpty(getmax.IAuthTabCallback(str, str2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String onWarmupCompleted(String str, getMax getmax, String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                if (!TextUtils.isEmpty(str)) {
                    return getmax.IAuthTabCallback(str, str2);
                }
                int i3 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return "";
            }
            TextUtils.isEmpty(str);
            throw null;
        }

        private final boolean onExtraCallbackWithResult(String str, getMax getmax, String str2, boolean z) {
            int i = 2 % 2;
            String strIAuthTabCallback = getmax.IAuthTabCallback(str, str2);
            if (!TextUtils.isEmpty(strIAuthTabCallback)) {
                Boolean boolValueOf = Boolean.valueOf(strIAuthTabCallback);
                Intrinsics.checkNotNullExpressionValue(boolValueOf, "");
                return boolValueOf.booleanValue();
            }
            int i2 = onNavigationEvent;
            int i3 = i2 + 29;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        private final Set<String> IAuthTabCallback(Set<String> set, getMax getmax, String str) {
            String strIAuthTabCallback;
            int i = 2 % 2;
            Object obj = null;
            if (set == null) {
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            HashSet hashSet = new HashSet(set.size());
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2)) {
                    strIAuthTabCallback = getmax.IAuthTabCallback(str2, str);
                } else {
                    int i4 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    strIAuthTabCallback = "";
                }
                hashSet.add(strIAuthTabCallback);
            }
            return hashSet;
        }

        public static final /* synthetic */ long onExtraCallback(IAuthTabCallback iAuthTabCallback, String str, getMax getmax, String str2, long j) {
            Object[] objArr = {iAuthTabCallback, str, getmax, str2, Long.valueOf(j)};
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return ((Long) IAuthTabCallback(-394090147, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, 394090149)).longValue();
        }

        public static final /* synthetic */ Set IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Set set, getMax getmax, String str) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return (Set) IAuthTabCallback(1668919361, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{iAuthTabCallback, set, getmax, str}, iOnExtraCallbackWithResult2, -1668919360);
        }

        public static final /* synthetic */ String onExtraCallback(IAuthTabCallback iAuthTabCallback, boolean z, getMax getmax, String str) {
            Object[] objArr = {iAuthTabCallback, Boolean.valueOf(z), getmax, str};
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return (String) IAuthTabCallback(841288949, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -841288946);
        }

        private final Set<String> onWarmupCompleted(Set<?> set, getMax getmax, String str) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return (Set) IAuthTabCallback(441627798, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this, set, getmax, str}, iOnExtraCallbackWithResult2, -441627798);
        }
    }

    static {
        onWarmupCompleted();
        Companion = new IAuthTabCallback(null);
        onExtraCallback = false;
        onExtraCallbackWithResult = false;
        int i = ICustomTabsCallback + 67;
        extraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> IAuthTabCallback() throws Throwable {
        Map.Entry<String, ?> next;
        String key;
        int i = 2 % 2;
        Map<String, ?> all = this.asInterface.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        ArrayList arrayList = new ArrayList(all.size());
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 45;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                next = it.next();
                getProgressColor getprogresscolor = this.onNavigationEvent;
                String key2 = next.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "");
                getprogresscolor.onWarmupCompleted(key2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            next = it.next();
            try {
                getProgressColor getprogresscolor2 = this.onNavigationEvent;
                String key3 = next.getKey();
                Intrinsics.checkNotNullExpressionValue(key3, "");
                key = getprogresscolor2.onWarmupCompleted(key3);
                int i3 = access000 + 53;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable unused) {
                if (IAuthTabCallback) {
                }
                key = next.getKey();
            }
            arrayList.add(key);
            if (IAuthTabCallback) {
                drawPrimaryProgress.onExtraCallback();
                String key4 = next.getKey();
                Object[] objArr = new Object[1];
                b(new char[]{8911, 7488, 8852, 51621, 7346}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a(new char[]{64612, 52874, 26986, 15331, 52288, 49157, 37090, 26710, 50770, 41304, 489, 47390, 16570, 22081, 34922, 42491, 62324, 607, 2003, 47332, 39431, 4375, 41192, 49200, 41159, 16397, 25528, 34555, 50125, 56472, 19033, 36269, 51904, 38614, 38174, 54788, 64279, 49445, 40396, 49873, 49558, 64626}, 42 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
                ((String) objArr2[0]).intern();
                Objects.toString(key4);
            }
            key = next.getKey();
            arrayList.add(key);
        }
        return arrayList;
    }

    static void onWarmupCompleted() {
        onTransact = (char) 6309;
        IAuthTabCallbackDefault = (char) 48667;
        IAuthTabCallbackStubProxy = (char) 59387;
        getInterfaceDescriptor = (char) 2196;
        access100 = 7161429692648771168L;
    }
}
