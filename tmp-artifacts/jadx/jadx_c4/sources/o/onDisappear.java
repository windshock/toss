package o;

import android.content.Context;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onDisappear {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onWarmupCompleted(Context context) {
        int i = 2 % 2;
        try {
            SoLoader.onNavigationEvent(context, OpenSourceMergedSoMapping.IAuthTabCallback);
            ReactNativeFeatureFlags.onWarmupCompleted(new ReactNativeNewArchitectureFeatureFlagsDefaults() { // from class: o.onDisappear.5
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public boolean overrideBySynchronousMountPropsAtMountingAndroid() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 67;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 23;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 70 / 0;
                    }
                    return true;
                }

                public boolean useFabricInterop() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 59;
                    IAuthTabCallback = i4 % 128;
                    boolean z = i4 % 2 != 0;
                    int i5 = i3 + 77;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return z;
                }
            });
            CredentialProviderCreatePublicKeyCredentialController.onWarmupCompleted();
            EmojiPickerView.onNavigationEvent();
            int i2 = onNavigationEvent + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize SoLoader", e);
        }
    }
}
