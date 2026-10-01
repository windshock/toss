package com.tbruyelle.rxpermissions2;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import o.getTimestampBytes;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RxPermissionsFragment extends Fragment {
    private boolean onExtraCallback;
    private Map<String, getTimestampBytes<shouldBeKeptAsChild>> onWarmupCompleted = new HashMap();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    void onWarmupCompleted(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        onNavigationEvent(strArr, iArr, zArr);
    }

    void onNavigationEvent(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            onExtraCallback("onRequestPermissionsResult  " + strArr[i]);
            getTimestampBytes<shouldBeKeptAsChild> gettimestampbytes = this.onWarmupCompleted.get(strArr[i]);
            if (gettimestampbytes == null) {
                String str = RxPermissions.onExtraCallbackWithResult;
                return;
            }
            this.onWarmupCompleted.remove(strArr[i]);
            gettimestampbytes.onExtraCallback(new shouldBeKeptAsChild(strArr[i], iArr[i] == 0, zArr[i]));
            gettimestampbytes.onExtraCallback();
        }
    }

    boolean onWarmupCompleted(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    boolean IAuthTabCallback(String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new IllegalStateException("This fragment must be attached to an activity.");
        }
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    public getTimestampBytes<shouldBeKeptAsChild> onExtraCallbackWithResult(@NonNull String str) {
        return this.onWarmupCompleted.get(str);
    }

    public boolean onNavigationEvent(@NonNull String str) {
        return this.onWarmupCompleted.containsKey(str);
    }

    public void onExtraCallbackWithResult(@NonNull String str, @NonNull getTimestampBytes<shouldBeKeptAsChild> gettimestampbytes) {
        this.onWarmupCompleted.put(str, gettimestampbytes);
    }

    void onExtraCallback(String str) {
        if (this.onExtraCallback) {
            String str2 = RxPermissions.onExtraCallbackWithResult;
        }
    }
}
