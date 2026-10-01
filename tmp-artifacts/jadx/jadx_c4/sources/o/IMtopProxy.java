package o;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
import im.toss.facepay.validation.model.init.config.QualityModelConfig;
import im.toss.facepay.validation.model.init.config.quality.DetectionConfig;
import im.toss.facepay.validation.model.init.config.quality.GeometricConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getBuildFingerprint;
import o.isTiny;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IMtopProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static long onWarmupCompleted = 7822987796728402119L;
    private String IAuthTabCallback;
    private List<Double> onExtraCallback;
    private final isTiny onExtraCallbackWithResult;
    private final markSpmBehavor onNavigationEvent;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = IMtopProxy.this.onWarmupCompleted((Mat) null, (QualityModelConfig) null, (access13800<? super uploadPerfLog>) this);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    public IMtopProxy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = new isTiny(context);
        this.onNavigationEvent = new markSpmBehavor();
        this.IAuthTabCallback = "";
        Double dValueOf = Double.valueOf(0.0d);
        this.onExtraCallback = CollectionsKt.listOf(new Double[]{dValueOf, dValueOf, dValueOf, dValueOf});
    }

    public final Object onExtraCallbackWithResult(@NotNull InterpreterConfig interpreterConfig, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            InterpreterConfig.ModelConfig modelConfigIAuthTabCallback = interpreterConfig.IAuthTabCallback();
            this.onExtraCallbackWithResult.onWarmupCompleted(modelConfigIAuthTabCallback.IAuthTabCallback(), modelConfigIAuthTabCallback.onWarmupCompleted(), access13800Var);
            access14300.onWarmupCompleted();
            throw null;
        }
        InterpreterConfig.ModelConfig modelConfigIAuthTabCallback2 = interpreterConfig.IAuthTabCallback();
        Object objOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(modelConfigIAuthTabCallback2.IAuthTabCallback(), modelConfigIAuthTabCallback2.onWarmupCompleted(), access13800Var);
        if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
            return objOnWarmupCompleted;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 121;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0) + 60, 6383 - TextUtils.indexOf("", "", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 55;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58, 6383 - KeyEvent.getDeadChar(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $11 + 123;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public static final class onNavigationEvent<T> implements Comparator {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((Number) t2).intValue()), Integer.valueOf(((Number) t).intValue()));
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            int i5 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return iIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull Mat mat, @NotNull QualityModelConfig qualityModelConfig, @NotNull access13800<? super uploadPerfLog> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        GeometricConfig geometricConfigOnWarmupCompleted;
        long jOnExtraCallback;
        Object objIAuthTabCallback;
        IMtopProxy iMtopProxy;
        Integer numOnNavigationEvent;
        Mat mat2 = mat;
        int i = 2 % 2;
        if (Class.forName("o.IMtopProxy$onExtraCallback").isInstance(access13800Var)) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i2 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
                int i3 = IAuthTabCallbackDefault + 77;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            geometricConfigOnWarmupCompleted = qualityModelConfig.onWarmupCompleted();
            jOnExtraCallback = getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback();
            isTiny istiny = this.onExtraCallbackWithResult;
            DetectionConfig detectionConfigOnExtraCallbackWithResult = qualityModelConfig.onExtraCallbackWithResult();
            onextracallback.L$0 = this;
            onextracallback.L$1 = mat2;
            onextracallback.L$2 = geometricConfigOnWarmupCompleted;
            onextracallback.J$0 = jOnExtraCallback;
            onextracallback.label = 1;
            objIAuthTabCallback = istiny.IAuthTabCallback(mat2, detectionConfigOnExtraCallbackWithResult, (access13800<? super AppTypeEnum<isTiny.onExtraCallback>>) onextracallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i6 = IAuthTabCallbackDefault + 109;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
            iMtopProxy = this;
        } else {
            if (i5 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{54675, 49286, 65458, 60121, 33164, 48375, 43797, 18033, 32111, 26701, 1907, 12926, 10385, 51126, 62167, 59790, 33952, 45845, 44555, 17699, 28755, 28513, 6767, 12481, 12287, 55974, 61896, 60651, 39707, 46592, 44327, 22558, 30512, 25200, 6295, 14241, 8868, 55683, 62713, 58142, 40474, 46384, 41027, 24409, 19053, 24725, 8119}, 5399 - (Process.myTid() >> 22), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            long j = onextracallback.J$0;
            GeometricConfig geometricConfig = (GeometricConfig) onextracallback.L$2;
            Mat mat3 = (Mat) onextracallback.L$1;
            IMtopProxy iMtopProxy2 = (IMtopProxy) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj);
            geometricConfigOnWarmupCompleted = geometricConfig;
            mat2 = mat3;
            jOnExtraCallback = j;
            iMtopProxy = iMtopProxy2;
            objIAuthTabCallback = obj;
        }
        getCausesCount getcausescount = new getCausesCount(objIAuthTabCallback, getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(jOnExtraCallback), (DefaultConstructorMarker) null);
        AppTypeEnum appTypeEnum = (AppTypeEnum) getcausescount.IAuthTabCallback();
        long jOnNavigationEvent = getcausescount.onNavigationEvent();
        getCausesCount getcausescount2 = new getCausesCount(((isTiny.onExtraCallback) appTypeEnum.onWarmupCompleted()).onExtraCallback(), getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback()), (DefaultConstructorMarker) null);
        List<isTiny.onWarmupCompleted> list = (List) getcausescount2.IAuthTabCallback();
        long jOnNavigationEvent2 = getcausescount2.onNavigationEvent();
        if (!appTypeEnum.onExtraCallbackWithResult()) {
            return new uploadPerfLog(RVPub.NO_FACE_IN_IMAGE, null, jOnNavigationEvent, null, list, jOnNavigationEvent2, null);
        }
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = asInterface + 109;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                arrayList.add(access14000.onNavigationEvent(list.get(i8).onWarmupCompleted().asBinder()));
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList, new onNavigationEvent());
            if (((Number) listSortedWith.get(0)).intValue() <= ((Number) listSortedWith.get(1)).intValue() * geometricConfigOnWarmupCompleted.onExtraCallback()) {
                return new uploadPerfLog(RVPub.NEAR_SAME_SIZE_FACES, null, jOnNavigationEvent, null, list, jOnNavigationEvent2, null);
            }
        }
        isTiny.onWarmupCompleted onWarmupCompleted2 = iMtopProxy.onWarmupCompleted(mat2.width(), mat2.height(), list);
        if (onWarmupCompleted2 == null) {
            return new uploadPerfLog(RVPub.NO_MAIN_FACE_IN_IMAGE, null, jOnNavigationEvent, null, list, jOnNavigationEvent2, null);
        }
        int iAsBinder = onWarmupCompleted2.onWarmupCompleted().asBinder();
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            numOnNavigationEvent = access14000.onNavigationEvent(((isTiny.onWarmupCompleted) it.next()).onWarmupCompleted().asBinder());
            while (it.hasNext()) {
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent(((isTiny.onWarmupCompleted) it.next()).onWarmupCompleted().asBinder());
                if (numOnNavigationEvent.compareTo(numOnNavigationEvent2) < 0) {
                    numOnNavigationEvent = numOnNavigationEvent2;
                }
            }
        } else {
            numOnNavigationEvent = null;
        }
        if (iAsBinder >= (numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : 0)) {
            isH5 ish5 = isH5.IAuthTabCallback;
            double width = iAsBinder / (ish5.onWarmupCompleted().getWidth() * ish5.onWarmupCompleted().getHeight());
            return ((double) onWarmupCompleted2.onWarmupCompleted().asInterface()) < geometricConfigOnWarmupCompleted.onWarmupCompleted() ? new uploadPerfLog(RVPub.FACE_TOO_SMALL, onWarmupCompleted2, jOnNavigationEvent, access14000.onNavigationEvent(width), list, jOnNavigationEvent2, null) : ((double) onWarmupCompleted2.onWarmupCompleted().asInterface()) > geometricConfigOnWarmupCompleted.onExtraCallbackWithResult() ? new uploadPerfLog(RVPub.FACE_TOO_BIG, onWarmupCompleted2, jOnNavigationEvent, access14000.onNavigationEvent(width), list, jOnNavigationEvent2, null) : !iMtopProxy.onWarmupCompleted(onWarmupCompleted2.onWarmupCompleted(), mat2, geometricConfigOnWarmupCompleted.IAuthTabCallback()) ? new uploadPerfLog(RVPub.FACE_FAR_FROM_CENTER, onWarmupCompleted2, jOnNavigationEvent, access14000.onNavigationEvent(width), list, jOnNavigationEvent2, null) : !iMtopProxy.onNavigationEvent.onExtraCallbackWithResult(onWarmupCompleted2.IAuthTabCallback()).onWarmupCompleted().booleanValue() ? new uploadPerfLog(RVPub.FACE_EULER_ANGLE_FAIL, onWarmupCompleted2, jOnNavigationEvent, access14000.onNavigationEvent(width), list, jOnNavigationEvent2, null) : new uploadPerfLog(null, onWarmupCompleted2, jOnNavigationEvent, access14000.onNavigationEvent(width), list, jOnNavigationEvent2, null);
        }
        uploadPerfLog uploadperflog = new uploadPerfLog(RVPub.FACE_TOO_SMALL, onWarmupCompleted2, jOnNavigationEvent, null, list, jOnNavigationEvent2, null);
        int i11 = asInterface + 77;
        IAuthTabCallbackDefault = i11 % 128;
        if (i11 % 2 == 0) {
            return uploadperflog;
        }
        throw null;
    }

    private final isTiny.onWarmupCompleted onWarmupCompleted(int i, int i2, List<isTiny.onWarmupCompleted> list) {
        int i3 = 2 % 2;
        int i4 = i / 2;
        int i5 = i2 / 2;
        isTiny.onWarmupCompleted onwarmupcompleted = null;
        Double d = null;
        for (isTiny.onWarmupCompleted onwarmupcompleted2 : list) {
            int i6 = IAuthTabCallbackDefault + 79;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            StartAction startActionOnWarmupCompleted = onwarmupcompleted2.onWarmupCompleted();
            isTiny.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
            double dSqrt = Math.sqrt(Math.pow(i4 - startActionOnWarmupCompleted.onExtraCallbackWithResult(), 2.0d) + Math.pow(i5 - startActionOnWarmupCompleted.onWarmupCompleted(), 2.0d));
            if (d != null) {
                int i8 = asInterface + 17;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    d.doubleValue();
                    throw null;
                }
                if (dSqrt >= d.doubleValue()) {
                    onwarmupcompleted = onwarmupcompleted3;
                }
            }
            Double dValueOf = Double.valueOf(dSqrt);
            int i9 = IAuthTabCallbackDefault + 85;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            d = dValueOf;
            onwarmupcompleted = onwarmupcompleted2;
        }
        return onwarmupcompleted;
    }

    private final boolean onWarmupCompleted(StartAction startAction, Mat mat, String str) throws Throwable {
        int i = 2 % 2;
        if (str == null || str.length() == 0) {
            return true;
        }
        List<Double> listOnWarmupCompleted = onWarmupCompleted(str);
        double dDoubleValue = listOnWarmupCompleted.get(0).doubleValue();
        double dDoubleValue2 = listOnWarmupCompleted.get(1).doubleValue();
        double dDoubleValue3 = listOnWarmupCompleted.get(2).doubleValue();
        double dDoubleValue4 = listOnWarmupCompleted.get(3).doubleValue();
        double dWidth = mat.width();
        double dHeight = mat.height();
        int iOnExtraCallback = startAction.onExtraCallback();
        int iAsInterface = startAction.asInterface();
        int iOnNavigationEvent = startAction.onNavigationEvent();
        int iIAuthTabCallback = startAction.IAuthTabCallback();
        if (startAction.onExtraCallback() >= dDoubleValue * dWidth) {
            int i2 = asInterface + 81;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0 ? startAction.onNavigationEvent() >= dDoubleValue2 * dHeight : startAction.onNavigationEvent() >= dDoubleValue2 % dHeight) {
                if (iOnExtraCallback + iAsInterface <= dWidth - (dDoubleValue3 * dWidth) && iOnNavigationEvent + iIAuthTabCallback <= dHeight - (dDoubleValue4 * dHeight)) {
                    int i3 = asInterface + 85;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Double> onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(str, this.IAuthTabCallback)) {
            int i4 = IAuthTabCallbackDefault + 7;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (this.onExtraCallback.isEmpty()) {
                this.IAuthTabCallback = str;
                Object[] objArr = new Object[1];
                a(new char[]{54748}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2850, objArr);
                List listSplit$default = StringsKt.split$default(str, new String[]{((String) objArr[0]).intern()}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((String) it.next()).toString());
                    arrayList.add(Double.valueOf(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d));
                }
                this.onExtraCallback = arrayList;
                int i6 = asInterface + 69;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 4;
                }
            }
        }
        return this.onExtraCallback;
    }
}
