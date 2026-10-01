package com.alibaba.griver.core.keepalive;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.logger.GriverLogger;
import o.MediaStoreVideoCannotWrite;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverProxyActivity extends Activity {
    public long a;
    public boolean b;

    public final boolean a(Context context, RVAppRecord rVAppRecord) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        activityManager.moveTaskToFront(rVAppRecord.getRunningTaskInfo().id, 0, MediaStoreVideoCannotWrite.onExtraCallback(context, R.anim.griver_core_app_open_enter_right_in, R.anim.griver_core_app_open_exit_left_out).onWarmupCompleted());
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("targetIntent");
            if (intent2 == null) {
                RVLogger.e("GriverProxyActivity", "proxyActivity onCreate fail no targetIntent");
                finish();
                return;
            }
            try {
                startActivity(intent2, MediaStoreVideoCannotWrite.onExtraCallback(this, R.anim.griver_core_app_open_enter_right_in, R.anim.griver_core_app_open_exit_left_out).onWarmupCompleted());
            } catch (Throwable th) {
                GriverLogger.d("GriverProxyActivity", "Just print, start miniprogram activity error:" + th);
            }
            long longExtra = intent.getLongExtra("containerToken", -1L);
            this.a = longExtra;
            if (longExtra == -1) {
                RVLogger.e("GriverProxyActivity", "proxyActivity onCreate fail no appId");
                finish();
                return;
            }
            KeepAliveAppManager.getInstance().addContainerToken(this.a, this);
            this.b = true;
            LinearLayout linearLayout = new LinearLayout(this);
            setContentView(linearLayout);
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.alibaba.griver.core.keepalive.GriverProxyActivity.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    RVLogger.e("GriverProxyActivity", "proxyActivity onTouch to finish");
                    GriverProxyActivity.this.finish();
                    return false;
                }
            });
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (this.b) {
                this.b = false;
                return;
            }
            long startTokenByToken = KeepAliveAppManager.getInstance().getStartTokenByToken(this.a);
            if (startTokenByToken > 0) {
                RVAppRecord appRecord = RVMain.getAppRecord(startTokenByToken);
                if (appRecord == null) {
                    finish();
                } else if (a(this, appRecord)) {
                    RVLogger.d("GriverProxyActivity", "use proxyActivity to reShow app:");
                } else {
                    finish();
                }
            }
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
