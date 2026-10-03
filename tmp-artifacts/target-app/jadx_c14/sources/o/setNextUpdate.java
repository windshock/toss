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
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setNextUpdate implements ALCFaceQuality {
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {94, -43, -105, 125};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = -2050651637;
    private static int onExtraCallbackWithResult = -1538795497;
    private static int IAuthTabCallback = 970018537;
    private static byte[] onNavigationEvent = {88, 104, -110, -107, 105, -69, 80, -74, 73, -78, 101, Byte.MIN_VALUE, -65, 70, -75, 81, 66, 115, -6, 70, 73, -79, 70, 69, 123, -118, -69, -70, -67, 78, -74, 77, 121, 119, -127, -116, 83, -99, -125, -117, 115, -116, 94, -90, 78, -96, -82, 88, 8, 8, 8, 8, 8};
    private static long asBinder = 684811094145427992L;

    private static String $$c(byte b, short s, byte b2) {
        int i = 4 - (s * 4);
        int i2 = (b2 * 2) + 115;
        int i3 = b * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (-i) + i2;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = i2;
            i4 = i5;
            i2 = (-bArr[i]) + i6;
            i++;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = asInterface + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 107;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 77;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        setText settext;
        List<String> listEmptyList;
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i2 = asInterface + 91;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            b(new char[]{9862, 20660, 9925, 61800, 49615, 64397, 54062, 18629, 25267, 34216, 38756, 3105, 44623, 18803, 23424, 49215, 59907, 3804, 7708}, Color.argb(0, 0, 0, 0), objArr2);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            return;
        }
        try {
            settext = new setText(jsonObject);
            JsonObject jsonObjectOnExtraCallbackWithResult = settext.onExtraCallbackWithResult();
            Object[] objArr3 = new Object[1];
            a((short) Color.argb(0, 0, 0, 0), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 124), (-562188770) + Process.getGidForName(""), 1651075470 + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 20, objArr3);
            JsonArray asJsonArray = jsonObjectOnExtraCallbackWithResult.get(((String) objArr3[0]).intern()).getAsJsonArray();
            if (asJsonArray != null) {
                listEmptyList = new ArrayList<>();
                Iterator it = asJsonArray.iterator();
                int i4 = asInterface + 23;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 2;
                }
                while (it.hasNext()) {
                    int i6 = asInterface + 79;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        ((JsonElement) it.next()).getAsString();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    String asString = ((JsonElement) it.next()).getAsString();
                    if (asString != null) {
                        listEmptyList.add(asString);
                    }
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            objArr = new Object[1];
            a((short) View.resolveSizeAndState(0, 0, 0), (byte) ((-88) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-562188761) - (ViewConfiguration.getTouchSlop() >> 8), (Process.myTid() >> 22) + 1651075468, (-24) - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        } catch (Exception e) {
            e = e;
        }
        try {
            onNavigationEvent(context, listEmptyList, settext.onNavigationEvent(((String) objArr[0]).intern(), ""));
        } catch (Exception e2) {
            e = e2;
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, e, (String) null, (Map) null, 6, (Object) null);
        }
    }

    private final void onNavigationEvent(Context context, List<String> list, String str) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((short) View.combineMeasuredStates(0, 0), (byte) (KeyEvent.getDeadChar(0, 0) + 56), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 562188803, 1651075402 + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-30) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) ((-101) - View.MeasureSpec.makeMeasureSpec(0, 0)), (-562188803) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1651075473 - TextUtils.lastIndexOf("", '0'), (-25) - View.resolveSizeAndState(0, 0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(strJoinToString$default);
        Uri uri = Uri.parse(sb.toString());
        Object[] objArr3 = new Object[1];
        a((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (72 - TextUtils.getCapsMode("", 0, 0)), (-562188798) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1651075456 - View.getDefaultSize(0, 0), (-2) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        Intent intent = new Intent(((String) objArr3[0]).intern(), uri);
        Object[] objArr4 = new Object[1];
        b(new char[]{54181, 38815, 54230, 45832, 1766, 15036, 37203, 35295, 38807, 17044, 54548, 52553}, (Process.getThreadPriority(0) + 20) >> 6, objArr4);
        intent.putExtra(((String) objArr4[0]).intern(), str);
        context.startActivity(intent);
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 45811), 84 - KeyEvent.getDeadChar(0, 0), 21233 - (ViewConfiguration.getLongPressTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14185), TextUtils.lastIndexOf("", '0', 0, 0) + 20, 8808 - ExpandableListView.getPackedPositionType(0L), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 3;
                }
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[PHI: r4
      0x0089: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v21 byte[]) binds: [B:20:0x0087, B:17:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNextUpdate.a(short, byte, int, int, int, java.lang.Object[]):void");
    }
}
