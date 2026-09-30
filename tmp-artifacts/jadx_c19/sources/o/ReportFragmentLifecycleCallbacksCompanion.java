package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ReportFragmentLifecycleCallbacksCompanion<T> extends LifecycleEffectKtExternalSyntheticLambda1<T> implements assertMainThread {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    @Override // o.FragmentFactory
    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, T t) {
        return false;
    }

    public abstract ReportFragmentLifecycleCallbacksCompanion<T> onNavigationEvent(Boolean bool, DateFormat dateFormat);

    protected ReportFragmentLifecycleCallbacksCompanion(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    @Override // o.assertMainThread
    public FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        SimpleDateFormat simpleDateFormat;
        Locale interfaceDescriptor;
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, (Class<?>) onWarmupCompleted());
        if (registeronpreattachlistener_onextracallbackOnWarmupCompleted != null) {
            registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompletedOnExtraCallback = registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallback();
            if (registeronpreattachlistener_onwarmupcompletedOnExtraCallback.isNumeric()) {
                return onNavigationEvent(Boolean.TRUE, null);
            }
            if (registeronpreattachlistener_onextracallbackOnWarmupCompleted.onTransact()) {
                if (registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallbackDefault()) {
                    interfaceDescriptor = registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback();
                } else {
                    interfaceDescriptor = fragmentManagerExternalSyntheticLambda1.getInterfaceDescriptor();
                }
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallbackWithResult(), interfaceDescriptor);
                simpleDateFormat2.setTimeZone(registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback_Parcel() ? registeronpreattachlistener_onextracallbackOnWarmupCompleted.asBinder() : fragmentManagerExternalSyntheticLambda1.access000());
                return onNavigationEvent(Boolean.FALSE, simpleDateFormat2);
            }
            boolean zIAuthTabCallbackDefault = registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallbackDefault();
            boolean zIAuthTabCallback_Parcel = registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback_Parcel();
            boolean z = registeronpreattachlistener_onwarmupcompletedOnExtraCallback == registerOnPreAttachListener$onWarmupCompleted.STRING;
            if (zIAuthTabCallbackDefault || zIAuthTabCallback_Parcel || z) {
                DateFormat interfaceDescriptor2 = fragmentManagerExternalSyntheticLambda1.onNavigationEvent().getInterfaceDescriptor();
                if (interfaceDescriptor2 instanceof onCanceled) {
                    onCanceled oncanceledOnExtraCallbackWithResult = (onCanceled) interfaceDescriptor2;
                    if (registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallbackDefault()) {
                        oncanceledOnExtraCallbackWithResult = oncanceledOnExtraCallbackWithResult.onWarmupCompleted(registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback());
                    }
                    if (registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                        oncanceledOnExtraCallbackWithResult = oncanceledOnExtraCallbackWithResult.onExtraCallbackWithResult(registeronpreattachlistener_onextracallbackOnWarmupCompleted.asBinder());
                    }
                    return onNavigationEvent(Boolean.FALSE, oncanceledOnExtraCallbackWithResult);
                }
                if (!(interfaceDescriptor2 instanceof SimpleDateFormat)) {
                    fragmentManagerExternalSyntheticLambda1.onWarmupCompleted((Class<?>) onWarmupCompleted(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", interfaceDescriptor2.getClass().getName()));
                }
                SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) interfaceDescriptor2;
                if (zIAuthTabCallbackDefault) {
                    simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), registeronpreattachlistener_onextracallbackOnWarmupCompleted.IAuthTabCallback());
                } else {
                    simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
                }
                TimeZone timeZoneAsBinder = registeronpreattachlistener_onextracallbackOnWarmupCompleted.asBinder();
                if (timeZoneAsBinder != null && !timeZoneAsBinder.equals(simpleDateFormat.getTimeZone())) {
                    simpleDateFormat.setTimeZone(timeZoneAsBinder);
                }
                return onNavigationEvent(Boolean.FALSE, simpleDateFormat);
            }
        }
        return this;
    }

    protected boolean onExtraCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (fragmentManagerExternalSyntheticLambda1 != null) {
            return fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(FragmentManagerExternalSyntheticLambda2.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + onWarmupCompleted().getName());
    }

    protected void onNavigationEvent(Date date, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        if (this._customFormat == null) {
            fragmentManagerExternalSyntheticLambda1.onExtraCallback(date, getview);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        getview.asBinder(andSet.format(date));
        setSupportImageTintList.onNavigationEvent(this._reusedCustomFormat, (Object) null, andSet);
    }
}
