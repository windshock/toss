package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class DefaultDrmSession$ResponseHandler extends Handler {
    final /* synthetic */ DefaultDrmSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDrmSession$ResponseHandler(DefaultDrmSession defaultDrmSession, Looper looper) {
        super(looper);
        this.this$0 = defaultDrmSession;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i2 = message.what;
        if (i2 == 0) {
            DefaultDrmSession.access$000(this.this$0, obj, obj2);
        } else {
            if (i2 != 1) {
                return;
            }
            DefaultDrmSession.access$100(this.this$0, obj, obj2);
        }
    }
}
