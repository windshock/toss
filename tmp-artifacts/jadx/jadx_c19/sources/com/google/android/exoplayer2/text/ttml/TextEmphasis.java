package com.google.android.exoplayer2.text.ttml;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextEmphasis {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final ImmutableSet<String> MARK_FILL_VALUES;
    public static final int MARK_SHAPE_AUTO = -1;
    private static final ImmutableSet<String> MARK_SHAPE_VALUES;
    public static final int POSITION_OUTSIDE = -2;
    private static final ImmutableSet<String> POSITION_VALUES;
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES;
    private static final Pattern WHITESPACE_PATTERN;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final int markFill;
    public final int markShape;
    public final int position;

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 45812), 84 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 14186), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, (Process.myTid() >> 22) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $10 + 117;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static {
        onNavigationEvent();
        WHITESPACE_PATTERN = Pattern.compile("\\s+");
        Object[] objArr = new Object[1];
        a(new char[]{14451, 39257, 14365, 27740, 11880, 28050, 34170, 62433}, Drawable.resolveOpacity(0, 0), objArr);
        SINGLE_STYLE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_AUTO, ((String) objArr[0]).intern());
        MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
        POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TextEmphasis(int i2, int i3, int i4) {
        this.markShape = i2;
        this.markFill = i3;
        this.position = i4;
    }

    public static TextEmphasis parse(@Nullable String str) throws Throwable {
        int i2 = 2 % 2;
        if (str == null) {
            int i3 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 86 / 0;
            }
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        TextEmphasis words = parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
        int i5 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return words;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) throws Throwable {
        int i2;
        Sets.SetView setViewIntersection;
        int i3;
        int iHashCode;
        int i4 = 2;
        int i5 = 2 % 2;
        String str = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str.hashCode();
        Object obj = null;
        if (iHashCode2 != -1392885889) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 63;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (iHashCode2 != -1106037339) {
                int i8 = i6 + 33;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (iHashCode2 == 92734940 && str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    i2 = 2;
                }
            } else if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                i2 = -2;
            }
            setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
            int i10 = -1;
            if (setViewIntersection.isEmpty()) {
                String str2 = (String) setViewIntersection.iterator().next();
                int iHashCode3 = str2.hashCode();
                if (iHashCode3 == 3005871) {
                    str2.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
                } else if (iHashCode3 != 3387192) {
                    int i11 = onNavigationEvent + 67;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    Object[] objArr = new Object[1];
                    a(new char[]{14451, 39257, 14365, 27740, 11880, 28050, 34170, 62433}, ExpandableListView.getPackedPositionChild(0L) + 1, objArr);
                    if (str2.equals(((String) objArr[0]).intern())) {
                        i10 = 0;
                    }
                }
                return new TextEmphasis(i10, 0, i2);
            }
            Sets.SetView setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
            Sets.SetView setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
            if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
                return new TextEmphasis(-1, 0, i2);
            }
            String str3 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            int iHashCode4 = str3.hashCode();
            if (iHashCode4 != -1274499742) {
                if (iHashCode4 == 3417674 && str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                    int i13 = onNavigationEvent + 103;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 2;
                }
                String str4 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                iHashCode = str4.hashCode();
                if (iHashCode == -1360216880) {
                    if (iHashCode != -905816648) {
                        int i15 = onNavigationEvent + 69;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (iHashCode != 99657 || !str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        }
                    } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                        int i16 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        i4 = 3;
                    }
                    return new TextEmphasis(i4, i3, i2);
                }
                str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                i4 = 1;
                return new TextEmphasis(i4, i3, i2);
            }
            str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            i3 = 1;
            String str42 = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str42.hashCode();
            if (iHashCode == -1360216880) {
            }
            i4 = 1;
            return new TextEmphasis(i4, i3, i2);
        }
        str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
        i2 = 1;
        setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        int i102 = -1;
        if (setViewIntersection.isEmpty()) {
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = -8712780447945093208L;
    }
}
