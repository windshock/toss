package o;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getPageUrl {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ void onExtraCallback(Activity activity, SessionTrackerb sessionTrackerb, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(activity, sessionTrackerb, str);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
    }

    private static final void onNavigationEvent(Activity activity, SessionTrackerb sessionTrackerb, String str) {
        Object obj;
        Map mapOnNavigationEvent;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Uri uri = Uri.parse(str);
            Uri data = activity.getIntent().getData();
            if (data != null) {
                mapOnNavigationEvent = zzcr.onExtraCallbackWithResult(data);
                int i2 = onWarmupCompleted + 61;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 5;
                }
            } else {
                int i4 = onWarmupCompleted + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                mapOnNavigationEvent = null;
            }
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
            Pair[] pairArr = (Pair[]) access8100.onExtraCallback(access8100.onWarmupCompleted(mapOnNavigationEvent, zzcr.onExtraCallbackWithResult(uri))).toArray(new Pair[0]);
            obj = Result.constructor-impl(filterCreatePageParams.onNavigationEvent(uri, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onNavigationEvent(obj) && !SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, (String) obj, false, (Function1) null, (Bundle) null, false, 60, (Object) null)) {
            int i6 = onNavigationEvent + 33;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, str, true, (Function1) null, (Bundle) null, false, 77, (Object) null);
            } else {
                SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            }
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            SessionTrackerb.IAuthTabCallback(sessionTrackerb, activity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            int i7 = onNavigationEvent + 71;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        activity.finish();
    }
}
