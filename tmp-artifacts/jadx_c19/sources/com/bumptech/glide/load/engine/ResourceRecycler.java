package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceRecycler {
    private boolean onExtraCallback;
    private final Handler onExtraCallbackWithResult = new Handler(Looper.getMainLooper(), new ResourceRecyclerCallback());

    public void onNavigationEvent(Resource<?> resource, boolean z) {
        synchronized (this) {
            if (this.onExtraCallback || z) {
                this.onExtraCallbackWithResult.obtainMessage(1, resource).sendToTarget();
            } else {
                this.onExtraCallback = true;
                resource.asBinder();
                this.onExtraCallback = false;
            }
        }
    }

    static final class ResourceRecyclerCallback implements Handler.Callback {
        ResourceRecyclerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).asBinder();
            return true;
        }
    }
}
