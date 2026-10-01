package com.alibaba.griver.api.common.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.api.common.GriverExtension;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ActivityHelperExtension extends GriverExtension {
    void bindActivity(@Nullable Activity activity);

    void dispatchTouchEvent(MotionEvent motionEvent);

    void finish();

    void onActivityResult(int i2, int i3, Intent intent);

    void onCreate(@Nullable Bundle bundle);

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr);

    void onResume();

    void onStop();
}
