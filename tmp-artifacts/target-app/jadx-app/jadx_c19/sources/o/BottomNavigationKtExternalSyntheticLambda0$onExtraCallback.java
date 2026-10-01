package o;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda0;
import o.BottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BottomNavigationKtExternalSyntheticLambda0$onExtraCallback {
    private final CopyOnWriteArrayList<onExtraCallback> IAuthTabCallback;
    public final int onExtraCallbackWithResult;
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent;

    public BottomNavigationKtExternalSyntheticLambda0$onExtraCallback() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private BottomNavigationKtExternalSyntheticLambda0$onExtraCallback(CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList, int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        this.IAuthTabCallback = copyOnWriteArrayList;
        this.onExtraCallbackWithResult = i2;
        this.onNavigationEvent = onextracallbackwithresult;
    }

    public BottomNavigationKtExternalSyntheticLambda0$onExtraCallback onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        return new BottomNavigationKtExternalSyntheticLambda0$onExtraCallback(this.IAuthTabCallback, i2, onextracallbackwithresult);
    }

    public void onExtraCallbackWithResult(Handler handler, BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0) {
        this.IAuthTabCallback.add(new onExtraCallback(handler, bottomNavigationKtExternalSyntheticLambda0));
    }

    public void onExtraCallback(BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0) {
        Iterator<onExtraCallback> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            if (next.onExtraCallbackWithResult == bottomNavigationKtExternalSyntheticLambda0) {
                this.IAuthTabCallback.remove(next);
            }
        }
    }

    public void onExtraCallbackWithResult(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, int i3) {
        onExtraCallback(badgeKtExternalSyntheticLambda0, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    public void onExtraCallback(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i4, @Nullable Object obj, long j, long j2, int i5) {
        onExtraCallbackWithResult(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4, i4, obj, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2)), i5);
    }

    public void onExtraCallbackWithResult(final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final int i2) {
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.f$0;
                ((BottomNavigationKtExternalSyntheticLambda0) obj).IAuthTabCallback(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult, bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, i2);
            }
        });
    }

    public void IAuthTabCallback(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2) {
        IAuthTabCallback(badgeKtExternalSyntheticLambda0, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void IAuthTabCallback(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i4, @Nullable Object obj, long j, long j2) {
        IAuthTabCallback(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4, i4, obj, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2)));
    }

    public void IAuthTabCallback(final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.f$0;
                ((BottomNavigationKtExternalSyntheticLambda0) obj).onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult, bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2);
            }
        });
    }

    public void onNavigationEvent(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2) {
        onNavigationEvent(badgeKtExternalSyntheticLambda0, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void onNavigationEvent(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i4, @Nullable Object obj, long j, long j2) {
        onWarmupCompleted(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4, i4, obj, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2)));
    }

    public void onWarmupCompleted(final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.f$0;
                ((BottomNavigationKtExternalSyntheticLambda0) obj).onNavigationEvent(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult, bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2);
            }
        });
    }

    public void onNavigationEvent(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, IOException iOException, boolean z) {
        IAuthTabCallback(badgeKtExternalSyntheticLambda0, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void IAuthTabCallback(BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, int i2, int i3, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i4, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
        onWarmupCompleted(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(i2, i3, basicTextContextMenuProviderKtExternalSyntheticLambda4, i4, obj, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2)), iOException, z);
    }

    public void onWarmupCompleted(final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final IOException iOException, final boolean z) {
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.f$0;
                ((BottomNavigationKtExternalSyntheticLambda0) obj).onExtraCallbackWithResult(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult, bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, iOException, z);
            }
        });
    }

    public void onWarmupCompleted(int i2, long j, long j2) {
        IAuthTabCallback(new BadgeKtExternalSyntheticLambda2(1, i2, null, 3, null, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2)));
    }

    public void IAuthTabCallback(final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent);
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0 = (BottomNavigationKtExternalSyntheticLambda0) obj;
                bottomNavigationKtExternalSyntheticLambda0.onNavigationEvent(this.f$0.onExtraCallbackWithResult, onextracallbackwithresult, badgeKtExternalSyntheticLambda2);
            }
        });
    }

    public void onNavigationEvent(int i2, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i3, @Nullable Object obj, long j) {
        onExtraCallbackWithResult(new BadgeKtExternalSyntheticLambda2(1, i2, basicTextContextMenuProviderKtExternalSyntheticLambda4, i3, obj, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j), -9223372036854775807L));
    }

    public void onExtraCallbackWithResult(final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda0
            public final void accept(Object obj) {
                BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback = this.f$0;
                ((BottomNavigationKtExternalSyntheticLambda0) obj).onExtraCallback(bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onExtraCallbackWithResult, bottomNavigationKtExternalSyntheticLambda0$onExtraCallback.onNavigationEvent, badgeKtExternalSyntheticLambda2);
            }
        });
    }

    public void onNavigationEvent(final TextFieldDecoratorModifierNodeExternalSyntheticLambda10<BottomNavigationKtExternalSyntheticLambda0> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        Iterator<onExtraCallback> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            final BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0 = next.onExtraCallbackWithResult;
            Object[] objArr = {next.onExtraCallback, new Runnable() { // from class: androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(bottomNavigationKtExternalSyntheticLambda0);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }

    static final class onExtraCallback {
        public Handler onExtraCallback;
        public BottomNavigationKtExternalSyntheticLambda0 onExtraCallbackWithResult;

        public onExtraCallback(Handler handler, BottomNavigationKtExternalSyntheticLambda0 bottomNavigationKtExternalSyntheticLambda0) {
            this.onExtraCallback = handler;
            this.onExtraCallbackWithResult = bottomNavigationKtExternalSyntheticLambda0;
        }
    }
}
