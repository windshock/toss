package o;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AndroidMenu_androidKtExternalSyntheticLambda4 {

    public interface IAuthTabCallback {
        void IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4 androidMenu_androidKtExternalSyntheticLambda4, long j, long j2);
    }

    public interface onExtraCallbackWithResult {
        default void IAuthTabCallback() {
        }

        default void onExtraCallback() {
        }
    }

    void IAuthTabCallback();

    void IAuthTabCallback(int i2, int i3, TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, long j, int i4);

    void asBinder();

    void onExtraCallback();

    void onExtraCallback(int i2);

    void onExtraCallback(Surface surface);

    int onExtraCallbackWithResult(MediaCodec.BufferInfo bufferInfo);

    MediaFormat onExtraCallbackWithResult();

    ByteBuffer onExtraCallbackWithResult(int i2);

    void onExtraCallbackWithResult(int i2, int i3, int i4, long j, int i5);

    void onExtraCallbackWithResult(Bundle bundle);

    int onNavigationEvent();

    void onNavigationEvent(IAuthTabCallback iAuthTabCallback, Handler handler);

    ByteBuffer onWarmupCompleted(int i2);

    void onWarmupCompleted(int i2, long j);

    void onWarmupCompleted(int i2, boolean z);

    boolean onWarmupCompleted();

    default boolean onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        return false;
    }

    public static final class onWarmupCompleted {
        public final AppBarKtExternalSyntheticLambda5 IAuthTabCallback;
        public final Surface asBinder;
        public final MediaFormat onExtraCallback;
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
        public final AppBarKtExternalSyntheticLambda1 onNavigationEvent;
        public final MediaCrypto onWarmupCompleted;

        public static onWarmupCompleted IAuthTabCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, MediaFormat mediaFormat, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable MediaCrypto mediaCrypto, @Nullable AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1) {
            return new onWarmupCompleted(appBarKtExternalSyntheticLambda5, mediaFormat, basicTextContextMenuProviderKtExternalSyntheticLambda4, null, mediaCrypto, appBarKtExternalSyntheticLambda1);
        }

        public static onWarmupCompleted onExtraCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, MediaFormat mediaFormat, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new onWarmupCompleted(appBarKtExternalSyntheticLambda5, mediaFormat, basicTextContextMenuProviderKtExternalSyntheticLambda4, surface, mediaCrypto, null);
        }

        private onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, MediaFormat mediaFormat, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1) {
            this.IAuthTabCallback = appBarKtExternalSyntheticLambda5;
            this.onExtraCallback = mediaFormat;
            this.onExtraCallbackWithResult = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.asBinder = surface;
            this.onWarmupCompleted = mediaCrypto;
            this.onNavigationEvent = appBarKtExternalSyntheticLambda1;
        }
    }

    public interface onExtraCallback {

        @Deprecated
        public static final onExtraCallback onNavigationEvent = new AndroidMenu_androidKtExternalSyntheticLambda3();

        AndroidMenu_androidKtExternalSyntheticLambda4 onExtraCallback(onWarmupCompleted onwarmupcompleted) throws IOException;

        static onExtraCallback onWarmupCompleted(Context context) {
            return new AndroidMenu_androidKtExternalSyntheticLambda3(context);
        }
    }
}
