package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.noStore;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceClip implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted = {27495, 27514, 27507, 27510, 27259, 27176, 27181, 27152, 27183, 27177, 27176, 27168, 27256, 27174, 27168, 27198, 27174, 27177};
    private static long onExtraCallback = -8146112379171224032L;

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.onWarmupCompleted(str);
        }
        super.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return onnavigationevent;
    }

    @Override // o.ALCFaceQuality
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        noStore nostoreIAuthTabCallbackStub;
        noStore nostoreOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 196, 4}, true, null, objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
            switch (strOnNavigationEvent.hashCode()) {
                case -1867169789:
                    Object[] objArr2 = new Object[1];
                    b(new char[]{53843, 4085, 53792, 12972, 9947, 23776, 42102, 5009, 9862, 15962, 18848}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                    if (strOnNavigationEvent.equals(((String) objArr2[0]).intern())) {
                        int i2 = IAuthTabCallback + 7;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 != 0) {
                            noStore.Companion.IAuthTabCallbackStub();
                            throw null;
                        }
                        nostoreIAuthTabCallbackStub = noStore.Companion.IAuthTabCallbackStub();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case -1699077946:
                    Object[] objArr3 = new Object[1];
                    b(new char[]{42152, 64704, 42186, 49549, 49327, 47748, 4077, 47104, 20603, 52555, 44994, 41912, 19875}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr3);
                    if (strOnNavigationEvent.equals(((String) objArr3[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.onNavigationEvent();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case -1012533949:
                    b(new char[]{60077, 62922, 60111, 51335, 33622, 63869, 10104, 37013, 7806, 50267, 60475, 35624, 932, 54067, 57475}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new Object[1]);
                    if (!strOnNavigationEvent.equals(((String) r6[0]).intern())) {
                        return;
                    }
                    nostoreOnExtraCallback = noStore.Companion.onExtraCallback();
                    int i3 = IAuthTabCallback + 105;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    nostoreIAuthTabCallbackStub = nostoreOnExtraCallback;
                    minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                    return;
                case -787957717:
                    Object[] objArr4 = new Object[1];
                    a(new int[]{12, 6, 0, 2}, false, new byte[]{0, 1, 0, 0, 0, 0}, objArr4);
                    if (strOnNavigationEvent.equals(((String) objArr4[0]).intern())) {
                        nostoreOnExtraCallback = noStore.Companion.access100();
                        int i5 = onExtraCallbackWithResult + 61;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        nostoreIAuthTabCallbackStub = nostoreOnExtraCallback;
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case -580245368:
                    Object[] objArr5 = new Object[1];
                    b(new char[]{60000, 54590, 59907, 59517, 8251, 23053, 25659, 54233, 7861, 58518, 20295, 51302}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr5);
                    if (strOnNavigationEvent.equals(((String) objArr5[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.IAuthTabCallback();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case -338155457:
                    Object[] objArr6 = new Object[1];
                    b(new char[]{47878, 45443, 47989, 36032, 5095, 27097, 13122, 33970, 20475, 32826, 31883, 40735, 21011, 38754}, TextUtils.getTrimmedLength(""), objArr6);
                    if (strOnNavigationEvent.equals(((String) objArr6[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.asInterface();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case 114595:
                    Object[] objArr7 = new Object[1];
                    b(new char[]{46187, 10466, 46111, 5551, 5219, 28235, 55943}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr7);
                    if (strOnNavigationEvent.equals(((String) objArr7[0]).intern())) {
                        nostoreIAuthTabCallbackStub = noStore.Companion.asBinder();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case 96784904:
                    Object[] objArr8 = new Object[1];
                    b(new char[]{12899, 34610, 12806, 47724, 40805, 58703, 56801, 27146, 50849}, ViewConfiguration.getScrollBarSize() >> 8, objArr8);
                    if (!strOnNavigationEvent.equals(((String) objArr8[0]).intern())) {
                        return;
                    }
                    nostoreIAuthTabCallbackStub = noStore.Companion.onWarmupCompleted();
                    minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                    return;
                case 1318380226:
                    Object[] objArr9 = new Object[1];
                    b(new char[]{11301, 50629, 11350, 63622, 12924, 18498, 64348, 19628, 55490, 62588, 23829, 22275}, TextUtils.indexOf("", "", 0, 0), objArr9);
                    if (strOnNavigationEvent.equals(((String) objArr9[0]).intern())) {
                        int i7 = IAuthTabCallback + 25;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 != 0) {
                            noStore.Companion.IAuthTabCallbackDefault();
                            throw null;
                        }
                        nostoreIAuthTabCallbackStub = noStore.Companion.IAuthTabCallbackDefault();
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case 1389060978:
                    Object[] objArr10 = new Object[1];
                    b(new char[]{18215, 15400, 18259, 365, 40707, 58680, 12001, 39182, 46042, 3473, 61551, 33468, 44594, 6857}, TextUtils.getOffsetBefore("", 0), objArr10);
                    if (strOnNavigationEvent.equals(((String) objArr10[0]).intern())) {
                        int i8 = IAuthTabCallback + 27;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        nostoreIAuthTabCallbackStub = (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 502194663, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -502194662, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                case 1936936629:
                    Object[] objArr11 = new Object[1];
                    a(new int[]{4, 8, 0, 0}, true, new byte[]{1, 0, 0, 0, 0, 0, 0, 1}, objArr11);
                    if (strOnNavigationEvent.equals(((String) objArr11[0]).intern())) {
                        int i10 = onExtraCallbackWithResult + 39;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        nostoreIAuthTabCallbackStub = (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
                        minFresh.onNavigationEvent(context, nostoreIAuthTabCallbackStub);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 85;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 2;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 45812), AndroidCharacter.getMirror('0') + '$', (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 14186), 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8808 - (ViewConfiguration.getFadingEdgeLength() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35283), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 35, 14239 - (ViewConfiguration.getTouchSlop() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 47;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    j = 0;
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i9 = $11 + 51;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 10936), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 64, 16718 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, 17657 - KeyEvent.getDeadChar(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getTouchSlop() >> 8)), 70 - Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i12 = $10 + 63;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 1, i3);
                System.arraycopy(cArr5, 0, cArr4, i3 >> i5, i5);
                System.arraycopy(cArr5, i5, cArr4, 1, i3 - i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i13, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i14 = $11 + 99;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
