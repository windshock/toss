package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class DefaultDrmSession$RequestHandler extends Handler {
    private boolean isReleased;
    final /* synthetic */ DefaultDrmSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDrmSession$RequestHandler(DefaultDrmSession defaultDrmSession, Looper looper) {
        super(looper);
        this.this$0 = defaultDrmSession;
    }

    void post(int i2, Object obj, boolean z) {
        obtainMessage(i2, new DefaultDrmSession$RequestTask(LoadEventInfo.getNewId(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Exception excExecuteProvisionRequest;
        DefaultDrmSession$RequestTask defaultDrmSession$RequestTask = (DefaultDrmSession$RequestTask) message.obj;
        try {
            int i2 = message.what;
            if (i2 == 0) {
                DefaultDrmSession defaultDrmSession = this.this$0;
                excExecuteProvisionRequest = defaultDrmSession.callback.executeProvisionRequest(defaultDrmSession.uuid, (ExoMediaDrm.ProvisionRequest) defaultDrmSession$RequestTask.request);
            } else if (i2 == 1) {
                DefaultDrmSession defaultDrmSession2 = this.this$0;
                excExecuteProvisionRequest = defaultDrmSession2.callback.executeKeyRequest(defaultDrmSession2.uuid, (ExoMediaDrm.KeyRequest) defaultDrmSession$RequestTask.request);
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            Log.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e);
            excExecuteProvisionRequest = e;
        } catch (MediaDrmCallbackException e2) {
            boolean zMaybeRetryRequest = maybeRetryRequest(message, e2);
            excExecuteProvisionRequest = e2;
            if (zMaybeRetryRequest) {
                return;
            }
        }
        DefaultDrmSession.access$200(this.this$0).onLoadTaskConcluded(defaultDrmSession$RequestTask.taskId);
        synchronized (this) {
            if (!this.isReleased) {
                this.this$0.responseHandler.obtainMessage(message.what, Pair.create(defaultDrmSession$RequestTask.request, excExecuteProvisionRequest)).sendToTarget();
            }
        }
    }

    private boolean maybeRetryRequest(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
        IOException iOException;
        DefaultDrmSession$RequestTask defaultDrmSession$RequestTask = (DefaultDrmSession$RequestTask) message.obj;
        if (!defaultDrmSession$RequestTask.allowRetry) {
            return false;
        }
        int i2 = defaultDrmSession$RequestTask.errorCount + 1;
        defaultDrmSession$RequestTask.errorCount = i2;
        if (i2 > DefaultDrmSession.access$200(this.this$0).getMinimumLoadableRetryCount(3)) {
            return false;
        }
        LoadEventInfo loadEventInfo = new LoadEventInfo(defaultDrmSession$RequestTask.taskId, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - defaultDrmSession$RequestTask.startTimeMs, mediaDrmCallbackException.bytesLoaded);
        MediaLoadData mediaLoadData = new MediaLoadData(3);
        if (mediaDrmCallbackException.getCause() instanceof IOException) {
            iOException = (IOException) mediaDrmCallbackException.getCause();
        } else {
            final Throwable cause = mediaDrmCallbackException.getCause();
            iOException = new IOException(cause) { // from class: com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
            };
        }
        long retryDelayMsFor = DefaultDrmSession.access$200(this.this$0).getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, mediaLoadData, iOException, defaultDrmSession$RequestTask.errorCount));
        if (retryDelayMsFor == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            if (this.isReleased) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
            return true;
        }
    }

    public void release() {
        synchronized (this) {
            removeCallbacksAndMessages(null);
            this.isReleased = true;
        }
    }
}
