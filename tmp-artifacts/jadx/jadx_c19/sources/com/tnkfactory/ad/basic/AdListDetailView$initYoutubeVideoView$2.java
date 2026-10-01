package com.tnkfactory.ad.basic;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.tnkfactory.ad.rwd.VideoActionListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListDetailView$initYoutubeVideoView$2 implements VideoActionListener {
    public final /* synthetic */ AdListDetailView a;
    public final /* synthetic */ ViewGroup b;

    public AdListDetailView$initYoutubeVideoView$2(AdListDetailView adListDetailView, ViewGroup viewGroup) {
        this.a = adListDetailView;
        this.b = viewGroup;
    }

    public static final void a(AdListDetailView adListDetailView, ViewGroup viewGroup) {
        adListDetailView.a(viewGroup, true);
    }

    @Override // com.tnkfactory.ad.rwd.VideoActionListener
    public void onCompletion(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AdListDetailView.access$setVideoComplete$p(this.a, true);
        Handler handler = new Handler(Looper.getMainLooper());
        final AdListDetailView adListDetailView = this.a;
        final ViewGroup viewGroup = this.b;
        handler.post(new Runnable() { // from class: com.tnkfactory.ad.basic.AdListDetailView$initYoutubeVideoView$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdListDetailView$initYoutubeVideoView$2.a(adListDetailView, viewGroup);
            }
        });
    }

    @Override // com.tnkfactory.ad.rwd.VideoActionListener
    public void onSize(int i2, int i3) {
    }
}
