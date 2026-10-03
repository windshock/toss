package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.google.gson.Gson;
import im.toss.splittarget.spec.fsm.AppState;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.SetDetectableSize;
import o.setJSExceptionHandler;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.stats.NetworkUsageMonitor$;
import viva.republica.toss.network.stats.RecordMap;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setJSExceptionHandler {
    private static final AppSetIdAndScope1 IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static final RecordMap asBinder;
    private static int getInterfaceDescriptor;
    private static final int onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static char[] onTransact;
    public static final setJSExceptionHandler onWarmupCompleted;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = o.setJSExceptionHandler.$$a
            int r5 = r5 * 4
            int r5 = r5 + 97
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setJSExceptionHandler.$$c(byte, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i2 | i7 | i8;
        int i10 = (~(i7 | i4)) | (~(i8 | i2));
        int i11 = (~(i4 | i2)) | (~(i7 | (~i2) | i8));
        int i12 = i2 + i5 + i + ((-160716491) * i3) + (1883135422 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i2) - 666828800) + ((-962678542) * i5) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i) + ((-1967783936) * i3) + ((-2092695552) * i6) + ((-870252544) * i13);
        int i15 = (i2 * 1975847376) + 750996803 + (i5 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i * 1975846509) + (i3 * (-526956143)) + (i6 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bool);
        int i4 = asInterface + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = IAuthTabCallbackStub + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(th);
        }
        onExtraCallbackWithResult(th);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(j, setDetectableSize);
        }
        IAuthTabCallback(j, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnTransact = onTransact();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, long j2, long j3, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(j, j2, j3, setDetectableSize);
        int i4 = asInterface + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = asInterface + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private setJSExceptionHandler() {
    }

    static {
        int i = 1;
        getInterfaceDescriptor = 1;
        onNavigationEvent();
        onWarmupCompleted = new setJSExceptionHandler();
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            int i2 = access100 + 69;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            i = 60;
        }
        onExtraCallback = i * 60000;
        IAuthTabCallback = ea10.onExtraCallbackWithResult("NetworkUsageMonitor");
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.stats.NetworkUsageMonitor$$ExternalSyntheticLambda5
            public final Object invoke() {
                return setJSExceptionHandler.onExtraCallbackWithResult();
            }
        });
        asBinder = new RecordMap();
        onNavigationEvent = 8;
        int i5 = access100 + 13;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Context IAuthTabCallback() {
        Context contextOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            int i3 = 58 / 0;
        } else {
            contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        }
        int i4 = asInterface + 119;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return contextOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        int i4 = asInterface + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return smallIconBitmap;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallbackWithResult.getValue();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((TextRoundCornerProgressBarSavedState1) (i3 != 0 ? IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4) : IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4))).onExtraCallback("KEY_INTERCEPTOR_LAST_SEND_TIME", 0L);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setJSExceptionHandler setjsexceptionhandler = (setJSExceptionHandler) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        ((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 735111569, new Object[]{setjsexceptionhandler}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -735111568, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).onNavigationEvent("KEY_INTERCEPTOR_LAST_SEND_TIME", jLongValue);
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final long IAuthTabCallbackStub() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        long j;
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4);
            j = 1;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4);
            j = 0;
        }
        return textRoundCornerProgressBarSavedState1.onExtraCallback("KEY_STATS_LAST_SEND_TIME", j);
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            ((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4)).onNavigationEvent("KEY_STATS_LAST_SEND_TIME", j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(iOnNavigationEvent2, 735111569, objArr, iOnNavigationEvent3, iOnNavigationEvent, -735111568, iOnNavigationEvent4)).onNavigationEvent("KEY_STATS_LAST_SEND_TIME", j);
        int i4 = asInterface + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (((Boolean) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 216163519, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -216163519, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue()) {
            int i2 = asInterface + 83;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            if (((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 735111569, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -735111568, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).onNavigationEvent("KEY_CONSUMPTION_RECORD")) {
                RecordMap recordMap = asBinder;
                int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                recordMap.putAll((Map) ((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 735111569, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, -735111568, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).onExtraCallback("KEY_CONSUMPTION_RECORD", new RecordMap()));
            }
            AppState.Companion.onExtraCallbackWithResult().onNavigationEvent(true).onWarmupCompleted(clearTid.onExtraCallback()).onWarmupCompleted(new NetworkUsageMonitor$.ExternalSyntheticLambda2(new NetworkUsageMonitor$.ExternalSyntheticLambda1()), new NetworkUsageMonitor$.ExternalSyntheticLambda4(new NetworkUsageMonitor$.ExternalSyntheticLambda3()));
        }
        int i4 = asInterface + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(Boolean bool) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted.asInterface();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("NetworkUsageMonitor", th);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            zzaj.onNavigationEvent().onActivityLayout();
            throw null;
        }
        if (!(!zzaj.onNavigationEvent().onActivityLayout()) || DERSet.onExtraCallback.MediaSessionCompatResultReceiverWrapper()) {
            return true;
        }
        int i3 = IAuthTabCallbackStub + 37;
        asInterface = i3 % 128;
        return i3 % 2 != 0;
    }

    public final void onNavigationEvent(@NotNull String str, long j) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            RecordMap recordMap = asBinder;
            recordMap.onWarmupCompleted(str, j);
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            ((TextRoundCornerProgressBarSavedState1) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 735111569, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -735111568, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).IAuthTabCallback("KEY_CONSUMPTION_RECORD", recordMap);
        }
    }

    private final void asInterface() {
        synchronized (this) {
            access000();
            access100();
        }
    }

    private static final Unit IAuthTabCallback(long j, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Regex regex = new Regex("\\s");
        String json = new Gson().toJson(asBinder, Map.class);
        Intrinsics.checkNotNullExpressionValue(json, "");
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.indexOf("", "", 0, 0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), regex.replace(json, ""));
        setDetectableSize.onExtraCallback("start_time", Long.valueOf(onWarmupCompleted.IAuthTabCallbackDefault()));
        setDetectableSize.onExtraCallback("end_time", Long.valueOf(j));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void access000() {
        int i = 2 % 2;
        RecordMap recordMap = asBinder;
        if (!recordMap.isEmpty()) {
            int i2 = asInterface + 89;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            final long jOnExtraCallback = zzaj.onWarmupCompleted().onExtraCallback();
            if (jOnExtraCallback > IAuthTabCallbackDefault() + onExtraCallback) {
                long jIAuthTabCallbackDefault = (jOnExtraCallback - IAuthTabCallbackDefault()) / 1000;
                recordMap.onExtraCallback();
                ConvertByteArrayToFloatArray.onWarmupCompleted("network_usage", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.network.stats.NetworkUsageMonitor$$ExternalSyntheticLambda6
                    public final Object invoke(Object obj) {
                        return setJSExceptionHandler.onExtraCallback(jOnExtraCallback, (SetDetectableSize) obj);
                    }
                }, 30, (Object) null);
                IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 104400335, new Object[]{this, Long.valueOf(jOnExtraCallback)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -104400332, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                recordMap.clear();
                int i4 = IAuthTabCallbackStub + 107;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onTransact[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59696), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.argb(0, 0, 0, 0)), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "") + 44, KeyEvent.normalizeMetaState(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16728093) - Color.rgb(0, 0, 0)), View.MeasureSpec.getMode(0) + 44, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $10 + 25;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static final Unit onWarmupCompleted(long j, long j2, long j3, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        if (j > 0) {
            int i2 = asInterface + 99;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                setDetectableSize.onExtraCallback("mobile_byte", Long.valueOf(j));
                throw null;
            }
            setDetectableSize.onExtraCallback("mobile_byte", Long.valueOf(j));
        }
        if (j2 > 0) {
            int i3 = IAuthTabCallbackStub + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            setDetectableSize.onExtraCallback("wifi_byte", Long.valueOf(j2));
        }
        setDetectableSize.onExtraCallback("start_time", Long.valueOf(onWarmupCompleted.IAuthTabCallbackStub()));
        setDetectableSize.onExtraCallback("end_time", Long.valueOf(j3));
        return Unit.INSTANCE;
    }

    private final void access100() {
        int i = 2 % 2;
        if (IAuthTabCallback().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            int i2 = IAuthTabCallbackStub + 21;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            final long jOnExtraCallback = zzaj.onWarmupCompleted().onExtraCallback();
            if (IAuthTabCallbackStub() == 0) {
                IAuthTabCallback(jOnExtraCallback);
                return;
            }
            if (jOnExtraCallback > IAuthTabCallbackStub() + onExtraCallback) {
                setReactQueueConfigurationSpec setreactqueueconfigurationspec = new setReactQueueConfigurationSpec(IAuthTabCallback(), IAuthTabCallbackStub(), jOnExtraCallback);
                final long jOnExtraCallback2 = setreactqueueconfigurationspec.onExtraCallback();
                final long jIAuthTabCallback = setreactqueueconfigurationspec.IAuthTabCallback();
                if (jOnExtraCallback2 <= 0) {
                    int i4 = IAuthTabCallbackStub + 111;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    if (jIAuthTabCallback <= 0) {
                        return;
                    }
                }
                long j = jOnExtraCallback2 / 1024;
                long j2 = jIAuthTabCallback / 1024;
                ConvertByteArrayToFloatArray.onWarmupCompleted("network_stats", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.network.stats.NetworkUsageMonitor$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return setJSExceptionHandler.onNavigationEvent(jOnExtraCallback2, jIAuthTabCallback, jOnExtraCallback, (SetDetectableSize) obj);
                    }
                }, 30, (Object) null);
                IAuthTabCallback(jOnExtraCallback);
                int i6 = IAuthTabCallbackStub + 67;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2080265781, new Object[]{th}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -2080265779, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(Boolean bool) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1074777744, new Object[]{bool}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -1074777740, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final TextRoundCornerProgressBarSavedState1 asBinder() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (TextRoundCornerProgressBarSavedState1) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 735111569, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -735111568, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final void onWarmupCompleted(long j) {
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 104400335, new Object[]{this, Long.valueOf(j)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -104400332, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public final boolean onExtraCallback() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 216163519, new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, -216163519, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).booleanValue();
    }

    static void onNavigationEvent() {
        onTransact = new char[]{60834, 64183, 50108, 43175, 45497};
        IAuthTabCallbackDefault = 8405870795764267734L;
    }
}
