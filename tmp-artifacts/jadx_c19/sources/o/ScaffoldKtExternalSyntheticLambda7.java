package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ScaffoldKtExternalSyntheticLambda7 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 0;
    private static final Pattern IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private static final ImmutableSet<String> asBinder;
    private static int asInterface;
    private static final ImmutableSet<String> onExtraCallbackWithResult;
    private static final ImmutableSet<String> onNavigationEvent;
    private static final ImmutableSet<String> onTransact;
    public final int IAuthTabCallback;
    public final int onExtraCallback;
    public final int onWarmupCompleted;

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackDefault ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $10 + 93;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Gravity.getAbsoluteGravity(0, 0)), KeyEvent.getDeadChar(0, 0) + 84, TextUtils.getCapsMode("", 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, 8808 - TextUtils.indexOf("", "", 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static {
        onExtraCallbackWithResult();
        IAuthTabCallbackStub = Pattern.compile("\\s+");
        Object[] objArr = new Object[1];
        a(new char[]{3702, 3608, 15388, 25221, 2413, 48714, 46319, 41677}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr);
        onTransact = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_AUTO, ((String) objArr[0]).intern());
        onExtraCallbackWithResult = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        onNavigationEvent = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
        asBinder = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int i2 = IAuthTabCallback_Parcel + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ScaffoldKtExternalSyntheticLambda7(int i2, int i3, int i4) {
        this.onWarmupCompleted = i2;
        this.IAuthTabCallback = i3;
        this.onExtraCallback = i4;
    }

    public static ScaffoldKtExternalSyntheticLambda7 onExtraCallbackWithResult(@Nullable String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 17;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if (str != null) {
            String lowerCase = Ascii.toLowerCase(str.trim());
            if (!lowerCase.isEmpty()) {
                return onWarmupCompleted(ImmutableSet.copyOf(TextUtils.split(lowerCase, IAuthTabCallbackStub)));
            }
            return null;
        }
        int i6 = i4 + 75;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 58 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[PHI: r2
      0x007e: PHI (r2v5 int) = (r2v4 int), (r2v15 int), (r2v15 int), (r2v15 int) binds: [B:29:0x0079, B:23:0x0066, B:14:0x0047, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ScaffoldKtExternalSyntheticLambda7 onWarmupCompleted(ImmutableSet<String> immutableSet) throws Throwable {
        String str;
        int iHashCode;
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStubProxy + 11;
        access100 = i6 % 128;
        Object obj = null;
        int i7 = 1;
        if (i6 % 2 == 0) {
            str = (String) Iterables.getFirst(Sets.intersection(asBinder, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
            iHashCode = str.hashCode();
            if (iHashCode != -1392885889) {
                i2 = 0;
                if (iHashCode == -1106037339) {
                    if (iHashCode == 92734940) {
                        int i8 = access100 + 69;
                        IAuthTabCallbackStubProxy = i8 % 128;
                        if (i8 % 2 != 0) {
                            str.equals(TtmlNode.ANNOTATION_POSITION_AFTER);
                            throw null;
                        }
                        i3 = str.equals(TtmlNode.ANNOTATION_POSITION_AFTER) ? 2 : 1;
                    }
                } else if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                    int i9 = access100 + 93;
                    IAuthTabCallbackStubProxy = i9 % 128;
                    i3 = i9 % 2 != 0 ? 10 : -2;
                }
            } else {
                i2 = 0;
                str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
            }
        } else {
            str = (String) Iterables.getFirst(Sets.intersection(asBinder, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
            iHashCode = str.hashCode();
            if (iHashCode != -1392885889) {
                i2 = 1;
                if (iHashCode == -1106037339) {
                }
            } else {
                i2 = 1;
                str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
            }
        }
        Sets.SetView setViewIntersection = Sets.intersection(onTransact, immutableSet);
        int i10 = -1;
        if (!setViewIntersection.isEmpty()) {
            String str2 = (String) setViewIntersection.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 == 3005871) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode2 == 3387192) {
                Object[] objArr = new Object[1];
                a(new char[]{3702, 3608, 15388, 25221, 2413, 48714, 46319, 41677}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                if (str2.equals(((String) objArr[0]).intern())) {
                    i10 = 0;
                }
            }
            return new ScaffoldKtExternalSyntheticLambda7(i10, 0, i3);
        }
        Sets.SetView setViewIntersection2 = Sets.intersection(onNavigationEvent, immutableSet);
        Sets.SetView setViewIntersection3 = Sets.intersection(onExtraCallbackWithResult, immutableSet);
        if (setViewIntersection2.isEmpty()) {
            int i11 = access100 + 51;
            IAuthTabCallbackStubProxy = i11 % 128;
            if (i11 % 2 != 0) {
                setViewIntersection3.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (setViewIntersection3.isEmpty()) {
                ScaffoldKtExternalSyntheticLambda7 scaffoldKtExternalSyntheticLambda7 = new ScaffoldKtExternalSyntheticLambda7(-1, 0, i3);
                int i12 = IAuthTabCallbackStubProxy + 105;
                access100 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 15 / 0;
                }
                return scaffoldKtExternalSyntheticLambda7;
            }
        }
        String str3 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 == -1274499742) {
            str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        } else if (iHashCode3 == 3417674 && str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
            int i14 = IAuthTabCallbackStubProxy + 83;
            access100 = i14 % 128;
            int i15 = i14 % 2;
            i7 = 2;
        }
        String str4 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                int i16 = access100 + 79;
                IAuthTabCallbackStubProxy = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 53 / 0;
                    if (iHashCode4 == 99657) {
                        if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                            int i18 = access100 + 77;
                            IAuthTabCallbackStubProxy = i18 % 128;
                            int i19 = i18 % 2;
                        }
                    }
                } else if (iHashCode4 == 99657) {
                }
            } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                int i20 = IAuthTabCallbackStubProxy + 43;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                i4 = 3;
            }
            return new ScaffoldKtExternalSyntheticLambda7(i4, i7, i3);
        }
        str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        i4 = i2;
        return new ScaffoldKtExternalSyntheticLambda7(i4, i7, i3);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackDefault = 5783725213615138298L;
    }
}
