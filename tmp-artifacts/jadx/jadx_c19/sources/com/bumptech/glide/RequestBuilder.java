package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.SaversKtExternalSyntheticLambda10;
import o.SaversKtExternalSyntheticLambda11;
import o.SaversKtExternalSyntheticLambda12;
import o.SaversKtExternalSyntheticLambda58;
import o.applyConstraintsFromLayoutParams;
import o.markHierarchyDirty;
import o.setInteractionEnabled;
import o.setInterpolatedProgress;
import o.setMargin;
import o.setScaleY;
import o.setTransitionDuration;
import o.setTranslationX;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestBuilder<TranscodeType> extends setTranslationX<RequestBuilder<TranscodeType>> implements Cloneable {
    protected static final RequestOptions onWarmupCompleted = new RequestOptions().IAuthTabCallback(SaversKtExternalSyntheticLambda58.onNavigationEvent).onWarmupCompleted(SaversKtExternalSyntheticLambda11.LOW).IAuthTabCallback(true);
    private final Glide IAuthTabCallback;
    private List<RequestListener<TranscodeType>> IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub = true;
    private Float IAuthTabCallbackStubProxy;
    private final RequestManager IAuthTabCallback_Parcel;
    private SaversKtExternalSyntheticLambda12<?, ? super TranscodeType> access000;
    private RequestBuilder<TranscodeType> access100;
    private Object asBinder;
    private boolean asInterface;
    private final Class<TranscodeType> getInterfaceDescriptor;
    private RequestBuilder<TranscodeType> onExtraCallback;
    private final SaversKtExternalSyntheticLambda10 onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private boolean onTransact;

    @Override // o.setTranslationX
    public /* synthetic */ setTranslationX onExtraCallback(@NonNull setTranslationX settranslationx) {
        return IAuthTabCallback((setTranslationX<?>) settranslationx);
    }

    protected RequestBuilder(@NonNull Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.IAuthTabCallback = glide;
        this.IAuthTabCallback_Parcel = requestManager;
        this.getInterfaceDescriptor = cls;
        this.onNavigationEvent = context;
        this.access000 = requestManager.onNavigationEvent(cls);
        this.onExtraCallbackWithResult = glide.asInterface();
        IAuthTabCallback(requestManager.onWarmupCompleted());
        IAuthTabCallback(requestManager.onExtraCallbackWithResult());
    }

    private void IAuthTabCallback(List<RequestListener<Object>> list) {
        Iterator<RequestListener<Object>> it = list.iterator();
        while (it.hasNext()) {
            onNavigationEvent((RequestListener) it.next());
        }
    }

    public RequestBuilder<TranscodeType> IAuthTabCallback(@NonNull setTranslationX<?> settranslationx) {
        markHierarchyDirty.onExtraCallbackWithResult(settranslationx);
        return (RequestBuilder) super.onExtraCallback(settranslationx);
    }

    public RequestBuilder<TranscodeType> IAuthTabCallback(@Nullable RequestListener<TranscodeType> requestListener) {
        if (onPostMessage()) {
            return clone().IAuthTabCallback(requestListener);
        }
        this.IAuthTabCallbackDefault = null;
        return onNavigationEvent((RequestListener) requestListener);
    }

    public RequestBuilder<TranscodeType> onNavigationEvent(@Nullable RequestListener<TranscodeType> requestListener) {
        if (onPostMessage()) {
            return clone().onNavigationEvent((RequestListener) requestListener);
        }
        if (requestListener != null) {
            if (this.IAuthTabCallbackDefault == null) {
                this.IAuthTabCallbackDefault = new ArrayList();
            }
            this.IAuthTabCallbackDefault.add(requestListener);
        }
        return newSession();
    }

    public RequestBuilder<TranscodeType> onExtraCallbackWithResult(@Nullable Object obj) {
        return onNavigationEvent(obj);
    }

    private RequestBuilder<TranscodeType> onNavigationEvent(@Nullable Object obj) {
        if (onPostMessage()) {
            return clone().onNavigationEvent(obj);
        }
        this.asBinder = obj;
        this.asInterface = true;
        return newSession();
    }

    public RequestBuilder<TranscodeType> onExtraCallback(@Nullable Bitmap bitmap) {
        return onNavigationEvent(bitmap).IAuthTabCallback(RequestOptions.onExtraCallbackWithResult(SaversKtExternalSyntheticLambda58.IAuthTabCallback));
    }

    public RequestBuilder<TranscodeType> onExtraCallback(@Nullable String str) {
        return onNavigationEvent(str);
    }

    public RequestBuilder<TranscodeType> onExtraCallbackWithResult(@Nullable File file) {
        return onNavigationEvent(file);
    }

    @Override // o.setTranslationX
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> onWarmupCompleted() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.onWarmupCompleted();
        requestBuilder.access000 = requestBuilder.access000.clone();
        if (requestBuilder.IAuthTabCallbackDefault != null) {
            requestBuilder.IAuthTabCallbackDefault = new ArrayList(requestBuilder.IAuthTabCallbackDefault);
        }
        RequestBuilder<TranscodeType> requestBuilder2 = requestBuilder.access100;
        if (requestBuilder2 != null) {
            requestBuilder.access100 = requestBuilder2.clone();
        }
        RequestBuilder<TranscodeType> requestBuilder3 = requestBuilder.onExtraCallback;
        if (requestBuilder3 != null) {
            requestBuilder.onExtraCallback = requestBuilder3.clone();
        }
        return requestBuilder;
    }

    public <Y extends setTransitionDuration<TranscodeType>> Y onNavigationEvent(@NonNull Y y) {
        return (Y) onNavigationEvent(y, null, setMargin.onNavigationEvent());
    }

    <Y extends setTransitionDuration<TranscodeType>> Y onNavigationEvent(@NonNull Y y, @Nullable RequestListener<TranscodeType> requestListener, Executor executor) {
        return (Y) onNavigationEvent(y, requestListener, this, executor);
    }

    private <Y extends setTransitionDuration<TranscodeType>> Y onNavigationEvent(@NonNull Y y, @Nullable RequestListener<TranscodeType> requestListener, setTranslationX<?> settranslationx, Executor executor) {
        markHierarchyDirty.onExtraCallbackWithResult(y);
        if (!this.asInterface) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request requestIAuthTabCallback = IAuthTabCallback(y, requestListener, settranslationx, executor);
        Request request = y.getRequest();
        if (requestIAuthTabCallback.onExtraCallbackWithResult(request) && !IAuthTabCallback(settranslationx, request)) {
            if (!((Request) markHierarchyDirty.onExtraCallbackWithResult(request)).IAuthTabCallbackStub()) {
                request.onNavigationEvent();
            }
            return y;
        }
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult((setTransitionDuration<?>) y);
        y.setRequest(requestIAuthTabCallback);
        this.IAuthTabCallback_Parcel.onNavigationEvent(y, requestIAuthTabCallback);
        return y;
    }

    private boolean IAuthTabCallback(setTranslationX<?> settranslationx, Request request) {
        return !settranslationx.onMessageChannelReady() && request.asBinder();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewTarget<ImageView, TranscodeType> onExtraCallback(@NonNull ImageView imageView) {
        RequestBuilder<TranscodeType> requestBuilderIsEngagementSignalsApiAvailable;
        applyConstraintsFromLayoutParams.onNavigationEvent();
        markHierarchyDirty.onExtraCallbackWithResult(imageView);
        if (!ICustomTabsCallbackDefault() && onRelationshipValidationResult() && imageView.getScaleType() != null) {
            switch (AnonymousClass1.IAuthTabCallback[imageView.getScaleType().ordinal()]) {
                case 1:
                    requestBuilderIsEngagementSignalsApiAvailable = onWarmupCompleted().isEngagementSignalsApiAvailable();
                    break;
                case 2:
                    requestBuilderIsEngagementSignalsApiAvailable = onWarmupCompleted().extraCommand();
                    break;
                case 3:
                case 4:
                case 5:
                    requestBuilderIsEngagementSignalsApiAvailable = onWarmupCompleted().mayLaunchUrl();
                    break;
                case 6:
                    requestBuilderIsEngagementSignalsApiAvailable = onWarmupCompleted().extraCommand();
                    break;
            }
        } else {
            requestBuilderIsEngagementSignalsApiAvailable = this;
        }
        return (ViewTarget) onNavigationEvent(this.onExtraCallbackWithResult.onExtraCallback(imageView, this.getInterfaceDescriptor), null, requestBuilderIsEngagementSignalsApiAvailable, setMargin.onNavigationEvent());
    }

    /* renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[SaversKtExternalSyntheticLambda11.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[SaversKtExternalSyntheticLambda11.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[SaversKtExternalSyntheticLambda11.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[SaversKtExternalSyntheticLambda11.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[SaversKtExternalSyntheticLambda11.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            IAuthTabCallback = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IAuthTabCallback[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private SaversKtExternalSyntheticLambda11 onExtraCallbackWithResult(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11) {
        int i2 = AnonymousClass1.onExtraCallbackWithResult[saversKtExternalSyntheticLambda11.ordinal()];
        if (i2 == 1) {
            return SaversKtExternalSyntheticLambda11.NORMAL;
        }
        if (i2 == 2) {
            return SaversKtExternalSyntheticLambda11.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return SaversKtExternalSyntheticLambda11.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + extraCallback());
    }

    private Request IAuthTabCallback(setTransitionDuration<TranscodeType> settransitionduration, @Nullable RequestListener<TranscodeType> requestListener, setTranslationX<?> settranslationx, Executor executor) {
        return onWarmupCompleted(new Object(), settransitionduration, requestListener, null, this.access000, settranslationx.extraCallback(), settranslationx.access100(), settranslationx.access000(), settranslationx, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Request onWarmupCompleted(Object obj, setTransitionDuration<TranscodeType> settransitionduration, @Nullable RequestListener<TranscodeType> requestListener, @Nullable RequestCoordinator requestCoordinator, SaversKtExternalSyntheticLambda12<?, ? super TranscodeType> saversKtExternalSyntheticLambda12, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, int i2, int i3, setTranslationX<?> settranslationx, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator setscaley;
        if (this.onExtraCallback != null) {
            setscaley = new setScaleY(obj, requestCoordinator);
            requestCoordinator2 = setscaley;
        } else {
            requestCoordinator2 = null;
            setscaley = requestCoordinator;
        }
        Request requestIAuthTabCallback = IAuthTabCallback(obj, settransitionduration, requestListener, setscaley, saversKtExternalSyntheticLambda12, saversKtExternalSyntheticLambda11, i2, i3, settranslationx, executor);
        if (requestCoordinator2 == null) {
            return requestIAuthTabCallback;
        }
        int iAccess100 = this.onExtraCallback.access100();
        int iAccess000 = this.onExtraCallback.access000();
        if (applyConstraintsFromLayoutParams.onExtraCallback(i2, i3) && !this.onExtraCallback.ICustomTabsCallback_Parcel()) {
            iAccess100 = settranslationx.access100();
            iAccess000 = settranslationx.access000();
        }
        RequestBuilder<TranscodeType> requestBuilder = this.onExtraCallback;
        setScaleY setscaley2 = requestCoordinator2;
        setscaley2.onNavigationEvent(requestIAuthTabCallback, requestBuilder.onWarmupCompleted(obj, settransitionduration, requestListener, setscaley2, requestBuilder.access000, requestBuilder.extraCallback(), iAccess100, iAccess000, this.onExtraCallback, executor));
        return setscaley2;
    }

    private Request IAuthTabCallback(Object obj, setTransitionDuration<TranscodeType> settransitionduration, RequestListener<TranscodeType> requestListener, @Nullable RequestCoordinator requestCoordinator, SaversKtExternalSyntheticLambda12<?, ? super TranscodeType> saversKtExternalSyntheticLambda12, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, int i2, int i3, setTranslationX<?> settranslationx, Executor executor) {
        SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11OnExtraCallbackWithResult;
        RequestBuilder<TranscodeType> requestBuilder = this.access100;
        if (requestBuilder != null) {
            if (this.onTransact) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            SaversKtExternalSyntheticLambda12<?, ? super TranscodeType> saversKtExternalSyntheticLambda122 = requestBuilder.IAuthTabCallbackStub ? saversKtExternalSyntheticLambda12 : requestBuilder.access000;
            if (requestBuilder.ICustomTabsCallbackStubProxy()) {
                saversKtExternalSyntheticLambda11OnExtraCallbackWithResult = this.access100.extraCallback();
            } else {
                saversKtExternalSyntheticLambda11OnExtraCallbackWithResult = onExtraCallbackWithResult(saversKtExternalSyntheticLambda11);
            }
            SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda112 = saversKtExternalSyntheticLambda11OnExtraCallbackWithResult;
            int iAccess100 = this.access100.access100();
            int iAccess000 = this.access100.access000();
            if (applyConstraintsFromLayoutParams.onExtraCallback(i2, i3) && !this.access100.ICustomTabsCallback_Parcel()) {
                iAccess100 = settranslationx.access100();
                iAccess000 = settranslationx.access000();
            }
            setInterpolatedProgress setinterpolatedprogress = new setInterpolatedProgress(obj, requestCoordinator);
            Request requestOnExtraCallbackWithResult = onExtraCallbackWithResult(obj, settransitionduration, requestListener, settranslationx, setinterpolatedprogress, saversKtExternalSyntheticLambda12, saversKtExternalSyntheticLambda11, i2, i3, executor);
            this.onTransact = true;
            RequestBuilder<TranscodeType> requestBuilder2 = this.access100;
            Request requestOnWarmupCompleted = requestBuilder2.onWarmupCompleted(obj, settransitionduration, requestListener, setinterpolatedprogress, saversKtExternalSyntheticLambda122, saversKtExternalSyntheticLambda112, iAccess100, iAccess000, requestBuilder2, executor);
            this.onTransact = false;
            setinterpolatedprogress.onExtraCallback(requestOnExtraCallbackWithResult, requestOnWarmupCompleted);
            return setinterpolatedprogress;
        }
        if (this.IAuthTabCallbackStubProxy != null) {
            setInterpolatedProgress setinterpolatedprogress2 = new setInterpolatedProgress(obj, requestCoordinator);
            setinterpolatedprogress2.onExtraCallback(onExtraCallbackWithResult(obj, settransitionduration, requestListener, settranslationx, setinterpolatedprogress2, saversKtExternalSyntheticLambda12, saversKtExternalSyntheticLambda11, i2, i3, executor), onExtraCallbackWithResult(obj, settransitionduration, requestListener, settranslationx.onWarmupCompleted().onExtraCallback(this.IAuthTabCallbackStubProxy.floatValue()), setinterpolatedprogress2, saversKtExternalSyntheticLambda12, onExtraCallbackWithResult(saversKtExternalSyntheticLambda11), i2, i3, executor));
            return setinterpolatedprogress2;
        }
        return onExtraCallbackWithResult(obj, settransitionduration, requestListener, settranslationx, requestCoordinator, saversKtExternalSyntheticLambda12, saversKtExternalSyntheticLambda11, i2, i3, executor);
    }

    private Request onExtraCallbackWithResult(Object obj, setTransitionDuration<TranscodeType> settransitionduration, RequestListener<TranscodeType> requestListener, setTranslationX<?> settranslationx, RequestCoordinator requestCoordinator, SaversKtExternalSyntheticLambda12<?, ? super TranscodeType> saversKtExternalSyntheticLambda12, SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, int i2, int i3, Executor executor) {
        Context context = this.onNavigationEvent;
        SaversKtExternalSyntheticLambda10 saversKtExternalSyntheticLambda10 = this.onExtraCallbackWithResult;
        return setInteractionEnabled.onWarmupCompleted(context, saversKtExternalSyntheticLambda10, obj, this.asBinder, this.getInterfaceDescriptor, settranslationx, i2, i3, saversKtExternalSyntheticLambda11, settransitionduration, requestListener, this.IAuthTabCallbackDefault, requestCoordinator, saversKtExternalSyntheticLambda10.onExtraCallbackWithResult(), saversKtExternalSyntheticLambda12.onNavigationEvent(), executor);
    }
}
