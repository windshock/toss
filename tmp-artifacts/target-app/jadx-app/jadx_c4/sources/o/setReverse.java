package o;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setReverse {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted;
    private final Context onExtraCallback;
    private static int[] onExtraCallbackWithResult = {-615370785, -1257500534, -73444561, -603070004, -377403535, 386376514, -370972770, -25112583, -1078968147, 1443892392, -627417109, -1024523024, -642753257, 1148645537, 1523172031, 561711626, -1260397503, -1371497242};
    private static char[] onNavigationEvent = {64992, 64995, 64988, 64997, 64902, 64897, 64994, 65022, 64977, 64976, 64901, 64983, 64996, 64986, 64960, 64989, 64991, 64926, 64982, 64990, 64978, 64924, 64987, 64966, 64970};
    private static char IAuthTabCallback = 51244;

    public setReverse(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = context;
    }

    public final CertificatePinner onExtraCallbackWithResult(int i) throws Throwable {
        Object next;
        int i2 = 2 % 2;
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        Set<onWarmupCompleted> setOnExtraCallback = onExtraCallback(i);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setOnExtraCallback.iterator();
        while (it.hasNext()) {
            int i3 = IAuthTabCallbackDefault + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                next = it.next();
                int i4 = 66 / 0;
                if (System.currentTimeMillis() < ((onWarmupCompleted) next).onExtraCallback()) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (System.currentTimeMillis() < ((onWarmupCompleted) next).onExtraCallback()) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i5 = IAuthTabCallbackDefault + 19;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                ((onWarmupCompleted) it2.next()).onNavigationEvent().iterator();
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) it2.next();
            Iterator<T> it3 = onwarmupcompleted.onNavigationEvent().iterator();
            while (it3.hasNext()) {
                int i6 = onWarmupCompleted + 79;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    onwarmupcompleted.onExtraCallbackWithResult().iterator();
                    obj.hashCode();
                    throw null;
                }
                String str = (String) it3.next();
                for (String str2 : onwarmupcompleted.onExtraCallbackWithResult()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr = new Object[1];
                    b((byte) (61 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 7 - Color.blue(0), new char[]{'\f', 24, 0, '\n', 0, 14, 13810}, objArr);
                    sb.append(((String) objArr[0]).intern());
                    sb.append(str2);
                    builder.add(str, new String[]{sb.toString()});
                }
            }
        }
        return builder.build();
    }

    private final Set<onWarmupCompleted> onExtraCallback(int i) throws Throwable {
        int i2 = 2 % 2;
        XmlResourceParser xml = this.onExtraCallback.getResources().getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (xml.next() != 1) {
            if (xml.getEventType() == 2) {
                int i3 = IAuthTabCallbackDefault + 1;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    String name = xml.getName();
                    a(new int[]{-996675627, 14967822, -627724263, -199162274, 906203381, -1583080578, 2104245112, 858887115}, 67 % (Process.myPid() % 62), new Object[1]);
                    if (!(!Intrinsics.areEqual(name, ((String) r6[0]).intern()))) {
                        int i4 = IAuthTabCallbackDefault + 33;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        linkedHashSet.add(onExtraCallbackWithResult(xml, xml.getDepth()));
                    }
                } else {
                    String name2 = xml.getName();
                    Object[] objArr = new Object[1];
                    a(new int[]{-996675627, 14967822, -627724263, -199162274, 906203381, -1583080578, 2104245112, 858887115}, 13 - (Process.myPid() >> 22), objArr);
                    if (Intrinsics.areEqual(name2, ((String) objArr[0]).intern())) {
                        int i42 = IAuthTabCallbackDefault + 33;
                        onWarmupCompleted = i42 % 128;
                        int i52 = i42 % 2;
                        linkedHashSet.add(onExtraCallbackWithResult(xml, xml.getDepth()));
                    }
                }
            }
        }
        xml.close();
        return linkedHashSet;
    }

    private final onWarmupCompleted onExtraCallbackWithResult(XmlPullParser xmlPullParser, int i) throws Throwable {
        int i2;
        String name;
        int i3 = 2;
        int i4 = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        int i5 = onWarmupCompleted + 55;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        long time = Long.MAX_VALUE;
        while (true) {
            xmlPullParser.next();
            if (xmlPullParser.getDepth() <= i) {
                return new onWarmupCompleted(linkedHashSet, arrayList, time);
            }
            if (xmlPullParser.getEventType() == i3 && (name = xmlPullParser.getName()) != null) {
                int iHashCode = name.hashCode();
                Unit unit = null;
                if (iHashCode == -1326197564) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-996675627, 14967822, 2016947377, 586109188}, 6 - KeyEvent.keyCodeFromString(""), objArr);
                    if (name.equals(((String) objArr[0]).intern())) {
                        int i7 = onWarmupCompleted + 35;
                        IAuthTabCallbackDefault = i7 % 128;
                        int i8 = i7 % 2;
                        Object[] objArr2 = new Object[1];
                        b((byte) (ExpandableListView.getPackedPositionGroup(0L) + 56), 17 - Gravity.getAbsoluteGravity(0, 0), new char[]{'\n', 18, 6, 19, 21, '\r', 15, 3, 3, '\r', '\f', 1, 15, 24, '\n', 18, 13857}, objArr2);
                        String attributeValue = xmlPullParser.getAttributeValue(null, ((String) objArr2[0]).intern());
                        Object[] objArr3 = new Object[1];
                        a(new int[]{1525503066, 386510206}, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                        boolean zAreEqual = Intrinsics.areEqual(attributeValue, ((String) objArr3[0]).intern());
                        String strNextText = xmlPullParser.nextText();
                        if (zAreEqual) {
                            StringBuilder sb = new StringBuilder();
                            Object[] objArr4 = new Object[1];
                            a(new int[]{-1945480383, -1608866826}, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                            sb.append(((String) objArr4[0]).intern());
                            sb.append(strNextText);
                            strNextText = sb.toString();
                            int i9 = onWarmupCompleted + 59;
                            IAuthTabCallbackDefault = i9 % 128;
                            i2 = 2;
                            int i10 = i9 % 2;
                        } else {
                            i2 = 2;
                        }
                        linkedHashSet.add(strNextText);
                    }
                    i3 = i2;
                } else if (iHashCode == -569700310) {
                    Object[] objArr5 = new Object[1];
                    a(new int[]{-640510416, 1482762602, 1906152208, -572295495}, 7 - TextUtils.getOffsetAfter("", 0), objArr5);
                    if (name.equals(((String) objArr5[0]).intern())) {
                        Object[] objArr6 = new Object[1];
                        a(new int[]{-550139251, -246134511, -579067042, 392253444, -612049558, 314003897}, TextUtils.indexOf("", "") + 10, objArr6);
                        String attributeValue2 = xmlPullParser.getAttributeValue(null, ((String) objArr6[0]).intern());
                        if (attributeValue2 != null) {
                            try {
                                Result.Companion companion = kotlin.Result.Companion;
                                Object[] objArr7 = new Object[1];
                                b((byte) (KeyEvent.normalizeMetaState(0) + 41), TextUtils.indexOf("", "", 0, 0) + 10, new char[]{13836, 13836, 13836, 13836, 22, '\f', '\f', 22, 13863, 13863}, objArr7);
                                Date date = new SimpleDateFormat(((String) objArr7[0]).intern()).parse(attributeValue2);
                                if (date != null) {
                                    time = date.getTime();
                                    unit = Unit.INSTANCE;
                                }
                                kotlin.Result.constructor-impl(unit);
                                int i11 = IAuthTabCallbackDefault + 89;
                                onWarmupCompleted = i11 % 128;
                                int i12 = i11 % 2;
                            } catch (Throwable th) {
                                Result.Companion companion2 = kotlin.Result.Companion;
                                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                            }
                            i3 = 2;
                        }
                    }
                } else if (iHashCode == 110997) {
                    Object[] objArr8 = new Object[1];
                    a(new int[]{2125782189, -44647924}, TextUtils.getCapsMode("", 0, 0) + 3, objArr8);
                    if (name.equals(((String) objArr8[0]).intern())) {
                        arrayList.add(xmlPullParser.nextText());
                    }
                }
                i2 = 2;
                i3 = i2;
            }
            i2 = i3;
            i3 = i2;
        }
    }

    static final class onWarmupCompleted {
        private final List<String> onExtraCallback;
        private final Set<String> onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private static final byte[] $$a = {35, -11, -97, -73};
        private static final int $$b = 52;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static long IAuthTabCallback = -1356941238036161283L;
        private static int onWarmupCompleted = -1776194565;
        private static char asBinder = 27643;

        private static String $$c(int i, byte b, byte b2) {
            int i2 = 110 - b2;
            int i3 = b + 4;
            int i4 = i * 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 += i4;
            }
            while (true) {
                i5++;
                i3++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i3];
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 101;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i4 + 99;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (obj instanceof onWarmupCompleted) {
                onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) && this.onNavigationEvent == onwarmupcompleted.onNavigationEvent;
            }
            int i8 = i2 + 101;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            return i3 == 0 ? (((iHashCode >> 21) / this.onExtraCallback.hashCode()) >>> 72) << Long.hashCode(this.onNavigationEvent) : (((iHashCode * 31) + this.onExtraCallback.hashCode()) * 31) + Long.hashCode(this.onNavigationEvent);
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            Set<String> set = this.onExtraCallbackWithResult;
            List<String> list = this.onExtraCallback;
            long j = this.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 505454328 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{56429, 3909, 60102, 49613, 34781, 12285, 7865, 45881, 19768, 3771, 49652, 39252, 42300, 47459, 23041, 52179, 22179, 22100, 40505, 63608, 34419}, new char[]{63238, 46055, 8468, 33041}, new char[]{63657, 8350, 56094, 36279}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(set);
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1677674119 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{11664, 11931, 46327, 49983, 22583, 10438, 47113}, new char[]{63238, 46055, 8468, 33041}, new char[]{34489, 65350, 37731, 27674}, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(list);
            Object[] objArr3 = new Object[1];
            a((char) (Gravity.getAbsoluteGravity(0, 0) + 45978), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{49091, 25377, 14483, 4609, 56043, 6202, 40664, 57995, 23559, 20608, 52543, 31465, 58696, 64130, 32801, 27254, 57914, 3920, 53282, 27561, 42207, 1416, 56111, 37175, 10804, 27700, 55638, 48900}, new char[]{63238, 46055, 8468, 33041}, new char[]{59165, 64921, 39523, 15027}, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(j);
            Object[] objArr4 = new Object[1];
            a((char) (60126 - (ViewConfiguration.getTapTimeout() >> 16)), 728081833 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{47776}, new char[]{63238, 46055, 8468, 33041}, new char[]{43612, 26021, 56875, 57578}, objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onWarmupCompleted(@NotNull Set<String> set, @NotNull List<String> list, long j) {
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallbackWithResult = set;
            this.onExtraCallback = list;
            this.onNavigationEvent = j;
        }

        public final Set<String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            Set<String> set = this.onExtraCallbackWithResult;
            int i5 = i3 + 105;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return set;
        }

        public final List<String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 111;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            List<String> list = this.onExtraCallback;
            int i4 = i2 + 67;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return list;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 91;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c2;
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $10 + 29;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 3;
            }
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i3));
                        int defaultSize = 43 - View.getDefaultSize(i3, i3);
                        int scrollBarFadeDuration = 1451 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b = (byte) i3;
                        byte b2 = (byte) (b - 1);
                        String str$$c = $$c(b, b2, (byte) (b2 + 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, defaultSize, scrollBarFadeDuration, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 49124);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 45;
                            int iIndexOf = TextUtils.indexOf("", "", i3) + 1494;
                            byte b3 = (byte) i3;
                            byte b4 = (byte) (b3 - 1);
                            String str$$c2 = $$c(b3, b4, (byte) (-b4));
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i3] = Object.class;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, packedPositionChild, iIndexOf, 1533236389, false, str$$c2, clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        int i6 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                        try {
                            Object[] objArr4 = new Object[3];
                            objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                            objArr4[1] = Integer.valueOf(i6);
                            objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23972);
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 50;
                                int scrollDefaultDelay = 22939 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                c2 = 3;
                                Class[] clsArr3 = new Class[3];
                                clsArr3[i3] = Object.class;
                                clsArr3[1] = Integer.TYPE;
                                clsArr3[2] = Integer.TYPE;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionType, scrollDefaultDelay, 1872485556, false, "k", clsArr3);
                            } else {
                                c2 = 3;
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i7 = cArr4[iIntValue2] * 32718;
                            try {
                                Object[] objArr5 = new Object[2];
                                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                                objArr5[i3] = Integer.valueOf(i7);
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45847);
                                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29;
                                    int iBlue = 12577 - Color.blue(i3);
                                    Class[] clsArr4 = new Class[2];
                                    clsArr4[i3] = Integer.TYPE;
                                    clsArr4[1] = Integer.TYPE;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, keyRepeatDelay, iBlue, 1401536470, false, "l", clsArr4);
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i8 = $10 + 15;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                i3 = 0;
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
            objArr[0] = new String(cArr6);
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) + 72, 8848 - View.resolveSizeAndState(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 73, ((Process.getThreadPriority(0) + 20) >> 6) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        char c = '0';
        if (iArr5 != null) {
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr4 = new Object[1];
                    objArr4[i6] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", c) + 73, 8847 - MotionEvent.axisFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i11++;
                    i5 = -1469660336;
                    c = '0';
                    i6 = 0;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $10 + 25;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = $11 + 41;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 0; i16 < 16; i16++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0) + 40, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4033), 78 - TextUtils.getOffsetAfter("", 0), 7398 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, Color.alpha(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), View.MeasureSpec.getSize(0) + 26, 23139 - View.resolveSize(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $10 + 49;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = $10 + 101;
                    $11 = i3 % 128;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - MotionEvent.axisFromString("")), 74 - (KeyEvent.getMaxKeyCode() >> 16), 8088 - (ViewConfiguration.getTapTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 30, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i11 = $10 + 7;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        i3 = $11 + 51;
                        $10 = i3 % 128;
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i17 = $10 + 113;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                }
                int i19 = i3 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i172 = $10 + 113;
                $11 = i172 % 128;
                int i182 = i172 % 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = $11 + 55;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
