package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.RSASSAPSSparams;
import o.SafeBag;
import o.genSignatureValueWithDigest;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.certificate.CertSignInfo;
import viva.republica.toss.certificate.CertificateUtil$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SafeBag {
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static short[] IAuthTabCallbackStub;
    private static int access000;
    private static byte[] asBinder;
    private static int asInterface;
    private static int[] getInterfaceDescriptor;
    public static final int onExtraCallback;
    public static final SafeBag onExtraCallbackWithResult;
    private static final TextRoundCornerProgressBarSavedState1 onNavigationEvent;
    private static int onTransact;
    private static final Regex onWarmupCompleted;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[RSASSAPSSparams.onNavigationEvent.values().length];
            try {
                iArr[RSASSAPSSparams.onNavigationEvent.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = o.SafeBag.$$a
            int r8 = r8 * 3
            int r8 = r8 + 115
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeBag.$$c(byte, byte, short):java.lang.String");
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Object obj = objArr[0];
        CertSignInfo certSignInfo = (CertSignInfo) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnNavigationEvent$7584564d = onNavigationEvent$7584564d(obj, certSignInfo);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 97;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return pairOnNavigationEvent$7584564d;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MatchResult matchResult = (MatchResult) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted(matchResult);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(th);
        }
        onExtraCallback(th);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i6));
        int i13 = i6 + i3 + i4 + (513088896 * i5) + ((-1342203445) * i2);
        int i14 = i13 * i13;
        int i15 = (665020156 * i6) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i4) + ((-771751936) * i5) + (1382285312 * i2) + ((-350355456) * i14);
        int i16 = ((i6 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i4 * (-363641803)) + (i5 * (-2127225984)) + (i2 * (-1080704249)) + (i14 * (-1523187712));
        switch (i15 + (i16 * i16 * (-227409920))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(th);
        }
        IAuthTabCallback(th);
        throw null;
    }

    private SafeBag() {
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SafeBag safeBag = (SafeBag) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        safeBag.onNavigationEvent(str, str2);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(SafeBag safeBag, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        safeBag.onExtraCallback(str, str2);
        int i4 = IAuthTabCallbackStubProxy + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        access000 = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0') + 1), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1245052059, (-799242926) + (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) - 7737, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        onExtraCallbackWithResult = new SafeBag();
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (5 - ExpandableListView.getPackedPositionType(0L)), TextUtils.indexOf("", "", 0, 0) - 1245052044, TextUtils.indexOf("", "", 0) - 799242914, (ViewConfiguration.getWindowTouchSlop() >> 8) - 7737, objArr2);
        onWarmupCompleted = new Regex(((String) objArr2[0]).intern());
        Response response = Response.onNavigationEvent;
        onNavigationEvent = ((requestSync) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), requestSync.class)).ICustomTabsService();
        onExtraCallback = 8;
        int i = access100 + 107;
        access000 = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = 336113849463948222L;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $certPath;
        final /* synthetic */ String $keyPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, String str2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$certPath = str;
            this.$keyPath = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$certPath, this.$keyPath, access13800Var);
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            int i3 = $10 + 29;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.resolveSizeAndState(0, 0, 0)), 83 - TextUtils.indexOf((CharSequence) "", '0', 0), 21232 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14185), 18 - MotionEvent.axisFromString(""), 8808 - (KeyEvent.getMaxKeyCode() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new char[]{1623, 1588, 28058, 5425, 21833, 25657, 19851, 59377, 58559, 30356, 16754, 49525, 50144, 37802, 9120, 8798, 44666, 36093, 3304, 8130, 36183, 44586, 59856, 30939, 27600, 52082, 51736, 23125, 22208, 58513, 55115, 46907, 13632, 475, 45448, 36898, 4151, 8991, 37628, 36265, 65335, 23552, 32574, 61178, 56821, 31095, 22640, 51225, 47270, 39614, 15016}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            File parentFile = new File(this.$certPath).getParentFile();
            if (parentFile == null) {
                int i3 = onNavigationEvent + 19;
                onExtraCallback = i3 % 128;
                return i3 % 2 == 0 ? access14000.onNavigationEvent(false) : access14000.onNavigationEvent(false);
            }
            if (!FilesKt.deleteRecursively(parentFile)) {
                int i4 = onExtraCallback + 23;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return access14000.onNavigationEvent(false);
            }
            SafeBag safeBag = SafeBag.onExtraCallbackWithResult;
            SafeBag.onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{safeBag, this.$certPath, this.$keyPath}, -440889358, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 440889362);
            SafeBag.onNavigationEvent(safeBag, this.$certPath, this.$keyPath);
            return access14000.onNavigationEvent(true);
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!getBagAttributes.onExtraCallback.onNavigationEvent() && !(!r1.IAuthTabCallback())) {
            return true;
        }
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return false;
    }

    public final void IAuthTabCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        getBagAttributes getbagattributes = getBagAttributes.onExtraCallback;
        if (!getbagattributes.onNavigationEvent()) {
            int i2 = IAuthTabCallback_Parcel + 3;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            getbagattributes.onExtraCallback(!onWarmupCompleted(context));
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        boolean zOnNavigationEvent = getbagattributes.onNavigationEvent();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) (Color.rgb(0, 0, 0) + 16777333), (-1245051971) + TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-799242877) - TextUtils.lastIndexOf("", '0'), (-7736) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(zOnNavigationEvent);
        Object[] objArr2 = new Object[1];
        b(new int[]{-824384469, 1146225111, 2057553474, -310362653, -470001729, 623202491, 1581378224, -1507850445, 777540947, -1004629953, -1050805271, 1080373730, -755731274, -304457639, 1328702442, -2041413868}, 32 - TextUtils.getOffsetAfter("", 0), objArr2);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr2[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final boolean onWarmupCompleted(Context context) throws Throwable {
        boolean zIsEmpty;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        if (!getBagAttributes.onExtraCallback.onNavigationEvent()) {
            boolean zIsExternalStorageLegacy = Build.VERSION.SDK_INT >= 29 ? Environment.isExternalStorageLegacy() : true;
            if (zIsExternalStorageLegacy) {
                try {
                    try {
                        Object[] objArr = {context};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1286211244);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 28960), 48 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22744 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2112550972, false, (String) null, new Class[]{Context.class});
                        }
                        Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
                        try {
                            Object[] objArr2 = {false};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1359604780);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, 22744 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1615401660, false, "onExtraCallback", new Class[]{Boolean.TYPE});
                            }
                            zIsEmpty = ((List) ((Method) objOnExtraCallback2).invoke(objNewInstance, objArr2)).isEmpty();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a((short) Gravity.getAbsoluteGravity(0, 0), (byte) (52 - TextUtils.indexOf("", "", 0, 0)), (-1245052059) - (Process.myTid() >> 22), AndroidCharacter.getMirror('0') - 31454, (ViewConfiguration.getPressedStateDuration() >> 16) - 7737, objArr3);
                    convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr3[0]).intern(), e);
                }
            } else {
                zIsEmpty = true;
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = new Object[1];
            b(new int[]{92895477, -1489046730, -643833377, 501925763, -1482978139, 1392935574, -241514674, 250977709, 2020775106, -1583195654}, 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(zIsExternalStorageLegacy);
            Object[] objArr5 = new Object[1];
            b(new int[]{-961175210, 587251552, -1663548348, -254746485, 309371807, 572061338, 2058679056, -376181021}, Drawable.resolveOpacity(0, 0) + 16, objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(zIsEmpty);
            Object[] objArr6 = new Object[1];
            a((short) TextUtils.indexOf("", ""), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 57), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1245052023, (-799242894) - (ViewConfiguration.getFadingEdgeLength() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 7737, objArr6);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, ((String) objArr6[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            if (zIsExternalStorageLegacy && !zIsEmpty) {
                int i4 = IAuthTabCallback_Parcel + 11;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    z = true;
                }
            }
            int i5 = IAuthTabCallbackStubProxy + 123;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackStubProxy + 115;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public final boolean onExtraCallbackWithResult(@NotNull RSASSAPSSparams rSASSAPSSparams) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
            ((Boolean) onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{rSASSAPSSparams}, -1398402227, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1398402229)).booleanValue();
            onWarmupCompleted(rSASSAPSSparams);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{rSASSAPSSparams}, -1398402227, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1398402229)).booleanValue();
        boolean zOnWarmupCompleted = onWarmupCompleted(rSASSAPSSparams);
        if (!zBooleanValue || zOnWarmupCompleted) {
            int i3 = IAuthTabCallbackStubProxy + 21;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        } else {
            int i5 = IAuthTabCallback_Parcel + 91;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(rSASSAPSSparams.IAuthTabCallbackStub());
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (72 - Color.alpha(0)), (-1245051954) - Color.red(0), (-799242894) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) - 7737, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        a((short) (Color.rgb(0, 0, 0) + 16777216), (byte) (TextUtils.getCapsMode("", 0, 0) - 120), (-1245051945) - (ViewConfiguration.getEdgeSlop() >> 16), (-799242948) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-7737) - TextUtils.getOffsetBefore("", 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(zBooleanValue);
        Object[] objArr3 = new Object[1];
        b(new int[]{-961175210, 587251552, 2093952980, 1553949852, 1058014075, -1171645738}, 12 - Color.blue(0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(zOnWarmupCompleted);
        Object[] objArr4 = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 87), (-1245051934) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-799242950) - Process.getGidForName(""), (-7737) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(z);
        Object[] objArr5 = new Object[1];
        b(new int[]{-824384469, 1146225111, 2057553474, -310362653, -470001729, 623202491, -1586557170, 784342921, -107377785, -2102390517, 1457937331, -1274529295}, (KeyEvent.getMaxKeyCode() >> 16) + 22, objArr5);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr5[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        return z;
    }

    private final String onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() > 1) {
            if (str.length() == 2) {
                char cFirst = StringsKt.first(str);
                StringBuilder sb = new StringBuilder();
                sb.append(cFirst);
                Object[] objArr = new Object[1];
                b(new int[]{-683489459, -528925250}, 1 - TextUtils.getOffsetBefore("", 0), objArr);
                sb.append(((String) objArr[0]).intern());
                return sb.toString();
            }
            char cFirst2 = StringsKt.first(str);
            Object[] objArr2 = new Object[1];
            b(new int[]{-683489459, -528925250}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            return cFirst2 + StringsKt.repeat(((String) objArr2[0]).intern(), str.length() - 2) + StringsKt.last(str);
        }
        int i4 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @JvmStatic
    private static final boolean onWarmupCompleted(RSASSAPSSparams rSASSAPSSparams) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            if (onNavigationEvent.IAuthTabCallback[rSASSAPSSparams.onExtraCallbackWithResult().ordinal()] != 0) {
                return false;
            }
        } else {
            if (onNavigationEvent.IAuthTabCallback[rSASSAPSSparams.onExtraCallbackWithResult().ordinal()] != 1) {
                return false;
            }
        }
        int i3 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        String strOnPostMessage = PlayerErrorCode.onPostMessage();
        Object[] objArr2 = new Object[1];
        b(new int[]{1761515660, -1419800275}, 1 - TextUtils.getOffsetBefore("", 0), objArr2);
        String strReplace$default = StringsKt.replace$default(strOnPostMessage, ((String) objArr2[0]).intern(), "", false, 4, (Object) null);
        Locale locale = Locale.ROOT;
        String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String strIAuthTabCallbackStub = rSASSAPSSparams.IAuthTabCallbackStub();
        Object[] objArr3 = new Object[1];
        b(new int[]{1761515660, -1419800275}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr3);
        String upperCase2 = StringsKt.replace$default(strIAuthTabCallbackStub, ((String) objArr3[0]).intern(), "", false, 4, (Object) null).toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        Object obj = null;
        if (!StringsKt.contains$default(upperCase2, upperCase, false, 2, (Object) null)) {
            int i2 = IAuthTabCallback_Parcel + 111;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0 ? !StringsKt.contains$default(upperCase, upperCase2, false, 2, (Object) null) : !StringsKt.contains$default(upperCase, upperCase2, false, 5, (Object) null)) {
                int i3 = IAuthTabCallbackStubProxy + 87;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    FaceDetectCallBack.onNavigationEvent(upperCase2);
                    throw null;
                }
                if (!FaceDetectCallBack.onNavigationEvent(upperCase2) && !FaceDetectCallBack.onNavigationEvent(upperCase)) {
                    int i4 = IAuthTabCallbackStubProxy + 67;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    if (!StringsKt.contains$default(upperCase2, FaceDetectCallBack.onExtraCallback(upperCase), false, 2, (Object) null)) {
                        int i6 = IAuthTabCallback_Parcel + 37;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        if (i6 % 2 == 0 ? !StringsKt.contains$default(upperCase, FaceDetectCallBack.onExtraCallback(upperCase2), false, 2, (Object) null) : !StringsKt.contains$default(upperCase, FaceDetectCallBack.onExtraCallback(upperCase2), true, 4, (Object) null)) {
                            int i7 = IAuthTabCallbackStubProxy + 115;
                            IAuthTabCallback_Parcel = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                    }
                }
            }
        }
        int i9 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInterfaceDescriptor;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 119;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> i6), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72, 8848 - Color.argb(0, 0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    i5 = -1469660336;
                    i6 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInterfaceDescriptor;
        if (iArr5 != null) {
            int i11 = $10 + 29;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $10 + 15;
                $11 = i14 % 128;
                if (i14 % i3 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i7] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), 8848 - TextUtils.getOffsetAfter("", i7), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 72 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 8847 - Process.getGidForName(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i13++;
                }
                i3 = 2;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $11 + 17;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $10 + 65;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 22253), 39 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10301 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i17 += 70;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 39, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i17++;
                }
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - TextUtils.getTrimmedLength("")), 79 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 7397 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        String str = new String(cArr2, 0, i);
        int i23 = $11 + 79;
        $10 = i23 % 128;
        int i24 = i23 % 2;
        objArr[0] = str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
            if (IAuthTabCallback() <= 0) {
                return false;
            }
        } else if (IAuthTabCallback() <= 0) {
            return false;
        }
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        return i4 % 2 == 0;
    }

    public final int IAuthTabCallback() {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                objOnNavigationEvent = genSignatureValueWithDigest.onExtraCallbackWithResult.onExtraCallbackWithResult(genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted, true, null, 5, null).onWarmupCompleted(CollectionsKt.emptyList()).onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
            } else {
                objOnNavigationEvent = genSignatureValueWithDigest.onExtraCallbackWithResult.onExtraCallbackWithResult(genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted, false, null, 3, null).onWarmupCompleted(CollectionsKt.emptyList()).onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
            }
            return ((Collection) objOnNavigationEvent).size();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c A[PHI: r1
      0x008c: PHI (r1v15 java.util.List) = (r1v14 java.util.List), (r1v18 java.util.List) binds: [B:10:0x008a, B:7:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String onExtraCallbackWithResult(boolean r12, @org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SafeBag.onExtraCallbackWithResult(boolean, java.security.cert.X509Certificate):java.lang.String");
    }

    public final String onWarmupCompleted(boolean z) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = {this, Boolean.valueOf(z)};
        String str = (String) onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, -707833084, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 707833089);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr2 = new Object[1];
        b(new int[]{1369818060, 2062651217, 1309759964, 908033694}, View.combineMeasuredStates(0, 0) + 6, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStubProxy + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        Object obj;
        File externalStorageDirectory;
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            obj2.hashCode();
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        if (zBooleanValue) {
            int i3 = IAuthTabCallbackStubProxy + 61;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            externalStorageDirectory = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getExternalFilesDir(null);
            Intrinsics.checkNotNull(externalStorageDirectory);
        } else {
            String externalStorageState = Environment.getExternalStorageState();
            Object[] objArr2 = new Object[1];
            b(new int[]{1400925938, -2147023579, -1703390893, -383536190}, 7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            if (Intrinsics.areEqual(externalStorageState, ((String) objArr2[0]).intern())) {
                externalStorageDirectory = Environment.getExternalStorageDirectory();
            } else {
                int i5 = IAuthTabCallback_Parcel + 19;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                externalStorageDirectory = Environment.getRootDirectory();
            }
        }
        obj = Result.constructor-impl(externalStorageDirectory.getAbsolutePath());
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            int i7 = IAuthTabCallbackStubProxy + 15;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str = "";
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b(new int[]{-2047224425, -101542229, 1163512226, -1555143549}, 5 - MotionEvent.axisFromString(""), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str);
        Object[] objArr4 = new Object[1];
        b(new int[]{-824384469, 1146225111, 2057553474, -310362653, -470001729, 623202491, -295880185, -339071220, -1570872905, -1590859648, 207691795, 2000313871}, Color.argb(0, 0, 0, 0) + 23, objArr4);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        return str;
    }

    public final String IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            File[] fileArrListFiles = new File(str).listFiles();
            Intrinsics.checkNotNull(fileArrListFiles);
            int length = fileArrListFiles.length;
            int i2 = IAuthTabCallback_Parcel + 35;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = IAuthTabCallbackStubProxy + 117;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                String name = fileArrListFiles[i4].getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                String upperCase = name.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                Object[] objArr = new Object[1];
                b(new int[]{-1240492863, 1637144955}, 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                if (Intrinsics.areEqual(((String) objArr[0]).intern(), upperCase)) {
                    String name2 = fileArrListFiles[i4].getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    Object[] objArr2 = new Object[1];
                    a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) (90 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1245051979) - TextUtils.getCapsMode("", 0, 0), (-799242946) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) - 7737, objArr2);
                    sb.append(((String) objArr2[0]).intern());
                    sb.append(name2);
                    Object[] objArr3 = new Object[1];
                    a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (90 - (ViewConfiguration.getPressedStateDuration() >> 16)), (-1245051979) - Color.alpha(0), (-799242946) - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 7737, objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    return sb.toString();
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        Object[] objArr4 = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15), ExpandableListView.getPackedPositionType(0L) - 1245051978, TextUtils.getCapsMode("", 0, 0) - 799242946, (-7737) - TextUtils.getTrimmedLength(""), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        return sb2.toString();
    }

    @JvmStatic
    public static final boolean onExtraCallbackWithResult(@NotNull checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(checknavigationbarbysystemproperties, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = onNavigationEvent;
        String strExtraCallbackWithResult = checknavigationbarbysystemproperties.extraCallbackWithResult();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) ((-76) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-1245051999) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) - 799242895, View.resolveSize(0, 0) - 7737, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strExtraCallbackWithResult);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(sb.toString(), "");
        String strExtraCallbackWithResult2 = checknavigationbarbysystemproperties.extraCallbackWithResult();
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(new int[]{-1169836873, 955132781, -1663548348, -254746485, -1659002595, 1237544290, -402229111, 1900231806, -953693289, -1614987018}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(strExtraCallbackWithResult2);
        String strOnExtraCallbackWithResult2 = textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult(sb2.toString(), "");
        if (!new File(strOnExtraCallbackWithResult).exists() || !new File(strOnExtraCallbackWithResult2).exists()) {
            genSignatureValueWithDigest.onExtraCallbackWithResult.onExtraCallbackWithResult(genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted, false, null, 3, null).onNavigationEvent();
            return new File(strOnExtraCallbackWithResult).exists() && !(new File(strOnExtraCallbackWithResult2).exists() ^ true);
        }
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return true;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43424), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 5;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 101;
                        $11 = i10 % 128;
                        int i11 = i10 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cKeyCodeFromString = (char) (12843 - KeyEvent.keyCodeFromString(""));
                            int maximumDrawingCacheSize = 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iRed = 2167 - Color.red(0);
                            byte b2 = (byte) ($$a[i5] + 1);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, maximumDrawingCacheSize, iRed, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 43424), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onTransact ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 86, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i13 = $10 + 77;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $10 + 115;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackStub;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final Object onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(str, str2, null), access13800Var);
        int i2 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return objOnExtraCallback;
    }

    private final void onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, str, str2, "", ""}, -1574669756, iIAuthTabCallback2, iIAuthTabCallback3, 1574669757);
            int i3 = 45 / 0;
        } else {
            int iIAuthTabCallback4 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            int iIAuthTabCallback5 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            int iIAuthTabCallback6 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            onWarmupCompleted(iIAuthTabCallback4, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, str, str2, "", ""}, -1574669756, iIAuthTabCallback5, iIAuthTabCallback6, 1574669757);
        }
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private final void onExtraCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(str, str2, "", "");
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Collection collectionOnWarmupCompleted = onNavigationEvent.onWarmupCompleted();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : collectionOnWarmupCompleted) {
            Object[] objArr2 = new Object[1];
            a((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-77) - ImageFormat.getBitsPerPixel(0)), (-1245051999) - KeyEvent.normalizeMetaState(0), (-799242895) - KeyEvent.keyCodeFromString(""), (-7737) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            if (StringsKt.startsWith$default((String) obj, ((String) objArr2[0]).intern(), false, 2, (Object) null)) {
                int i2 = IAuthTabCallback_Parcel + 35;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(obj);
                    int i3 = 15 / 0;
                } else {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            for (Object obj2 : collectionOnWarmupCompleted) {
                Object[] objArr3 = new Object[1];
                b(new int[]{-1169836873, 955132781, -1663548348, -254746485, -1385193945, 1019237447}, 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                if (StringsKt.startsWith$default((String) obj2, ((String) objArr3[0]).intern(), false, 2, (Object) null)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (String str5 : arrayList) {
            arrayList2.add(getWrite.IAuthTabCallback(str5, onNavigationEvent.onExtraCallbackWithResult(str5, "")));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i4 = IAuthTabCallbackStubProxy + 119;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual((String) ((Pair) it.next()).IAuthTabCallback(), str);
                throw null;
            }
            Object next = it.next();
            if (Intrinsics.areEqual((String) ((Pair) next).IAuthTabCallback(), str)) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            int i5 = IAuthTabCallback_Parcel + 115;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            onNavigationEvent.onNavigationEvent((String) ((Pair) it2.next()).onExtraCallbackWithResult(), str3);
        }
        ArrayList<String> arrayList4 = new ArrayList();
        Iterator it3 = collectionOnWarmupCompleted.iterator();
        while (!(!it3.hasNext())) {
            int i7 = IAuthTabCallback_Parcel + 91;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            Object next2 = it3.next();
            Object[] objArr4 = new Object[1];
            b(new int[]{-1169836873, 955132781, -1663548348, -254746485, -1659002595, 1237544290, -402229111, 1900231806, -953693289, -1614987018}, 18 - Gravity.getAbsoluteGravity(0, 0), objArr4);
            if (StringsKt.startsWith$default((String) next2, ((String) objArr4[0]).intern(), false, 2, (Object) null)) {
                arrayList4.add(next2);
                int i9 = IAuthTabCallbackStubProxy + 61;
                IAuthTabCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = new ArrayList();
            for (Object obj3 : collectionOnWarmupCompleted) {
                Object[] objArr5 = new Object[1];
                b(new int[]{-1169836873, 955132781, -1663548348, -254746485, -1659002595, 1237544290, 207691795, 2000313871}, TextUtils.indexOf("", "", 0) + 15, objArr5);
                if (StringsKt.startsWith$default((String) obj3, ((String) objArr5[0]).intern(), false, 2, (Object) null)) {
                    arrayList4.add(obj3);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (String str6 : arrayList4) {
            arrayList5.add(getWrite.IAuthTabCallback(str6, onNavigationEvent.onExtraCallbackWithResult(str6, "")));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (Intrinsics.areEqual((String) ((Pair) obj4).IAuthTabCallback(), str2)) {
                arrayList6.add(obj4);
            }
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            onNavigationEvent.onNavigationEvent((String) ((Pair) it4.next()).onExtraCallbackWithResult(), str4);
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Gson gsonOnExtraCallback = ALCEyeBlink.onExtraCallback();
        Collection collectionOnWarmupCompleted = addPolicy.IEngagementSignalsCallback_Parcel().onWarmupCompleted();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : collectionOnWarmupCompleted) {
            Object[] objArr = new Object[1];
            a((short) (Process.myTid() >> 22), (byte) (View.MeasureSpec.getMode(0) - 38), (-1245051924) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) - 799242894, (-7738) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
            if (StringsKt.startsWith$default((String) obj, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                arrayList.add(obj);
                int i2 = IAuthTabCallback_Parcel + 103;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (String str5 : arrayList) {
            int i4 = IAuthTabCallback_Parcel + 41;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            arrayList2.add(getWrite.IAuthTabCallback(str5, (CompressedData) gsonOnExtraCallback.fromJson(addPolicy.IEngagementSignalsCallback_Parcel().onExtraCallbackWithResult(str5, ""), CompressedData.class)));
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i6 = IAuthTabCallback_Parcel + 33;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.areEqual(((CompressedData) ((Pair) it.next()).IAuthTabCallback()).IAuthTabCallback(), str);
                throw null;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CompressedData) ((Pair) next).IAuthTabCallback()).IAuthTabCallback(), str) && !(!Intrinsics.areEqual(r12.onNavigationEvent(), str2))) {
                arrayList3.add(next);
            }
        }
        for (Pair pair : arrayList3) {
            String str6 = (String) pair.onExtraCallbackWithResult();
            CompressedData compressedData = (CompressedData) pair.IAuthTabCallback();
            compressedData.onWarmupCompleted(str3);
            compressedData.onNavigationEvent(str4);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallback_Parcel = addPolicy.IEngagementSignalsCallback_Parcel();
            String json = gsonOnExtraCallback.toJson(compressedData);
            Intrinsics.checkNotNullExpressionValue(json, "");
            textRoundCornerProgressBarSavedState1IEngagementSignalsCallback_Parcel.onNavigationEvent(str6, json);
        }
    }

    public final writeRaw<Pair<Boolean, String>> onExtraCallbackWithResult(@NotNull Context context, @NotNull CertSignInfo certSignInfo) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(certSignInfo, "");
        try {
            Object[] objArr = {context};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1286211244);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - KeyEvent.getDeadChar(0, 0)), 48 - (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 22744, 2112550972, false, (String) null, new Class[]{Context.class});
            }
            writeRaw<Pair<Boolean, String>> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new CertificateUtil$.ExternalSyntheticLambda6(((Constructor) objOnExtraCallback).newInstance(objArr), certSignInfo));
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            int i2 = IAuthTabCallback_Parcel + 89;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                return writerawOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Pair onNavigationEvent$7584564d(Object obj, CertSignInfo certSignInfo) throws Throwable {
        int i = 2 % 2;
        String strOnNavigationEvent = certSignInfo.onNavigationEvent();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 31, 24887 - (ViewConfiguration.getTapTimeout() >> 16), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr = {certSignInfo.IAuthTabCallback()};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1484186951);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - TextUtils.getOffsetAfter("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 24887, 1765153751, false, "onNavigationEvent", new Class[]{String.class});
            }
            Object[] objArr2 = {strOnNavigationEvent, ((Method) objOnExtraCallback2).invoke(obj2, objArr)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1756113018);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-16777168) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "") + 22744, 1508693738, false, "onWarmupCompleted", new Class[]{String.class, String.class});
            }
            Pair pair = new Pair(Boolean.valueOf(((Boolean) ((Method) objOnExtraCallback3).invoke(obj, objArr2)).booleanValue()), "");
            int i2 = IAuthTabCallbackStubProxy + 33;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return pair;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final String onWarmupCompleted(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(matchResult, "");
        String str = (String) matchResult.getGroupValues().get(matchResult.IAuthTabCallback().size() - 1);
        int i4 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> onNavigationEvent(@NotNull List<RSASSAPSSparams> list) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<RSASSAPSSparams> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 67;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                ((RSASSAPSSparams) it.next()).IAuthTabCallbackStub();
                throw null;
            }
            RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) it.next();
            Regex regex = onWarmupCompleted;
            String strIAuthTabCallbackStub = rSASSAPSSparams.IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub == null) {
                int i3 = IAuthTabCallbackStubProxy + 97;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                strIAuthTabCallbackStub = "";
            }
            Sequence sequenceAsBinder = clearRevision.asBinder(Regex.onExtraCallbackWithResult(regex, strIAuthTabCallbackStub, 0, 2, (Object) null), new Function1() { // from class: viva.republica.toss.certificate.CertificateUtil$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
                    return (String) SafeBag.onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{(MatchResult) obj}, 1536413765, iIAuthTabCallback2, iIAuthTabCallback3, -1536413765);
                }
            });
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (byte) ((-111) - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0') - 1245051979, (-799242935) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") - 7737, objArr);
            arrayList.add(clearRevision.IAuthTabCallback(sequenceAsBinder, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        return arrayList;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Unit) onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{th}, -1013823701, iIAuthTabCallback2, iIAuthTabCallback3, 1013823704);
    }

    public static /* synthetic */ Pair IAuthTabCallback$7584564d(Object obj, CertSignInfo certSignInfo) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Pair) onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{obj, certSignInfo}, -1851274014, iIAuthTabCallback2, iIAuthTabCallback3, 1851274020);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(MatchResult matchResult) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (String) onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{matchResult}, 1536413765, iIAuthTabCallback2, iIAuthTabCallback3, -1536413765);
    }

    public static final /* synthetic */ void onExtraCallback(SafeBag safeBag, String str, String str2) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{safeBag, str, str2}, -440889358, iIAuthTabCallback2, iIAuthTabCallback3, 440889362);
    }

    @JvmStatic
    public static final boolean onExtraCallback(@NotNull RSASSAPSSparams rSASSAPSSparams) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{rSASSAPSSparams}, -1398402227, iIAuthTabCallback2, iIAuthTabCallback3, 1398402229)).booleanValue();
    }

    public final String IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return (String) onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, -707833084, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 707833089);
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this, str, str2, str3, str4}, -1574669756, iIAuthTabCallback2, iIAuthTabCallback3, 1574669757);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = -294509421;
        onTransact = -1538800080;
        asInterface = -1947950343;
        IAuthTabCallbackStub = new short[]{14815, -10177, 10185, -10205, 10188, 10189, -10193, 10178, 10182, -10177, 10177, 10185, -10178, -10191, -10210, 14806, 10227, 10179, -10179, 10179, -10197, -10239, 10224, 10203, -10208, 10209, 10186, -10176, 10177, -3917, 3963, -29664, 29608, -10178, 10214, 10213, -10229, 14807, 10185, -10184, -10182, -10192, -10195, 10237, -10179, 10189, -10190, 10181, -10179, 10184, 10179, -10207, 10188, 10184, -10191, 10191, 10183, -10192, -10177, -10192, 14815, 10175, 10133, -10142, -10168, 10159, 10157, -10144, 10174, 10161, 10142, -10140, -10175, 10161, -10173, 14788, 10186, 10190, -10191, 14785, 14785, 14790, 10149, -10219, 10218, -10234, -10178, 14802, 10139, 10152, 10115, -10117, 10130, -10114, 10118, -10148, 10130, 10114, 10120, -10116, -10127, -10131, 10131, 10127, 10115, 14809, 10136, 10168, -10164, -10157, 10138, -10174, -10163, -10174, 14811, -10167, 10114, 10125, 10146, -10166, 10156, -10150, 10122, 10185, -10124, 14810, 10121, 10155, 10157, -10149, -10149, 10163, -10150, -10215, 10148, 14810, -10183, 10192, 10207, 10192, 10198, -10199, -10208, 10179, -10196};
        getInterfaceDescriptor = new int[]{-1816968500, -1043731086, 2010458137, -1693538916, 948475916, -992555355, 2117720603, 1818928660, -103828174, -1431416808, -1885748640, 295315484, 368470923, -1575154012, -1422465640, 879769111, -386573148, 849568821};
    }
}
