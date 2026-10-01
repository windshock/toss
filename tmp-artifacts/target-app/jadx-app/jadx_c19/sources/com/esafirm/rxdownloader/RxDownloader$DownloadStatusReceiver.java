package com.esafirm.rxdownloader;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import o.getTimestampBytes;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class RxDownloader$DownloadStatusReceiver extends BroadcastReceiver {
    final /* synthetic */ RxDownloader onNavigationEvent;

    private RxDownloader$DownloadStatusReceiver(RxDownloader rxDownloader) {
        this.onNavigationEvent = rxDownloader;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", 0L);
        getTimestampBytes gettimestampbytes = (getTimestampBytes) RxDownloader.onWarmupCompleted(this.onNavigationEvent).onWarmupCompleted(longExtra);
        if (gettimestampbytes == null) {
            return;
        }
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(longExtra);
        DownloadManager downloadManagerOnExtraCallback = RxDownloader.onExtraCallback(this.onNavigationEvent);
        Cursor cursorQuery = downloadManagerOnExtraCallback.query(query);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            downloadManagerOnExtraCallback.remove(longExtra);
            gettimestampbytes.onExtraCallbackWithResult(new IllegalStateException("Cursor empty, this shouldn't happened"));
            RxDownloader.onWarmupCompleted(this.onNavigationEvent).onExtraCallback(longExtra);
            return;
        }
        if (8 != cursorQuery.getInt(cursorQuery.getColumnIndex("status"))) {
            cursorQuery.close();
            downloadManagerOnExtraCallback.remove(longExtra);
            gettimestampbytes.onExtraCallbackWithResult(new IllegalStateException("Download Failed"));
            RxDownloader.onWarmupCompleted(this.onNavigationEvent).onExtraCallback(longExtra);
            return;
        }
        String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
        cursorQuery.close();
        gettimestampbytes.onExtraCallback(string);
        gettimestampbytes.onExtraCallback();
        RxDownloader.onWarmupCompleted(this.onNavigationEvent).onExtraCallback(longExtra);
    }
}
