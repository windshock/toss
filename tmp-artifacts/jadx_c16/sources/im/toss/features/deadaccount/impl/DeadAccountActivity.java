package im.toss.features.deadaccount.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraConfigBuilder;
import o.ZipFileInfo;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DeadAccountActivity extends Hilt_DeadAccountActivity {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;

    static {
        int i = asInterface + 57;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return 1389509L;
        }
        int i3 = 55 / 0;
        return 1389509L;
    }

    @Override // im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ZipFileInfo.onExtraCallback.onExtraCallback()), 1, (Object) null);
        int i4 = asBinder + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    @Override // im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.deadaccount.impl.Hilt_DeadAccountActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) DeadAccountActivity.class);
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            throw null;
        }
    }
}
