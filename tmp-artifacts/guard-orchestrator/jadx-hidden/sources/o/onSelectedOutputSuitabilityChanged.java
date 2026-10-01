package o;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class onSelectedOutputSuitabilityChanged<T> extends ExoPlayerImplExternalSyntheticLambda12<T> implements ExoPlayerImplExternalSyntheticLambda15 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public byte[] onExtraCallback;

    public onSelectedOutputSuitabilityChanged(ExoPlayerImplExternalSyntheticLambda14<?> exoPlayerImplExternalSyntheticLambda14, byte[] bArr) {
        super(exoPlayerImplExternalSyntheticLambda14);
        this.onExtraCallback = bArr;
    }

    @Override // java.lang.Iterable
    public Iterator<ExoPlayerImplExternalSyntheticLambda12> iterator() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.onWarmupCompleted.onExtraCallbackWithResult() != ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted) {
            return Collections.singletonList(this).iterator();
        }
        Iterator<ExoPlayerImplExternalSyntheticLambda12> it = ((ExoPlayerImplExternalSyntheticLambda16) ExoPlayerImplExternalSyntheticLambda14.asBinder.onExtraCallbackWithResult(new handleMessage()).onNavigationEvent(ExoPlayerImplExternalSyntheticLambda14.asBinder, this.onExtraCallback)).iterator();
        int i4 = onNavigationEvent;
        int i5 = (i4 & 41) + (i4 | 41);
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return it;
        }
        throw new NullPointerException();
    }
}
