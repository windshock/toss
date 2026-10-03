package o;

import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getCrls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPredefinedBiometricType implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static long onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{33238, 33208, 59627, 18610, 59565, 16727, 43183, 41366, 363}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{48302, 48331, 30961, 55465, 6749, 51732, 23122, 10948, 15375, 63959, 39778, 19419, 48506, 31005, 6172, 51416}, ExpandableListView.getPackedPositionChild(0L) + 1, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{56048, 55957, 2733, 43765, 3795, 51956, 20188, 10788, 23121, 35723, 36844, 19259, 56100, 2904, 3237, 51215}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        onNavigationEvent = ((String) objArr3[0]).intern();
        Companion = new onWarmupCompleted(null);
        int i = onWarmupCompleted + 87;
        asInterface = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asBinder + 5;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 40 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackDefault + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 85;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{56048, 55957, 2733, 43765, 3795, 51956, 20188, 10788, 23121, 35723, 36844, 19259, 56100, 2904, 3237, 51215}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(new char[]{33238, 33208, 59627, 18610, 59565, 16727, 43183, 41366, 363}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr2);
        getCrls.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = SignedDataParser.IAuthTabCallback.onExtraCallback(strOnNavigationEvent, settext.onNavigationEvent(((String) objArr2[0]).intern(), ""));
        if (onextracallbackwithresultOnExtraCallback instanceof getCrls.onExtraCallbackWithResult) {
            int i2 = IAuthTabCallbackDefault + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            getCrls.onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultOnExtraCallback;
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult(), (Map) null, 4, (Object) null);
            return;
        }
        if (!(onextracallbackwithresultOnExtraCallback instanceof getCrls.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonObject jsonObject2 = new JsonObject();
        Object[] objArr3 = new Object[1];
        a(new char[]{48302, 48331, 30961, 55465, 6749, 51732, 23122, 10948, 15375, 63959, 39778, 19419, 48506, 31005, 6172, 51416}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr3);
        jsonObject2.addProperty(((String) objArr3[0]).intern(), ((getCrls.onNavigationEvent) onextracallbackwithresultOnExtraCallback).IAuthTabCallback());
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject2);
        int i4 = asBinder + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 119;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45811), MotionEvent.axisFromString("") + 85, 21233 - TextUtils.getTrimmedLength(""), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    static void onWarmupCompleted() {
        onExtraCallback = -2662485484864611526L;
    }
}
