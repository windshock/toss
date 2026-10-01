package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.LayoutIntrinsics_androidKtExternalSyntheticLambda0;
import o.PlatformFontVariationSettings_androidKtExternalSyntheticLambda2;
import o.SaversKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MultiParagraphIntrinsicsExternalSyntheticLambda1 {
    private TypefaceRequestCacheExternalSyntheticLambda0 IAuthTabCallback;
    private SaversKtExternalSyntheticLambda57 IAuthTabCallbackDefault;
    private FontListFontFamilyTypefaceAdapterExternalSyntheticLambda0 IAuthTabCallback_Parcel;
    private boolean access000;
    private LayoutIntrinsics_androidKtExternalSyntheticLambda0.onNavigationEvent asInterface;
    private RequestManagerRetriever.RequestManagerFactory extraCallbackWithResult;
    private PlatformFontVariationSettings_androidKtExternalSyntheticLambda2 getInterfaceDescriptor;
    private List<RequestListener<Object>> onExtraCallback;
    private setMaxElementsWrap onExtraCallbackWithResult;
    private Savers_androidKtExternalSyntheticLambda5 onNavigationEvent;
    private TypefaceRequestCacheExternalSyntheticLambda0 onTransact;
    private Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted;
    private TypefaceRequestCacheExternalSyntheticLambda0 readTypedObject;
    private final Map<Class<?>, SaversKtExternalSyntheticLambda12<?, ?>> IAuthTabCallbackStub = new onMeasure();
    private final SaversKtExternalSyntheticLambda0.onExtraCallback IAuthTabCallbackStubProxy = new SaversKtExternalSyntheticLambda0.onExtraCallback();
    private int access100 = 4;
    private Glide.onWarmupCompleted asBinder = new Glide.onWarmupCompleted() { // from class: o.MultiParagraphIntrinsicsExternalSyntheticLambda1.3
        @Override // com.bumptech.glide.Glide.onWarmupCompleted
        public RequestOptions onExtraCallback() {
            return new RequestOptions();
        }
    };

    public static final class IAuthTabCallback {
    }

    public void onExtraCallbackWithResult(@Nullable RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.extraCallbackWithResult = requestManagerFactory;
    }

    public Glide onExtraCallback(@NonNull Context context) {
        if (this.readTypedObject == null) {
            this.readTypedObject = TypefaceRequestCacheExternalSyntheticLambda0.asInterface();
        }
        if (this.onTransact == null) {
            this.onTransact = TypefaceRequestCacheExternalSyntheticLambda0.onExtraCallback();
        }
        if (this.IAuthTabCallback == null) {
            this.IAuthTabCallback = TypefaceRequestCacheExternalSyntheticLambda0.onNavigationEvent();
        }
        if (this.getInterfaceDescriptor == null) {
            this.getInterfaceDescriptor = new PlatformFontVariationSettings_androidKtExternalSyntheticLambda2.IAuthTabCallback(context).onExtraCallback();
        }
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new setLastVerticalStyle();
        }
        if (this.onNavigationEvent == null) {
            int iOnNavigationEvent = this.getInterfaceDescriptor.onNavigationEvent();
            if (iOnNavigationEvent > 0) {
                this.onNavigationEvent = new isIncluded(iOnNavigationEvent);
            } else {
                this.onNavigationEvent = new Savers_androidKtExternalSyntheticLambda3();
            }
        }
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new TextInclusionStrategyCompanionExternalSyntheticLambda0(this.getInterfaceDescriptor.onWarmupCompleted());
        }
        if (this.IAuthTabCallback_Parcel == null) {
            this.IAuthTabCallback_Parcel = new FontFamilyResolverImplExternalSyntheticLambda0(this.getInterfaceDescriptor.IAuthTabCallback());
        }
        if (this.asInterface == null) {
            this.asInterface = new FontFamilyResolverImplExternalSyntheticLambda1(context);
        }
        if (this.IAuthTabCallbackDefault == null) {
            this.IAuthTabCallbackDefault = new SaversKtExternalSyntheticLambda57(this.IAuthTabCallback_Parcel, this.asInterface, this.onTransact, this.readTypedObject, TypefaceRequestCacheExternalSyntheticLambda0.onTransact(), this.IAuthTabCallback, this.access000);
        }
        List<RequestListener<Object>> list = this.onExtraCallback;
        if (list == null) {
            this.onExtraCallback = Collections.EMPTY_LIST;
        } else {
            this.onExtraCallback = Collections.unmodifiableList(list);
        }
        SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0OnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
        return new Glide(context, this.IAuthTabCallbackDefault, this.IAuthTabCallback_Parcel, this.onNavigationEvent, this.onWarmupCompleted, new RequestManagerRetriever(this.extraCallbackWithResult, saversKtExternalSyntheticLambda0OnExtraCallbackWithResult), this.onExtraCallbackWithResult, this.access100, this.asBinder, this.IAuthTabCallbackStub, this.onExtraCallback, saversKtExternalSyntheticLambda0OnExtraCallbackWithResult);
    }

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallback {
        onExtraCallback() {
        }
    }

    public static final class onNavigationEvent {
        onNavigationEvent() {
        }
    }
}
