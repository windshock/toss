package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.crosscert.android.core.Cert;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.JsonWriterWriteObject;
import o.getTrailerField;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTrailerField {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallback = 1;
    private static int asInterface = 1;
    public static final int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final Context onExtraCallback;

    static {
        onExtraCallback();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        int i = asInterface + 51;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void onNavigationEvent$112f0403(Object obj, JsonWriterWriteObject jsonWriterWriteObject) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted$112f0403(obj, jsonWriterWriteObject);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = onWarmupCompleted + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 17;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 89;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - MotionEvent.axisFromString("")), 84 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14184), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 8808 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    public getTrailerField(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = context;
    }

    public final writeRaw<List<RSASSAPSSparams>> IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = {this.onExtraCallback};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1286211244);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (28960 - KeyEvent.getDeadChar(0, 0)), 49 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 22745 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2112550972, false, (String) null, new Class[]{Context.class});
            }
            final Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(objArr);
            writeRaw<List<RSASSAPSSparams>> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new NetConverter() { // from class: viva.republica.toss.certificate.CertificateWrapper$$ExternalSyntheticLambda0
                public final void subscribe(JsonWriterWriteObject jsonWriterWriteObject) throws Throwable {
                    getTrailerField.onNavigationEvent$112f0403(objNewInstance, jsonWriterWriteObject);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            return writerawOnNavigationEvent;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final void onWarmupCompleted$112f0403(Object obj, JsonWriterWriteObject jsonWriterWriteObject) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonWriterWriteObject, "");
        try {
            Object[] objArr = {obj, false, 1, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-566256406);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 28960), (ViewConfiguration.getTapTimeout() >> 16) + 48, (-16754472) - Color.rgb(0, 0, 0), -276864390, false, "onExtraCallbackWithResult", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28960), 48 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22744), Boolean.TYPE, Integer.TYPE, Object.class});
            }
            Iterable iterable = (Iterable) ((Method) objOnExtraCallback).invoke(null, objArr);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                RSASSAPSSparams rSASSAPSSparamsOnExtraCallbackWithResult = getBagId.onExtraCallbackWithResult((Cert) it.next());
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(new char[]{9308, 9278, 6543, 3451, 25834, 19891, 37343, 44037, 30283, 32515, 8166, 15458, 32974, 41106}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(rSASSAPSSparamsOnExtraCallbackWithResult);
                Object[] objArr3 = new Object[1];
                a(new char[]{16290, 16321, 57592, 62472, 44738, 34714, 52513, 61674, 28063, 34423, 54741, 24730, 39787, 22961, 25461, 4818, 51506, 60166, 36485, 50229}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
                arrayList.add(rSASSAPSSparamsOnExtraCallbackWithResult);
            }
            jsonWriterWriteObject.onNavigationEvent(arrayList);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final String onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                setTextProgressMargin settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onWarmupCompleted().onNavigationEvent();
                MessageDigest messageDigest = (MessageDigest) settextprogressmarginOnNavigationEvent.onWarmupCompleted();
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                String strOnWarmupCompleted = IsEnabled.onExtraCallback().onWarmupCompleted(messageDigest.digest(bytes));
                settextprogressmarginOnNavigationEvent.close();
                Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
                return strOnWarmupCompleted;
            } catch (java.security.NoSuchAlgorithmException e) {
                auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, e, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                return "";
            }
        }
    }

    static void onExtraCallback() {
        onNavigationEvent = -5138949652112642151L;
    }
}
