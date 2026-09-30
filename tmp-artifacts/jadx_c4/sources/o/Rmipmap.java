package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.MediatorLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import o.Rmipmap;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Rmipmap<T> extends MediatorLiveData<T> {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final AtomicBoolean IAuthTabCallback = new AtomicBoolean(false);

    public static /* synthetic */ void onWarmupCompleted(Rmipmap rmipmap, TextLinkScopeExternalSyntheticLambda0 textLinkScopeExternalSyntheticLambda0, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        rmipmap.onExtraCallbackWithResult(textLinkScopeExternalSyntheticLambda0, obj);
        int i4 = IAuthTabCallbackDefault + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void observe(@NonNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NonNull final TextLinkScopeExternalSyntheticLambda0<? super T> textLinkScopeExternalSyntheticLambda0) {
        int i = 2 % 2;
        hasActiveObservers();
        super/*androidx.lifecycle.LiveData*/.observe(textFieldScrollKtExternalSyntheticLambda0, new TextLinkScopeExternalSyntheticLambda0() { // from class: im.toss.core.livedata.SingleLiveEvent$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Rmipmap.onWarmupCompleted(this.f$0, textLinkScopeExternalSyntheticLambda0, obj);
                int i5 = onExtraCallbackWithResult + 67;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    private /* synthetic */ void onExtraCallbackWithResult(TextLinkScopeExternalSyntheticLambda0 textLinkScopeExternalSyntheticLambda0, Object obj) {
        int i = 2 % 2;
        if (!(!this.IAuthTabCallback.compareAndSet(true, false))) {
            int i2 = IAuthTabCallbackDefault + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            textLinkScopeExternalSyntheticLambda0.onChanged(obj);
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
        }
        int i5 = asBinder + 77;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setValue(@Nullable T t) {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            atomicBoolean = this.IAuthTabCallback;
            z = false;
        } else {
            atomicBoolean = this.IAuthTabCallback;
            z = true;
        }
        atomicBoolean.set(z);
        super/*androidx.lifecycle.MutableLiveData*/.setValue(t);
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setValue(null);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        postValue((Object) null);
        int i4 = IAuthTabCallbackDefault + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
