package com.alibaba.griver.core.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.core.utils.H5StatusBarUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverTransActivity extends GriverBaseActivity {
    public static final String TAG = "Griver:NebulaTransActivity";
    public static Class[] ACTIVITY_CLASSES = {Lite1.class, Lite2.class, Lite3.class};
    public static Class[] ACTIVITY_BACK_CLASSES = {Back1.class, Back2.class, Back3.class, Back4.class, Back5.class, Back6.class};

    public static class Back1 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Back2 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Back3 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Back4 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Back5 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Back6 extends Back {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.Back, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static void a(Activity activity, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        try {
            if (BundleUtils.getBoolean(extras, RVParams.TRANS_ANIMATE, false)) {
                H5StatusBarUtils.setTransparentColor(activity, 855638016);
            }
            H5StatusBarUtils.setTransparentColor(activity, -16777216);
        } catch (Exception e) {
            RVLogger.e(TAG, e);
        }
    }

    public static void b(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            activity.setRequestedOrientation(1);
        }
        a(activity, activity.getIntent());
    }

    public static class Back extends GriverBaseActivity$Back {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            GriverTransActivity.b(this);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Lite1 extends LiteBase {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite1");
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Lite2 extends LiteBase {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite2");
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class Lite3 extends LiteBase {
        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite3");
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase, com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public static class LiteBase extends GriverBaseActivity$Lite {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            GriverTransActivity.b(this);
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onStart() {
            super.onStart();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onResume() {
            super.onResume();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void onPause() {
            super.onPause();
        }

        @Override // com.alibaba.griver.core.ui.activity.GriverBaseActivity$Lite
        public void attachBaseContext(Context context) {
            super.attachBaseContext(context);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
