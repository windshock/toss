package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getBillingPeriod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getClipboard {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static final Set<Character> onExtraCallbackWithResult;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ JsonObject onExtraCallback(setFillAlpha setfillalpha, Context context, Boolean bool, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 91;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            bool = null;
        }
        JsonObject jsonObjectOnExtraCallback = onExtraCallback(setfillalpha, context, bool);
        int i4 = onWarmupCompleted + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return jsonObjectOnExtraCallback;
    }

    public static final JsonObject onExtraCallback(@NotNull setFillAlpha setfillalpha, @NotNull Context context, @Nullable Boolean bool) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setfillalpha, "");
        Intrinsics.checkNotNullParameter(context, "");
        getBillingPeriod.onNavigationEvent onnavigationevent = getBillingPeriod.Companion;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (onnavigationevent.IAuthTabCallback(applicationContext).onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("consentStatus", setfillalpha.onExtraCallback());
            jsonObject.addProperty("personalizationConsentStatus", onNavigationEvent(setfillalpha, context).name());
            jsonObject.addProperty("privacyOptionsRequirementStatus", setfillalpha.IAuthTabCallback());
            jsonObject.addProperty("canRequestAds", Boolean.valueOf(setfillalpha.onNavigationEvent()));
            jsonObject.addProperty("adMobEnablementStatus", setfillalpha.onExtraCallbackWithResult().name());
            if (bool != null) {
                int i2 = onWarmupCompleted + 57;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                jsonObject.addProperty("formShown", bool);
            }
            return jsonObject;
        }
        JsonObject jsonObject2 = new JsonObject();
        Object[] objArr = new Object[1];
        a(new char[]{33016, 8546, 32950, 41885, 19398, 7334, 30239, 23608, 11014, 14256, 8782, 61598, 55273, 58227, 36598, 34043}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
        jsonObject2.addProperty("consentStatus", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new char[]{33016, 8546, 32950, 41885, 19398, 7334, 30239, 23608, 11014, 14256, 8782, 61598, 55273, 58227, 36598, 34043}, (-16777215) - Color.rgb(0, 0, 0), objArr2);
        jsonObject2.addProperty("personalizationConsentStatus", ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{33016, 8546, 32950, 41885, 19398, 7334, 30239, 23608, 11014, 14256, 8782, 61598, 55273, 58227, 36598, 34043}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr3);
        jsonObject2.addProperty("privacyOptionsRequirementStatus", ((String) objArr3[0]).intern());
        jsonObject2.addProperty("canRequestAds", Boolean.TRUE);
        Object[] objArr4 = new Object[1];
        a(new char[]{33016, 8546, 32950, 41885, 19398, 7334, 30239, 23608, 11014, 14256, 8782, 61598, 55273, 58227, 36598, 34043}, 1 - Drawable.resolveOpacity(0, 0), objArr4);
        jsonObject2.addProperty("adMobEnablementStatus", ((String) objArr4[0]).intern());
        jsonObject2.addProperty("formShown", Boolean.FALSE);
        int i4 = onTransact + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return jsonObject2;
    }

    public static final getDisplayName onNavigationEvent(@NotNull setFillAlpha setfillalpha, @NotNull Context context) throws Throwable {
        Character orNull;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setfillalpha, "");
        Intrinsics.checkNotNullParameter(context, "");
        getBillingPeriod.onNavigationEvent onnavigationevent = getBillingPeriod.Companion;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (onnavigationevent.IAuthTabCallback(applicationContext).onExtraCallbackWithResult() != getPricingPhaseList.EU) {
            return getDisplayName.NOT_REQUIRED;
        }
        String strOnExtraCallback = setfillalpha.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{33016, 8546, 32950, 41885, 19398, 7334, 30239, 23608, 11014, 14256, 8782, 61598, 55273, 58227, 36598, 34043}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        if (Intrinsics.areEqual(strOnExtraCallback, ((String) objArr[0]).intern())) {
            return getDisplayName.NOT_REQUIRED;
        }
        if (!Intrinsics.areEqual(setfillalpha.onExtraCallback(), "OBTAINED")) {
            return getDisplayName.UNKNOWN;
        }
        Context applicationContext2 = context.getApplicationContext();
        String string = applicationContext2.getSharedPreferences(applicationContext2.getPackageName() + "_preferences", 0).getString("IABTCF_PurposeConsents", null);
        if (string != null) {
            int i4 = onWarmupCompleted + 93;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            orNull = StringsKt.getOrNull(string, 2);
        } else {
            orNull = null;
        }
        Character orNull2 = string != null ? StringsKt.getOrNull(string, 3) : null;
        if (orNull != null) {
            int i6 = onTransact + 93;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0 ? orNull.charValue() == '1' : orNull.charValue() == 23) {
                if (orNull2 != null && orNull2.charValue() == '1') {
                    return getDisplayName.GRANTED;
                }
            }
        }
        Set<Character> set = onExtraCallbackWithResult;
        return (!(CollectionsKt.contains(set, orNull) ^ true) && CollectionsKt.contains(set, orNull2)) ? getDisplayName.NOT_GRANTED : getDisplayName.UNKNOWN;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 84, ExpandableListView.getPackedPositionType(0L) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.combineMeasuredStates(0, 0)), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 8808 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 29;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
        onNavigationEvent();
        onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(new Character[]{'0', '1'});
        int i = onExtraCallback + 39;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = -1853406681455586841L;
    }
}
