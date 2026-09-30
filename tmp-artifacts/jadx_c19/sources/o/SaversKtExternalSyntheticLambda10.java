package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda10 extends ContextWrapper {
    static final SaversKtExternalSyntheticLambda12<?, ?> onNavigationEvent = new MultiParagraphKtExternalSyntheticLambda0();
    private final Savers_androidKtExternalSyntheticLambda6 IAuthTabCallback;
    private final setOnShow IAuthTabCallbackDefault;
    private final Map<Class<?>, SaversKtExternalSyntheticLambda12<?, ?>> IAuthTabCallbackStub;
    private final com.bumptech.glide.Registry access100;
    private final int asBinder;
    private final SaversKtExternalSyntheticLambda0 asInterface;
    private final Glide.onWarmupCompleted onExtraCallback;
    private final List<RequestListener<Object>> onExtraCallbackWithResult;
    private final SaversKtExternalSyntheticLambda57 onTransact;
    private RequestOptions onWarmupCompleted;

    public SaversKtExternalSyntheticLambda10(@NonNull Context context, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, @NonNull com.bumptech.glide.Registry registry, @NonNull setOnShow setonshow, @NonNull Glide.onWarmupCompleted onwarmupcompleted, @NonNull Map<Class<?>, SaversKtExternalSyntheticLambda12<?, ?>> map, @NonNull List<RequestListener<Object>> list, @NonNull SaversKtExternalSyntheticLambda57 saversKtExternalSyntheticLambda57, @NonNull SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0, int i2) {
        super(context.getApplicationContext());
        this.IAuthTabCallback = savers_androidKtExternalSyntheticLambda6;
        this.access100 = registry;
        this.IAuthTabCallbackDefault = setonshow;
        this.onExtraCallback = onwarmupcompleted;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallbackStub = map;
        this.onTransact = saversKtExternalSyntheticLambda57;
        this.asInterface = saversKtExternalSyntheticLambda0;
        this.asBinder = i2;
    }

    public List<RequestListener<Object>> IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public RequestOptions onNavigationEvent() {
        RequestOptions requestOptions;
        synchronized (this) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = this.onExtraCallback.onExtraCallback().ICustomTabsService();
            }
            requestOptions = this.onWarmupCompleted;
        }
        return requestOptions;
    }

    public <T> SaversKtExternalSyntheticLambda12<?, T> onNavigationEvent(@NonNull Class<T> cls) {
        SaversKtExternalSyntheticLambda12<?, T> saversKtExternalSyntheticLambda12 = (SaversKtExternalSyntheticLambda12) this.IAuthTabCallbackStub.get(cls);
        if (saversKtExternalSyntheticLambda12 == null) {
            for (Map.Entry<Class<?>, SaversKtExternalSyntheticLambda12<?, ?>> entry : this.IAuthTabCallbackStub.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    saversKtExternalSyntheticLambda12 = (SaversKtExternalSyntheticLambda12) entry.getValue();
                }
            }
        }
        return saversKtExternalSyntheticLambda12 == null ? (SaversKtExternalSyntheticLambda12<?, T>) onNavigationEvent : saversKtExternalSyntheticLambda12;
    }

    public <X> ViewTarget<ImageView, X> onExtraCallback(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.IAuthTabCallbackDefault.IAuthTabCallback(imageView, cls);
    }

    public SaversKtExternalSyntheticLambda57 onExtraCallbackWithResult() {
        return this.onTransact;
    }

    public com.bumptech.glide.Registry asBinder() {
        return this.access100;
    }

    public int asInterface() {
        return this.asBinder;
    }

    public Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public SaversKtExternalSyntheticLambda0 onExtraCallback() {
        return this.asInterface;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
