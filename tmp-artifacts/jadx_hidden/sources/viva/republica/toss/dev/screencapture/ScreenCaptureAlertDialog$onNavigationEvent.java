package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface ScreenCaptureAlertDialog$onNavigationEvent {
    Function1<Activity, Unit> onExtraCallback();

    String onExtraCallbackWithResult();
}
