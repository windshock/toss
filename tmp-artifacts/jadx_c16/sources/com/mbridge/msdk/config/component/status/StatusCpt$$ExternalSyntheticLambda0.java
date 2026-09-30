package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.provider.Settings;
import com.mbridge.msdk.config.component.base.b;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class StatusCpt$$ExternalSyntheticLambda0 implements a {
    public static int onNavigationEvent;
    public static int onWarmupCompleted;
    public final /* synthetic */ StatusCpt f$0;

    public static int onExtraCallback() {
        int i = onNavigationEvent;
        int i2 = i % 5848059;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onWarmupCompleted;
        }
        int i3 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
        onWarmupCompleted = i3;
        return i3;
    }

    @Override // com.mbridge.msdk.config.component.status.a
    public final void a(b bVar) {
        StatusCpt.$r8$lambda$fY0Vpj2cS3fDcrXOvfkGW56I-2s(this.f$0, bVar);
    }
}
